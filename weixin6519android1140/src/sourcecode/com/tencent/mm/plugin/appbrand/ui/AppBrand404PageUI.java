package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.widget.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.p;

@a(19)
public final class AppBrand404PageUI
  extends DrawStatusBarActivity
{
  public AppBrand404PageUI()
  {
    GMTrace.i(10503745175552L, 78259);
    GMTrace.o(10503745175552L, 78259);
  }
  
  public static void show(int paramInt)
  {
    GMTrace.i(10504013611008L, 78261);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10492336668672L, 78174);
        Intent localIntent = new Intent(ab.getContext(), AppBrand404PageUI.class).putExtra("key_wording", this.icx).putExtra("key_icon_url", this.iAu).addFlags(268435456);
        ab.getContext().startActivity(localIntent);
        GMTrace.o(10492336668672L, 78174);
      }
    });
    GMTrace.o(10504013611008L, 78261);
  }
  
  public final void finish()
  {
    GMTrace.i(10504416264192L, 78264);
    super.finish();
    GMTrace.o(10504416264192L, 78264);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10504147828736L, 78262);
    int i = o.g.hCF;
    GMTrace.o(10504147828736L, 78262);
    return i;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10504282046464L, 78263);
    super.onCreate(paramBundle);
    j.d(this.vKB.hqF, getStatusBarColor(), false);
    oM(o.i.hEC);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10512335110144L, 78323);
        AppBrand404PageUI.this.finish();
        GMTrace.o(10512335110144L, 78323);
        return true;
      }
    });
    paramBundle = (TextView)findViewById(o.f.hAM);
    String str = getIntent().getStringExtra("key_wording");
    bg.nm(str);
    if (paramBundle != null) {
      paramBundle.setText(str);
    }
    GMTrace.o(10504282046464L, 78263);
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(10504550481920L, 78265);
    super.onDestroy();
    GMTrace.o(10504550481920L, 78265);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\AppBrand404PageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */