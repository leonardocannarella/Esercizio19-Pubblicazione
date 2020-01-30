public class Scaffale
{
    private Pubblicazione scaffale[];
    private int numLibri;

    public Scaffale(int numLibri)
    {
        setNumLibri(numLibri);
        scaffale = new Pubblicazione[numLibri];
    }

    public void setNumLibri(int numLibri) {
        this.numLibri = numLibri;
    }

    public String getPubblicazione(int posizione)
    {
        if(posizione>=0 && posizione<=(numLibri-1))
        {
            if (scaffale[posizione] != null)
                return scaffale[posizione].toString();
            else
                return "La posizione è vuota";
        }
        return "Posizione inesistente!";
    }

    public String setPubblicazione(Pubblicazione p1, int posizione)
    {
        if(posizione>=0 && posizione<=(numLibri-1))
        {
            if (scaffale[posizione] != null) {
                scaffale[posizione]=null;
                return "Posizione svuotata!";
            }
            else {
                scaffale[posizione]=p1;
                return "La posizione è stata riempita!";
            }
        }
        return "Posizione inesistente!";
    }

    public void listaPubblicazioni()
    {
        int i=0;
        for(i=0; i<numLibri; i++)
        {
            if(scaffale[i]!=null)
            {
                System.out.println(scaffale[i].toString());
            }
        }
    }

    public String getTitolo(int posizione)
    {
        if(posizione>=0 && posizione<=(numLibri-1))
        {
            if (scaffale[posizione] != null) {
                return scaffale[posizione].getTitolo();
            }
            else {
                return "La posizione è vuota!";
            }
        }
        return "Posizione inesistente!";
    }


}
