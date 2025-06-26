/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum24062025;

/**
 *
 * @author aanomali
 */
public class Rekening {
    private String noKartu;
    private String pin;
    private double saldo;

    public Rekening(String noKartu, String pin, double saldo) {
        this.noKartu = noKartu;
        this.pin = pin;
        this.saldo = saldo;
    }

    public String getNoKartu() {
        return noKartu;
    }

    public String getPin() {
        return pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
