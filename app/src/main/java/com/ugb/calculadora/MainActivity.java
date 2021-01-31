package com.ugb.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void calcular(View view){
       TextView temVal=(TextView)findViewById(R.id.txtnum1);
       double num1 = Double.parseDouble(temVal.getText().toString());

       temVal = (TextView)findViewById(R.id.txtnum2);
       double num2 = Double.parseDouble(temVal.getText().toString());

       double respuesta = 2;
       RadioButton optOperacionesBasicas = findViewById(R.id.optSuma2);
       if (optOperacionesBasicas.isChecked() ){
           respuesta = num1 + num2 ;
       }

       optOperacionesBasicas = findViewById(R.id.optResta);
       if (optOperacionesBasicas.isChecked() ){
           respuesta=num1-num2;
       }

       optOperacionesBasicas = findViewById(R.id.optMultiplicacion);
       if (optOperacionesBasicas.isChecked() ){
           respuesta=num1*num2;
       }

       optOperacionesBasicas = findViewById(R.id.optDivision);
       if (optOperacionesBasicas.isChecked() ){
           respuesta=num1/num2;
       }
       optOperacionesBasicas = findViewById(R.id.optFactorial);
       if (optOperacionesBasicas.isChecked() ){
           for (int i=2;i<=num1 ; i++ ){
               respuesta *= i;
           }
       }

       optOperacionesBasicas = findViewById(R.id.optPorcentaje);
       if (optOperacionesBasicas.isChecked() ){
           respuesta = ((num1-num2)/num2)*100;
       }

       optOperacionesBasicas = findViewById(R.id.optMayor);
       if (optOperacionesBasicas.isChecked() ){
           if (num1>num2){
               respuesta = num1;
           }
           if (num1<num2){
               respuesta = num2;
           }
       }

       optOperacionesBasicas = findViewById(R.id.optModulo);
       if(optOperacionesBasicas.isChecked()){
           respuesta = num1%num2;
       }
       optOperacionesBasicas = findViewById(R.id.optExponeciasion);
       if(optOperacionesBasicas.isChecked()){
           respuesta=Math.pow(num1,num2);
       }
       optOperacionesBasicas = findViewById(R.id.optRaiz2);
       if(optOperacionesBasicas.isChecked()){
           respuesta = Math.sqrt(num1);
       }
       optOperacionesBasicas = findViewById(R.id.optRaiz3);
       if(optOperacionesBasicas.isChecked() ){
           respuesta=Math.cbrt(num1);
       }

       optOperacionesBasicas = findViewById(R.id.optRaizn);
       if(optOperacionesBasicas.isChecked() ){
           respuesta = Math.pow(num1,1.0/num2);
       }



       temVal = findViewById(R.id.lblRespuesta);
       temVal.setText("Respuesta: " + respuesta );


   }


}