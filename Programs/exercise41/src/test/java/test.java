import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class test {

    @Test
    public void TestMakeArray() throws IOException{
        ArrayList<String>temp = new ArrayList<>();


        temp.add("Ling, Mai");
        temp.add("Johnson, Jim");
        temp.add("Zar, Sabrina");
        temp.add("Jones, Brian");
        temp.add("Jones, Yoel");
        temp.add("Swift, John");
        temp.add("Swift, taylor");

        FileReader fileIn = new FileReader("data/exercise41_input.txt");
        BufferedReader testIn = new BufferedReader(fileIn);

        ArrayList<String> actual = baseline.Solution42.makeArray(testIn);

        assertArrayEquals(temp.toArray(),actual.toArray());
    }
}
