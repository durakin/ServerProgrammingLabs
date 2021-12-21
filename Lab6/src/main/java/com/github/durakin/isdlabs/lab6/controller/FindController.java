package com.github.durakin.isdlabs.lab6.controller;

import com.github.durakin.isdlabs.lab6.entity.Apparel;
import com.github.durakin.isdlabs.lab6.form.IdForm;
import com.github.durakin.isdlabs.lab6.form.MaxPriceForm;
import com.github.durakin.isdlabs.lab6.service.impl.ApparelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/find")
public class FindController {
    private final ApplicationContext context;
    private final ApparelServiceImpl apparelService;

    @Autowired
    public FindController(ApplicationContext applicationContext) {
        this.context = applicationContext;
        this.apparelService = context.getBean("apparelServiceImpl", ApparelServiceImpl.class);
    }

    @GetMapping
    public String viewByIdOrAll(Model model) {
        model.addAttribute("idForm", new IdForm());
        model.addAttribute("maxPriceForm", new MaxPriceForm());

        var apparels = apparelService.findAll();
        model.addAttribute("apparels", apparels);
        return "find";
    }

    @GetMapping(params = "id")
    public String viewByIdOrAll(@Valid IdForm idForm, BindingResult bindingResultIdForm, MaxPriceForm maxPriceForm, Model model) {
        if (bindingResultIdForm.hasErrors()) {
            return "find";
        }
        if (idForm.getId() == 0) {
            return "redirect:/find";
        }
        List<Apparel> apparels = new ArrayList<>();
        var apparel = apparelService.findById(idForm.getId());
        if(apparel != null) {
            apparels.add(apparelService.findById(idForm.getId()));
        }
        model.addAttribute("apparels", apparels);
        return "find";
    }

    @GetMapping(params = "price")
    public String viewByType(@Valid MaxPriceForm maxPriceForm, BindingResult bindingResultTypeForm, IdForm idForm, Model model) {
        if (bindingResultTypeForm.hasErrors()) {
            return "find";
        }
        var apparels = apparelService.findByMaxPrice(maxPriceForm.getPrice());
        model.addAttribute("apparels", apparels);
        return "find";
    }
}
