package com.tencent.mm.plugin.wallet_core.model.mall;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d
{
  private static d rke;
  public Map<String, MallNews> rkd;
  
  static
  {
    GMTrace.i(6885637881856L, 51302);
    rke = null;
    GMTrace.o(6885637881856L, 51302);
  }
  
  private d()
  {
    GMTrace.i(6884966793216L, 51297);
    this.rkd = new HashMap();
    PY();
    GMTrace.o(6884966793216L, 51297);
  }
  
  private static MallNews Ko(String paramString)
  {
    GMTrace.i(6885503664128L, 51301);
    if (bg.nm(paramString))
    {
      GMTrace.o(6885503664128L, 51301);
      return null;
    }
    Map localMap = bh.q(paramString, "sysmsg");
    if (localMap == null)
    {
      GMTrace.o(6885503664128L, 51301);
      return null;
    }
    MallNews localMallNews;
    for (;;)
    {
      try
      {
        localMallNews = new MallNews((String)localMap.get(".sysmsg.mallactivitynew.functionid"));
        localMallNews.qrG = ((String)localMap.get(".sysmsg.mallactivitynew.activityid"));
        localMallNews.type = ((String)localMap.get(".sysmsg.mallactivitynew.type"));
        localMallNews.showType = bg.getInt((String)localMap.get(".sysmsg.mallactivitynew.showtype"), 0);
        if (localMap.containsKey(".sysmsg.mallactivitynew.showflag"))
        {
          localMallNews.rjR = ((String)localMap.get(".sysmsg.mallactivitynew.showflag"));
          if (localMap.containsKey(".sysmsg.mallactivitynew.newsTipFlag"))
          {
            localMallNews.rjS = ((String)localMap.get(".sysmsg.mallactivitynew.newsTipFlag"));
            localMallNews.rka = paramString;
            boolean bool = bg.nm(localMallNews.rjT);
            if (!bool) {
              break;
            }
            GMTrace.o(6885503664128L, 51301);
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
        w.e("MicroMsg.MallNewsManagerNewVersion", "cmdid error");
        GMTrace.o(6885503664128L, 51301);
        return null;
      }
    }
    GMTrace.o(6885503664128L, 51301);
    return localMallNews;
  }
  
  public static d bzm()
  {
    GMTrace.i(6884832575488L, 51296);
    if (rke == null) {
      rke = new d();
    }
    d locald = rke;
    GMTrace.o(6884832575488L, 51296);
    return locald;
  }
  
  public final MallNews Kn(String paramString)
  {
    GMTrace.i(14312978513920L, 106640);
    w.d("MicroMsg.MallNewsManagerNewVersion", "removeNewsInIndexUI : " + paramString);
    if ((!bg.nm(paramString)) && (this.rkd.containsKey(paramString)))
    {
      paramString = (MallNews)this.rkd.get(paramString);
      if ("0".equals(paramString.rjR))
      {
        paramString.rjR = "1";
        aXr();
      }
      GMTrace.o(14312978513920L, 106640);
      return paramString;
    }
    GMTrace.o(14312978513920L, 106640);
    return null;
  }
  
  public final MallNews Kp(String paramString)
  {
    GMTrace.i(6885369446400L, 51300);
    paramString = (MallNews)this.rkd.get(paramString);
    GMTrace.o(6885369446400L, 51300);
    return paramString;
  }
  
  public final void PY()
  {
    GMTrace.i(6885101010944L, 51298);
    this.rkd.clear();
    h.xz();
    Object localObject = (String)h.xy().xh().get(270341, "");
    w.d("MicroMsg.MallNewsManagerNewVersion", "data : " + (String)localObject);
    localObject = bg.g(((String)localObject).split(";")).iterator();
    while (((Iterator)localObject).hasNext())
    {
      MallNews localMallNews = Ko((String)((Iterator)localObject).next());
      if (localMallNews != null) {
        this.rkd.put(localMallNews.rjT, localMallNews);
      }
    }
    GMTrace.o(6885101010944L, 51298);
  }
  
  public final boolean aXr()
  {
    GMTrace.i(6885235228672L, 51299);
    w.d("MicroMsg.MallNewsManagerNewVersion", "notifyNewsMap.size : " + this.rkd.size());
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.rkd.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      if (!bg.nm((String)localObject))
      {
        localObject = (MallNews)this.rkd.get(localObject);
        localStringBuffer.append(((MallNews)localObject).rka.replace("</mallactivitynew></sysmsg>;", "").replaceAll("<activityid>([^<]*)</activityid>", "").replaceAll("<type>([^<]*)</type>", "").replaceAll("<showflag>([^<]*)</showflag>", "").replaceAll("<newsTipFlag>([^<]*)</newsTipFlag>", "") + "<activityid>" + ((MallNews)localObject).qrG + "</activityid><type>" + ((MallNews)localObject).type + "</type><showflag>" + ((MallNews)localObject).rjR + "</showflag><newsTipFlag>" + ((MallNews)localObject).rjS + "</newsTipFlag></mallactivitynew></sysmsg>;");
      }
    }
    w.d("MicroMsg.MallNewsManagerNewVersion", "save data  : " + localStringBuffer.toString());
    h.xz();
    h.xy().xh().set(270341, localStringBuffer.toString());
    GMTrace.o(6885235228672L, 51299);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\mall\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */