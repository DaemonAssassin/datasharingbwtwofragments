package com.gmail.mateendev3.datasharingbwfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.gmail.mateendev3.datasharingbwfragments.fragment.FragmentReceiver;
import com.gmail.mateendev3.datasharingbwfragments.fragment.FragmentSender;
import com.gmail.mateendev3.datasharingbwfragments.model.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentSender sender = (FragmentSender) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_container_view_sender);

        sender.setListener(new FragmentSender.OnDataGetListener() {
            @Override
            public void onDataGet(Student student) {
                FragmentReceiver receiver = (FragmentReceiver) getSupportFragmentManager()
                        .findFragmentById(R.id.fragment_container_view_receiver);

                receiver.setData(student);
            }
        });
    }
}