package fr.initiativedeuxsevres.ttm.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String companyName;
    private String initiativePlatform;
    private LocalDate activityStartDate;
    private String activityDomain;
    private String activityDescription;
    private String potentialNeeds;
    private String activityLocation;
    private String availability;

    public User() {
    }
}
