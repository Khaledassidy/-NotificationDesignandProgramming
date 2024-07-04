package com.example.notificationdesignandprogramming;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//costume notification howe layout kemel la ta3mlo bshkl professional


//first mna3ml layout mn same costume_notification
public class MainActivity extends AppCompatActivity {

    TextView textView;
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.name);
        relativeLayout=findViewById(R.id.relativie_costume_layout);
        LayoutInflater inflater=LayoutInflater.from(this);
        View notificationlayout=(View) inflater.inflate(R.layout.costume_notification,relativeLayout,false);
        TextView notificationTextView=notificationlayout.findViewById(R.id.textview_number_notification);
        relativeLayout.addView(notificationlayout);

    }
}