package com.cqupt.zyx.Dao;

import com.cqupt.zyx.domain.beanForBackstage.*;

import java.util.List;

public interface GoodsDao {
    Page<SimpleProduct> getGoodsByPage(Page<SimpleProduct> page);
    Product getSpecificGoods(String pid);
    Boolean updateGoods(SysProduct product);
    Boolean addGoods(SysProduct product);
    Boolean deleteGoods(String id);
    Boolean setInventory(Inventory inventory);
}
