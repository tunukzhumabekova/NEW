package peaksoft.service;

import peaksoft.model.User;

import java.util.List;

public interface UserService {

    String generateUsername(String first_name, String last_name);
    String generatePassword();

    boolean usernameExists(String username);

    List<User> getAll();

    void save(User user);
}
