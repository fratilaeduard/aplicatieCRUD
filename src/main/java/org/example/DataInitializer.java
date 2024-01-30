package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception{
        if (userRepository.count() == 0) {
            User user = new User();
            user.setUsername("Edi");
            user.setPassword("eduard");
            user.setEmail("edifratila@yahoo.com");
            user.setFirstName("Eduard");
            user.setLastName("Fratila");
            userRepository.save(user);
        }
    }
}
