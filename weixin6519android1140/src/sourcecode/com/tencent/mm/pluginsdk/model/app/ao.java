package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.x.a.a.a;
import com.tencent.mm.protocal.c.ady;
import com.tencent.mm.protocal.c.aml;
import com.tencent.mm.protocal.c.amm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ao
  implements com.tencent.mm.ad.e, t
{
  private static ao toW;
  public String lang;
  public boolean toX;
  public boolean toY;
  private List<String> toZ;
  public long tpa;
  private final int tpb;
  public int tpc;
  public long tpd;
  
  private ao()
  {
    GMTrace.i(833089437696L, 6207);
    this.toX = false;
    this.toY = false;
    this.toZ = new LinkedList();
    this.tpb = 20;
    this.tpc = 0;
    GMTrace.o(833089437696L, 6207);
  }
  
  private static void a(f paramf, amm paramamm)
  {
    GMTrace.i(834028961792L, 6214);
    paramf.field_appName = paramamm.ubG;
    paramf.field_appName_en = paramamm.uBi;
    paramf.field_appName_tw = paramamm.uBj;
    paramf.field_appName_hk = paramamm.uBu;
    paramf.fed = paramamm.uBk;
    paramf.fdh = true;
    paramf.fee = paramamm.uBl;
    paramf.fdh = true;
    paramf.fef = paramamm.uBo;
    paramf.fdh = true;
    paramf.field_serviceAppInfoFlag = paramamm.uBn;
    paramf.field_serviceAppType = paramamm.uBm;
    paramf.feg = paramamm.uBp;
    paramf.fdh = true;
    paramf.field_serviceShowFlag = paramamm.uBq;
    GMTrace.o(834028961792L, 6214);
  }
  
  private static void a(i parami, List<String> paramList)
  {
    GMTrace.i(833894744064L, 6213);
    if ((parami == null) || (paramList == null) || (paramList.size() <= 0))
    {
      GMTrace.o(833894744064L, 6213);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "removeExpiredServiceApp");
    Object localObject1 = new ArrayList();
    if (a.a.aWD() == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppInfoLogic", "getAllServices, getISubCorePluginBase() == null");
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "oldList %d", new Object[] { Integer.valueOf(((List)localObject1).size()) });
      if (((List)localObject1).size() <= 0) {
        break label302;
      }
      localObject1 = ((List)localObject1).iterator();
    }
    label108:
    label302:
    label315:
    for (;;)
    {
      Object localObject2;
      Object localObject3;
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (f)((Iterator)localObject1).next();
        if (((f)localObject2).field_appId != null)
        {
          localObject3 = paramList.iterator();
          String str;
          do
          {
            if (!((Iterator)localObject3).hasNext()) {
              break;
            }
            str = (String)((Iterator)localObject3).next();
          } while (!((f)localObject2).field_appId.equals(str));
        }
      }
      else
      {
        for (int i = 1;; i = 0)
        {
          if (i != 0) {
            break label315;
          }
          boolean bool = parami.b((f)localObject2, new String[0]);
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "delete old service : %s, %s", new Object[] { ((f)localObject2).field_appId, Boolean.valueOf(bool) });
          break label108;
          localObject2 = a.a.aWD().aWC();
          if (localObject2 == null) {
            break;
          }
          while (((Cursor)localObject2).moveToNext())
          {
            localObject3 = new f();
            ((f)localObject3).b((Cursor)localObject2);
            if (!bg.nm(((f)localObject3).field_openId)) {
              ((List)localObject1).add(localObject3);
            }
          }
          ((Cursor)localObject2).close();
          break;
          GMTrace.o(833894744064L, 6213);
          return;
        }
      }
    }
  }
  
  public static ao bJL()
  {
    GMTrace.i(833223655424L, 6208);
    if (toW == null) {
      toW = new ao();
    }
    ao localao = toW;
    GMTrace.o(833223655424L, 6208);
    return localao;
  }
  
  public static void cD(String paramString, int paramInt)
  {
    GMTrace.i(833626308608L, 6211);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SuggestionAppListLogic", "get service app, offset = %d, lang = %s", new Object[] { Integer.valueOf(paramInt), paramString });
    paramString = new af(paramInt, paramString);
    h.xz();
    h.xx().fYr.a(paramString, 0);
    GMTrace.o(833626308608L, 6211);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(833760526336L, 6212);
    if (!h.xw().wL())
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd account not ready");
      this.tpc = 0;
      this.toZ.clear();
      GMTrace.o(833760526336L, 6212);
      return;
    }
    this.toY = false;
    if (paramk == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SuggestionAppListLogic", "scene == null");
      this.tpc = 0;
      this.toZ.clear();
      GMTrace.o(833760526336L, 6212);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      this.tpc = 0;
      this.toZ.clear();
      GMTrace.o(833760526336L, 6212);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramString = (af)paramk;
    if ((paramString.fUa != null) && (paramString.fUa.gtD.gtK != null)) {}
    for (paramString = (aml)paramString.fUa.gtD.gtK; paramString == null; paramString = null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SuggestionAppListLogic", "resp == null");
      this.tpc = 0;
      this.toZ.clear();
      GMTrace.o(833760526336L, 6212);
      return;
    }
    if ((paramString.uBh == null) || (paramString.uBh.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SuggestionAppListLogic", "Service_appinfo empty");
      a(a.a.aWD().aWB(), this.toZ);
      this.tpc = 0;
      this.toZ.clear();
      h.xz();
      h.xy().xh().setLong(352276, System.currentTimeMillis());
      this.tpd = System.currentTimeMillis();
      GMTrace.o(833760526336L, 6212);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SuggestionAppListLogic", "offset = %d, count = %s", new Object[] { Integer.valueOf(this.tpc), Integer.valueOf(paramString.uBh.size()) });
    i locali = a.a.aWD().aWB();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramString.uBh.iterator();
    label623:
    label1156:
    while (localIterator.hasNext())
    {
      amm localamm = (amm)localIterator.next();
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.SuggestionAppListLogic", "service info: %s, %s, %s, %s, %s, %s", new Object[] { localamm.ubG, Integer.valueOf(localamm.uBm), Integer.valueOf(localamm.uBq), Integer.valueOf(localamm.uBp), Integer.valueOf(localamm.uBn), localamm.eSd });
      if (!bg.nm(localamm.eSd))
      {
        if (f.tnJ.equals(localamm.eSd))
        {
          localamm.uBn = (localamm.uBn ^ 0xFD ^ 0xFFFFFFFF);
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "aa change: %s", new Object[] { Integer.valueOf(localamm.uBn) });
        }
        this.toZ.add(localamm.eSd);
        f localf = g.aP(localamm.eSd, true);
        boolean bool;
        if (localf != null) {
          if (localf.field_serviceAppInfoFlag != localamm.uBn)
          {
            paramInt1 = 1;
            paramk = localf;
            if (paramInt1 != 0)
            {
              paramk = localf.fee;
              String str = localf.fed;
              a(localf, localamm);
              bool = locali.a(localf, new String[0]);
              if (!bg.nl(paramk).equals(bg.nl(localamm.uBl)))
              {
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SuggestionAppListLogic", "update serviceApp.app_icon_url_list" + bg.nl(localamm.uBl));
                com.tencent.mm.plugin.x.a.aWw().cA(localf.field_appId, 5);
              }
              if (!bg.nl(str).equals(bg.nl(localamm.uBk)))
              {
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SuggestionAppListLogic", "update serviceApp.app_icon_url_panel" + bg.nl(localamm.uBk));
                com.tencent.mm.plugin.x.a.aWw().cA(localf.field_appId, 4);
              }
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SuggestionAppListLogic", "update app: AppID = %s, ret = %s", new Object[] { localamm.eSd, Boolean.valueOf(bool) });
              paramk = localf;
            }
          }
        }
        for (;;)
        {
          if (!bg.nm(paramk.field_openId)) {
            break label1156;
          }
          localLinkedList.add(localamm.eSd);
          break;
          if (localf.field_serviceAppType != localamm.uBm)
          {
            paramInt1 = 1;
            break label623;
          }
          if (localf.feg != localamm.uBp)
          {
            paramInt1 = 1;
            break label623;
          }
          if (localf.field_serviceShowFlag != localamm.uBq)
          {
            paramInt1 = 1;
            break label623;
          }
          if (!bg.nl(localf.field_appName).equals(bg.nl(localamm.ubG)))
          {
            paramInt1 = 1;
            break label623;
          }
          if (!bg.nl(localf.field_appName_en).equals(bg.nl(localamm.uBi)))
          {
            paramInt1 = 1;
            break label623;
          }
          if (!bg.nl(localf.field_appName_tw).equals(bg.nl(localamm.uBj)))
          {
            paramInt1 = 1;
            break label623;
          }
          if (!bg.nl(localf.field_appName_hk).equals(bg.nl(localamm.uBu)))
          {
            paramInt1 = 1;
            break label623;
          }
          if (!bg.nl(localf.fee).equals(bg.nl(localamm.uBl)))
          {
            paramInt1 = 1;
            break label623;
          }
          if (!bg.nl(localf.fed).equals(bg.nl(localamm.uBk)))
          {
            paramInt1 = 1;
            break label623;
          }
          if (!bg.nl(localf.fef).equals(bg.nl(localamm.uBo)))
          {
            paramInt1 = 1;
            break label623;
          }
          paramInt1 = 0;
          break label623;
          paramk = new f();
          paramk.field_appId = localamm.eSd;
          a(paramk, localamm);
          bool = locali.l(paramk);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SuggestionAppListLogic", "insert app: AppID = %s, ret = %s", new Object[] { localamm.eSd, Boolean.valueOf(bool) });
        }
      }
    }
    if (localLinkedList.size() > 0)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "needGetOpenIdList %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
      com.tencent.mm.plugin.x.a.aWA().bX(localLinkedList);
    }
    if (paramString.uBh.size() == 20)
    {
      this.tpc += 20;
      cD(this.lang, this.tpc);
    }
    for (;;)
    {
      h.xz();
      h.xy().xh().setLong(352276, System.currentTimeMillis());
      this.tpd = System.currentTimeMillis();
      GMTrace.o(833760526336L, 6212);
      return;
      a(locali, this.toZ);
      this.tpc = 0;
      this.toZ.clear();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, w paramw)
  {
    GMTrace.i(833357873152L, 6209);
    if (!h.xw().wL())
    {
      GMTrace.o(833357873152L, 6209);
      return;
    }
    this.toX = false;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "Suggestion onSceneEnd errType=%s errCode=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramw == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SuggestionAppListLogic", "scene == null");
      GMTrace.o(833357873152L, 6209);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0)) {}
    switch (paramw.getType())
    {
    default: 
      GMTrace.o(833357873152L, 6209);
      return;
    }
    paramString = (ag)paramw;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "get suggestion appList, AppCount = %s", new Object[] { Integer.valueOf(((ady)paramString.kzP.gtD.gtK).utL) });
    paramString = paramString.tow;
    if ((paramString == null) || (paramString.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.SuggestionAppListLogic", "empty suggestAppList");
      GMTrace.o(833357873152L, 6209);
      return;
    }
    if ((ab.getContext() == null) || (a.a.aWD() == null))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SuggestionAppListLogic", "wrong environment");
      GMTrace.o(833357873152L, 6209);
      return;
    }
    paramw = new LinkedList();
    Object localObject1 = paramString.iterator();
    f localf;
    Object localObject2;
    Object localObject3;
    if (((Iterator)localObject1).hasNext())
    {
      localf = (f)((Iterator)localObject1).next();
      localObject2 = localf.field_appName;
      localObject3 = localf.field_packageName;
      String str1 = localf.field_signature;
      String str2 = localf.fdT;
      if (localf.fdS != null) {}
      for (boolean bool = true;; bool = false)
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "suggestion appName=%s, packageName=%s, signature [%s], introUrl [%s], has iconUrl [%s]", new Object[] { localObject2, localObject3, str1, str2, Boolean.valueOf(bool) });
        paramw.add(localf.field_appId);
        break;
      }
    }
    a.a.aWD().aa(paramw);
    localObject1 = g.dN(ab.getContext());
    if (((List)localObject1).size() > 0)
    {
      paramw = a.a.aWD().aWB();
      localObject1 = ((List)localObject1).iterator();
    }
    label570:
    for (;;)
    {
      if (((Iterator)localObject1).hasNext())
      {
        localf = (f)((Iterator)localObject1).next();
        if (localf.field_appId != null)
        {
          localObject2 = paramString.iterator();
          do
          {
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
            localObject3 = (f)((Iterator)localObject2).next();
          } while ((((f)localObject3).field_appId == null) || (!localf.field_appId.equals(((f)localObject3).field_appId)));
        }
      }
      else
      {
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          if (paramInt1 != 0) {
            break label570;
          }
          if (g.a(ab.getContext(), localf)) {}
          for (localf.field_status = 1;; localf.field_status = 4)
          {
            paramw.a(localf, new String[0]);
            break;
          }
          h.xz();
          h.xy().xh().setLong(352275, System.currentTimeMillis());
          this.tpa = System.currentTimeMillis();
          break;
        }
      }
    }
  }
  
  public final void dP(Context paramContext)
  {
    GMTrace.i(833492090880L, 6210);
    if (!h.xw().wL())
    {
      GMTrace.o(833492090880L, 6210);
      return;
    }
    if (paramContext == null)
    {
      GMTrace.o(833492090880L, 6210);
      return;
    }
    if (this.toY)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SuggestionAppListLogic", "ServiceAppInfo is loading, return");
      GMTrace.o(833492090880L, 6210);
      return;
    }
    this.toY = true;
    if (this.lang == null) {
      this.lang = v.d(paramContext.getSharedPreferences(ab.bPU(), 0));
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SuggestionAppListLogic", "getServiceAppListImmediately");
    cD(this.lang, this.tpc);
    GMTrace.o(833492090880L, 6210);
  }
  
  public final void reset()
  {
    GMTrace.i(14281571565568L, 106406);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SuggestionAppListLogic", "reset getServiceAppList");
    h.xz();
    h.xy().xh().setLong(352276, 0L);
    this.tpd = 0L;
    GMTrace.o(14281571565568L, 106406);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */