package com.tencent.mm.pluginsdk.i;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends b
{
  public g(Activity paramActivity)
  {
    super(paramActivity);
    GMTrace.i(699811233792L, 5214);
    GMTrace.o(699811233792L, 5214);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(699945451520L, 5215);
    w.i("MicroMsg.ErrorConfirmProcessor", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    GMTrace.o(699945451520L, 5215);
  }
  
  public final boolean b(o paramo)
  {
    GMTrace.i(700079669248L, 5216);
    w.d("MicroMsg.ErrorConfirmProcessor", "handleOpenUrl");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(700079669248L, 5216);
    return true;
  }
  
  public final boolean c(o paramo)
  {
    GMTrace.i(700213886976L, 5217);
    w.d("MicroMsg.ErrorConfirmProcessor", "handleIgnore");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(700213886976L, 5217);
    return true;
  }
  
  public final boolean d(o paramo)
  {
    GMTrace.i(700348104704L, 5218);
    w.d("MicroMsg.ErrorConfirmProcessor", "handleFalseLast");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(700348104704L, 5218);
    return true;
  }
  
  public final boolean e(o paramo)
  {
    GMTrace.i(700482322432L, 5219);
    w.d("MicroMsg.ErrorConfirmProcessor", "handleFalseCancel");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(700482322432L, 5219);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\i\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */