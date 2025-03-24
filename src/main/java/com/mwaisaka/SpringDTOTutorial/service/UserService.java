package com.mwaisaka.SpringDTOTutorial.service;

import com.mwaisaka.SpringDTOTutorial.dto.UserLocationDTO;
import com.mwaisaka.SpringDTOTutorial.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUsersLocation(){
        return userRepository
    }

    private UserLocationDTO convertEntitytoDTO(User user){

        UserLocationDTO userLocationDTO = new UserLocationDTO();

        userLocationDTO.setUserId.user.getId()
                .setEmail.user.getEmail()
                .setPlace.user.getLocation().getPlace()
                .setLongitude.getLocation().getLongitude()
                .setLatitude.getLocation().getLatitude();

        return userLocationDTO;
    }
}
