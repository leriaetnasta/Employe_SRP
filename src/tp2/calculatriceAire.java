package tp2;

import java.util.List;

public class calculatriceAire{
    public static double Aire(List<IcalculatriceAire> formes){
        double aire=0;
        for(int i=0;i<formes.size();i++){
            aire+=formes.get(i).Aire();
        }
        return aire;
    }
}
