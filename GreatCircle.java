public class GreatCircle {
    public static void main(String[] args) {
        // grab coords from args
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        // specify the radius
        double radius = 6371.0;

        // convert to radians
        double x1radians = Math.toRadians(x1);
        double y1radians = Math.toRadians(y1);
        double x2radians = Math.toRadians(x2);
        double y2radians = Math.toRadians(y2);

        // do math here

        double operationun = (Math.sin((x2radians - x1radians) / 2.0) * Math.sin((x2radians - x1radians) / 2.0));
        double operationdeux = Math.cos(x1radians) * Math.cos(x2radians) * (Math.sin((y2radians - y1radians) / 2.0) * Math.sin((y2radians - y1radians) / 2.0));
        double distance = ((2 * radius) * Math.asin(Math.sqrt(operationun + operationdeux)));

        System.out.println(distance + " kilometers");
    }
}
