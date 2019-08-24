package com.cqupt.zyx.Controller.Backstage;

import com.cqupt.zyx.Service.impl.SysUserServiceImpl;
import com.cqupt.zyx.domain.beanForBackstage.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 后台的登录控制*/
@Controller
public class LoginController {
    @Autowired
    SysUserServiceImpl sysUserService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(SysUser sysUser, HttpSession httpSession){
        if(sysUserService.identify(sysUser)){
            httpSession.setAttribute("isLogin",true);
            return "{'static':1}";
        }else
            return "{'static':0}";
    }

}
