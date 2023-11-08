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
        System.out.printf("Radius = %10.2f mm.\n", radiusDouble);
        System.out.printf("Umfang = %10.2f mm.\n", berechneUmfang(radiusDouble));
        System.out.printf("Flaeche = %10.2f mm².\n", berechneFlaeche(radiusDouble));
        radiusDouble = -5.00;
        System.out.printf("Radius = %10.2f mm.\n", radiusDouble);
        System.out.printf("Umfang = %10.2f mm.\n", berechneUmfang(radiusDouble));
        System.out.printf("Flaeche = %10.2f mm².\n", berechneFlaeche(radiusDouble));

        //Test mit Pixeln
        System.out.printf("Radius = %10d px.\n", radiusInt);
        System.out.printf("Umfang = %10.2f px.\n", berechneUmfang(radiusInt));
        System.out.printf("Flaeche = %10.2f px².\n", berechneFlaeche(radiusInt));
        radiusInt = -5;
        System.out.printf("Radius = %10d px.\n", radiusInt);
        System.out.printf("Umfang = %10.2f px.\n", berechneUmfang(radiusInt));
        System.out.printf("Flaeche = %10.2f px².\n", berechneFlaeche(radiusInt));

        // Test Kreisberechnung int
        radiusDouble = 5.00;
        System.out.printf("Radius = %10.2f px.\n", radiusDouble);
        System.out.printf("Umfang = %10.2f px.\n", berechneUmfang(radiusDouble));
        System.out.printf("Flaeche = %10.2f px².\n", berechneFlaeche(radiusDouble));
        radiusDouble = -5;
        System.out.printf("Radius = %10.2f px.\n", radiusDouble);
        System.out.printf("Umfang = %10.2f px.\n", berechneUmfang(radiusDouble));
        System.out.printf("Flaeche = %10.2f px².\n", berechneFlaeche(radiusDouble));

        double umfang, flaeche;
        radiusDouble = 5.00;
        umfang = 2.0 * PI * radiusDouble;
        flaeche = PI * radiusDouble * radiusDouble;
        System.out.println("Radius: ");
        System.out.println(radiusDouble);
        System.out.println("Umfang: ");
        System.out.println(umfang);
        System.out.println("Flaeche: ");
        System.out.println(flaeche);
        radiusDouble = -5.00;
        System.out.println("Radius: ");
        System.out.println(radiusDouble);
        System.out.println("Umfang: ");
        System.out.println(umfang);
        System.out.println("Flaeche: ");
        System.out.println(flaeche);
    }
}
