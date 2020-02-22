package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exp02 {
	public static void main(String[] args )
    {
       ArrayList<String> l =new ArrayList<>();
       l.add("Hello");
       l.add("World");
       System.out.println(l);
       List<String> l1 =l.stream().map(s -> s+"Java8").collect(Collectors.toList());
       System.out.println(l1);
       
    }
}
