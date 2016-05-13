package id.ac.unsyiah.elektro.mobile.mobileshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by ASUS on 5/13/2016.
 */
public class AdminLayout extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_layout);

    } public void onClickUbah(View view) {
        Intent pesan1 = new Intent(getApplicationContext(), TambahBaju.class);
        startActivity(pesan1);
    } public void onClickLihat(View view) {
        Intent pesan2 = new Intent(getApplicationContext(), DaftarPesanan.class);
        startActivity(pesan2);
    }
}