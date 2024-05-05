package com.learning.expensetracker.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtService {

    private static final String SECRET_KEY="ccddb46264df1de68e69c224d4abfb387472b211a24552087c3b0b2656d6df52";
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    //to generate Token and Adding all the components of the token

    public String createToken(Map<String,Object> extraClaims, UserDetails userDetails){
        return Jwts
                .builder()
                .setClaims(extraClaims)  //adding extra claims we want to add
                .setSubject(userDetails.getUsername())  // getting user's Name
                .setIssuedAt(new Date(System.currentTimeMillis())) // Setting issued time of the Token
                .setExpiration(new Date(System.currentTimeMillis()+1000*60*24))  // setting Expiry time for the Token which is 24 hrs
                .signWith(getSignInKey(), SignatureAlgorithm.HS256) //Setting SignInKey with Algo
                .compact();

    }

    public Boolean vaidateToken(String token,UserDetails userDetails){
        final String username=extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    private boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    private Date extractExpiration(String token) {
        return extractClaim(token,Claims::getExpiration);
    }

    public <T> T extractClaim(String token, Function<Claims,T> claimsResolver){
        final Claims claims=extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    //Extract All the claims
    private Claims extractAllClaims(String token){
        return Jwts.parser()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSignInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);  //decode the key
        return Keys.hmacShaKeyFor(keyBytes); //decode using algo
    }
}
