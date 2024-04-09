package com.daw.atm.service;

import org.springframework.stereotype.Service;
import com.daw.atm.model.User;
import com.daw.atm.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long userId) {
        // Implementa la lógica para obtener un usuario por su ID desde el repositorio
        return userRepository.findById(userId).orElse(null);
    }
}
