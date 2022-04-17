package com.example.lesson7_homework ;
import androidx.appcompat.app.AppCompatActivity ;
import android.os.Bundle ;
import android.view.ContextMenu ;
import android.view.View ;
import android.widget.Button ;
import android.widget.CheckBox ;
import android.widget.RadioButton ;
import android.widget.TextView ;
import android.widget.Toast ;
public class MainActivity extends AppCompatActivity {
    RadioButton rad_btn_1 , rad_btn_2 , rad_btn_3 , rad_btn_4 ;
    CheckBox chc_1 , chc_2 , chc_3 , chc_4 ;
    Button btn_submit ;
    String rad_res , chc_res_1 , chc_res_2 , chc_res_3 , chc_res_4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.activity_main) ;
        rad_btn_1 = findViewById(R.id.rad_first) ;
        rad_btn_2 = findViewById(R.id.rad_second) ;
        rad_btn_3 = findViewById(R.id.rad_third) ;
        rad_btn_4 = findViewById(R.id.rad_fourth) ;
        chc_1 = findViewById(R.id.check_first) ;
        chc_2 = findViewById(R.id.check_second) ;
        chc_3 = findViewById(R.id.check_third) ;
        chc_4 = findViewById(R.id.check_fourth) ;
        btn_submit = findViewById(R.id.btn_sub) ;
        btn_submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (rad_btn_1.isChecked()) {
                    rad_res = "Selected Radio Button: " + rad_btn_1.getText() ;
                }
                else if (rad_btn_2.isChecked()) {
                    rad_res = "Selected Radio Button: " + rad_btn_2.getText() ;
                }
                else if (rad_btn_3.isChecked()) {
                    rad_res = "Selected Radio Button: " + rad_btn_3.getText() ;
                }
                else if (rad_btn_4.isChecked()) {
                    rad_res = "Selected Radio Button: " + rad_btn_4.getText() ;
                }
                if (chc_1.isChecked()) {
                    chc_res_1 = chc_1.getText() + ": Yes" ;
                }
                else {
                    chc_res_1 = chc_1.getText() +":No" ;
                }
                if (chc_2.isChecked()) {
                    chc_res_2 = chc_2.getText() +":Yes" ;
                }
                else {
                    chc_res_2 = chc_2.getText() +":No" ;
                }
                if (chc_3.isChecked()){
                    chc_res_3 = chc_3.getText() +":Yes" ;
                }
                else {
                    chc_res_3 = chc_3.getText() +":No" ;
                }
                if (chc_4.isChecked()) {
                    chc_res_4 = chc_4.getText() +":Yes" ;
                }
                else {
                    chc_res_4 = chc_4.getText() +":No" ;
                }
                String result = rad_res + "\n"+
                        "Checkbox Choices:" + "\n"+
                        chc_res_1 + "\n"+
                        chc_res_2+"\n"+
                        chc_res_3+"\n"+
                        chc_res_4+"\n" ;
                Toast.makeText(MainActivity.this , result , Toast.LENGTH_LONG).show() ;
            }
        }) ;
    }
}