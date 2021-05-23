package com.tugasoop;

public class Burung extends Binatang implements Terbang {
    public void ngomong() {
        System.out.println("cwit");

    }

    @Override
    public void Kepakkan() {
        String a = "Saya terbang";
        System.out.println(a);

    }

    @Override
    public void Tutup() {
        String a = "Saya jatuh";
        System.out.println(a);

    }
}
