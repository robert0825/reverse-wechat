package com.google.android.gms.c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class aj
  extends af<aj>
{
  public String abS;
  public String abT;
  public String avt;
  public String avu;
  
  public final void a(aj paramaj)
  {
    if (!TextUtils.isEmpty(this.abS)) {
      paramaj.abS = this.abS;
    }
    if (!TextUtils.isEmpty(this.abT)) {
      paramaj.abT = this.abT;
    }
    if (!TextUtils.isEmpty(this.avt)) {
      paramaj.avt = this.avt;
    }
    if (!TextUtils.isEmpty(this.avu)) {
      paramaj.avu = this.avu;
    }
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("appName", this.abS);
    localHashMap.put("appVersion", this.abT);
    localHashMap.put("appId", this.avt);
    localHashMap.put("appInstallerId", this.avu);
    return ad(localHashMap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */