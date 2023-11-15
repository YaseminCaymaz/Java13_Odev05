package com.yasemin;

public class TurkceString {
    String ifade="Yasemin";

    public String getIfade() {
        return ifade;
    }

    public void setIfade(String ifade) {
        this.ifade = ifade;
    }

    public  String karakter( int index){
        if(index>=0 && index<ifade.length())
           return ifade.substring(index,index+1);
        else
           return null;
    }
    public  int indexBul(String karakter){
       for (int i=0;i<ifade.length();i++) {
           String harf = ifade.substring(i, i + 1);
           if (karakter.equalsIgnoreCase(harf))
               return i;
       }
       return -1;
    }
    public  String altIfade(int baslangic,int bitis){
        String altIfade="";
        for (int i=baslangic;i<bitis;i++){
            altIfade=altIfade+karakter(i);
        }
        return altIfade;
    }
}
