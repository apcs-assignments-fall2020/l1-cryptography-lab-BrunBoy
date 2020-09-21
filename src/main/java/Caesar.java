import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        String crow="";
        for (int i=0; i<message.length(); i++){
            int mary=message.charAt(i)-65;
            mary+=3;
            mary%=26;
            crow+=(char) (mary+65);
        }
        return crow;
    }

    public static String decryptCaesar(String message) {
        char mary=0;
        String crow="";
        for (int i=0; i<message.length(); i++){
            mary=message.charAt(i);
            if (65<=mary && mary<=90){
                mary=(char) (mary-3);
            }
            if (97<=mary && mary<=122){
                mary=(char) (mary-3);
            }
            else{
                mary=(char) (mary+0);
            }
            crow+=mary;
        }
        return crow;
    }

    public static String encryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }

    public static String decryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
