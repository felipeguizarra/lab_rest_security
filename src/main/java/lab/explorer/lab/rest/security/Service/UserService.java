package lab.explorer.lab.rest.security.Service;

import lab.explorer.lab.rest.security.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);

    List<User> listarUsuarios();

    User updateUser(User user);

}
