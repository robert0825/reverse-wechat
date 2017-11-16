package com.google.android.gms.c;

import java.util.HashMap;
import java.util.Map;

public final class ao
  extends af<ao>
{
  public String avP;
  public boolean avQ;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("description", this.avP);
    localHashMap.put("fatal", Boolean.valueOf(this.avQ));
    return ad(localHashMap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */