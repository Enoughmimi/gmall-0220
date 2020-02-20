package com.banghui.gmall.oms.service.impl;

import com.banghui.gmall.oms.entity.Order;
import com.banghui.gmall.oms.mapper.OrderMapper;
import com.banghui.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author LiuBanghui
 * @since 2020-02-18
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
