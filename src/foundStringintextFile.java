import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class foundStringintextFile {
    public static void main(String[] args) {

    }

    public static boolean ifFileContains(String filepath, String str) throws FileNotFoundException {
        File file = new File(filepath);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
        {
            String line = sc.nextLine();
            if(line.contains(str))
            {
                sc.close();
                return true;
            }
            return false;
        }
       return false;
    }
}
