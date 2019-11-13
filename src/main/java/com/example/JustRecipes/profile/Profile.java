package com.example.JustRecipes.profile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Profile {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;

    public Profile(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
