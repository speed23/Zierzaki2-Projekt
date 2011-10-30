package com.pilecki;

import java.util.*;
import java.util.logging.Logger;

 class Zoo {

	 private static Logger logger = Logger.getLogger(Zoo.class); 
public String nazwaZoo;
public String miejscowosc;
public ArrayList<Zwierzaki> zw = new ArrayList<Zwierzaki>();
public Zoo(String nazwaZoo, String miejscowosc)
{
this.nazwaZoo = nazwaZoo;
this.miejscowosc = miejscowosc;
}
public Zoo(String nazwaZoo, String miejscowosc,ArrayList<Zwierzaki> zw)
{
this.nazwaZoo=nazwaZoo;
this.miejscowosc=miejscowosc;
this.zw=zw;
}
public void DodajZwierzakaDoZoo(Zwierzaki f){
zw.add(f);
try
{
zw.add(f);
}
catch(wyjatek e)
{
logger.error(e.getMessage());
}
}
public void UsunZwierzakaZZoo(Zwierzaki f){
zw.remove(f);
}
public int IstniejeZwierze(Zwierzaki f){
return zw.indexOf(f);
}
public void zmienZwierze(Zwierzaki f, String noweZwierze, String nowyRodzaj){
f.nazwa= noweZwierze;
f.rodzaj = nowyRodzaj;
}
public void ZwierzetaOpis()
{
for(Zwierzaki c : this.zw) c.ZwierzetaOpis();
}

}