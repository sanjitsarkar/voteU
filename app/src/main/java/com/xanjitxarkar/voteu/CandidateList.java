package com.xanjitxarkar.voteu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class CandidateList extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_list);

        recyclerView=(RecyclerView)findViewById(R.id.myRecycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter=new MyAdapter(this,getMyList());
        recyclerView.setAdapter(adapter);
    }
    private ArrayList<Model> getMyList(){
        ArrayList<Model> models=new ArrayList<>();

        Model m=new Model();
        m.setName("Nitya Ranjan Deori");
        m.setBranch("CSE-4th sem.");
        m.setDp(R.color.black);
        models.add(m);

        m=new Model();
        m.setName("Mubeen Hussain");
        m.setBranch("CSE-4th sem.");
        m.setDp(R.color.purple_500);
        models.add(m);

        m=new Model();
        m.setName("Sanjit Sarkar");
        m.setBranch("CSE-4th sem.");
        m.setDp(R.color.purple_200);
        models.add(m);

        m=new Model();
        m.setName("BhagyaJeet Borah");
        m.setBranch("CSE-4th sem.");
        m.setDp(R.color.purple_700);
        models.add(m);

        return models;
    }
    public void next(View view){

    }
}