package hu.iit.me.felevesfeladat;




import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EngineDto {
    @NotNull
    private long id;
    @NotBlank
    @NotNull
    private String camshaft;

    @NotNull
    private int displacement;

    @Min(2)
    private  int valves;

    @NotNull
    private String propellant;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCamshaft() {
        return camshaft;
    }

    public void setCamshaft(String camshaft) {
        this.camshaft = camshaft;
    }

    public int getDisplacement() {
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
