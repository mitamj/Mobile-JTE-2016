package id.ac.unsyiah.elektro.mobile.mobileshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by ASUS on 5/13/2016.
 */
public class DaftarBaju extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar_baju);
    }

    public void onClickOrder(View view) {
        Intent pesan1 = new Intent(getApplicationContext(), DaftarPesan.class);
        startActivity(pesan1);
    }
}