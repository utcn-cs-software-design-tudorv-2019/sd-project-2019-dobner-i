package proj.a2;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import proj.a2.model.entity.*;
import proj.a2.model.repository.*;
import proj.a2.model.service.*;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapYourHikeApplicationTests {


	@Autowired
	UserAccountDAO userDao;

	@Autowired
	PlaceDAO placeDao;

	@Autowired
	ProfileDAO profileDao;

	@Autowired
	TripDAO tripeDao;

    @Autowired
    UserAccountService usersService;

    @Autowired
    public ProfileService profileService;

	@Autowired
	public PlaceService placeService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testUserDAO()
	{
		/*UserAccount user= new UserAccount("HippityHoppity","bunlife");
		System.out.println(user);
		userDao.save(user);
		System.out.println("Added user");*/
        /*System.out.println("Found user? " + usersService.checkUser(user));*/
		/*UserAccount user= userDao.findByUserName("JakabGyonci");

        Profile p=usersService.findProfile(user);
        System.out.println(p);
        Profile profile=profileService.viewProfile(p);
        System.out.println(profile);*/
/*
		Profile profile=new Profile(user,"Shelly the Bunny","Bunny lifestyle");
		profileDao.save(profile);
		System.out.println(profile);

		Place initplace=new Place("1200","W' 110 E'110");
		System.out.println(initplace);
		placeDao.save(initplace);
		System.out.println("Added place");

		Place targetplace=new Place("200","W' 10 E'20");
		System.out.println(targetplace);
		placeDao.save(targetplace);
		System.out.println("Added place");

		Trip trip=new Trip(profile,"Bucegi",initplace,targetplace);
		tripeDao.save(trip);
		System.out.println(trip);
		*/




	}

}
