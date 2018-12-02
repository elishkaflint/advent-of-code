package FileConverter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileConverter {

    public List<String> csvToArrayList(String file) throws IOException {
        List<String> arrayList = new ArrayList<>();

        String fileIn = file;
        String line = null;

        FileReader fileReader = new FileReader(fileIn);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            arrayList.add(line);
        }

        bufferedReader.close();

        return arrayList;
    }


}
