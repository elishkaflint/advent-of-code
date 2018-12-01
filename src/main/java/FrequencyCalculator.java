import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FrequencyCalculator {

    public static void main(String[] args) throws Exception {

        List<Integer> frequencies = new ArrayList<Integer>();

        String fileIn = "frequency-inputs.csv";
        String line = null;

        FileReader fileReader = new FileReader(fileIn);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            frequencies.add(Integer.valueOf(line));
        }

        bufferedReader.close();

        int sum = 0;

        for (int i = 0; i < frequencies.size(); i++) {
            sum += frequencies.get(i);
        }

        System.out.println(sum);

    }

}
