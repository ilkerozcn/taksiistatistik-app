package com.yazlab.deneme;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class isterIki extends AppCompatActivity {
    ListView listView2;
    FirebaseDatabase db;
    Taxi taxi ;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ister_iki);
        listView2 = (ListView) findViewById(R.id.liste2View);
        taxi = new Taxi();
        ArrayList<String> list2;
        ArrayAdapter<String> adapter2;
        DatabaseReference okuma = FirebaseDatabase.getInstance().getReference("Taxis");
        Query query2 = okuma.orderByChild("trip_distance").startAt(0.1);
        list2 = new ArrayList<>();
            String s1=getIntent().getExtras().getString("s1");
        String s2=getIntent().getExtras().getString("s2");
        adapter2 = new ArrayAdapter<String>(this,R.layout.taxi_info,R.id.taxiInfo, list2);
        query2.addValueEventListener(new ValueEventListener() {int count=0;
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds: snapshot.getChildren()) {
                    taxi=ds.getValue(Taxi.class);
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                    try {
                        Date dateS = dateFormat.parse(s1);
                        Date date2 = dateFormat.parse(s2);
                        Date date1 = dateFormat.parse(taxi.getTpep_pickup_datetime());
                        if(date1.getTime()>=dateS.getTime()&&date1.getTime()<=date2.getTime()&&count<5){
                            list2.add(taxi.getTpep_pickup_datetime().toString()+" \n "
                                    +taxi.getTrip_distance()+" mile");
                            count++;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }



                    //     if(taxi.getTpep_pickup_datetime() > 2020-12-01 )

                }
                listView2.setAdapter(adapter2);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });




    }
}
