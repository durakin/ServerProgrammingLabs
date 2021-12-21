package com.github.durakin.isdlabs.lab6.controller;

import com.github.durakin.isdlabs.lab6.form.ApparelForm;
import com.github.durakin.isdlabs.lab6.service.impl.ApparelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/add")
public class AddController {
    private final ApplicationContext context;
    private final ApparelServiceImpl apparelService;

    @Autowired
    public AddController(ApplicationContext applicationContext) {
        this.context = applicationContext;
        this.apparelService = context.getBean("apparelServiceImpl", ApparelServiceImpl.class);
    }

    @GetMapping
    public String getForm(Model model) {
        model.addAttribute("apparelForm", new ApparelForm());
        return "add";
    }

    @PostMapping
    public String addByForm(@Valid ApparelForm apparelForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "add";
        }
        var id = apparelService.add(
                apparelForm.getType(),
                apparelForm.getPrice(),
                apparelForm.getInStock(),
                apparelForm.getSize(),
                apparelForm.getSex());
        return "redirect:/find?id=" + id;
    }
}
