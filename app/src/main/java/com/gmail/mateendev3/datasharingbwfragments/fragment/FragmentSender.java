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

public class FragmentSender extends Fragment {
    EditText etName, etRollNo, etAge;
    Button btnSendData;
    private OnDataGetListener mListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sender, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        etName = view.findViewById(R.id.et_name);
        etRollNo = view.findViewById(R.id.et_roll_no);
        etAge = view.findViewById(R.id.et_age);
        btnSendData = view.findViewById(R.id.btn_send_data);

        btnSendData.setOnClickListener(v -> {
            sendData();
        });

    }

    private void sendData() {
        if (!etName.getText().toString().isEmpty() &&
                !etAge.getText().toString().isEmpty() &&
                !etRollNo.getText().toString().isEmpty()
        ) {
            String name = etName.getText().toString();
            int rollNo = Integer.parseInt(etRollNo.getText().toString());
            byte age = Byte.parseByte(etAge.getText().toString());

            Student student = new Student(name, rollNo, age);
            if (mListener != null) {
                mListener.onDataGet(student);
            }
        }
    }

    //setter
    public void setListener(OnDataGetListener l) {
        this.mListener = l;
    }

    //public interface
    public interface OnDataGetListener {
        void onDataGet(Student student);
    }
}