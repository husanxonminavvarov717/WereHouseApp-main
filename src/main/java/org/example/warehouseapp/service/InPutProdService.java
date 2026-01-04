package org.example.warehouseapp.service;


import org.example.warehouseapp.dto.InPutProductDto;
import org.example.warehouseapp.model.InPutProduct;
import org.example.warehouseapp.model.Product;
import org.example.warehouseapp.model.Result;
import org.example.warehouseapp.repository.InPutProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InPutProdService {
    @Autowired
    private InPutProductRepository productRepository;

    public InPutProductRepository getAllInPutproductRepository() {
        return productRepository;
    }

    public Result createInPutProduct(InPutProductDto inPutProdDto) {
        InPutProductDto inputProduct = new InPutProductDto();
        inputProduct.setProduct(inPutProdDto.getProduct());
        inputProduct.setPrice(inPutProdDto.getPrice());
        return new Result(true, "Product created");
    }
    public Result updateInPutProduct(Integer id, InPutProductDto inPutProdDto) {
        InPutProductDto inputProduct = new InPutProductDto();
        inputProduct.setProduct(inPutProdDto.getProduct());
        inputProduct.setPrice(inPutProdDto.getPrice());
        return new Result(true, "Product updated");

    }
    public Result deleteInPutProduct(Integer id) {
        productRepository.deleteById(id);
        return new Result(true, "Product deleted");
    }

}
