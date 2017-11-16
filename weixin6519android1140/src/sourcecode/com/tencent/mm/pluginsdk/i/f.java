package com.tencent.mm.pluginsdk.i;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends b
{
  public f(Activity paramActivity)
  {
    super(paramActivity);
    GMTrace.i(703300894720L, 5240);
    GMTrace.o(703300894720L, 5240);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(703435112448L, 5241);
    w.i("MicroMsg.ErrorClientProcessor", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    GMTrace.o(703435112448L, 5241);
  }
  
  public final boolean b(o paramo)
  {
    GMTrace.i(703569330176L, 5242);
    w.d("MicroMsg.ErrorClientProcessor", "handleOpenUrl");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(703569330176L, 5242);
    return true;
  }
  
  public final boolean c(o paramo)
  {
    GMTrace.i(703703547904L, 5243);
    w.d("MicroMsg.ErrorClientProcessor", "handleIgnore");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(703703547904L, 5243);
    return true;
  }
  
  public final boolean d(o paramo)
  {
    GMTrace.i(703837765632L, 5244);
    w.d("MicroMsg.ErrorClientProcessor", "handleFalseLast");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(703837765632L, 5244);
    return true;
  }
  
  public final boolean e(o paramo)
  {
    GMTrace.i(703971983360L, 5245);
    w.d("MicroMsg.ErrorClientProcessor", "handleFalseCancel");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(703971983360L, 5245);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\i\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */