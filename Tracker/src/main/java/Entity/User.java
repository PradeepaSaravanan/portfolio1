package Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int userId;
 private String userName;
 private String Email;
 private int mobileNo;
 private String password;
 private List<String>portfolio;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public int getMobileNo() {
	return mobileNo;
}
public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public List<String> getPortfolio() {
	return portfolio;
}
public void setPortfolio(List<String> portfolio) {
	this.portfolio = portfolio;
}
 
 
}
