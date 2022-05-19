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
import com.example.rijndorp_multicalc.Formula2;
import com.example.rijndorp_multicalc.R;

import java.util.List;

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.MyViewHolder> {

    Context mContext2;
    List<Formula2> mData2;

    public RecyclerViewAdapter2(Context mContext2, List<Formula2> mData2) {
        this.mContext2 = mContext2;
        this.mData2 = mData2;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext2).inflate(R.layout.item_formula1, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_formulaName.setText(mData2.get(position).getFormulaName());
        holder.iv_formulaImg.setImageResource(mData2.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return mData2.size();
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
            a.putInt("positioning", -1);
            a.putInt("positioning2", getAdapterPosition());
            intent = new Intent(context, SwitchActivity.class);
            intent.putExtras(a);
            context.startActivity(intent);
        }
    }


}
