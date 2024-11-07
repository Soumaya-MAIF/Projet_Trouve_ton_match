package fr.initiativedeuxsevres.ttm.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Builder
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
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


    public User(String email) {
        this.email = email;
    }
}
