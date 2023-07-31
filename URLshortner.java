import java.util.*;
class URLsort {
    HashMap<String, Long> ltos;
    HashMap<Long, String> stol;
    long COUNTER=1000000000;
    String elements;
    URLsort() {
        ltos = new HashMap<String, Long>();
        stol = new HashMap<Long, String>();
        COUNTER = 1000000000;
        elements = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";    }
        
    public String longToShort(String url) {
        String shorturl = base10ToBase62(COUNTER);
        ltos.put(url, COUNTER);
        stol.put(COUNTER, url);
        COUNTER++;
        return shorturl;
    }
    
    public String base10ToBase62(long n) {
        
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.insert(0, elements.charAt((int)(n % 62)));
            n /= 62;
        }
        while (sb.length() != 9) {
            sb.insert(0, '0');
        }
        //COUNTER=COUNTER++;
        
        return sb.toString();
    }


    public class URLshortner
{
	public static void main(String[] args) {
	    URLsort url=new URLsort();
	    String str=url.longToShort("https://medium.com/@sandeep4.verma/system-design-scalable-url-shortener-service-like-tinyurl-106f30f23a82");
	    System.out.println(str);
	    String str1=url.longToShort("https://medium.com/@sandeep4.verma/system-design-scalable-url-shortener-service-like-tinyurl-106f30f23a82");
	    System.out.println(str1);
	}
}
}