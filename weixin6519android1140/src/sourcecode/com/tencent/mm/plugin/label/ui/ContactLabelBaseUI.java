package com.tencent.mm.plugin.label.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;

public class ContactLabelBaseUI
  extends MMActivity
{
  private ProgressDialog kgz;
  
  public ContactLabelBaseUI()
  {
    GMTrace.i(7295136169984L, 54353);
    GMTrace.o(7295136169984L, 54353);
  }
  
  public final void AZ(String paramString)
  {
    GMTrace.i(7295404605440L, 54355);
    getString(R.l.cUG);
    this.kgz = h.a(this, paramString, true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(7293659774976L, 54342);
        at.wS().cancel(636);
        GMTrace.o(7293659774976L, 54342);
      }
    });
    GMTrace.o(7295404605440L, 54355);
  }
  
  public final void aJR()
  {
    GMTrace.i(7295538823168L, 54356);
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    GMTrace.o(7295538823168L, 54356);
  }
  
  protected int getLayoutId()
  {
    GMTrace.i(7295270387712L, 54354);
    GMTrace.o(7295270387712L, 54354);
    return 0;
  }
  
  public final void wr(String paramString)
  {
    GMTrace.i(7295673040896L, 54357);
    h.a(this, paramString, "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(7315537264640L, 54505);
        GMTrace.o(7315537264640L, 54505);
      }
    });
    GMTrace.o(7295673040896L, 54357);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\ui\ContactLabelBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */