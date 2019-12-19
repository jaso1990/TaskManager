
import java.util.ArrayList;
import java.util.ListIterator;


public class SampleIterator {

    public static void main(String[] args) {
        ArrayList <String> x = new ArrayList();
        ListIterator li = x.listIterator();
        li.add("a");
        li.add("b");
        li.add("c");
        li.previous();
        li.previous();
        li.previous();      
        showList(x, li);
        
        System.out.println("Move 1: travelling next over " + li.next());
        showList(x, li);
        
        System.out.println("Move 2: travelling next over " + li.next());
        showList(x, li);
        
        System.out.println("Move 3: Removing last thing travelled over");
        li.remove();
        showList(x, li);
        
        System.out.println("Move 4: Adding B to left of iterator");
        li.add("b");
        showList(x, li);
        
        System.out.println("Move 5: travelling next over " + li.next());
        showList(x, li);
        
        System.out.println("Move 6: Travelling backwards over " + li.previous());
        showList(x, li);
        
        System.out.println("Move 7: Removing last thing travelled over");
        li.remove();
        showList(x, li);
        
        System.out.println("Move 8: Travelling backwards over " + li.previous());
        showList(x, li);
        
        System.out.println("Move 9: Modifying last thing travelled over: B to E");
        li.set("e");
        
        System.out.println("Move 10 & 11: Adding b and c to left of iterator");
        li.add("b");
        li.add("c");
        showList(x, li);
        
        System.out.println("Move 12: Will Cause Erorr, can't remove unless next of previous");
        try{
            li.remove();
        }catch (Exception e){
            System.out.println(e);
        }
        
        System.out.println("Move 13: travelling next over " + li.next());
        showList(x, li);
        
        System.out.println("Move 14: Will Cause Erorr, can't go next if at the end of list");
        try{
            li.next();
        }catch (Exception e){
            System.out.println(e);
        }
        
        System.out.println("Bonus Move: Travel with Iterator to front of list");
        while (li.hasPrevious())
            li.previous();
        showList(x, li);
    }
    
    public static void showList(ArrayList list, ListIterator it){
        for (int i = 0; i < list.size(); i++) {
            if (it.hasPrevious()== false &&  i ==0)
                System.out.print("*|");
           
            System.out.print(list.get(i)+ "|");
            if (i == it.previousIndex())
                System.out.print("*|");
             
        }
        System.out.println("\n=========================");
    }
    
}
