package com.cqupt.zyx.Service.impl;

import com.cqupt.zyx.Dao.GoodsDao;
import com.cqupt.zyx.Service.GoodsService;
import com.cqupt.zyx.domain.beanForBackstage.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsDao goodsDao;
    public Page<SimpleProduct> getGoods(Page<SimpleProduct> page){
        Page<SimpleProduct> toBeReturnPage = goodsDao.getGoodsByPage(page);
        toBeReturnPage.setTotalNumber(page.getTotalNumber());
        toBeReturnPage.setCurrentPage(page.getCurrentPage());
        toBeReturnPage.setTotalPage(page.getTotalPage());
        return toBeReturnPage;
    }

    public Product getSpecificGoods(String pid){
        return goodsDao.getSpecificGoods(pid);
    }
    public Boolean updateGoods(SysProduct product){
        return goodsDao.updateGoods(product);
    }
    public Boolean addGoods(SysProduct product){
        return goodsDao.addGoods(product);
    }
    public Boolean deleteGoods(String pid){
        return goodsDao.deleteGoods(pid);
    }

    @Override
    public Boolean setInventory(Inventory inventory) {
        return goodsDao.setInventory(inventory);
    }
}
