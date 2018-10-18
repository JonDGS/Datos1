package tec.datos1.sortthemout.sortthemout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class BubbleSort extends AppCompatActivity {

    TextView unSortedList;
    TextView value;
    TextView left;
    TextView right;
    TextView nIterations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_sort);
        if(getIntent().hasExtra("list")){
            unSortedList = findViewById(R.id.unSortedList_B);
            value = findViewById(R.id.valueSorting_B);
            left = findViewById(R.id.leftValue_B);
            right = findViewById(R.id.rightValue_B);
            nIterations = findViewById(R.id.nIterations_B);
            int[] list = Converter.StringToArray(unSortedList.getText().toString());
            int[] unsortedList = list;
            int[] sortedList = sort(unsortedList);
            unSortedList.setText(Converter.ArrayToString(sortedList));
        }else{
            unSortedList = findViewById(R.id.unSortedList_B);
            unSortedList.setText("No llego");
        }
    }

    private int[] sort(int[] list){
        int n = list.length;
        int temp = 0;
        int attempts = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                value.setText(list[j-1]);
                left.setText(list[j-1]);
                right.setText(list[j]);
                if(list[j-1] > list[j]){
                    //swap elements
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
                attempts++;
                nIterations.setText(attempts);

            }
        }

        return list;
    }
}
