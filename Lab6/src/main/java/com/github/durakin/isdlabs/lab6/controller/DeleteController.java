package com.github.durakin.isdlabs.lab6.controller;

import com.github.durakin.isdlabs.lab6.form.IdForm;
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
@RequestMapping("/delete")
public class DeleteController {
    private final ApplicationContext context;
    private final ApparelServiceImpl apparelService;

    @Autowired
    public DeleteController(ApplicationContext applicationContext) {
        this.context = applicationContext;
        this.apparelService = context.getBean("apparelServiceImpl", ApparelServiceImpl.class);
    }

    @GetMapping
    public String getForm(Model model) {
        model.addAttribute("idForm", new IdForm());
        return "delete";
    }

    @PostMapping
    public String deleteByForm(@Valid IdForm idForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "delete";
        }
        var id = idForm.getId();
        apparelService.delete(id);
        return "delete";
    }
}
