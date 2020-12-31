import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String args[]){
//        String[]  stringArray  =  new String[10];
//        stringArray[0] = "delhi";
//        System.out.println(stringArray[0]);


//        Array List

        ArrayList<String> heroes = new ArrayList<String>();

        heroes.add("Hulk");
        heroes.add("iron man");
        heroes.add("thor");
        heroes.add("batman");
        heroes.add(0,"captain america");
        heroes.remove(0);

        System.out.println("my super hero is: " + heroes.get(0));




    }

}
