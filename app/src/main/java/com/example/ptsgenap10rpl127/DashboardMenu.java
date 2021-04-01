package com.example.ptsgenap10rpl127;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DashboardMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    // we user ArrayList to populate data in RecyclerView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_menu);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);

        addData();

        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        //selesai ngatur data dari adapter, kemudian di tempel ke Recyclerview nya
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DashboardMenu.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Rama", "555", "081111","rama@gmail.com"));
        mahasiswaArrayList.add(new Mahasiswa("Budi", "000", "081222", "budi@gmail.com"));
        mahasiswaArrayList.add(new Mahasiswa("Yanto", "123", "083333", "yanto@gmail.com"));
//        Mahasiswa Sari = new Mahasiswa("Sari", "xxx" , "000", "sari@gmail.com");
//        mahasiswaArrayList.add(Sari);
    }
}