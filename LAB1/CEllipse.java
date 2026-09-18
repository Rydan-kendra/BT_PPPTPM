public class CEllipse extends CHinhVe {
    protected CDiem CDiemTam;
    protected float A;
    protected float B;

    public CEllipse() {
        MaLoaiHinhVe = 3;
        CDiemTam = new CDiem();
        A = 0;
        B = 0;
    }

    public CEllipse(CDiem Tam, float A, float B) {
        MaLoaiHinhVe = 3;
        CDiemTam = Tam;
        this.A = A;
        this.B = B;
    }

    @Override
    public float DienTich() {
        return (float) (Math.PI * A * B);
    }

    @Override
    public float ChuVi() {
        // Công thức Ramanujan gần đúng
        return (float) (Math.PI * (3 * (A + B)
                - Math.sqrt((3 * A + B) * (A + 3 * B))));
    }

    @Override
    public void Ve() {
        System.out.println("Ve hinh ellipse");
    }
}