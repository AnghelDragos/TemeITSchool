package TemaCurs17.InterfeteSlide58;

public abstract class Bicicleta implements VehiculTerestru{

    @Override
    public int spuneNrRoti()
    {
        System.out.println("Bicicleta are doua roti");
        return 2;
    }
}
