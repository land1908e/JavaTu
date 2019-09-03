package demo;

import javax.swing.*;

class PTBac1 {
    int a;
    int b;
    int ketQua;

    void gPT() {
        if (a == 0 && b == 0) {
            System.out.println("Phương trình vô số nghiệm");
        } else if (a == 0 && b > 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            ketQua = -b/a;
        }
    }
}
