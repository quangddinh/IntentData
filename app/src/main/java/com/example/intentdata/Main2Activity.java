package com.example.intentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

// Lấy dữ liệu chuỗi
//        Intent intent = getIntent();
//        String value = intent.getStringExtra("chuoi");
//        Toast.makeText(this ,value,Toast.LENGTH_SHORT).show();
// Lấy dữ liệu mảng
//
//            Intent intent = getIntent();
//            int[] arrayNumbers = intent.getIntArrayExtra("mang so");
//            Toast.makeText(this, arrayNumbers.length + "", Toast.LENGTH_SHORT).show();


            Intent intent = getIntent();
//            SinhVien sinhvien = (SinhVien) intent.getSerializableExtra("object");
            SinhVien sinhvien = intent.getParcelableExtra("object");
            Toast.makeText(this, sinhvien.getTen(), Toast.LENGTH_SHORT).show();
    }
}
