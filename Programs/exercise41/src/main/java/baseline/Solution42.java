/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Manuel Camacho
 */
package baseline;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution42 {
    public static void main(String[] arg) throws IOException {
        BufferedReader in = null;
        ArrayList<String> names = new ArrayList<>();
        File inputFile = makeFile("data/exercise41_input.txt", true);
        File outputFile = makeFile("data/exercise41_output.txt", false);
        PrintWriter writer = new PrintWriter(outputFile);
        try {
            if(inputFile == null){
                throw new FileNotFoundException();
            }

            FileReader fileIn = new FileReader(inputFile);
            in = new BufferedReader(fileIn);

            names = makeArray(in);


            sortFile(names);

            outputFile.delete();

            writer.println("Total of "+ names.size()+" names\n-----------------------------------");
            for(String s: names){
                writer.println(s);
            }
            writer.close();

        }

        catch(FileNotFoundException e){
            outputFile.delete();
            writer.println("ERROR: FILE NOT FOUND");
            writer.close();
        }
        finally{
            try{
                in.close();
                writer.close();
            }
            catch(NullPointerException ignored){}
        }

    }

    private static File makeFile(String path, boolean input) throws IOException {
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
    private static void sortFile(ArrayList<String> arr){
        Collections.sort(arr);
    }
    public static ArrayList<String> makeArray(BufferedReader in) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        String line;
        while((line = in.readLine()) != null){
            list.add(line);
        }
        return list;
    }


}





/*
* PseudoCode
Read input from file, check to make sure they are valid inputs
Store strings read from file into an array, saved in form of firstName LastName
Size of the array will be the total number of names
user sort to sort the array by last name
print output into file

* */
