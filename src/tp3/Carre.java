package tp3;

public class Carre extends FormRectangulaire {
    int cote;

public void setCote(int s) 
{
    this.setHauteur(s);
    this.setLargeur(s);
}
public int getCote()
{
    return this.getHauteur();
}
}

