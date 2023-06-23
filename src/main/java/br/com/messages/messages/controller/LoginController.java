package br.com.messages.messages.controller;

import br.com.messages.messages.model.LoginForm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "login")
public class LoginController {

    @PostMapping(value = "validar")
    public String validarLogin(@Valid @RequestBody LoginForm loginForm) {
        return loginForm.toString();
    }
}
