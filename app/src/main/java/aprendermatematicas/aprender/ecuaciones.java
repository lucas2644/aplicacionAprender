package aprendermatematicas.aprender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by lucas on 12/08/2017.
 */

public class ecuaciones extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecuaciones);
    }
    public void pruebaecu(View view) {
        Intent i = new Intent(this, pruebaecuaciones.class);
        startActivity(i);
    }
}