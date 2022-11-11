package tp2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle  implements IcalculatriceAire {
    double largeur, longeur;

    @Override
    public double Aire() {
        return largeur*largeur;
    }
}
