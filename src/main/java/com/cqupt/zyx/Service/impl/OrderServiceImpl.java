package com.cqupt.zyx.Service.impl;

import com.cqupt.zyx.Dao.OrderDao;
import com.cqupt.zyx.Service.OrderService;
import com.cqupt.zyx.domain.beanForBackstage.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;
    @Override
    public Page<SimpleOrder> getOrders(Page<SimpleOrder> page) {
        Page<SimpleOrder> toBeReturnPage = orderDao.getOrdersByPage(page);
        toBeReturnPage.setTotalNumber(page.getTotalNumber());
        toBeReturnPage.setCurrentPage(page.getCurrentPage());
        toBeReturnPage.setTotalPage(page.getTotalPage());
        return toBeReturnPage;
    }

    @Override
    public Order getSpecificOrder(int oid) {
        return orderDao.getSpecificOrder(oid);
    }

    @Override
    public Boolean exportExcel(Range timeRange) {
        return null;
    }

    @Override
    public Boolean delivery(int oid) {
        return orderDao.delivery(oid);
    }
}
