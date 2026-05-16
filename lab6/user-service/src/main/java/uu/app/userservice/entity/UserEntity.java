package uu.app.userservice.entity;

import java.io.Serializable;
import jakarta.persistence.*;
// -- lombok.* - анотації Lombok для автоматичної генерації кодових
//    конструкцій, таких як гетери, сетери та конструктори.
import lombok.*;

@Entity

@Table(name = "users")

@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

public class UserEntity implements Serializable {
    // Опис первинного ключа:
    // -- вказує поле id як первинний ключ (Primary Key).
    @Id
    // -- визначає, що значення id буде автоматично зростати
    //    (автоінкремент у базі даних).
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Опис колонки name:
    // -- означає, що значення цього поля не може бути NULL.
    @Column(nullable = false)
    private String name;

    // Опис колонки email:
    // -- @Column(nullable = false) - значення email обов'язкове.
    // -- @Column(unique = true) - значення email має бути унікальним
    //    (не може бути двох користувачів з однаковою поштою).
    @Column(nullable = false, unique = true)
    private String email;
}