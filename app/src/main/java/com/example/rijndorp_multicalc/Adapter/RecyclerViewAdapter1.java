package com.example.rijndorp_multicalc.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rijndorp_multicalc.Activity.SwitchActivity;
import com.example.rijndorp_multicalc.Formula1;
import com.example.rijndorp_multicalc.Formula2;
import com.example.rijndorp_multicalc.R;

import java.util.List;

public class RecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerViewAdapter1.MyViewHolder>{

    Context mContext;
    List<Formula1> mData;

    public RecyclerViewAdapter1(Context mContext, List<Formula1> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_formula1,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_formulaName.setText(mData.get(position).getFormulaName());
        holder.iv_formulaImg.setImageResource(mData.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView tv_formulaName;
        private ImageView iv_formulaImg;
        private Context context;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            tv_formulaName = itemView.findViewById(R.id.tv_formula1_1);
            iv_formulaImg = itemView.findViewById(R.id.iv_formula1_1);
            iv_formulaImg.setClickable(true);
            iv_formulaImg.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            Bundle a = new Bundle();
            a.putInt("positioning", getAdapterPosition());
            a.putInt("positioning2", -1);
            intent = new Intent(context, SwitchActivity.class);
            intent.putExtras(a);
            context.startActivity(intent);
        }
    }


}
