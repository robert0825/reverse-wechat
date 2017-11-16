package com.tencent.mm.plugin.appbrand.j;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.bd;
import com.tencent.mm.g.a.ht;
import com.tencent.mm.g.a.is;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;

public final class c
{
  public b izn;
  public com.tencent.mm.sdk.b.c izo;
  public com.tencent.mm.sdk.b.c izp;
  public com.tencent.mm.sdk.b.c izq;
  
  public c()
  {
    GMTrace.i(10664538013696L, 79457);
    this.izq = new com.tencent.mm.sdk.b.c() {};
    this.izn = new b();
    this.izo = new com.tencent.mm.sdk.b.c() {};
    this.izp = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(10664538013696L, 79457);
  }
  
  public static boolean c(File paramFile1, File paramFile2)
  {
    GMTrace.i(10665074884608L, 79461);
    e.f(paramFile2);
    paramFile2.mkdirs();
    File localFile = new File(paramFile2, ".nomedia");
    if (!localFile.exists()) {}
    try
    {
      localFile.createNewFile();
      paramFile1 = paramFile1.getAbsolutePath();
      paramFile2 = paramFile2.getAbsolutePath();
      int i = bg.eV(paramFile1, paramFile2);
      if (i < 0)
      {
        w.e("MicroMsg.WxaFTSSearchCore", "unzip fail, ret = %s, zipFilePath = %s, unzipPath = ", new Object[] { Integer.valueOf(i), paramFile1, paramFile2 });
        GMTrace.o(10665074884608L, 79461);
        return false;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.WxaFTSSearchCore", localIOException, "create nomedia file error", new Object[0]);
      }
      w.i("MicroMsg.WxaFTSSearchCore", "Unzip Path : %s.", new Object[] { paramFile2 });
      GMTrace.o(10665074884608L, 79461);
    }
    return true;
  }
  
  private static boolean c(File paramFile, String paramString)
  {
    GMTrace.i(10664940666880L, 79460);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(10664940666880L, 79460);
      return false;
    }
    if (!paramFile.exists()) {
      paramFile.mkdirs();
    }
    Object localObject = new File(paramFile, ".nomedia");
    if (!((File)localObject).exists()) {}
    boolean bool;
    try
    {
      ((File)localObject).createNewFile();
      paramFile = new File(paramFile, paramString);
      localObject = paramFile.getAbsolutePath();
      bool = ((g)h.h(g.class)).aP((String)localObject, paramString);
      if (bool)
      {
        paramString = paramFile.getParent();
        int i = bg.eV((String)localObject, paramString);
        if (i < 0)
        {
          w.e("MicroMsg.WxaFTSSearchCore", "unzip fail, ret = %s, zipFilePath = %s, unzipPath = %s", new Object[] { Integer.valueOf(i), localObject, paramString });
          GMTrace.o(10664940666880L, 79460);
          return false;
        }
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.WxaFTSSearchCore", localIOException, "create nomedia file error", new Object[0]);
      }
      w.i("MicroMsg.WxaFTSSearchCore", "unzip template files into dir(%s) successfully.", new Object[] { paramFile.getAbsolutePath() });
    }
    for (;;)
    {
      GMTrace.o(10664940666880L, 79460);
      return bool;
      w.i("MicroMsg.WxaFTSSearchCore", "copy template file from asset fail %s", new Object[] { paramFile.getAbsolutePath() });
    }
  }
  
  public final void prepare()
  {
    GMTrace.i(10664672231424L, 79458);
    a.vgX.b(this.izo);
    a.vgX.b(this.izp);
    this.izq.bPu();
    refresh();
    File localFile = new File(this.izn.izm);
    w.d("MicroMsg.WxaFTSSearchCore", "prepare(cv : %s, bv : %s)", new Object[] { Integer.valueOf(this.izn.afp), Integer.valueOf(65900180) });
    if ((this.izn.afp < 65900180) && (c(localFile, "wxa_fts_template.zip"))) {
      refresh();
    }
    GMTrace.o(10664672231424L, 79458);
  }
  
  public final void refresh()
  {
    GMTrace.i(10664806449152L, 79459);
    this.izn.afp = ((g)h.h(g.class)).KK();
    this.izn.izm = ((g)h.h(g.class)).Ko();
    GMTrace.o(10664806449152L, 79459);
  }
  
  private static final class a
  {
    public static c izs;
    
    static
    {
      GMTrace.i(19693230358528L, 146726);
      izs = new c();
      GMTrace.o(19693230358528L, 146726);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\j\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */