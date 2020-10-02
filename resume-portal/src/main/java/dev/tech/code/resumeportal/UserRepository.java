package dev.tech.code.resumeportal;

import dev.tech.code.resumeportal.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer>
{
        Optional<User> findUserByUserName(String userName);
}

