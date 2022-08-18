package TemaCurs17.InterfeteSlide58;

public interface VehiculTerestru extends Vehicul{

    int spuneNrRoti();

    default void spuneCuloare(String culoare){
        System.out.println("Culoarea vehiculului terestru este: " + culoare);
    }

}
