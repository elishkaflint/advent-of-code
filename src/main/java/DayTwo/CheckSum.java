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

    public String findCommonLetters() throws Exception {
        List<String> codes = csvToArrayList();
        for (String code : codes) {
            for(int i = 0; i < codes.size(); i++) {
                if(compare(code, codes.get(i))) { return result(code, codes.get(i)); }
            }
        }
        return "This didn't work";
    }

    private Boolean compare(String current, String next) {
        int count = 0;
        String[] currentLetters = current.split("");
        String[] nextLetters = next.split("");
        for (int i = 0; i < currentLetters.length; i++) {
            if(currentLetters[i].equals(nextLetters[i])) { count++; }
        }
        return count == (currentLetters.length - 1);
    }

    private String result(String current, String next) {
        String[] currentLetters = current.split("");
        String[] nextLetters = next.split("");
        String result = "";
        for (int i = 0; i < currentLetters.length; i++) {
            if(currentLetters[i].equals(nextLetters[i])) { result += currentLetters[i]; }
        }
        return result;
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

        int checkSumCalc = checkSum.generate();
        System.out.println("CheckSum is: " + checkSumCalc);

        String resultCalc = checkSum.findCommonLetters();
        System.out.println("BoxNumber is: " + resultCalc);

    }

}
