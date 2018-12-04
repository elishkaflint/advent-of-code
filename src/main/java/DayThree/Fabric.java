package DayThree;

import FileConverter.FileConverter;

import java.util.ArrayList;

public class Fabric {

    private ArrayList<String> claims;

    public Fabric(String file) throws Exception {
        this.claims = (ArrayList<String>) new FileConverter().csvToArrayList(file);
    }

    public int calculate() {
        int[][] grid = generateGrid();
        populateGrid(grid);
        return count(grid);
    }

    private int[][] generateGrid() {
        return new int[1000][1000];
    }

    private void populateGrid(int[][] grid) {
        for (String row : this.claims) {
            Claim claim = new Claim(row);
            int x = claim.getX();
            int y = claim.getY();
            for(int i = x; i < x + claim.getWidth(); i++) {
                for (int j = y; j < y + claim.getHeight(); j++) {
                    grid[i][j] += 1;
                }
            }
        }
    }

    private int count(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for(int square : row) {
                if(square > 1){ sum++; }
            }
        }
        return sum;
    }

    public static void main (String[] args) throws Exception {
        Fabric fabric = new Fabric("claims-inputs.csv");
        System.out.println(fabric.calculate());
    }

}
