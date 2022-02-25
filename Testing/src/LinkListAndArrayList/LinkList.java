package LinkListAndArrayList;

import java.util.LinkedList;

class LinkList {
  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<String>();
    names.add("Brian");
    names.add("Ayman");
    System.out.println(names);
    
    names.add(1, "Kathy");
    System.out.println(names);
    //add in first index
    
    names.add(3, "Kathy");
    
    System.out.println(names.poll());
    System.out.println(names);
    
    
    names.pop();
    System.out.println(names);
    
    names.push("Brain");
    System.out.println(names);
    
    System.out.println(names.size());
  }
}