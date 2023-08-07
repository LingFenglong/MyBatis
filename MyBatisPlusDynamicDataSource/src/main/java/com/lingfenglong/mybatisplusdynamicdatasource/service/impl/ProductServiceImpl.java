package com.lingfenglong.mybatisplusdynamicdatasource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingfenglong.mybatisplusdynamicdatasource.mapper.ProductMapper;
import com.lingfenglong.mybatisplusdynamicdatasource.pojo.Product;
import com.lingfenglong.mybatisplusdynamicdatasource.service.ProductService;
import org.springframework.stereotype.Service;

@Service
@DS("slave")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
