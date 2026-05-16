package uu.app.userservice.service;

// Імпортування необхідних класів:
// -- сутність користувача, що відображає запис у базі даних
import uu.app.userservice.entity.UserEntity;
// -- репозиторій для роботи з базою даних.
import uu.app.userservice.repository.UserRepository;
// -- анотація Spring, яка позначає цей клас як сервісний компонент
import org.springframework.stereotype.Service;
// -- використовується для повернення списку користувачів
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    // Метод для створення нового користувача:
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }
    // Метод для отримання всіх користувачів:
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
    // Метод для отримання користувача за ID:
    public Optional<UserEntity> getUserById(Long id) {

        return userRepository.findById(id);
    }
    public UserEntity updateUser(Long id, UserEntity updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            return userRepository.save(user);
        }).orElse(null);
    }
    // Метод для видалення користувача за ID:
    public void deleteUser(Long id) {
        // userRepository.deleteById(id) видаляє запис із бази за його id.
        userRepository.deleteById(id);
    }
}