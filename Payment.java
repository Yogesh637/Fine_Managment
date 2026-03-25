package fine;

public class Payment {
    static int x = 1;
    private int Payment_id;
    private Student student;
    private boolean isPending;
    Payment(Student stu,int fee){
    	this.setPayment_id(x++);
    	this.student = stu;
    	this.setFee(fee);
    	this.isPending = true;
    }
	public int getPayment_id() {
		return Payment_id;
	}
	public void setPayment_id(int payment_id) {
		Payment_id = payment_id;
	}
	public int getFee() {
		return student.getFine();
	}
	public void setFee(int fee) {
		this.student.addfine(fee);
		
	}
	public boolean isPending() {
		return isPending;
	}
	public void setPending(boolean isPending) {
		this.isPending = isPending;
	}
}
