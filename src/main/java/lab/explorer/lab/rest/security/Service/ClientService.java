package lab.explorer.lab.rest.security.Service;

import lab.explorer.lab.rest.security.model.Client;

import java.util.Optional;

public interface ClientService {
    Iterable<Client> findAll();
    Optional<Client> findById(Long id);
    void insert(Client client);
    void update(Long id, Client client);
    void delete(Long id);
}
