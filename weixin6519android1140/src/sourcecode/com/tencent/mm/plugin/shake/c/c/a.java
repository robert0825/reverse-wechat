package com.tencent.mm.plugin.shake.c.c;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public final class a
{
  private static SimpleDateFormat jLo;
  
  static
  {
    GMTrace.i(6531705733120L, 48665);
    jLo = null;
    GMTrace.o(6531705733120L, 48665);
  }
  
  public static String ax(long paramLong)
  {
    GMTrace.i(6531034644480L, 48660);
    paramLong = 1000L * paramLong;
    new GregorianCalendar().setTimeInMillis(paramLong);
    if (jLo == null) {
      jLo = new SimpleDateFormat("yyyy.MM.dd");
    }
    String str = jLo.format(new Date(paramLong));
    GMTrace.o(6531034644480L, 48660);
    return str;
  }
  
  public static int bfA()
  {
    GMTrace.i(6529424031744L, 48648);
    at.AR();
    int i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vpQ, Integer.valueOf(0))).intValue();
    GMTrace.o(6529424031744L, 48648);
    return i;
  }
  
  public static String bfB()
  {
    GMTrace.i(6529558249472L, 48649);
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(w.a.vpP, "");
    GMTrace.o(6529558249472L, 48649);
    return str;
  }
  
  public static String bfC()
  {
    GMTrace.i(6529692467200L, 48650);
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(w.a.vpM, "");
    GMTrace.o(6529692467200L, 48650);
    return str;
  }
  
  public static String bfD()
  {
    GMTrace.i(6529826684928L, 48651);
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(w.a.vpS, "");
    GMTrace.o(6529826684928L, 48651);
    return str;
  }
  
  public static String bfE()
  {
    GMTrace.i(6529960902656L, 48652);
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(w.a.vpR, "");
    GMTrace.o(6529960902656L, 48652);
    return str;
  }
  
  public static String bfF()
  {
    GMTrace.i(6530095120384L, 48653);
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(w.a.vpV, "");
    GMTrace.o(6530095120384L, 48653);
    return str;
  }
  
  public static String bfG()
  {
    GMTrace.i(6530229338112L, 48654);
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(w.a.vpU, "");
    GMTrace.o(6530229338112L, 48654);
    return str;
  }
  
  public static int bfH()
  {
    GMTrace.i(6530497773568L, 48656);
    at.AR();
    int i = com.tencent.mm.y.c.ww();
    int j = (int)(System.currentTimeMillis() % 10L);
    i = (new Random(i).nextInt(10) + j) % 10;
    w.i("MicroMsg.ShakeCardUtil", "genShakeCardFrequencyLevel retRand:" + i);
    GMTrace.o(6530497773568L, 48656);
    return i;
  }
  
  public static boolean bfI()
  {
    GMTrace.i(6531303079936L, 48662);
    if ((bff()) && (v.bPG()))
    {
      GMTrace.o(6531303079936L, 48662);
      return true;
    }
    GMTrace.o(6531303079936L, 48662);
    return false;
  }
  
  public static void bfe()
  {
    GMTrace.i(6529021378560L, 48645);
    w.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance()");
    if (!bff())
    {
      w.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() entrance is not open");
      if (bfz())
      {
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vpJ, Boolean.valueOf(true));
        w.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() open shake card entrance");
        GMTrace.o(6529021378560L, 48645);
        return;
      }
      w.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() card entrance is not in open time");
      GMTrace.o(6529021378560L, 48645);
      return;
    }
    w.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() entrance is open");
    if (!bfz())
    {
      w.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() card entrance is not in open time, close card entrance");
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vpJ, Boolean.valueOf(false));
    }
    GMTrace.o(6529021378560L, 48645);
  }
  
  public static boolean bff()
  {
    GMTrace.i(6529155596288L, 48646);
    if (!at.AU())
    {
      w.e("MicroMsg.ShakeCardUtil", "acc is not ready");
      GMTrace.o(6529155596288L, 48646);
      return false;
    }
    at.AR();
    Object localObject = com.tencent.mm.y.c.xh().get(w.a.vpJ, Boolean.valueOf(false));
    if (localObject != null) {}
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      GMTrace.o(6529155596288L, 48646);
      return bool;
    }
  }
  
  public static void bfg()
  {
    GMTrace.i(6531437297664L, 48663);
    w.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil setShakeCardEntranceData()");
    int i = (int)(System.currentTimeMillis() / 1000L);
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpK, Integer.valueOf(i));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpL, Integer.valueOf(86400 + i));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpM, "");
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpQ, Integer.valueOf(0));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpN, Integer.valueOf(1));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpO, Integer.valueOf(6));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpP, "");
    com.tencent.mm.s.c.vK().l(262154, true);
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpR, String.valueOf(i));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpS, "hello");
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpT, "shake card");
    GMTrace.o(6531437297664L, 48663);
  }
  
  public static void bfh()
  {
    GMTrace.i(6531571515392L, 48664);
    w.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil clearShakeCardEntranceData()");
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpK, Integer.valueOf(0));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpL, Integer.valueOf(0));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpM, "");
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpQ, Integer.valueOf(0));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpN, Integer.valueOf(0));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpO, Integer.valueOf(0));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpP, "");
    com.tencent.mm.s.c.vK().l(262154, false);
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpR, "");
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpS, "");
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vpT, "");
    GMTrace.o(6531571515392L, 48664);
  }
  
  private static boolean bfz()
  {
    GMTrace.i(6529289814016L, 48647);
    at.AR();
    int i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vpK, Integer.valueOf(0))).intValue();
    at.AR();
    int j = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vpL, Integer.valueOf(0))).intValue();
    w.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time : " + i + " end time : " + j);
    if (i <= 0)
    {
      w.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time is " + i + " , invalid");
      GMTrace.o(6529289814016L, 48647);
      return false;
    }
    if (j <= 0)
    {
      w.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil end time  is " + j + " , invalid");
      GMTrace.o(6529289814016L, 48647);
      return false;
    }
    if (i >= j)
    {
      w.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time is >= end time, invalid time");
      GMTrace.o(6529289814016L, 48647);
      return false;
    }
    int k = (int)(System.currentTimeMillis() / 1000L);
    w.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time : " + k);
    if ((k >= i) && (k <= j))
    {
      w.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time is incled in [btime, etime]");
      GMTrace.o(6529289814016L, 48647);
      return true;
    }
    w.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time is not incled in [btime, etime]");
    GMTrace.o(6529289814016L, 48647);
    return false;
  }
  
  public static void q(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(6531168862208L, 48661);
    w.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil doCardDetailUI()");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_card_id", paramString1);
    localIntent.putExtra("key_card_ext", paramString2);
    localIntent.putExtra("key_from_scene", 15);
    d.b(paramContext, "card", ".ui.CardDetailUI", localIntent);
    GMTrace.o(6531168862208L, 48661);
  }
  
  public static boolean tO(int paramInt)
  {
    GMTrace.i(6530363555840L, 48655);
    if ((paramInt >= 0) && (paramInt <= 5))
    {
      GMTrace.o(6530363555840L, 48655);
      return true;
    }
    GMTrace.o(6530363555840L, 48655);
    return false;
  }
  
  public static int tP(int paramInt)
  {
    GMTrace.i(6530631991296L, 48657);
    switch (paramInt)
    {
    default: 
      GMTrace.o(6530631991296L, 48657);
      return 0;
    case 0: 
      GMTrace.o(6530631991296L, 48657);
      return 0;
    case 1: 
      GMTrace.o(6530631991296L, 48657);
      return 10;
    case 2: 
      GMTrace.o(6530631991296L, 48657);
      return 30;
    case 3: 
      GMTrace.o(6530631991296L, 48657);
      return 60;
    case 4: 
      GMTrace.o(6530631991296L, 48657);
      return 120;
    }
    GMTrace.o(6530631991296L, 48657);
    return 240;
  }
  
  public static int tQ(int paramInt)
  {
    GMTrace.i(6530766209024L, 48658);
    switch (paramInt)
    {
    default: 
      GMTrace.o(6530766209024L, 48658);
      return 10;
    case 0: 
      GMTrace.o(6530766209024L, 48658);
      return 10;
    case 1: 
      GMTrace.o(6530766209024L, 48658);
      return 20;
    case 2: 
      GMTrace.o(6530766209024L, 48658);
      return 30;
    case 3: 
      GMTrace.o(6530766209024L, 48658);
      return 60;
    case 4: 
      GMTrace.o(6530766209024L, 48658);
      return 90;
    case 5: 
      GMTrace.o(6530766209024L, 48658);
      return 120;
    case 6: 
      GMTrace.o(6530766209024L, 48658);
      return 150;
    case 7: 
      GMTrace.o(6530766209024L, 48658);
      return 180;
    case 8: 
      GMTrace.o(6530766209024L, 48658);
      return 240;
    }
    GMTrace.o(6530766209024L, 48658);
    return 300;
  }
  
  public static int uD(String paramString)
  {
    GMTrace.i(6530900426752L, 48659);
    int i = Color.rgb(66, 66, 66);
    if ((paramString == null) || (paramString.length() < 7) || (!paramString.startsWith("#")))
    {
      w.e("MicroMsg.ShakeCardUtil", "string format error");
      GMTrace.o(6530900426752L, 48659);
      return i;
    }
    try
    {
      paramString = paramString.substring(1).toUpperCase();
      int j = Color.argb(255, Integer.parseInt(paramString.substring(0, 2), 16), Integer.parseInt(paramString.substring(2, 4), 16), Integer.parseInt(paramString.substring(4, 6), 16));
      GMTrace.o(6530900426752L, 48659);
      return j;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.ShakeCardUtil", paramString.toString());
      GMTrace.o(6530900426752L, 48659);
    }
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\c\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */