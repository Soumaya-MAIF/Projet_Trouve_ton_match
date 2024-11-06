package fr.initiativedeuxsevres.ttm.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @Nullable
    private Long id;
    @Getter
    private String firstName;
    @Getter
    private String lastName;
    @Getter
    private String email;
    @Getter
    private String password;
    @Getter
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

    public User(Long id, String firstName, String lastName, String email, String password, String companyName) {
    }


}
