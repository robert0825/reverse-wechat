package com.tencent.mm.plugin.webwx.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bj.d;
import com.tencent.mm.ui.MMActivity;

public class WebWeiXinIntroductionUI
  extends MMActivity
{
  private Button sag;
  
  public WebWeiXinIntroductionUI()
  {
    GMTrace.i(7662490091520L, 57090);
    GMTrace.o(7662490091520L, 57090);
  }
  
  protected final void MP()
  {
    GMTrace.i(7662892744704L, 57093);
    sq("");
    this.sag = ((Button)findViewById(R.h.cnT));
    this.sag.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7662355873792L, 57089);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("BaseScanUI_select_scan_mode", 1);
        paramAnonymousView.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
        paramAnonymousView.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
        paramAnonymousView.putExtra("from_album", false);
        paramAnonymousView.putExtra("show_intro", false);
        paramAnonymousView.setFlags(65536);
        d.b(WebWeiXinIntroductionUI.this, "scanner", ".ui.BaseScanUI", paramAnonymousView);
        GMTrace.o(7662355873792L, 57089);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7672556421120L, 57165);
        WebWeiXinIntroductionUI.this.finish();
        GMTrace.o(7672556421120L, 57165);
        return true;
      }
    });
    GMTrace.o(7662892744704L, 57093);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7662624309248L, 57091);
    int i = R.i.cHS;
    GMTrace.o(7662624309248L, 57091);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7662758526976L, 57092);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(7662758526976L, 57092);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webwx\ui\WebWeiXinIntroductionUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */