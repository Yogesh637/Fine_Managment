package fine;

public class Student extends User{
    private int fine;
    Student(String name){
    	super(name);
    }
    public int getFine() {
		return fine;
	}
	public void addfine(int fee) {
		this.fine += fee;
	}
	public void clearfine() {
		this.fine = 0;
	}
}
