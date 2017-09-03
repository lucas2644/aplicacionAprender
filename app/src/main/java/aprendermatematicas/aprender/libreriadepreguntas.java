package aprendermatematicas.aprender;

import android.app.Activity;

/**
 * Created by lucas on 13/08/2017.
 */

public class libreriadepreguntas extends Activity {

    //preguntas y respuestas de suma y resta
    private String mpregsumayresta [] = {
            "8+2",
            "9+9",
            "40+15",
            "18+12",
            "7+39",
            "9-6",
            "18-7",
            "88-54",
            "98-17",
            "50-25",
    };
    private String mopcionesSumayresta [][] = {
        {"12","10","9"},
        {"18","20","16"},
        {"55","51","60"},
        {"30","25","32"},
        {"40","48","46"},
        {"3","5","9"},
        {"9","11","14"},
        {"34","44","54"},
        {"81","79","83"},
        {"25","22","23"},

    };

    private String mrespuestasP1[] = {"10","18","55","30","46","3","11","34","81","25"};

    public String obtenerpregP1 (int a){
        String pregunta = mpregsumayresta[a];
        return pregunta;
    }
    public String obteneropcion1P1 (int a){
        String opcion0 = mopcionesSumayresta[a][0];
        return opcion0;

    }
    public String obteneropcion2P1 (int a){
        String opcion2 = mopcionesSumayresta[a][1];
        return opcion2;

    }
    public String obteneropcion3P1 (int a) {
        String opcion3 = mopcionesSumayresta[a][2];
        return opcion3;
    }
public String obtenerrespuestasP1 (int a) {
    String respuesta = mrespuestasP1[a];
    return respuesta;
    }

    //preguntas y respuestas de division y multiplicacion
    private String mpregdivymult [] = {
            "8/2",
            "30/6",
            "50/10",
            "70/3",
            "150/5",
            "9*9",
            "7*5",
            "12*10",
            "45*2",
            "18*3",
    };
    private String mopcionesdivymult [][] = {
            {"4","5","8"},
            {"5","6","7"},
            {"10","3","5"},
            {"15","25","20"},
            {"30","40","35"},
            {"73","84","81"},
            {"45","35","48"},
            {"110","120","112"},
            {"90","80","78"},
            {"66","54","49"},

    };

    private String mrespuestasP2[] = {"4","5","10","25","30","81","45","120","90","54"};

    public String obtenerpregP2 (int a){
        String pregunta = mpregdivymult[a];
        return pregunta;
    }
    public String obteneropcion1P2 (int a){
        String opcion0 = mopcionesdivymult[a][0];
        return opcion0;

    }
    public String obteneropcion2P2 (int a){
        String opcion2 = mopcionesdivymult[a][1];
        return opcion2;

    }
    public String obteneropcion3P2 (int a) {
        String opcion3 = mopcionesdivymult[a][2];
        return opcion3;
    }
    public String obtenerrespuestasP2 (int a) {
        String respuesta = mrespuestasP2[a];
        return respuesta;
    }



    //preguntas y respuestas de ecuaciones
    private String mpregecuaciones [] = {
            "2x-=0",
            "x-3=3-x",
            "3x+1=3-(2-2x)",
            "5x-5=2x-2",
            "2.(2x-3)=6+x",
            "2x-6-(-9x+4)=6x+5",
            "8x+7+x+4=8x+2",
            "8x+4-(8x-6)=5x+5",
            "10x-8-(4x-5)=-3x-3",
            "-6x+6-(3x-6)=-7x+2",

    };
    private String mopcionesecuaciones [][] = {
            {"x=2","x=3","x=1"},
            {"x=4","x=3","x=5"},
            {"x=0","x=9","x=-3"},
            {"x=1","x=-1","x=2"},
            {"x=4","x=-4","x=5"},
            {"x=6","x=3","x=1"},
            {"x=-9","x=-5","x=8"},
            {"x=5","x=4","x=1"},
            {"x=0","x=1","x=-1"},
            {"x=5","x=6","x=3"},



    };

    private String mrespuestasP3[] = {"x=2","x=3","x=0","x=1","x=4","x=3","x=-9","x=1","x=0","x=5"};

    public String obtenerpregP3 (int a){
        String pregunta = mpregecuaciones[a];
        return pregunta;
    }
    public String obteneropcion1P3 (int a){
        String opcion0 = mopcionesecuaciones[a][0];
        return opcion0;

    }
    public String obteneropcion2P3 (int a){
        String opcion2 = mopcionesecuaciones[a][1];
        return opcion2;

    }
    public String obteneropcion3P3 (int a) {
        String opcion3 = mopcionesecuaciones[a][2];
        return opcion3;
    }
    public String obtenerrespuestasP3 (int a) {
        String respuesta = mrespuestasP3[a];
        return respuesta;
    }

    //preguntas y respuestas de la Prueba final

    private String mpregfinal [] = {
            "55+128",
            "136/8",
            "5(x-x-1)-(1-x)=2(x-1)-4(1-x)",
            "2-(3-2(x+1))=3x+2(x-(3+2x))",
            "5*22",
            "780/4",
            "895+419",
            "1-2(1+3x-2(x+2)+3x)=-1",
            "74*11",
            "466/14",

    };
    private String mopcionesfinal [][] = {
            {"183","212","199"},
            {"17","21","14"},
            {"x=4","x E R","x=5"},
            {"x=7","x=-8","x=4"},
            {"155","170","150"},
            {"170","187","195"},
            {"1314","1410","1244"},
            {"x=4","x=1","x=6"},
            {"814","818","808"},
            {"34,5","29,5","33,2"},



    };

    private String mrespuestasP4[] = {"183","17","x E R","x=7","155","195","134","x=1","814","33,2"};

    public String obtenerpregP4 (int a){
        String pregunta = mpregfinal[a];
        return pregunta;
    }
    public String obteneropcion1P4 (int a){
        String opcion0 = mopcionesfinal[a][0];
        return opcion0;

    }
    public String obteneropcion2P4 (int a){
        String opcion2 = mopcionesfinal[a][1];
        return opcion2;

    }
    public String obteneropcion3P4 (int a) {
        String opcion3 = mopcionesfinal[a][2];
        return opcion3;
    }
    public String obtenerrespuestasP4 (int a) {
        String respuesta = mrespuestasP4[a];
        return respuesta;
    }





}


