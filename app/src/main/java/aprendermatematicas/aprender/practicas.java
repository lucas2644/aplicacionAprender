package aprendermatematicas.aprender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by lucas on 12/08/2017.
 */

public class practicas extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practicas);
    }
    public void Pruebasyr(View view) {
        Intent i = new Intent(this, pruebasumayresta.class);
        startActivity(i);
    }
    public void Pruebadym(View view) {
        Intent i = new Intent(this, pruebadivisionymultiplicacion.class);
        startActivity(i);
    }

    public void Pruebaecu(View view) {
        Intent i = new Intent(this, pruebaecuaciones.class);
        startActivity(i);
    }

    public void Pruebafin (View view){
        Intent i = new Intent(this, pruebafinal.class);
        startActivity(i);
    }
}