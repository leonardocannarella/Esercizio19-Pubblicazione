public class Test
{
    public static void main(String[] args) {
        Pubblicazione p1 = new Pubblicazione("Shining", "Stephen King", 20);

        System.out.println(p1.toString());
        p1.setTitolo("Shining II");
        System.out.println(p1.getTitolo());
        p1.setPrezzo(40);
        System.out.println(p1.getPrezzo());
    }
}
