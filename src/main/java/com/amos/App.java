package com.amos;

import java.util.ResourceBundle;

public class App {
	
	public int userLogin(String in_user, String in_pwd)
	{
	  ResourceBundle rb = ResourceBundle.getBundle("config");
	  String userName = rb.getString("username");
	  String password = rb.getString("password");
	  
	  if (in_user.equals(userName) && in_pwd.equals(password))
		  return 1;
	  else
		  return 0;
	}

	public static void main(String[] args) {
        App.run(App.class, args);
    }

	private static void run(Class<App> class1, String[] args) {
	}

}
