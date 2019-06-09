package com.tc.dlxt.controller;

import com.tc.dlxt.entity.User;
import com.tc.dlxt.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/login")
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userLogin")
    @ResponseBody
    public Map<String, Object> toLogin(String username, String password, HttpServletRequest request) {
        Map<String, Object> resultMap = new HashMap<>();
        User loginUser = userService.login(username, password);
        if (loginUser != null) {
            loginUser.setPassword(null);
            loginUser.setId(null);
            resultMap.put("success", true);
            resultMap.put("user", loginUser);
            HttpSession session = request.getSession();
            session.setAttribute("user", loginUser);
        } else {
            resultMap.put("success", false);
        }
        return resultMap;
    }

    @RequestMapping("/getUsername")
    @ResponseBody
    public String getUsername(HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        return user.getUsername();
    }
    @RequestMapping("/logOut")
    @ResponseBody
    public String logOut(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return "";
    }

}
