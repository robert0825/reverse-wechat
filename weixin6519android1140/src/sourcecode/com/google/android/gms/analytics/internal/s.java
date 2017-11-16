package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class s
{
  final Map<String, String> abX;
  final long adh;
  final String adi;
  final String adj;
  final boolean adk;
  long adl;
  
  public s(long paramLong1, String paramString1, String paramString2, boolean paramBoolean, long paramLong2, Map<String, String> paramMap)
  {
    w.af(paramString1);
    w.af(paramString2);
    this.adh = 0L;
    this.adi = paramString1;
    this.adj = paramString2;
    this.adk = paramBoolean;
    this.adl = paramLong2;
    if (paramMap != null)
    {
      this.abX = new HashMap(paramMap);
      return;
    }
    this.abX = Collections.emptyMap();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */