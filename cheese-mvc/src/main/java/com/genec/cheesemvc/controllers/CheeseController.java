package com.genec.cheesemvc.controllers;

import com.genec.cheesemvc.models.Cheese;
import com.genec.cheesemvc.models.CheeseType;
import com.genec.cheesemvc.models.data.CheeseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


@Controller
@RequestMapping("cheese")
public class CheeseController {

    @Autowired
    private CheeseDao cheeseDao;

        //Request path: /cheese
    @RequestMapping(value = "")
    public String index(Model model){

        // CheeseData.getAll() - This goes with "cheeses" model.AddAttribute
        model.addAttribute("cheeses", cheeseDao.findAll());
        model.addAttribute("title","My Cheeses");

        return "cheese/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model){
        model.addAttribute("title", "Add Cheese");
        model.addAttribute(new Cheese());
        model.addAttribute("cheeseTypes", CheeseType.values());
        return "cheese/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@ModelAttribute @Valid Cheese newCheese,
                                       Errors errors, Model model){

        if (errors.hasErrors()){
            model.addAttribute("title", "Add Cheese");
            return "cheese/add";
        }

      //  CheeseData.add(newCheese);
        cheeseDao.save(newCheese);
        // Redirect to /cheese
        return "redirect:";
    }

    // CheeseData.getAll() - This goes next to "cheeses" in model.addAttribute
    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCheeseForm(Model model){
        model.addAttribute("cheeses", cheeseDao.findAll());
        model.addAttribute("title", "Remove Cheese");
        return "cheese/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCheeseForm(@RequestParam int[] cheeseIds){

        for (int cheeseId : cheeseIds){
         //   CheeseData.remove(cheeseId);
           cheeseDao.deleteById(cheeseId);
        }
        return "redirect:";
    }


}
