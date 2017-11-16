package com.tencent.mm.plugin.collect.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(7)
public class CollectAdapterUI
  extends WalletBaseUI
{
  public CollectAdapterUI()
  {
    GMTrace.i(17418105651200L, 129775);
    GMTrace.o(17418105651200L, 129775);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(17418374086656L, 129777);
    GMTrace.o(17418374086656L, 129777);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(17418508304384L, 129778);
    GMTrace.o(17418508304384L, 129778);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(17418239868928L, 129776);
    super.onCreate(paramBundle);
    sv(8);
    h.xz();
    int i = ((Integer)h.xy().xh().get(w.a.vut, Integer.valueOf(0))).intValue();
    w.i("MicroMsg.CollectAdapterUI", "walletRegion: %s", new Object[] { Integer.valueOf(i) });
    if (i == 8) {
      d.b(this, "collect", ".ui.CollectHKMainUI", getIntent());
    }
    for (;;)
    {
      finish();
      GMTrace.o(17418239868928L, 129776);
      return;
      d.b(this, "collect", ".ui.CollectMainUI", getIntent());
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\collect\ui\CollectAdapterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */