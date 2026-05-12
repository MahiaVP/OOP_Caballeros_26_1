
public class Main {
    public static void main(String[] args) {

        Caballero c1 = new Caballero("Mu");
        c1.constelacion = "Aries";
        c1.material = Material.ORO;
        c1.dios = Dios.ATENEA;
        c1.armadura = new Armadura(Material.ORO);
        Caballero c2 = new Caballero("Aldebaran", Material.ORO, "Tauro", Dios.ATENEA);
        Caballero c3 = new Caballero("Saga", Material.ORO, "Geminis", Dios.ATENEA);
        Caballero c4 = new Caballero("Deathmask", Material.ORO, "Cancer", Dios.ATENEA);
        Caballero c5 = new Caballero("Aiolia", Material.ORO, "Leo", Dios.ATENEA);
        Caballero c6 = new Caballero("Shaka", Material.ORO, "Virgo", Dios.ATENEA);
        Caballero c7 = new Caballero("Dohko", Material.ORO, "Libra", Dios.ATENEA);
        Caballero c8 = new Caballero("Milo", Material.ORO, "Escorpio", Dios.ATENEA);
        Caballero c9 = new Caballero("Aiolos", Material.ORO, "Sagitario", Dios.ATENEA);
        Caballero c10 = new Caballero("Shura", Material.ORO, "Capricornio", Dios.ATENEA);
        Caballero c11 = new Caballero("Camus", Material.ORO, "Acuario", Dios.ATENEA);
        Caballero c12 = new Caballero("Afrodita", Material.ORO, "Piscis", Dios.ATENEA);

        c1.setVida(500);
        c2.setVida(500);
        c3.setVida(500);
        c4.setVida(500);
        c5.setVida(500);
        c6.setVida(500);
        c7.setVida(500);
        c8.setVida(500);
        c9.setVida(500);
        c10.setVida(500);
        c11.setVida(500);
        c12.setVida(500);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
        System.out.println(c10);
        System.out.println(c11);
        System.out.println(c12);
    }
}