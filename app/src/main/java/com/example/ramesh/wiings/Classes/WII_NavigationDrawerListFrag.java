package com.example.ramesh.wiings.Classes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ramesh.wiings.Adapter.WII_NavigationAdapter;
import com.example.ramesh.wiings.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ram on 13-07-2017.
 */

public class WII_NavigationDrawerListFrag extends Fragment {

    MainActivity mMainActivity;

    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;
    ArrayList<HashMap<String,String>> myArrList;

    ArrayList<String>myList;

    public WII_NavigationDrawerListFrag(MainActivity mainActivity) {

        mMainActivity=mainActivity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View aView=inflater.inflate(R.layout.wii_navi_drawer_frag,null);
        myArrList=new ArrayList<>();
        myList=new ArrayList<>();


        HashMap aHashMap=new HashMap();
        aHashMap.put("fash_key","FASHION");
        aHashMap.put("fash_key","DANCE");
        aHashMap.put("fash_key","CREATE COSTUME");
        aHashMap.put("fash_key","SHOES");
        aHashMap.put("fash_key","ACCESSORIES");



        myArrList.add(aHashMap);

        myList.add("FASHION");
        myList.add("DANCE");
        myList.add("CREATE COSTUME");
        myList.add("SHOES");
        myList.add("ACCESSORIES");


        RecyclerView aRecyclerView=(RecyclerView)aView.findViewById(R.id.recyclerView_id);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        aRecyclerView.setHasFixedSize(true);

        mLayoutManager=new LinearLayoutManager(mMainActivity);
        aRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter=new WII_NavigationAdapter(myList);
        aRecyclerView.setAdapter(mAdapter);



        return aView;
    }


    }
