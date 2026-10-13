package de.htwberlin.lobby;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LobbyController {

    @GetMapping("/users")
    public List<User> users() {
        return List.of(new User("exampleUser", "example@mail.com"), new User("exampleUser2", "example2@mail.com"), new User("exampleUser3", "example3@mail.com"));
    }
}
