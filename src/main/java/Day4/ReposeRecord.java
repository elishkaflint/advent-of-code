package Day4;

import FileConverter.FileConverter;

import java.util.ArrayList;
import java.util.Collections;

public class ReposeRecord {

    private ArrayList<String> records;

    public ReposeRecord(String file) throws Exception {
        this.records = (ArrayList<String>) new FileConverter().csvToArrayList(file);
    }

    public void sortChronologically() {
        Collections.sort(this.records);

    }

    public int part1() {
        return 1;
    }

    public static void main(String[] args) throws Exception {
        ReposeRecord reposeRecord = new ReposeRecord("day4-input");
        reposeRecord.sortChronologically();
        for( String record : reposeRecord.records ) {
            System.out.println(record);
        }
        int calc = reposeRecord.part1();
        System.out.println(calc);
    }

}
