package com.tencent.mm.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;

public class d
  implements View.OnClickListener
{
  private long iyP;
  private View.OnClickListener oiK;
  
  public d()
  {
    GMTrace.i(1478139838464L, 11013);
    this.iyP = 0L;
    GMTrace.o(1478139838464L, 11013);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(1478274056192L, 11014);
    long l = System.currentTimeMillis();
    if (l - this.iyP >= 500L)
    {
      this.oiK.onClick(paramView);
      this.iyP = l;
    }
    GMTrace.o(1478274056192L, 11014);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\wallet_core\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */