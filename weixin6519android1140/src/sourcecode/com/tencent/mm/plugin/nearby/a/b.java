package com.tencent.mm.plugin.nearby.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.c;

public final class b
  extends Enum<b>
{
  static
  {
    GMTrace.i(6680955846656L, 49777);
    ntr = 1;
    nts = new int[] { ntr };
    GMTrace.o(6680955846656L, 49777);
  }
  
  public static void DQ(String paramString)
  {
    GMTrace.i(6680821628928L, 49776);
    at.AR();
    ar localar = c.yK();
    if (localar.TG(paramString)) {
      localar.TK(paramString);
    }
    bc.a(paramString, new bc.a()
    {
      public final void Bk()
      {
        GMTrace.i(6675989790720L, 49740);
        GMTrace.o(6675989790720L, 49740);
      }
      
      public final boolean Bl()
      {
        GMTrace.i(6675855572992L, 49739);
        GMTrace.o(6675855572992L, 49739);
        return false;
      }
    });
    at.AR();
    c.xh().set(143873, "");
    at.AR();
    c.xh().set(143874, Long.valueOf(0L));
    aTE();
    GMTrace.o(6680821628928L, 49776);
  }
  
  public static boolean aTC()
  {
    GMTrace.i(6680418975744L, 49773);
    at.AR();
    if (bg.e((Integer)c.xh().get(143875, Integer.valueOf(0))) == 1)
    {
      GMTrace.o(6680418975744L, 49773);
      return true;
    }
    GMTrace.o(6680418975744L, 49773);
    return false;
  }
  
  public static void aTD()
  {
    GMTrace.i(6680553193472L, 49774);
    at.AR();
    c.xh().set(143875, Integer.valueOf(1));
    GMTrace.o(6680553193472L, 49774);
  }
  
  public static void aTE()
  {
    GMTrace.i(6680687411200L, 49775);
    at.AR();
    c.xh().set(143875, Integer.valueOf(0));
    GMTrace.o(6680687411200L, 49775);
  }
  
  public static void by(String paramString, int paramInt)
  {
    GMTrace.i(6680150540288L, 49771);
    at.AR();
    paramString = new d(paramString, (int)bg.aG(bg.c((Long)c.xh().get(143874, Long.valueOf(0L)))), paramInt);
    at.wS().a(paramString, 0);
    GMTrace.o(6680150540288L, 49771);
  }
  
  public static boolean de(String paramString1, String paramString2)
  {
    GMTrace.i(6680016322560L, 49770);
    x localx = new x();
    localx.cl(paramString2);
    localx.setUsername(paramString1);
    at.AR();
    paramString2 = c.yK();
    w.d("MicroMsg.LbsroomLogic", "Save lbsroom contact name:" + localx.field_username);
    if (!paramString2.TG(localx.field_username)) {
      paramString2.R(localx);
    }
    at.AR();
    c.xh().set(143873, paramString1);
    at.AR();
    c.xh().set(143874, Long.valueOf(bg.Pu()));
    GMTrace.o(6680016322560L, 49770);
    return true;
  }
  
  public static void rH(int paramInt)
  {
    GMTrace.i(6680284758016L, 49772);
    at.AR();
    String str = bg.nl((String)c.xh().get(143873, ""));
    if (!str.equals(""))
    {
      at.AR();
      if (bg.aG(bg.c((Long)c.xh().get(143874, Long.valueOf(0L)))) < 7200L)
      {
        by(str, paramInt);
        GMTrace.o(6680284758016L, 49772);
        return;
      }
      DQ(str);
    }
    GMTrace.o(6680284758016L, 49772);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */