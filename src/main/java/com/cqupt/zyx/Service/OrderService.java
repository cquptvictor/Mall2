package com.cqupt.zyx.Service;

import com.cqupt.zyx.domain.beanForBackstage.Order;
import com.cqupt.zyx.domain.beanForBackstage.Page;
import com.cqupt.zyx.domain.beanForBackstage.SimpleOrder;
import com.cqupt.zyx.domain.beanForBackstage.Range;


public interface OrderService {
    Page<SimpleOrder> getOrders(Page<SimpleOrder> page);
    Order getSpecificOrder(int oid);
    Boolean exportExcel(Range timeRange);
    Boolean delivery(int pid);

}
