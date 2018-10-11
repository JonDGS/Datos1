package tec.datos1.sortthemoutv2;

import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InsertionSorting extends AppCompatActivity {

    private int large = 40;
    private TextView[] txtnum;
    private int [] array = new int[large];
    private Handler handler = new Handler();
    int loop = 0,n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_insertion_sorting);


        txtnum = new TextView[large];
        txtnum[0] = (TextView)findViewById(R.id.txtnum1);
        txtnum[1] = (TextView)findViewById(R.id.txtnum2);
        txtnum[2] = (TextView)findViewById(R.id.txtnum3);
        txtnum[3] = (TextView)findViewById(R.id.txtnum4);
        txtnum[4] = (TextView)findViewById(R.id.txtnum5);
        txtnum[5] = (TextView)findViewById(R.id.txtnum6);
        txtnum[6] = (TextView)findViewById(R.id.txtnum7);
        txtnum[7] = (TextView)findViewById(R.id.txtnum8);
        txtnum[8] = (TextView)findViewById(R.id.txtnum9);
        txtnum[9] = (TextView)findViewById(R.id.txtnum10);
        txtnum[10] = (TextView)findViewById(R.id.txtnum11);
        txtnum[11] = (TextView)findViewById(R.id.txtnum12);
        txtnum[12] = (TextView)findViewById(R.id.txtnum13);
        txtnum[13] = (TextView)findViewById(R.id.txtnum14);
        txtnum[14] = (TextView)findViewById(R.id.txtnum15);
        txtnum[15] = (TextView)findViewById(R.id.txtnum16);
        txtnum[16] = (TextView)findViewById(R.id.txtnum17);
        txtnum[17] = (TextView)findViewById(R.id.txtnum18);
        txtnum[18] = (TextView)findViewById(R.id.txtnum19);
        txtnum[19] = (TextView)findViewById(R.id.txtnum20);
        txtnum[20] = (TextView)findViewById(R.id.txtnum21);
        txtnum[21] = (TextView)findViewById(R.id.txtnum22);
        txtnum[22] = (TextView)findViewById(R.id.txtnum23);
        txtnum[23] = (TextView)findViewById(R.id.txtnum24);
        txtnum[24] = (TextView)findViewById(R.id.txtnum25);
        txtnum[25] = (TextView)findViewById(R.id.txtnum26);
        txtnum[26] = (TextView)findViewById(R.id.txtnum27);
        txtnum[27] = (TextView)findViewById(R.id.txtnum28);
        txtnum[28] = (TextView)findViewById(R.id.txtnum29);
        txtnum[29] = (TextView)findViewById(R.id.txtnum30);
        txtnum[30] = (TextView)findViewById(R.id.txtnum31);
        txtnum[31] = (TextView)findViewById(R.id.txtnum32);
        txtnum[32] = (TextView)findViewById(R.id.txtnum33);
        txtnum[33] = (TextView)findViewById(R.id.txtnum34);
        txtnum[34] = (TextView)findViewById(R.id.txtnum35);
        txtnum[35] = (TextView)findViewById(R.id.txtnum36);
        txtnum[36] = (TextView)findViewById(R.id.txtnum37);
        txtnum[37] = (TextView)findViewById(R.id.txtnum38);
        txtnum[38] = (TextView)findViewById(R.id.txtnum39);
        txtnum[39] = (TextView)findViewById(R.id.txtnum40);

        for(int i = 0; i < large; i++) {
            array[i] = (int)(Math.floor(Math.random()*101));
        }

        for(int i = 0; i < array.length; i++){
            txtnum[i].setText(String.valueOf(array[i]));
        }

        ((TextView)findViewById(R.id.isort)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertionSort();
            }
        });
    }

    public void insertionSort(){
        animateInsertionSort(1);
    }

    public void animateInsertionSort(final int m){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(m != n){
                    String temp = txtnum[m].getText().toString();
                    for(int k = m; k > n; k--){
                        txtnum[k].setText(txtnum[k-1].getText().toString());
                    }
                    txtnum[n].setText(temp);
                }
                txtnum[m].setBackgroundResource(R.drawable.circle_green);
                txtnum[n].setBackgroundResource(R.drawable.circle_green);

                int i= m + 1;
                if(i < array.length){

                    animateInsertionSort(i);
                }

            }
        },1000);

        txtnum[m].setBackgroundResource(R.drawable.circle_red);

        n = findInsertMin(m);

        txtnum[n].setBackgroundResource(R.drawable.circle_red);
    }

    int findInsertMin(int min){
        int mi = min;
        for(int k = 0; k <= mi; k++){
            if(Integer.valueOf(txtnum[k].getText().toString())>Integer.valueOf(txtnum[mi].getText().toString())){
                mi = k;
            }

        }
        return mi;
    }
}