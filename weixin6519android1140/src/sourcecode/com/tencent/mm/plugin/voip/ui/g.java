package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class g
{
  private static final String esG;
  private static final String esH;
  public static final int nod;
  public static final int noj;
  public static final int nok;
  public Intent intent;
  public h qNB;
  private Point qNC;
  private a qND;
  public aj qNE;
  
  static
  {
    GMTrace.i(5361998233600L, 39950);
    nod = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 8);
    noj = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 96);
    nok = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 76);
    String str = p.ta();
    esG = str;
    esH = o.getString(str.hashCode());
    GMTrace.o(5361998233600L, 39950);
  }
  
  public g()
  {
    GMTrace.i(5360790274048L, 39941);
    GMTrace.o(5360790274048L, 39941);
  }
  
  public final void JQ(String paramString)
  {
    GMTrace.i(5361327144960L, 39945);
    if (this.qNB != null) {
      this.qNB.JQ(paramString);
    }
    GMTrace.o(5361327144960L, 39945);
  }
  
  public final void W(final Intent paramIntent)
  {
    GMTrace.i(5361058709504L, 39943);
    w.i("MicroMsg.VoipVoiceMiniManager", "mini now..");
    if (this.qNB != null) {
      dismiss();
    }
    if (this.qNB == null) {
      this.qNB = new h(ab.getContext());
    }
    if (this.qNE != null) {
      this.qNE.stopTimer();
    }
    this.qNB.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5372601434112L, 40029);
        paramIntent.addFlags(268435456);
        ab.getContext().startActivity(paramIntent);
        paramAnonymousView.setOnClickListener(null);
        g.this.qNE = new aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(15364171759616L, 114472);
            w.i("MicroMsg.VoipVoiceMiniManager", "click small view and time is up we remove it..");
            g.this.dismiss();
            if (g.this.qNE != null) {
              g.this.qNE.stopTimer();
            }
            GMTrace.o(15364171759616L, 114472);
            return true;
          }
        }, false);
        g.this.qNE.z(2000L, 2000L);
        GMTrace.o(5372601434112L, 40029);
      }
    });
    WindowManager localWindowManager = (WindowManager)ab.getContext().getSystemService("window");
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    localLayoutParams.type = 2002;
    localLayoutParams.format = 1;
    localLayoutParams.flags = 40;
    localLayoutParams.gravity = 51;
    localLayoutParams.width = nok;
    localLayoutParams.height = noj;
    if (this.qNC == null)
    {
      at.AR();
      int i = c.xh().getInt(327947, 0);
      int j = nod;
      localLayoutParams.x = (com.tencent.mm.br.a.ef(ab.getContext()) - localLayoutParams.width - j);
      localLayoutParams.y = (i + j);
    }
    try
    {
      for (;;)
      {
        localWindowManager.addView(this.qNB, localLayoutParams);
        this.qND.a(paramIntent, this.qNB);
        GMTrace.o(5361058709504L, 39943);
        return;
        localLayoutParams.x = this.qNC.x;
        localLayoutParams.y = this.qNC.y;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.VoipVoiceMiniManager", "add failed", new Object[] { localException });
      }
    }
  }
  
  public final void a(final Intent paramIntent, final a parama)
  {
    GMTrace.i(14283719049216L, 106422);
    if (parama == null)
    {
      w.e("MicroMsg.VoipVoiceMiniManager", "showMini, VoipMiniCallBack cannot be null!");
      GMTrace.o(14283719049216L, 106422);
      return;
    }
    this.intent = paramIntent;
    this.qND = parama;
    if (!b.aH(ab.getContext()))
    {
      w.e("MicroMsg.VoipVoiceMiniManager", "mini, permission denied");
      VoipWarningDialog.a(ab.getContext(), new VoipWarningDialog.a()
      {
        public final void a(VoipWarningDialog paramAnonymousVoipWarningDialog)
        {
          GMTrace.i(5357703266304L, 39918);
          paramAnonymousVoipWarningDialog.finish();
          if (parama.aHS()) {
            g.this.W(paramIntent);
          }
          GMTrace.o(5357703266304L, 39918);
        }
        
        public final void b(VoipWarningDialog paramAnonymousVoipWarningDialog)
        {
          GMTrace.i(5357837484032L, 39919);
          paramAnonymousVoipWarningDialog.finish();
          GMTrace.o(5357837484032L, 39919);
        }
      });
      GMTrace.o(14283719049216L, 106422);
      return;
    }
    W(paramIntent);
    GMTrace.o(14283719049216L, 106422);
  }
  
  public final void dismiss()
  {
    GMTrace.i(5361461362688L, 39946);
    w.i("MicroMsg.VoipVoiceMiniManager", "dismiss now..");
    WindowManager localWindowManager = (WindowManager)ab.getContext().getSystemService("window");
    try
    {
      if (this.qNB != null)
      {
        WindowManager.LayoutParams localLayoutParams = (WindowManager.LayoutParams)this.qNB.getLayoutParams();
        this.qNC = new Point(localLayoutParams.x, localLayoutParams.y);
        localWindowManager.removeView(this.qNB);
        this.qNB.setOnClickListener(null);
        this.qNB = null;
      }
      GMTrace.o(5361461362688L, 39946);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.VoipVoiceMiniManager", "remove failed", new Object[] { localException });
      GMTrace.o(5361461362688L, 39946);
    }
  }
  
  public final void uM(int paramInt)
  {
    GMTrace.i(5361192927232L, 39944);
    if (this.qNB != null)
    {
      String str = String.format("%02d:%02d", new Object[] { Integer.valueOf(paramInt / 60), Integer.valueOf(paramInt % 60) });
      this.qNB.JR(str);
    }
    GMTrace.o(5361192927232L, 39944);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */