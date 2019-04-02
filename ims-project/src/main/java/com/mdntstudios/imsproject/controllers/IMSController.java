package com.mdntstudios.imsproject.controllers;

import com.mdntstudios.imsproject.models.data.IMSDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cheese")
public class IMSController {

    @Autowired
    private IMSDao imsDao;

    //Request path: /cheese
    @RequestMapping(value = "")
    public String index(Model model){

        // CheeseData.getAll() - This goes with "cheeses" model.AddAttribute
        model.addAttribute("cheeses", imsDao.findAll());
        model.addAttribute("title","My Cheeses");

        return "cheese/index";
    }



}
