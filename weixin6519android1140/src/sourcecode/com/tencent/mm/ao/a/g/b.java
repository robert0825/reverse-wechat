package com.tencent.mm.ao.a.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class b
{
  public static final String gLs;
  public static long gLt;
  public static final String ghx;
  public static final String ghz;
  
  static
  {
    GMTrace.i(13717320237056L, 102202);
    ghx = h.getExternalStorageDirectory().getAbsolutePath();
    ghz = ghx + "/tencent/MicroMsg/";
    gLs = ghz + ".tmp";
    gLt = 0L;
    GMTrace.o(13717320237056L, 102202);
  }
  
  public static String Jp()
  {
    GMTrace.i(13716783366144L, 102198);
    Object localObject = new StringBuilder().append(gLs).append("/");
    long l = System.currentTimeMillis();
    localObject = new SimpleDateFormat("yyyyMMdd").format(new Date(l));
    w.d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] get tmp file path:%s", new Object[] { localObject });
    File localFile = new File(gLs);
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    GMTrace.o(13716783366144L, 102198);
    return (String)localObject;
  }
  
  public static boolean Jq()
  {
    GMTrace.i(13716917583872L, 102199);
    long l = System.currentTimeMillis();
    if (l - gLt > 86400000L)
    {
      w.d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] need clean tmp file.");
      gLt = l;
      GMTrace.o(13716917583872L, 102199);
      return true;
    }
    w.d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] need not clean tmp file.");
    GMTrace.o(13716917583872L, 102199);
    return false;
  }
  
  public static boolean Jr()
  {
    GMTrace.i(13717051801600L, 102200);
    File localFile = new File(gLs);
    try
    {
      if ((localFile.exists()) && (!localFile.isFile())) {
        b(localFile, true);
      }
      GMTrace.o(13717051801600L, 102200);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] clean tmp file path exception.");
      GMTrace.o(13717051801600L, 102200);
    }
    return false;
  }
  
  private static void b(File paramFile, boolean paramBoolean)
  {
    GMTrace.i(13717186019328L, 102201);
    if ((paramFile != null) && (paramFile.exists()) && (paramFile.isDirectory()))
    {
      File[] arrayOfFile = paramFile.listFiles();
      if ((arrayOfFile != null) && (arrayOfFile.length > 0))
      {
        int k = arrayOfFile.length;
        int i = 0;
        if (i < k)
        {
          File localFile = arrayOfFile[i];
          if ((localFile != null) && (localFile.exists()))
          {
            if (!localFile.isFile()) {
              break label117;
            }
            if ((localFile != null) && (localFile.isFile()) && (localFile.exists())) {
              localFile.delete();
            }
          }
          label117:
          label190:
          for (;;)
          {
            i += 1;
            break;
            long l1 = localFile.lastModified();
            long l2 = System.currentTimeMillis();
            w.d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] can delete current time:%d,listModified:%d", new Object[] { Long.valueOf(l2), Long.valueOf(l1) });
            if (l2 - l1 >= 259200000L) {}
            for (int j = 1;; j = 0)
            {
              if ((j == 0) || (!paramBoolean)) {
                break label190;
              }
              b(localFile, false);
              break;
            }
          }
        }
      }
      paramFile.delete();
    }
    GMTrace.o(13717186019328L, 102201);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */