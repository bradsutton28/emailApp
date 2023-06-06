package emailapp;

// The main class
// A simple program designed to take in input from the user like name, lastname deparment etc
// Create an email for them using this information and then generate a password for them
// Purpose is to practice OOP in Java since it's been a couple years since I used java
public class EmailApp {


    public static void main(String[] args) {

        Email person1 = new Email("Bradley", "Sutton");
        System.out.println(person1.showInfo()+"\n");
        Email person2 = new Email("Grace", "Mcintosh");
        System.out.println(person2.showInfo()+"\n");

    }

}
