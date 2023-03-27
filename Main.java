public class Main {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(8);
        Cylinder cylinder3 = new Cylinder(8, 14);
        //toString
        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder3);
        System.out.println();

        //Tabung 1
        cylinder1.setRadius(6);
        System.out.println("Radius tabung 1 = " + cylinder1.getRadius());
        cylinder1.setColor("Navy");
        System.out.println("Warna tabung 1 = " + cylinder1.getColor());
        cylinder1.setHeight(8);
        System.out.println("Tinggi tabung 1 = " + cylinder1.getHeight());
        System.out.println("Area tabung 1 = " + cylinder1.getArea());
        System.out.println("Volume tabung 1 = " + cylinder1.getVolume());
        System.out.println(cylinder1);
        System.out.println();

        //Tabung 2
        cylinder2.setRadius(9);
        System.out.println("Radius tabung 2 = " + cylinder2.getRadius());
        cylinder2.setColor("Skyblue");
        System.out.println("Warna tabung 2 = " + cylinder2.getColor());
        cylinder2.setHeight(13);
        System.out.println("Tinggi tabung 2 = " + cylinder2.getHeight());
        System.out.println("Area tabung 2 = " + cylinder2.getArea());
        System.out.println("Volume tabung 2 = " + cylinder2.getVolume());
        System.out.println(cylinder2);
        System.out.println();

        //Tabung 3
        cylinder3.setRadius(8);
        System.out.println("Radius tabung 3 = " + cylinder3.getRadius());
        cylinder3.setColor("Purple");
        System.out.println("Warna tabung 3 = " + cylinder3.getColor());
        cylinder3.setHeight(10);
        System.out.println("Tinggi tabung3 = " + cylinder3.getHeight());
        System.out.println("Area tabung3 = " + cylinder3.getArea());
        System.out.println("Volume tabung3 = " + cylinder3.getVolume());
        System.out.println(cylinder3);
        System.out.println();
    }
}