package DayThree;

import FileConverter.FileConverter;

import java.util.ArrayList;
import java.util.List;

public class Fabric {

    private ArrayList<String> claims;

    public Fabric(String file) throws Exception {
        this.claims = (ArrayList<String>) new FileConverter().csvToArrayList(file);
    }

    public int getMaxX() {
        int maxX = 0;
        for (String line : this.claims) {
            Claim claim = new Claim(line);
            int x = claim.getX() + claim.getWidth();
            if( x > maxX ){ maxX = x; }
        }
        return maxX;
    }

    public int getMaxY() {
        int maxY = 0;
        for (String line : this.claims) {
            Claim claim = new Claim(line);
            int y = claim.getY() + claim.getHeight();
            if( y > maxY ){ maxY = y; }
        }
        return maxY;
    }

    public List<List<Integer>> generateMatrix() {
        List<List<Integer>> rows = new ArrayList<>();
        for(int i = 0; i < getMaxY(); i++) {
            List<Integer> columns = new ArrayList<>();
            for(int j = 0; j < getMaxX(); j++) {
                columns.add(j, 0);
            }
            rows.add(i, columns);
        }
        return rows;
    }

    public void populateMatrix() {

    }

    public int calculate() {
        // count frequency of any number >= 2



        List<ArrayList<Integer>> map = new ArrayList<>();
        return 1;
    }

    public static void main (String[] args) throws Exception {
        Fabric fabric = new Fabric("claims-inputs.csv");
        System.out.println(fabric.getMaxX());
        System.out.println(fabric.getMaxY());
        System.out.println(fabric.generateMatrix());
    }

}
