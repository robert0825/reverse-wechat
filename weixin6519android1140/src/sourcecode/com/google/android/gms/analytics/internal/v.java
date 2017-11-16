package com.google.android.gms.analytics.internal;

import com.google.android.gms.c.ah;
import com.google.android.gms.c.aj;

public final class v
  extends o
{
  private final aj adC = new aj();
  
  v(q paramq)
  {
    super(paramq);
  }
  
  protected final void hS()
  {
    this.ack.iF().lD().a(this.adC);
    Object localObject = this.ack.iI();
    String str = ((l)localObject).ip();
    if (str != null) {
      this.adC.abS = str;
    }
    localObject = ((l)localObject).io();
    if (localObject != null) {
      this.adC.abT = ((String)localObject);
    }
  }
  
  public final aj iT()
  {
    iC();
    return this.adC;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */