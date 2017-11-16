package com.tencent.mm.booter;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.k;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public static boolean r(Context paramContext, String paramString)
  {
    GMTrace.i(13459085328384L, 100278);
    if (((!paramString.equals("noop")) || ((f.vhu) && (f.vht))) && (k.aS(paramContext)))
    {
      w.i("MicroMsg.CoreServiceHelper", "fully exited, no need to start service");
      GMTrace.o(13459085328384L, 100278);
      return false;
    }
    w.d("MicroMsg.CoreServiceHelper", "ensure service running, type=" + paramString);
    Intent localIntent = new Intent(paramContext, CoreService.class);
    localIntent.setFlags(268435456);
    localIntent.putExtra("START_TYPE", paramString);
    paramContext.startService(localIntent);
    GMTrace.o(13459085328384L, 100278);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */