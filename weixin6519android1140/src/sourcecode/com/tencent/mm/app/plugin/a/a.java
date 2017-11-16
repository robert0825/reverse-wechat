package com.tencent.mm.app.plugin.a;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.af.d;
import com.tencent.mm.af.d.b;
import com.tencent.mm.af.d.b.a;
import com.tencent.mm.af.f;
import com.tencent.mm.g.a.cv;
import com.tencent.mm.g.a.du;
import com.tencent.mm.g.a.iy;
import com.tencent.mm.g.a.kx;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.chatting.En_5b8fbb1e.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  public En_5b8fbb1e.a euA;
  public b euB;
  public a euC;
  private String euD;
  public Map<String, Boolean> euE;
  public boolean euF;
  
  public a(En_5b8fbb1e.a parama)
  {
    GMTrace.i(13033615130624L, 97108);
    w.d("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now init the event listener");
    this.euA = parama;
    this.euF = true;
    if (this.euB == null) {
      this.euB = new b();
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.euB);
    if (this.euC == null) {
      this.euC = new a();
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.euC);
    GMTrace.o(13033615130624L, 97108);
  }
  
  public static boolean a(d paramd)
  {
    GMTrace.i(13034017783808L, 97111);
    if (paramd == null)
    {
      GMTrace.o(13034017783808L, 97111);
      return false;
    }
    if (paramd != null)
    {
      paramd = paramd.bq(false);
      if ((paramd != null) && (paramd.EZ() != null) && (paramd.EZ().Fi()))
      {
        GMTrace.o(13034017783808L, 97111);
        return true;
      }
    }
    GMTrace.o(13034017783808L, 97111);
    return false;
  }
  
  public final void a(final int paramInt, d paramd)
  {
    GMTrace.i(13033883566080L, 97110);
    if (this.euA == null)
    {
      w.e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "notifySwitchView, context is null, maybe has been released");
      GMTrace.o(13033883566080L, 97110);
      return;
    }
    if ((s.fD(this.euA.cci())) && (a(paramd))) {
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13032004517888L, 97096);
          if (1 == paramInt)
          {
            localObject = new du();
            ((du)localObject).eFy.op = 0;
            ((du)localObject).eFy.userName = a.this.euA.cci();
            ((du)localObject).eFy.context = a.this.euA.vKB.vKW;
            com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
            if (a.this.euA.cci().equals("gh_43f2581f6fd6"))
            {
              localObject = new qh();
              ((qh)localObject).eUX.action = 1;
              com.tencent.mm.sdk.b.a.vgX.a((b)localObject, Looper.getMainLooper());
            }
          }
          Object localObject = new iy();
          ((iy)localObject).eMy.opType = paramInt;
          ((iy)localObject).eMy.eMA = 1;
          ((iy)localObject).eMy.eMz = a.this.euA.cci();
          com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
          GMTrace.o(13032004517888L, 97096);
        }
      });
    }
    GMTrace.o(13033883566080L, 97110);
  }
  
  public final void d(int paramInt, String paramString1, String paramString2)
  {
    label123:
    Map localMap;
    for (;;)
    {
      d locald;
      try
      {
        GMTrace.i(13033749348352L, 97109);
        w.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now connect state : %d", new Object[] { Integer.valueOf(paramInt) });
        if ((this.euA == null) || (bg.nm(paramString1)))
        {
          w.w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context is null or brandName is null or nil.");
          GMTrace.o(13033749348352L, 97109);
          return;
        }
        locald = f.iK(paramString1);
        if (!a(locald))
        {
          w.w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "It's not a biz, brandName(%s).", new Object[] { paramString1 });
          GMTrace.o(13033749348352L, 97109);
          continue;
        }
        if (this.euE != null) {
          break label123;
        }
      }
      finally {}
      this.euE = new HashMap();
      localMap = this.euE;
      if (!paramString1.equals(this.euD))
      {
        this.euD = paramString1;
        localMap.clear();
      }
      if (locald.bq(false).EZ().gwu != 1) {
        break;
      }
      this.euA.Ve(null);
      GMTrace.o(13033749348352L, 97109);
    }
    w.d("MicroMsg.exdevice.ChattingUIExDeviceLogic", "connDeviceIds : (%s) , deviceId : (%s)", new Object[] { localMap, paramString2 });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(13033749348352L, 97109);
      break;
      this.euA.Ve(null);
      GMTrace.o(13033749348352L, 97109);
      break;
      if (localMap.size() == 0)
      {
        this.euA.AW(R.l.dro);
        GMTrace.o(13033749348352L, 97109);
        break;
        localMap.put(paramString2, Boolean.valueOf(true));
        this.euA.Ve(this.euA.getString(R.l.drm, new Object[] { Integer.valueOf(localMap.size()) }));
        w.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now connected(deviceId : %s), set the tips gone", new Object[] { paramString2 });
        GMTrace.o(13033749348352L, 97109);
        break;
        if (localMap.remove(paramString2) != null) {
          w.i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "disconnected(deviceId : %s) successfully.", new Object[] { paramString2 });
        }
        this.euA.Ve(this.euA.getString(R.l.drm, new Object[] { Integer.valueOf(localMap.size()) }));
        GMTrace.o(13033749348352L, 97109);
        break;
        if (localMap.size() == 0) {
          this.euA.AW(R.l.drn);
        }
      }
    }
  }
  
  final class a
    extends c<cv>
  {
    a()
    {
      GMTrace.i(13033346695168L, 97106);
      this.vhf = cv.class.getName().hashCode();
      GMTrace.o(13033346695168L, 97106);
    }
  }
  
  final class b
    extends c<kx>
  {
    b()
    {
      GMTrace.i(13033078259712L, 97104);
      this.vhf = kx.class.getName().hashCode();
      GMTrace.o(13033078259712L, 97104);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\plugin\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */