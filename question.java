import java.lang.Math; // headers MUST be above the first class
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


// one class needs to have a main() method
public class HelloWorld
{

  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {

    List<Integer> list = new ArrayList<Integer>();
    list.add(12);
    list.add(9);
    list.add(15);
    list.add(8);
    list.add(3);

    System.out.println("ORIGINAL LIST:");
    for(Integer i : list) {
      System.out.println(i);
    }

    //Run method removeBigNUmbers
    List<Integer> newList = removeBigNumbers(list);

	System.out.println("\nNEW LIST:");
    for(Integer y : newList) {
      System.out.println(y);
    }
  }

  public static List<Integer> removeBigNumbers(List<Integer> data) {
    for (Iterator<Integer> iterator = data.iterator(); iterator.hasNext(); ) {
      int i = iterator.next();
      if (i > 10) {
        iterator.remove();
      }
    }
    return data;
  }

}
