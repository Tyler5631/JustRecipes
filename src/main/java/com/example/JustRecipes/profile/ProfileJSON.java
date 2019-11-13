package com.example.JustRecipes.profile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProfileJSON {
    private static final String emptyFieldMessage = "This is required";

    private Long id;

    @NotNull(message = emptyFieldMessage)
    private String username;

    @NotNull(message = emptyFieldMessage)
    private String password;

    public ProfileJSON(
            String username,
            String password
    ) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
