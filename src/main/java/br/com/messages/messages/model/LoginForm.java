package br.com.messages.messages.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LoginForm {
    @NotEmpty(message = "{email.notempty}")
    @Email(message = "{email.invalid}")
    private String email;

    @NotNull(message = "{password.notnull}")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "email='" + email;
    }
}
