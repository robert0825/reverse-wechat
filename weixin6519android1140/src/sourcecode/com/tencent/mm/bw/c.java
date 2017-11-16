package com.tencent.mm.bw;

import android.os.Environment;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.a.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class c
{
  public static boolean vFd;
  public static a vFe;
  
  static
  {
    GMTrace.i(13150787207168L, 97981);
    vFd = false;
    vFe = null;
    GMTrace.o(13150787207168L, 97981);
  }
  
  public static void AL(int paramInt)
  {
    GMTrace.i(13150116118528L, 97976);
    final boolean bool1;
    final boolean bool2;
    final boolean bool3;
    boolean bool4;
    switch (paramInt)
    {
    default: 
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
    }
    for (;;)
    {
      w.d("MicroMsg.MemoryDumpOperation", "hprof operate: dump:%b, checkWifi:%b, uploadSingal:%b,uploadAll:%b,", new Object[] { Boolean.valueOf(bool4), Boolean.valueOf(bool3), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      Executors.newSingleThreadExecutor().execute(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13149847683072L, 97974);
          if (c.vFd)
          {
            w.w("MicroMsg.MemoryDumpOperation", "Hprof is mUploading");
            GMTrace.o(13149847683072L, 97974);
            return;
          }
          if (this.vFf) {}
          for (String str = b.K(true, false);; str = null)
          {
            Process.setThreadPriority(10);
            boolean bool = am.isWifi(ab.getContext());
            if ((bool3) && (!bool))
            {
              w.w("MicroMsg.MemoryDumpOperation", "Hprof no wifi");
              GMTrace.o(13149847683072L, 97974);
              return;
            }
            if ((bool2) && (str != null)) {}
            for (;;)
            {
              c.vFd = true;
              c.Va(str);
              c.vFd = false;
              GMTrace.o(13149847683072L, 97974);
              return;
              if (bool1) {
                str = b.vFc;
              } else {
                str = null;
              }
            }
          }
        }
      });
      GMTrace.o(13150116118528L, 97976);
      return;
      w.i("MicroMsg.MemoryDumpOperation", "GC NOW.");
      System.gc();
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      continue;
      bool1 = false;
      bool2 = true;
      bool3 = false;
      bool4 = true;
      continue;
      bool1 = false;
      bool2 = true;
      bool3 = true;
      bool4 = true;
      continue;
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = true;
      continue;
      bool1 = true;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      continue;
      bool1 = true;
      bool2 = false;
      bool3 = true;
      bool4 = false;
    }
  }
  
  public static void Va(String paramString)
  {
    GMTrace.i(16087873748992L, 119864);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.MemoryDumpOperation", "Hprof error uploadPath %s ", new Object[] { paramString });
      GMTrace.o(16087873748992L, 119864);
      return;
    }
    if (!ty())
    {
      w.e("MicroMsg.MemoryDumpOperation", "Hprof sdcard invalid.");
      GMTrace.o(16087873748992L, 119864);
      return;
    }
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      w.e("MicroMsg.MemoryDumpOperation", "Hprof upload file is not exist");
      GMTrace.o(16087873748992L, 119864);
      return;
    }
    paramString = p.a(paramString, true, null);
    if (paramString == null)
    {
      GMTrace.o(16087873748992L, 119864);
      return;
    }
    File localFile = new File(paramString);
    if ((!am.isWifi(ab.getContext())) && (localFile.length() > 5242880L))
    {
      w.i("MicroMsg.MemoryDumpOperation", "Hprof not wifi exceed max size, size " + localFile.length());
      GMTrace.o(16087873748992L, 119864);
      return;
    }
    if (vFe == null)
    {
      w.e("MicroMsg.MemoryDumpOperation", "Hprof upload : no file upload impl set!");
      GMTrace.o(16087873748992L, 119864);
      return;
    }
    boolean bool = vFe.EE(paramString);
    w.i("MicroMsg.MemoryDumpOperation", "Hprof upload : %b", new Object[] { Boolean.valueOf(bool) });
    if (bool) {
      e.g(new File(b.vFc));
    }
    GMTrace.o(16087873748992L, 119864);
  }
  
  static boolean ty()
  {
    GMTrace.i(13150250336256L, 97977);
    try
    {
      if ((Environment.getExternalStorageState().equals("mounted")) && (new File(Environment.getExternalStorageDirectory().getAbsolutePath()).canWrite()))
      {
        GMTrace.o(13150250336256L, 97977);
        return true;
      }
      GMTrace.o(13150250336256L, 97977);
      return false;
    }
    catch (Exception localException)
    {
      GMTrace.o(13150250336256L, 97977);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bw\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */