package com.tencent.mm.plugin.ext.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;

public class RedirectToQrCodeStubUI
  extends Activity
{
  public RedirectToQrCodeStubUI()
  {
    GMTrace.i(20562827018240L, 153205);
    GMTrace.o(20562827018240L, 153205);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20562961235968L, 153206);
    super.onCreate(paramBundle);
    w.i("MicroMsg.RedirectToQrCodeStubUI", "hy: start to handle qrcode string");
    paramBundle = getIntent().getStringExtra("K_STR");
    int i = getIntent().getIntExtra("K_TYPE", -1);
    int j = getIntent().getIntExtra("K_VERSION", -1);
    bz localbz = new bz();
    localbz.eDf.activity = this;
    localbz.eDf.eBB = paramBundle;
    localbz.eDf.eDg = i;
    localbz.eDf.eDh = j;
    localbz.eDf.scene = 47;
    a.vgX.m(localbz);
    finish();
    GMTrace.o(20562961235968L, 153206);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\ui\RedirectToQrCodeStubUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */