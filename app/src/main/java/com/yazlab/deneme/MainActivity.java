package com.yazlab.deneme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity{





    @Override
    protected void onCreate(Bundle savedInstanceState)  {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1= (Button) findViewById(R.id.button4);
            button1.setOnClickListener(new View.OnClickListener()
            {
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, isterBir.class);
                startActivity(i);
            }
        });
        final Button button2= (Button) findViewById(R.id.button5);
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent a = new Intent(MainActivity.this, editIkigiris.class);
                startActivity(a);
            }
        });
        final Button button3= (Button) findViewById(R.id.button6);
        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent a = new Intent(MainActivity.this, editUcgiris.class);
                startActivity(a);
            }
        });
        //listView = (ListView) findViewById(R.id.liste1View);
       // listView2 = (ListView) findViewById(R.id.liste2View);
         ArrayList<String> list;
         ArrayList<String> list2;
         ArrayAdapter<String> adapter2;
         ArrayAdapter<String>  adapter;
       // DatabaseReference okuma = FirebaseDatabase.getInstance().getReference("Taxis");

     /*

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
        });*/
     //  Query query1 = okuma.orderByChild("tpep_pickup_datetime").startAt("2020-12-01").endAt("2020-12-03")

     /* Query query2 = okuma.orderByChild("trip_distance").startAt(0.1);
        list2 = new ArrayList<>();

        adapter2 = new ArrayAdapter<String>(this,R.layout.taxi_info,R.id.taxiInfo, list2);
        query2.addValueEventListener(new ValueEventListener() {int count=0;
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds: snapshot.getChildren()) {
                    taxi=ds.getValue(Taxi.class);
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                    try {
                        Date dateS = dateFormat.parse("2020-12-01");
                        Date date2 = dateFormat.parse("2020-12-3");
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

      /*  okuma.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot ds : snapshot.getChildren())
                {
                    taxi=ds.getValue(Taxi.class);
                    list.add(taxi.getTpep_pickup_datetime().toString()+" \n "
                            +taxi.getTotal_amount());

                }
                listView.setAdapter(adapter);
              /*  String temp = snapshot.getValue().toString();
                System.out.println(temp);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });*/







    }
}