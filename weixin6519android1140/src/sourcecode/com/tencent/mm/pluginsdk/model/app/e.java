package com.tencent.mm.pluginsdk.model.app;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.x.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class e
{
  public Map<String, Integer> hVe;
  private ae handler;
  public List<r> oKe;
  public List<r> tnD;
  private aj tnE;
  
  public e()
  {
    GMTrace.i(792287248384L, 5903);
    this.tnD = null;
    this.oKe = null;
    this.hVe = null;
    this.tnE = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(774973161472L, 5774);
        e.this.hVe.clear();
        GMTrace.o(774973161472L, 5774);
        return false;
      }
    }, false);
    this.handler = new ae(h.xB().ngv.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(829197123584L, 6178);
        paramAnonymousMessage = (u)paramAnonymousMessage.obj;
        r localr = new r(paramAnonymousMessage.appId, paramAnonymousMessage.gUu);
        if (e.this.tnD.contains(localr))
        {
          e.this.tnD.remove(localr);
          if (!a.aWy().d(paramAnonymousMessage.appId, paramAnonymousMessage.data, paramAnonymousMessage.gUu)) {
            w.e("MicroMsg.AppIconService", "handleMessage, saveIcon fail");
          }
        }
        while (e.this.oKe.size() > 0)
        {
          paramAnonymousMessage = (r)e.this.oKe.remove(0);
          if (e.this.a(paramAnonymousMessage))
          {
            e.this.tnD.add(paramAnonymousMessage);
            GMTrace.o(829197123584L, 6178);
            return;
          }
        }
        GMTrace.o(829197123584L, 6178);
      }
    };
    this.tnD = new ArrayList();
    this.oKe = new ArrayList();
    this.hVe = new HashMap();
    this.tnE.z(600000L, 600000L);
    GMTrace.o(792287248384L, 5903);
  }
  
  public final boolean a(r paramr)
  {
    GMTrace.i(792555683840L, 5905);
    if (paramr == null)
    {
      w.e("MicroMsg.AppIconService", "startDownload fail, geticoninfo is null");
      GMTrace.o(792555683840L, 5905);
      return false;
    }
    int i;
    if (paramr == null)
    {
      w.e("MicroMsg.AppIconService", "increaseCounter fail, info is null");
      i = 0;
    }
    while (i == 0)
    {
      w.e("MicroMsg.AppIconService", "increaseCounter fail");
      GMTrace.o(792555683840L, 5905);
      return false;
      localObject = Integer.valueOf(bg.a((Integer)this.hVe.get(paramr.toString()), 0));
      if (((Integer)localObject).intValue() >= 5)
      {
        w.e("MicroMsg.AppIconService", "increaseCounter fail, has reached the max try count");
        i = 0;
      }
      else
      {
        this.hVe.put(paramr.toString(), Integer.valueOf(((Integer)localObject).intValue() + 1));
        i = 1;
      }
    }
    Object localObject = a.aWy().Ox(paramr.appId);
    if (localObject == null)
    {
      w.e("MicroMsg.AppIconService", "push, appinfo does not exist, appId = " + paramr.appId);
      GMTrace.o(792555683840L, 5905);
      return false;
    }
    switch (paramr.gUu)
    {
    default: 
      w.e("MicroMsg.AppIconService", "push, unknown iconType = " + paramr.gUu);
      GMTrace.o(792555683840L, 5905);
      return false;
    case 1: 
      if ((((f)localObject).field_appIconUrl == null) || (((f)localObject).field_appIconUrl.length() == 0))
      {
        w.e("MicroMsg.AppIconService", "push, appIconUrl is null, appId = " + paramr.appId);
        GMTrace.o(792555683840L, 5905);
        return false;
      }
      localObject = ((f)localObject).field_appIconUrl;
    }
    for (;;)
    {
      w.i("MicroMsg.AppIconService", "appIconUrl = " + (String)localObject);
      com.tencent.mm.sdk.f.e.post(new s(this.handler, paramr.appId, paramr.gUu, (String)localObject), "AppIconService_getIcon");
      GMTrace.o(792555683840L, 5905);
      return true;
      if ((((f)localObject).field_appWatermarkUrl == null) || (((f)localObject).field_appWatermarkUrl.length() == 0))
      {
        w.e("MicroMsg.AppIconService", "push, appWatermarkUrl is null, appId = " + paramr.appId);
        GMTrace.o(792555683840L, 5905);
        return false;
      }
      localObject = ((f)localObject).field_appWatermarkUrl;
      continue;
      if ((((n)localObject).fdS == null) || (((n)localObject).fdS.length() == 0))
      {
        w.e("MicroMsg.AppIconService", "push, appSuggestionIconUrl is null, appId = " + paramr.appId);
        GMTrace.o(792555683840L, 5905);
        return false;
      }
      localObject = ((n)localObject).fdS;
      continue;
      if ((((n)localObject).fed == null) || (((n)localObject).fed.length() == 0))
      {
        w.e("MicroMsg.AppIconService", "push, servicePanelIconUrl is null, appId = " + paramr.appId);
        GMTrace.o(792555683840L, 5905);
        return false;
      }
      localObject = ((n)localObject).fed;
      continue;
      if ((((n)localObject).fee == null) || (((n)localObject).fee.length() == 0))
      {
        w.e("MicroMsg.AppIconService", "push, serviceListIconUrl is null, appId = " + paramr.appId);
        GMTrace.o(792555683840L, 5905);
        return false;
      }
      localObject = ((n)localObject).fee;
    }
  }
  
  public final void cA(String paramString, int paramInt)
  {
    GMTrace.i(792421466112L, 5904);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AppIconService", "push fail, appId is null");
      GMTrace.o(792421466112L, 5904);
      return;
    }
    r localr = new r(paramString, paramInt);
    if (this.tnD.contains(localr))
    {
      w.i("MicroMsg.AppIconService", "push, appId = " + paramString + ", iconType = " + paramInt + " already in running list");
      GMTrace.o(792421466112L, 5904);
      return;
    }
    if (this.tnD.size() >= 5)
    {
      w.i("MicroMsg.AppIconService", "running list has reached the max count");
      if (!this.oKe.contains(localr)) {
        this.oKe.add(localr);
      }
      GMTrace.o(792421466112L, 5904);
      return;
    }
    if (a(localr)) {
      this.tnD.add(localr);
    }
    GMTrace.o(792421466112L, 5904);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */