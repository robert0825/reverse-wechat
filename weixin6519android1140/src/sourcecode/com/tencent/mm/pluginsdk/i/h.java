package com.tencent.mm.pluginsdk.i;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends b
{
  public h(Activity paramActivity)
  {
    super(paramActivity);
    GMTrace.i(697529532416L, 5197);
    GMTrace.o(697529532416L, 5197);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(697663750144L, 5198);
    w.i("MicroMsg.ErrorLabelProcessor", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    GMTrace.o(697663750144L, 5198);
  }
  
  public final boolean b(o paramo)
  {
    GMTrace.i(697797967872L, 5199);
    w.d("MicroMsg.ErrorLabelProcessor", "handleOpenUrl");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(697797967872L, 5199);
    return true;
  }
  
  public final boolean c(o paramo)
  {
    GMTrace.i(697932185600L, 5200);
    w.d("MicroMsg.ErrorLabelProcessor", "handleIgnore");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(697932185600L, 5200);
    return true;
  }
  
  public final boolean d(o paramo)
  {
    GMTrace.i(698066403328L, 5201);
    w.d("MicroMsg.ErrorLabelProcessor", "handleFalseLast");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(698066403328L, 5201);
    return true;
  }
  
  public final boolean e(o paramo)
  {
    GMTrace.i(698200621056L, 5202);
    w.d("MicroMsg.ErrorLabelProcessor", "handleFalseCancel");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(698200621056L, 5202);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\i\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */