package DayTwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CheckSum {

    private String file;

    public CheckSum(String file) {
        this.file = file;
    }

    public int generate() throws Exception {

        int twoLetters = 0;
        int threeLetters = 0;

        List<String> codes = csvToArrayList();

        for (String code : codes) {

            String[] digits = code.split("");
            Set<String> uniqueDigits = new HashSet<>(Arrays.asList(digits));
            List<Integer> counts = new ArrayList<>();

            for (String uniqueDigit : uniqueDigits) {
                int count = Collections.frequency(Arrays.asList(digits), uniqueDigit);
                counts.add(count);
            }

            if ((Collections.frequency(counts, 2)) >= 1) { twoLetters++; }
            if ((Collections.frequency(counts, 3)) >= 1) { threeLetters++; }
        }

        return twoLetters * threeLetters;
    }

    private List<String> csvToArrayList() throws IOException {
        List<String> codes = new ArrayList<String>();

        String fileIn = this.file;
        String line = null;

        FileReader fileReader = new FileReader(fileIn);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            codes.add(line);
        }

        bufferedReader.close();

        return codes;
    }

    public static void main(String[] args) throws Exception {
        CheckSum checkSum = new CheckSum("checkSum-inputs.csv");
        int calc = checkSum.generate();
        System.out.println("CheckSum is: " + calc);
    }

}
