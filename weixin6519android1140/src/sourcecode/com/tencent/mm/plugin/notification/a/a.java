package com.tencent.mm.plugin.notification.a;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.f;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class a
  implements m.b
{
  private final String TAG;
  private ae mHandler;
  private final int nxX;
  public boolean nxY;
  
  public a()
  {
    GMTrace.i(10737149804544L, 79998);
    this.TAG = "MicroMsg.NotificationObserver";
    this.nxX = 50;
    this.nxY = false;
    this.mHandler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(final Message paramAnonymousMessage)
      {
        GMTrace.i(10737820893184L, 80003);
        super.handleMessage(paramAnonymousMessage);
        paramAnonymousMessage = paramAnonymousMessage.getData().getString("com.tencent.mm.notification.observer");
        at.xB().h(new Runnable()
        {
          public final void run()
          {
            final int i = 0;
            GMTrace.i(10737015586816L, 79997);
            final int j = f.up();
            at.AR();
            x localx = c.yK().TE(paramAnonymousMessage);
            final boolean bool;
            if (localx == null)
            {
              bool = false;
              if (!bool) {
                break label75;
              }
            }
            for (;;)
            {
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(10737552457728L, 80001);
                  at.getNotification().dU(j);
                  if (!bool) {
                    at.getNotification().m(a.1.1.this.nya, i);
                  }
                  w.i("MicroMsg.NotificationObserver", "NotificationObserver refresh total badge count: %d, and talker badge count: %d, talker is mute: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool) });
                  e.post(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(10738089328640L, 80005);
                      at.getNotification().i(a.1.1.1.this.nyc, a.1.1.this.nya);
                      if (a.this.nxY)
                      {
                        a.this.nxY = false;
                        at.getNotification().aF(false);
                      }
                      GMTrace.o(10738089328640L, 80005);
                    }
                  }, "NotificationObserver");
                  GMTrace.o(10737552457728L, 80001);
                }
              });
              GMTrace.o(10737015586816L, 79997);
              return;
              bool = localx.vc();
              break;
              label75:
              i = f.dZ(paramAnonymousMessage);
            }
          }
        }, 500L);
        GMTrace.o(10737820893184L, 80003);
      }
    };
    GMTrace.o(10737149804544L, 79998);
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(10737284022272L, 79999);
    w.i("MicroMsg.NotificationObserver", "event: %d", new Object[] { Integer.valueOf(paramInt) });
    if ((!(paramObject instanceof String)) || (bg.nm((String)paramObject)))
    {
      w.d("MicroMsg.NotificationObserver", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(10737284022272L, 79999);
      return;
    }
    if (!at.AJ()) {
      at.AR();
    }
    for (paramInt = (int)c.yK().TC((String)paramObject).fTq;; paramInt = 0)
    {
      this.mHandler.removeMessages(paramInt);
      paramm = Message.obtain();
      Bundle localBundle = new Bundle();
      localBundle.putString("com.tencent.mm.notification.observer", (String)paramObject);
      paramm.setData(localBundle);
      paramm.what = paramInt;
      this.mHandler.sendMessageDelayed(paramm, 50L);
      GMTrace.o(10737284022272L, 79999);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\notification\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */