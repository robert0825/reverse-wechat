package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
  extends c
{
  private static List<Runnable> abD = new ArrayList();
  public boolean abE;
  public boolean abF;
  private Set<Object> abG = new HashSet();
  public boolean abH;
  volatile boolean abI;
  
  public a(q paramq)
  {
    super(paramq);
  }
  
  public static void hR()
  {
    try
    {
      if (abD != null)
      {
        Iterator localIterator = abD.iterator();
        while (localIterator.hasNext()) {
          ((Runnable)localIterator.next()).run();
        }
        abD = null;
      }
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */