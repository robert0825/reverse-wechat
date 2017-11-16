package com.tencent.mm.kernel.b;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.app.MMApplicationLike;
import com.tencent.mm.booter.c;
import com.tencent.mm.bz.a;
import com.tencent.mm.bz.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tinker.loader.app.ApplicationLifeCycle;

public final class f
  extends e
{
  public c fJG;
  public MMApplicationLike gaq;
  public a<ApplicationLifeCycle> gar;
  public com.tencent.mm.compatible.loader.e mProfileCompat;
  
  public f(String paramString, Application paramApplication, MMApplicationLike paramMMApplicationLike)
  {
    super(paramString, paramApplication);
    GMTrace.i(13518812217344L, 100723);
    this.gar = new a();
    ab.RQ(paramString);
    this.gaq = paramMMApplicationLike;
    GMTrace.o(13518812217344L, 100723);
  }
  
  public final String getPackageName()
  {
    GMTrace.i(18789005524992L, 139989);
    String str = ab.getPackageName();
    GMTrace.o(18789005524992L, 139989);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */