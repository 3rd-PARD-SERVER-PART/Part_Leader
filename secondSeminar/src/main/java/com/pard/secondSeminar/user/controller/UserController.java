package com.pard.secondSeminar.user.controller;

import com.pard.secondSeminar.user.dto.UserDTO;
import com.pard.secondSeminar.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("")
    public void saveUser(@RequestBody UserDTO userDTO) {
        userService.saveUser(userDTO);
    }

    @GetMapping("/{studentId}")
    public UserDTO findById(@PathVariable Integer studentId) {
        return userService.findById(studentId);
    }

    @GetMapping("")
    public List<UserDTO> findAll() {
        return userService.findAll();
    }

    @PatchMapping("/{studentId}")
    public void update(@PathVariable Integer studentId, @RequestBody UserDTO userDto){
        userService.update(studentId, userDto);
    }
    @DeleteMapping("/{studentId}")
    public void delete(@PathVariable Integer studentId){
        userService.delete(studentId);
    }
}
