package aprendermatematicas.aprender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void syr(View view) {
        Intent i = new Intent(this, sumayresta.class );
        startActivity(i);
    }
    public void dym(View view) {
        Intent i = new Intent(this, divisionymultiplicacion.class );
        startActivity(i);
    }
    public void ecua(View view) {
        Intent i = new Intent(this, ecuaciones.class );
        startActivity(i);
    }
    public void prac(View view) {
        Intent i = new Intent(this, practicas.class );
        startActivity(i);
    }
}
