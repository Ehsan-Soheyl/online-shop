package Ecommerce.Controllers;

import Ecommerce.Models.Entities.CustomerEntity;
import Ecommerce.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerController
{
    @Autowired
    CustomerService customerService;
    @PostMapping("/New")
    public CustomerEntity create(@RequestBody CustomerEntity customerEntity){
        return customerService.save(customerEntity);
    }
    @DeleteMapping("/DeleteById/{id}")
    public void deleteById(@PathVariable Long id){
        customerService.deleteById(id);
    }
    @GetMapping("/GetById/{id}")
    public CustomerEntity getById(@PathVariable Long id){
        return customerService.getById(id);
    }
    @GetMapping("/GetAll")
    public List<CustomerEntity> getAll(){
        return customerService.getAll();
    }
    @PutMapping("/Update")
    public CustomerEntity update(@RequestBody CustomerEntity customerEntity){
        return customerService.update(customerEntity);
    }
}
