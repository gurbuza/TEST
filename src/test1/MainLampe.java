package test1;

public class MainLampe {

    public static void main(String[] args) {
        
        Lampe maLampe = new Lampe();
        maLampe.puissance = 100;
        maLampe.estAllumee = true;
        
        System.out.println(maLampe.puissance);
        System.out.println(maLampe.estAllumee);
        
        if (maLampe.estAllumee)
            maLampe.Eteindre();
        else
            maLampe.Allumer();
        
        System.out.println(maLampe.puissance);
        System.out.println(maLampe.estAllumee);
    }

}
