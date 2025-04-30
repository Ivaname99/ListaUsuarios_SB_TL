package com.ivan.usuarios.controller;

import com.ivan.usuarios.model.User;
import com.ivan.usuarios.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/usuarios")
    public String mostrarUsuarios(Model model) {
        List<User> listaUsuarios = userService.getUsuarios();
        model.addAttribute("usuarios", listaUsuarios);
        return "usuarios";
    }
}
