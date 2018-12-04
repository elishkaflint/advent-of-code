package DayFour;

import FileConverter.FileConverter;

import java.util.ArrayList;

public class ReposeRecord {

    private ArrayList<String> records;

    public ReposeRecord(String file) throws Exception {
        this.records = (ArrayList<String>) new FileConverter().csvToArrayList(file);
    }

    public int part1() {
        return 1;
    }

}
