package com.tencent.mm.plugin.downloader.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public abstract class j
  implements o
{
  protected c kfj;
  
  public j(c paramc)
  {
    GMTrace.i(18598550568960L, 138570);
    this.kfj = paramc;
    GMTrace.o(18598550568960L, 138570);
  }
  
  public static void vD(String paramString)
  {
    GMTrace.i(18598684786688L, 138571);
    if (!bg.nm(paramString))
    {
      paramString = new File(paramString);
      if (paramString.exists()) {
        w.i("MicroMsg.FileDownloaderImplBase", "Delete previous file result: %b", new Object[] { Boolean.valueOf(paramString.delete()) });
      }
    }
    GMTrace.o(18598684786688L, 138571);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */