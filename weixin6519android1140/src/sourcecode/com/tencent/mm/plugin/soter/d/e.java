package com.tencent.mm.plugin.soter.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.SparseArray;
import com.tencent.d.a.c.f;
import com.tencent.d.b.b.a;
import com.tencent.d.b.f.i;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.soter.c.h;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends i
{
  public e(Context paramContext, com.tencent.d.b.f.e parame)
  {
    super(paramContext, parame);
    GMTrace.i(18492518563840L, 137780);
    GMTrace.o(18492518563840L, 137780);
  }
  
  @SuppressLint({"DefaultLocale"})
  protected final void a(String paramString, int[] paramArrayOfInt)
  {
    GMTrace.i(18492652781568L, 137781);
    w.v("MicroMsg.SoterTaskInitForWX", "alvinluo generateAuthKeyNames");
    int j = paramArrayOfInt.length;
    int i = 0;
    if (i < j)
    {
      int k = paramArrayOfInt[i];
      if (k == 1) {}
      for (String str = h.bqE();; str = String.format("SoterAuthKey_salt%s_scene%d", new Object[] { f.nl(paramString), Integer.valueOf(k) }))
      {
        w.i("MicroMsg.SoterTaskInitForWX", "alvinluo scene: %d, authKeyName: %s", new Object[] { Integer.valueOf(k), str });
        a.cpH().cpJ().put(k, str);
        i += 1;
        break;
      }
    }
    GMTrace.o(18492652781568L, 137781);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */