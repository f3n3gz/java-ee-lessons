package ru.geekbrains.entities;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> res;

    public ProductRepository() {
        res = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            res.add(new Product("Product" + i, (i + 1) * 0.75));
        }
    }

    public List<Product> findAll() throws SQLException {
        return this.res;
    }

    public List<Product> getRes() {
        return res;
    }

    public void setRes(List<Product> res) {
        this.res = res;
    }
}
