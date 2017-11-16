package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;

public class LoginVoiceUI
  extends LoginHistoryUI
{
  public LoginVoiceUI()
  {
    GMTrace.i(2785688944640L, 20755);
    GMTrace.o(2785688944640L, 20755);
  }
  
  protected final void Wg()
  {
    int j = -1;
    GMTrace.i(16830232002560L, 125395);
    super.Wg();
    bYt();
    final u localu = new u(as.gnb.B("login_user_name", ""), this.qBY, "", 0);
    localu.lp(this.qBY);
    int i;
    String str;
    if (this.qBY == null)
    {
      i = -1;
      str = bg.SJ(this.qBY);
      if (this.vQl.vQY != null) {
        break label184;
      }
    }
    for (;;)
    {
      w.d("MicroMsg.LoginVoiceUI", "summerauth mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", new Object[] { Integer.valueOf(i), str, Integer.valueOf(j), bg.SJ(this.vQl.vQY) });
      getString(R.l.cUG);
      this.htG = h.a(this, getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(16834392752128L, 125426);
          at.wS().c(localu);
          LoginVoiceUI.this.bYu();
          GMTrace.o(16834392752128L, 125426);
        }
      });
      at.wS().a(localu, 0);
      GMTrace.o(16830232002560L, 125395);
      return;
      i = this.qBY.length();
      break;
      label184:
      j = this.vQl.vQY.length();
    }
  }
  
  public final boolean bYx()
  {
    GMTrace.i(2785957380096L, 20757);
    GMTrace.o(2785957380096L, 20757);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2785823162368L, 20756);
    super.onCreate(paramBundle);
    if (this.vQy)
    {
      GMTrace.o(2785823162368L, 20756);
      return;
    }
    this.ibA = 1;
    this.sjB.setVisibility(0);
    this.vQi.setVisibility(0);
    paramBundle = (LinearLayout.LayoutParams)this.vQh.getLayoutParams();
    paramBundle.gravity = 1;
    paramBundle.leftMargin = 0;
    this.vQh.setLayoutParams(paramBundle);
    findViewById(R.h.clk).setEnabled(false);
    ((TextView)findViewById(R.h.clo)).setTextColor(getResources().getColorStateList(R.e.aPs));
    ((TextView)findViewById(R.h.clo)).setBackgroundResource(getResources().getColor(R.e.transparent));
    this.vQi.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2718848516096L, 20257);
        g.ork.i(11557, new Object[] { Integer.valueOf(2) });
        paramAnonymousView = as.gnb.B("login_user_name", "");
        Intent localIntent = new Intent();
        localIntent.putExtra("Kusername", paramAnonymousView);
        localIntent.putExtra("kscene_type", 1);
        d.b(LoginVoiceUI.this.vKB.vKW, "voiceprint", ".ui.VoiceLoginUI", localIntent, 1024);
        GMTrace.o(2718848516096L, 20257);
      }
    });
    GMTrace.o(2785823162368L, 20756);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\LoginVoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */