package com.mwaisaka.SpringDTOTutorial.config;

import com.mwaisaka.SpringDTOTutorial.model.Location;
import com.mwaisaka.SpringDTOTutorial.model.User;
import com.mwaisaka.SpringDTOTutorial.repository.LocationRepository;
import com.mwaisaka.SpringDTOTutorial.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final LocationRepository locationRepository;


    public DataSeeder(UserRepository userRepository, LocationRepository locationRepository) {
        this.userRepository = userRepository;
        this.locationRepository = locationRepository;
    }

    @Override
    public void run(String... args){
        if (locationRepository.count() == 0){
            //Seeding locations
            Location loc1 = new Location(0, "Nairobi", "Capital of Kenya", 36.8219, -1.2921);
            Location loc2 = new Location(0, "Mombasa", "Coastal city in Kenya", 39.6682, -4.0435);
            Location loc3 = new Location(0, "New York", "City in USA", -74.0060, 40.7128);

            locationRepository.saveAll(Arrays.asList(loc1, loc2, loc3));

            //Seeding users
            User user1 = new User(0, "john@example.com", "John", "Doe", "password123");
            user1.setLocation(loc1);

            User user2 = new User(0, "jane@example.com", "Jane", "Doe", "securepass");
            user2.setLocation(loc2);

            User user3 = new User(0, "alex@example.com", "Alex", "Smith", "mypassword");
            user3.setLocation(loc3);

            userRepository.saveAll(Arrays.asList(user1, user2, user3));

            System.out.println("✅ Sample data inserted into H2 database.");
        } else {
            System.out.println("ℹ️ Database already contains data. No new data inserted.");
        }

    }
}
