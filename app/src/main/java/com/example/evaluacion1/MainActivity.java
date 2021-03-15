package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;
// se deben importar las librerias para que puedan ser utilizados los objetos en sistema
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // se define el tipo de dato y varianble para el trabajos campos en el diseño
    EditText cantidad;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // el objeto del diseño (activity_main.xml) se asocia con la variable, amso del mismo tipo
            // con casting (EditText) y (TextView) Podemos utilizar todos los metodos de la clase EditText y Textview
        cantidad = (EditText) findViewById(R.id.EditText_Cantidad);
        resultado = (TextView) findViewById(R.id.textView_Resultado);
        tvVC.setText(String.valueOf(getResources().getInteger(R.integer.valor_cafe)).toString());
    }
    // se genera un metodo para el boton realice una accion.
    public void calculo(View v){ // los
        int precio_cafe_expreso=1200; // precio constante
        //Utiliza el metodo getText para obtener el texto de objeto Edittext y posterior que tenga valor de String y que sea alojado en la
        // variable can
        String can = cantidad.getText().toString();
        // La variable car debe ser transformado de String (caracter) a Numero (Entero) y asignarlo en la variable valor
        int valor = Integer.parseInt(can);
        //ya que para ser el calculo se debe hacer de tipo entero y el valor constante
        int calculo = valor*precio_cafe_expreso;
        // el variable calculo como entero debe ser pasada a String ára luego mostrar el valor en EditText
        String mensaje="$"+(String.valueOf(calculo));
        //debemos mostrar en el textview del objeto el valor del calculo de l cafe
        resultado.setText(mensaje);

        //valorFinal.setText("Total a pagar: $ " + String.valueOf(Integer.parseInt(txtCantidad.getText().toString()) * getResources().getInteger(R.integer.valor_cafe)).toString());

    }// fin del metodo calculo
}//fin del la clase main activity