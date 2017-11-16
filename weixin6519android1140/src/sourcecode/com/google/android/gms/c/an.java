package com.google.android.gms.c;

import java.util.HashMap;
import java.util.Map;

public final class an
  extends af<an>
{
  public String alw;
  public String avN;
  public long avO;
  public String ry;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("category", this.ry);
    localHashMap.put("action", this.alw);
    localHashMap.put("label", this.avN);
    localHashMap.put("value", Long.valueOf(this.avO));
    return ad(localHashMap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */