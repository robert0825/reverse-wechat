package com.google.android.gms.c;

import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ae
{
  public final v acz;
  public final ag auW;
  public boolean auX;
  public long auY;
  public long auZ;
  public long ava;
  private long avb;
  private long avc;
  public boolean avd;
  final Map<Class<? extends af>, af> ave;
  final List<ai> avf;
  
  private ae(ae paramae)
  {
    this.auW = paramae.auW;
    this.acz = paramae.acz;
    this.auY = paramae.auY;
    this.auZ = paramae.auZ;
    this.ava = paramae.ava;
    this.avb = paramae.avb;
    this.avc = paramae.avc;
    this.avf = new ArrayList(paramae.avf);
    this.ave = new HashMap(paramae.ave.size());
    paramae = paramae.ave.entrySet().iterator();
    while (paramae.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramae.next();
      af localaf = c((Class)localEntry.getKey());
      ((af)localEntry.getValue()).a(localaf);
      this.ave.put(localEntry.getKey(), localaf);
    }
  }
  
  ae(ag paramag, v paramv)
  {
    w.aa(paramag);
    w.aa(paramv);
    this.auW = paramag;
    this.acz = paramv;
    this.avb = 1800000L;
    this.avc = 3024000000L;
    this.ave = new HashMap();
    this.avf = new ArrayList();
  }
  
  private static <T extends af> T c(Class<T> paramClass)
  {
    try
    {
      paramClass = (af)paramClass.newInstance();
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalArgumentException("dataType doesn't have default constructor", paramClass);
    }
    catch (IllegalAccessException paramClass)
    {
      throw new IllegalArgumentException("dataType default constructor is not accessible", paramClass);
    }
  }
  
  public final <T extends af> T a(Class<T> paramClass)
  {
    return (af)this.ave.get(paramClass);
  }
  
  public final <T extends af> T b(Class<T> paramClass)
  {
    af localaf2 = (af)this.ave.get(paramClass);
    af localaf1 = localaf2;
    if (localaf2 == null)
    {
      localaf1 = c(paramClass);
      this.ave.put(paramClass, localaf1);
    }
    return localaf1;
  }
  
  public final void b(af paramaf)
  {
    w.aa(paramaf);
    Class localClass = paramaf.getClass();
    if (localClass.getSuperclass() != af.class) {
      throw new IllegalArgumentException();
    }
    paramaf.a(b(localClass));
  }
  
  public final ae lz()
  {
    return new ae(this);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */