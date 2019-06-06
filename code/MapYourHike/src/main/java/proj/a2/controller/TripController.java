package proj.a2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import proj.a2.model.entity.*;
import proj.a2.model.entity.UserAccount;
import proj.a2.model.service.*;


import javax.inject.Inject;
/*
@Controller
public class TripController {

    @Inject
    TripService tripService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView TripView(){
        ModelAndView mav = new ModelAndView("viewTrip");

        mav.addObject("trip",new Trip());
        mav.addObject("profile",new Profile());
        return mav;
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public ModelAndView processOperations(@RequestParam(value = "action") String action,
                                          @RequestParam(value = "mountain") String mountain,
                                          @ModelAttribute(value = "profile")Profile profile) {
        ModelAndView mav = new ModelAndView("viewTrip");
        Trip trip = new Trip();
        trip.setMountain(mountain);
        if(action.equals("Search")) performSearch(mav,trip);
        return mav;

    }
    private void performSearch(ModelAndView mav, Trip trip) {
        System.out.println(trip.getMountain());
        if (!tripService.checkIfExists(trip)) {
            mav.addObject("trip", new Trip());
            return;
        }
        else {
            mav= new ModelAndView("viewMatches");
            mav.addObject(trip);

        }
    }


}

 */
