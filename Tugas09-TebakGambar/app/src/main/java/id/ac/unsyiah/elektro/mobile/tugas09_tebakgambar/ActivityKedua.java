package id.ac.unsyiah.elektro.mobile.tugas09_tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ASUS on 3/18/2016.
 */
public class ActivityKedua extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");
        int pesan0Str = pesan.getIntExtra("var2",0);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(pesanStr);


        ImageView gambar = (ImageView) findViewById(R.id.tmplGambar);
        gambar.setImageResource(pesan0Str);
    }
}
