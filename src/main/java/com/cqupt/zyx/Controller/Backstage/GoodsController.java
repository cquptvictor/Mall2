package com.cqupt.zyx.Controller.Backstage;

import com.cqupt.zyx.Service.impl.GoodsServiceImpl;
import com.cqupt.zyx.Utils.FileUploadUtil;
import com.cqupt.zyx.domain.beanForBackstage.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class GoodsController {

    @Autowired
    GoodsServiceImpl goodsService;
    /**
     * 查询已上架商品*/

    @RequestMapping(value = "/goods",method = RequestMethod.GET)
    @ResponseBody
    public Page<SimpleProduct> getGoods(String category,@RequestParam("page") int nextPage){
        Page<SimpleProduct> page = new Page<>();
        Map map=new HashMap<String, Object>();
        map.put("category",category);
        page.setCurrentPage(nextPage);
        page.setFilter(map);
        return goodsService.getGoods(page);
    }

    /***
     * 进入商品的具体页面
     */

    @RequestMapping(value = "/specificGoods",method = RequestMethod.GET)
    @ResponseBody
    public Product getGoods(String pid){
        return goodsService.getSpecificGoods(pid);
    }
    @RequestMapping(value = "/updateGoods",method = RequestMethod.POST)
    @ResponseBody
    public String updateGoods(SysProduct product){
         if(goodsService.updateGoods(product))
             return "{'static':1}";
         else
             return "{'static:'0}";
    }
    /**
     * 删除已经上架的商品*/

    @RequestMapping(value = "/deleteGoods",method = RequestMethod.GET)
    @ResponseBody
    public String deleteGoods(String pid){
        if(goodsService.deleteGoods(pid))
            return "{'static':1}";
        else
            return "{'static':0}";
    }
    /**
     * 添加新的商品*/
    @RequestMapping(value = "/addGoods",method = RequestMethod.POST)
    @ResponseBody
    public String addGoods(SysProduct product ){
        MultipartFile multipartFile = product.getFile();
        String picPath = FileUploadUtil.save(multipartFile,product.getTitle());
        if(picPath == null)
            return "false";
        product.setPic(picPath);
        if(goodsService.addGoods(product))
            return "{'static':1}";
        else
            return "{'static':0}";
    }

    /**设置商品的库存数*/
    @RequestMapping(value = "/setInventory",method = RequestMethod.GET)
    @ResponseBody
    public String setInventory(Inventory inventory){
        if(goodsService.setInventory(inventory))
            return "{'static':1}";
        else
            return "{'static':0}";
    }
}
