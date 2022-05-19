package com.example.rijndorp_multicalc.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rijndorp_multicalc.Formula1;
import com.example.rijndorp_multicalc.R;
import com.example.rijndorp_multicalc.Adapter.RecyclerViewAdapter1;

import java.util.ArrayList;
import java.util.List;

public class FragmentFormula1 extends Fragment {

    View v;
    private RecyclerView myRecyclerview;
    private List<Formula1> lstFormula;
    public FragmentFormula1() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.formula1_fragment,container,false);
        myRecyclerview = v.findViewById(R.id.recview_formula1);
        RecyclerViewAdapter1 recyclerViewAdapter1 = new RecyclerViewAdapter1(getContext(),lstFormula);
        myRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerview.setAdapter(recyclerViewAdapter1);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstFormula = new ArrayList<>();
        lstFormula.add(new Formula1("Speed Formula",R.drawable.item_speedformula));
        lstFormula.add(new Formula1("Density Formula",R.drawable.item_densityformula));
        lstFormula.add(new Formula1("Frequency Formula",R.drawable.item_frequencyformula));
        lstFormula.add(new Formula1("Power Formula",R.drawable.item_powerformula));
        lstFormula.add(new Formula1("Newtons Second Law",R.drawable.item_newtonsecondlaw));



    }
}
