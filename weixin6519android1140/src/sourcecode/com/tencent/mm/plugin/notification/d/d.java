package com.tencent.mm.plugin.notification.d;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.kr;
import com.tencent.mm.g.a.nm;
import com.tencent.mm.g.a.pv;
import com.tencent.mm.g.a.pv.a;
import com.tencent.mm.g.a.pw;
import com.tencent.mm.g.a.pw.a;
import com.tencent.mm.plugin.sns.b.g;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.List;

public final class d
  extends com.tencent.mm.plugin.notification.c.a<b>
{
  private com.tencent.mm.sdk.b.c nyH;
  private com.tencent.mm.sdk.b.c nyI;
  
  public d()
  {
    GMTrace.i(10730438918144L, 79948);
    this.nyH = new com.tencent.mm.sdk.b.c() {};
    this.nyI = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(10730438918144L, 79948);
  }
  
  protected final String L(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(10731915313152L, 79959);
    String str = this.mContext.getString(R.l.dMF, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3) });
    GMTrace.o(10731915313152L, 79959);
    return str;
  }
  
  protected final void M(ArrayList<Long> paramArrayList)
  {
    GMTrace.i(10730841571328L, 79951);
    kr localkr = new kr();
    localkr.eOT.eJX = paramArrayList;
    com.tencent.mm.sdk.b.a.vgX.m(localkr);
    GMTrace.o(10730841571328L, 79951);
  }
  
  protected final void aUI()
  {
    GMTrace.i(10730573135872L, 79949);
    Object localObject = ((ActivityManager)this.mContext.getSystemService("activity")).getRunningTasks(1);
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      localObject = ((ActivityManager.RunningTaskInfo)((List)localObject).get(0)).topActivity;
      if (localObject != null)
      {
        localObject = ((ComponentName)localObject).getClassName();
        w.d("MicroMsg.SendSnsFailNotification", "onNotificationClick, currentActivity name:%s", new Object[] { localObject });
        if (((String)localObject).contains("En_424b8e16"))
        {
          w.d("MicroMsg.SendSnsFailNotification", "onNotificationClick, already in SnsTimlineUI");
          GMTrace.o(10730573135872L, 79949);
          return;
        }
      }
    }
    localObject = new Intent();
    ((Intent)localObject).putExtra("sns_resume_state", false);
    ((Intent)localObject).putExtra("sns_timeline_NeedFirstLoadint", true);
    ((Intent)localObject).putExtra("preferred_tab", 2);
    if (Build.VERSION.SDK_INT < 16) {
      ((Intent)localObject).putExtra("is_need_resend_sns", true);
    }
    ((Intent)localObject).putExtra("From_fail_notify", true);
    ((Intent)localObject).putExtra("jump_sns_from_notify", true);
    ((Intent)localObject).addFlags(67108864);
    ((Intent)localObject).addFlags(536870912);
    com.tencent.mm.bj.d.a(this.mContext, "com.tencent.mm.ui.LauncherUI", (Intent)localObject);
    GMTrace.o(10730573135872L, 79949);
  }
  
  public final void aUN()
  {
    GMTrace.i(10730975789056L, 79952);
    com.tencent.mm.sdk.b.a.vgX.b(this.nyI);
    GMTrace.o(10730975789056L, 79952);
  }
  
  public final void aUO()
  {
    GMTrace.i(10731110006784L, 79953);
    com.tencent.mm.sdk.b.a.vgX.b(this.nyH);
    GMTrace.o(10731110006784L, 79953);
  }
  
  public final void aUP()
  {
    GMTrace.i(10731378442240L, 79955);
    com.tencent.mm.sdk.b.a.vgX.c(this.nyI);
    GMTrace.o(10731378442240L, 79955);
  }
  
  public final void aUQ()
  {
    GMTrace.i(10731512659968L, 79956);
    com.tencent.mm.sdk.b.a.vgX.c(this.nyH);
    GMTrace.o(10731512659968L, 79956);
  }
  
  protected final void aUx()
  {
    GMTrace.i(10732317966336L, 79962);
    if (at.AU())
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(589825, Boolean.valueOf(false));
    }
    GMTrace.o(10732317966336L, 79962);
  }
  
  protected final String cD(int paramInt1, int paramInt2)
  {
    GMTrace.i(10731781095424L, 79958);
    String str = this.mContext.getString(R.l.dME, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    GMTrace.o(10731781095424L, 79958);
    return str;
  }
  
  protected final String cE(int paramInt1, int paramInt2)
  {
    GMTrace.i(10732049530880L, 79960);
    if (paramInt2 <= 0)
    {
      str = this.mContext.getString(R.l.dMB, new Object[] { Integer.valueOf(paramInt1) });
      GMTrace.o(10732049530880L, 79960);
      return str;
    }
    String str = this.mContext.getString(R.l.dLY, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(10732049530880L, 79960);
    return str;
  }
  
  public final void cY(final long paramLong)
  {
    GMTrace.i(10731244224512L, 79954);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10721714765824L, 79883);
        w.d("MicroMsg.SendSnsFailNotification", "resend snsInfo id:%d", new Object[] { Long.valueOf(paramLong) });
        nm localnm = new nm();
        localnm.eSB.eSC = ((int)paramLong);
        com.tencent.mm.sdk.b.a.vgX.m(localnm);
        GMTrace.o(10721714765824L, 79883);
      }
    });
    GMTrace.o(10731244224512L, 79954);
  }
  
  public final boolean cZ(long paramLong)
  {
    GMTrace.i(10732183748608L, 79961);
    boolean bool = n.poU.ue((int)paramLong);
    w.d("MicroMsg.SendSnsFailNotification", "checkMsgIfExist, msgId:%d, result:%b", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(bool) });
    GMTrace.o(10732183748608L, 79961);
    return bool;
  }
  
  protected final int getType()
  {
    GMTrace.i(10730707353600L, 79950);
    GMTrace.o(10730707353600L, 79950);
    return 2;
  }
  
  protected final String sa(int paramInt)
  {
    GMTrace.i(10731646877696L, 79957);
    String str = this.mContext.getString(R.l.dLX, new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(10731646877696L, 79957);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\notification\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */