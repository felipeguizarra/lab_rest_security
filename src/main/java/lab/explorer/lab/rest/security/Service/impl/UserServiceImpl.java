package lab.explorer.lab.rest.security.Service.impl;

import lab.explorer.lab.rest.security.repository.UserRepository;

import lab.explorer.lab.rest.security.Service.UserService;
import lab.explorer.lab.rest.security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder encoder;
    @Override
    public void createUser(User user) {
        String pass = user.getPassword();
        //criptografando antes de salvar no banco
        user.setPassword(encoder.encode(pass));
        repository.save(user);
    }

    @Override
    public List<User> listarUsuarios() {
        return repository.findAll();
    }
}
