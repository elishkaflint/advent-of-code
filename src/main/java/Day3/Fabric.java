package Day3;

import FileConverter.FileConverter;

import java.util.ArrayList;

public class Fabric {

    private ArrayList<String> claims;

    public Fabric(String file) throws Exception {
        this.claims = (ArrayList<String>) new FileConverter().csvToArrayList(file);
    }

    public int part1() {
        int[][] grid = generateGrid();
        populate(grid);
        return countOverlaps(grid, 1);
    }

    public String part2() {
        int[][] grid = generateGrid();
        populate(grid);
        return findPatch(grid);
    }

    private int[][] generateGrid() {
        return new int[1000][1000];
    }

    private void populate(int[][] grid) {
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

    private int countOverlaps(int[][] matrix, int value) {
        int sum = 0;
        for (int[] row : matrix) {
            for(int square : row) {
                if(square > value){ sum++; }
            }
        }
        return sum;
    }

    private String findPatch(int[][] grid) {
        for (String row : this.claims) {
            Claim claim = new Claim(row);
            int x = claim.getX();
            int y = claim.getY();
            int sum = 0;
            for(int i = x; i < x + claim.getWidth(); i++) {
                for (int j = y; j < y + claim.getHeight(); j++) {
                    if(grid[i][j] == 1) { sum++; }
                }
            }
            int area = claim.getWidth() * claim.getHeight();
            if (sum == area) { return row; };
        }
        return "Try again";
    }

    public static void main (String[] args) throws Exception {
        Fabric fabric = new Fabric("day3-input");
        System.out.println(fabric.part1());
        System.out.println(fabric.part2());
    }

}
