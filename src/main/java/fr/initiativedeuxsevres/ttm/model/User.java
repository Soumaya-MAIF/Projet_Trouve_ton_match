package fr.initiativedeuxsevres.ttm.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-incrémentation
    private Long id;

    @Column(name = "username", nullable = false, unique = true)  // Le nom d'utilisateur est unique
    private String username;

    @Column(name = "password", nullable = false)  // Le mot de passe est obligatoire
    private String password;

    // Constructeur par défaut
    public User() {
    }

    // Constructeur avec paramètres
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}