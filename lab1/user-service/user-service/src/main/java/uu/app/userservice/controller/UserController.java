// Оголошення пакету. Цей клас належить до пакету
// uu.app.userservice.controller
package uu.app.userservice.controller;
// Імпортування необхідних класів:
// -- модель користувача.
import uu.app.userservice.model.User;
// -- Spring Boot анотації
import org.springframework.web.bind.annotation.*;
// -- стандартні Java-класи для роботи зі списками
import java.util.List;
import java.util.ArrayList;
// @RestController позначає цей клас як контролер, що обробляє
// HTTP-запити та повертає JSON-відповіді
@RestController
// @RequestMapping("/users") визначає базовий шлях для всіх запитів
// цього контролера (наприклад, http://localhost:8080/users)
@RequestMapping("/users")
// Оголошення класу UserController, який буде керувати списком користувачів
public class UserController {
    // Оголошення списку користувачів. Використовується ArrayList
    // для зберігання об'єктів User у пам'яті.
    // final означає, що змінна users не може бути переназначена
    // (але список можна змінювати, додаючи або видаляючи елементи)
    private final List<User> users = new ArrayList<>();
    // Метод для створення нового користувача:
    // -- @PostMapping обробляє HTTP-запити POST (наприклад, POST /users)
    @PostMapping
    // -- @RequestBody User user отримує JSON-об'єкт користувача
    // з тіла запиту і автоматично перетворює його на Java-об'єкт User
    public User createUser(@RequestBody User user) {
        // -- додає користувача до списку.
        users.add(user);
        // -- повертає створеного користувача як відповідь.
        return user;
    }
    // Метод для отримання всіх користувачів:
    // @GetMapping обробляє HTTP-запити GET (наприклад, GET /users)
    @GetMapping
    public List<User> getAllUsers() {
        // -- повертає список усіх користувачів у форматі JSON
        return users;
    }
}
