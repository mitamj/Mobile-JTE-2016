package id.ac.unsyiah.elektro.mobile.testawalradiobuttonactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;

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
    public void onClickHuruf(View view){
        RadioButton A = (RadioButton) findViewById(R.id.btnA);
        RadioButton B = (RadioButton) findViewById(R.id.btnB);
        RadioButton C = (RadioButton) findViewById(R.id.btnC);
        RadioButton D = (RadioButton) findViewById(R.id.btnD);
        RadioButton E = (RadioButton) findViewById(R.id.btnE);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hrfA++;
                Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                pesan.putExtra("varl", (String.valueOf("A" +""+hrfA +""+"kali")));
                startActivity(pesan);
            }
        });

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hrfB++;
                Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                pesan.putExtra("varl", (String.valueOf("B" +""+hrfB+""+"kali")));
                startActivity(pesan);
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hrfC++;
                Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                pesan.putExtra("varl", (String.valueOf("C" +""+hrfC+""+"kali")));
                startActivity(pesan);
            }
        });


        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hrfD++;
                Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                pesan.putExtra("varl", (String.valueOf( "D" +""+ hrfD +""+ "kali" )));
                startActivity(pesan);
            }
        });

        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hrfE++;
                Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                pesan.putExtra("varl", (String.valueOf("E" +""+hrfE+""+"kali")));
                startActivity(pesan);
            }
        });

    }
    int hrfA=0;
    int hrfB=0;
    int hrfC=0;
    int hrfD=0;
    int hrfE=0;
}
