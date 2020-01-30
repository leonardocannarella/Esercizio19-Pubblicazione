public class Test_01
{
    public static void main(String[] args) {
        Pubblicazione p2, p3, p4;
        p2 = new Pubblicazione("Siddaharta", "Hermann Hess", 8);
        p3 = new Pubblicazione("La Cinquena Muntanya", "Paulo Coelho", 10);
        p4 = new Pubblicazione("Le Petit Prince", "Antoine De Saint-Exupery", 6);

        Scaffale s1 = new Scaffale(10);

        s1.setPubblicazione(p2, 0);
        s1.setPubblicazione(p3, 2);
        s1.listaPubblicazioni();
        s1.setPubblicazione(p4, 5);
        s1.setPubblicazione(p3, 2);
        s1.listaPubblicazioni();
        System.out.println(s1.getPubblicazione(5));
        System.out.println(s1.getTitolo(5));
    }
}
