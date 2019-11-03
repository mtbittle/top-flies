package com.bitnationcode.topflies.controller.admin;

import com.bitnationcode.topflies.controller.home.SearchForm;
import com.bitnationcode.topflies.model.Country;
import com.bitnationcode.topflies.service.ICountryService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Michael
 * @date 11/3/2019
 **/
@Controller
@RequestMapping("/admin")
public class CountryController {

    private ICountryService countryService;

    public CountryController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public ModelAndView start(@ModelAttribute("countryForm") CountryForm form, BindingResult result, HttpServletRequest request) {

        return new ModelAndView("admin/countries");
    }

    @ModelAttribute("countryList")
    public List<Country> getCountryList() {
        return countryService.findAllCountries();
    }

}
