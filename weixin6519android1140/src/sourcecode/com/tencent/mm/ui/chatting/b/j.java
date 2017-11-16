package com.tencent.mm.ui.chatting.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.g;
import com.tencent.mm.pluginsdk.p.m;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.chatting.ed;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import java.util.List;

public final class j
{
  private s wCm;
  public h wtd;
  
  public j(h paramh, s params)
  {
    GMTrace.i(19203335651328L, 143076);
    this.wtd = paramh;
    this.wCm = params;
    GMTrace.o(19203335651328L, 143076);
  }
  
  public final boolean aP(au paramau)
  {
    GMTrace.i(19203469869056L, 143077);
    if (paramau.bTE())
    {
      ed.aK(paramau);
      this.wtd.me(true);
      GMTrace.o(19203469869056L, 143077);
      return true;
    }
    GMTrace.o(19203469869056L, 143077);
    return false;
  }
  
  public final void ceB()
  {
    GMTrace.i(19203604086784L, 143078);
    Intent localIntent = new Intent();
    g.ork.i(12809, new Object[] { Integer.valueOf(1), "" });
    localIntent.putExtra("map_view_type", 0);
    localIntent.putExtra("map_sender_name", this.wtd.cdk());
    localIntent.putExtra("map_talker_name", this.wtd.cci());
    d.b(this.wtd.cdg().vKB.vKW, "location", ".ui.RedirectUI", localIntent);
    GMTrace.o(19203604086784L, 143078);
  }
  
  public final void ceC()
  {
    int i = 1;
    GMTrace.i(19203738304512L, 143079);
    Object localObject2;
    Object localObject1;
    if ((!com.tencent.mm.p.a.aR(this.wtd.cdg().vKB.vKW)) && (!com.tencent.mm.p.a.aP(this.wtd.cdg().vKB.vKW)))
    {
      if (p.a.tmd.CS(this.wtd.ccY().field_username))
      {
        w.i("MicroMsg.ChattingUI.LocationImp", "click share location, but now is in multitalk!");
        com.tencent.mm.ui.base.h.h(this.wtd.cdg().vKB.vKW, R.l.dJR, R.l.cUG);
        GMTrace.o(19203738304512L, 143079);
        return;
      }
      localObject2 = null;
      rb localrb = new rb();
      localObject1 = localObject2;
      if (p.a.tlV != null)
      {
        localrb.eVS.eVU = true;
        com.tencent.mm.sdk.b.a.vgX.m(localrb);
        if (!bg.nm(localrb.eVT.eVW)) {
          localObject1 = this.wtd.cdg().Bg(R.l.dpO);
        }
      }
      else
      {
        if (bg.nm((String)localObject1)) {
          break label374;
        }
        if ((p.a.tmc == null) || (!p.a.tmc.Bj(this.wtd.ccY().field_username))) {
          break label393;
        }
        localObject2 = p.a.tmc.Bh(this.wtd.ccY().field_username);
        if ((localObject2 == null) || (!((List)localObject2).contains(this.wtd.cdk()))) {
          break label393;
        }
      }
    }
    for (;;)
    {
      if (i == 0)
      {
        localObject2 = new i.a(this.wtd.cdg().vKB.vKW);
        ((i.a)localObject2).VA((String)localObject1);
        ((i.a)localObject2).BQ(R.l.dCR).a(new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19209241231360L, 143120);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(19209241231360L, 143120);
          }
        });
        ((i.a)localObject2).aax().show();
        GMTrace.o(19203738304512L, 143079);
        return;
        localObject1 = localObject2;
        if (!p.a.tlV.JD(this.wtd.ccY().field_username)) {
          break;
        }
        localObject1 = this.wtd.cdg().Bg(R.l.dpP);
        break;
      }
      label374:
      this.wCm.Wp("fromPluginLocation");
      GMTrace.o(19203738304512L, 143079);
      return;
      label393:
      i = 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */