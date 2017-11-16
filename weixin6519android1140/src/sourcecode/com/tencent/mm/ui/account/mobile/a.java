package com.tencent.mm.ui.account.mobile;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.d;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;

public final class a
{
  private String eVw;
  private String gUy;
  private String username;
  boolean vRq;
  private String vVt;
  private a vVu;
  
  public a(a parama, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(2591475892224L, 19308);
    this.gUy = "";
    this.username = "";
    this.vVt = "";
    this.vRq = false;
    this.username = paramString1;
    this.gUy = paramString3;
    this.vVt = paramString2;
    this.vVu = parama;
    GMTrace.o(2591475892224L, 19308);
  }
  
  public final void a(final MMActivity paramMMActivity, int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2591744327680L, 19310);
    if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17))) {
      at.wS().a(new bf(new bf.a()
      {
        public final void a(e paramAnonymouse)
        {
          GMTrace.i(2629862162432L, 19594);
          if (paramAnonymouse == null)
          {
            GMTrace.o(2629862162432L, 19594);
            return;
          }
          paramAnonymouse = paramAnonymouse.DY();
          at.AR();
          int i = com.tencent.mm.y.c.ww();
          paramAnonymouse.i(new byte[0], i);
          GMTrace.o(2629862162432L, 19594);
        }
      }), 0);
    }
    for (int i = 1;; i = 0)
    {
      if ((paramk instanceof u)) {
        this.eVw = ((u)paramk).Lu();
      }
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        at.unhold();
        d.bk(paramMMActivity);
        com.tencent.mm.platformtools.m.nh(this.gUy);
        com.tencent.mm.platformtools.m.a(paramMMActivity, new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2581141127168L, 19231);
            Intent localIntent = com.tencent.mm.plugin.c.a.hnH.ao(paramMMActivity);
            localIntent.addFlags(67108864);
            paramMMActivity.startActivity(localIntent);
            paramMMActivity.finish();
            GMTrace.o(2581141127168L, 19231);
          }
        }, false, 2);
        if (this.vRq)
        {
          paramMMActivity = ab.getContext().getSharedPreferences("randomid_prefs", 4).getString("randomID", "");
          g.ork.i(11930, new Object[] { paramMMActivity, Integer.valueOf(4) });
        }
        GMTrace.o(2591744327680L, 19310);
        return;
      }
      if (paramInt2 == -106)
      {
        com.tencent.mm.platformtools.m.b(paramMMActivity, paramString, 0);
        GMTrace.o(2591744327680L, 19310);
        return;
      }
      if (paramInt2 == 65319)
      {
        com.tencent.mm.platformtools.m.a(paramMMActivity, com.tencent.mm.pluginsdk.a.a.a((u)paramk), paramInt2);
        GMTrace.o(2591744327680L, 19310);
        return;
      }
      if (com.tencent.mm.plugin.c.a.hnI.a(paramMMActivity, paramInt1, paramInt2, paramString)) {
        i = 1;
      }
      while (i != 0)
      {
        GMTrace.o(2591744327680L, 19310);
        return;
        if (paramInt1 == 4) {}
        switch (paramInt2)
        {
        default: 
          i = 0;
          break;
        case -1: 
          if (at.wS().DN() == 5)
          {
            h.h(paramMMActivity, R.l.dLj, R.l.dLi);
            i = 1;
          }
          break;
        case -4: 
        case -3: 
          h.h(paramMMActivity, R.l.dqu, R.l.dHa);
          i = 1;
          break;
        case -9: 
          h.h(paramMMActivity, R.l.dGZ, R.l.dHa);
          i = 1;
          break;
        case -72: 
          h.h(paramMMActivity, R.l.dRN, R.l.cUG);
          i = 1;
          break;
        case -75: 
          h.h(paramMMActivity, R.l.cRF, R.l.cUG);
          i = 1;
          break;
        case -100: 
          at.hold();
          if (TextUtils.isEmpty(at.wy())) {}
          for (paramString = com.tencent.mm.br.a.X(paramMMActivity, R.l.dHY);; paramString = at.wy())
          {
            h.a(paramMMActivity, paramString, paramMMActivity.getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnCancelListener
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(2612816510976L, 19467);
                GMTrace.o(2612816510976L, 19467);
              }
            }, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(2609192632320L, 19440);
                GMTrace.o(2609192632320L, 19440);
              }
            });
            i = 1;
            break;
          }
        case -140: 
          if (!bg.nm(this.eVw)) {
            com.tencent.mm.platformtools.m.j(paramMMActivity, paramString, this.eVw);
          }
          i = 1;
        }
      }
      Toast.makeText(paramMMActivity, paramMMActivity.getString(R.l.dws, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(2591744327680L, 19310);
      return;
    }
  }
  
  public final void i(MMActivity paramMMActivity)
  {
    GMTrace.i(2591610109952L, 19309);
    final u localu = new u(this.username, this.vVt, 0, "", "", "", 0, "", false, true);
    at.wS().a(localu, 0);
    a locala = this.vVu;
    paramMMActivity.getString(R.l.cUG);
    locala.b(h.a(paramMMActivity, paramMMActivity.getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2621272227840L, 19530);
        at.wS().c(localu);
        GMTrace.o(2621272227840L, 19530);
      }
    }));
    GMTrace.o(2591610109952L, 19309);
  }
  
  public static abstract interface a
  {
    public abstract void b(ProgressDialog paramProgressDialog);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\mobile\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */