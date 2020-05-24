/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.model;

/**
 *
 * @author dziubasy
 */
public class AccountPerson {

    String imie;
    String nazwisko;
    String adres;
    int pesel;
    double stanKonta;

    public AccountPerson() {
    }
    
    

    public AccountPerson(String imie, String nazwisko, String adres, int pesel, double stanKonta) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.pesel = pesel;
        this.stanKonta = stanKonta;
    }
    

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    @Override
    public String toString() {
        return "AccountPerson{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", adres=" + adres + ", pesel=" + pesel + ", stanKonta=" + stanKonta + '}';
    }

    
    
}
