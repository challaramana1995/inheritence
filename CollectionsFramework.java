package package1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsFramework {

	public static void main(String[] args) {
    List<String>list = new ArrayList<String>();
    //List<String>list2 = new LinkedList<String>();
   // List<String>list3 = new  Vector<String>();
   // Set<String>listSet = new HashSet<String>();
   // Set<String>listSet2 = new TreeSet<String>();
    System.out.println(list.isEmpty());
    System.err.println(list.size());
    list.add("UFT");
    list.add("QTP");
    list.add("SELENIUM");
    list.add("APPIUM");
    list.add("QTP");
   System.out.println(list.isEmpty());
   System.err.println(list.size());
   System.out.println(list);
   list.remove("UFT");
   System.err.println(list.contains("UFT"));
   list.clear();
   System.err.println(list);
    
	}
}
