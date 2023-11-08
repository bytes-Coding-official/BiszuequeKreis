public class Methoden {


    public static double PI = Math.PI;

    public static double berechneFlaeche(double radius) {


        return (radius > 0) ? PI * radius * radius : 0;
    }

    public static double berechneUmfang(double radius) {
        return (radius > 0) ? 2 * PI * radius : 0;
    }

    public static double berechneFlaeche(int pixel) {
        return (pixel > 0) ? PI * pixel * pixel : 0;
    }

    public static double berechneUmfang(int pixel) {
        return (pixel > 0) ? 2 * PI * pixel : 0;
    }

    public static void main(String[] args) {
        double radiusDouble = 5.00;
        int radiusInt = 5;
        System.out.println("Radius = %10.2f mm.\n" + radiusDouble);
        System.out.println("Umfang = %10.2f mm.\n" + berechneUmfang(radiusDouble));
        System.out.println("Flaeche = %10.2f mm.^2\n" + berechneFlaeche(radiusDouble));
        radiusDouble = -5.00;
        System.out.println("Radius = %10.2f mm.\n" + radiusDouble);
        System.out.println("Umfang = %10.2f mm.\n" + berechneUmfang(radiusDouble));
        System.out.println("Flaeche = %10.2f mm.^2\n" + berechneFlaeche(radiusDouble));

        //Test mit Pixeln
        System.out.println("Radius = %10.2f px.\n" + radiusInt);
        System.out.println("Umfang = %10.2f px.\n" + berechneUmfang(radiusInt));
        System.out.println("Flaeche = %10.2f px.^2\n" + berechneFlaeche(radiusInt));
        radiusInt = -5;
        System.out.println("Radius = %10.2f px.\n" + radiusInt);
        System.out.println("Umfang = %10.2f px.\n" + berechneUmfang(radiusInt));
        System.out.println("Flaeche = %10.2f px.^2\n" + berechneFlaeche(radiusInt));

        // Test Kreisberechnung int
        radiusDouble = 5.00;
        System.out.println("Radius = %10d px.\n" + radiusDouble);
        System.out.println("Umfang = %10d px.\n" + berechneUmfang(radiusDouble));
        System.out.println("Flaeche = %10d px.^2\n" + berechneFlaeche(radiusDouble));
        radiusDouble = -5;
        System.out.println("Radius = %10d px.\n" + radiusDouble);
        System.out.println("Umfang = %10d px.\n" + berechneUmfang(radiusDouble));
        System.out.println("Flaeche = %10d px.^2\n" + berechneFlaeche(radiusDouble));

        double umfang, flaeche;
        radiusDouble = 5.00;
        umfang = 2.0 * PI * radiusDouble;
        flaeche = PI * radiusDouble * radiusDouble;
        System.out.print("Radius: ");
        System.out.println(radiusDouble);
        System.out.print("Umfang: ");
        System.out.println(umfang);
        System.out.print("Flaeche: ");
        System.out.println(flaeche);
        radiusDouble = -5.00;
        System.out.print("Radius: ");
        System.out.println(radiusDouble);
        System.out.print("Umfang: ");
        System.out.println(umfang);
        System.out.print("Flaeche: ");
        System.out.println(flaeche);
    }
}
