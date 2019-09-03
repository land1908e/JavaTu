package demo;

class SNT {
    int soKT;
    boolean ketQua;
    void kiemTra() {
        ketQua = true;
        for (int i = 2; i < soKT / 2; i++) {
            if (soKT % i == 0) {
                ketQua = false;
            }
        }
    }
}
