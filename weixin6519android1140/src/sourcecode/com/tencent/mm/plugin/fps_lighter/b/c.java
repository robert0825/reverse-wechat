package com.tencent.mm.plugin.fps_lighter.b;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class c
  implements Serializable
{
  public static HashMap<String, Integer> lmJ;
  public float lmB;
  public float lmC;
  public final long lmD;
  public final long lmE;
  boolean lmF;
  boolean lmG;
  boolean lmH;
  public int lmI;
  public String lmK;
  String lmL;
  int lmM;
  
  static
  {
    GMTrace.i(5224022409216L, 38922);
    HashMap localHashMap = new HashMap();
    lmJ = localHashMap;
    localHashMap.put("En_424b8e16", Integer.valueOf(0));
    lmJ.put("FRAGMENT_MAINUI", Integer.valueOf(1));
    lmJ.put("FRAGMENT_ADDRESS", Integer.valueOf(4));
    lmJ.put("FRAGMENT_CHATTING", Integer.valueOf(3));
    lmJ.put("En_5b8fbb1e", Integer.valueOf(3));
    lmJ.put("SnsUserUI", Integer.valueOf(5));
    GMTrace.o(5224022409216L, 38922);
  }
  
  protected c()
  {
    GMTrace.i(5223485538304L, 38918);
    this.lmB = 60.0F;
    this.lmC = 16.666668F;
    this.lmD = 8000L;
    this.lmE = 120000L;
    this.lmF = false;
    this.lmG = false;
    this.lmH = false;
    this.lmI = 3;
    this.lmK = "FRAGMENT_UNKNOW";
    this.lmM = 100;
    int i = com.tencent.mm.plugin.fps_lighter.e.c.cv(ab.getContext());
    if (i >= 2015)
    {
      this.lmI = 0;
      GMTrace.o(5223485538304L, 38918);
      return;
    }
    if (i >= 2013)
    {
      this.lmI = 1;
      GMTrace.o(5223485538304L, 38918);
      return;
    }
    if (i > 2010)
    {
      this.lmI = 2;
      GMTrace.o(5223485538304L, 38918);
      return;
    }
    this.lmI = 3;
    GMTrace.o(5223485538304L, 38918);
  }
  
  public static long aAh()
  {
    GMTrace.i(16095792594944L, 119923);
    GMTrace.o(16095792594944L, 119923);
    return 120000L;
  }
  
  public static long aAi()
  {
    GMTrace.i(16095926812672L, 119924);
    long l = TimeUnit.NANOSECONDS.convert(8000L, TimeUnit.MILLISECONDS);
    GMTrace.o(16095926812672L, 119924);
    return l;
  }
  
  public final void t(Activity paramActivity)
  {
    GMTrace.i(5223888191488L, 38921);
    this.lmL = paramActivity.getClass().getSimpleName();
    GMTrace.o(5223888191488L, 38921);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */