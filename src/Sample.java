
import java.util.ArrayList;


public class Sample {

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList();
        
        list.add("a");
        list.add("b");
        list.add(1, "c");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        list.set(1, "e");
        
        for (String lett : list) {
            System.out.println(lett);    
        }
        
        list.add("f"); //will add to end
        list.remove(2); //gets rid of item at loc 2 (b)
        
        for (String lett : list) {
            System.out.println(lett);    
        }
        
    }
    
}
