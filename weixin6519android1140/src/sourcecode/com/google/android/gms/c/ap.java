package com.google.android.gms.c;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class ap
  extends af<ap>
{
  public String avR;
  public int avS;
  private int avT;
  private String avU;
  public String avV;
  private boolean avW;
  private boolean avX;
  private boolean avY;
  
  public ap()
  {
    this((byte)0);
  }
  
  private ap(byte paramByte) {}
  
  private ap(boolean paramBoolean, int paramInt)
  {
    if (paramInt == 0) {
      throw new IllegalArgumentException("Given Integer is zero");
    }
    this.avS = paramInt;
    this.avX = false;
  }
  
  private void lE()
  {
    if (this.avY) {
      throw new IllegalStateException("ScreenViewInfo is immutable");
    }
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("screenName", this.avR);
    localHashMap.put("interstitial", Boolean.valueOf(this.avW));
    localHashMap.put("automatic", Boolean.valueOf(this.avX));
    localHashMap.put("screenId", Integer.valueOf(this.avS));
    localHashMap.put("referrerScreenId", Integer.valueOf(this.avT));
    localHashMap.put("referrerScreenName", this.avU);
    localHashMap.put("referrerUri", this.avV);
    return ad(localHashMap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */