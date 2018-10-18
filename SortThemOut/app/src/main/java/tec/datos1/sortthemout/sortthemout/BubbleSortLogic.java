package tec.datos1.sortthemout.sortthemout;

public class BubbleSortLogic {

    public BubbleSortLogic(){

    }

    public static int[] sort(int[] list){
        int n = list.length;
        int temp = 0;
        int attempts = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                //value.setText(list[j-1]);
                //left.setText(list[j-1]);
                //right.setText(list[j]);
                if(list[j-1] > list[j]){
                    //swap elements
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
                attempts++;
                //iterations.setText(attempts);

            }
        }

        return list;
    }
}
