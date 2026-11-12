import java.util.*;
import java.io.*;


public abstract class User implements HasMenu, Serializable{
	protected String userName;
	protected String PIN;

	public void setUserName(String name)
	{
		this.userName = name;
	}
	public String getUserName()
	{
		return this.userName; 
	}

	public void setPIN(String pin)
	{
		this.PIN = pin;
	} 
	public String getPIN()
	{
		return this.PIN;
	}

	public boolean login(String u, String p)
	{
		return (u.equals(this.userName) && p.equals(this.PIN));
	}

	public User(String username, String pin){
		this.userName = username;
		this.PIN = pin;
	}

	public boolean login() {
    		Scanner input = new Scanner(System.in);

    		System.out.print("Username: ");
    		String u = input.nextLine();

    		System.out.print("PIN: ");
    		String p = input.nextLine();

    	return login(u, p);
	}

	public abstract String getReport();
}
