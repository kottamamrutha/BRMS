package com.revature.util;
import java.sql.SQLException;
import java.util.function.*;
import com.revature.model.User;
import com.revature.menu.*;
public class PredicateProgram {
	public static void main(String[] args) {
		Menu m=new Menu();
		Predicate<User> userRole = User->(User.getRole()=="Admin");
		if(userRole.test(new User("brms","@123","Admin")))
		{
			try {
				m.menu();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
   
	     
	  
}
