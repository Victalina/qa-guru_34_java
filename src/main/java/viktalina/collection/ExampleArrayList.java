package viktalina.collection;

import java.util.ArrayList;
import java.util.List;

public class ExampleArrayList {

   public static List<String> lString = new ArrayList();

    public static void addToListOfString(List<String> list, String string) {
      list.add(string);
    }

    public static void searchFromListOfString(String search, List<String> fromSearch) {
    for (String j:fromSearch){
      if (j.equals(search)) {
        System.out.println("The element " + search + " is found");
        break;
      }
    }
  }
  public static void removeFromListOfString(String search, List<String> fromSearch) {
        fromSearch.remove(search);
  }

    public static void main (String[] args){
      addToListOfString(lString, "String1");
      addToListOfString(lString, "String2");
      addToListOfString(lString, "String3");
      addToListOfString(lString, "String4");
      System.out.println(lString);
      searchFromListOfString("String1", lString);
      removeFromListOfString("String2",lString);
      System.out.println(lString);

    }
  }

