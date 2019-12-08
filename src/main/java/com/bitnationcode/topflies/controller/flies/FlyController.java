package com.bitnationcode.topflies.controller.flies;

import com.bitnationcode.topflies.service.IFlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/flies")
public class FlyController {

    private IFlyService flyService;

    public FlyController(IFlyService flyService) {
        this.flyService = flyService;
    }

    @GetMapping
    public ModelAndView start(@ModelAttribute("flyForm") FlyForm form, BindingResult result, HttpServletRequest request) {

        return new ModelAndView("flies");
    }

    @PostMapping
    public ModelAndView submit() {

        return null;
    }
}
