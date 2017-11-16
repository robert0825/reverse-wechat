package com.tencent.mm.z;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.account.h.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class a
  implements e, h.a
{
  public a()
  {
    GMTrace.i(413524819968L, 3081);
    GMTrace.o(413524819968L, 3081);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(413927473152L, 3084);
    if (paramk.getType() != 183)
    {
      GMTrace.o(413927473152L, 3084);
      return;
    }
    at.wS().b(183, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.i("MicroMsg.RefreshTokenListener", "update token success");
      GMTrace.o(413927473152L, 3084);
      return;
    }
    w.e("MicroMsg.RefreshTokenListener", "update token fail");
    GMTrace.o(413927473152L, 3084);
  }
  
  public void m(Bundle paramBundle)
  {
    GMTrace.i(413659037696L, 3082);
    String str = paramBundle.getString("access_token");
    paramBundle = paramBundle.getString("expires");
    w.i("MicroMsg.RefreshTokenListener", "onComplete : newToken = " + str + ", expires = " + paramBundle);
    if (paramBundle != null)
    {
      at.AR();
      c.xh().set(65832, paramBundle);
    }
    at.AR();
    c.xh().set(65830, str);
    at.AR();
    c.xh().set(65831, Long.valueOf(System.currentTimeMillis()));
    at.wS().a(183, this);
    paramBundle = new g(2, str);
    at.wS().a(paramBundle, 0);
    GMTrace.o(413659037696L, 3082);
  }
  
  public void onError(int paramInt, String paramString)
  {
    GMTrace.i(413793255424L, 3083);
    w.e("MicroMsg.RefreshTokenListener", "onError : errType = " + paramInt + ", errMsg = " + paramString);
    GMTrace.o(413793255424L, 3083);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\z\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */