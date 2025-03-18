package sng.com.product.service.entity;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;

import java.util.Date;

@Entity
@Component
public class Product {

    public int ProductId;
    public String ProductCode;
    public String ProductName;
    public String ProductDescription;
    public Date ProductDeliveryDate;
}
