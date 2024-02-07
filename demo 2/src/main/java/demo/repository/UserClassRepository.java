package demo.repository;


import demo.entity.UserClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserClassRepository extends JpaRepository<UserClass, Long> {

    Optional<UserClass> findUserClassByClassName(String className);
}