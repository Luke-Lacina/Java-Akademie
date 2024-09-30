package local.luke;

import java.time.LocalDate;

public class ProdejceMrkve {
    private String jmeno;
    private LocalDate datumNarozeniProdejce;
    private int sjednanychSmluv;
    private double prodanychTun;
    private String mestoSidlaProdejce;
    private String registracniZnackaVozidla;
    private double spotrebaVozidla;

    public String getJmeno() {
    return jmeno;
}
public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
}

    public LocalDate getDatumNarozeniProdejce() {
        return datumNarozeniProdejce;
    }
    public void setDatumNarozeniProdejce(LocalDate datumNarozeniProdejce) {
        this.datumNarozeniProdejce = datumNarozeniProdejce;
    }

    public int getSjednanychSmluv() {
        return sjednanychSmluv;
    }
    public void setSjednanychSmluv(int sjednanychSmluv) {
        this.sjednanychSmluv = sjednanychSmluv;
    }

    public double getProdanychTun() {
        return prodanychTun;
    }
    public void setProdanychTun(double prodanychTun) {
        this.prodanychTun = prodanychTun;
    }

    public String getMestoSidlaProdejce() {
        return mestoSidlaProdejce;
    }
    public void setMestoSidlaProdejce(String mestoSidlaProdejce) {
        this.mestoSidlaProdejce = mestoSidlaProdejce;
    }

    public String getRegistracniZnackaVozidla() {
        return registracniZnackaVozidla;
    }
    public void setRegistracniZnackaVozidla(String registracniZnackaVozidla) {
        this.registracniZnackaVozidla = registracniZnackaVozidla;
    }

    public double getSpotrebaVozidla() {
        return spotrebaVozidla;
    }
    public void setSpotrebaVozidla(double spotrebaVozidla) {
        this.spotrebaVozidla = spotrebaVozidla;
    }
}
