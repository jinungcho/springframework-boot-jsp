package com.springframework.boot.jinung.portfolio.main.web;

import com.springframework.boot.jinung.portfolio.main.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Jinungcho
 */
@Controller
public class MainController {

    @Resource(name="mainService")
    MainService mainSevice;

    @RequestMapping(value = "/")
    public String index(HttpServletRequest request) {

        return "index";
    }

    @RequestMapping(value = "/login.do")
    public String login(HttpServletRequest request, Model model) throws Exception {

        mainSevice.loginUserByPw(request, model);

        return "index";
    }
}
