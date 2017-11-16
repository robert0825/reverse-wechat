package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
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

public class LoginFaceUI
  extends LoginHistoryUI
{
  public LoginFaceUI()
  {
    GMTrace.i(2717372121088L, 20246);
    GMTrace.o(2717372121088L, 20246);
  }
  
  protected final void Wg()
  {
    int j = -1;
    GMTrace.i(16836674453504L, 125443);
    super.Wg();
    bYt();
    final u localu = new u(as.gnb.B("login_user_name", ""), this.qBY, "", 0);
    int i;
    String str;
    if (this.qBY == null)
    {
      i = -1;
      str = bg.SJ(this.qBY);
      if (this.vQl.vQY != null) {
        break label176;
      }
    }
    for (;;)
    {
      w.d("MicroMsg.LoginFaceUI", "summerauth mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", new Object[] { Integer.valueOf(i), str, Integer.valueOf(j), bg.SJ(this.vQl.vQY) });
      getString(R.l.cUG);
      this.htG = h.a(this, getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(16841640509440L, 125480);
          at.wS().c(localu);
          LoginFaceUI.this.bYu();
          GMTrace.o(16841640509440L, 125480);
        }
      });
      at.wS().a(localu, 0);
      GMTrace.o(16836674453504L, 125443);
      return;
      i = this.qBY.length();
      break;
      label176:
      j = this.vQl.vQY.length();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2717506338816L, 20247);
    super.onCreate(paramBundle);
    if (this.vQy)
    {
      GMTrace.o(2717506338816L, 20247);
      return;
    }
    this.ibA = 4;
    this.vQv.setVisibility(0);
    this.vQj.setVisibility(0);
    findViewById(R.h.byd).setEnabled(false);
    ((TextView)findViewById(R.h.bye)).setTextColor(getResources().getColorStateList(R.e.aPs));
    ((TextView)findViewById(R.h.bye)).setBackgroundResource(getResources().getColor(R.e.transparent));
    this.vQj.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2741799747584L, 20428);
        g.ork.i(11557, new Object[] { Integer.valueOf(2) });
        paramAnonymousView = as.gnb.B("login_user_name", "");
        Intent localIntent = new Intent();
        localIntent.putExtra("k_user_name", paramAnonymousView);
        localIntent.putExtra("k_purpose", 2);
        localIntent.putExtra("k_need_signature", true);
        d.b(LoginFaceUI.this.vKB.vKW, "facedetect", ".ui.FaceDetectUI", localIntent, 1025);
        GMTrace.o(2741799747584L, 20428);
      }
    });
    GMTrace.o(2717506338816L, 20247);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\LoginFaceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */