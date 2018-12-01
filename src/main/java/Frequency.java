import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Frequency {

    public static int calculateSum() throws Exception {

        List<Integer> frequencies = csvToArrayList();

        int sum = 0;

        for (int i = 0; i < frequencies.size(); i++) {
            sum += frequencies.get(i);
        }

        return sum;

    }

    public static int calculateDoubles() throws Exception {

        List<Integer> frequencies = csvToArrayList();
        List<Integer> uniqueFrequencies = new ArrayList<>();

        int currentFrequency = frequencies.get(0);
        uniqueFrequencies.add(currentFrequency);

        rotate(frequencies);

        while (true) {

            currentFrequency += frequencies.get(0);

            if (!uniqueFrequencies.contains(currentFrequency)) {
                uniqueFrequencies.add(currentFrequency);
                rotate(frequencies);
            } else {
                return currentFrequency;
            }
        }
    }

    private static void rotate(List<Integer> frequencies) {
        frequencies.add(frequencies.get(0));
        frequencies.remove(frequencies.get(0));
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
