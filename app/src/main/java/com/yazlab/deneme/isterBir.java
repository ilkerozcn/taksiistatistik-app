package com.yazlab.deneme;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class isterBir extends AppCompatActivity {

    Taxi taxi ;
    FirebaseDatabase db;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        ArrayList<String> list;
        ArrayAdapter<String>  adapter;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ister_bir);
        listView = (ListView) findViewById(R.id.liste1View);
        taxi = new Taxi();
        DatabaseReference okuma = FirebaseDatabase.getInstance().getReference("Taxis");
        Query query = okuma.orderByChild("trip_distance").limitToLast(5);
         list = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this,R.layout.taxi_info,R.id.taxiInfo, list);
        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds: snapshot.getChildren()) {
                    taxi=ds.getValue(Taxi.class);
                    list.add(taxi.getTpep_pickup_datetime().toString()+" \n "
                            +taxi.getTrip_distance()+" mile");
                }
                listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



    }
}
