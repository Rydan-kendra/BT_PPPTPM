public class CTamGiac extends CHinhVe {
    protected CDiem CDiemP1;
    protected CDiem CDiemP2;
    protected CDiem CDiemP3;

    public CTamGiac() {
        MaLoaiHinhVe = 1;
        CDiemP1 = new CDiem();
        CDiemP2 = new CDiem();
        CDiemP3 = new CDiem();
    }

    public CTamGiac(CDiem P1, CDiem P2, CDiem P3) {
        MaLoaiHinhVe = 1;
        CDiemP1 = P1;
        CDiemP2 = P2;
        CDiemP3 = P3;
    }

    private float KhoangCach(CDiem A, CDiem B) {
        float dx = A.getX() - B.getX();
        float dy = A.getY() - B.getY();

        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public float DienTich() {
        float a = KhoangCach(CDiemP1, CDiemP2);
        float b = KhoangCach(CDiemP2, CDiemP3);
        float c = KhoangCach(CDiemP3, CDiemP1);

        float p = (a + b + c) / 2;

        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public float ChuVi() {
        float a = KhoangCach(CDiemP1, CDiemP2);
        float b = KhoangCach(CDiemP2, CDiemP3);
        float c = KhoangCach(CDiemP3, CDiemP1);

        return a + b + c;
    }

    @Override
    public void Ve() {
        System.out.println("Ve hinh tam giac");
    }
}