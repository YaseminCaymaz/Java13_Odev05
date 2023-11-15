package com.yasemin;

public class Runner {
    public static void main(String[] args) {
        TurkceString turkceString=new TurkceString();
        System.out.println(turkceString.getIfade());
        System.out.print(turkceString.getIfade()+" ifadesinin istenilen indexteki karakteri..:");
        System.out.println(turkceString.karakter(3));
        System.out.print(turkceString.getIfade()+" ifadesinin istenilen karakterinin index numarası..:");
        System.out.println(turkceString.indexBul("m"));
        System.out.print(turkceString.getIfade()+" ifadesinin istenilen altifadesi..:");
        System.out.println(turkceString.altIfade(2,5));

    }
}
