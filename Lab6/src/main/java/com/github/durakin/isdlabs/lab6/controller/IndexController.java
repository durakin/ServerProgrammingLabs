package com.github.durakin.isdlabs.lab6.controller;

import com.github.durakin.isdlabs.lab6.service.impl.ApparelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    private final ApplicationContext context;
    private final ApparelServiceImpl apparelService;

    @Autowired
    public IndexController(ApplicationContext applicationContext) {
        this.context = applicationContext;
        this.apparelService = context.getBean("apparelServiceImpl", ApparelServiceImpl.class);
    }

    @GetMapping
    public String showHomePage(Model model) {
        model.addAttribute("count", (long) apparelService.findAll().size());
        return "index";
    }
}
