package lab.explorer.lab.rest.security.repository;

import lab.explorer.lab.rest.security.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
