package org.example.warehouseapp.controller;

import org.example.warehouseapp.model.Category;
import org.example.warehouseapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("{/categories}")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    public List<Category> getAllCategories() {
     return categoryService.categoriesAll();
    }
    public Category getCategoryById(Integer id) {
        return categoryService.categoryById(id);
    }


}
