package com.lingfenglong.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingfenglong.mybatisplus.mapper.ProductMapper;
import com.lingfenglong.mybatisplus.pojo.Product;
import com.lingfenglong.mybatisplus.service.ProductService;
import org.springframework.stereotype.Service;

@DS("slave_1")
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
