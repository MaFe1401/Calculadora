package edu.upc.calculadora;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0, botonmas, botonmenos, botonx, botondiv, botonigual, botonsin, botoncos, botontan, botonpunto,botonclear, unidad;
String signoOperacion=null;
double operando1, operando2, resultado;
int op2flag0=0, op1flag0=0, flagNuevaOperacion=0, flagsin=0, flagcos=0, flagtan=0, flaggrados=0;
EditText pantalla, textonscreen, textounit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1=(Button)findViewById(R.id.button1);
        boton2=(Button)findViewById(R.id.button2);
        boton3=(Button)findViewById(R.id.button3);
        boton4=(Button)findViewById(R.id.button4);
        boton5=(Button)findViewById(R.id.button5);
        boton6=(Button)findViewById(R.id.button6);
        boton7=(Button)findViewById(R.id.button7);
        boton8=(Button)findViewById(R.id.button8);
        boton9=(Button)findViewById(R.id.button9);
        boton0=(Button)findViewById(R.id.button0);
        botonmas=(Button)findViewById(R.id.buttonAdd);
        botonmas.setEnabled(false);
        botonmenos=(Button)findViewById(R.id.buttonSubtract);
        botonmenos.setEnabled(false);
        botonx=(Button)findViewById(R.id.buttonMultiply);
        botonx.setEnabled(false);
        botondiv=(Button)findViewById(R.id.buttonDivide);
        botondiv.setEnabled(false);
        botonigual=(Button)findViewById(R.id.buttonEqual);
        botonigual.setEnabled(false);
        botonsin=(Button)findViewById(R.id.buttonSin);
        botoncos=(Button)findViewById(R.id.buttonCos);
        botontan=(Button)findViewById(R.id.buttonTan);
        botonpunto=(Button)findViewById(R.id.buttonPoint);
        botonclear=(Button)findViewById(R.id.buttonClear);
        pantalla=(EditText) findViewById(R.id.Pantalla);
        unidad=(Button)findViewById(R.id.UnidadBoton);
        textounit=(EditText) findViewById(R.id.unidText);
                pantalla.addTextChangedListener(new TextWatcher() {

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        textonscreen=(EditText)findViewById(R.id.Pantalla);
                        String texto=textonscreen.getText().toString();
                        if (texto.equals("∞"))
                        {
                            botonpunto.setEnabled(false);
                            botonmas.setEnabled(false);
                            botonmenos.setEnabled(false);
                            botonx.setEnabled(false);
                            botondiv.setEnabled(false);
                            botonigual.setEnabled(false);
                            botonsin.setEnabled(false);
                            botoncos.setEnabled(false);
                            botontan.setEnabled(false);
                        }

                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });
                unidad.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (flaggrados==0) {
                            flaggrados = 1;
                            textounit.setText("Grados");
                        }
                        else {
                            flaggrados=0;
                            textounit.setText("Radianes");
                        }

                    }
                });
                boton0.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {//Al clicar el boton 0
                        if (flagNuevaOperacion==1)
                        {
                            pantalla.setText("");
                            signoOperacion=null;
                            flagNuevaOperacion=0;
                        }
                        textonscreen=(EditText)findViewById(R.id.Pantalla);
                        String texto = textonscreen.getText().toString()+"0";//Se coge lo que haya escrito en "pantalla" y se le añade un 0
                        pantalla.setText(texto);//Se actualiza el texto en pantalla
                        botonpunto.setEnabled(true);
                        botonmas.setEnabled(true);
                        botonmenos.setEnabled(true);
                        botonx.setEnabled(true);
                        botondiv.setEnabled(true);
                        botonigual.setEnabled(true);
                        botonsin.setEnabled(false);
                        botoncos.setEnabled(false);
                        botontan.setEnabled(false);
                    }
                });
                boton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton 1
                        if (flagNuevaOperacion==1)
                        {
                            pantalla.setText("");
                            signoOperacion=null;
                            flagNuevaOperacion=0;
                        }
                        textonscreen = (EditText) findViewById(R.id.Pantalla);
                        String texto = textonscreen.getText().toString() + "1";//Se coge lo que haya escrito en "pantalla" y se le añade un 1
                        pantalla.setText(texto);//Se actualiza el texto en pantalla
                        botonpunto.setEnabled(true);
                        botonmas.setEnabled(true);
                        botonmenos.setEnabled(true);
                        botonx.setEnabled(true);
                        botondiv.setEnabled(true);
                        botonigual.setEnabled(true);
                        botonsin.setEnabled(false);
                        botoncos.setEnabled(false);
                        botontan.setEnabled(false);
                    }
                });
                boton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton 2
                        if (flagNuevaOperacion==1)
                        {
                            pantalla.setText("");
                            signoOperacion=null;
                            flagNuevaOperacion=0;
                        }
                        textonscreen = (EditText) findViewById(R.id.Pantalla);
                        String texto = textonscreen.getText().toString() + "2";//Se coge lo que haya escrito en "pantalla" y se le añade un 2
                        pantalla.setText(texto);//Se actualiza el texto en pantalla
                        botonpunto.setEnabled(true);
                        botonmas.setEnabled(true);
                        botonmenos.setEnabled(true);
                        botonx.setEnabled(true);
                        botondiv.setEnabled(true);
                        botonigual.setEnabled(true);
                        botonsin.setEnabled(false);
                        botoncos.setEnabled(false);
                        botontan.setEnabled(false);
                    }
                });
                boton3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton 3
                        if (flagNuevaOperacion==1)
                        {
                            pantalla.setText("");
                            signoOperacion=null;
                            flagNuevaOperacion=0;
                        }
                        textonscreen = (EditText) findViewById(R.id.Pantalla);
                        String texto = textonscreen.getText().toString() + "3";//Se coge lo que haya escrito en "pantalla" y se le añade un 3
                        pantalla.setText(texto);//Se actualiza el texto en pantalla
                        botonpunto.setEnabled(true);
                        botonmas.setEnabled(true);
                        botonmenos.setEnabled(true);
                        botonx.setEnabled(true);
                        botondiv.setEnabled(true);
                        botonigual.setEnabled(true);
                        botonsin.setEnabled(false);
                        botoncos.setEnabled(false);
                        botontan.setEnabled(false);
                    }
                });
                boton4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton 4
                        if (flagNuevaOperacion==1)
                        {
                            pantalla.setText("");
                            signoOperacion=null;
                            flagNuevaOperacion=0;
                        }
                        textonscreen = (EditText) findViewById(R.id.Pantalla);
                        String texto = textonscreen.getText().toString() + "4";//Se coge lo que haya escrito en "pantalla" y se le añade un 4
                        pantalla.setText(texto);//Se actualiza el texto en pantalla
                        botonpunto.setEnabled(true);
                        botonmas.setEnabled(true);
                        botonmenos.setEnabled(true);
                        botonx.setEnabled(true);
                        botondiv.setEnabled(true);
                        botonigual.setEnabled(true);
                        botonsin.setEnabled(false);
                        botoncos.setEnabled(false);
                        botontan.setEnabled(false);
                    }
                });
                boton5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton 5
                        if (flagNuevaOperacion==1)
                        {
                            pantalla.setText("");
                            signoOperacion=null;
                            flagNuevaOperacion=0;
                        }
                        textonscreen = (EditText) findViewById(R.id.Pantalla);
                        String texto = textonscreen.getText().toString() + "5";//Se coge lo que haya escrito en "pantalla" y se le añade un 5
                        pantalla.setText(texto);//Se actualiza el texto en pantalla
                        botonpunto.setEnabled(true);
                        botonmas.setEnabled(true);
                        botonmenos.setEnabled(true);
                        botonx.setEnabled(true);
                        botondiv.setEnabled(true);
                        botonigual.setEnabled(true);
                        botonsin.setEnabled(false);
                        botoncos.setEnabled(false);
                        botontan.setEnabled(false);
                    }
                });
                boton6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton 6
                        if (flagNuevaOperacion==1)
                        {
                            pantalla.setText("");
                            signoOperacion=null;
                            flagNuevaOperacion=0;
                        }
                        textonscreen = (EditText) findViewById(R.id.Pantalla);
                        String texto = textonscreen.getText().toString() + "6";//Se coge lo que haya escrito en "pantalla" y se le añade un 6
                        pantalla.setText(texto);//Se actualiza el texto en pantalla
                        botonpunto.setEnabled(true);
                        botonmas.setEnabled(true);
                        botonmenos.setEnabled(true);
                        botonx.setEnabled(true);
                        botondiv.setEnabled(true);
                        botonigual.setEnabled(true);
                        botonsin.setEnabled(false);
                        botoncos.setEnabled(false);
                        botontan.setEnabled(false);
                    }
                });
                boton7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton 7
                        if (flagNuevaOperacion==1)
                        {
                            pantalla.setText("");
                            signoOperacion=null;
                            flagNuevaOperacion=0;
                        }
                        textonscreen = (EditText) findViewById(R.id.Pantalla);
                        String texto = textonscreen.getText().toString() + "7";//Se coge lo que haya escrito en "pantalla" y se le añade un 7
                        pantalla.setText(texto);//Se actualiza el texto en pantalla
                        botonpunto.setEnabled(true);
                        botonmas.setEnabled(true);
                        botonmenos.setEnabled(true);
                        botonx.setEnabled(true);
                        botondiv.setEnabled(true);
                        botonigual.setEnabled(true);
                        botonsin.setEnabled(false);
                        botoncos.setEnabled(false);
                        botontan.setEnabled(false);
                    }
                });
                boton8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) { //Al clicar el boton 8
                        if (flagNuevaOperacion==1)
                        {
                            pantalla.setText("");
                            signoOperacion=null;
                            flagNuevaOperacion=0;

                        }
                        textonscreen = (EditText) findViewById(R.id.Pantalla);
                        String texto = textonscreen.getText().toString() + "8";//Se coge lo que haya escrito en "pantalla" y se le añade un 8
                        pantalla.setText(texto);//Se actualiza el texto en pantalla
                        botonpunto.setEnabled(true);
                        botonmas.setEnabled(true);
                        botonmenos.setEnabled(true);
                        botonx.setEnabled(true);
                        botondiv.setEnabled(true);
                        botonigual.setEnabled(true);
                        botonsin.setEnabled(false);
                        botoncos.setEnabled(false);
                        botontan.setEnabled(false);
                    }
                });
                boton9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton 9
                        if (flagNuevaOperacion==1)
                        {
                            if(pantalla.getText().toString().equals("∞"))
                            {
                                pantalla.setText("");
                                signoOperacion=null;
                                flagNuevaOperacion=0;
                            }
                            else {
                                textonscreen=(EditText) findViewById(R.id.Pantalla);
                                operando1=Double.parseDouble(textonscreen.getText().toString());

                            }

                        }
                        textonscreen = (EditText) findViewById(R.id.Pantalla);
                        String texto = textonscreen.getText().toString() + "9";//Se coge lo que haya escrito en "pantalla" y se le añade un 9
                        pantalla.setText(texto);//Se actualiza el texto en pantalla
                        botonpunto.setEnabled(true);
                        botonmas.setEnabled(true);
                        botonmenos.setEnabled(true);
                        botonx.setEnabled(true);
                        botondiv.setEnabled(true);
                        botonigual.setEnabled(true);
                        botonsin.setEnabled(false);
                        botoncos.setEnabled(false);
                        botontan.setEnabled(false);
                    }
                });
                botonpunto.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton .
                        textonscreen = (EditText) findViewById(R.id.Pantalla);
                        String texto = textonscreen.getText().toString() + ".";//Se coge lo que haya escrito en "pantalla" y se le añade un .
                        pantalla.setText(texto);//Se actualiza el texto en pantalla
                    }
                });
                botonsin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (flagNuevaOperacion==1)
                        {
                            pantalla.setText("");
                            signoOperacion=null;
                            flagNuevaOperacion=0;
                        }
                        botonpunto.setEnabled(false);
                        botonmas.setEnabled(false);
                        botonmenos.setEnabled(false);
                        botonx.setEnabled(false);
                        botondiv.setEnabled(false);
                        botonigual.setEnabled(false);
                        botonsin.setEnabled(false);
                        botoncos.setEnabled(false);
                        botontan.setEnabled(false);
                        flagsin=1;
                    }
                });
        botoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagNuevaOperacion == 1) {
                    pantalla.setText("");
                    signoOperacion=null;
                    flagNuevaOperacion = 0;

                }
                botonpunto.setEnabled(false);
                botonmas.setEnabled(false);
                botonmenos.setEnabled(false);
                botonx.setEnabled(false);
                botondiv.setEnabled(false);
                botonigual.setEnabled(false);
                botonsin.setEnabled(false);
                botoncos.setEnabled(false);
                botontan.setEnabled(false);
                flagcos = 1;
            }
        });
        botontan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagNuevaOperacion == 1) {
                    pantalla.setText("");
                    signoOperacion=null;
                    flagNuevaOperacion = 0;
                }
                botonpunto.setEnabled(false);
                botonmas.setEnabled(false);
                botonmenos.setEnabled(false);
                botonx.setEnabled(false);
                botondiv.setEnabled(false);
                botonigual.setEnabled(false);
                botonsin.setEnabled(false);
                botoncos.setEnabled(false);
                botontan.setEnabled(false);
                flagtan = 1;
            }
        });
                botonmas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton +
                        botonsin.setEnabled(true);
                        botoncos.setEnabled(true);
                        botontan.setEnabled(true);

                        if (flagNuevaOperacion==1)
                        {
                            if(pantalla.getText().toString().equals("∞"))
                            {
                                pantalla.setText("");
                                signoOperacion=null;
                                flagNuevaOperacion=0;
                            }
                            else {
                                textonscreen=(EditText) findViewById(R.id.Pantalla);
                                operando1=Double.parseDouble(textonscreen.getText().toString());
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.sin(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.sin(operando1);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.cos(operando1);
                                    }
                                    else{
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.cos(operando1);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.tan(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.tan(operando1);
                                    }
                                    flagtan=0;
                                }

                            }
                            operando2=0;//Se vacia el operando2 para poder encadenar esta operación de suma
                            op2flag0=0;
                            signoOperacion="+";//Se guarda el signo de la operación, que se realiza cuando el usuario clique en otro signo o en "="
                            pantalla.setText("");
                            flagNuevaOperacion=0;
                        }


                        else{
                            textonscreen = (EditText) findViewById(R.id.Pantalla);

                            if ((operando1!=0)&&(operando2==0)&&(op2flag0==0))//Si el operando1 ya está lleno, y el operando2 está vacio (flag0 sirve para diferenciar cuando operando2 es null (0) y cuando es 0 (1))
                            {
                                operando2=Double.parseDouble(textonscreen.getText().toString());//Se asigna lo que habia en pantalla antes de clicar "+" al operando2
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.sin(operando1);
                                    }
                                    else {
                                        operando2=(Math.PI/180)*operando1;
                                        operando2=Math.sin(operando1);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.cos(operando1);
                                    }
                                    else{
                                        operando2=(Math.PI/180)*operando1;
                                        operando2=Math.cos(operando1);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.tan(operando1);
                                    }
                                    else {
                                        operando2=(Math.PI/180)*operando1;
                                        operando2=Math.tan(operando1);
                                    }
                                    flagtan=0;
                                }
                                if (operando2==0)//Si habia un cero, el operando2 es 0 (ya no es null)
                                    op2flag0=1;
                                if (signoOperacion.equals("+"))//Al tener ahora operando1 y operando2 ocupados, se juntan los dos en operando1 para tener operando2 libre y poder seguir haciendo operaciones encadenadas hasta que se clique "="
                                    operando1=operando1+operando2;//Si el signo clicado antes de clicar este "+" era un "+", se suman.
                                if (signoOperacion.equals("-"))//Si el signo clicado antes de clicar este "+" era un "-", se restan.
                                    operando1=operando1-operando2;
                                if(signoOperacion.equals("*"))//Si el signo clicado antes de clicar este "+" era un "*", se multiplican.
                                    operando1=operando1*operando2;
                                if (signoOperacion.equals("/"))//Si el signo clicado antes de clicar este "+" era un "/", se dividen.
                                {
                                    if (op2flag0==1)//Si operando2 era un 0, el resultado es infinito
                                    {
                                        pantalla.setText("∞");
                                        flagNuevaOperacion=1;
                                    }

                                    else operando1=operando1/operando2;
                                }

                            }
                            if(operando1==0)//Si no hay nada en el operando1, lo que hay antes de clicar "+" se convierte en el operando1.
                            {
                                operando1=Double.parseDouble(textonscreen.getText().toString());
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.sin(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.sin(operando1);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.cos(operando1);
                                    }
                                    else{
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.cos(operando1);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.tan(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.tan(operando1);
                                    }
                                    flagtan=0;
                                }

                            }
                            operando2=0;//Se vacia el operando2 para poder encadenar esta operación de suma
                            op2flag0=0;
                            signoOperacion="+";//Se guarda el signo de la operación, que se realiza cuando el usuario clique en otro signo o en "="
                            pantalla.setText("");
                        }

                    }
                });
                botonmenos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton -
                        botonsin.setEnabled(true);
                        botoncos.setEnabled(true);
                        botontan.setEnabled(true);
                        if (flagNuevaOperacion==1)
                        {
                            if(pantalla.getText().toString().equals("∞"))
                            {
                                pantalla.setText("");
                                signoOperacion=null;
                                flagNuevaOperacion=0;
                            }
                            else {
                                textonscreen=(EditText) findViewById(R.id.Pantalla);
                                operando1=Double.parseDouble(textonscreen.getText().toString());
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.sin(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.sin(operando1);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.cos(operando1);
                                    }
                                    else{
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.cos(operando1);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.tan(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.tan(operando1);
                                    }
                                    flagtan=0;
                                }

                            }
                            operando2=0;//Se vacia el operando2 para poder encadenar esta operación de resta
                            op2flag0=0;
                            signoOperacion="-";//Se guarda el signo de la operación, que se realiza cuando el usuario clique en otro signo o en "="
                            pantalla.setText("");
                            flagNuevaOperacion=0;

                        }


                        else{
                            textonscreen = (EditText) findViewById(R.id.Pantalla);

                            if ((operando1!=0)&&(operando2==0)&&(op2flag0==0))//Si el operando1 ya está lleno, y el operando2 está vacio (flag0 sirve para diferenciar cuando operando2 es null (0) y cuando es 0 (1))
                            {
                                operando2=Double.parseDouble(textonscreen.getText().toString());//Se asigna lo que habia en pantalla antes de clicar "-" al operando2
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.sin(operando1);
                                    }
                                    else {
                                        operando2=(Math.PI/180)*operando1;
                                        operando2=Math.sin(operando1);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.cos(operando1);
                                    }
                                    else{
                                        operando2=(Math.PI/180)*operando1;
                                        operando2=Math.cos(operando1);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.tan(operando1);
                                    }
                                    else {
                                        operando2=(Math.PI/180)*operando1;
                                        operando2=Math.tan(operando1);
                                    }
                                    flagtan=0;
                                }
                                if (operando2==0)//Si habia un cero, el operando2 es 0 (ya no es null)
                                    op2flag0=1;
                                if (signoOperacion.equals("+"))//Al tener ahora operando1 y operando2 ocupados, se juntan los dos en operando1 para tener operando2 libre y poder seguir haciendo operaciones encadenadas hasta que se clique "="
                                    operando1=operando1+operando2;//Si el signo clicado antes de clicar este "-" era un "+", se suman.
                                if (signoOperacion.equals("-"))//Si el signo clicado antes de clicar este "-" era un "-", se restan.
                                    operando1=operando1-operando2;
                                if(signoOperacion.equals("*"))//Si el signo clicado antes de clicar este "-" era un "*", se multiplican.
                                    operando1=operando1*operando2;
                                if (signoOperacion.equals("/"))//Si el signo clicado antes de clicar este "-" era un "/", se dividen.
                                {
                                    if (op2flag0==1)//Si operando2 era un 0, el resultado es infinito
                                    {
                                        pantalla.setText("∞");
                                        flagNuevaOperacion=1;
                                    }
                                    else operando1=operando1/operando2;
                                }

                            }
                            if(operando1==0)//Si no hay nada en el operando1, lo que hay antes de clicar "-" se convierte en el operando1.
                            {
                                operando1=Double.parseDouble(textonscreen.getText().toString());
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.sin(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.sin(operando1);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.cos(operando1);
                                    }
                                    else{
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.cos(operando1);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.tan(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.tan(operando1);
                                    }
                                    flagtan=0;
                                }

                            }
                            operando2=0;//Se vacia el operando2 para poder encadenar esta operación de resta
                            op2flag0=0;
                            signoOperacion="-";//Se guarda el signo de la operación, que se realiza cuando el usuario clique en otro signo o en "="
                            pantalla.setText("");

                        }


                    }
                });
                botonx.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton "*"
                        botonsin.setEnabled(true);
                        botoncos.setEnabled(true);
                        botontan.setEnabled(true);
                        if (flagNuevaOperacion==1)
                        {
                            if(pantalla.getText().toString().equals("∞"))
                            {
                                pantalla.setText("");
                                signoOperacion=null;
                                flagNuevaOperacion=0;
                            }
                            else {
                                textonscreen=(EditText) findViewById(R.id.Pantalla);
                                operando1=Double.parseDouble(textonscreen.getText().toString());
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.sin(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.sin(operando1);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.cos(operando1);
                                    }
                                    else{
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.cos(operando1);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.tan(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.tan(operando1);
                                    }
                                    flagtan=0;
                                }
                            }
                            operando2=0;//Se vacia el operando2 para poder encadenar esta operación de multiplicación
                            op2flag0=0;
                            signoOperacion="*";//Se guarda el signo de la operación, que se realiza cuando el usuario clique en otro signo o en "="
                            pantalla.setText("");
                            flagNuevaOperacion=0;
                            }


                        else{
                            textonscreen = (EditText) findViewById(R.id.Pantalla);

                            if ((operando1!=0)&&(operando2==0)&&(op2flag0==0))//Si el operando1 ya está lleno, y el operando2 está vacio (flag0 sirve para diferenciar cuando operando2 es null (0) y cuando es 0 (1))
                            {
                                operando2=Double.parseDouble(textonscreen.getText().toString());//Se asigna lo que habia en pantalla antes de clicar "*" al operando2
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.sin(operando1);
                                    }
                                    else {
                                        operando2=(Math.PI/180)*operando1;
                                        operando2=Math.sin(operando1);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.cos(operando1);
                                    }
                                    else{
                                        operando2=(Math.PI/180)*operando1;
                                        operando2=Math.cos(operando1);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.tan(operando1);
                                    }
                                    else {
                                        operando2=(Math.PI/180)*operando1;
                                        operando2=Math.tan(operando1);
                                    }
                                    flagtan=0;
                                }
                                if (operando2==0)//Si habia un cero, el operando2 es 0 (ya no es null)
                                    op2flag0=1;
                                if (signoOperacion.equals("+"))//Al tener ahora operando1 y operando2 ocupados, se juntan los dos en operando1 para tener operando2 libre y poder seguir haciendo operaciones encadenadas hasta que se clique "="
                                    operando1=operando1+operando2;//Si el signo clicado antes de clicar este "*" era un "+", se suman.
                                if (signoOperacion.equals("-"))//Si el signo clicado antes de clicar este "*" era un "-", se restan.
                                    operando1=operando1-operando2;
                                if(signoOperacion.equals("*"))//Si el signo clicado antes de clicar este "*" era un "*", se multiplican.
                                    operando1=operando1*operando2;
                                if (signoOperacion.equals("/"))//Si el signo clicado antes de clicar este "*" era un "/", se dividen.
                                {
                                    if (op2flag0==1)//Si operando2 era un 0, el resultado es infinito
                                    {
                                        pantalla.setText("∞");
                                        flagNuevaOperacion=1;
                                    }
                                    else operando1=operando1/operando2;
                                }

                            }
                            if(operando1==0)//Si no hay nada en el operando1, lo que hay antes de clicar "*" se convierte en el operando1.
                            {
                                operando1=Double.parseDouble(textonscreen.getText().toString());
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.sin(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.sin(operando1);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.cos(operando1);
                                    }
                                    else{
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.cos(operando1);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.tan(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.tan(operando1);
                                    }
                                    flagtan=0;
                                }
                            }
                            operando2=0;//Se vacia el operando2 para poder encadenar esta operación de multiplicación
                            op2flag0=0;
                            signoOperacion="*";//Se guarda el signo de la operación, que se realiza cuando el usuario clique en otro signo o en "="
                            pantalla.setText("");

                        }


                    }
                });
                botondiv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton "/"
                        botonsin.setEnabled(true);
                        botoncos.setEnabled(true);
                        botontan.setEnabled(true);
                        if (flagNuevaOperacion==1)
                        {
                            if(pantalla.getText().toString().equals("∞"))
                            {
                                pantalla.setText("");
                                signoOperacion=null;
                                flagNuevaOperacion=0;
                            }
                            else {
                                textonscreen=(EditText) findViewById(R.id.Pantalla);
                                operando1=Double.parseDouble(textonscreen.getText().toString());
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.sin(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.sin(operando1);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.cos(operando1);
                                    }
                                    else{
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.cos(operando1);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.tan(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.tan(operando1);
                                    }
                                    flagtan=0;
                                }

                            }
                            operando2=0;//Se vacia el operando2 para poder encadenar esta operación de división
                            op2flag0=0;
                            signoOperacion="/";//Se guarda el signo de la operación, que se realiza cuando el usuario clique en otro signo o en "="
                            pantalla.setText("");
                            flagNuevaOperacion=0;
                            }


                        else{
                            textonscreen = (EditText) findViewById(R.id.Pantalla);

                            if ((operando1!=0)&&(operando2==0)&&(op2flag0==0))//Si el operando1 ya está lleno, y el operando2 está vacio (flag0 sirve para diferenciar cuando operando2 es null (0) y cuando es 0 (1))
                            {
                                operando2=Double.parseDouble(textonscreen.getText().toString());//Se asigna lo que habia en pantalla antes de clicar "/" al operando2
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.sin(operando1);
                                    }
                                    else {
                                        operando2=(Math.PI/180)*operando1;
                                        operando2=Math.sin(operando1);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.cos(operando1);
                                    }
                                    else{
                                        operando2=(Math.PI/180)*operando1;
                                        operando2=Math.cos(operando1);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.tan(operando1);
                                    }
                                    else {
                                        operando2=(Math.PI/180)*operando1;
                                        operando2=Math.tan(operando1);
                                    }
                                    flagtan=0;
                                }
                                if (operando2==0)//Si habia un cero, el operando2 es 0 (ya no es null)
                                    op2flag0=1;
                                if (signoOperacion.equals("+"))//Al tener ahora operando1 y operando2 ocupados, se juntan los dos en operando1 para tener operando2 libre y poder seguir haciendo operaciones encadenadas hasta que se clique "="
                                    operando1=operando1+operando2;//Si el signo clicado antes de clicar este "/" era un "+", se suman.
                                if (signoOperacion.equals("-"))//Si el signo clicado antes de clicar este "/" era un "-", se restan.
                                    operando1=operando1-operando2;
                                if(signoOperacion.equals("*"))//Si el signo clicado antes de clicar este "/" era un "*", se multiplican.
                                    operando1=operando1*operando2;
                                if (signoOperacion.equals("/"))//Si el signo clicado antes de clicar este "/" era un "/", se dividen.
                                {
                                    if (op2flag0==1)//Si operando2 era un 0, el resultado es infinito
                                    {
                                        pantalla.setText("∞");
                                        flagNuevaOperacion=1;
                                    }
                                    else operando1=operando1/operando2;
                                }

                            }
                            if(operando1==0)//Si no hay nada en el operando1, lo que hay antes de clicar "/" se convierte en el operando1.
                            {
                                operando1=Double.parseDouble(textonscreen.getText().toString());
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.sin(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.sin(operando1);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.cos(operando1);
                                    }
                                    else{
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.cos(operando1);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando1=Math.tan(operando1);
                                    }
                                    else {
                                        operando1=(Math.PI/180)*operando1;
                                        operando1=Math.tan(operando1);
                                    }
                                    flagtan=0;
                                }

                            }
                            operando2=0;//Se vacia el operando2 para poder encadenar esta operación de división
                            op2flag0=0;
                            signoOperacion="/";//Se guarda el signo de la operación, que se realiza cuando el usuario clique en otro signo o en "="
                            pantalla.setText("");

                        }


                    }
                });
                botonclear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        operando1=0;
                        operando2=0;
                        op2flag0=0;
                        flagsin=0;
                        flagcos=0;
                        flagtan=0;
                        pantalla.setText("");
                        signoOperacion=null;
                    }
                });
                botonigual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {//Al clicar el boton =
                        if (signoOperacion==null)
                        {
                            textonscreen=(EditText) findViewById(R.id.Pantalla);
                            operando1=Double.parseDouble(textonscreen.getText().toString());
                            if (flagsin==1)
                            {
                                if (flaggrados==0)
                                {
                                    resultado=Math.sin(operando1);
                                }
                                else {
                                    resultado=(Math.PI/180)*operando1;
                                    resultado=Math.sin(resultado);
                                }
                                flagsin=0;
                                pantalla.setText(String.valueOf(resultado));
                            }
                            if (flagcos==1)
                            {
                                if (flaggrados==0)
                                {
                                    resultado=Math.cos(operando1);
                                }
                                else
                                {
                                    resultado=(Math.PI/180)*operando1;
                                    resultado=Math.cos(resultado);
                                }
                                flagcos=0;
                                pantalla.setText(String.valueOf(resultado));
                            }
                            if (flagtan==1)
                            {
                                if(flaggrados==0)
                                {
                                    resultado=Math.tan(operando1);
                                }
                                else {
                                    resultado=(Math.PI/180)*operando1;
                                    resultado=Math.tan(resultado);
                                }
                                flagtan=0;
                                pantalla.setText(String.valueOf(resultado));
                            }

                        }
                        else{
                            textonscreen=(EditText) findViewById(R.id.Pantalla);
                            operando2=Double.parseDouble(textonscreen.getText().toString());//Al clicar "=", lo que hay en "pantalla" se convierte en el operando2
                            if ((flagsin==1)||(flagcos==1)||(flagtan==1))
                            {
                                if (flagsin==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.sin(operando2);
                                    }
                                    else {
                                        operando2=(Math.PI/180)*operando2;
                                        operando2=Math.sin(operando2);
                                    }
                                    flagsin=0;
                                }

                                if (flagcos==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.cos(operando2);
                                    }
                                    else{
                                        operando2=(Math.PI/180)*operando2;
                                        operando2=Math.cos(operando2);
                                    }
                                    flagcos=0;
                                }

                                if (flagtan==1)
                                {
                                    if(flaggrados==0)
                                    {
                                        operando2=Math.tan(operando2);
                                    }
                                    else {
                                        operando2=(Math.PI/180)*operando2;
                                        operando2=Math.tan(operando2);
                                    }
                                    flagtan=0;
                                }

                            }
                            if (operando2==0)//Si habia un 0, el operando2 es 0 (ya no es null)
                                op2flag0=1;
                            if (signoOperacion.equals("+"))//Si el signo clicado antes de escribir el operando2 y pulsar "=" era un "+", se suma a operando1 (el cual es un valor que contiene el resultado de todas las operaciones hechas hasta antes de pulsar "=", menos la última)
                            {
                                resultado=operando1+operando2;//Resultado final. Última operación hecha antes de clicar "="
                                pantalla.setText(String.valueOf(resultado));//Se muestra en pantalla
                            }

                            if (signoOperacion.equals("-"))//Si el signo clicado antes de escribir el operando2 y pulsar "=" era un "-", se resta a operando1 (el cual es un valor que contiene el resultado de todas las operaciones hechas hasta antes de pulsar "=", menos la última)
                            {
                                resultado=operando1-operando2;//Resultado final. Última operación hecha antes de clicar "="
                                pantalla.setText(String.valueOf(resultado));//Se muestra en pantalla
                            }
                            if(signoOperacion.equals("*"))//Si el signo clicado antes de escribir el operando2 y pulsar "=" era un "*", se multiplica a operando1 (el cual es un valor que contiene el resultado de todas las operaciones hechas hasta antes de pulsar "=", menos la última)
                            {
                                resultado=operando1*operando2;//Resultado final. Última operación hecha antes de clicar "="
                                pantalla.setText(String.valueOf(resultado));//Se muestra en pantalla
                            }
                            if (signoOperacion.equals("/"))//Si el signo clicado antes de escribir el operando2 y pulsar "=" era un "/", se divide a operando1 (el cual es un valor que contiene el resultado de todas las operaciones hechas hasta antes de pulsar "=", menos la última)
                            {
                                if (op2flag0==1)//Si el operando2 es 0, el resultado es infinito
                                {
                                    pantalla.setText("∞");

                                }
                                else
                                {
                                    resultado=operando1/operando2;//Resultado final. Última operación hecha antes de clicar "="
                                    pantalla.setText(String.valueOf(resultado));//Se muestra en pantalla
                                }
                            }
                        }

                        operando1=resultado;//Al acabar la operación (se ha pulsado "="), se resetean los operandos
                        operando2=0;
                        op2flag0=0;
                        flagNuevaOperacion=1;
                        botonsin.setEnabled(true);
                        botoncos.setEnabled(true);
                        botontan.setEnabled(true);
                        botonpunto.setEnabled(false);

                    }

                });



    }
}
