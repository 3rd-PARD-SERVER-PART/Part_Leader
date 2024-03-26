package com.pard.secondSeminar.user.repository;

import com.pard.secondSeminar.user.User;
import com.pard.secondSeminar.user.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    private static final Map<Integer, User> handong = new HashMap<>();

    public void save(UserDTO userDTO) {
        User user = User.builder()
                .studentName(userDTO.getStudentName())
                .studentId(userDTO.getStudentId())
                .build();
        handong.put(userDTO.getStudentId(), user);
    }

    public UserDTO findById(Integer studentId) {
        User user = handong.get(studentId);
        return UserDTO.builder()
                .studentId(user.getStudentId())
                .studentName(user.getStudentName())
                .build();
    }

    public List<UserDTO> findAll() {
        List<UserDTO> userDtos = new ArrayList<>();
        for (User user : handong.values()) {
            UserDTO userDto = UserDTO.builder()
                    .studentId(user.getStudentId())
                    .studentName(user.getStudentName())
                    .build();
            userDtos.add(userDto);
        }
        return userDtos;
    }
    public void update(Integer studentId,UserDTO userDto){
        User user = handong.get(studentId);
        user.setStudentId(userDto.getStudentId());
        user.setStudentName(userDto.getStudentName());
        handong.put(userDto.getStudentId(), user);
    }
    public void delete(Integer studentId){
        handong.remove(studentId);
    }
}

