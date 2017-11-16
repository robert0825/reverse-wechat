package com.tencent.mm.plugin.notification.d;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.nk;
import com.tencent.mm.g.a.om;
import com.tencent.mm.g.a.om.a;
import com.tencent.mm.g.a.oo;
import com.tencent.mm.g.a.oo.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.notification.c.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public final class c
  extends com.tencent.mm.plugin.notification.c.a<au>
{
  private com.tencent.mm.sdk.b.c nyA;
  private com.tencent.mm.sdk.b.c nyB;
  
  public c()
  {
    GMTrace.i(10722654289920L, 79890);
    this.nyA = new com.tencent.mm.sdk.b.c() {};
    this.nyB = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(10722654289920L, 79890);
  }
  
  public static boolean Ec(String paramString)
  {
    GMTrace.i(16058614284288L, 119646);
    if (((!x.To(paramString)) && (!x.Tq(paramString))) || (x.fw(paramString)))
    {
      GMTrace.o(16058614284288L, 119646);
      return true;
    }
    GMTrace.o(16058614284288L, 119646);
    return false;
  }
  
  protected final String L(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(10724130684928L, 79901);
    String str = this.mContext.getString(R.l.dMD, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3) });
    GMTrace.o(10724130684928L, 79901);
    return str;
  }
  
  protected final void M(ArrayList<Long> paramArrayList)
  {
    GMTrace.i(10723728031744L, 79898);
    at.AR();
    com.tencent.mm.y.c.yM().J(paramArrayList);
    GMTrace.o(10723728031744L, 79898);
  }
  
  protected final void aUI()
  {
    GMTrace.i(10723459596288L, 79896);
    w.d("MicroMsg.SendNormalMsgFailNotificaiton", "onNotificationClick, mMsgList.size:%d", new Object[] { Integer.valueOf(this.nyj.nyu.size()) });
    Object localObject;
    if (this.nyj.nyu.size() > 1)
    {
      localObject = new Intent();
      ((Intent)localObject).addFlags(67108864);
      ((Intent)localObject).addFlags(536870912);
      if (Build.VERSION.SDK_INT < 16) {
        ((Intent)localObject).putExtra("resend_fail_messages", true);
      }
      ((Intent)localObject).putExtra("From_fail_notify", true);
      w.d("MicroMsg.SendNormalMsgFailNotificaiton", "startMainUI");
      d.a(this.mContext, "com.tencent.mm.ui.LauncherUI", (Intent)localObject);
      GMTrace.o(10723459596288L, 79896);
      return;
    }
    if (this.nyj.nyu.size() == 1)
    {
      long l = this.nyj.get(0);
      at.AR();
      localObject = com.tencent.mm.y.c.yM().cM(l).field_talker;
      Intent localIntent = new Intent();
      localIntent.putExtra("Main_User", (String)localObject);
      localIntent.putExtra("From_fail_notify", true);
      localIntent.addFlags(67108864);
      localIntent.addFlags(536870912);
      if (Build.VERSION.SDK_INT < 16) {
        localIntent.putExtra("resend_fail_messages", true);
      }
      d.a(this.mContext, "com.tencent.mm.ui.LauncherUI", localIntent);
    }
    GMTrace.o(10723459596288L, 79896);
  }
  
  public final void aUN()
  {
    GMTrace.i(10722788507648L, 79891);
    com.tencent.mm.sdk.b.a.vgX.b(this.nyA);
    GMTrace.o(10722788507648L, 79891);
  }
  
  public final void aUO()
  {
    GMTrace.i(10722922725376L, 79892);
    com.tencent.mm.sdk.b.a.vgX.b(this.nyB);
    GMTrace.o(10722922725376L, 79892);
  }
  
  public final void aUP()
  {
    GMTrace.i(10723191160832L, 79894);
    com.tencent.mm.sdk.b.a.vgX.c(this.nyA);
    GMTrace.o(10723191160832L, 79894);
  }
  
  public final void aUQ()
  {
    GMTrace.i(10723325378560L, 79895);
    com.tencent.mm.sdk.b.a.vgX.c(this.nyB);
    GMTrace.o(10723325378560L, 79895);
  }
  
  protected final String cD(int paramInt1, int paramInt2)
  {
    GMTrace.i(10723996467200L, 79900);
    String str = this.mContext.getString(R.l.dMC, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    GMTrace.o(10723996467200L, 79900);
    return str;
  }
  
  protected final String cE(int paramInt1, int paramInt2)
  {
    GMTrace.i(10724264902656L, 79902);
    if (paramInt2 <= 0)
    {
      str = this.mContext.getString(R.l.dMA, new Object[] { Integer.valueOf(paramInt1) });
      GMTrace.o(10724264902656L, 79902);
      return str;
    }
    String str = this.mContext.getString(R.l.dMz, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(10724264902656L, 79902);
    return str;
  }
  
  public final void cY(final long paramLong)
  {
    GMTrace.i(10723056943104L, 79893);
    at.AR();
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10729767829504L, 79943);
        w.d("MicroMsg.SendNormalMsgFailNotificaiton", "resend msgId:%d", new Object[] { Long.valueOf(paramLong) });
        nk localnk = new nk();
        localnk.eSx.eAH = this.gmh;
        com.tencent.mm.sdk.b.a.vgX.m(localnk);
        GMTrace.o(10729767829504L, 79943);
      }
    });
    GMTrace.o(10723056943104L, 79893);
  }
  
  public final boolean cZ(long paramLong)
  {
    GMTrace.i(10724399120384L, 79903);
    at.AR();
    au localau = com.tencent.mm.y.c.yM().cM(paramLong);
    w.d("MicroMsg.SendNormalMsgFailNotificaiton", "checkMsgIfExist, msgId:%d, msg.getMsgId:%d", new Object[] { Long.valueOf(paramLong), Long.valueOf(localau.field_msgId) });
    if (localau.field_msgId != 0L)
    {
      GMTrace.o(10724399120384L, 79903);
      return true;
    }
    GMTrace.o(10724399120384L, 79903);
    return false;
  }
  
  protected final int getType()
  {
    GMTrace.i(10723593814016L, 79897);
    GMTrace.o(10723593814016L, 79897);
    return 1;
  }
  
  protected final String sa(int paramInt)
  {
    GMTrace.i(10723862249472L, 79899);
    String str = this.mContext.getString(R.l.dLW, new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(10723862249472L, 79899);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\notification\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */