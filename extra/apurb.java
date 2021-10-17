import java.util.*;
import java.lang.Math;

class apurb{
public static void main(String[] args){
Map<Integer, Float> m = new HashMap<>();

for(int i=10; i>1; i--)
	m.put(i, ((float)Math.random()*100));

System.out.print("Original HashMap : " + m); 
}
}