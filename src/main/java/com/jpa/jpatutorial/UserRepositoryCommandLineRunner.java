package com.jpa.jpatutorial;
import com.jpa.jpatutorial.Entity.User;
import com.jpa.jpatutorial.Service.UserDAOService;
import com.jpa.jpatutorial.Service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
    private static final Logger log =
            LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        User user2 = new User("Hill", "User");
        userRepository.save(user2);
        userRepository.save(user);
        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("user is retrieved : "+ userWithIdOne);

        List<User> users = userRepository.findAll();
        log.info("All Users : " + users);

        Optional<User> userWithIdTwo = userRepository.findById(2L);
        log.info("user is retrieved : "+ userWithIdTwo);



    }
}
