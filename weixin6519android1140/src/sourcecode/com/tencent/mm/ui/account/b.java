package com.tencent.mm.ui.account;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;

public abstract class b
  extends SecurityImage.b
{
  public SecurityImage vMf;
  public k vPe;
  
  public b()
  {
    GMTrace.i(2689320615936L, 20037);
    this.vMf = null;
    this.vPe = null;
    GMTrace.o(2689320615936L, 20037);
  }
  
  public abstract k a(k paramk, String paramString);
  
  public final void bYp()
  {
    GMTrace.i(2689589051392L, 20039);
    at.wS().a(a(this.vPe, ""), 0);
    GMTrace.o(2689589051392L, 20039);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */