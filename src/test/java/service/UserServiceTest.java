package service;

import fr.initiativedeuxsevres.ttm.model.User;
import fr.initiativedeuxsevres.ttm.repository.UserRepository;
import fr.initiativedeuxsevres.ttm.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration
@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    // Déclaration des variables comme attributs de classe
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String companyName;

    @BeforeEach
    public void data() {
        // Initialisation des données communes aux tests
        id= 2L;
        firstName = "Alice";
        lastName = "Johnson";
        email = "alice.johnson@example.com";
        password = "securePass456";
        companyName = "Green Solutions Ltd";
    }

    @Test
    public void userSave() {
        // Given: préparation de l'utilisateur
        User user = User.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .companyName(companyName)
                .build();
//                new User(;
//                id,
//                firstName,
//                lastName,
//                email,
//                password,
//                companyName
//        );

        when(userRepository.save(any(User.class))).thenReturn(user);

        // When: appel de la méthode à tester
        User savedUser = userService.saveUser(user);

        // Then: vérifications

        assertEquals(id, savedUser.getId());
        assertEquals(firstName, savedUser.getFirstName());
        assertEquals(lastName, savedUser.getLastName());
        assertEquals(email, savedUser.getEmail());
        assertEquals(password, savedUser.getPassword());
        assertEquals(companyName, savedUser.getCompanyName());

        // Vérifie que la méthode save() a bien été appelée avec l'objet utilisateur
        verify(userRepository).save(user);
    }
}
