package org.example.warehouseapp.service;

import org.example.warehouseapp.dto.ProductDto;
import org.example.warehouseapp.model.*;
import org.example.warehouseapp.repository.AttachmentRepository;
import org.example.warehouseapp.repository.CategoryRepository;
import org.example.warehouseapp.repository.MeasurmentRepository;
import org.example.warehouseapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    MeasurmentRepository measurmentRepository;

    @Autowired
    AttachmentRepository attachmentRepository;

    public List<Product> getAllProducts() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }
    public Product getProductById(Integer id) {
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.get();
    }

    //create
    public Result createProduct(ProductDto productDto) {
//        boolean existByName = productRepository.existByName(productDto.getName());
//        if (existByName) {
//            return new Result(false,"Already exists");
//
//        }
//        Product product = new Product();
//        product.setName(productDto.getName());
//        product.setCode(productDto.getCode());
//        Optional<Category> categoryOptional = categoryRepository.findById(productDto.getCategoryId());
//        Category category = categoryOptional.get();
//        product.setCategory((List<Category>) category);
//        Optional<Measurment> byId = measurmentRepository.findById(productDto.getMeasurement());
//        Measurment measurment = byId.get();
//        product.setMeasurement(measurment);
//
//
//        Optional<Attachment> attachmentOptional = attachmentRepository.findById(productDto.getAttachment());
//        Attachment attachment = attachmentOptional.get();
//        product.setAttachment(attachment);
//        productRepository.save(product);
//        return new Result(true,"Product created");
        Product product = new Product();
        product.setName(productDto.getName());
return new Result(true,"succes");
    }

    public Result updateProduct(Integer id, ProductDto productDto) {
        if (!productRepository.existsById(id)) {
            return new Result(false,"Product not found");
        }
        return new Result(false,"not found");
    }

    public Result deleteProduct(Integer id) {
        if (!productRepository.existsById(id)) return new Result(false, "Product not found");
        productRepository.deleteById(id);
        return new Result(true,"Deleted");
    }
}
