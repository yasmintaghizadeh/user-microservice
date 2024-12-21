package org.example.user.service;

import lombok.RequiredArgsConstructor;
import org.example.user.model.User;
import org.example.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }
}
