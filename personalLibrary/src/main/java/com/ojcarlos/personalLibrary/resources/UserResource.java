package com.ojcarlos.personalLibrary.resources;

import com.ojcarlos.personalLibrary.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "maria", "123", "maria@maria");
        return ResponseEntity.ok().body(u);

    }
}
