public class Galinha extends Animal
{
    // producao semanal de ovos
    private int ovos;
    
    public Galinha(double peso, int ovos)
    {
        super.setPeso(peso);
        this.ovos = ovos;
    }
    
    public void imprime()
    {
        System.out.println("(GALINHA)");
        System.out.println("OVOS (semana): " + this.ovos);
        super.imprime();
    }
}
