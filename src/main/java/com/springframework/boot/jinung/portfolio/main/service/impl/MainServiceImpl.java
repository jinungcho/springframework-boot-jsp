package com.springframework.boot.jinung.portfolio.main.service.impl;

import com.springframework.boot.jinung.portfolio.main.service.MainService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Jinungcho
 */
@Service(value = "mainService")
public class MainServiceImpl implements MainService {
    @Override
    public void loginUserByPw(HttpServletRequest request, Model model) throws Exception {
        model.addAttribute("name","jinungcho");
    }
}
