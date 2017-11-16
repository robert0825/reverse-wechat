package com.tencent.mm.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.a;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class RegByMobileSetPwdUI
  extends SetPwdUI
{
  private TextView oIP;
  private TextView qud;
  private String tCQ;
  private View vSO;
  private TextView vSP;
  private boolean vSQ;
  
  public RegByMobileSetPwdUI()
  {
    GMTrace.i(2725425184768L, 20306);
    this.tCQ = null;
    this.vSQ = false;
    GMTrace.o(2725425184768L, 20306);
  }
  
  protected final void Bt(int paramInt)
  {
    GMTrace.i(2726364708864L, 20313);
    switch (1.vRK[(paramInt - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(2726364708864L, 20313);
      return;
      com.tencent.mm.ui.base.h.h(this, R.l.dRB, R.l.dRD);
      GMTrace.o(2726364708864L, 20313);
      return;
      com.tencent.mm.ui.base.h.h(this, R.l.dRC, R.l.dRD);
      GMTrace.o(2726364708864L, 20313);
      return;
      com.tencent.mm.ui.base.h.h(this, R.l.ega, R.l.dRD);
      GMTrace.o(2726364708864L, 20313);
      return;
      com.tencent.mm.ui.base.h.h(this, R.l.egc, R.l.dRD);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(2725962055680L, 20310);
    if (!this.oND) {
      bXw();
    }
    oM(R.l.dRG);
    this.oIP = ((TextView)findViewById(R.h.cjN));
    this.vSO = findViewById(R.h.bcC);
    this.qud = ((TextView)findViewById(R.h.bYe));
    this.vSP = ((TextView)findViewById(R.h.bcG));
    if ((this.tCQ != null) && (this.tCQ.length() > 0)) {
      this.qud.setText(this.tCQ);
    }
    Object localObject3;
    Object localObject4;
    if ((this.vSQ) || (!com.tencent.mm.kernel.h.xw().wL()))
    {
      this.vSO.setVisibility(8);
      localObject1 = (TextView)findViewById(R.h.bSW);
      localObject2 = (TextView)findViewById(R.h.bqd);
      localObject3 = (EditText)findViewById(R.h.bYi);
      localObject4 = (EditText)findViewById(R.h.bYh);
      if (!v.bPG())
      {
        ((TextView)localObject1).setTextSize(1, 14.0F);
        ((TextView)localObject2).setTextSize(1, 14.0F);
        ((EditText)localObject3).setTextSize(1, 14.0F);
        ((EditText)localObject4).setTextSize(1, 14.0F);
      }
      float f1 = this.vSP.getPaint().measureText(this.vSP.getText().toString());
      float f2 = ((TextView)localObject1).getPaint().measureText(((TextView)localObject1).getText().toString());
      float f3 = ((TextView)localObject2).getPaint().measureText(((TextView)localObject2).getText().toString());
      f1 = Math.max(Math.max(f1, f2), f3);
      this.vSP.setWidth((int)f1);
      ((TextView)localObject1).setWidth((int)f1);
      ((TextView)localObject1).setWidth((int)f1);
      GMTrace.o(2725962055680L, 20310);
      return;
    }
    this.vSO.setVisibility(0);
    Object localObject2 = q.zF();
    Object localObject1 = localObject2;
    if (bg.nm((String)localObject2))
    {
      localObject2 = q.zE();
      localObject1 = localObject2;
      if (x.Ts((String)localObject2)) {
        localObject1 = null;
      }
    }
    if (bg.nm((String)localObject1))
    {
      at.AR();
      localObject1 = (String)c.xh().get(6, null);
      at.AR();
      localObject2 = (String)c.xh().get(5, null);
      if (!bg.nm((String)localObject1)) {
        if (bg.SH((String)localObject1).booleanValue())
        {
          new an();
          if (!((String)localObject1).startsWith("+")) {
            break label610;
          }
          localObject4 = ((String)localObject1).replace("+", "");
          localObject3 = an.AL((String)localObject4);
          localObject2 = localObject3;
          localObject1 = localObject4;
          if (localObject3 != null) {
            localObject1 = ((String)localObject4).substring(((String)localObject3).length());
          }
        }
      }
    }
    label610:
    for (localObject2 = localObject3;; localObject2 = "86")
    {
      localObject1 = an.formatNumber((String)localObject2, (String)localObject1);
      this.vSP.setText(R.l.dZn);
      this.oIP.setText((CharSequence)localObject1);
      this.qud.setText(R.l.dRI);
      break;
      if (!bg.nm((String)localObject2))
      {
        this.oIP.setText((CharSequence)localObject2);
        this.vSP.setText(R.l.dYL);
        this.qud.setText(R.l.dRH);
        break;
      }
      this.vSO.setVisibility(8);
      break;
      this.vSP.setText(R.l.ebi);
      this.oIP.setText((CharSequence)localObject1);
      break;
    }
  }
  
  protected final String bYC()
  {
    GMTrace.i(2726096273408L, 20311);
    String str = ((EditText)findViewById(R.h.bYi)).getText().toString();
    GMTrace.o(2726096273408L, 20311);
    return str;
  }
  
  protected final String bYD()
  {
    GMTrace.i(2726230491136L, 20312);
    String str = ((EditText)findViewById(R.h.bYh)).getText().toString();
    GMTrace.o(2726230491136L, 20312);
    return str;
  }
  
  public final boolean bYK()
  {
    GMTrace.i(2726633144320L, 20315);
    GMTrace.o(2726633144320L, 20315);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2725827837952L, 20309);
    int i = R.i.cEN;
    GMTrace.o(2725827837952L, 20309);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2725559402496L, 20307);
    super.onCreate(paramBundle);
    this.tCQ = getIntent().getStringExtra("kintent_hint");
    this.oND = getIntent().getBooleanExtra("kintent_cancelable", true);
    this.vSQ = getIntent().getBooleanExtra("from_unbind", false);
    MP();
    GMTrace.o(2725559402496L, 20307);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2725693620224L, 20308);
    super.onDestroy();
    GMTrace.o(2725693620224L, 20308);
  }
  
  protected final boolean u(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(2726498926592L, 20314);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      finish();
      GMTrace.o(2726498926592L, 20314);
      return true;
    }
    boolean bool = q(paramInt1, paramInt2, paramString);
    GMTrace.o(2726498926592L, 20314);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\RegByMobileSetPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */