package com.tencent.mm.plugin.traceroute.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.traceroute.a.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class NetworkDiagnoseIntroUI
  extends MMActivity
{
  private Button qAI;
  private TextView qAJ;
  
  public NetworkDiagnoseIntroUI()
  {
    GMTrace.i(9997073252352L, 74484);
    GMTrace.o(9997073252352L, 74484);
  }
  
  protected final void MP()
  {
    GMTrace.i(9997341687808L, 74486);
    this.qAI = ((Button)findViewById(R.h.cfD));
    this.qAI.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9999086518272L, 74499);
        at.AR();
        if (!c.isSDCardAvailable())
        {
          u.fo(NetworkDiagnoseIntroUI.this);
          GMTrace.o(9999086518272L, 74499);
          return;
        }
        if (at.wS().DN() == 0)
        {
          Toast.makeText(NetworkDiagnoseIntroUI.this, NetworkDiagnoseIntroUI.this.getString(R.l.dwI), 0).show();
          GMTrace.o(9999086518272L, 74499);
          return;
        }
        paramAnonymousView = new Intent(NetworkDiagnoseIntroUI.this, NetworkDiagnoseUI.class);
        NetworkDiagnoseIntroUI.this.startActivity(paramAnonymousView);
        NetworkDiagnoseIntroUI.this.finish();
        GMTrace.o(9999086518272L, 74499);
      }
    });
    this.qAJ = ((TextView)findViewById(R.h.bPW));
    this.qAJ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9996133728256L, 74477);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("title", NetworkDiagnoseIntroUI.this.getString(R.l.dOC));
        paramAnonymousView.putExtra("rawUrl", NetworkDiagnoseIntroUI.this.getString(R.l.efA));
        paramAnonymousView.putExtra("showShare", false);
        a.hnH.j(paramAnonymousView, NetworkDiagnoseIntroUI.this.vKB.vKW);
        GMTrace.o(9996133728256L, 74477);
      }
    });
    sq("");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9998012776448L, 74491);
        NetworkDiagnoseIntroUI.this.finish();
        GMTrace.o(9998012776448L, 74491);
        return true;
      }
    });
    GMTrace.o(9997341687808L, 74486);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9997475905536L, 74487);
    int i = R.i.cCZ;
    GMTrace.o(9997475905536L, 74487);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9997207470080L, 74485);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(9997207470080L, 74485);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\traceroute\ui\NetworkDiagnoseIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */