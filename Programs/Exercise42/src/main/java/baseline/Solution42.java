package baseline;

import java.io.*;

public class Solution42 {
    public static void main(String[] args)throws IOException{



    }

    private BufferedReader readInput() throws IOException{
        File fileIn = makeFile("data/exercise42_input.txt", true);
        if(fileIn == null){
            System.out.println("File Not Found");
            System.exit(0);
        }
        try{
            FileReader fileRead = new FileReader(fileIn);
            return new BufferedReader(fileRead);
        }
        catch (FileNotFoundException fnf){
            System.out.println("file not Found");
            System.exit(0);
        }
        return null;
    }

    private File makeFile(String path, boolean input) throws IOException {
        File temp = new File(path);
        if(input && temp.exists()){
            return temp;
        }
        else if(input){
            return null;
        }
        else{
            temp.createNewFile();
        }
        return temp;
    }


}


/*PseudoCode
read input from file
split intput using the "," to know when to split
store the data into its specific part, per person
make an array for each person
display data in table form

 */