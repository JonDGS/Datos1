package tec.datos1.sortthemout.sortthemout;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        int[] list = Converter.StringToArray("4,3,6,2,1");
        BubbleSortLogic tester = new BubbleSortLogic();
        int[] new_list = tester.sort(list);
        System.out.println(Arrays.toString(new_list));

    }

}
