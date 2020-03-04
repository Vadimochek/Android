package com.example.android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ru.samsung.itschool.book.equation243.R;

public class ButtonFragment extends Fragment implements View.OnClickListener{
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.button_fragment, container, false);

        view.findViewById(R.id.button_0).setOnClickListener(this);
        view.findViewById(R.id.button_1).setOnClickListener(this);
        view.findViewById(R.id.button_2).setOnClickListener(this);
        view.findViewById(R.id.button_3).setOnClickListener(this);
        view.findViewById(R.id.button_4).setOnClickListener(this);
        view.findViewById(R.id.button_5).setOnClickListener(this);
        view.findViewById(R.id.button_6).setOnClickListener(this);
        view.findViewById(R.id.button_7).setOnClickListener(this);
        view.findViewById(R.id.button_8).setOnClickListener(this);
        view.findViewById(R.id.button_9).setOnClickListener(this);

        view.findViewById(R.id.point).setOnClickListener(this);

        view.findViewById(R.id.equally).setOnClickListener(this);

        view.findViewById(R.id.sum).setOnClickListener(this);
        view.findViewById(R.id.difference).setOnClickListener(this);
        view.findViewById(R.id.multiplication).setOnClickListener(this);
        view.findViewById(R.id.divide).setOnClickListener(this);

        view.findViewById(R.id.backspace).setOnClickListener(this);
        view.findViewById(R.id.clear).setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        String text = ((Button)view.findViewById(v.getId())).getText().toString();

        if (text.equals("C")){
            MainActivity1.clear();
        }else if(text.equals("Backspace")){
            MainActivity1.backspace();
        }else {
            MainActivity1.write(text);
        }
    }
}