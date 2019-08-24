package com.cqupt.zyx.Service;

import com.cqupt.zyx.domain.beanForBackstage.*;

import java.util.List;

public interface GoodsService {
     Page<SimpleProduct> getGoods(Page<SimpleProduct> page);
     Product getSpecificGoods(String id);
     Boolean updateGoods(SysProduct product);
     Boolean addGoods(SysProduct product);
     Boolean deleteGoods(String pid);
     Boolean setInventory(Inventory inventory);

    }
