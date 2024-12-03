import software.ulpgc.kata2.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/alber/desktop/title.basics.tsv");
        TitleDeserializer deserializer = new TsvTitleDeserializer();
        TitleLoader loader = new FileTitleLoader(file,deserializer);
        List<Title> titleList = loader.load();
        TitleFilter filter = new YearTitleFilter(titleList);
        for (Title title: titleList){
            System.out.println(title);
        }
        System.out.println(filter.filter());
    }
}