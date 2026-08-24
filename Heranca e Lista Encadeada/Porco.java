public class Porco extends Animal
{
    public Porco(double peso)
    {
        super.setPeso(peso);
    }
    
    public void imprime()
    {
        System.out.println("(PORCO)");
        super.imprime();
    }
}
