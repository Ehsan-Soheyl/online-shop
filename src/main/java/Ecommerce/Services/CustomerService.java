package Ecommerce.Services;

import Ecommerce.Models.Entities.CustomerEntity;
import Ecommerce.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService
{
    @Autowired
    CustomerRepository customerRepository;
    public CustomerEntity save(CustomerEntity customerEntity){
        return customerRepository.save(customerEntity);
    }
    public void deleteById(Long id){
        customerRepository.deleteById(id);
    }
    public CustomerEntity getById(Long id){
        return customerRepository.findById(id).orElseThrow();
    }
    public List<CustomerEntity> getAll(){
        return customerRepository.findAll();
    }
    public CustomerEntity update(CustomerEntity customerUpdate){
        CustomerEntity customerExist = customerRepository.findById(customerUpdate.getId()).orElseThrow();
        customerExist.setFirstName(customerUpdate.getFirstName());
        customerExist.setLastName(customerUpdate.getLastName());
        customerExist.setPassword(customerUpdate.getPassword());
        customerExist.setPhoneNumber(customerUpdate.getPhoneNumber());
        customerExist.setUserName(customerExist.getUserName());
        customerExist.setShipmentEntities(customerUpdate.getShipmentEntities());
        return customerRepository.save(customerExist);
    }
}
