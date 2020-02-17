package cuadrantes.demo;

public class verificar {
    punto prueba;


    public int negativepos (int x){
        if (x>= 0){
            return 1;
        }else{
            return 0;
        }


    }

    public static String check(int x, int y){
        if(x >=0 & y >=0){
            return "cuadrante 1";
        }else if(x>=0 & y <0){
            return "cuadrante 4";
        } else if (x<0 & y<0){
            return "cuadrante 3";
        }else if(x<0 & y>=0){
            return "cuadrante 2";
        }else {
            return "invalido";
        }

    }
}
