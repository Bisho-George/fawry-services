import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Person {

    private ArrayList<RefundTransactions> ref;

    public Admin(String pass, String user) {
        super(pass, user);
        ref = new ArrayList<RefundTransactions>();
    }


    // response with accept or reject on refund requests
    public void response() {
        for (int i = 0; i < ref.size(); i++) {
            System.out.println("The mobile number of the transaction is : " + ref.get(i).getMobileNumber());
            System.out.println("The amount of money want to be refunded is : " + ref.get(i).getAmount());
            System.out.println("press 1 to accept the refund transaction or 2 to reject it");
            Scanner myObj = new Scanner(System.in);
            int choose = myObj.nextInt();
            if (choose == 1) {
                ref.get(i).setState(true);
            } else {
                ref.get(i).setState(false);
            }


        }
        ref.clear();

    }


    // add new refund to transaction refund list
    public void added(RefundTransactions obj) {
        ref.add(obj);
    }


}
