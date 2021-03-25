package pinna.tp1.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> planetes;
    ListView listView;
    PlaneteAdapter adapter;
    Data data = new Data();
    Button checkBtn;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);

        Data data = new Data();
        PlaneteAdapter adapter = new PlaneteAdapter(this);
        listView.setAdapter(adapter);

        checkBtn = findViewById(R.id.button);
        checkBtn.setEnabled(false);
/*
        checkBtn.setOnClickListener((view) → {
            int score = 0;
            String[] taillesPlanetes = data.getTaillePlanetes();
            int a;
            for (a = 0; a < taillesPlanetes.length; a++){
                View vw = listView.getChildAt(a);
                spinner = vw.findViewById(R.id.spinner);
                if(spinner.getSelectedItem().toString().equals(taillesPlanetes[i])){
                    score += 1;
                }
            }
            Toast.makeText(MainActivity.this, "Score: "+score+"/"+taillesPlanetes.length, Toast.LENGTH_LONG.show();
        });
        */

    }


}