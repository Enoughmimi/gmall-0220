package com.banghui.gmall.oms.service.impl;

import com.banghui.gmall.oms.entity.OrderItem;
import com.banghui.gmall.oms.mapper.OrderItemMapper;
import com.banghui.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author LiuBanghui
 * @since 2020-02-18
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
