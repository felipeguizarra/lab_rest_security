package lab.explorer.lab.rest.security.Service;

import lab.explorer.lab.rest.security.model.User;

import java.util.List;

public interface UserService {
    public void createUser(User user);

    public List<User> listarUsuarios();
}
