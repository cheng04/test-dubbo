package com.tongwei.test.service.impl;

import com.deepexi.util.extension.ApplicationException;
import com.deepexi.util.pageHelper.PageBean;
import com.tongwei.test.domain.eo.Product;
import com.tongwei.test.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public PageBean getProductList(Integer page, Integer size, Integer price) {
        return null;
    }

    @Override
    public Product getProductById(String id) {
        return null;
    }

    @Override
    public Integer createProduct(Product product) {
        return null;
    }

    @Override
    public Boolean deleteProductById(String id) {
        return null;
    }

    @Override
    public void testError() {

    }

    @Override
    public void testRpcError() throws ApplicationException {

    }
}
