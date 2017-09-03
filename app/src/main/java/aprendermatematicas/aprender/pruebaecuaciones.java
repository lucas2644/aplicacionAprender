package aprendermatematicas.aprender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lucas on 13/08/2017.
 */

public class pruebaecuaciones extends Activity {
    private libreriadepreguntas mlibreriadepreguntas = new libreriadepreguntas();
    private TextView mpuntajevista;
    private TextView mpreguntavista;
    private Button mbutonopcion1;
    private Button mbutonopcion2;
    private Button mbutonopcion3;

    private String mrespuestasP3;
    private int mpuntaje = 0;
    private int mnumerodepregunta = 0;
    private int mcontadordepregunta = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pruebas);


        mpuntajevista = (TextView) findViewById(R.id.puntaje);
        mpreguntavista = (TextView) findViewById(R.id.pregunta);
        mbutonopcion1 = (Button) findViewById(R.id.opcion1);
        mbutonopcion2 = (Button) findViewById(R.id.opcion2);
        mbutonopcion3 = (Button) findViewById(R.id.opcion3);

        actualizarpregunta();

        //opcion 1
        mbutonopcion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mbutonopcion1.getText() == mrespuestasP3) {
                    mpuntaje = mpuntaje + 1;
                    actualizarpuntaje(mpuntaje);
                    actualizarpregunta();
                    mcontadordepregunta = mcontadordepregunta + 1;
                    Toast.makeText(pruebaecuaciones.this, "correcto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(pruebaecuaciones.this, "incorrecto", Toast.LENGTH_SHORT).show();
                    actualizarpregunta();
                    mcontadordepregunta = mcontadordepregunta + 1;
                }
            }
        });
        //fin de opcion 1

        //opcion 2
        mbutonopcion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mbutonopcion2.getText() == mrespuestasP3) {
                    mpuntaje = mpuntaje + 1;
                    actualizarpuntaje(mpuntaje);
                    actualizarpregunta();
                    mcontadordepregunta = mcontadordepregunta + 1;
                    Toast.makeText(pruebaecuaciones.this, "correcto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(pruebaecuaciones.this, "incorrecto", Toast.LENGTH_SHORT).show();
                    actualizarpregunta();
                    mcontadordepregunta = mcontadordepregunta + 1;
                }
            }
        });

        //fin de opcion 2

        //opcion 3
        mbutonopcion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mbutonopcion3.getText() == mrespuestasP3) {
                    mpuntaje = mpuntaje + 1;
                    actualizarpuntaje(mpuntaje);
                    actualizarpregunta();
                    mcontadordepregunta = mcontadordepregunta + 1;
                    Toast.makeText(pruebaecuaciones.this, "correcto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(pruebaecuaciones.this, "incorrecto", Toast.LENGTH_SHORT).show();
                    actualizarpregunta();
                    mcontadordepregunta = mcontadordepregunta + 1;
                }
            }


        });

    }

    //fin de opcion 3

    private void actualizarpregunta() {
        if (mnumerodepregunta<10) {
            mpreguntavista.setText(mlibreriadepreguntas.obtenerpregP3(mnumerodepregunta));
            mbutonopcion1.setText(mlibreriadepreguntas.obteneropcion1P3(mnumerodepregunta));
            mbutonopcion2.setText(mlibreriadepreguntas.obteneropcion2P3(mnumerodepregunta));
            mbutonopcion3.setText(mlibreriadepreguntas.obteneropcion3P3(mnumerodepregunta));


            mrespuestasP3 = mlibreriadepreguntas.obtenerrespuestasP3(mnumerodepregunta);
            mnumerodepregunta++;
        }else {
            mpreguntavista.setText(mlibreriadepreguntas.obtenerpregP3(9));
            mbutonopcion1.setText(mlibreriadepreguntas.obteneropcion1P3(9));
            mbutonopcion2.setText(mlibreriadepreguntas.obteneropcion2P3(9));
            mbutonopcion3.setText(mlibreriadepreguntas.obteneropcion3P3(9));
            mrespuestasP3 = mlibreriadepreguntas.obtenerrespuestasP3(9);
            Toast.makeText(pruebaecuaciones.this, "tu puntaje es "+mpuntaje, Toast.LENGTH_SHORT).show();
        }
    }

    private void actualizarpuntaje(int punto) {
        mpuntajevista.setText("" + mpuntaje);
    }

    public void iralinicio(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void resultadofinal() {
        if (mcontadordepregunta >= 9) {
            Toast.makeText(pruebaecuaciones.this, "tu puntaje es"+mpuntaje, Toast.LENGTH_SHORT).show();

        }


    }


}
