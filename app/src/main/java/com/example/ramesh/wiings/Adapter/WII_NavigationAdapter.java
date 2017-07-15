package com.example.ramesh.wiings.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ramesh.wiings.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ram on 13-07-2017.
 */

public class WII_NavigationAdapter extends RecyclerView.Adapter<WII_NavigationAdapter.myViewHolder> {

    ArrayList<HashMap<String,String>> myArrList=new ArrayList<>();

    ArrayList<String>mList;


    public WII_NavigationAdapter(ArrayList<String> ArrList) {

        mList=ArrList;
    }

    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View aView= LayoutInflater.from(parent.getContext()).inflate(R.layout.wii_navi_title_list,parent,false);

        return new myViewHolder(aView);
    }

    public void onBindViewHolder(myViewHolder holder, int position) {

        holder.aTitleTxt.setText(mList.get(position));
    }

    public int getItemCount() {

        return mList.size();

    }

    public class myViewHolder extends RecyclerView.ViewHolder{

       public TextView aTitleTxt;

        public myViewHolder(View aView) {
            super(aView);
            aTitleTxt=(TextView)itemView.findViewById(R.id.title_txt_id);

        }
    }


}
