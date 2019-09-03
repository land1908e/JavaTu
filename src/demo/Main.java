package demo;

public class Main {
    public static void main(String[] args) {
        SNT sNT = new SNT();
        sNT.soKT = 10;
        sNT.kiemTra();
        System.out.println("ket qua : " + sNT.ketQua);

        SNT sNT2 = new SNT();
        sNT2.soKT = 5;
        sNT2    .kiemTra();
        System.out.println("ket qua : " + sNT2.ketQua);


        PTBac1 ptBac1 = new PTBac1();
        ptBac1.a = 10;
        ptBac1.b = 20;
        ptBac1.gPT();
        System.out.println(ptBac1.ketQua);

        ThongTin s = new ThongTin();
        s.hienThi();
        s.delete();
    }
}
