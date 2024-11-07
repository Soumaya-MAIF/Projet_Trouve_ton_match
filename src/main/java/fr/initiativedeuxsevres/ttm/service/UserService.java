package fr.initiativedeuxsevres.ttm.service;
import fr.initiativedeuxsevres.ttm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import fr.initiativedeuxsevres.ttm.model.User;

import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public User updateUserEmail(Long id, String newEmail) {
        Optional<User> user = userRepository.findById(id);
        User userUpdated = user.get();
        userUpdated.setEmail(newEmail);
      userRepository.save(userUpdated);
        return userUpdated;
    }
}