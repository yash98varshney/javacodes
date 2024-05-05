package com.learning.expensetracker.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "users")
public class UserInfo {

    @Id
    @Column(name = "user_id")
    private String userId;
    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",  //table name
            joinColumns = @JoinColumn(name = "user_id"), //column name in db
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<UserRole> roles=new HashSet<>();

}
