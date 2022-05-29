package text_5_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class jihebianli {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<String>();
        s.add("java");
        s.add("words");
        s.add("kaixin");
        System.out.println("普通遍历");
        for(int i=0;i<s.size();i++)
        {
            String s1=s.get(i);
            System.out.println(s1);
        }
        System.out.println("迭代器遍历");
        Iterator<String> list=s.iterator();
        while (list.hasNext()){
            String s1=list.next();
            System.out.println(s1);
        }
        System.out.println("增强for遍历");
        for(String s1: s){
            System.out.println(s1);
        }

    }
}
