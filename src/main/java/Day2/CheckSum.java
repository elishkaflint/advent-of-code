package Day2;

import FileConverter.FileConverter;

import java.util.*;

public class CheckSum {

    private ArrayList<String> codes;

    public CheckSum(String file) throws Exception {
        this.codes = (ArrayList<String>) new FileConverter().csvToArrayList(file);
    }

    public int generate() throws Exception {
        int twoLetters = 0;
        int threeLetters = 0;

        for (String code : this.codes) {
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
        for (String code : this.codes) {
            for(int i = 0; i < this.codes.size(); i++) {
                if(compare(code, this.codes.get(i))) { return result(code, this.codes.get(i)); }
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

    public static void main(String[] args) throws Exception {
        CheckSum checkSum = new CheckSum("day2-input");
        int checkSumCalc = checkSum.generate();
        System.out.println("CheckSum is: " + checkSumCalc);
        String resultCalc = checkSum.findCommonLetters();
        System.out.println("BoxNumber is: " + resultCalc);
    }

}
