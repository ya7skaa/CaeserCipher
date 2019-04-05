import java.util.Scanner;


public class App {
    public static void main (String [] args){
        Scanner myConsole = new Scanner(System.in);
        System.out.println("What is your story?");
        String story = myConsole.nextLine();
        System.out.println("Enter your secret key");
        int shift =myConsole.nextInt();


//        Encrypt.encrypter("hello", 4);
        System.out.println(Encrypt.encrypter(story,shift));

    }


}
