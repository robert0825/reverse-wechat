package com.tencent.mm.pluginsdk.i;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends b
{
  public j(Activity paramActivity)
  {
    super(paramActivity);
    GMTrace.i(699005927424L, 5208);
    GMTrace.o(699005927424L, 5208);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(699140145152L, 5209);
    w.i("MicroMsg.ErrorTextStripleProcessor", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    GMTrace.o(699140145152L, 5209);
  }
  
  public final boolean b(o paramo)
  {
    GMTrace.i(699274362880L, 5210);
    w.d("MicroMsg.ErrorTextStripleProcessor", "handleOpenUrl");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(699274362880L, 5210);
    return true;
  }
  
  public final boolean c(o paramo)
  {
    GMTrace.i(699408580608L, 5211);
    w.d("MicroMsg.ErrorTextStripleProcessor", "handleIgnore");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(699408580608L, 5211);
    return true;
  }
  
  public final boolean d(o paramo)
  {
    GMTrace.i(699542798336L, 5212);
    w.d("MicroMsg.ErrorTextStripleProcessor", "handleFalseLast");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(699542798336L, 5212);
    return true;
  }
  
  public final boolean e(o paramo)
  {
    GMTrace.i(699677016064L, 5213);
    w.d("MicroMsg.ErrorTextStripleProcessor", "handleFalseCancel");
    Toast.makeText(this.activity, paramo.content, 0).show();
    GMTrace.o(699677016064L, 5213);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\i\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */