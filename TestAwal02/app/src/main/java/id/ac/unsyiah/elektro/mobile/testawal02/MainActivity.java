package id.ac.unsyiah.elektro.mobile.testawal02;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

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
    public void onClickJumlahkan(View view){

        EditText angka1 = (EditText) findViewById(R.id.angka1);
        String angka1Str = angka1.getText().toString();
        int num1 = Integer.parseInt(angka1Str);

        EditText angka2 = (EditText) findViewById(R.id.angka2);
        String angka2Str = angka2.getText().toString();
        int num2 = Integer.parseInt(angka2Str);

        TextView hasil = (TextView) findViewById(R.id.hasil);

        int jumlah = 0;

        if (num1 <= num2){
            while (num1 <= num2) {
                jumlah += num1;
                num1++;
            }
            String jumlahStr = Integer.toString(jumlah);
            hasil.setText(jumlahStr);
        }

        else if (num1 >= num2){
            while (num1 >= num2) {
                jumlah += num1;
                num1--;
            }
            String jumlahStr = Integer.toString(jumlah);
            hasil.setText(jumlahStr);
        }
    }
}

