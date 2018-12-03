package DayThree;

import FileConverter.FileConverter;

import java.util.ArrayList;

public class Fabric {

    private ArrayList<String> claims;

    public Fabric(String file) throws Exception {
        this.claims = (ArrayList<String>) new FileConverter().csvToArrayList(file);
    }

    public int calculate() throws Exception {
        return 1;
    }

}
