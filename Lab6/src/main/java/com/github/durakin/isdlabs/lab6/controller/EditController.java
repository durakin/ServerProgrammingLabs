package com.github.durakin.isdlabs.lab6.controller;

import com.github.durakin.isdlabs.lab6.form.EditForm;
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
@RequestMapping("/edit")
public class EditController {
    private final ApplicationContext context;
    private final ApparelServiceImpl apparelService;

    @Autowired
    public EditController(ApplicationContext applicationContext) {
        this.context = applicationContext;
        this.apparelService = context.getBean("apparelServiceImpl", ApparelServiceImpl.class);
    }

    @GetMapping
    public String getForm(Model model) {
        model.addAttribute("idForm", new IdForm());
        model.addAttribute("editForm", new EditForm());
        return "edit";
    }

    @GetMapping(params = "id")
    public String fillFormById(@Valid IdForm idForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("editForm", new EditForm());
            return "edit";
        }
        if (apparelService.findById(idForm.getId()) == null) {
            model.addAttribute("notFound", true);
            model.addAttribute("editForm", new EditForm());
            return "edit";
        }
        var form = new EditForm();
        form.setId(idForm.getId());
        var apparel = apparelService.findById(idForm.getId());
        form.setInStock(apparel.getInStock());
        form.setPrice(apparel.getPrice());
        model.addAttribute("editForm", form);
        return "edit";
    }

    @PostMapping
    public String editByForm(@Valid EditForm editForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "edit";
        }
        if (apparelService.findById(editForm.getId()) == null) {
            model.addAttribute("notFound", true);
            return "edit";
        }
        apparelService.update(editForm.getId(), editForm.getInStock(), editForm.getPrice());
        return "redirect:/find?id=" + editForm.getId();
    }
}
