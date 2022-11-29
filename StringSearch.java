/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringSearch {


    private String output;
    private String path;

    public StringSearch(String path) {
        output = ""; 
        this.path = path;
    }

    private void run(String input) {
        try {
            Scanner scan = new Scanner(new File(path));
            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                if(line.contains(input)) {
                    output += line + "\n";
                }
            }

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found");
        }
    }

    public String getLines(String keyword) {
        run(keyword);
        if(output.isEmpty()) {
            return "No lines found";
        }
        return output;
    }
    
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter input command: ");
        String input = userIn.nextLine();
        
        String[] split = input.split(" ");

        if(split.length > 2 && split[0].equals("search")) {
            StringSearch s = new StringSearch(split[2]);
            String lines = s.getLines(split[1]);
            System.out.println(lines);
        } else {
            System.out.println("Invalid input");
        }
    }
}*/