package id.ac.unsyiah.elektro.mobile.praktikum17_counter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by ASUS on 3/12/2016.
 */

    public class ActivityKedua extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_kedua);

            Intent pesan = getIntent();
            String pesanStr = pesan.getStringExtra("varl");

            TextView counter= (TextView) findViewById(R.id.cntr);
            counter.setText(pesanStr);
        }
    }

