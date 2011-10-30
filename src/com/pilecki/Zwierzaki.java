package com.pilecki;

public class Zwierzaki {

        public String nazwa;;
        public String rodzaj;
        public String rodzina_typ;
        public double wiek;
        
        public Zwierzaki(String nazwa, String rodzaj, String rodzina_typ, double wiek)
        {
        this.nazwa=nazwa;
        this.rodzaj=rodzaj;
        this.rodzina_typ = rodzina_typ;
        this.wiek = wiek;
        }
        public void ZwierzetaOpis()
        {
        System.out.println("W naszym zoo mamy: " +nazwa+" Rodzaj: " +rodzaj+" Typ: "+rodzina_typ+" Wiek: "+wiek );
        }
}