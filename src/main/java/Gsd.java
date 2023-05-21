//when extend Dog class we can use name (inharitant)
public class Gsd extends Dog implements Animal{
    // Usage of polimopism
    @Override
    public void sound() {
        System.out.println("Baw..");
    }
}
