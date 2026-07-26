package com.atguigu.gulimall.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.product.entity.Category;
import com.atguigu.gulimall.product.service.CategoryService;
import com.atguigu.gulimall.product.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author xxw
* @description 针对表【pms_category(商品三级分类)】的数据库操作Service实现
* @createDate 2026-07-25 22:20:00
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




