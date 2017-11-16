package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;
import java.io.IOException;

public final class b
{
  public static String wJ(String paramString)
  {
    GMTrace.i(11181410484224L, 83308);
    if ((bg.nm(paramString)) || ("#".equals(paramString)))
    {
      GMTrace.o(11181410484224L, 83308);
      return "";
    }
    Object localObject = aa.RP(paramString);
    localObject = new File(d.aue(), (String)localObject);
    if (((File)localObject).exists())
    {
      paramString = ((File)localObject).getAbsolutePath();
      GMTrace.o(11181410484224L, 83308);
      return paramString;
    }
    try
    {
      ((File)localObject).createNewFile();
      at.xB().A(new a(paramString, (File)localObject));
      GMTrace.o(11181410484224L, 83308);
      return "";
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.d("MicroMsg.ExdevicePictureLocalizer", "hy: %s", new Object[] { localIOException.toString() });
      }
    }
  }
  
  static final class a
    implements Runnable
  {
    private File kBF;
    private String url;
    
    a(String paramString, File paramFile)
    {
      GMTrace.i(11184631709696L, 83332);
      this.url = paramString;
      this.kBF = paramFile;
      GMTrace.o(11184631709696L, 83332);
    }
    
    public final void run()
    {
      GMTrace.i(11184765927424L, 83333);
      byte[] arrayOfByte = bg.SC(this.url);
      if (arrayOfByte != null) {
        FileOp.j(this.kBF.getAbsolutePath(), arrayOfByte);
      }
      GMTrace.o(11184765927424L, 83333);
    }
    
    public final String toString()
    {
      GMTrace.i(11184900145152L, 83334);
      String str = super.toString() + "|DownloadRunnable";
      GMTrace.o(11184900145152L, 83334);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */