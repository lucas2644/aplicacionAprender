package aprendermatematicas.aprender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by lucas on 12/08/2017.
 */

public class sumayresta extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sumayresta);
    }
    public void Pruebasyr(View view) {
        Intent i = new Intent(this, pruebasumayresta.class);
        startActivity(i);
    }
}
