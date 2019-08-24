package com.cqupt.zyx.Dao;

import com.cqupt.zyx.domain.beanForBackstage.Order;
import com.cqupt.zyx.domain.beanForBackstage.Page;
import com.cqupt.zyx.domain.beanForBackstage.Range;
import com.cqupt.zyx.domain.beanForBackstage.SimpleOrder;


public interface OrderDao {
    Page<SimpleOrder> getOrdersByPage(Page<SimpleOrder> page);
    Order getSpecificOrder(int oid);
    Boolean delivery(int oid);


}
