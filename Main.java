import java.util.Date;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) throws Exception {
            byte age = 45;
            // long value must have a L at the end to indicate it is a long
            long viewsCount = 200_000_000_000L;
            double price = 15.99;
            // float value needs F at the end to indicate it is a float. else will default to double
            float pricePerPerson = 16.54F;
            // single quotes for a single letter, double quotes for strings
            char letter = 'A';
            boolean isFree = false;

            Date now = new Date();
            

        System.out.println(now);
    }
}
