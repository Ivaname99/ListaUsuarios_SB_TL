package com.ivan.usuarios.service;

import com.ivan.usuarios.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<User> getUsuarios() {
        return Arrays.asList(
                new User("Geime", "Lopez", "Luis16@gmail.com"),
                new User("Sonia", "Ábrego", "Luis16@gmail.com"),
                new User("Luis", "Ábrego", "Luis16@gmail.com"),
                new User("Bryan", "Pineda", "Luis16@gmail.com"),
                new User("Wendy", "Ayala", "Luis16@gmail.com"),
                new User("Ivan", "Membreño", "Luis16@gmail.com")
        );
    }
}
