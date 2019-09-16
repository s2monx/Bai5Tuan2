package com.example.student.bai5tuan2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etTenKH, etSoluongsach, etThanhtien;
    CheckBox chkVIP;
    Button btnTinhTT, btnTiep, btnThongke;
    TextView tvTongKH, tvTongVIP, tvTongdoanhthu;
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
        etTenKH = findViewById(R.id.etTenKH);
        etSoluongsach = findViewById(R.id.etSoluongsach);
        etThanhtien = findViewById(R.id.etThanhtien);
        chkVIP = findViewById(R.id.chkVIP);
        btnTinhTT = findViewById(R.id.btnTinhTT);
        btnTiep = findViewById(R.id.btnTiep);
        btnThongke = findViewById(R.id.btnThongke);
        tvTongKH = findViewById(R.id.tvTongKH);
        tvTongVIP = findViewById(R.id.tvTongVIP);
        tvTongdoanhthu = findViewById(R.id.tvTongdoanhthu);

        btnTinhTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer thanhtien = 20000*Integer.valueOf(String.valueOf(etSoluongsach.getText()));
                if(chkVIP.isChecked()){
                    thanhtien -= (thanhtien*10)/100;
                }
                etThanhtien.setText(thanhtien+"");
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
}
