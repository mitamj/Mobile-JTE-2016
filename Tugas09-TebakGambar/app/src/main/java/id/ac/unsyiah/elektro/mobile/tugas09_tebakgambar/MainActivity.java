package id.ac.unsyiah.elektro.mobile.tugas09_tebakgambar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickGambar (View view){

        final Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
        int[] gambar={R.drawable.mobil, R.drawable.sepeda_motor,R.drawable.becak_motor,R.drawable.becak_dayung, R.drawable.sepeda};
        Random rand=new Random();
        int pilih=rand.nextInt(gambar.length);

        switch (view.getId()) {
            case R.id.mobil:
                if (R.drawable.mobil == gambar[pilih]) {
                    pesan.putExtra("var1","Jawaban Benar");
                    pesan.putExtra("var2",gambar[pilih]);
                    startActivity(pesan);

                } else {
                    pesan.putExtra("var1", "Jawaban Salah! Yang benar adalah :");
                    pesan.putExtra("var2",gambar[pilih]);
                    startActivity(pesan);
                }

                break;

            case R.id.spdMotor:
                if (R.drawable.sepeda_motor == gambar[pilih]) {
                    pesan.putExtra("var1","Jawaban Benar");
                    pesan.putExtra("var2",gambar[pilih]);
                    startActivity(pesan);


                } else {
                    pesan.putExtra("var1", "Jawaban Salah! Yang benar adalah :");
                    pesan.putExtra("var2",gambar[pilih]);
                    startActivity(pesan);
                }

                break;

            case R.id.bckMotor:
                if (R.drawable.becak_motor == gambar[pilih]) {
                    pesan.putExtra("var1","Jawaban Benar");
                    pesan.putExtra("var2",gambar[pilih]);
                    startActivity(pesan);


                } else {
                    pesan.putExtra("var1", "Jawaban Salah! Yang benar adalah :");
                    pesan.putExtra("var2",gambar[pilih]);
                    startActivity(pesan);
                }

                break;

            case R.id.bckDayung:
                if (R.drawable.becak_dayung == gambar[pilih]) {
                    pesan.putExtra("var1","Jawaban Benar");
                    pesan.putExtra("var2",gambar[pilih]);
                    startActivity(pesan);


                } else {
                    pesan.putExtra("var1", "Jawaban Salah! Yang benar adalah :");
                    pesan.putExtra("var2",gambar[pilih]);
                    startActivity(pesan);
                }

                break;

            case R.id.sepeda:
                if (R.drawable.sepeda == gambar[pilih]) {
                    pesan.putExtra("var1","Jawaban Benar");
                    pesan.putExtra("var2",gambar[pilih]);
                    startActivity(pesan);


                } else {
                    pesan.putExtra("var1", "Jawaban Salah! Yang benar adalah :");
                    pesan.putExtra("var2",gambar[pilih]);
                    startActivity(pesan);
                }
                break;

        }
    }
}
