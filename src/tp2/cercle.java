package tp2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class cercle  implements IcalculatriceAire{
    double rayon;

    @Override
    public double Aire() {
        return rayon*rayon*Math.PI;
    }
}
