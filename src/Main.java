import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("choose between user and admin");
        System.out.println("1.user");
        System.out.println("2.admin");


        Scanner myObj = new Scanner(System.in);
        int choose = myObj.nextInt();

        if(choose==1){

            System.out.println("1.Sign in");
            System.out.println("2.Sign up");
            int choice=myObj.nextInt();


            if(choice==1){

                System.out.println("Enter username ");
                String userName=myObj.nextLine();
                System.out.println("Enter password ");
                String password=myObj.nextLine();
                Person user=new User(password,userName);
                user.signin();
            }
            else if(choice==2){
                System.out.println("Enter username ");
                String userName=myObj.nextLine();
                System.out.println("Enter password ");
                String password=myObj.nextLine();
                Person user=new User(password,userName);
                user.signup();
                user.signin();

            }

            System.out.println("Start transaction");
            System.out.println("Choose from the following");
            System.out.println("Select services");
            System.out.println("1 Internet services");
            System.out.println("2 Mobile services");
            System.out.println("3 Donation services");
            System.out.println("4 Landline services");
            int servChoice=myObj.nextInt();

            if(servChoice==1){
                InternetFactory intFact = new InternetFactory();
                intFact.type().operation();


                System.out.println("1.We");
                System.out.println("2.Vodafone");
                System.out.println("3.Orange");
                System.out.println("4.Etisalat");
                int servProvChoice=myObj.nextInt();

                if(servProvChoice==1){
                    ServicesProvider we =new We();
                    we.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form weForm=new Form(mobileNumber,amount);

                }
                else if(servProvChoice==2){
                    ServicesProvider Vodafone =new Vodafone();
                    Vodafone.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form vodafoneForm=new Form(mobileNumber,amount);
                }
                else if(servProvChoice==3){
                    ServicesProvider Orange =new Orange();
                    Orange.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form orangeForm=new Form(mobileNumber,amount);
                }
                if(servProvChoice==4){
                    ServicesProvider Etisalat =new Etisalat();
                    Etisalat.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form etisalatForm=new Form(mobileNumber,amount);
                }


            } else if (servChoice==2) {

                MobileFactory mobFact = new MobileFactory();
                mobFact.type().operation();


                System.out.println("1.We");
                System.out.println("2.Vodafone");
                System.out.println("3.Orange");
                System.out.println("4.Etisalat");
                int servProvChoice=myObj.nextInt();

                if(servProvChoice==1){
                    ServicesProvider we =new We();
                    we.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form weForm=new Form(mobileNumber,amount);

                }
                else if(servProvChoice==2){
                    ServicesProvider Vodafone =new Vodafone();
                    Vodafone.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form vodafoneForm=new Form(mobileNumber,amount);
                }
                else if(servProvChoice==3){
                    ServicesProvider Orange =new Orange();
                    Orange.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form orangeForm=new Form(mobileNumber,amount);
                }
                if(servProvChoice==4){
                    ServicesProvider Etisalat =new Etisalat();
                    Etisalat.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form etisalatForm=new Form(mobileNumber,amount);
                }


            }
            else if (servChoice==3) {
                DonationFactory donFact = new DonationFactory();
                donFact.type().operation();

                System.out.println("1.Cancer hospital");
                System.out.println("2.Schools");
                System.out.println("3.NGOs");
                int servProvChoice=myObj.nextInt();

                if(servProvChoice==1){
                    ServicesProvider cancer =new CancerHospitals();
                    cancer.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form cancerForm=new Form(mobileNumber,amount);

                }

                else if(servProvChoice==2){

                    ServicesProvider schools = new Schools();
                    schools.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form schoolsForm=new Form(mobileNumber,amount);





                }

                else if(servProvChoice==3){

                    ServicesProvider ngo = new NGOs();
                    ngo.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form ngoForm=new Form(mobileNumber,amount);





                }





            } else if (servChoice==4) {
                LandlineFactory landFact = new LandlineFactory();
                landFact.type().operation();

                System.out.println("Quarter Receipt");
                System.out.println("Monthly Receipt");

                int servProvChoice=myObj.nextInt();

                if(servProvChoice==1){
                    ServicesProvider q =new QuarterReceipt();
                    q.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form quarterForm=new Form(mobileNumber,amount);

                } else if (servProvChoice==2) {

                    ServicesProvider m =new MonthlyReceipt();
                    m.providerOperation();
                    System.out.println("Enter mobile number: ");
                    String mobileNumber=myObj.nextLine();
                    System.out.println("Enter amount: ");
                    double amount=myObj.nextDouble();
                    Form monthlyForm=new Form(mobileNumber,amount);



                }


            }


        }
        else{


        }

    }
}