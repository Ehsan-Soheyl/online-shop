package Ecommerce.Models.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Shipment")
public class ShipmentEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Shipment_Id")
    private Long shipmentId;
    @Column(name = "Address")
    private String address;
    @ManyToOne
    @JoinColumn(name = "Customer_Id")
    private CustomerEntity customerEntity;
}
