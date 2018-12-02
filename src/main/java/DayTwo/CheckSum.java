package DayTwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CheckSum {

    private String file;

    public CheckSum(String file) {
        this.file = file;
    }

    public int generate() {
        return 1;
    }

    private List<Integer> csvToArrayList() throws IOException {
        List<Integer> frequencies = new ArrayList<Integer>();

        String fileIn = this.file;
        String line = null;

        FileReader fileReader = new FileReader(fileIn);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            frequencies.add(Integer.valueOf(line));
        }

        bufferedReader.close();

        return frequencies;
    }

    public static void main (String[] args) {
        CheckSum checkSum = new CheckSum("checkSum-inputs.csv");
        int calc = checkSum.generate();
        System.out.println("CheckSum is: " + calc);
    }

}
