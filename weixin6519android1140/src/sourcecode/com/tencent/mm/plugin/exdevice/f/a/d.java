package com.tencent.mm.plugin.exdevice.f.a;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.File;

public final class d
{
  private static final String kBH;
  private static final String kBI;
  
  static
  {
    GMTrace.i(11188658241536L, 83362);
    kBH = e.fSh + "uploaded_photos/";
    kBI = e.fSh + "temp/";
    GMTrace.o(11188658241536L, 83362);
  }
  
  public static File aue()
  {
    GMTrace.i(11188524023808L, 83361);
    File localFile = new File(kBH);
    if ((!localFile.exists()) || (!localFile.isDirectory())) {
      localFile.mkdirs();
    }
    GMTrace.o(11188524023808L, 83361);
    return localFile;
  }
  
  public static String wK(String paramString)
  {
    GMTrace.i(11188389806080L, 83360);
    if (bg.nm(paramString)) {}
    for (String str = "";; str = new File(aue(), str).getAbsolutePath())
    {
      com.tencent.mm.sdk.platformtools.d.b(paramString, 640, 640, Bitmap.CompressFormat.JPEG, 100, str);
      System.currentTimeMillis();
      GMTrace.o(11188389806080L, 83360);
      return str;
      str = aa.RP(paramString);
      str = str + "_t";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */