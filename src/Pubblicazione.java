public class Pubblicazione
{
    private String titolo;
    private String autore;
    private int prezzo;

    public Pubblicazione(String titolo, String autore, int prezzo) {
        setTitolo(titolo);
        setAutore(autore);
        setPrezzo(prezzo);
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public String toString() {
        return "Pubblicazione:\n" +
                "Titolo: " + titolo + "\n" +
                "Autore: " + autore + "\n" +
                "Prezzo: " + prezzo;
    }
}
