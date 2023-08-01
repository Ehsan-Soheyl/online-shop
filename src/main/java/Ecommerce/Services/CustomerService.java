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
    public CustomerEntity update(CustomerEntity customerEntity){
        CustomerEntity customer = customerRepository.findById(customerEntity.getId()).orElseThrow();
        customer.setFirstName(customerEntity.getFirstName());
        customer.setLastName(customerEntity.getLastName());
        customer.setPassword(customerEntity.getPassword());
        customer.setPhoneNumber(customerEntity.getPhoneNumber());
        customer.setUserName(customer.getUserName());
        customer.setShipmentEntities(customerEntity.getShipmentEntities());
        return customerRepository.save(customer);
    }
}
