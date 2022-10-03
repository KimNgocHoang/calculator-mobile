package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.calculator.databinding.ActivityMainBinding;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String str="";
    private boolean status=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View viewRoot = binding.getRoot();
        setContentView(viewRoot);
    }

    private void setW(String value){
        str = str + value;
        binding.etInput.setText(str);
    }

    public void btn_bang(View view){
        Double result = null;
//        status = true;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        try {
            result = (double)engine.eval(str);

        }
        catch (ScriptException e){
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
        }

        if (result != null){
            binding.tvResult.setText(str + " = " + String.valueOf(result.doubleValue()));
            binding.etInput.setText(String.valueOf(result.doubleValue()));
            str = String.valueOf(result.doubleValue());

        }
    }
    public void btnC(View view){
        str = "";
        binding.etInput.setText("");
    }

    public void btn0(View view){
//        if (status==true){
//            str="";
//        }
        setW("0");
//        status=false;
    }

    public void btn1(View view){
//        if (status==true){
//            str="";
//        }
        setW("1");
//        status=false;
    }

    public void btndot(View view){
//        if (status==true){
//            str="";
//        }
        setW(".");
//        status=false;
    }

    public void btn2(View view){
//        if (status==true){
//            str="";
//        }
        setW("2");
//        status=false;
    }

    public void btn3(View view){
//        if (status==true){
//            str="";
//        }
        setW("3");
//        status=false;
    }

    public void btn4(View view){
//        if (status==true){
//            str="";
//        }
        setW("4");
//        status=false;
    }

    public void btn5(View view){
//        if (status==true){
//            str="";
//        }
        setW("5");
//        status=false;
    }

    public void btn6(View view){
//        if (status==true){
//            str="";
//        }
        setW("6");
//        status=false;
    }

    public void btn7(View view){
//        if (status==true){
//            str="";
//        }
        setW("7");
//        status=false;
    }

    public void btn8(View view){
//        if (status==true){
//            str="";
//        }
        setW("8");
//        status=false;
    }

    public void btn9(View view){
//        if (status==true){
//            str="";
//        }
        setW("9");
//        status=false;
    }

    public void btn_del(View view){
        if(!str.isEmpty()){
            str=str.substring(0, str.length()-1);
            binding.etInput.setText(str);
        }
    }

    public void btn_chia(View view){
        String s= str.substring((str.length()-1), str.length());
        if (s.equals("*") || s.equals("/") || s.equals("+")|| s.equals("-")){
            str=str.substring(0, str.length()-1);
            setW("/");
        }
        else{
            setW("/");
        }
    }

    public void btn_nhan(View view){
        String s= str.substring((str.length()-1), str.length());
        if (s.equals("*") || s.equals("/") || s.equals("+")|| s.equals("-")){
            str=str.substring(0, str.length()-1);
            setW("*");
        }
        else{
            setW("*");
        }
    }

    public void btn_tru(View view){
        String s= str.substring((str.length()-1), str.length());
        if (s.equals("*") || s.equals("/") || s.equals("+")|| s.equals("-")){
            str=str.substring(0, str.length()-1);
            setW("-");
        }
        else{
            setW("-");
        }
    }

    public void btn_cong(View view){
        String s= str.substring((str.length()-1), str.length());
        if (s.equals("*") || s.equals("/") || s.equals("+")|| s.equals("-")){
            str=str.substring(0, str.length()-1);
            setW("+");
        }
        else{
            setW("+");
        }
    }

    public void ChangeOnClick(View view) {
        String s="";
        if(status==true)
        {

        }
    }
}