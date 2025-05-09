public class Immagine extends Luminosita {

    public Immagine(String titolo, int luminosita) {
        super(titolo, luminosita);
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }

    @Override
    public void esegui() {
        show();
    }
}
