package lv.lu.gatis.kretulnieks.finalwork.service;

import lv.lu.gatis.kretulnieks.finalwork.model.Product;
import lv.lu.gatis.kretulnieks.finalwork.model.ProductCategory;
import lv.lu.gatis.kretulnieks.finalwork.model.ProductData;
import lv.lu.gatis.kretulnieks.finalwork.model.ProductInputData;
import lv.lu.gatis.kretulnieks.finalwork.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final Repository<Product> repository;

    @Autowired
    public ProductService( Repository<Product> repository) {
        this.repository = repository;
    }



    public void save(ProductInputData productInputData) {
        Product product = convertFrom(productInputData);
        repository.save(product);
    }

    private Product convertFrom(ProductInputData productInputData) {
        Product product = new Product();
        product.setName(productInputData.getName());
        product.setPrice(BigDecimal.valueOf(productInputData.getPrice()));
        product.setCategory(ProductCategory.valueOf(ProductInputData.getCategory()));
        if (ProductInputData.getDiscount() != null) {
            product.setDiscount(BigDecimal.valueOf(ProductInputData.getDiscount()));
        }
        if (productInputData.getDescription() != null) {
            product.setDescription(productInputData.getDescription());
        }
        return product;
    }

    public List<ProductData> findAll() {
        List<ProductData> result = new ArrayList<>();
        for (Product product : repository.findAll()) {
            result.add(convertFrom(product));
        }
        return result;
    }

    private ProductData convertFrom(Product product) {
        return new ProductData(
                product.getId().toString(),
                product.getName(),
                product.getPrice().toPlainString());
    }
}
