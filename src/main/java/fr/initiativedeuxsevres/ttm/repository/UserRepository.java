package fr.initiativedeuxsevres.ttm.repository;

import fr.initiativedeuxsevres.ttm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
