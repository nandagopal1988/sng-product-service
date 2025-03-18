package sng.com.product.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sng.com.product.service.entity.Product;
import sng.com.product.service.services.implement.ProductService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/products")
public class ProductController {

    @Autowired
    ProductService objProductService;
    @GetMapping(value = "/listAllProducts")
    public List<Product> geCustomerProduct()
    {
        return objProductService.getAllProduct();
    }
}
