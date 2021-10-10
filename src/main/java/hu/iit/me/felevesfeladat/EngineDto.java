package hu.iit.me.felevesfeladat;




import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class EngineDto {
    @NotNull
    private static long id;

    @NotNull
    private static String camshaft;

    @NotNull
    private static int displacement;

    @Min(2)
    private static int valves;

    @NotNull
    private static String propellant;

    public static long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static String getCamshaft() {
        return camshaft;
    }

    public void setCamshaft(String camshaft) {
        this.camshaft = camshaft;
    }

    public static int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }

    public String getPropellant() {
        return propellant;
    }

    public void setPropellant(String propellant) {
        this.propellant = propellant;
    }

    @Override
    public String toString() {
        return "EngineDto{" +
                "id=" + id +
                ", camshaft='" + camshaft + '\'' +
                ", displacement=" + displacement +
                ", valves=" + valves +
                ", propellant='" + propellant + '\'' +
                '}';
    }
}
