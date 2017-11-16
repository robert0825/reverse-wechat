package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.protocal.c.bns;
import com.tencent.mm.protocal.c.cq;
import com.tencent.mm.protocal.c.vz;
import com.tencent.mm.protocal.c.wa;
import com.tencent.mm.protocal.c.wb;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class l
{
  public static String a(final String paramString, int paramInt1, int paramInt2, c paramc, boolean paramBoolean)
  {
    GMTrace.i(10578101796864L, 78813);
    if (e.Si() == null)
    {
      GMTrace.o(10578101796864L, 78813);
      return "";
    }
    int j = a.af(paramString, paramInt1);
    int i;
    String str;
    if (e.Si() == null)
    {
      i = 0;
      str = a.ag(paramString, paramInt1);
      if ((i == 0) || ((!bg.nm(str)) && (i <= j))) {
        break label227;
      }
      paramBoolean = true;
      label71:
      w.i("MicroMsg.CommonConfigManager", "getConfig the server_version is %d ,the local_version is %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      w.i("MicroMsg.CommonConfigManager", "the config is \n %s \n isShouldSyncFromServer:%b", new Object[] { str, Boolean.valueOf(paramBoolean) });
      if (!paramBoolean) {
        break label233;
      }
      paramc = new b()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb)
        {
          GMTrace.i(10584678465536L, 78862);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            if (this.hRn != null) {
              this.hRn.or("");
            }
            GMTrace.o(10584678465536L, 78862);
            return;
          }
          paramAnonymousString = (wb)paramAnonymousb.gtD.gtK;
          if ((paramAnonymousString.uoy == null) || (paramAnonymousString.uoy.size() == 0))
          {
            w.e("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, AppConfigList is empty");
            if (this.hRn != null) {
              this.hRn.or("");
            }
            GMTrace.o(10584678465536L, 78862);
            return;
          }
          paramAnonymousString = (cq)paramAnonymousString.uoy.get(0);
          w.i("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, the config is %s, the configVersion is %d", new Object[] { paramAnonymousString.tQC, Integer.valueOf(paramAnonymousString.tQB) });
          if (!bg.nm(paramAnonymousString.tQC))
          {
            l.a.t(paramString, paramAnonymousString.jib, paramAnonymousString.tQB);
            l.a.u(paramString, paramAnonymousString.jib, paramAnonymousString.tQB);
            l.a.g(paramString, paramAnonymousString.jib, paramAnonymousString.tQC);
            if (this.hRn != null)
            {
              this.hRn.or(paramAnonymousString.tQC);
              GMTrace.o(10584678465536L, 78862);
            }
          }
          else if (this.hRn != null)
          {
            this.hRn.or("");
          }
          GMTrace.o(10584678465536L, 78862);
        }
      };
      LinkedList localLinkedList = new LinkedList();
      vz localvz = new vz();
      localvz.lQa = paramString;
      localvz.jib = paramInt1;
      localvz.tQB = i;
      localvz.uow = paramInt2;
      localLinkedList.add(localvz);
      a(localLinkedList, paramc);
    }
    for (;;)
    {
      GMTrace.o(10578101796864L, 78813);
      return str;
      i = bg.getInt(e.Si().get(a.ad(paramString, paramInt1), "0"), 0);
      break;
      label227:
      paramBoolean = false;
      break label71;
      label233:
      paramc.or(str);
    }
  }
  
  public static void a(String paramString, LinkedList<bns> paramLinkedList)
  {
    GMTrace.i(10577699143680L, 78810);
    a(paramString, paramLinkedList, true);
    GMTrace.o(10577699143680L, 78810);
  }
  
  public static void a(String paramString, LinkedList<bns> paramLinkedList, boolean paramBoolean)
  {
    GMTrace.i(10577833361408L, 78811);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.CommonConfigManager", "setVersion, app_id is null");
      GMTrace.o(10577833361408L, 78811);
      return;
    }
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      w.e("MicroMsg.CommonConfigManager", "setVersion, versionItems is empty");
      GMTrace.o(10577833361408L, 78811);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      bns localbns = (bns)localIterator.next();
      w.d("MicroMsg.CommonConfigManager", "versionItem.version:%d,version.type:%d", new Object[] { Integer.valueOf(localbns.version), Integer.valueOf(localbns.type) });
      int i = a.af(paramString, localbns.type);
      int j = localbns.version;
      a.u(paramString, localbns.type, j);
      if (j != 0) {
        if (j > i)
        {
          localLinkedList.add(s(paramString, localbns.type, localbns.version));
        }
        else if (j == i)
        {
          if (bg.nm(a.ag(paramString, localbns.type))) {
            localLinkedList.add(s(paramString, localbns.type, localbns.version));
          }
        }
        else
        {
          w.i("MicroMsg.CommonConfigManager", "local_version:%d, server_version:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          if (bg.nm(a.ag(paramString, localbns.type))) {
            localLinkedList.add(s(paramString, localbns.type, localbns.version));
          }
        }
      }
    }
    w.i("MicroMsg.CommonConfigManager", "setVersion appid:%s,versionItems.size:%d,getAppConfigItems.size:%d", new Object[] { paramString, Integer.valueOf(paramLinkedList.size()), Integer.valueOf(localLinkedList.size()) });
    if (paramBoolean)
    {
      if (localLinkedList.size() == 0)
      {
        GMTrace.o(10577833361408L, 78811);
        return;
      }
      w.d("MicroMsg.CommonConfigManager", "setVersion appid:%s, need sync from server", new Object[] { paramString });
      a(localLinkedList, new b()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb)
        {
          GMTrace.i(10581457240064L, 78838);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            GMTrace.o(10581457240064L, 78838);
            return;
          }
          paramAnonymousString = (wb)paramAnonymousb.gtD.gtK;
          if ((paramAnonymousString.uoy == null) || (paramAnonymousString.uoy.size() == 0))
          {
            w.e("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer, AppConfigList is empty");
            GMTrace.o(10581457240064L, 78838);
            return;
          }
          w.i("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer appConfigList.size:%d", new Object[] { Integer.valueOf(paramAnonymousString.uoy.size()) });
          paramAnonymousString = paramAnonymousString.uoy.iterator();
          while (paramAnonymousString.hasNext())
          {
            paramAnonymousb = (cq)paramAnonymousString.next();
            w.i("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer, the config is %s, the configVersion is %d", new Object[] { paramAnonymousb.tQC, Integer.valueOf(paramAnonymousb.tQB) });
            if (!bg.nm(paramAnonymousb.tQC))
            {
              l.a.t(this.hRm, paramAnonymousb.jib, paramAnonymousb.tQB);
              l.a.u(this.hRm, paramAnonymousb.jib, paramAnonymousb.tQB);
              l.a.g(this.hRm, paramAnonymousb.jib, paramAnonymousb.tQC);
            }
          }
          GMTrace.o(10581457240064L, 78838);
        }
      });
    }
    GMTrace.o(10577833361408L, 78811);
  }
  
  private static void a(LinkedList<vz> paramLinkedList, b paramb)
  {
    GMTrace.i(10578236014592L, 78814);
    b.a locala = new b.a();
    locala.gtE = 1138;
    locala.uri = "/cgi-bin/mmbiz-bin/wxausrevent/getappconfig";
    locala.gtG = new wb();
    locala.gtH = 0;
    locala.gtI = 0;
    wa localwa = new wa();
    localwa.uox = paramLinkedList;
    locala.gtF = localwa;
    u.a(locala.DA(), new u.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
      {
        GMTrace.i(10592060440576L, 78917);
        if (this.hRo != null) {
          this.hRo.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb);
        }
        GMTrace.o(10592060440576L, 78917);
        return 0;
      }
    }, true);
    GMTrace.o(10578236014592L, 78814);
  }
  
  private static vz s(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(10577967579136L, 78812);
    vz localvz = new vz();
    localvz.lQa = paramString;
    localvz.jib = paramInt1;
    localvz.tQB = paramInt2;
    GMTrace.o(10577967579136L, 78812);
    return localvz;
  }
  
  public static final class a
  {
    private static String ac(String paramString, int paramInt)
    {
      GMTrace.i(10585886425088L, 78871);
      paramString = String.format("%s_%s_local_version", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(10585886425088L, 78871);
      return paramString;
    }
    
    public static String ad(String paramString, int paramInt)
    {
      GMTrace.i(10586020642816L, 78872);
      paramString = String.format("%s_%s_server_version", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(10586020642816L, 78872);
      return paramString;
    }
    
    private static String ae(String paramString, int paramInt)
    {
      GMTrace.i(10586154860544L, 78873);
      paramString = String.format("%s_%s_config", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(10586154860544L, 78873);
      return paramString;
    }
    
    public static int af(String paramString, int paramInt)
    {
      GMTrace.i(10586691731456L, 78877);
      if (e.Si() == null)
      {
        GMTrace.o(10586691731456L, 78877);
        return 0;
      }
      paramInt = bg.getInt(e.Si().get(ac(paramString, paramInt), "0"), 0);
      GMTrace.o(10586691731456L, 78877);
      return paramInt;
    }
    
    public static String ag(String paramString, int paramInt)
    {
      GMTrace.i(10586825949184L, 78878);
      if (e.Si() == null)
      {
        GMTrace.o(10586825949184L, 78878);
        return "";
      }
      paramString = e.Si().get(ae(paramString, paramInt), "");
      GMTrace.o(10586825949184L, 78878);
      return paramString;
    }
    
    public static void g(String paramString1, int paramInt, String paramString2)
    {
      GMTrace.i(10586557513728L, 78876);
      if (e.Si() == null)
      {
        GMTrace.o(10586557513728L, 78876);
        return;
      }
      e.Si().aQ(ae(paramString1, paramInt), paramString2);
      GMTrace.o(10586557513728L, 78876);
    }
    
    public static void t(String paramString, int paramInt1, int paramInt2)
    {
      GMTrace.i(10586289078272L, 78874);
      if (e.Si() == null)
      {
        GMTrace.o(10586289078272L, 78874);
        return;
      }
      e.Si().aQ(ac(paramString, paramInt1), String.valueOf(paramInt2));
      GMTrace.o(10586289078272L, 78874);
    }
    
    public static void u(String paramString, int paramInt1, int paramInt2)
    {
      GMTrace.i(10586423296000L, 78875);
      if (e.Si() == null)
      {
        GMTrace.o(10586423296000L, 78875);
        return;
      }
      e.Si().aQ(ad(paramString, paramInt1), String.valueOf(paramInt2));
      GMTrace.o(10586423296000L, 78875);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt1, int paramInt2, String paramString, b paramb);
  }
  
  public static abstract interface c
  {
    public abstract void or(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */