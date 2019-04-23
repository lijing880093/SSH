package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author : Iman
 * date : 2019/4/22
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping("findAll")
    public  String findAll(Model model){
        List<User> all =userService.findAll();
        model.addAttribute("all",all);
        return "list";
    }
    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable(name = "id") Integer id){
        User byId = userService.findById(id);
        userService.delete(byId);
        return "redirect:/user/findAll";

    }
    @RequestMapping(value = "/toadd")
    public String queryOne(){
        return "forward:/WEB-INF/views/update.jsp";
    }
    @RequestMapping(value = "/toupdate/{id}")
    public ModelAndView toupdate(@PathVariable(name = "id") Integer id){
        User user = userService.findById(id);

        ModelAndView modelAndView=new ModelAndView("/update");
        modelAndView.addObject("user",user);

        return modelAndView;
    }
    @RequestMapping(value = "/save")
    public String save(User user){

        if(user.getId()==null){
            userService.add(user);
        }else{
            userService.update(user);
        }
        return "redirect:/user/findAll";
    }
}
