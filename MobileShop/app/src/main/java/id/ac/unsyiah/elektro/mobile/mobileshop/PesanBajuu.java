package id.ac.unsyiah.elektro.mobile.mobileshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by ASUS on 5/13/2016.
 */
public class PesanBajuu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesan_baju);

    }
    public void onClickSimpan(View view) {
        Intent pesan1 = new Intent(getApplicationContext(), SelesaiPesan.class);
        startActivity(pesan1);
    }
}
