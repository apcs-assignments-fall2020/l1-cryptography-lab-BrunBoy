import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        String crow="";
        for (int i=0; i<message.length(); i++){
            if (message.charAt(i)>=65&&message.charAt(i)<=90){
                int mary=message.charAt(i)-65;
                mary+=3;
                if (mary>=3&&mary<=25){
                    crow+= (char) (mary+65);
                }
                else{
                    mary%=26;
                    crow+= (char) (mary+65);
                }
            }
            else if (message.charAt(i)>=97&&message.charAt(i)<=122){
                int mary=message.charAt(i)-97;
                mary+=3;
                mary%=26;
                if (mary>=3&&mary<=25){
                    crow+= (char) (mary+97);
                }
                else{
                    mary%=26;
                    crow+= (char) (mary+97);
                }
            }
            else{
                crow+= (char) (message.charAt(i));
            }
        }
        return crow;
    }

    public static String decryptCaesar(String message) {
        String crow="";
        for (int i=0; i<message.length(); i++){
            if (message.charAt(i)>=68&&message.charAt(i)<=90){
                int mary=message.charAt(i)-65;
                mary-=3;
                if (mary>=3&&mary<=25){
                    crow+= (char) (mary+65);
                }
                else{
                    mary%=26;
                    crow+= (char) (mary+65);
                }
            }
            else if (message.charAt(i)>=100&&message.charAt(i)<=122){
                int mary=message.charAt(i)-97;
                mary-=3;
                mary%=26;
                if (mary>=3&&mary<=25){
                    crow+= (char) (mary+97);
                }
                else{
                    mary%=26;
                    crow+= (char) (mary+97);
                }
            }
            else if (message.charAt(i)>=65&&message.charAt(i)<=67){
                int mary=message.charAt(i)-65;
                mary+=23;
                crow+= (char) (mary%26 +65);
            }
            else if(message.charAt(i)>=97&&message.charAt(i)<=99){
                int mary=message.charAt(i)-97;
                mary+=23;
                crow+=(char) (mary%26+97);
            }
            else{
                crow+= (char) (message.charAt(i));
            }
        }
        return crow;
    }

    public static String encryptCaesarKey(String message, int key) {
        String crow="";
        for (int i=0; i<message.length(); i++){
            if (message.charAt(i)>=65&&message.charAt(i)<=90){
                int mary=message.charAt(i)-65;
                mary+=key;
                if (mary>=key&&mary<=25){
                    crow+= (char) (mary+65);
                }
                else{
                    mary%=26;
                    crow+= (char) (mary+65);
                }
            }
            else if (message.charAt(i)>=97&&message.charAt(i)<=122){
                int mary=message.charAt(i)-97;
                mary+=key;
                mary%=26;
                if (mary>=key&&mary<=25){
                    crow+= (char) (mary+97);
                }
                else{
                    mary%=26;
                    crow+= (char) (mary+97);
                }
            }
            else{
                crow+= (char) (message.charAt(i));
            }
        }
        return crow;
    }

    public static String decryptCaesarKey(String message, int key) {
        String crow="";
        for (int i=0; i<message.length(); i++){
            if (message.charAt(i)>=(65+key%26)&&message.charAt(i)<=90){
                int mary=message.charAt(i)-65;
                crow+= (char) (mary-(key%26)%26+65);
            }
            else if (message.charAt(i)>=(97+key%26)&&message.charAt(i)<=122){
                int mary=message.charAt(i)-97;
                crow+= (char) (mary-(key%26)%26+97);
            }
            else if (message.charAt(i)>=65&&message.charAt(i)<(65+key%26)){
                int mary=message.charAt(i)-65;
                mary+=26;
                crow+= (char) (mary-(key%26)%26+65);
            }
            else if(message.charAt(i)>=97&&message.charAt(i)<=(97+key%26)){
                int mary=message.charAt(i)-97;
                mary+=26;
                crow+=(char) (mary-(key%26)%26+97);
            }
            else{
                crow+= (char) (message.charAt(i));
            }
        }
        return crow;
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
