package com.tencent.mm.plugin.hp.tinker;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.app.n;
import com.tencent.mm.loader.stub.BaseBuildInfo;
import com.tencent.mm.plugin.hp.d.c;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.util.Properties;

public final class b
  extends com.tencent.tinker.lib.a.a
{
  private final int mhA;
  
  public b(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5756329918464L, 42888);
    this.mhA = ((ActivityManager)paramContext.getSystemService("activity")).getMemoryClass();
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerPatchListener", "application maxMemory:" + this.mhA, new Object[0]);
    GMTrace.o(5756329918464L, 42888);
  }
  
  public final int cC(String paramString1, String paramString2)
  {
    boolean bool = false;
    GMTrace.i(18949127274496L, 141182);
    File localFile = new File(paramString1);
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerPatchListener", "receive a patch file: %s, file size:%d", new Object[] { paramString1, Long.valueOf(SharePatchFileUtil.aa(localFile)) });
    int j = super.cC(paramString1, paramString2);
    int i = j;
    if (j == 0)
    {
      if (this.mhA < 45) {
        i = -23;
      }
    }
    else
    {
      j = i;
      if (i == 0)
      {
        com.tencent.tinker.lib.d.a.hQ(this.context);
        j = i;
        if (i == 0)
        {
          paramString1 = ShareTinkerInternals.ag(localFile);
          if (paramString1 != null) {
            break label192;
          }
          j = -24;
        }
      }
    }
    for (;;)
    {
      i = j;
      if (j == 0)
      {
        i = j;
        if (ShareTinkerInternals.cqM())
        {
          i = j;
          if (n.a(new Throwable().getStackTrace())) {
            i = -26;
          }
        }
      }
      if (i == 0) {
        bool = true;
      }
      com.tencent.mm.plugin.hp.b.b.ff(bool);
      GMTrace.o(18949127274496L, 141182);
      return i;
      if (!c.cC(83886080L))
      {
        i = -21;
        break;
      }
      i = 0;
      break;
      label192:
      paramString1 = paramString1.getProperty("patch.basepack.client.ver");
      com.tencent.tinker.lib.e.a.i("Tinker.TinkerPatchListener", "get BASE_CLIENT_VERSION:" + paramString1, new Object[0]);
      if (paramString1 != null)
      {
        j = i;
        if (paramString1.equalsIgnoreCase(BaseBuildInfo.CLIENT_VERSION)) {}
      }
      else
      {
        j = -25;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\tinker\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */