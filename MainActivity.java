package sg.edu.np.mad.week4recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> myList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i =0; i<100; i++){
            myList.add("Hello: " + String.valueOf(i));
        }
/*
        myList.add("Samsung");
        myList.add("LG");
        myList.add("Sony");
        myList.add("Apple");
*/
        RecyclerView recycleview = findViewById(R.id.recyclerview);
        sg.edu.np.mad.week4recyclerview.BrandAdapter adapter = new sg.edu.np.mad.week4recyclerview.BrandAdapter(myList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recycleview.setLayoutManager(mLayoutManager);
        recycleview.setAdapter(adapter);
    }
}