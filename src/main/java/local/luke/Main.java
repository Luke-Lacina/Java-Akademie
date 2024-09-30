package local.luke;

public class Main {
    public static void main(String[] args) {
        ProdejceMrkve prodejce1 = new ProdejceMrkve();
        prodejce1.setJmeno("Karel Novák");
        prodejce1.setMestoSidlaProdejce("Znojmo");

        ProdejceMrkve prodejce2 = new ProdejceMrkve();
        prodejce2.setJmeno("Jan Dlouhý");
        prodejce2.setMestoSidlaProdejce("Olomouc");

        System.out.println("Prodejci Mrkve:");
        System.out.println(prodejce1.getJmeno() + ", " + prodejce1.getMestoSidlaProdejce());
        System.out.println(prodejce2.getJmeno() + ", " + prodejce2.getMestoSidlaProdejce());
    }
}