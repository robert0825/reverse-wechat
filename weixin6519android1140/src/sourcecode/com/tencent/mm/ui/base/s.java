package com.tencent.mm.ui.base;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class s
  extends ProgressDialog
{
  public s(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    GMTrace.i(3180154847232L, 23694);
    GMTrace.o(3180154847232L, 23694);
  }
  
  public void dismiss()
  {
    GMTrace.i(3180289064960L, 23695);
    try
    {
      super.dismiss();
      GMTrace.o(3180289064960L, 23695);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MMSafeProgressDialog", "dismiss exception, e = " + localException.getMessage());
      GMTrace.o(3180289064960L, 23695);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */