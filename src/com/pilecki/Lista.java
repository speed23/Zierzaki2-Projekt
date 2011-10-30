package com.pilecki;

import java.util.*;

public class Lista {

public Lista( String nazwa, String miejscowosc)
{
zw = new ArrayList<Zwierzaki>();
z = new Zoo(nazwa ,miejscowosc, zw);
}
private ArrayList<Zwierzaki> zw;
private Zoo z;
Zoo getZoo()
{
return z;
}
ArrayList<Zwierzaki> getZwierzaki()
{
return zw;
}
}