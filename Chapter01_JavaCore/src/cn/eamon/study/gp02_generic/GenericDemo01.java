package cn.eamon.study.gp02_generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eamon
 * @date 2021/6/30  12:49 上午
 */
public class GenericDemo01 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("eamon");
        list1.add("study");
        list1.add("Java");
        loop(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(1);
        list2.add(0);
        loop(list2);
    }

    public static void loop(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
