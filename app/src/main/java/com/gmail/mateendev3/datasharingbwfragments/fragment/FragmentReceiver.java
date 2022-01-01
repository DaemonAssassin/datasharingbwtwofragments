package com.gmail.mateendev3.datasharingbwfragments.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gmail.mateendev3.datasharingbwfragments.R;
import com.gmail.mateendev3.datasharingbwfragments.model.Student;

public class FragmentReceiver extends Fragment {
    TextView tvReceiverResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_receiver, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvReceiverResult = view.findViewById(R.id.tv_receiver_result);

    }

    public void setData(Student student) {
        if (student != null) {
            tvReceiverResult.setText(student.toString());
        }
    }
}