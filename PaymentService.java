package fine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public interface PaymentService {
    public Map<String,Payment> Payment_List = new HashMap<>();
    public void addPayment(Scanner sc);
    public void viewPending();
    public void maxPending();
    public void deletePayment(Scanner sc);
}
