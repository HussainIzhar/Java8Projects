package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exp01 {
	public static void main(String[] args )
    {
       ArrayList<String> l =new ArrayList<>();
       l.add("Hello");
       l.add("World");
       List<String> l1 =l.stream().filter(s -> s.equals("Hello")).collect(Collectors.toList());
       System.out.println(l);
       System.out.println(l1);
    }

}
