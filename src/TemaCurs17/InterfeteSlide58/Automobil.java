package TemaCurs17.InterfeteSlide58;

public class Automobil implements Vehicul, VehiculTerestru{


    @Override
    public void seDeplaseaza() {
        System.out.println("Automobilul se deplaseaza");
    }

    @Override
    public int spuneNrRoti() {
        return 4;
    }

    @Override
    public void spuneCuloare(String culoare) {
        VehiculTerestru.super.spuneCuloare(culoare);
    }
}
