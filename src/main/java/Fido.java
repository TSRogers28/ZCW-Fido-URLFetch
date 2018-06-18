import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Fido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a URL");

        try {
            URL obj = new URL("https://" + scan.nextLine());

            URLConnection urlConnection = obj.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                    urlConnection.getInputStream()));

            String bufferReadLine;

            while ((bufferReadLine = bufferedReader.readLine()) != null)
            {
                System.out.println(bufferReadLine);
            }
            bufferedReader.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }




}





