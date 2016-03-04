package id.ac.unsyiah.elektro.mobile.tugas05_spreadsheet;

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

    public void onClickTambah(View view) {
        EditText numb11 = (EditText) findViewById(R.id.num11);
        String num11Str = numb11.getText().toString();
        float num11 = Float.valueOf(num11Str);

        EditText numb12 = (EditText) findViewById(R.id.num12);
        String num12Str = numb12.getText().toString();
        float num12 = Float.valueOf(num12Str);

        EditText numb21 = (EditText) findViewById(R.id.num21);
        String num21Str = numb21.getText().toString();
        float num21 = Float.valueOf(num21Str);

        EditText numb22 = (EditText) findViewById(R.id.num22);
        String num22Str = numb22.getText().toString();
        float num22 = Float.valueOf(num22Str);

        TextView hsl13 = (TextView) findViewById(R.id.hsl13);
        TextView hsl23 = (TextView) findViewById(R.id.hsl23);
        TextView hsl31 = (TextView) findViewById(R.id.hsl31);
        TextView hsl32 = (TextView) findViewById(R.id.hsl32);

        float hasil13 = Float.valueOf(num11 + num12);
        String hasil13Str = Float.toString(hasil13);
        hsl13.setText("= " + hasil13Str);

        float hasil23 = Float.valueOf(num21 + num22);
        String hasil23Str = Float.toString(hasil23);
        hsl23.setText("= " + hasil23Str);

        float hasil31 = Float.valueOf(num11 + num21);
        String hasil31Str = Float.toString(hasil31);
        hsl31.setText("= " + hasil31Str);

        float hasil32 = Float.valueOf(num12 + num22);
        String hasil32Str = Float.toString(hasil32);
        hsl32.setText("= " + hasil32Str);

    }
}
