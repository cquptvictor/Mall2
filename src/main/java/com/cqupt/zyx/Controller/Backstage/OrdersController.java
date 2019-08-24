package com.cqupt.zyx.Controller.Backstage;

import com.cqupt.zyx.Service.OrderService;
import com.cqupt.zyx.domain.beanForBackstage.Order;
import com.cqupt.zyx.domain.beanForBackstage.Page;
import com.cqupt.zyx.domain.beanForBackstage.Range;
import com.cqupt.zyx.domain.beanForBackstage.SimpleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrdersController {
    @Autowired
    OrderService orderService;
    /**
     * 获取订单*/
    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    @ResponseBody
    public Page<SimpleOrder> getOrders(String startTime,String endTime,@RequestParam("page") int nextPage){
        Page<SimpleOrder> page = new Page<>();
        page.setCurrentPage(nextPage);
        Map<String,Object> filter = new HashMap<>();
        filter.put("startTime",startTime);
        filter.put("endTime",endTime);
        page.setFilter(filter);
        return orderService.getOrders(page);
    }
    /***
     *订单详情页
     */
    @RequestMapping(value = "/specificOrder", method = RequestMethod.GET)
    @ResponseBody
    public Order getSpecificOrder(int oid){
        return orderService.getSpecificOrder(oid);
    }
    /**
    * 导出为Excel*/
    @RequestMapping(value = "/export", method = RequestMethod.POST)
    public String exportExcel(Range timeRange){
        return null;
    }

    @RequestMapping(value = "/delivery",method = RequestMethod.GET)
    @ResponseBody
    public String updateStatus(int oid){
        if(orderService.delivery(oid))
            return "{'static':1}";
       else
           return "{'static':0}";
    }
}
