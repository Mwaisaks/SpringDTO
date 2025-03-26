package com.mwaisaka.SpringDTOTutorial.service;

import com.mwaisaka.SpringDTOTutorial.dto.UserLocationDTO;
import com.mwaisaka.SpringDTOTutorial.model.User;
import com.mwaisaka.SpringDTOTutorial.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUsersLocation(){
        return userRepository.findAll()
                .stream()
                .map(this::convertEntitytoDTO)
                .collect(Collectors.toList());
    }

    private UserLocationDTO convertEntitytoDTO(User user){

        UserLocationDTO userLocationDTO = new UserLocationDTO();

        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        if (user.getLocation() != null) {
            userLocationDTO.setPlace(user.getLocation().getPlace());
            userLocationDTO.setLongitude(user.getLocation().getLongitude());
            userLocationDTO.setLatitude(user.getLocation().getLatitude());
        }

        return userLocationDTO;
    }
}
