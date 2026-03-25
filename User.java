package fine;

public class User {
	static int x =1;
    private  int User_id;
    private String User_name;
    
    User(String name){
    	setUser_id(x++);
    	this.User_name =name;
    }

	public  int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		User_id = user_id;
	}

	public String getUser_name() {
		return User_name;
	}

}
