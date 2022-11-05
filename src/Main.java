import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> integerList = new ArrayList<>();
        stringList.add("Почему");
        stringList.add("кони");
        stringList.add("не");
        stringList.add("летают");

        for (String element: stringList){
            integerList.add(element.length());
        }
        System.out.println(integerList);
    }
}