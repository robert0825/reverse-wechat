package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.i;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.ck;
import com.tencent.mm.k.e;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.b.c;

public final class i
  extends b
{
  public int fje;
  private c vHF;
  public View wZN;
  
  public i(final Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14512560275456L, 108127);
    this.wZN = View.inflate(paramContext, R.i.czS, null);
    if (this.wZN == null)
    {
      GMTrace.o(14512560275456L, 108127);
      return;
    }
    this.fje = t.getInt(com.tencent.mm.k.g.ut().getValue("InviteFriendsControlFlags"), 0);
    this.wZN.setVisibility(8);
    this.wZN.setPadding(0, -com.tencent.mm.br.a.fromDPToPix(paramContext, R.f.aQD), 0, 0);
    if ((this.fje & 0x1) > 0)
    {
      this.wZN.setVisibility(0);
      this.wZN.setPadding(0, 0, 0, 0);
    }
    this.wZN.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(14508265308160L, 108095);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("Invite_friends", 1);
        d.b(paramContext, "subapp", ".ui.pluginapp.InviteFriendsBy3rdUI", paramAnonymousView);
        com.tencent.mm.plugin.report.service.g.ork.i(14034, new Object[] { Integer.valueOf(1) });
        GMTrace.o(14508265308160L, 108095);
      }
    });
    this.vHF = new c() {};
    GMTrace.o(14512560275456L, 108127);
  }
  
  public final boolean abd()
  {
    GMTrace.i(14512828710912L, 108129);
    com.tencent.mm.sdk.b.a.vgX.b(this.vHF);
    if ((this.wZN != null) && (this.wZN.getVisibility() == 0))
    {
      GMTrace.o(14512828710912L, 108129);
      return true;
    }
    GMTrace.o(14512828710912L, 108129);
    return false;
  }
  
  public final void destroy()
  {
    GMTrace.i(14513097146368L, 108131);
    GMTrace.o(14513097146368L, 108131);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14512694493184L, 108128);
    GMTrace.o(14512694493184L, 108128);
    return -1;
  }
  
  public final View getView()
  {
    GMTrace.i(14513231364096L, 108132);
    View localView = this.wZN;
    GMTrace.o(14513231364096L, 108132);
    return localView;
  }
  
  public final void release()
  {
    GMTrace.i(14512962928640L, 108130);
    com.tencent.mm.sdk.b.a.vgX.c(this.vHF);
    GMTrace.o(14512962928640L, 108130);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */