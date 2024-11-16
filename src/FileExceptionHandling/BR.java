package FileExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class BR {
    public static void main(String[] args) {
        // Byte to char stream and then reading char stream
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("You typed : " + br.readLine());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        // Output
        OutputStream  os = System.out;
        // os.write(⭐️); // Range is exceeded
    }
}
