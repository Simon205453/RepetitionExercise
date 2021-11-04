import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistBuilder {

    private ArrayList<Integer> arrlist = new ArrayList<Integer>();

    public ArrayList<Integer> buildarrlist(){
        for (int i = 0; i < 100; i++) {
            arrlist.add(i);
        }
        return arrlist;
    }

    public ArrayList<Integer> rebuildArrlist(ArrayList arrayList){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hvilken talrække skal fjernes? type an integer");
        int userChosenNum = scan.nextInt()-1;
        int arrSize = arrayList.size();
        for (int i = 0; i < arrSize; i++) {
            if (i%userChosenNum==0){
                arrayList.remove(i);
                arrSize--;
            }
        }
        System.out.println(arrayList);
        return arrayList;
    }

}
