package emailapp;

import java.util.Scanner;

// Creating objects in this class, no main
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCap = 500;
    private String altEmail;


    // Need constructor, could also just use diff variables
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;


        // Now we call our method for setting department and find out which one their in
        this.department = setDepartment();

        // Call password method
        this.password = genPassword(10);

        // Finally we combine the parts to generate the email
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+".Southalabama.edu";
    }

    // Ask for the department
    private String setDepartment(){
        System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter your choice -> ");
        Scanner scan = new Scanner(System.in);
        int depChoice = scan.nextInt();
        if(depChoice == 1){return "Sales";}
        else if(depChoice == 2){return "Development";}
        else if(depChoice == 3){return "Accounting";}
        else{return "";}

    }

    // Generate random string for password, using a string with all the chars id allow in my email
    // -- while generating a random number we find the index and add that to our password and repeat
    // -- until desired length which we pass in MUCH BETTER WAYS THAT I KNOW IN PYTHON TO DO THIS!!!
    private String genPassword(int length){
        String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXTUVXYUZ1234567890!@#$%^&*";
        char[] password = new char[length];
        for(int i=0; i< length;i++){
            int randomVal = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomVal);
        }
        return new String(password);
    }


    // Set mailbox cap
    public void setMailCap(int cap){
        this.mailboxCap = cap;
    }
    // Set alternative email
    public void setAltEmail(String altEmail){
        this.altEmail = altEmail;
    }

    // Also we need to be able to change the password
    public void setPassword(String password){
        this.password=password;
    }
    // Simple gets
    public int getMailboxCap(){
        return mailboxCap;
    }

    public String getAltEmail(){
        return altEmail;
    }

    public String getPassword(){
        return password;
    }
    // method to show information
    public String showInfo(){
        return "\nName: "+firstName + " " + lastName + "\n"+
                "Company Email: " + email + "\n"+
                "Password: " + password + "\n"+
                "Mailbox Capacity: " + mailboxCap+"mb";
    }


}
