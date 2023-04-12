package com.cap.deeplink;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private static final String TAG1 = "hello";
    private static final String TAG2 = "hi";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = getIntent().getData();
        if (uri != null) {

            String pss = uri.toString();
            String[] a = pss.split("[?=//]+");
            System.out.println("Splitted Array " + Arrays.toString(a));
            System.out.println("Splitted Array " + a[3]);
            System.out.println("Splitted Array " + a[5]);

        }
    }
}