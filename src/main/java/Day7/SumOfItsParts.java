package Day7;

import FileConverter.FileConverter;

import java.util.ArrayList;

public class SumOfItsParts {

    private ArrayList<String> instructions;

    public SumOfItsParts(String file) throws Exception {
        this.instructions = (ArrayList<String>) new FileConverter().csvToArrayList(file);
    }

    public String part1() {
       return "Part1";
    }

    public String part2() {
        return "Part2";
    }

    public static void main(String[] args) throws Exception {
        SumOfItsParts sum = new SumOfItsParts("day7-input");
        System.out.println(sum.part1());
        System.out.println(sum.part2());
    }

}
