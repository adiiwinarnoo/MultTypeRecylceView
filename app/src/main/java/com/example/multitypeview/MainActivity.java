package com.example.multitypeview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.multitypeview.adapter.TripsAdapter;
import com.example.multitypeview.models.Ads;
import com.example.multitypeview.models.Item;
import com.example.multitypeview.models.News;
import com.example.multitypeview.models.Trip;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rec_main);

        List<Item> list = new ArrayList<>();

        //tipe : 0 = trip, 1=ads, 2=news

        //trip
        Trip trip1 = new Trip(R.drawable.crotia,"Croatis","2021, Agustus- 20 Hari");
        list.add(new Item(0, trip1));

        //ADS
        Ads ads1 = new Ads("Judul : Liburan Lebaran","50% Diskon di Hari Raya Idul Fitri");
        list.add(new Item(1,ads1));

        //News
        News news1 = new News("Bali, Indonesia","Daftar Sekarang Kamu akan mendapatkan tiket gratis ke Lombok dan GiliTrawang");
        list.add(new Item(2,news1));

        //trip
        Trip trip2 = new Trip(R.drawable.bali,"Croatis","2021, Agustus- 20 Hari");
        list.add(new Item(0, trip2));

        //ADS
        Ads ads2 = new Ads("Judul : Liburan Lebaran","50% Diskon di Hari Raya Idul Fitri");
        list.add(new Item(1,ads2));

        //News
        News news2 = new News("Bali, Indonesia","Daftar Sekarang Kamu akan mendapatkan tiket gratis ke Lombok dan GiliTrawang");
        list.add(new Item(2,news2));

        recyclerView.setAdapter(new TripsAdapter(list));
    }
}