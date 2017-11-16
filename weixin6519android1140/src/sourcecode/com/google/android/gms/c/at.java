package com.google.android.gms.c;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class at
{
  public static b.a a(b.a parama)
  {
    b.a locala = new b.a();
    locala.type = parama.type;
    locala.ath = ((int[])parama.ath.clone());
    if (parama.ati) {
      locala.ati = parama.ati;
    }
    return locala;
  }
  
  public static final class a
  {
    public final Map<String, b.a> awk;
    public final b.a awl;
    
    public final String toString()
    {
      return "Properties: " + Collections.unmodifiableMap(this.awk) + " pushAfterEvaluate: " + this.awl;
    }
  }
  
  public static final class b
  {
    public final List<at.a> awm;
    public final List<at.a> awn;
    public final List<at.a> awo;
    public final List<at.a> awp;
    private final List<at.a> awq;
    private final List<at.a> awr;
    
    public final String toString()
    {
      return "Positive predicates: " + this.awm + "  Negative predicates: " + this.awn + "  Add tags: " + this.awo + "  Remove tags: " + this.awp + "  Add macros: " + this.awq + "  Remove macros: " + this.awr;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */