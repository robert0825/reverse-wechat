package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.modelsimple.af;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class RegByFacebookSetPwdUI
  extends SetPwdUI
{
  public RegByFacebookSetPwdUI()
  {
    GMTrace.i(2775622615040L, 20680);
    GMTrace.o(2775622615040L, 20680);
  }
  
  protected final void Bt(int paramInt)
  {
    GMTrace.i(2776964792320L, 20690);
    switch (2.vRK[(paramInt - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(2776964792320L, 20690);
      return;
      h.h(this, R.l.dRe, R.l.dRg);
      GMTrace.o(2776964792320L, 20690);
      return;
      h.h(this, R.l.dRf, R.l.dRg);
      GMTrace.o(2776964792320L, 20690);
      return;
      h.h(this, R.l.ega, R.l.cSK);
      GMTrace.o(2776964792320L, 20690);
      return;
      h.h(this, R.l.egc, R.l.cSK);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(15334912294912L, 114254);
    oM(R.l.dRn);
    GMTrace.o(15334912294912L, 114254);
  }
  
  protected final ProgressDialog a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(2776293703680L, 20685);
    paramContext = h.a(paramContext, getString(R.l.dRi), true, paramOnCancelListener);
    GMTrace.o(2776293703680L, 20685);
    return paramContext;
  }
  
  protected final k a(String paramString1, String paramString2, azp paramazp)
  {
    GMTrace.i(2776427921408L, 20686);
    paramString1 = new af(paramString1);
    GMTrace.o(2776427921408L, 20686);
    return paramString1;
  }
  
  protected final String bYC()
  {
    GMTrace.i(2776562139136L, 20687);
    String str = ((EditText)findViewById(R.h.bYc)).getText().toString();
    GMTrace.o(2776562139136L, 20687);
    return str;
  }
  
  protected final String bYD()
  {
    GMTrace.i(2776696356864L, 20688);
    String str = ((EditText)findViewById(R.h.bYb)).getText().toString();
    GMTrace.o(2776696356864L, 20688);
    return str;
  }
  
  protected final int bYE()
  {
    GMTrace.i(2776830574592L, 20689);
    GMTrace.o(2776830574592L, 20689);
    return 382;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2776025268224L, 20683);
    int i = R.i.cEJ;
    GMTrace.o(2776025268224L, 20683);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2775756832768L, 20681);
    super.onCreate(paramBundle);
    this.eEU = getIntent().getStringExtra("setpwd_ticket");
    oM(R.l.dRn);
    GMTrace.o(2775756832768L, 20681);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2775891050496L, 20682);
    super.onDestroy();
    GMTrace.o(2775891050496L, 20682);
  }
  
  protected final boolean u(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(2777099010048L, 20691);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      at.AR();
      c.xh().set(57, Integer.valueOf(0));
      at.AR();
      paramString = (String)c.xh().get(5, null);
      h.a(this, getString(R.l.dRm, new Object[] { paramString }), getString(R.l.dRg), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2654289788928L, 19776);
          RegByFacebookSetPwdUI.this.finish();
          GMTrace.o(2654289788928L, 19776);
        }
      });
      GMTrace.o(2777099010048L, 20691);
      return true;
    }
    boolean bool = q(paramInt1, paramInt2, paramString);
    GMTrace.o(2777099010048L, 20691);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\account\RegByFacebookSetPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */