package com.cqupt.zyx.Service.impl;

import com.cqupt.zyx.Dao.SysUserDao;
import com.cqupt.zyx.Service.SysUserService;
import com.cqupt.zyx.domain.beanForBackstage.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    SysUserDao sysUserDao;
    @Override
    public Boolean identify(SysUser sysUser) {
       return sysUserDao.identifySysUser(sysUser) == 1;
    }
}
