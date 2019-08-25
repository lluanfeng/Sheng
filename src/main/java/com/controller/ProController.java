package com.controller;

import com.pojo.PageBean;
import com.pojo.Projectdb;
import com.service.ProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/con1")
public class ProController {
    @Autowired
    private ProService service;
    @RequestMapping("/show")
    public ModelAndView selectAll(PageBean page, ModelAndView mav){
        //分页查询projectdb表
        List<Projectdb> list=service.selectPageAndLike(page);
        mav.addObject("list",list);
        mav.addObject("page",page);
        mav.setViewName("show");
        return mav;
    }
    @RequestMapping("/add1")
    public String add1(){
        return "add";
    }

    @RequestMapping("/add2")//执行新增
    public String add2(Projectdb pro){
        int i=service.addPro(pro);
        return "redirect:/con1/show";
    }
    @RequestMapping("/show1")//查单条
    public ModelAndView show1(Integer id,ModelAndView mav){
        Projectdb projectdb=service.selectOne(id);
        mav.addObject("projectdb",projectdb);
        mav.setViewName("update");
        return mav;
    }
    @RequestMapping("/show2")
    public String show2(Projectdb projectdb){
        int i = service.update(projectdb);
        return "redirect:/con1/show";
    }
}
