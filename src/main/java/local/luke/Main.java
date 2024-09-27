package local.luke;

public class Main {
    public static void main(String[] args) {
        ProdejceMrkve prodejce1 = new ProdejceMrkve();
        prodejce1.jmeno = "Karel Novák";
        prodejce1.mestoSidlaProdejce = "Znojmo";

        ProdejceMrkve prodejce2 = new ProdejceMrkve();
        prodejce2.jmeno = "Jan Dlouhý";
        prodejce2.mestoSidlaProdejce = "Olomouc";

        System.out.println("Prodejci Mrkve:");
        System.out.println(prodejce1.jmeno + ", " + prodejce1.mestoSidlaProdejce);
        System.out.println(prodejce2.jmeno + ", " + prodejce2.mestoSidlaProdejce);
    }
}