package proj.a2.controller;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import proj.a2.model.entity.Trip;

import proj.a2.model.service.TripService;

import javax.inject.Inject;

@Controller
public class MatchController {
    @Inject
    TripService tripService;
    /*
    @RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView viewMatches(){
        ModelAndView mav = new ModelAndView("viewMatches");
        return mav;
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public ModelAndView processOperations(@ModelAttribute(value = "trip")Trip trip) {
        ModelAndView mav = new ModelAndView("viewMatches");
        List<Trip> list=performResults(mav,trip);
        return mav ;
    }

    List<Trip> performResults(ModelAndView mav, Trip trip)
    {
        return tripService.viewTrip(trip);
    }

     */
}
