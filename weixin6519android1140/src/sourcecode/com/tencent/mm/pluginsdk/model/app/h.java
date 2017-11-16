package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.x.a;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.ab.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public final class h
  implements e, t, ab.b
{
  public Map<String, Integer> hVe;
  private List<String> oKe;
  private List<String> tnD;
  private aj tnE;
  private List<String> tnQ;
  private List<String> tnR;
  private volatile boolean tnS;
  
  public h()
  {
    GMTrace.i(823157325824L, 6133);
    this.tnD = null;
    this.oKe = null;
    this.hVe = null;
    this.tnS = false;
    this.tnE = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(796850651136L, 5937);
        h.this.hVe.clear();
        GMTrace.o(796850651136L, 5937);
        return false;
      }
    }, false);
    this.tnD = new ArrayList();
    this.oKe = new ArrayList();
    this.hVe = new HashMap();
    this.tnQ = new Vector();
    this.tnR = new ArrayList();
    this.tnE.z(600000L, 600000L);
    com.tencent.mm.kernel.h.xx().fYr.a(231, this);
    a.aGk().a(7, this);
    GMTrace.o(823157325824L, 6133);
  }
  
  private void Ou(String paramString)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(823559979008L, 6136);
        if ((!bg.nm(paramString)) && (!this.tnQ.contains(paramString)))
        {
          if (!Ow(paramString))
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppInfoService", "this app has reach the max retry count, appid is %s", new Object[] { paramString });
            GMTrace.o(823559979008L, 6136);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppInfoService", "add appid:[%s]", new Object[] { paramString });
          this.tnQ.add(paramString);
          GMTrace.o(823559979008L, 6136);
          continue;
        }
      }
      finally {}
      tmp117_114[0] = paramString;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppInfoService", "should not add this appid:[%s], it is already runing", tmp117_114);
      GMTrace.o(823559979008L, 6136);
    }
  }
  
  private boolean Ow(String paramString)
  {
    GMTrace.i(823962632192L, 6139);
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppInfoService", "increaseCounter fail, appId is null");
      GMTrace.o(823962632192L, 6139);
      return false;
    }
    Integer localInteger = Integer.valueOf(bg.a((Integer)this.hVe.get(paramString), 0));
    if (localInteger.intValue() >= 5)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppInfoService", "increaseCounter fail, has reached the max try count");
      GMTrace.o(823962632192L, 6139);
      return false;
    }
    this.hVe.put(paramString, Integer.valueOf(localInteger.intValue() + 1));
    GMTrace.o(823962632192L, 6139);
    return true;
  }
  
  private void bJx()
  {
    int i = 20;
    GMTrace.i(823828414464L, 6138);
    if (this.tnS)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppInfoService", " batch get appinfo doing now");
      GMTrace.o(823828414464L, 6138);
      return;
    }
    if ((this.tnQ == null) || (this.tnQ.isEmpty()))
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppInfoService", "batchwaitinglist is empty, no need to doscene");
      GMTrace.o(823828414464L, 6138);
      return;
    }
    int j = this.tnQ.size();
    if (j > 20) {}
    for (;;)
    {
      try
      {
        this.tnR.addAll(this.tnQ.subList(0, i));
        if ((this.tnR != null) && (!this.tnR.isEmpty()))
        {
          this.tnS = true;
          x localx = new x(7, new ad(this.tnR));
          com.tencent.mm.kernel.h.xx().fYr.a(localx, 0);
        }
        GMTrace.o(823828414464L, 6138);
        return;
      }
      finally {}
      i = j;
    }
  }
  
  public final void Ov(String paramString)
  {
    GMTrace.i(823694196736L, 6137);
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppInfoService", "push fail, appId is null");
      GMTrace.o(823694196736L, 6137);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppInfoService", "push appid : " + paramString);
    Ou(paramString);
    bJx();
    GMTrace.o(823694196736L, 6137);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(824096849920L, 6140);
    paramInt1 = paramk.getType();
    switch (paramInt1)
    {
    default: 
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppInfoService", "error type: " + paramInt1);
    case 231: 
      do
      {
        GMTrace.o(824096849920L, 6140);
        return;
        paramString = ((ac)paramk).appId;
        if (this.tnD.contains(paramString)) {
          this.tnD.remove(paramString);
        }
      } while (this.oKe.size() <= 0);
      paramString = (String)this.oKe.remove(0);
      if ((paramString == null) || (paramString.length() == 0))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppInfoService", "startDownload fail, appId is null");
        paramInt1 = 0;
      }
      while (paramInt1 != 0)
      {
        this.tnD.add(paramString);
        GMTrace.o(824096849920L, 6140);
        return;
        if (!Ow(paramString))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppInfoService", "increaseCounter fail");
          paramInt1 = 0;
        }
        else
        {
          paramk = new ac(paramString);
          com.tencent.mm.kernel.h.xx().fYr.a(paramk, 0);
          paramInt1 = 1;
        }
      }
    }
    try
    {
      if ((this.tnR != null) && (!this.tnR.isEmpty()))
      {
        this.tnQ.removeAll(this.tnR);
        this.tnR.clear();
      }
      this.tnS = false;
      bJx();
      GMTrace.o(824096849920L, 6140);
      return;
    }
    finally {}
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, w paramw)
  {
    GMTrace.i(824231067648L, 6141);
    if (paramw.getType() != 7)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppInfoService", "not the getappinfolist scene, ignore");
      GMTrace.o(824231067648L, 6141);
      return;
    }
    try
    {
      if ((this.tnR != null) && (!this.tnR.isEmpty()))
      {
        this.tnQ.removeAll(this.tnR);
        this.tnR.clear();
      }
      this.tnS = false;
      bJx();
      GMTrace.o(824231067648L, 6141);
      return;
    }
    finally {}
  }
  
  public final void at(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(823425761280L, 6135);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppInfoService", "batch push appinfo err: null or nil applist");
      GMTrace.o(823425761280L, 6135);
      return;
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext()) {
      Ou((String)paramLinkedList.next());
    }
    bJx();
    GMTrace.o(823425761280L, 6135);
  }
  
  public final String m(Context paramContext, String paramString)
  {
    GMTrace.i(823291543552L, 6134);
    paramContext = g.m(paramContext, paramString);
    GMTrace.o(823291543552L, 6134);
    return paramContext;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */