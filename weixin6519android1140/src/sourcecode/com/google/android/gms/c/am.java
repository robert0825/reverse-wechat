package com.google.android.gms.c;

import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class am
  extends af<am>
{
  public final List<a> avJ = new ArrayList();
  public final List<c> avK = new ArrayList();
  public final Map<String, List<a>> avL = new HashMap();
  public b avM;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    if (!this.avJ.isEmpty()) {
      localHashMap.put("products", this.avJ);
    }
    if (!this.avK.isEmpty()) {
      localHashMap.put("promotions", this.avK);
    }
    if (!this.avL.isEmpty()) {
      localHashMap.put("impressions", this.avL);
    }
    localHashMap.put("productAction", this.avM);
    return ad(localHashMap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */