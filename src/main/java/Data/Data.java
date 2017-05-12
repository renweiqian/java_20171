package Data;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 * Created by 任纹乾 on
 * 2017/5/11.
 */
public class Data {
    private static final String[] fileNames = {
            "dongcheng",
            "xicheng",
            "chaoyang",
            "haidian",
            "fengtai",
            "shijingshan",
            "tongzhou",
            "changping",
            "daxing",
            "yizhuangkaifaqu",
            "shunyi",
            "fangshan",
            "mentougou",
            "pinggu",
            "huairou",
            "miyun",
            "yanqing",
            "yanjiao"
    };
    private static final String PATH = "data/bj/";

    public static void main(String[] args) {
        for (String fileName : fileNames) {
            Set<String> set = new HashSet<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(PATH.concat(fileName)))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    set.add(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println(fileName + " is not exist.");
            } catch (IOException e) {
                e.printStackTrace();
            }
            List<Double> list = new ArrayList<>();
            for (String s : set) {
                String[] strings = s.split("@");
                list.add(Double.parseDouble(strings[strings.length - 2]));
            }
            Collections.sort(list);
            System.out.println("min: " + list.get(0));
            System.out.println("max: " + list.get(list.size() - 1));
//        System.out.println("avg: " + set.size());
            System.out.println("---");
        }
    }
}
