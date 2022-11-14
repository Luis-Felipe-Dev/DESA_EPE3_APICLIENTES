package org.example.springdatajpacliente.repositoy;

import org.example.springdatajpacliente.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
