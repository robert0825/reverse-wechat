package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class ap
{
  public static String C(anu paramanu)
  {
    GMTrace.i(8103932198912L, 60379);
    if (paramanu == null)
    {
      GMTrace.o(8103932198912L, 60379);
      return null;
    }
    paramanu = am.dE(ae.getAccSnsPath(), paramanu.mmR) + i.j(paramanu);
    w.i("MicroMsg.SnsVideoLogic", "get sns video path %s", new Object[] { paramanu });
    GMTrace.o(8103932198912L, 60379);
    return paramanu;
  }
  
  public static String HB(String paramString)
  {
    GMTrace.i(18583249747968L, 138456);
    if (bg.nm(paramString))
    {
      GMTrace.o(18583249747968L, 138456);
      return "";
    }
    int i = paramString.indexOf("SNS_");
    if (i < 0)
    {
      GMTrace.o(18583249747968L, 138456);
      return "";
    }
    String str = "";
    try
    {
      paramString = paramString.substring(i + 4);
      GMTrace.o(18583249747968L, 138456);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString = str;
      }
    }
  }
  
  public static String HC(String paramString)
  {
    GMTrace.i(17152086114304L, 127793);
    if (bg.nm(paramString))
    {
      GMTrace.o(17152086114304L, 127793);
      return null;
    }
    String str = am.dE(ae.getAccSnsPath(), paramString);
    w.i("MicroMsg.SnsVideoLogic", "get sns video dir %s mediaId %s", new Object[] { str, paramString });
    GMTrace.o(17152086114304L, 127793);
    return str;
  }
  
  public static r HD(String paramString)
  {
    GMTrace.i(8104334852096L, 60382);
    if (bg.nm(paramString))
    {
      GMTrace.o(8104334852096L, 60382);
      return null;
    }
    paramString = t.mw(mj(paramString));
    GMTrace.o(8104334852096L, 60382);
    return paramString;
  }
  
  public static String a(String paramString, anu paramanu)
  {
    GMTrace.i(8104066416640L, 60380);
    if (paramanu == null) {
      localObject = null;
    }
    while (e.aZ((String)localObject))
    {
      w.i("MicroMsg.SnsVideoLogic", "it needn't download video[%s] because of the video is self. %s", new Object[] { paramString, localObject });
      GMTrace.o(8104066416640L, 60380);
      return (String)localObject;
      localObject = am.dE(ae.getAccSnsPath(), paramanu.mmR) + i.p(paramanu);
      w.i("MicroMsg.SnsVideoLogic", "get sns video tmp path %s", new Object[] { localObject });
    }
    paramanu = C(paramanu);
    boolean bool = e.aZ(paramanu);
    Object localObject = HD(paramString);
    if (localObject == null)
    {
      if (bool)
      {
        w.i("MicroMsg.SnsVideoLogic", "it old version already download video[%s]. path :%s", new Object[] { paramString, paramanu });
        GMTrace.o(8104066416640L, 60380);
        return paramanu;
      }
      w.i("MicroMsg.SnsVideoLogic", "video info is null and file is no exists, return null.[%s]", new Object[] { paramString });
      GMTrace.o(8104066416640L, 60380);
      return null;
    }
    if ((bool) && (((r)localObject).Nw()))
    {
      w.i("MicroMsg.SnsVideoLogic", "it had download sns video[%s] finish. %s", new Object[] { paramString, paramanu });
      GMTrace.o(8104066416640L, 60380);
      return paramanu;
    }
    w.i("MicroMsg.SnsVideoLogic", "it don't download video[%s] finish. file[%b] status[%d], return null.", new Object[] { paramString, Boolean.valueOf(bool), Integer.valueOf(((r)localObject).status) });
    GMTrace.o(8104066416640L, 60380);
    return null;
  }
  
  public static String at(int paramInt, String paramString)
  {
    GMTrace.i(8103663763456L, 60377);
    paramString = d.a("snsvideo", paramInt, "sns", paramString);
    if (bg.nm(paramString))
    {
      GMTrace.o(8103663763456L, 60377);
      return null;
    }
    GMTrace.o(8103663763456L, 60377);
    return paramString;
  }
  
  public static boolean bQ(String paramString, int paramInt)
  {
    GMTrace.i(17152220332032L, 127794);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.SnsVideoLogic", "init sns record, but snsLocalId is null");
      GMTrace.o(17152220332032L, 127794);
      return false;
    }
    paramString = mj(paramString);
    r localr = new r();
    localr.euR = paramString;
    localr.hcs = bg.Pu();
    localr.status = 130;
    localr.gAU = paramInt;
    boolean bool = o.Nh().a(localr);
    w.i("MicroMsg.SnsVideoLogic", "init sns Record filename %s, insert %b", new Object[] { paramString, Boolean.valueOf(bool) });
    GMTrace.o(17152220332032L, 127794);
    return bool;
  }
  
  public static boolean c(r paramr, int paramInt)
  {
    GMTrace.i(17152354549760L, 127795);
    paramr.status = 130;
    paramr.gAU = paramInt;
    paramr.eQl = 268435712;
    boolean bool = o.Nh().b(paramr);
    w.i("MicroMsg.SnsVideoLogic", "update sns Record filename %s, update %b", new Object[] { paramr.getFileName(), Boolean.valueOf(bool) });
    GMTrace.o(17152354549760L, 127795);
    return bool;
  }
  
  public static boolean dG(String paramString1, String paramString2)
  {
    GMTrace.i(8104200634368L, 60381);
    r localr = HD(paramString1);
    if (localr == null)
    {
      localr = new r();
      localr.euR = mj(paramString1);
    }
    for (int i = 1;; i = 0)
    {
      localr.hcs = bg.Pu();
      localr.eTZ = paramString2;
      localr.status = 199;
      if (i != 0) {}
      for (boolean bool = o.Nh().a(localr);; bool = o.Nh().b(localr))
      {
        w.i("MicroMsg.SnsVideoLogic", "post sns video snsLocalId %s, md5 %s ret %b", new Object[] { paramString1, paramString2, Boolean.valueOf(bool) });
        GMTrace.o(8104200634368L, 60381);
        return bool;
        localr.eQl = 33555200;
      }
    }
  }
  
  public static String mj(String paramString)
  {
    GMTrace.i(8103797981184L, 60378);
    if (bg.nm(paramString))
    {
      GMTrace.o(8103797981184L, 60378);
      return "";
    }
    String str = "SNS_" + paramString;
    w.d("MicroMsg.SnsVideoLogic", "gen sns[%s] video file name [%s]", new Object[] { paramString, str });
    GMTrace.o(8103797981184L, 60378);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */