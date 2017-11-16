package com.tencent.mm.plugin.appbrand.appcache;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public final class j
  implements y.a
{
  private final CountDownLatch hIR;
  private final AtomicInteger hIS;
  
  public j()
  {
    GMTrace.i(19993206980608L, 148961);
    this.hIR = new CountDownLatch(1);
    this.hIS = new AtomicInteger(0);
    GMTrace.o(19993206980608L, 148961);
  }
  
  public final void a(String paramString, y.a.b paramb, y.a.a parama)
  {
    GMTrace.i(19993475416064L, 148963);
    this.hIR.countDown();
    GMTrace.o(19993475416064L, 148963);
  }
  
  public final WxaPkgWrappingInfo bW(boolean paramBoolean)
  {
    GMTrace.i(19993341198336L, 148962);
    Object localObject = s.bZ(paramBoolean);
    if (((Pair)localObject).second != null)
    {
      localObject = (WxaPkgWrappingInfo)((Pair)localObject).second;
      GMTrace.o(19993341198336L, 148962);
      return (WxaPkgWrappingInfo)localObject;
    }
    if (((Pair)localObject).first == s.a.hJQ)
    {
      localObject = ((a)h.h(a.class)).RZ();
      int i;
      if (paramBoolean)
      {
        i = 0;
        label68:
        localObject = ((x)localObject).a("@LibraryAppId", i, new String[] { "downloadURL", "version" });
        if ((localObject == null) || (bg.nm(((t)localObject).field_downloadURL)) || (this.hIS.getAndIncrement() > 0)) {
          break label193;
        }
        if (!paramBoolean) {
          break label181;
        }
        y.a(((t)localObject).field_downloadURL, ((t)localObject).field_version, this);
      }
      for (;;)
      {
        try
        {
          this.hIR.await();
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.ReadOrDownloadLibrary", "downloadSemaphore await failed, release %b, e %s", new Object[] { Boolean.valueOf(paramBoolean), localException });
          GMTrace.o(19993341198336L, 148962);
          return null;
        }
        i = 999;
        break label68;
        label181:
        y.a(localException.field_downloadURL, this);
      }
    }
    label193:
    GMTrace.o(19993341198336L, 148962);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */