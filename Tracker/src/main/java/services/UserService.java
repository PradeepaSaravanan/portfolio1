package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Entity.User;
import Repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userrepo;
	
	public UserService(UserRepo userrepo) {
		super();
		this.userrepo=userrepo;
	}
	
	
	public void insert(User user) {
		userrepo.save(user);
	}
    
	 public User getuser(int id){
	        return userrepo.findById(id).get();
	 }
	
	public List<User> getUsers() {
		List<User> users = userrepo.findAll();
		return users;
	}
}
