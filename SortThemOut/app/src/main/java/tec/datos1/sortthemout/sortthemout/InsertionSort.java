package tec.datos1.sortthemout.sortthemout;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Arrays;

public class InsertionSort extends AppCompatActivity {

    TextView unsortedList;
    TextView left;
    TextView right;
    TextView nIterations;
    TextView needSwap;
    Handler Sorter = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertion_sort);
        if(getIntent().hasExtra("list")){
            unsortedList = (TextView) findViewById(R.id.unsortedList_I);
            right = findViewById(R.id.leftValue_I);
            left = findViewById(R.id.rightValue_I);
            needSwap = findViewById(R.id.needSwap);
            nIterations = findViewById(R.id.nIterations_I);
            int[] sortedList;
            sortedList = sort(Converter.StringToArray(getIntent().getExtras().getString("list")));
            unsortedList.setText((Arrays.toString(sortedList)));
        }else{
            TextView list = (TextView) findViewById(R.id.unsortedList_I);
            list.setText("No llego");
        }
    }

    public int[] sort(int[] list) {
        int n = list.length;
        int attempts = 0;
            for (int i=1; i<n; ++i) {
                int key = list[i];
                int j = i-1;
                left.setText(String.valueOf(list[i-1]));
                right.setText(String.valueOf(list[i]));
                while (j>=0 && list[j] > key)
                {
                    list[j+1] = list[j];
                    j = j-1;
                    needSwap.setText("Yes");

                }
                needSwap.setText("No");
                list[j+1] = key;

                attempts++;
                nIterations.setText(String.valueOf(attempts));

            }
        return list;
    }
}
