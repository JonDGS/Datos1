package tec.datos1.sortthemout.sortthemout;

public class InsertionSortLogic {
    public InsertionSortLogic(){



    }

    public static int[] sort(int[] list) {
        int n = list.length;
        int attempts = 0;
        for (int i=1; i<n; ++i) {
            int key = list[i];
            int j = i-1;
            while (j>=0 && list[j] > key)
            {
                list[j+1] = list[j];
                j = j-1;
            }
            list[j+1] = key;
            attempts++;
        }
        return list;
    }


}
