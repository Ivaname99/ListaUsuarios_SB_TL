package com.ivan.usuarios.service;

import com.ivan.usuarios.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<User> getUsuarios() {
        return Arrays.asList(
                new User("Geime", "Lopez", "geime69@hotmail.com"),
                new User("Sonia", "Ábrego", "sonia1@gmail.com"),
                new User("Luis", "Ábrego", null),
                new User("Bryan", "Pineda", null),
                new User("Wendy", "Ayala", "bryan5@gmail.com"),
                new User("Ivan", "Membreño", null)
        );
    }
}
