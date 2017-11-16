package com.tencent.mm.plugin.zero;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class a
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.zero.b.a
{
  private com.tencent.mm.k.e tkf;
  private com.tencent.mm.k.c tkg;
  
  public a()
  {
    GMTrace.i(13631152455680L, 101560);
    this.tkf = new com.tencent.mm.k.e();
    this.tkg = new com.tencent.mm.k.c();
    GMTrace.o(13631152455680L, 101560);
  }
  
  public final void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(13631555108864L, 101563);
    if (paramf.fZo)
    {
      paramf = this.tkg;
      File localFile1 = new File(com.tencent.mm.compatible.util.e.ghz + "configlist/");
      if (localFile1.exists())
      {
        File localFile2 = new File(com.tencent.mm.k.c.fSI);
        if (!localFile2.exists())
        {
          w.d("MicroMsg.ConfigListDecoder", "bugfix");
          paramf.b(localFile1, localFile2);
        }
      }
    }
    this.tkf.load();
    this.tkg.init();
    GMTrace.o(13631555108864L, 101563);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(13631689326592L, 101564);
    GMTrace.o(13631689326592L, 101564);
  }
  
  public final com.tencent.mm.k.e ut()
  {
    GMTrace.i(13631286673408L, 101561);
    h.xz();
    h.xw().wG();
    com.tencent.mm.k.e locale = this.tkf;
    GMTrace.o(13631286673408L, 101561);
    return locale;
  }
  
  public final com.tencent.mm.k.c uu()
  {
    GMTrace.i(13631420891136L, 101562);
    h.xz();
    h.xw().wG();
    com.tencent.mm.k.c localc = this.tkg;
    GMTrace.o(13631420891136L, 101562);
    return localc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\zero\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */