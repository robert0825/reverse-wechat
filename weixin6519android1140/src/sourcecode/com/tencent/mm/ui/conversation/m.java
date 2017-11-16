package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.gf;
import com.tencent.mm.g.a.ja;
import com.tencent.mm.g.a.kp;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.mq;
import com.tencent.mm.g.a.ni;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.plugin.report.service.f;
import com.tencent.mm.pluginsdk.p.l;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;

public final class m
  implements p.l
{
  public Activity eNu;
  c kid;
  public MessageQueue.IdleHandler vIH;
  Runnable wQh;
  public ListView wVF;
  public g wWm;
  c wYZ;
  c wZa;
  
  public m()
  {
    GMTrace.i(14491890745344L, 107973);
    this.kid = null;
    this.wYZ = null;
    this.wZa = null;
    this.wQh = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14491219656704L, 107968);
        m localm = m.this;
        LauncherUI localLauncherUI = (LauncherUI)localm.eNu;
        if ((localLauncherUI == null) || (localLauncherUI.vJi.vIy.kZJ == 0))
        {
          BackwardSupportUtil.c.a(localm.wVF);
          new ae().postDelayed(new m.3(localm), 300L);
        }
        GMTrace.o(14491219656704L, 107968);
      }
    };
    GMTrace.o(14491890745344L, 107973);
  }
  
  public final void E(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(14492024963072L, 107974);
    if (this.wWm != null) {
      this.wWm.notifyDataSetChanged();
    }
    GMTrace.o(14492024963072L, 107974);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */