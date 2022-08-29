package br.edu.uniaeso.q8;
public class GeometryUtils {

    public static double distancia(Ponto p1,Ponto p2){
        double d = 0,powX = 0, powY = 0;
        powX = Math.pow(p2.getX() - p1.getX(),2);
        powY =Math.pow(p2.getY() - p1.getY(), 2);
        d = Math.sqrt(powX + powY);
        return d;
    }
}
