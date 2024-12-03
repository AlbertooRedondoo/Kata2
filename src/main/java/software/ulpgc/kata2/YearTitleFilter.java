package software.ulpgc.kata2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class YearTitleFilter implements TitleFilter{
    List<Title> titleList = new ArrayList<>();

    public YearTitleFilter(List<Title> titleList) {
        this.titleList = titleList;
    }

    @Override
    public HashMap<Integer, Integer> filter() {
        HashMap<Integer, Integer> years = new HashMap<>();
        for (Title title : titleList){
            int year = title.getYear();
            years.put(year, years.getOrDefault(year,0) + 1);
            years.remove(0);
        }
        return years;
    }
}
