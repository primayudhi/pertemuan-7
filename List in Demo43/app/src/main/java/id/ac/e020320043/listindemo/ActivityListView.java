package id.ac.e020320043.listindemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;

import java.util.LinkedList;

public class ActivityListView extends AppCompatActivity {
    private LinkedList<String>mList = new LinkedList<>();
    private CountryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Activity List View");
        setContentView(R.layout.activity_list_view);

        mList.add("Indonesia");
        mList.add("Brunei Darussalam");
        mList.add("Thailand");
        mList.add("Malaysia");

        //buat object adapter
        adapter = new CountryAdapter(this, mList);

        //buat object listview
        ListView listView = findViewById(R.id.listview);
        //pasang adapter untuk listview
        listView.setAdapter(adapter);

        //tambahkan listener onItemClick
        listView.setOnItemClickListener(this::onItemClicked);
    }

    private void onItemClicked(AdapterView<?> adapterView, View view, int i, long l) {
        String item = adapterView.getAdapter().getItem(i).toString();
        item = String.format("%s telah di klik!", item);
        Snackbar.make(view, item, Snackbar.LENGTH_SHORT).show();
    }


}