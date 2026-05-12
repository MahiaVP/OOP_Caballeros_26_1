public class Armadura {
   public int Durabilidad;
    Armadura(Material material) {
        switch (material) {
            case BRONCE: Durabilidad=50;
            case PLATA: Durabilidad=100;
            case ESCAMAS: Durabilidad=150;
            case ORO: Durabilidad=200;
        }
    }

    public int getDurabilidad() {
        return Durabilidad;
    }
}
