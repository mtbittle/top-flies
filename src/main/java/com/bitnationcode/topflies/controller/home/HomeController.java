package com.bitnationcode.topflies.controller.home;

import com.bitnationcode.topflies.model.*;
import com.bitnationcode.topflies.service.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * @author Michael
 */
@Controller
public class HomeController {

    private IFlyService flyService;
    private ISeasonService seasonService;
    private IStateService stateService;
    private IRiverService riverService;
    private IRegionService regionService;

    public HomeController(IFlyService flyService, ISeasonService seasonService, IStateService stateService,
                          IRiverService riverService, IRegionService regionService) {
        this.flyService = flyService;
        this.seasonService = seasonService;
        this.stateService = stateService;
        this.riverService = riverService;
        this.regionService = regionService;
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
    @PostMapping("/")
    public ModelAndView search(@ModelAttribute("searchForm") SearchForm form, BindingResult result, HttpServletRequest request,
                               @PageableDefault(sort = {"name"}, size = 25) Pageable pageable) {
        //TODO use query params to filter search results

        System.out.println("search form: " + form.toString());
        flyService.findBySearchParams(form, pageable);

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

    @ModelAttribute("flyTypeList")
    public List<FlyType> getFlyTypeList() {
        return flyService.getAllFlyTypes();
    }

    @ModelAttribute("stateList")
    public List<State> getStateList() {
        return stateService.getAllStates();
    }

    @ModelAttribute("riverList")
    public List<River> getRiverList() {
        return riverService.getAllRivers();
    }

    @ModelAttribute("regionList")
    public List<Region> getRegionList() {
        return regionService.getAllRegions();
    }
}
