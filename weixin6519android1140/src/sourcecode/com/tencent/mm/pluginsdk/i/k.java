package com.tencent.mm.pluginsdk.i;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class k
  extends b
{
  public k(Activity paramActivity)
  {
    super(paramActivity);
    GMTrace.i(705582596096L, 5257);
    GMTrace.o(705582596096L, 5257);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(705716813824L, 5258);
    w.i("MicroMsg.ErrorYesNoProcessor", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    GMTrace.o(705716813824L, 5258);
  }
  
  public final boolean b(o paramo)
  {
    GMTrace.i(705851031552L, 5259);
    w.d("MicroMsg.ErrorYesNoProcessor", "handleOpenUrl");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(705851031552L, 5259);
    return true;
  }
  
  public final boolean c(o paramo)
  {
    GMTrace.i(705985249280L, 5260);
    w.d("MicroMsg.ErrorYesNoProcessor", "handleIgnore");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(705985249280L, 5260);
    return true;
  }
  
  public final boolean d(o paramo)
  {
    GMTrace.i(706119467008L, 5261);
    w.d("MicroMsg.ErrorYesNoProcessor", "handleFalseLast");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(706119467008L, 5261);
    return true;
  }
  
  public final boolean e(o paramo)
  {
    GMTrace.i(706253684736L, 5262);
    w.d("MicroMsg.ErrorYesNoProcessor", "handleFalseCancel");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(706253684736L, 5262);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\i\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */