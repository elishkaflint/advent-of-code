package Day7;

import FileConverter.FileConverter;

import java.util.*;

public class SumOfItsParts {

    private ArrayList<String> instructions;

    public SumOfItsParts(String file) throws Exception {
        this.instructions = (ArrayList<String>) new FileConverter().csvToArrayList(file);
    }

    public List<String[]> getPairs() {
        List<String[]> map = new ArrayList<>();
        for (String row : this.instructions) {
            String[] elements = row.split(" ");
            String[] pairs = new String[2];
            pairs[0] = elements[1];
            pairs[1] = elements[7];
            map.add(pairs);
        }
        return map;
    }

    public ArrayList<String> getStarter(List<String[]> list) {
        ArrayList<String> starters = new ArrayList<>();
        ArrayList<String> letters = new ArrayList<>();
        for(String[] ary: list){
            letters.add(ary[1]);
        }
        for(char alphabet = 'A'; alphabet < 'Z'; alphabet++ ){
            if(!letters.contains(Character.toString(alphabet))){
                starters.add(Character.toString(alphabet));
            }
        }
        Collections.sort(starters);
        return starters;
    }

    public String part1() {
        // not sure what is supposed to happen when there are multiple starters
        return "Part1";
    }

    public String part2() {
        return "Part2";
    }

    public static void main(String[] args) throws Exception {
        SumOfItsParts sum = new SumOfItsParts("day7-input");
        System.out.println(sum.part1());
    }

}
