package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.ad.b;
import com.tencent.mm.plugin.ad.c;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;

public class WXShortcutEntryActivity
  extends AutoLoginActivity
{
  public WXShortcutEntryActivity()
  {
    GMTrace.i(12833899151360L, 95620);
    GMTrace.o(12833899151360L, 95620);
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    GMTrace.i(12834301804544L, 95623);
    if (paramIntent == null)
    {
      w.e("MicroMsg.WXShortcutEntryActivity", "intent is null");
      finish();
      GMTrace.o(12834301804544L, 95623);
      return;
    }
    parama = c.oRx;
    int i = s.a(paramIntent, "type", 0);
    if (paramIntent != null)
    {
      parama = (b)parama.oRy.get(i);
      if (parama != null) {
        parama.k(this, paramIntent);
      }
    }
    finish();
    GMTrace.o(12834301804544L, 95623);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12834033369088L, 95621);
    super.onCreate(paramBundle);
    GMTrace.o(12834033369088L, 95621);
  }
  
  protected final boolean y(Intent paramIntent)
  {
    GMTrace.i(12834167586816L, 95622);
    GMTrace.o(12834167586816L, 95622);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\base\stub\WXShortcutEntryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */