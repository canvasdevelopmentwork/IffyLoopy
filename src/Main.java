import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Loopy
//        Create ONE string variable to store the output of 5 words that a user will enter at random.
        String word;
        Scanner key = new Scanner(System.in);
        for (int x = 0; x < 5; x++) {
            System.out.println("Please enter in a word: ");
            word = key.nextLine();
            System.out.println(word);
        }
//        Iffy
//        Set a boolean value called redEyes.
//        The value will depend on the value entered by the user for the question "Are your eyes red?
//        Create an application that will ask,
//        "Are your eyes red?"
//        If the response is 'y', Or 'yes' (regardless of case), then your application should print out:
//        "Get some sleep!"
//        Otherwise your application should print out "You look great!"
//        Use the value of redEyes to determine whether the user should be complimented or not.

        boolean redEyes;
        System.out.println("Are your eyes red? (y/n)");
        Scanner key1 = new Scanner(System.in);
        String response = key1.nextLine();
        if(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")){
            redEyes = true;
        }
        else {
            redEyes = false;
        }
        if(redEyes){
            System.out.println("get some sleep!");
        } else {
            System.out.println("You look great!");
        }
//
//                Iffy Loop
//        Make sure after the application asks the question the first time, you get a prompt asking,
//        "Do you want to try again?"
//        Your application should continue until the user enters 'n' as an answer.
        boolean redEyes1;
        String response1;
        do {
            System.out.println("Are your eyes red? ");
            Scanner key2 = new Scanner(System.in);
            response1 = key2.nextLine();
            if (response1.equalsIgnoreCase("y") || response1.equalsIgnoreCase("yes")) {
                redEyes1 = true;
            } else {
                redEyes1 = false;
            }
            if (redEyes1) {
                System.out.println("get some sleep!");
            } else {
                System.out.println("You look great!");
            }
            System.out.println("Would you like to continue? ");
            response1 = key2.nextLine();
        } while(!response1.equalsIgnoreCase("n"));
    }
}

