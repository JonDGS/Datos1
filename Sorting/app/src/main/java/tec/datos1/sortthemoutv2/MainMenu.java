package tec.datos1.sortthemoutv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button goToBubble = (Button) findViewById(R.id.goToBubble);
        goToBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bubbleSort = new Intent(getApplicationContext(), BubbleSorting.class);
                startActivity(bubbleSort);
            }
        });
        Button goToInsertion = (Button) findViewById(R.id.goToInsertion);
        goToBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertionSort = new Intent(getApplicationContext(), InsertionSorting.class);
                startActivity(insertionSort);
            }
        });

    }
}
