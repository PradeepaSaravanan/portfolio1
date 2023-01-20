package controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.User;
import Repository.UserRepo;
import services.UserService;

@RestController
@RequestMapping("/api/t1")
public class userController {
	@Autowired
	private UserService userService;
	
	
	
	
	 @GetMapping("/alluser")
	    public List<User> getUsers(){
	        return userService.getUsers();
	    }
	 
	@PostMapping("/addUser")
	public ResponseEntity insert(@RequestBody User user) {
		userService.insert(user);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
