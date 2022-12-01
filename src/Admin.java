import java.util.ArrayList;

public class Admin extends  Person {

    private ArrayList<RefundTransactions> ref;

    public Admin(String pass, String user) {
        super(pass, user);
        ref = new ArrayList<RefundTransactions>();
    }




    //response with accept or reject on refund requests
    public void response(){

    }


    //add new refund to transaction refund list
    public void added(){}







}
