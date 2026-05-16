// Оголошення пакету. Цей клас належить до пакету uu.app.userservice.model.
package uu.app.userservice.model;
// Імпорт анотацій з бібліотеки Lombok:
// -- створює конструктор, що приймає всі поля класу.
import lombok.AllArgsConstructor;
// -- автоматично генерує гетери, сетери, методи toString(),
// equals(), hashCode().
import lombok.Data;
// -- створює конструктор без аргументів.
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
// Оголошення класу User
public class User {
    // Оголошення приватних змінних.
    // -- ідентифікатор користувача
    private Long id;
    // -- ім'я користувача
    private String name;
    // -- електронна пошта користувача
    private String email;
}