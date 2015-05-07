
package carpanel;

public class CarPanel {

    private static double _s, _t;
    private static boolean WARN = false;

    public static double getS() {
        return _s;
    }

    public static void setS(double _s) {
        CarPanel._s = _s;
    }

    public static double getT() {
        return _t;
    }

    public static void setT(double _t) {
        CarPanel._t = _t;
    }

    public static boolean isWARN() {
        return WARN;
    }

    public static void setWARN(boolean WARN) {
        CarPanel.WARN = WARN;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new CarPanel().display_Speed(0, 0) + " " + 0d);
    }

    public double display_Speed() {
        return _s / _t;
    }
    
    public static double display_Speed(double s, double t) {
        _s = s;
        _t = t;
        if(t==0)
        {
            WARN=false;
            return 0;
        }
        double speed = s / t;
        if(speed>120)
        {
            WARN = true;
        }
        else
        {
            WARN = false;
        }
        return speed;
    }

}
