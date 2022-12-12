import au.com.bytecode.opencsv.*;

import java.io.FileReader;
import java.util.ArrayList;

public class main {

    public static void main(String... A) throws Exception {
        ArrayList<UserModel> P = new ArrayList<UserModel>();
        CSVReader input = new CSVReader(
                new FileReader("C:\\Users\\MaxDroN\\IdeaProjects\\lab_4_java\\F.csv"),
                ';',
                '"',
                1
        );
        String[] nextLine = input.readNext();
        while ((nextLine) != null) {
            UserModel I = new UserModel(nextLine);
            P.add(I);
            nextLine = input.readNext();
        }

    }
}
