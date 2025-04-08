package com.techboot.learnKafka.user_service.repository;

import com.techboot.learnKafka.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
