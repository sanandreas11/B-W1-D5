import java.util.Scanner;

public class PlayerMultimediale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci tipo (1=Immagine, 2=Audio, 3=Video): ");
            int tipo = Integer.parseInt(scanner.nextLine());

            System.out.print("Titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1: // Immagine
                    System.out.print("Luminosità: ");
                    int lum = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Immagine(titolo, lum);
                    break;
                case 2: // Registrazione audio
                    System.out.print("Durata: ");
                    int durataA = Integer.parseInt(scanner.nextLine());
                    System.out.print("Volume: ");
                    int volA = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new RegistrazioneAudio(titolo, durataA, volA);
                    break;
                case 3: // Video
                    System.out.print("Durata: ");
                    int durataV = Integer.parseInt(scanner.nextLine());
                    System.out.print("Volume: ");
                    int volV = Integer.parseInt(scanner.nextLine());
                    System.out.print("Luminosità: ");
                    int lumV = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Video(titolo, durataV, volV, lumV);
                    break;
                default:
                    System.out.println("Tipo non valido.");
                    i--;
            }
        }

        int scelta;
        do {
            System.out.println("Quale elemento vuoi eseguire? (1-5, 0 per uscire): ");
            scelta = Integer.parseInt(scanner.nextLine());
            if (scelta >= 1 && scelta <= 5) {
                elementi[scelta - 1].esegui();
            }
        } while (scelta != 0);

        scanner.close();
    }
}
