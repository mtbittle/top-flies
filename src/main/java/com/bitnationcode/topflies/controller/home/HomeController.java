package com.bitnationcode.topflies.controller.home;

import com.bitnationcode.topflies.model.Fly;
import com.bitnationcode.topflies.model.FlyType;
import com.bitnationcode.topflies.model.Season;
import com.bitnationcode.topflies.repository.FlyIdAndName;
import com.bitnationcode.topflies.service.IFlyService;
import com.bitnationcode.topflies.service.ISeasonService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private IFlyService flyService;
    private ISeasonService seasonService;

    public HomeController(IFlyService flyService, ISeasonService seasonService) {
        this.flyService = flyService;
        this.seasonService = seasonService;
    }

    /**
     *
     * @param form
     * @param result
     * @param request
     * @return
     */
    @GetMapping("/")
    public ModelAndView start(@ModelAttribute("searchForm") SearchForm form, BindingResult result, HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView("home");
        //TODO - search results / pagination
        //if (session doesn't contain search params)
        modelAndView.addObject("fliesSearchResults", getAllFlies());

        return modelAndView;
    }

    /**
     *
     * @param form
     * @param result
     * @param request
     * @return
     */
    @PostMapping("/search")
    public ModelAndView search(@ModelAttribute("searchForm") SearchForm form, BindingResult result, HttpServletRequest request) {
        //TODO use query params to filter search results

        System.out.println("search form: " + form.toString());

        return new ModelAndView("home");
    }

    /**
     * Initial query for page if no filters have been selected
     * Page shows all flies by default
     *
     * @return list of flies with no filters
     */
    private List<Fly> getAllFlies() {
        return flyService.getAllFlies();
    }

    @ModelAttribute("seasonList")
    public List<Season> getSeasonList() {
        return seasonService.getAllSeasons();
    }

    @ModelAttribute("flyNameList")
    public List<FlyIdAndName> getFlyNames() {
        return flyService.getFlyIdAndNames();
    }

    @ModelAttribute("flyTypeList")
    public List<FlyType> getFlyTypeList() {
        return flyService.getAllFlyTypes();
    }
}
