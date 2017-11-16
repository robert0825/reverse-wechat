package com.tencent.mm.plugin.subapp.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dk;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public final class k
  extends i<g>
{
  public static final String[] fTX;
  private static long hcG;
  e fTZ;
  Map<String, c> qsE;
  
  static
  {
    GMTrace.i(5837934297088L, 43496);
    fTX = new String[] { i.a(g.fTp, "VoiceRemindInfo") };
    hcG = 0L;
    GMTrace.o(5837934297088L, 43496);
  }
  
  public k(e parame)
  {
    super(parame, g.fTp, "VoiceRemindInfo", dk.eZt);
    GMTrace.i(5837397426176L, 43492);
    this.qsE = new HashMap();
    this.fTZ = parame;
    GMTrace.o(5837397426176L, 43492);
  }
  
  public static String mj(String paramString)
  {
    GMTrace.i(5837531643904L, 43493);
    long l = System.currentTimeMillis();
    String str2 = new SimpleDateFormat("ssHHmmMMddyy").format(new Date(l));
    String str1 = str2;
    if (paramString != null)
    {
      str1 = str2;
      if (paramString.length() > 1) {
        str1 = str2 + com.tencent.mm.a.g.n(paramString.getBytes()).substring(0, 7);
      }
    }
    paramString = str1 + l % 10000L;
    paramString = new StringBuilder().append(paramString);
    l = hcG;
    hcG = 1L + l;
    paramString = l;
    GMTrace.o(5837531643904L, 43493);
    return paramString;
  }
  
  public final boolean hB(String paramString)
  {
    GMTrace.i(5837665861632L, 43494);
    if (paramString.length() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.fTZ.delete("VoiceRemindInfo", "filename= ?", new String[] { paramString }) <= 0) {
        w.w("MicroMsg.VoiceRemindStorage", "delete failed, no such file:" + paramString);
      }
      GMTrace.o(5837665861632L, 43494);
      return true;
    }
  }
  
  public final void mL(String paramString)
  {
    GMTrace.i(5837800079360L, 43495);
    c localc = (c)this.qsE.get(paramString);
    if (localc != null)
    {
      localc.NG();
      this.qsE.remove(paramString);
    }
    GMTrace.o(5837800079360L, 43495);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */