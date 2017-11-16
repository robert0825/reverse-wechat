package com.tencent.mm.ui.bindqq;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMWizardActivity;

public class SuccUnbindQQ
  extends MMWizardActivity
{
  public SuccUnbindQQ()
  {
    GMTrace.i(1891933093888L, 14096);
    GMTrace.o(1891933093888L, 14096);
  }
  
  protected final void MP()
  {
    GMTrace.i(1892604182528L, 14101);
    oM(R.l.eeU);
    a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1889919827968L, 14081);
        SuccUnbindQQ.a(SuccUnbindQQ.this);
        GMTrace.o(1889919827968L, 14081);
        return true;
      }
    });
    GMTrace.o(1892604182528L, 14101);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1892469964800L, 14100);
    int i = R.i.cGS;
    GMTrace.o(1892469964800L, 14100);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1892067311616L, 14097);
    super.onCreate(paramBundle);
    GMTrace.o(1892067311616L, 14097);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1892201529344L, 14098);
    super.onDestroy();
    GMTrace.o(1892201529344L, 14098);
  }
  
  protected void onResume()
  {
    GMTrace.i(1892335747072L, 14099);
    super.onResume();
    MP();
    GMTrace.o(1892335747072L, 14099);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\bindqq\SuccUnbindQQ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */