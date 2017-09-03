package aprendermatematicas.aprender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static aprendermatematicas.aprender.R.layout.pruebas;

/**
 * Created by lucas on 13/08/2017.
 */

public class pruebadivisionymultiplicacion extends Activity {
    private libreriadepreguntas mlibreriadepreguntas = new libreriadepreguntas();
    private TextView mpuntajevista;
    private TextView mpreguntavista;
    private Button mbutonopcion1;
    private Button mbutonopcion2;
    private Button mbutonopcion3;

    private String mrespuestasP2;
    private int mpuntaje = 0;
    private int mnumerodepregunta = 0;
    private int mcontadordepregunta = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(pruebas);


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
                if (mbutonopcion1.getText() == mrespuestasP2) {
                    mpuntaje = mpuntaje + 1;
                    actualizarpuntaje(mpuntaje);
                    actualizarpregunta();
                    mcontadordepregunta = mcontadordepregunta + 1;
                    Toast.makeText(pruebadivisionymultiplicacion.this, "correcto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(pruebadivisionymultiplicacion.this, "incorrecto", Toast.LENGTH_SHORT).show();
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
                if (mbutonopcion2.getText() == mrespuestasP2) {
                    mpuntaje = mpuntaje + 1;
                    actualizarpuntaje(mpuntaje);
                    actualizarpregunta();
                    mcontadordepregunta = mcontadordepregunta + 1;
                    Toast.makeText(pruebadivisionymultiplicacion.this, "correcto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(pruebadivisionymultiplicacion.this, "incorrecto", Toast.LENGTH_SHORT).show();
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
                if (mbutonopcion3.getText() == mrespuestasP2) {
                    mpuntaje = mpuntaje + 1;
                    actualizarpuntaje(mpuntaje);
                    actualizarpregunta();
                    mcontadordepregunta = mcontadordepregunta + 1;
                    Toast.makeText(pruebadivisionymultiplicacion.this, "correcto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(pruebadivisionymultiplicacion.this, "incorrecto", Toast.LENGTH_SHORT).show();
                    actualizarpregunta();
                    mcontadordepregunta = mcontadordepregunta + 1;
                }
            }


        });

    }

    //fin de opcion 3

    private void actualizarpregunta() {
        if (mnumerodepregunta<10) {
            mpreguntavista.setText(mlibreriadepreguntas.obtenerpregP2(mnumerodepregunta));
            mbutonopcion1.setText(mlibreriadepreguntas.obteneropcion1P2(mnumerodepregunta));
            mbutonopcion2.setText(mlibreriadepreguntas.obteneropcion2P2(mnumerodepregunta));
            mbutonopcion3.setText(mlibreriadepreguntas.obteneropcion3P2(mnumerodepregunta));


            mrespuestasP2 = mlibreriadepreguntas.obtenerrespuestasP2(mnumerodepregunta);
            mnumerodepregunta++;
        }else {
            mpreguntavista.setText(mlibreriadepreguntas.obtenerpregP2(9));
            mbutonopcion1.setText(mlibreriadepreguntas.obteneropcion1P2(9));
            mbutonopcion2.setText(mlibreriadepreguntas.obteneropcion2P2(9));
            mbutonopcion3.setText(mlibreriadepreguntas.obteneropcion3P2(9));
            mrespuestasP2 = mlibreriadepreguntas.obtenerrespuestasP2(9);
            Toast.makeText(pruebadivisionymultiplicacion.this, "tu puntaje es "+mpuntaje, Toast.LENGTH_SHORT).show();
        }
    }


    private void actualizarpuntaje(int punto) {
        mpuntajevista.setText("" + mpuntaje);
    }

    public void iralinicio(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void resultadofinal(View view) {
        if (mcontadordepregunta >= 10) {
            Toast.makeText(pruebadivisionymultiplicacion.this, "tu puntaje es"+mpuntaje, Toast.LENGTH_SHORT).show();

        }


    }


}
