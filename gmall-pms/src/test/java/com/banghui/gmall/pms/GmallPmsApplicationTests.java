package com.banghui.gmall.pms;

import com.banghui.gmall.pms.entity.Brand;
import com.banghui.gmall.pms.entity.Product;
import com.banghui.gmall.pms.service.BrandService;
import com.banghui.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {

//        Product byId = productService.getById(1);
//        System.out.println(byId.getName());
////        测试增删改在主库，查在从库
//        Brand brand = new Brand();
//        brand.setName("嘿嘿嘿");
//        brandService.save(brand);

        Brand byId = brandService.getById(54);
        System.out.println("保存成功...."+byId.getName());

    }

}
