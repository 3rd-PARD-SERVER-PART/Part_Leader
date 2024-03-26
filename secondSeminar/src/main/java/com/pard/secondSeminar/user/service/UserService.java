package com.pard.secondSeminar.user.service;

import com.pard.secondSeminar.user.dto.UserDTO;
import com.pard.secondSeminar.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void saveUser(UserDTO userDTO) {
        userRepository.save(userDTO);
    }

    public UserDTO findById(Integer studentId) {
        return userRepository.findById(studentId);
    }

    public List<UserDTO> findAll() {
        return userRepository.findAll();
    }
    public void update(Integer studentId, UserDTO userDto){
        userRepository.update(studentId,userDto);
    }
    public void delete(Integer studentId){
        userRepository.delete(studentId);
    }
}
