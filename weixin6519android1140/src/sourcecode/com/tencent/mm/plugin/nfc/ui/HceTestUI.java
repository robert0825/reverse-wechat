package com.tencent.mm.plugin.nfc.ui;

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
import com.tencent.mm.ui.MMActivity;

public class HceTestUI
  extends MMActivity
{
  private Button nxp;
  private Button nxq;
  private Intent nxr;
  
  public HceTestUI()
  {
    GMTrace.i(20509274144768L, 152806);
    GMTrace.o(20509274144768L, 152806);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20509408362496L, 152807);
    int i = R.i.czI;
    GMTrace.o(20509408362496L, 152807);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20509542580224L, 152808);
    super.onCreate(paramBundle);
    this.nxp = ((Button)findViewById(R.h.cfE));
    this.nxq = ((Button)findViewById(R.h.ccq));
    this.nxp.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20510213668864L, 152813);
        HceTestUI.a(HceTestUI.this);
        GMTrace.o(20510213668864L, 152813);
      }
    });
    this.nxq.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20510482104320L, 152815);
        HceTestUI.b(HceTestUI.this);
        GMTrace.o(20510482104320L, 152815);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20509139927040L, 152805);
        HceTestUI.this.finish();
        GMTrace.o(20509139927040L, 152805);
        return false;
      }
    });
    GMTrace.o(20509542580224L, 152808);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20509676797952L, 152809);
    super.onDestroy();
    if (this.nxr != null) {
      stopService(this.nxr);
    }
    GMTrace.o(20509676797952L, 152809);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc\ui\HceTestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */