package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.d;
import com.google.android.gms.wearable.f;

public final class bh
  implements d
{
  private f aCv;
  private int aja;
  
  public bh(d paramd)
  {
    this.aja = paramd.getType();
    this.aCv = ((f)paramd.na().km());
  }
  
  public final int getType()
  {
    return this.aja;
  }
  
  public final f na()
  {
    return this.aCv;
  }
  
  public final String toString()
  {
    String str;
    if (this.aja == 1) {
      str = "changed";
    }
    for (;;)
    {
      return "DataEventEntity{ type=" + str + ", dataitem=" + this.aCv + " }";
      if (this.aja == 2) {
        str = "deleted";
      } else {
        str = "unknown";
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */