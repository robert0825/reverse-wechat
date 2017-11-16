package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.storage.ba;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;

public class SendFeedBackUI
  extends MMActivity
  implements e
{
  private ProgressDialog htG;
  private EditText nUE;
  private TextView oHk;
  
  public SendFeedBackUI()
  {
    GMTrace.i(4691446464512L, 34954);
    this.htG = null;
    this.oHk = null;
    GMTrace.o(4691446464512L, 34954);
  }
  
  protected final void MP()
  {
    GMTrace.i(4691983335424L, 34958);
    oM(R.l.dYV);
    this.nUE = ((EditText)findViewById(R.h.content));
    String str = getIntent().getStringExtra("intentKeyFrom");
    if ((str != null) && (str.equals("fromEnjoyAppDialog")))
    {
      this.oHk = ((TextView)findViewById(R.h.ckV));
      this.oHk.setVisibility(0);
      this.oHk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4688091021312L, 34929);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("showShare", false);
          paramAnonymousView.putExtra("rawUrl", SendFeedBackUI.this.getString(R.l.ekG));
          d.b(SendFeedBackUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          GMTrace.o(4688091021312L, 34929);
        }
      });
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4657757814784L, 34703);
        SendFeedBackUI.this.aLo();
        SendFeedBackUI.this.finish();
        GMTrace.o(4657757814784L, 34703);
        return true;
      }
    });
    a(0, getString(R.l.cUs), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4595346571264L, 34238);
        paramAnonymousMenuItem = SendFeedBackUI.a(SendFeedBackUI.this).getText().toString().trim();
        if (paramAnonymousMenuItem.length() > 0)
        {
          if (paramAnonymousMenuItem.startsWith("//traceroute"))
          {
            SendFeedBackUI.a(SendFeedBackUI.this).setText("");
            d.x(SendFeedBackUI.this.vKB.vKW, "traceroute", ".ui.NetworkDiagnoseIntroUI");
            GMTrace.o(4595346571264L, 34238);
            return false;
          }
          paramAnonymousMenuItem = new com.tencent.mm.pluginsdk.model.m(com.tencent.mm.compatible.d.p.to(), paramAnonymousMenuItem + " key " + ba.bUs() + " local key " + ba.bUr() + "NetType:" + am.getNetTypeString(SendFeedBackUI.this.getApplicationContext()) + " hasNeon: " + com.tencent.mm.compatible.d.m.sQ() + " isArmv6: " + com.tencent.mm.compatible.d.m.sS() + " isArmv7: " + com.tencent.mm.compatible.d.m.sR());
          at.wS().a(153, SendFeedBackUI.this);
          at.wS().a(paramAnonymousMenuItem, 0);
          SendFeedBackUI.this.aLo();
          SendFeedBackUI localSendFeedBackUI1 = SendFeedBackUI.this;
          SendFeedBackUI localSendFeedBackUI2 = SendFeedBackUI.this;
          SendFeedBackUI.this.getString(R.l.cUG);
          SendFeedBackUI.a(localSendFeedBackUI1, h.a(localSendFeedBackUI2, SendFeedBackUI.this.getString(R.l.cUt), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(4654670807040L, 34680);
              at.wS().c(paramAnonymousMenuItem);
              GMTrace.o(4654670807040L, 34680);
            }
          }));
        }
        GMTrace.o(4595346571264L, 34238);
        return false;
      }
    });
    GMTrace.o(4691983335424L, 34958);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4692117553152L, 34959);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      h.a(this, getString(R.l.dYU), getString(R.l.cUG), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4720169058304L, 35168);
          SendFeedBackUI.this.finish();
          GMTrace.o(4720169058304L, 35168);
        }
      });
      GMTrace.o(4692117553152L, 34959);
      return;
    }
    h.a(this, getString(R.l.dYT), getString(R.l.cUG), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(4713860825088L, 35121);
        GMTrace.o(4713860825088L, 35121);
      }
    });
    GMTrace.o(4692117553152L, 34959);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4691580682240L, 34955);
    int i = R.i.cux;
    GMTrace.o(4691580682240L, 34955);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4691714899968L, 34956);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4691714899968L, 34956);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4691849117696L, 34957);
    at.wS().b(153, this);
    super.onDestroy();
    GMTrace.o(4691849117696L, 34957);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SendFeedBackUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */