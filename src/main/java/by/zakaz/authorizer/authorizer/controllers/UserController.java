package by.zakaz.authorizer.authorizer.controllers;

import by.zakaz.authorizer.authorizer.users.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // Метод для обработки GET-запроса на /api/users/{username}
    @GetMapping("/{username}")
    public User getUser(@PathVariable String username) {
        // Здесь вы можете получить пользователя из базы данных или другого источника данных
        // В этом примере создадим фиктивного пользователя
        User user = new User();
        user.setUsername(username);
        user.setEmail(username + "@example.com");
        return user;
    }

    // Метод для обработки POST-запроса на /api/users
    @PostMapping
    public String createUser(@RequestBody User user) {
        // Здесь вы можете сохранить пользователя в базу данных или другое хранилище данных
        // В этом примере просто вернем сообщение об успешном создании пользователя
        return "User " + user.getUsername() + " created successfully!";
    }
}