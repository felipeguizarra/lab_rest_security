package lab.explorer.lab.rest.security.Service.impl;

import lab.explorer.lab.rest.security.Service.ClientService;
import lab.explorer.lab.rest.security.Service.ViaCepService;
import lab.explorer.lab.rest.security.model.Address;
import lab.explorer.lab.rest.security.model.Client;
import lab.explorer.lab.rest.security.repository.AddressRepository;
import lab.explorer.lab.rest.security.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client;
    }

    @Override
    public void insert(Client client) {
        saveClientWithCEP(client);
    }

    @Override
    public void update(Long id, Client client) {
        Optional<Client> clientData = clientRepository.findById(id);
        if(clientData.isPresent()){
            saveClientWithCEP(client);
        }
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    private void saveClientWithCEP(Client client) {
        String cep = client.getAddress().getCep();
        Address address = addressRepository.findById(cep).orElseGet(() ->{
           Address newAddress = viaCepService.consultarCep(cep);
           addressRepository.save(newAddress);
           return newAddress;
        });
        client.setAddress(address);
        clientRepository.save(client);
    }
}
