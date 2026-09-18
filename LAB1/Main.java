public class Main {
    public static void main(String[] args) {

        CDiem P1 = new CDiem(0, 0);
        CDiem P2 = new CDiem(3, 0);
        CDiem P3 = new CDiem(0, 4);

        CTamGiac tamGiac = new CTamGiac(P1, P2, P3);

        System.out.println("=== TAM GIAC ===");
        System.out.println("Dien tich: " + tamGiac.DienTich());
        System.out.println("Chu vi: " + tamGiac.ChuVi());
        tamGiac.Ve();


        CDiem P4 = new CDiem(3, 4);

        CTuGiac tuGiac = new CTuGiac(P1, P2, P4, P3);

        System.out.println("\n=== TU GIAC ===");
        System.out.println("Dien tich: " + tuGiac.DienTich());
        System.out.println("Chu vi: " + tuGiac.ChuVi());
        tuGiac.Ve();


        CDiem Tam = new CDiem(0, 0);

        CEllipse ellipse = new CEllipse(Tam, 5, 3);

        System.out.println("\n=== ELLIPSE ===");
        System.out.println("Dien tich: " + ellipse.DienTich());
        System.out.println("Chu vi: " + ellipse.ChuVi());
        ellipse.Ve();
    }
}