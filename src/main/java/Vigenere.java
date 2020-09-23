import java.util.Scanner;

public class Vigenere {
    public static String encryptVigenere(String message, String key) {
        String krum="";
        for (int i=0; i<message.length(); i++){
            if (message.charAt(i)>=65&&message.charAt(i)<=90){
                int cheeky=message.charAt(i)-65;
                for (int j=0; j<key.length(); j++){
                    if (key.charAt(i)>=65&&key.charAt(i)<=90){
                        int smill=key.charAt(i)-65;
                        cheeky+=smill;
                        krum+= (char) (cheeky+0);
                    }
                    else if (key.charAt(i)>=97&&key.charAt(i)<=122){
                        int smill=key.charAt(i)-97;
                        cheeky+=smill;
                        krum+= (char) (cheeky+0);
                    }
                    else{
                        krum+= (char) (message.charAt(i));
                    }
                }
            }
            else if (message.charAt(i)>=97&&message.charAt(i)<=122){
                int cheeky=message.charAt(i)-97;
                for (int a=0; a<key.length(); a++){
                    if (key.charAt(i)>=65&&key.charAt(i)<=90){
                        int smill=key.charAt(i)-65;
                        cheeky+=smill;
                        krum+= (char) (cheeky+0);
                    }
                    else if (key.charAt(i)>=97&&key.charAt(i)<=122){
                        int smill=key.charAt(i)-97;
                        cheeky+=smill;
                        krum+= (char) (cheeky+0);
                    }
                    else{
                        krum+= (char) (message.charAt(i));
                    }
                }
            }
            else{
                krum+=(char) (message.charAt(i));
            }
        }
        return krum;
    }

    public static String decryptVigenere(String message, String key) {
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
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
