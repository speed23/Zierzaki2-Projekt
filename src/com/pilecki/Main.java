package com.pilecki;

public class Main {

        
        public static void main(String[] args) {
                
                
                Lista ListaZwierzat = new Lista("Zwierzetowo", "Gdansk");
                ListaZwierzat.getZwierzaki().add(new Zwierzaki("Lew","ssak", "Rodzina kotowate", 5));
                ListaZwierzat.getZwierzaki().add(new Zwierzaki("<AF>aba","p<B3>az", "Zwierze wodno-ladowe", 2));
                ListaZwierzat.getZwierzaki().add(new Zwierzaki("Tarantula","Stawonog", "Rodzina Pajakowate", 3));
                ListaZwierzat.getZwierzaki().add(new Zwierzaki("Niedzwiedz","ssak", "Drapieznik", 6));
                ListaZwierzat.getZwierzaki().add(new Zwierzaki("Zyrafa","ssak", "Zwierze Afrykanskie", 1));
                ListaZwierzat.getZwierzaki().add(new Zwierzaki("Nietoperz","ssak", "Gackowate", 4));
                ListaZwierzat.getZoo().ZwierzetaOpis();
              
        }
}