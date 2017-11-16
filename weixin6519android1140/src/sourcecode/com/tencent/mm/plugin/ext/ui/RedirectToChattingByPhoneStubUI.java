package com.tencent.mm.plugin.ext.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;

public class RedirectToChattingByPhoneStubUI
  extends Activity
  implements e
{
  private r kOh;
  
  public RedirectToChattingByPhoneStubUI()
  {
    GMTrace.i(5737136783360L, 42745);
    this.kOh = null;
    GMTrace.o(5737136783360L, 42745);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5737539436544L, 42748);
    finish();
    GMTrace.o(5737539436544L, 42748);
  }
  
  public final boolean avJ()
  {
    GMTrace.i(5737673654272L, 42749);
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null)
    {
      GMTrace.o(5737673654272L, 42749);
      return false;
    }
    Object localObject = getCurrentFocus();
    if (localObject == null)
    {
      GMTrace.o(5737673654272L, 42749);
      return false;
    }
    localObject = ((View)localObject).getWindowToken();
    if (localObject == null)
    {
      GMTrace.o(5737673654272L, 42749);
      return false;
    }
    try
    {
      bool = localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
      w.v("MicroMsg.RedirectToChattingByPhoneStubUI", "hide VKB result %B", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(5737673654272L, 42749);
      return bool;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        w.e("MicroMsg.RedirectToChattingByPhoneStubUI", "hide VKB exception %s", new Object[] { localIllegalArgumentException });
        boolean bool = false;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5737271001088L, 42746);
    super.onCreate(paramBundle);
    getString(R.l.cUV);
    this.kOh = h.a(this, "", false, null);
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5737942089728L, 42751);
        RedirectToChattingByPhoneStubUI.this.avJ();
        GMTrace.o(5737942089728L, 42751);
      }
    }, 500L);
    at.wS().a(106, this);
    GMTrace.o(5737271001088L, 42746);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5737405218816L, 42747);
    super.onDestroy();
    at.wS().b(106, this);
    if (this.kOh != null)
    {
      this.kOh.dismiss();
      this.kOh = null;
    }
    GMTrace.o(5737405218816L, 42747);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\ui\RedirectToChattingByPhoneStubUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */