package com.example.finalWork.controller;

import com.example.finalWork.entity.Country;
import com.example.finalWork.entity.User;
import com.example.finalWork.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user-api/v1")
@RequiredArgsConstructor
public class AppController {
    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<Map<String, Object>> getUsers() {
        List<User> users = userService.getAllUsers();

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("status", 200);
        body.put("message", "Users fetched successfully");
        body.put("data", users);

        return ResponseEntity.ok(body);
    }

    @PostMapping("/users")
    public ResponseEntity<Map<String, Object>> addUser(@RequestBody @Valid User user) {
        User savedUser = userService.addUser(user);

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("status", 200);
        body.put("message", "User created successfully");
        body.put("data", savedUser);

        return ResponseEntity.ok(body);
    }

//    @GetMapping("/additional-info")
//    public List<User> getUsersByCountry(@RequestParam(value="countries") List<String> countries) {
//        return userService.getUsersByCountries(countries);
//    }

    //чтобы работало через запятую как в примере в задании "user-api/v1/additional-info?countries=RUSSIA,ITALY,USA", нужно сделать так
    @GetMapping("/additional-info")
    public ResponseEntity<Map<String, Object>> getUsersByCountry(@RequestParam(value="countries") String countries) {

        List<User> users = userService.getUsersByCountries(countries);

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("status", 200);
        body.put("message", "Users fetched successfully");
        body.put("data", users);

        return ResponseEntity.ok(body);
    }

}
