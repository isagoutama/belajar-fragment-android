package com.example.belajar;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment implements View.OnClickListener{

    private String text;
    private TextView textView;
    private Bundle bundle;

    public CategoryFragment() {
        // Required empty public constructor
    }

    public CategoryFragment newInstance(String text){
//        bundle = new Bundle();
//        bundle.putString("text", text);

        this.text = text;

        CategoryFragment fragment = new CategoryFragment();
//        fragment.setArguments(bundle);

        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnDetilKategori = view.findViewById(R.id.btn_deti_kategori);
        btnDetilKategori.setOnClickListener(this);
        textView = view.findViewById(R.id.tv_text);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_deti_kategori){
            textView.setText(text);
        }
    }

}
