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

import com.example.rijndorp_multicalc.Adapter.RecyclerViewAdapter2;
import com.example.rijndorp_multicalc.Formula1;
import com.example.rijndorp_multicalc.Formula2;
import com.example.rijndorp_multicalc.R;
import com.example.rijndorp_multicalc.Adapter.RecyclerViewAdapter1;

import java.util.ArrayList;
import java.util.List;

public class FragmentFormula2 extends Fragment {

    View v;
    private RecyclerView myRecyclerview;
    private List<Formula2> lstFormula2;
    public FragmentFormula2() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.formula2_fragment,container,false);
        myRecyclerview = v.findViewById(R.id.recview_formula2);
        RecyclerViewAdapter2 recyclerViewAdapter2 = new RecyclerViewAdapter2(getContext(),lstFormula2);
        myRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerview.setAdapter(recyclerViewAdapter2);
        return v;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstFormula2 = new ArrayList<>();
        lstFormula2.add(new Formula2("Rectangle Formula",R.drawable.item_rectangle));
        lstFormula2.add(new Formula2("Cylinder Formula",R.drawable.item_cylinder));
        lstFormula2.add(new Formula2("Cone Formula",R.drawable.item_cone));
        lstFormula2.add(new Formula2("Sphere Formula",R.drawable.item_sphere));




    }
}
