public class CMYKtoRGB {
    public static void main(String[] args) {
        // grab cmyk values from args
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        // convert black to white
        double white = 1.0 - black;

        // convert cmyk to rgb using white value
        int red = (int) Math.round(255 * white * (1.0 - cyan));
        int green = (int) Math.round(255 * white * (1.0 - magenta));
        int blue = (int) Math.round(255 * white * (1.0 - yellow));

        // print rgb values
        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);
    }
}
