import lombok.*;

public class Employe {
    String firstname, lastName;
    String function;
    int chiffreAffaireRealise;
    public Employe(String f,String l,String fct,int c){
        firstname=f;
        lastName=l;
        function=f;
        chiffreAffaireRealise=c;
    }
    public void setFirstname(String firstname){this.firstname=firstname;}

    public void setLastName(String lastname){this.lastName=lastname;}
    public void setFunction(String function){this.function=function;}
    public void setChiffreAffaireRealise(int chiffreAffaireRealise){this.chiffreAffaireRealise=chiffreAffaireRealise;}

}
