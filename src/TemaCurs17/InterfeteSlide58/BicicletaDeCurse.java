package TemaCurs17.InterfeteSlide58;

public class BicicletaDeCurse extends Bicicleta{

    @Override
    public int spuneNrRoti()
    {
        System.out.println("Bicicleta are doua roti");
        return 2;
    }

    @Override
    public void spuneCuloare(String culoare) {
        super.spuneCuloare(culoare);
    }


    @Override
    public void seDeplaseaza() {
        System.out.println("Bicicleta de curse se deplaseaza");
    }
}
