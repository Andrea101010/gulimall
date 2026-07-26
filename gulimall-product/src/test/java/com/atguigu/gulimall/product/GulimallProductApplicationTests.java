package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.Brand;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Resource
    BrandService brandService;

    @Test
    public void contextLoads() {

//        Brand brandEntity = new Brand();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");
//
//
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功....");
//
//        brandService.updateById(brandEntity);

        List<Brand> list = brandService.list(new QueryWrapper<Brand>().eq("brand_id", 1L));
        list.forEach((item) -> {
            System.out.println(item);
        });

    }

}
