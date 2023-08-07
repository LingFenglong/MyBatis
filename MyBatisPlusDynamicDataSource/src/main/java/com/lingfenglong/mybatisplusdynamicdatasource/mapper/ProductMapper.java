package com.lingfenglong.mybatisplusdynamicdatasource.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lingfenglong.mybatisplusdynamicdatasource.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@DS("slave")
public interface ProductMapper extends BaseMapper<Product> {
}
