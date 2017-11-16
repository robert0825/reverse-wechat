package com.tencent.mm.plugin.webwx.a;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.RingtoneManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.og;
import com.tencent.mm.g.a.og.a;
import com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.se;
import com.tencent.mm.protocal.c.sf;
import com.tencent.mm.protocal.c.sh;
import com.tencent.mm.protocal.c.sk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.Map;

public final class f
  implements aq
{
  private bt.a jiF;
  private e rZC;
  private ap rZD;
  private com.tencent.mm.sdk.b.c rZE;
  
  public f()
  {
    GMTrace.i(7658329341952L, 57059);
    this.rZC = new e();
    this.jiF = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(7661013696512L, 57079);
        String str = (String)bh.q(com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY), "sysmsg").get(".sysmsg.pushloginurl.url");
        if (bg.nm(str)) {
          w.e("MicroMsg.SubCoreWebWX.pushloginurl", "pushloginurl is null");
        }
        og localog = new og();
        localog.eTi.eTj = str;
        localog.eTi.type = 1;
        com.tencent.mm.sdk.b.a.vgX.m(localog);
        paramAnonymousa.gtM.tQc = null;
        GMTrace.o(7661013696512L, 57079);
      }
    };
    this.rZD = new ap()
    {
      public final void AI()
      {
        GMTrace.i(7661282131968L, 57081);
        at.AR();
        if (com.tencent.mm.y.c.yF()) {
          f.bGt();
        }
        GMTrace.o(7661282131968L, 57081);
      }
    };
    this.rZE = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(final og paramAnonymousog)
      {
        GMTrace.i(7656852946944L, 57048);
        if ((paramAnonymousog != null) && ((paramAnonymousog instanceof og)))
        {
          final c localc = new c(paramAnonymousog.eTi.eTj);
          paramAnonymousog = new com.tencent.mm.ad.e()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, k paramAnonymous2k)
            {
              GMTrace.i(7657255600128L, 57051);
              at.wS().b(971, this);
              sh localsh = (sh)localc.gMj.gtD.gtK;
              w.d("MicroMsg.SubCoreWebWX", "errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
              String str;
              StringBuilder localStringBuilder;
              Object localObject;
              Cursor localCursor2;
              Cursor localCursor1;
              if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
              {
                if (localsh.uim == null) {
                  break label955;
                }
                paramAnonymous2String = new Intent();
                paramAnonymous2String.putExtra("intent.key.login.url", paramAnonymousog.eTi.eTj);
                paramAnonymous2String.putExtra("intent.key.type", 0);
                paramAnonymous2String.putExtra("intent.key.icon.type", localsh.uim.uii);
                paramAnonymous2String.putExtra("intent.key.ok.string", localsh.uim.uix);
                paramAnonymous2String.putExtra("intent.key.cancel.string", localsh.uim.uiy);
                paramAnonymous2String.putExtra("intent.key.title.string", localsh.uim.uij);
                paramAnonymous2String.putExtra("intent.key.content.string", localsh.uim.uiC);
                paramAnonymous2String.putExtra("intent.key.login.client.version", localsh.uir);
                paramAnonymous2String.putExtra("intent.key.function.control", localsh.uis);
                str = localsh.uim.uij;
                localStringBuilder = new StringBuilder();
                localObject = null;
                localCursor2 = null;
                localCursor1 = localCursor2;
                paramAnonymous2k = (k)localObject;
              }
              for (;;)
              {
                try
                {
                  at.AR();
                  localCursor1 = localCursor2;
                  paramAnonymous2k = (k)localObject;
                  localCursor2 = com.tencent.mm.y.c.yP().a(s.gmw, null, com.tencent.mm.m.a.fTs, true);
                  if (localCursor2 != null)
                  {
                    localCursor1 = localCursor2;
                    paramAnonymous2k = localCursor2;
                    if (localCursor2.getCount() < localsh.uim.uiz)
                    {
                      localCursor1 = localCursor2;
                      paramAnonymous2k = localCursor2;
                      paramAnonymous2Int1 = localCursor2.getCount();
                      localCursor1 = localCursor2;
                      paramAnonymous2k = localCursor2;
                      int i = localCursor2.getColumnIndex("username");
                      paramAnonymous2Int2 = 0;
                      if (paramAnonymous2Int2 < paramAnonymous2Int1)
                      {
                        localCursor1 = localCursor2;
                        paramAnonymous2k = localCursor2;
                        if (!localCursor2.moveToPosition(paramAnonymous2Int2)) {
                          break label963;
                        }
                        localCursor1 = localCursor2;
                        paramAnonymous2k = localCursor2;
                        localStringBuilder.append(localCursor2.getString(i));
                        if (paramAnonymous2Int2 >= paramAnonymous2Int1 - 1) {
                          break label963;
                        }
                        localCursor1 = localCursor2;
                        paramAnonymous2k = localCursor2;
                        localStringBuilder.append(",");
                        break label963;
                      }
                    }
                    else
                    {
                      localCursor1 = localCursor2;
                      paramAnonymous2k = localCursor2;
                      paramAnonymous2Int1 = localsh.uim.uiz;
                      continue;
                    }
                  }
                  localCursor1 = localCursor2;
                  paramAnonymous2k = localCursor2;
                  paramAnonymous2String.putExtra("intent.key.ok.session.list", localStringBuilder.toString());
                  if (localCursor2 == null) {
                    break label694;
                  }
                  localCursor2.close();
                  paramAnonymous2k = paramAnonymous2String;
                  paramAnonymous2String = str;
                }
                catch (Exception localException)
                {
                  paramAnonymous2k = localCursor1;
                  w.printErrStackTrace("MicroMsg.SubCoreWebWX", localException, "[oneliang]get session list error.", new Object[0]);
                  if (localCursor1 == null) {
                    break label694;
                  }
                  localCursor1.close();
                  paramAnonymous2k = paramAnonymous2String;
                  paramAnonymous2String = str;
                  continue;
                }
                finally
                {
                  if (paramAnonymous2k == null) {
                    continue;
                  }
                  paramAnonymous2k.close();
                }
                if (paramAnonymous2k != null)
                {
                  paramAnonymous2k.setFlags(268435456);
                  paramAnonymous2k.setClass(ab.getContext(), ExtDeviceWXLoginUI.class);
                  ab.getContext().startActivity(paramAnonymous2k);
                  paramAnonymous2k = new Intent(paramAnonymous2k);
                  paramAnonymous2k.setFlags(67108864);
                  if (paramAnonymousog.eTi.type == 1)
                  {
                    paramAnonymous2k = PendingIntent.getActivity(ab.getContext(), 0, paramAnonymous2k, 134217728);
                    paramAnonymous2String = new Notification.Builder(ab.getContext()).setTicker(null).setWhen(System.currentTimeMillis()).setContentTitle(ab.getContext().getString(R.l.app_name)).setContentText(paramAnonymous2String).setContentIntent(paramAnonymous2k).getNotification();
                    paramAnonymous2String.icon = com.tencent.mm.bi.a.bIN();
                    paramAnonymous2String.flags |= 0x10;
                    paramAnonymous2String.sound = RingtoneManager.getDefaultUri(2);
                    at.getNotification().notify(38, paramAnonymous2String);
                  }
                }
                GMTrace.o(7657255600128L, 57051);
                return;
                label694:
                paramAnonymous2k = paramAnonymous2String;
                paramAnonymous2String = str;
                continue;
                if (paramAnonymous2Int2 == -1)
                {
                  if (localsh.uio != null)
                  {
                    paramAnonymous2k = new Intent();
                    paramAnonymous2k.putExtra("intent.key.login.url", paramAnonymousog.eTi.eTj);
                    paramAnonymous2k.putExtra("intent.key.type", -1);
                    paramAnonymous2k.putExtra("intent.key.title.string", localsh.uio.uik);
                    paramAnonymous2k.putExtra("intent.key.icon.type", localsh.uio.uii);
                    paramAnonymous2k.putExtra("intent.key.ok.string", localsh.uio.uil);
                    paramAnonymous2k.putExtra("intent.key.content.string", localsh.uio.uij);
                    paramAnonymous2String = localsh.uio.uij;
                  }
                }
                else if ((paramAnonymous2Int2 == -2) && (localsh.uip != null))
                {
                  paramAnonymous2k = new Intent();
                  paramAnonymous2k.putExtra("intent.key.login.url", paramAnonymousog.eTi.eTj);
                  paramAnonymous2k.putExtra("intent.key.type", -2);
                  paramAnonymous2k.putExtra("intent.key.title.string", localsh.uip.uik);
                  paramAnonymous2k.putExtra("intent.key.icon.type", localsh.uip.uii);
                  paramAnonymous2k.putExtra("intent.key.ok.string", localsh.uip.uil);
                  paramAnonymous2k.putExtra("intent.key.content.string", localsh.uip.uij);
                  paramAnonymous2String = localsh.uip.uij;
                  continue;
                }
                label955:
                paramAnonymous2String = null;
                paramAnonymous2k = null;
                continue;
                label963:
                paramAnonymous2Int2 += 1;
              }
            }
          };
          at.wS().a(971, paramAnonymousog);
          at.wS().a(localc, 0);
        }
        GMTrace.o(7656852946944L, 57048);
        return false;
      }
    };
    GMTrace.o(7658329341952L, 57059);
  }
  
  public static void bGt()
  {
    GMTrace.i(7659134648320L, 57065);
    at.getNotification().cancel(38);
    GMTrace.o(7659134648320L, 57065);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7658866212864L, 57063);
    d.c.a(Integer.valueOf(51), this.rZC);
    at.getSysCmdMsgExtension().a("pushloginurl", this.jiF, true);
    at.AR();
    com.tencent.mm.y.c.a(this.rZD);
    com.tencent.mm.sdk.b.a.vgX.b(this.rZE);
    GMTrace.o(7658866212864L, 57063);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7659000430592L, 57064);
    GMTrace.o(7659000430592L, 57064);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7658731995136L, 57062);
    GMTrace.o(7658731995136L, 57062);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7658463559680L, 57060);
    d.c.aE(Integer.valueOf(51));
    at.getSysCmdMsgExtension().b("pushloginurl", this.jiF, true);
    at.AR();
    com.tencent.mm.y.c.b(this.rZD);
    com.tencent.mm.sdk.b.a.vgX.c(this.rZE);
    bGt();
    GMTrace.o(7658463559680L, 57060);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7658597777408L, 57061);
    GMTrace.o(7658597777408L, 57061);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webwx\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */