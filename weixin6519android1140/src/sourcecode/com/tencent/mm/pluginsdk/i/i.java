package com.tencent.mm.pluginsdk.i;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends b
{
  public i(Activity paramActivity)
  {
    super(paramActivity);
    GMTrace.i(702495588352L, 5234);
    GMTrace.o(702495588352L, 5234);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(702629806080L, 5235);
    w.i("MicroMsg.ErrorMsgBoxProcessor", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    GMTrace.o(702629806080L, 5235);
  }
  
  public final boolean b(o paramo)
  {
    GMTrace.i(702764023808L, 5236);
    w.d("MicroMsg.ErrorMsgBoxProcessor", "handleOpenUrl");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(702764023808L, 5236);
    return true;
  }
  
  public final boolean c(o paramo)
  {
    GMTrace.i(702898241536L, 5237);
    w.d("MicroMsg.ErrorMsgBoxProcessor", "handleIgnore");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(702898241536L, 5237);
    return true;
  }
  
  public final boolean d(o paramo)
  {
    GMTrace.i(703032459264L, 5238);
    w.d("MicroMsg.ErrorMsgBoxProcessor", "handleFalseLast");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(703032459264L, 5238);
    return true;
  }
  
  public final boolean e(o paramo)
  {
    GMTrace.i(703166676992L, 5239);
    w.d("MicroMsg.ErrorMsgBoxProcessor", "handleFalseCancel");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(703166676992L, 5239);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\i\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */