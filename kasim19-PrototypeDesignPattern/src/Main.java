public class Main {
    public static void main(String[] args) {
	// write your code here
        IPiyade genesis = new TemelPiyade(100,12,5);
        PiyadeRegistration reg = new PiyadeRegistration();
        reg.addPrototype("piyade1",genesis);

        IPiyade okcu = (TemelPiyade) genesis.birimKlonla();
        ((TemelPiyade) okcu).hizAyarla(15);
        ((TemelPiyade) okcu).saglikAyarla(100);
        ((TemelPiyade) okcu).saldiriAyarla(25);
        reg.addPrototype("okcu1",okcu);
        okcu.ozellikleriGoster();
       /*TemelPiyade okcuKlonu = (TemelPiyade) reg.getPrototype("okcu1");
        okcuKlonu.ozellikleriGoster();*/

    }
}