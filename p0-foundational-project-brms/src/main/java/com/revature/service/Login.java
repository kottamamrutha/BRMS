package com.revature.service;
import java.sql.SQLException;
import com.revature.model.User;
public interface Login {
	public abstract void adminLogin() throws SQLException;
	public abstract User getUser(User u);

}
