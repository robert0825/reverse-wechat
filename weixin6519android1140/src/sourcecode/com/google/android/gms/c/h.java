package com.google.android.gms.c;

import java.util.HashMap;
import java.util.Map;

public final class h
  extends af<h>
{
  public String adi;
  public String atl;
  public String atm;
  public String atn;
  public boolean ato;
  public String atp;
  public boolean atq;
  public double atr;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("hitType", this.atl);
    localHashMap.put("clientId", this.adi);
    localHashMap.put("userId", this.atm);
    localHashMap.put("androidAdId", this.atn);
    localHashMap.put("AdTargetingEnabled", Boolean.valueOf(this.ato));
    localHashMap.put("sessionControl", this.atp);
    localHashMap.put("nonInteraction", Boolean.valueOf(this.atq));
    localHashMap.put("sampleRate", Double.valueOf(this.atr));
    return ad(localHashMap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */