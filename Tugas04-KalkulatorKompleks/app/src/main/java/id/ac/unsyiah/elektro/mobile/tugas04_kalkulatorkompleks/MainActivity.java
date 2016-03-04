package id.ac.unsyiah.elektro.mobile.tugas04_kalkulatorkompleks;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;
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

public void onClickSamaDengan(View view){
    EditText bilRil1 =(EditText) findViewById(R.id.ril1);
    String ril1Str = bilRil1.getText().toString();
    float ril1 = Float.valueOf(ril1Str);

    EditText bilRil2 =(EditText) findViewById(R.id.ril2);
    String ril2Str = bilRil2.getText().toString();
    float ril2 = Float.valueOf(ril2Str);

    EditText bilImj1 =(EditText) findViewById(R.id.imj1);
    String bilImj1Str = bilImj1.getText().toString();
    float imj1 = Float.valueOf(bilImj1Str);

    EditText bilImj2 =(EditText) findViewById(R.id.imj2);
    String bilImj2Str = bilImj2.getText().toString();
    float imj2 = Float.valueOf(bilImj2Str);

    Spinner spnOperasi = (Spinner) findViewById(R.id.operasi);
    TextView txtHasil = (TextView) findViewById(R.id.txtHasil);

    String selectedItem = (String) spnOperasi.getSelectedItem();
    if(selectedItem.trim().equals("+")){
        float hasilR = Float.valueOf(ril1 + ril2);
        String hasilRStr = Float.toString(hasilR);

        float hasilIm = Float.valueOf(imj1 + imj2);
        String hasilImStr = Float.toString(hasilIm);
        txtHasil.setText(hasilRStr + "+" + hasilImStr + "i");

    }
    else if (selectedItem.trim().equals("-")) {
        float hasilR = Float.valueOf(ril1 - ril2);
        String hasilRStr = Float.toString(hasilR);

        float hasilIm = Float.valueOf(imj1 - imj2);
        String hasilImStr = Float.toString(hasilIm);
        txtHasil.setText(hasilRStr + "+" + hasilImStr + "i");
    }
    else if (selectedItem.trim().equals("x")) {
        float hasilR = Float.valueOf(ril1 * ril2);
        float hasilR1 = Float.valueOf(imj1 * imj2);
        String hasilRStr = Float.toString(hasilR - hasilR1);

        float hasilIm = Float.valueOf(ril2 * imj1);
        float hasilIm1 = Float.valueOf(ril1 * imj2);
        String hasilImStr = Float.toString(hasilIm + hasilIm1);
        txtHasil.setText(hasilRStr + "+" +hasilImStr + "i");
    }

}
}