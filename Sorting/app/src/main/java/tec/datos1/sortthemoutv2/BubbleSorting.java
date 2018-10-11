package tec.datos1.sortthemoutv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Random;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BubbleSorting extends AppCompatActivity implements OnClickListener {

    ArrayList<TextView> texts = new ArrayList<>();
    LinkedList values = new LinkedList();
    ArrayList<Integer> nums = new ArrayList<>();
    ArrayList<Integer> nums2 = new ArrayList<>();
    int rnd, compar, cont, act;
    TextView amt, amount;
    Handler bubble = new Handler();
    tec.datos1.sortthemoutv2.Nodo actual, next;
    Boolean checker = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_sorting);
        amt = (TextView) findViewById(R.id.cantidad);
        amt.setTextColor(Color.BLACK);
        amount = (TextView) findViewById(R.id.cant);
        amount.setTextColor(Color.BLACK);
        Button start = (Button) findViewById(R.id.button);
        start.setTextColor(Color.WHITE);
        start.setBackgroundColor(Color.BLACK);
        start.setOnClickListener(this);
        for(int i=1; i<100; i++) {
            nums.add(i);
        }
        for(int j=20; j<=40; j++){
            nums2.add(j);
        }
        values.add(5);
        texts.add((TextView)findViewById(R.id.textView0));
        texts.add((TextView)findViewById(R.id.textView1));
        texts.add((TextView)findViewById(R.id.textView2));
        texts.add((TextView)findViewById(R.id.textView3));
        texts.add((TextView)findViewById(R.id.textView4));
        texts.add((TextView)findViewById(R.id.textView5));
        texts.add((TextView)findViewById(R.id.textView6));
        texts.add((TextView)findViewById(R.id.textView7));
        texts.add((TextView)findViewById(R.id.textView8));
        texts.add((TextView)findViewById(R.id.textView9));
        texts.add((TextView)findViewById(R.id.textView10));
        texts.add((TextView)findViewById(R.id.textView11));
        texts.add((TextView)findViewById(R.id.textView12));
        texts.add((TextView)findViewById(R.id.textView13));
        texts.add((TextView)findViewById(R.id.textView14));
        texts.add((TextView)findViewById(R.id.textView15));
        texts.add((TextView)findViewById(R.id.textView16));
        texts.add((TextView)findViewById(R.id.textView17));
        texts.add((TextView)findViewById(R.id.textView18));
        texts.add((TextView)findViewById(R.id.textView19));
        texts.add((TextView)findViewById(R.id.textView20));
        texts.add((TextView)findViewById(R.id.textView21));
        texts.add((TextView)findViewById(R.id.textView22));
        texts.add((TextView)findViewById(R.id.textView23));
        texts.add((TextView)findViewById(R.id.textView24));
        texts.add((TextView)findViewById(R.id.textView25));
        texts.add((TextView)findViewById(R.id.textView26));
        texts.add((TextView)findViewById(R.id.textView27));
        texts.add((TextView)findViewById(R.id.textView28));
        texts.add((TextView)findViewById(R.id.textView29));
        texts.add((TextView)findViewById(R.id.textView30));
        texts.add((TextView)findViewById(R.id.textView31));
        texts.add((TextView)findViewById(R.id.textView32));
        texts.add((TextView)findViewById(R.id.textView33));
        texts.add((TextView)findViewById(R.id.textView34));
        texts.add((TextView)findViewById(R.id.textView35));
        texts.add((TextView)findViewById(R.id.textView36));
        texts.add((TextView)findViewById(R.id.textView37));
        texts.add((TextView)findViewById(R.id.textView38));
        texts.add((TextView)findViewById(R.id.textView39));
        for(int i=0; i<texts.size(); i++){
            texts.get(i).setTextColor(Color.BLACK);
        }
    }
    public void generate(){
        Random random = new Random();
        int select = random.nextInt(nums2.size());
        int num = nums2.get(select);
        for(int x=0; x<num; x++) {
            int select1 = random.nextInt(nums.size());
            rnd = nums.get(select1);
            values.add(rnd);
        }
    }
    public  void bubbleSort(final LinkedList list) {
        bubble.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(cont != 1){
                    if(act > 0) {
                        texts.get(act - 1).setTextColor(Color.BLACK);
                    }
                    if (actual.getDato() > next.getDato()) {
                        int temp = actual.getDato();
                        actual.setDato(next.getDato());
                        next.setDato(temp);
                    }
                    texts.get(act).setTextColor(Color.BLUE);
                    texts.get(act+1).setTextColor(Color.BLUE);
                    for(int i = 0; i< values.getLarge(); i++){
                        texts.get(i).setText(String.valueOf(values.getNodo(i)));
                    }
                    actual = next;
                    act ++;
                    next = next.getNext();
                    if(act == cont - 1) {
                        texts.get(act - 1).setTextColor(Color.BLACK);
                        texts.get(act).setTextColor(Color.BLACK);
                        cont--;
                        actual = list.getHead();
                        next = list.getHead().getNext();
                        act = 0;
                    }
                    compar ++;
                    amt.setText(String.valueOf(compar));
                    bubbleSort(values);
                }else{
                    checker = true;
                }
            }
        }, 500);
    }

    @Override
    public void onClick(View v) {
        if(checker == true) {
            checker = false;
            values.deleteAll();
            for (int j = 0; j < 40; j++) {
                texts.get(j).setText("");
            }
            compar = 0;
            amt.setText("");
            generate();
            for (int i = 0; i < values.getLarge(); i++) {
                texts.get(i).setText(String.valueOf(values.getNodo(i)));
            }
            cont = values.getLarge();
            actual = values.getHead();
            next = values.getHead().getNext();
            act = 0;
            bubbleSort(values);
        }else{
            Toast.makeText(this, "Se está ejecutando el proceso en este momento, por favor espere a que termine.", Toast.LENGTH_SHORT).show();
        }
    }
}
