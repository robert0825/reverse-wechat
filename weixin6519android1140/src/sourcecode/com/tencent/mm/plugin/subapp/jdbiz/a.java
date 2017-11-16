package com.tencent.mm.plugin.subapp.jdbiz;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.g.a.ki;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.am;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt.a;
import java.util.Map;

public final class a
  implements bt.a
{
  public com.tencent.mm.sdk.b.c qrC;
  
  public a()
  {
    GMTrace.i(5852027158528L, 43601);
    this.qrC = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(5852027158528L, 43601);
  }
  
  public final void a(final d.a parama)
  {
    GMTrace.i(5852161376256L, 43602);
    w.i("MicroMsg.JDSysMsgNotifyLsn", "receivemsg jd");
    Object localObject = parama.gtM;
    if (localObject == null)
    {
      w.e("MicroMsg.JDSysMsgNotifyLsn", "onPreAddMessage cmdAM is null");
      GMTrace.o(5852161376256L, 43602);
      return;
    }
    parama = new b();
    parama.Ie(com.tencent.mm.platformtools.n.a(((bu)localObject).tPY));
    w.i("MicroMsg.JDSysMsgNotifyLsn", "bizType " + bg.aq(parama.qrF, ""));
    if (bg.nm(parama.qrF)) {
      w.e("MicroMsg.JDSysMsgNotifyLsn", "bizTye is null or nil");
    }
    for (;;)
    {
      at.AR();
      com.tencent.mm.y.c.xh().kL(true);
      GMTrace.o(5852161376256L, 43602);
      return;
      if (bg.nm(parama.qrG))
      {
        w.e("MicroMsg.JDSysMsgNotifyLsn", "activity id is null");
      }
      else if (!parama.a(c.brr().brw()))
      {
        w.i("MicroMsg.JDSysMsgNotifyLsn", "fo zu baoyou! the activityid is same");
      }
      else if (!c.brz())
      {
        w.e("MicroMsg.JDSysMsgNotifyLsn", "no entrance, ignore msg");
      }
      else
      {
        if (parama.qrF.equals("3"))
        {
          ((bu)localObject).tQc = null;
          if ((bg.nm(parama.qrQ)) || (bg.nm(parama.jumpUrl)) || (bg.nm(parama.qrR)) || (bg.nm(parama.qrS)) || (bg.nm(parama.qrP))) {
            w.e("MicroMsg.JDSysMsgNotifyLsn", "invalid params");
          }
          for (;;)
          {
            c.b(parama);
            break;
            if (parama.brk())
            {
              w.i("MicroMsg.JDSysMsgNotifyLsn", "ingore msg due to msg is expired");
            }
            else
            {
              localObject = c.brr();
              String str = parama.qrG;
              if (bg.nm(str)) {}
              for (boolean bool = false;; bool = ((c)localObject).qrV.containsKey(str))
              {
                if (!bool) {
                  break label348;
                }
                w.i("MicroMsg.JDSysMsgNotifyLsn", "activity id already show, " + parama.qrG);
                break;
              }
              label348:
              if (!parama.a(c.brr().brw()))
              {
                w.i("MicroMsg.JDSysMsgNotifyLsn", "the remind activitid is same");
              }
              else
              {
                localObject = c.brr();
                str = parama.qrG;
                if (!bg.nm(str)) {
                  ((c)localObject).qrV.put(str, Integer.valueOf(1));
                }
                w.i("MicroMsg.JDSysMsgNotifyLsn", "add activity id" + parama.qrG);
                new ae(Looper.getMainLooper()).post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(5851892940800L, 43600);
                    Object localObject = a.this;
                    b localb = parama;
                    at.AR();
                    int i = ((Integer)com.tencent.mm.y.c.xh().get(15, Integer.valueOf(0))).intValue();
                    if ((at.wS().foreground) && (1 == i))
                    {
                      localObject = c.bW(localb.jumpUrl, 5);
                      JDRemindDialog.a(ab.getContext(), localb.qrQ, localb.qrR, localb.qrS, (String)localObject, localb.qrG);
                      g.ork.i(11178, new Object[] { localObject, c.brr().brw().qrG, Integer.valueOf(5) });
                      GMTrace.o(5851892940800L, 43600);
                      return;
                    }
                    String str = c.bW(localb.jumpUrl, 4);
                    Bundle localBundle = new Bundle();
                    localBundle.putString("activity_id", localb.qrG);
                    localBundle.putString("jump_url", str);
                    ((am)at.getNotification()).a(37, ab.getContext().getString(R.l.cUi), localb.qrP, str, "bizjd", localBundle);
                    com.tencent.mm.sdk.b.a.vgX.b(((a)localObject).qrC);
                    g.ork.i(11178, new Object[] { str, c.brr().brw().qrG, Integer.valueOf(4) });
                    GMTrace.o(5851892940800L, 43600);
                  }
                });
              }
            }
          }
        }
        if (parama.qrF.equals("1")) {
          c.b(parama);
        } else if (parama.qrF.equals("2")) {
          c.b(parama);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\jdbiz\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */