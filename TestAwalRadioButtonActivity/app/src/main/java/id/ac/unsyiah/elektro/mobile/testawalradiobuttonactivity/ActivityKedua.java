package id.ac.unsyiah.elektro.mobile.testawalradiobuttonactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by ASUS on 3/19/2016.
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
