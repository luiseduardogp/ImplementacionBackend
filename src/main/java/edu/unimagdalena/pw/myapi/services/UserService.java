package edu.unimagdalena.pw.myapi.services;

import java.util.List;
import java.util.Optional;

import edu.unimagdalena.pw.myapi.entidades.User;

public interface UserService {
    User create(User user);
    Optional<User> update(Long id, User newUser);
    List<User> findAll();
    Optional<User> find(Long id);
    void delete(Long id);
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
