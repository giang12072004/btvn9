package com.example.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edt_name,edt_ChieuCao,edt_CanNang,edt_BMI,edt_ChanDoan;
    Button btn_Tinhbmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edt_BMI=findViewById(R.id.edt_BMI);
        edt_CanNang=findViewById(R.id.edt_CanNang);
        edt_name=findViewById(R.id.edt_name);
        edt_ChanDoan=findViewById(R.id.edt_ChanDoan);
        edt_ChieuCao=findViewById(R.id.edt_ChieuCao);
        btn_Tinhbmi=findViewById(R.id.btn_TinhBMI);
        btn_Tinhbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double H=Double.parseDouble(edt_ChieuCao.getText().toString());
                double W=Double.parseDouble(edt_CanNang.getText().toString());
                double BMI=W/Math.pow(H,2);
                String chandoan="";
                if(BMI<18){
                    chandoan="Bạn bị gầy";
                } else if (BMI<=24.9) {
                    chandoan="Bạn bình thường";
                } else if (BMI<=29.29) {
                    chandoan="Bạn béo phì cấp 1";
                } else if (BMI<=34.9) {
                    chandoan="Bạn béo phì cấp 2";
                }else{
                    chandoan="Bạn béo phì cấp 3";
                }
                edt_BMI.setText(BMI+"");
                edt_ChanDoan.setText(chandoan+"");
            }
        });
    }
}