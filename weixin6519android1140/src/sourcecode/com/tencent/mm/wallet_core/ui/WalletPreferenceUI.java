package com.tencent.mm.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.c;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

@a(3)
public abstract class WalletPreferenceUI
  extends MMPreference
  implements c
{
  public b xEK;
  public f xEL;
  public d xEM;
  
  public WalletPreferenceUI()
  {
    GMTrace.i(1480153104384L, 11028);
    this.xEL = null;
    this.xEM = null;
    this.xEK = null;
    GMTrace.o(1480153104384L, 11028);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, k paramk, boolean paramBoolean)
  {
    GMTrace.i(1480555757568L, 11031);
    if ((!f(paramInt1, paramInt2, paramString, paramk)) && (paramInt2 != 0))
    {
      paramk = paramString;
      if (bg.nm(paramString)) {
        paramk = getString(a.i.tbj);
      }
      h.a(this, paramk, null, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1515855020032L, 11294);
          WalletPreferenceUI.this.finish();
          GMTrace.o(1515855020032L, 11294);
        }
      });
    }
    GMTrace.o(1480555757568L, 11031);
  }
  
  public final f cmu()
  {
    GMTrace.i(1480421539840L, 11030);
    if (this.xEL == null) {
      this.xEL = new f(this, this);
    }
    f localf = this.xEL;
    GMTrace.o(1480421539840L, 11030);
    return localf;
  }
  
  public abstract boolean f(int paramInt1, int paramInt2, String paramString, k paramk);
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1480287322112L, 11029);
    super.onCreate(paramBundle);
    this.xEL = new f(this, this);
    this.xEL.hN(385);
    this.xEL.hN(1518);
    if (getLayoutId() > 0) {
      e.cms();
    }
    GMTrace.o(1480287322112L, 11029);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1480689975296L, 11032);
    this.xEL.hO(385);
    this.xEL.hO(1518);
    this.xEL = null;
    super.onDestroy();
    GMTrace.o(1480689975296L, 11032);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\ui\WalletPreferenceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */