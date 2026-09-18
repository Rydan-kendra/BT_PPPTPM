public class CTuGiac extends CHinhVe {
    protected CDiem CDiemP1;
    protected CDiem CDiemP2;
    protected CDiem CDiemP3;
    protected CDiem CDiemP4;

    public CTuGiac() {
        MaLoaiHinhVe = 2;
        CDiemP1 = new CDiem();
        CDiemP2 = new CDiem();
        CDiemP3 = new CDiem();
        CDiemP4 = new CDiem();
    }

    public CTuGiac(CDiem P1, CDiem P2, CDiem P3, CDiem P4) {
        MaLoaiHinhVe = 2;
        CDiemP1 = P1;
        CDiemP2 = P2;
        CDiemP3 = P3;
        CDiemP4 = P4;
    }

    private float KhoangCach(CDiem A, CDiem B) {
        float dx = A.getX() - B.getX();
        float dy = A.getY() - B.getY();

        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    private float DienTichTamGiac(CDiem A, CDiem B, CDiem C) {
        float a = KhoangCach(A, B);
        float b = KhoangCach(B, C);
        float c = KhoangCach(C, A);

        float p = (a + b + c) / 2;

        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public float DienTich() {
        return DienTichTamGiac(CDiemP1, CDiemP2, CDiemP3)
             + DienTichTamGiac(CDiemP1, CDiemP3, CDiemP4);
    }

    @Override
    public float ChuVi() {
        return KhoangCach(CDiemP1, CDiemP2)
             + KhoangCach(CDiemP2, CDiemP3)
             + KhoangCach(CDiemP3, CDiemP4)
             + KhoangCach(CDiemP4, CDiemP1);
    }

    @Override
    public void Ve() {
        System.out.println("Ve hinh tu giac");
    }
}