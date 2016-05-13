package id.ac.unsyiah.elektro.mobile.mobileshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by ASUS on 5/13/2016.
 */
public class TambahBaju extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tambah_baju);

    }
    public void onClickUpload(View view) {
        Intent pesan1 = new Intent(getApplicationContext(), AdminBaju.class);
        startActivity(pesan1);
    }
    public void onClickNext(View view) {
        Intent pesan1 = new Intent(getApplicationContext(), AdminBaju.class);
        startActivity(pesan1);
    }
}