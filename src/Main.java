import java.util.*;

public class Main {
    public static void main(String[] args) {
        int xx = 1;
        Admin admin = new Admin();
        Context cont = new Context();
        client cl = new client(cont);
        User user = null;
        Wallet w = new Wallet(10000.500);
        String mobileNumber = "111111111111";
        double amount = 0;
        while (xx == 1) {

            System.out.println("choose between user and admin");
            System.out.println("1.user");
            System.out.println("2.admin");

            // Context cont = new Context();
            // client cl = new client(cont);

            // Admin admin = new Admin();

            Scanner myObj = new Scanner(System.in);
            int choose = myObj.nextInt();

            if (choose == 1) {

                System.out.println("1.Sign in");
                System.out.println("2.Sign up");
                int choice = myObj.nextInt();
                Person per = new Person();
                // User user = null;
                // user.setContext(cont);
                //Wallet w = new Wallet(10000.500);
                // String mobileNumber = "111111111111";
                // double amount = 0;
                per.setClient(cl);

                if (choice == 1) {

                    user = per.signin();
                    //= cont.getU();
                }
                else if (choice == 2) {
                    // user = new User();

                    per.signup();
                    user = per.signin();
                    user.setObj(w);
                    // user.setPaymentCount(0);
                }
                //  user.setContext(cont);

                System.out.println("press 1 to view wallet charge");
                int wow = myObj.nextInt();
                if (wow == 1) {
                    System.out.println("Your Wallet Charge = " + w.getWalletamount());
                }


                System.out.println("------ Start transaction ----- ");
                System.out.println("Choose from the following Services Menu");
                System.out.println("1 Internet services");
                System.out.println("2 Mobile services");
                System.out.println("3 Donation services");
                System.out.println("4 Landline services");
                int servChoice = myObj.nextInt();
                assert user != null;
                user.starttrans();


                if (servChoice == 1) {
                    InternetFactory intFact = new InternetFactory();
                    intFact.type().operation();


                    System.out.println("Choose one from These Service Providers");
                    System.out.println("1.We");
                    System.out.println("2.Vodafone");
                    System.out.println("3.Orange");
                    System.out.println("4.Etisalat");
                    int servProvChoice = myObj.nextInt();

                    if (servProvChoice == 1) {
                        ServicesProvider we = new We();
                        we.providerOperation();
                        System.out.println("Enter mobile number: ");

                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object


                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form weForm = new Form(mobileNumber, amount);
                        weForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(weForm);

                        hand.check();

                    } else if (servProvChoice == 2) {
                        ServicesProvider Vodafone = new Vodafone();
                        Vodafone.providerOperation();
                        System.out.println("Enter mobile number: ");

                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object


                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form vodafoneForm = new Form(mobileNumber, amount);
                        vodafoneForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(vodafoneForm);
                        hand.check();
                    } else if (servProvChoice == 3) {
                        ServicesProvider Orange = new Orange();
                        Orange.providerOperation();
                        System.out.println("Enter mobile number: ");

                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object


                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form orangeForm = new Form(mobileNumber, amount);
                        orangeForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(orangeForm);
                        hand.check();
                    }
                    if (servProvChoice == 4) {
                        ServicesProvider Etisalat = new Etisalat();
                        Etisalat.providerOperation();
                        System.out.println("Enter mobile number: ");

                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object


                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form etisalatForm = new Form(mobileNumber, amount);
                        etisalatForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(etisalatForm);
                        hand.check();
                    }


                } else if (servChoice == 2) {

                    MobileFactory mobFact = new MobileFactory();
                    mobFact.type().operation();


                    System.out.println("1.We");
                    System.out.println("2.Vodafone");
                    System.out.println("3.Orange");
                    System.out.println("4.Etisalat");
                    int servProvChoice = myObj.nextInt();

                    if (servProvChoice == 1) {
                        ServicesProvider we = new We();
                        we.providerOperation();
                        System.out.println("Enter mobile number: ");
                        //  System.out.println("wheree ?");
                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object
                        // System.out.println("Enter username");

                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form weForm = new Form(mobileNumber, amount);
                        weForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(weForm);
                        hand.check();

                    } else if (servProvChoice == 2) {
                        ServicesProvider Vodafone = new Vodafone();
                        Vodafone.providerOperation();
                        System.out.println("Enter mobile number: ");

                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object


                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form vodafoneForm = new Form(mobileNumber, amount);
                        vodafoneForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(vodafoneForm);
                        hand.check();
                    } else if (servProvChoice == 3) {
                        ServicesProvider Orange = new Orange();
                        Orange.providerOperation();
                        System.out.println("Enter mobile number: ");
                        //  System.out.println("wheree ?");
                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object
                        // System.out.println("Enter username");

                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form orangeForm = new Form(mobileNumber, amount);
                        orangeForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(orangeForm);
                        hand.check();
                    }
                    if (servProvChoice == 4) {
                        ServicesProvider Etisalat = new Etisalat();
                        Etisalat.providerOperation();
                        System.out.println("Enter mobile number: ");

                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object


                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form etisalatForm = new Form(mobileNumber, amount);
                        etisalatForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(etisalatForm);
                        hand.check();
                    }


                } else if (servChoice == 3) {
                    DonationFactory donFact = new DonationFactory();
                    donFact.type().operation();

                    System.out.println("1.Cancer hospital");
                    System.out.println("2.Schools");
                    System.out.println("3.NGOs");
                    int servProvChoice = myObj.nextInt();

                    if (servProvChoice == 1) {
                        ServicesProvider cancer = new CancerHospitals();
                        cancer.providerOperation();
                        System.out.println("Enter mobile number: ");

                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object


                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form cancerForm = new Form(mobileNumber, amount);
                        cancerForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(cancerForm);
                        hand.check();

                    } else if (servProvChoice == 2) {

                        ServicesProvider schools = new Schools();
                        schools.providerOperation();
                        System.out.println("Enter mobile number: ");

                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object


                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form schoolsForm = new Form(mobileNumber, amount);
                        schoolsForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(schoolsForm);
                        hand.check();


                    } else if (servProvChoice == 3) {

                        ServicesProvider ngo = new NGOs();
                        ngo.providerOperation();
                        System.out.println("Enter mobile number: ");

                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object


                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form ngoForm = new Form(mobileNumber, amount);
                        ngoForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(ngoForm);
                        hand.check();


                    }


                } else if (servChoice == 4) {
                    LandlineFactory landFact = new LandlineFactory();
                    landFact.type().operation();

                    System.out.println("Quarter Receipt");
                    System.out.println("Monthly Receipt");

                    int servProvChoice = myObj.nextInt();

                    if (servProvChoice == 1) {
                        ServicesProvider q = new QuarterReceipt();
                        q.providerOperation();
                        System.out.println("Enter mobile number: ");

                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object


                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form quarterForm = new Form(mobileNumber, amount);
                        quarterForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(quarterForm);
                        hand.check();

                    } else if (servProvChoice == 2) {

                        ServicesProvider m = new MonthlyReceipt();
                        m.providerOperation();
                        System.out.println("Enter mobile number: ");

                        Scanner myOb = new Scanner(System.in);  // Create a Scanner object


                        mobileNumber = myOb.nextLine();

                        System.out.println("Enter amount: ");
                        amount = myObj.nextDouble();
                        Form monthlyForm = new Form(mobileNumber, amount);
                        monthlyForm.setUser(user);
                        Handler hand = new Handler();
                        hand.setForm(monthlyForm);
                        hand.check();


                    }


                }

                //-----------------------------------------------------------------------
                System.out.println("1.Pay with Credit Card");
                System.out.println("2.Pay Cash");
                int pay = myObj.nextInt();

                if (pay == 1) {
                    Scanner myObjj = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Please Enter Your Card Number");
                    String userName = myObjj.nextLine();

                    IPayment credit = new CreditCard();
                    credit.setCost(amount);
                    credit = new OverallDiscount(credit);
                    // amount = credit.cost();

                    if (servChoice == 2) {
                        credit = new SpecificDiscount(credit);
                        // amount = credit.cost();
                    }
                    amount = credit.cost();
                    System.out.println("Total amount to be paid by Creditcard = " + amount);
                    // Remove Money From the wallet
                    user.getObj().consume(amount);
                }

                // ---------------------------------- Cash ---------------------------------
                else {

                    IPayment cash = new Cash();
                    cash.setCost(amount);
                    cash = new OverallDiscount(cash);
                    // amount = cash.cost();

                    if (servChoice == 2) {
                        cash = new SpecificDiscount(cash);
                        // amount = cash.cost();
                    }
                    amount = cash.cost();
                    System.out.println("Total amount to be paid by cash = " + amount);
                    // Remove Money From the wallet
                    user.getObj().consume(amount);
                }

                //-----------------------------------------------------------------

                RefundTransactions rT = new RefundTransactions(mobileNumber, amount, false);
                rT.setUser(user);
                // w.consume(amount);   Kosom el 8lta kant hna
                System.out.println("Total amount to be payed = " + amount);
                System.out.println("0.Refund your Money Transaction");
                System.out.println("1.Sign out from the program");
                xx = myObj.nextInt();
                if (xx == 1) {
                    user.signout();
                    continue;
                } else {
                    admin.startRefund(rT);
                }

                System.out.println("0.Exit The Program");
                System.out.println("1.Sign out from the program");
                xx = myObj.nextInt();
                if (xx == 1) {
                    user.signout();
                    continue;
                } else {
                    System.exit(0);
                }
            }

            // ------------- ADMIN ------------------
            else {
                Scanner obj = new Scanner(System.in);
                System.out.println("0.View Refund Transactions");
                System.out.println("1.Sign out from the program");
                xx = obj.nextInt();
                if (xx == 0) {
                    admin.response();
                } else {
                    admin.signout();
                    continue;
                }
            }

            System.out.println("0.Exit The Program");
            System.out.println("1.Sign out from the program");
            xx = myObj.nextInt();
            if (xx == 1) {
                admin.signout();
                continue;
            } else {
                System.exit(0);
            }
        }
    }
}