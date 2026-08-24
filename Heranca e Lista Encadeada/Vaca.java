public class Vaca extends Animal
{
    // producao semanal de leite
    private double leite;
    
    public Vaca(double peso, double leite)
    {
        super.setPeso(peso);
        this.leite = leite;
    }
    
    public void imprime()
    {
        System.out.println("(VACA)");
        System.out.println("LEITE (litros/semana): " + this.leite);
        super.imprime();
    }
}
