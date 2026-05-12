public class Caballero extends Persona{
    //Persona persona;
    private int vida;
    Material material;
    String constelacion;
    Dios dios;
    Armadura armadura;

    //Constructor por defecto
    public Caballero(String nombre) {
        super(nombre);

    }

    //Constructor con parametros
    public Caballero(String nombre, Material material, String constelacion, Dios dios) {
        //this.nombre=nombre;
        super(nombre);
        this.material= material;
        this.constelacion=constelacion;
        this.dios=dios;
        this.armadura=new Armadura(material);
    }
    //Sobrescritura de metodos


    @Override
    public String toString() {
        return "Caballero {" + "id=" +super.getId()+", Nombre="+super.getNombre()+", "+"Constelación="+ constelacion+", Vida= "+this.vida+", Armadura= "+material+ ", Durabilidad="+armadura.getDurabilidad()+", Dios= "+dios + '}';
    }

    //metodo de getvida, para encapsular el atributo vida
    public int getVida() {
        return vida;
    }

    //metodo setvida para encapsular el atributo vida
    public void setVida(int vida) {
        this.vida = vida;
    }


}
