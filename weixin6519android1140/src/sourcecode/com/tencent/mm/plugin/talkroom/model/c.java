package com.tencent.mm.plugin.talkroom.model;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.talkroom.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.p.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;
import java.util.List;

public final class c
  implements p.o
{
  public boolean mAG;
  public String mAd;
  ae mHandler;
  public boolean qwX;
  private Notification qwY;
  private String qwZ;
  
  public c()
  {
    GMTrace.i(5155302932480L, 38410);
    this.mAd = "";
    this.mAG = false;
    this.qwX = false;
    this.mHandler = new ae(Looper.getMainLooper());
    GMTrace.o(5155302932480L, 38410);
  }
  
  private static boolean bsj()
  {
    GMTrace.i(5153692319744L, 38398);
    if (bg.nm(b.bsf().qxO))
    {
      w.w("MicroMsg.TalkRoomDisplayMgr", "yy checkServer null");
      w.v("MicroMsg.TalkRoomDisplayMgr", "yy dismissStatusBar");
      bsl();
      GMTrace.o(5153692319744L, 38398);
      return false;
    }
    GMTrace.o(5153692319744L, 38398);
    return true;
  }
  
  private void bsk()
  {
    GMTrace.i(5155571367936L, 38412);
    if (!bsj())
    {
      GMTrace.o(5155571367936L, 38412);
      return;
    }
    if (this.qwY == null)
    {
      w.e("MicroMsg.TalkRoomDisplayMgr", "yy updateNotify error no notification");
      GMTrace.o(5155571367936L, 38412);
      return;
    }
    String str2 = h.ax(ab.getContext(), b.bsf().qxO);
    if (b.bsf().qyc) {}
    for (String str1 = ab.getContext().getString(R.l.edX);; str1 = ab.getContext().getString(R.l.edU, new Object[] { Integer.valueOf(b.bsf().aKv().size()) }))
    {
      Object localObject = a.hnI.pv();
      ((Intent)localObject).putExtra("enter_chat_usrname", b.bsf().qxO);
      localObject = PendingIntent.getActivity(ab.getContext(), 100, (Intent)localObject, 268435456);
      this.qwY = new Notification.Builder(ab.getContext()).setTicker(this.qwZ).setWhen(0L).setContentTitle(str2).setContentText(str1).setContentIntent((PendingIntent)localObject).getNotification();
      this.qwY.icon = R.g.baV;
      this.qwY.flags = 32;
      at.getNotification().a(100, this.qwY, false);
      GMTrace.o(5155571367936L, 38412);
      return;
    }
  }
  
  public static void bsl()
  {
    GMTrace.i(5155705585664L, 38413);
    w.v("MicroMsg.TalkRoomDisplayMgr", "yy cancelNotify");
    at.getNotification().cancel(100);
    GMTrace.o(5155705585664L, 38413);
  }
  
  public final void Bt(String paramString)
  {
    GMTrace.i(5154363408384L, 38403);
    this.mAd = paramString;
    GMTrace.o(5154363408384L, 38403);
  }
  
  public final void H(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(5153960755200L, 38400);
    this.mAG = false;
    GMTrace.o(5153960755200L, 38400);
  }
  
  public final void JB(String paramString)
  {
    GMTrace.i(5155437150208L, 38411);
    if (!bsj())
    {
      GMTrace.o(5155437150208L, 38411);
      return;
    }
    w.v("MicroMsg.TalkRoomDisplayMgr", "yy showNotify: " + paramString);
    this.qwZ = paramString;
    this.qwY = new Notification.Builder(ab.getContext()).setTicker(paramString).setWhen(0L).getNotification();
    this.qwY.icon = R.g.baV;
    this.qwY.flags = 32;
    bsk();
    GMTrace.o(5155437150208L, 38411);
  }
  
  public final void aKX()
  {
    GMTrace.i(5153826537472L, 38399);
    this.mAG = false;
    GMTrace.o(5153826537472L, 38399);
  }
  
  public final void aKY()
  {
    GMTrace.i(5154094972928L, 38401);
    GMTrace.o(5154094972928L, 38401);
  }
  
  public final void aKZ()
  {
    GMTrace.i(5154766061568L, 38406);
    w.v("MicroMsg.TalkRoomDisplayMgr", "yy dismissStatusBar");
    bsl();
    GMTrace.o(5154766061568L, 38406);
  }
  
  public final void aLa()
  {
    GMTrace.i(5154900279296L, 38407);
    GMTrace.o(5154900279296L, 38407);
  }
  
  public final void aLb()
  {
    GMTrace.i(5155034497024L, 38408);
    GMTrace.o(5155034497024L, 38408);
  }
  
  public final void aLc()
  {
    GMTrace.i(5155168714752L, 38409);
    GMTrace.o(5155168714752L, 38409);
  }
  
  public final void cN(String paramString1, String paramString2)
  {
    GMTrace.i(5154497626112L, 38404);
    if (this.qwX)
    {
      GMTrace.o(5154497626112L, 38404);
      return;
    }
    bsk();
    GMTrace.o(5154497626112L, 38404);
  }
  
  public final void l(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(5154631843840L, 38405);
    GMTrace.o(5154631843840L, 38405);
  }
  
  public final void pJ(int paramInt)
  {
    GMTrace.i(5154229190656L, 38402);
    GMTrace.o(5154229190656L, 38402);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */