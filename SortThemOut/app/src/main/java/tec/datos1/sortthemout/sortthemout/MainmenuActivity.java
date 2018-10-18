package tec.datos1.sortthemout.sortthemout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainmenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        Button addValue = (Button) findViewById(R.id.addValue);
        addValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText value = (EditText) findViewById(R.id.value);
                TextView list = (TextView) findViewById(R.id.list);
                if(!value.getText().toString().equals("")){
                    String currentValue = value.getText().toString();
                    String result = list.getText().toString();
                    if(!result.equals("")) {
                        result += ',' + currentValue;
                        list.setText(result);
                        value.setText("");
                    }else{
                        result = currentValue;
                        list.setText(result);
                        value.setText("");
                    }
                }
            }
        });
        Button goToBubble = (Button) findViewById(R.id.goToBubble);
        goToBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView list = (TextView) findViewById(R.id.list);
                Intent bubbleSort = new Intent(getApplicationContext(), BubbleSort.class );
                bubbleSort.putExtra("list", list.getText().toString());
                startActivity(bubbleSort);
            }
        });
        Button goToInsertion = (Button) findViewById(R.id.goToInsertion);
        goToInsertion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView list = (TextView) findViewById(R.id.list);
                Intent InsertionSort = new Intent(getApplicationContext(), InsertionSort.class );
                InsertionSort.putExtra("list", list.getText().toString());
                startActivity(InsertionSort);
            }
        });
        Button clearList = (Button) findViewById(R.id.clearList);
        clearList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView list = (TextView) findViewById(R.id.list);
                list.setText("");
            }
        });
    }
}
