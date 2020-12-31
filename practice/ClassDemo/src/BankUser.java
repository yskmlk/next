public class BankUser {

    public static void main(String args[]){

        BankApp john =   new BankApp("john doe");

        john.accAge(26);
        john.depositeAmount(46879897);

        john.getUserInfo();


        BankApp  jane =  new BankApp("jane doe");

        jane.accAge(24);
        jane.depositeAmount(4754887);


        jane.getUserInfo();


        john.depositeAmount(20000);

        jane.depositeAmount(50000);

        john.getUserInfo();

        jane.getUserInfo();


    }

}
