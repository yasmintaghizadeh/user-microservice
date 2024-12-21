package org.example.user.controller;

import lombok.RequiredArgsConstructor;
import org.example.user.adaptor.UserAdaptor;
import org.example.user.dto.UserDTO;
import org.example.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserAdaptor userAdaptor;
    @PostMapping("/createUser")
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
      return userAdaptor.convertEntity(userService.createUser(userAdaptor.convertDto(userDTO)));
    }
}
