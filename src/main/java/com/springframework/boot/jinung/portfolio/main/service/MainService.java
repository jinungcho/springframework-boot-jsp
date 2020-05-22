package com.springframework.boot.jinung.portfolio.main.service;

import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Jinungcho
 */
public interface MainService {

    void loginUserByPw(HttpServletRequest request, Model model) throws Exception;
}
