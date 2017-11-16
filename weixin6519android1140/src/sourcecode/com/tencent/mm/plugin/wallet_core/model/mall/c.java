package com.tencent.mm.plugin.wallet_core.model.mall;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.s.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class c
{
  private static c rkc;
  public Map<String, MallNews> rkd;
  
  static
  {
    GMTrace.i(6882953527296L, 51282);
    rkc = null;
    GMTrace.o(6882953527296L, 51282);
  }
  
  private c()
  {
    GMTrace.i(6881477132288L, 51271);
    this.rkd = new HashMap();
    PY();
    GMTrace.o(6881477132288L, 51271);
  }
  
  public static void Kl(String paramString)
  {
    GMTrace.i(18041546997760L, 134420);
    if (!bg.nm(paramString))
    {
      Map localMap = bh.q(paramString, "sysmsg");
      if (localMap != null)
      {
        int i = bg.getInt((String)localMap.get(".sysmsg.paymsg.PayMsgType"), -1);
        if (i == 31)
        {
          paramString = (String)localMap.get(".sysmsg.paymsg.WalletRedDotWording");
          i = bg.getInt((String)localMap.get(".sysmsg.paymsg.WalletRedDot"), -1);
          int j = bg.getInt((String)localMap.get(".sysmsg.paymsg.BalanceRedDot"), -1);
          int k = bg.getInt((String)localMap.get(".sysmsg.paymsg.LQTRedDot"), -1);
          w.i("MicroMsg.MallNewsManager", "walletEntryWording: %s, balanceRedDot: %s, lqtRedDot: %s", new Object[] { paramString, Integer.valueOf(j), Integer.valueOf(k) });
          h.xz();
          h.xy().xh().a(w.a.vyA, paramString);
          h.xz();
          h.xy().xh().a(w.a.vyB, Integer.valueOf(i));
          h.xz();
          h.xy().xh().a(w.a.vyC, Integer.valueOf(j));
          h.xz();
          h.xy().xh().a(w.a.vyD, Integer.valueOf(k));
          bzl();
          GMTrace.o(18041546997760L, 134420);
          return;
        }
        if (i == 34)
        {
          Object localObject = localMap.keySet();
          w.i("MicroMsg.MallNewsManager", "receive menu ui reddot msg: %s, keys: %s", new Object[] { paramString, localObject.toString() });
          if (((Set)localObject).size() > 0)
          {
            paramString = new JSONObject();
            localObject = ((Set)localObject).iterator();
            while (((Iterator)localObject).hasNext())
            {
              String str = (String)((Iterator)localObject).next();
              if (str.startsWith(".sysmsg.paymsg.reddot.item"))
              {
                str = (String)localMap.get(str);
                if (!bg.nm(str))
                {
                  w.i("MicroMsg.MallNewsManager", "mall menu ui, %s has reddot", new Object[] { str });
                  try
                  {
                    paramString.put(str, 1);
                  }
                  catch (Exception localException)
                  {
                    w.printErrStackTrace("MicroMsg.MallNewsManager", localException, "put redDotConfig json failed: %s", new Object[] { localException.getMessage() });
                  }
                }
              }
            }
            w.i("MicroMsg.MallNewsManager", "redDotConfig: %s", new Object[] { paramString.toString() });
            if (paramString.length() > 0)
            {
              h.xz();
              h.xy().xh().a(w.a.vzX, paramString.toString());
              h.xz();
              h.xy().xh().a(w.a.vzY, Boolean.valueOf(true));
            }
          }
        }
      }
    }
    GMTrace.o(18041546997760L, 134420);
  }
  
  public static MallNews Ko(String paramString)
  {
    GMTrace.i(6882685091840L, 51280);
    if (bg.nm(paramString))
    {
      GMTrace.o(6882685091840L, 51280);
      return null;
    }
    Map localMap = bh.q(paramString, "sysmsg");
    if (localMap == null)
    {
      GMTrace.o(6882685091840L, 51280);
      return null;
    }
    MallNews localMallNews;
    for (;;)
    {
      try
      {
        localMallNews = new MallNews((String)localMap.get(".sysmsg.mallactivity.functionid"));
        localMallNews.qrG = ((String)localMap.get(".sysmsg.mallactivity.activityid"));
        localMallNews.eEU = ((String)localMap.get(".sysmsg.mallactivity.ticket"));
        localMallNews.type = ((String)localMap.get(".sysmsg.mallactivity.type"));
        localMallNews.showType = bg.getInt((String)localMap.get(".sysmsg.mallactivity.showtype"), 0);
        if (localMap.containsKey(".sysmsg.mallactivity.showflag"))
        {
          localMallNews.rjR = ((String)localMap.get(".sysmsg.mallactivity.showflag"));
          if (localMap.containsKey(".sysmsg.mallactivity.newsTipFlag"))
          {
            localMallNews.rjS = ((String)localMap.get(".sysmsg.mallactivity.newsTipFlag"));
            localMallNews.rka = paramString;
            boolean bool = bg.nm(localMallNews.rjT);
            if (!bool) {
              break;
            }
            GMTrace.o(6882685091840L, 51280);
            return null;
          }
        }
        else
        {
          localMallNews.rjR = "0";
          continue;
        }
        localMallNews.rjS = "0";
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.MallNewsManager", "cmdid error");
        GMTrace.o(6882685091840L, 51280);
        return null;
      }
    }
    GMTrace.o(6882685091840L, 51280);
    return localMallNews;
  }
  
  public static boolean a(MallNews paramMallNews)
  {
    GMTrace.i(6881879785472L, 51274);
    h.xz();
    String str = (String)h.xy().xh().get(w.a.vwx, "");
    List localList = bg.g(str.split(","));
    w.i("MicroMsg.MallNewsManager", "tryCheckOutOfDateRedDot markedString %s", new Object[] { str });
    if (paramMallNews == null)
    {
      GMTrace.o(6881879785472L, 51274);
      return false;
    }
    if (bg.nm(paramMallNews.qrG))
    {
      GMTrace.o(6881879785472L, 51274);
      return false;
    }
    if (localList.contains(paramMallNews.qrG))
    {
      GMTrace.o(6881879785472L, 51274);
      return true;
    }
    GMTrace.o(6881879785472L, 51274);
    return false;
  }
  
  public static c bzi()
  {
    GMTrace.i(6881342914560L, 51270);
    if (rkc == null) {
      rkc = new c();
    }
    c localc = rkc;
    GMTrace.o(6881342914560L, 51270);
    return localc;
  }
  
  public static void bzk()
  {
    GMTrace.i(18041681215488L, 134421);
    h.xz();
    h.xy().xh().a(w.a.vyA, "");
    h.xz();
    h.xy().xh().a(w.a.vyB, Integer.valueOf(-1));
    GMTrace.o(18041681215488L, 134421);
  }
  
  public static void bzl()
  {
    GMTrace.i(6882148220928L, 51276);
    w.d("MicroMsg.MallNewsManager", "clearMallNew ");
    com.tencent.mm.s.c.vK().aF(262156, 266248);
    GMTrace.o(6882148220928L, 51276);
  }
  
  public static void c(MallFunction paramMallFunction)
  {
    GMTrace.i(6882014003200L, 51275);
    try
    {
      if (bg.nm(paramMallFunction.rjL.qrG)) {
        break label193;
      }
      h.xz();
      localObject = bg.g(((String)h.xy().xh().get(w.a.vwx, "")).split(","));
      while (((List)localObject).size() > 20) {
        ((List)localObject).remove(0);
      }
      bool = ((List)localObject).contains(paramMallFunction.rjL.qrG);
    }
    catch (Exception paramMallFunction)
    {
      w.printErrStackTrace("MicroMsg.MallNewsManager", paramMallFunction, "error in markedFunction", new Object[0]);
      GMTrace.o(6882014003200L, 51275);
      return;
    }
    boolean bool;
    if (bool)
    {
      GMTrace.o(6882014003200L, 51275);
      return;
    }
    ((List)localObject).add(paramMallFunction.rjL.qrG);
    Object localObject = bg.c((List)localObject, ",");
    w.i("MicroMsg.MallNewsManager", "doSelectFunction %s, markedString %s", new Object[] { paramMallFunction.rjL.qrG, localObject });
    h.xz();
    h.xy().xh().a(w.a.vwx, localObject);
    label193:
    GMTrace.o(6882014003200L, 51275);
  }
  
  public final String Km(String paramString)
  {
    GMTrace.i(6882416656384L, 51278);
    paramString = (MallNews)this.rkd.get(paramString);
    if ((paramString != null) && (!bg.nm(paramString.eEU)))
    {
      paramString = paramString.eEU;
      GMTrace.o(6882416656384L, 51278);
      return paramString;
    }
    GMTrace.o(6882416656384L, 51278);
    return null;
  }
  
  public final MallNews Kn(String paramString)
  {
    GMTrace.i(6882550874112L, 51279);
    w.d("MicroMsg.MallNewsManager", "removeNewsInIndexUI : " + paramString);
    if ((!bg.nm(paramString)) && (this.rkd.containsKey(paramString)))
    {
      paramString = (MallNews)this.rkd.get(paramString);
      if ("0".equals(paramString.rjR))
      {
        paramString.rjR = "1";
        aXr();
      }
      GMTrace.o(6882550874112L, 51279);
      return paramString;
    }
    GMTrace.o(6882550874112L, 51279);
    return null;
  }
  
  public final void PY()
  {
    GMTrace.i(6881611350016L, 51272);
    this.rkd.clear();
    h.xz();
    Object localObject = (String)h.xy().xh().get(270339, "");
    w.d("MicroMsg.MallNewsManager", "data : " + (String)localObject);
    localObject = bg.g(((String)localObject).split(";")).iterator();
    while (((Iterator)localObject).hasNext())
    {
      MallNews localMallNews = Ko((String)((Iterator)localObject).next());
      if (localMallNews != null) {
        this.rkd.put(localMallNews.rjT, localMallNews);
      }
    }
    GMTrace.o(6881611350016L, 51272);
  }
  
  public final void U(ArrayList<MallFunction> paramArrayList)
  {
    GMTrace.i(6882819309568L, 51281);
    if (paramArrayList != null)
    {
      Object localObject = new HashSet(this.rkd.keySet());
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext()) {
        ((Set)localObject).remove(((MallFunction)paramArrayList.next()).odH);
      }
      paramArrayList = ((Set)localObject).iterator();
      while (paramArrayList.hasNext())
      {
        localObject = (String)paramArrayList.next();
        this.rkd.remove(localObject);
      }
      aXr();
    }
    GMTrace.o(6882819309568L, 51281);
  }
  
  public final boolean aXr()
  {
    GMTrace.i(6882282438656L, 51277);
    w.d("MicroMsg.MallNewsManager", "notifyNewsMap.size : " + this.rkd.size());
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.rkd.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      if (!bg.nm((String)localObject))
      {
        localObject = (MallNews)this.rkd.get(localObject);
        localStringBuffer.append(((MallNews)localObject).rka.replace("</mallactivity></sysmsg>", "").replaceAll("<showflag>([^<]*)</showflag>", "").replaceAll("<newsTipFlag>([^<]*)</newsTipFlag>", "") + "<showflag>" + ((MallNews)localObject).rjR + "</showflag><newsTipFlag>" + ((MallNews)localObject).rjS + "</newsTipFlag></mallactivity></sysmsg>;");
      }
    }
    w.d("MicroMsg.MallNewsManager", "save data  : " + localStringBuffer.toString());
    h.xz();
    h.xy().xh().set(270339, localStringBuffer.toString());
    GMTrace.o(6882282438656L, 51277);
    return true;
  }
  
  public final List<String> bzj()
  {
    GMTrace.i(6881745567744L, 51273);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.rkd.values().iterator();
    while (localIterator.hasNext())
    {
      MallNews localMallNews = (MallNews)localIterator.next();
      if (!bg.nm(localMallNews.eEU)) {
        localArrayList.add(localMallNews.eEU);
      }
    }
    w.d("MicroMsg.MallNewsManager", "tickets.size : " + localArrayList.size());
    GMTrace.o(6881745567744L, 51273);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\mall\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */