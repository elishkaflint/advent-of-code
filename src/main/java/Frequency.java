import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Frequency {

    public static int calculateSum() throws Exception {

        List<Integer> frequencies = csvToArrayList();

        int sum = 0;

        for (int i = 0; i < frequencies.size(); i++) {
            sum += frequencies.get(i);
        }

        return sum;

    }

    private static List<Integer> csvToArrayList() throws IOException {
        List<Integer> frequencies = new ArrayList<Integer>();

        String fileIn = "frequency-inputs.csv";
        String line = null;

        FileReader fileReader = new FileReader(fileIn);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            frequencies.add(Integer.valueOf(line));
        }

        bufferedReader.close();

        return frequencies;
    }

}
