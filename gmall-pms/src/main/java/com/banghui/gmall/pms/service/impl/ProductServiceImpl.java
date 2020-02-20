package com.banghui.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.banghui.gmall.pms.entity.Product;
import com.banghui.gmall.pms.mapper.ProductMapper;
import com.banghui.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author LiuBanghui
 * @since 2020-02-18
 */
@Component
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
