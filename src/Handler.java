public class Handler {

    private Form form;

    public Handler() {}

    public void setForm(Form form) {
        this.form = form;
    }

    public void check() {
        // Mobile number size must be equal 11.
        if (form.getMobilenumber().length() != 11)
            System.out.println("Request Failed, Mobile Number not correct.");
        // amount of money in the wallet must be more than amount of money in the form.
        if (form.getAmount() > form.getUser().getObj().getWalletamount())
            System.out.println("Request Failed, Not Enough Money in your wallet.");
    }
}
