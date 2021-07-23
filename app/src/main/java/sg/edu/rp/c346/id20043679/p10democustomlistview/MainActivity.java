package sg.edu.rp.c346.id20043679.p10democustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    ArrayList<AndroidVersions> alAndroidVersions;
    ArrayAdapter<AndroidVersions> aaAndroidVersions;
    //CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersions = findViewById(R.id.listViewAndroidVersions);
        alAndroidVersions = new ArrayList<>();

        AndroidVersions av1 = new AndroidVersions("Pie", "9.0");
        AndroidVersions av2 = new AndroidVersions("Oreo", "8.0");
        AndroidVersions av3 = new AndroidVersions("Nougat", "7.0");

        alAndroidVersions.add(av1);
        alAndroidVersions.add(av2);
        alAndroidVersions.add(av3);

        alAndroidVersions.add(new AndroidVersions("Marshmallow", "6.0"));



        aaAndroidVersions = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alAndroidVersions);
        //adapter = new CustomAdapter(this, R.layout.row, alAndroidVersions);
        //lvAndroidVersions.setAdapter(adapter);
        lvAndroidVersions.setAdapter(aaAndroidVersions);

    }
}