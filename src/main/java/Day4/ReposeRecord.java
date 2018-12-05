package Day4;

import FileConverter.FileConverter;

import java.util.*;

public class ReposeRecord {

    private ArrayList<String> records;

    public ReposeRecord(String file) throws Exception {
        this.records = (ArrayList<String>) new FileConverter().csvToArrayList(file);
    }

    public int part1() {
        sortChronologically();
        int maxSleeper = getMaxSleeper(getSleeperTimes());
        int maxTime = getMaxTime(maxSleeper);
        return maxSleeper * maxTime;
    }

    public void sortChronologically() {
        Collections.sort(this.records);
    }

    public Map<Integer, Integer> getSleeperTimes() {
        int guard = 0;
        int start = 0;
        Map<Integer, Integer> sleeperTimes = new HashMap<>();
        for (String record : this.records) {
            String[] recordElements = record.split("[^\\d]+");
            if(record.contains("#")){
                guard = Integer.parseInt(recordElements[6]);
                if(!sleeperTimes.containsKey(guard)) {
                    sleeperTimes.put(guard, 0);
                }
            }
            if(record.contains("asleep")){
                start = Integer.parseInt(recordElements[5]);
            }
            if(record.contains("up")){
                int sleepTime = Integer.parseInt(recordElements[5]) - start;
                sleeperTimes.put(guard, sleepTime);
            }
        }
        return sleeperTimes;
    }

    public int getMaxTime(int guard) {
       return 1;
    }

    public int getMaxSleeper(Map<Integer, Integer> sleeperTimes) {
        Map.Entry<Integer, Integer> maxSleeper = null;
        for (Map.Entry<Integer, Integer> sleeper : sleeperTimes.entrySet()) {
            if(maxSleeper == null
                || sleeper.getValue().compareTo(maxSleeper.getValue()) > 0) {
                maxSleeper = sleeper;
            }
        }
        return maxSleeper.getValue();
    }

    public static void main(String[] args) throws Exception {
        ReposeRecord reposeRecord = new ReposeRecord("day4-input");
        int calc = reposeRecord.part1();
        System.out.println(calc);

//        reposeRecord.sortChronologically();
//        for( String record : reposeRecord.records ) {
//            System.out.println(record);
//        }
//        reposeRecord.getSleeperTimes();
    }

}
