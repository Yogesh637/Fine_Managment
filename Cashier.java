package fine;

public class Cashier {
    static int x =1;
    private int Cashier_id;
    Cashier(){
    	this.setCashier_id(x++);
    }
	public int getCashier_id() {
		return Cashier_id;
	}
	public void setCashier_id(int cashier_id) {
		Cashier_id = cashier_id;
	}
}
