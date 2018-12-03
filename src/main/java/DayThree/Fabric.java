package DayThree;

import FileConverter.FileConverter;

import java.util.ArrayList;
import java.util.List;

public class Fabric {

    private ArrayList<String> claims;

    public Fabric(String file) throws Exception {
        this.claims = (ArrayList<String>) new FileConverter().csvToArrayList(file);
    }

    public int calculate() {

        List<ArrayList<Integer>> map = new ArrayList<>();

        return 1;

    }

}
