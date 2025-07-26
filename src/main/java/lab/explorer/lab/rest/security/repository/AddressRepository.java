package lab.explorer.lab.rest.security.repository;

import lab.explorer.lab.rest.security.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, String> {
}
