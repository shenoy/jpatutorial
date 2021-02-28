package com.jpa.jpatutorial;
import com.jpa.jpatutorial.Entity.User;
import com.jpa.jpatutorial.Service.UserDAOService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
    private static final Logger log =
            LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
    @Autowired
    private UserDAOService userDAOService;
    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        long insert = userDAOService.insert(user);
        log.info("New user is created : "+ user);
    }
}
