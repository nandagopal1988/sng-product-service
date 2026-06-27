package sng.com.product.service.services.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sng.com.product.service.entity.Product;
import sng.com.product.service.services.IProductService;

import java.util.Date;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    List<Product> objProductlst;
    @Override
    public List<Product> getAllProduct()
    {
        Product objProduct = new Product();
        objProduct.ProductId =1;
        objProduct.ProductCode="124567890";
        objProduct.ProductName="Product-Name";
        objProduct.ProductDescription="Product Description";
        objProduct.ProductDeliveryDate= null;
        objProductlst.add(objProduct);
       return objProductlst;
    }
}
