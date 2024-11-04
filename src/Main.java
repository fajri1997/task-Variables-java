//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String firstName = "Fajri";
        String lastName = "Alhusaini";
        int age = 27;
        double amount = 666.240;
        System.out.println(lastName);
        System.out.println(firstName);
        System.out.println(age);
        System.out.println(amount);
        double newAmount = 20;
        String deposit = "Deposit";
        String withdraw = "Withdraw";
        newAmount = 30;

        System.out.println("The amount is " + newAmount + "KD");
        System.out.println("Would you like to " + deposit + " OR " + withdraw + " the amount?");
//        System.out.println("Would you like to  + 'deposit'  +  OR   + withdraw +   the amount?");
        int intAmount = 5;
        System.out.println(intAmount + intAmount);

//        String fullName = firstName + lastName;
        System.out.println("My name is " + firstName + " and my last name length is " + lastName.length());

        String FullNameTwo = "John Morgan";
        String [] names = FullNameTwo.split(" ");
        System.out.println(names[0]);
        System.out.println(names[1]);


        System.out.printf("%s %s\n" , firstName , lastName);
        // will cheack my name if i have d or not
        if (!lastName.isEmpty() && (lastName.charAt(0) == 'd' || lastName.charAt(0) == 'D')) {
            System.out.println("true");

        } else {
            System.out.println("false");

        }

    }
}