package com.example.joshxandre.luminous;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements ImageView.OnClickListener  {

    private ToggleButton togbtn;
    private ImageView imageView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        togbtn =   (ToggleButton) findViewById(R.id.togbtn);
        imageView = (ImageView) findViewById(R.id.imageView);
        assert togbtn != null;
        togbtn.setOnClickListener(this);
}

    @Override
    public void onClick(View view) {
        if (togbtn.isChecked()) {
            imageView.setImageResource(R.drawable.on);
        } else
            imageView.setImageResource(R.drawable.off);

    }
}