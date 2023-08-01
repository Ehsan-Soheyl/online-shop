package Ecommerce.Models.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Customer_Entity")
public class CustomerEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_Id")
    private Long id;
    @Column(name = "First_Name")
    private String firstName;
    @Column(name = "Last_Name")
    private String lastName;
    @Column(name = "Phone_Number")
    private String phoneNumber;
    @Column(name = "User_Name")
    private String userName;
    private String test;
    @Column(name = "Password")
    private String password;
    @OneToMany(mappedBy = "customerEntity" ,cascade = CascadeType.ALL)
    private Set<ShipmentEntity> shipmentEntities;

    public CustomerEntity(String firstName, String lastName, String phoneNumber, String userName, String password)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
    }
}
