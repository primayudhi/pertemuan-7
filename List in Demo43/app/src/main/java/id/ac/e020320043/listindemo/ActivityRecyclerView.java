package id.ac.e020320043.listindemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityRecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Activity Recycler View");
        setContentView(R.layout.activity_recycler_view);
        getIntent();
    }
}