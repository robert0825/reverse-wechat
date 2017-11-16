package com.google.android.gms.c;

import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ag<T extends ag>
{
  public final ah avh;
  protected final ae avi;
  private final List<Object> avj;
  
  public ag(ah paramah, v paramv)
  {
    w.aa(paramah);
    this.avh = paramah;
    this.avj = new ArrayList();
    paramah = new ae(this, paramv);
    paramah.avd = true;
    this.avi = paramah;
  }
  
  public void a(ae paramae) {}
  
  public ae jx()
  {
    ae localae = this.avi.lz();
    lC();
    return localae;
  }
  
  public final ae lA()
  {
    return this.avi;
  }
  
  public final List<ai> lB()
  {
    return this.avi.avf;
  }
  
  public final void lC()
  {
    Iterator localIterator = this.avj.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */