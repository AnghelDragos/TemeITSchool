package TemaCurs17.ExceptionsSlide83;

public class Main {
    public static void main(String[] args) {

        try{
            System.out.println("Rezultatul este " + divide(12,0));
        }
        catch (BadNumberException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Printare din finally");
        }
    }


    public static double divide(int deimpartit, int impartitor) throws BadNumberException{
        if(impartitor==0){
            throw new BadNumberException("nu poti imparti la 0");
        }
        return deimpartit/impartitor;
    }
}
