package com.tencent.tinker.d.a;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class i
{
  public static void a(f paramf, File paramFile, long paramLong, h paramh)
  {
    paramf = new f(paramf);
    paramf.setMethod(0);
    paramf.setSize(paramFile.length());
    paramf.yje = paramFile.length();
    if ((paramLong >= 0L) && (paramLong <= 4294967295L)) {
      paramf.yiT = paramLong;
    }
    try
    {
      paramFile = new BufferedInputStream(new FileInputStream(paramFile));
      int i;
      if (paramFile == null) {
        break label161;
      }
    }
    finally
    {
      try
      {
        paramh.b(new f(paramf));
        paramf = new byte['䀀'];
        i = paramFile.read(paramf);
        if (i != -1)
        {
          paramh.write(paramf, 0, i);
          i = paramFile.read(paramf);
          throw new IllegalArgumentException("Bad CRC32: " + paramLong);
        }
        paramh.closeEntry();
        paramFile.close();
        return;
      }
      finally
      {
        for (;;) {}
      }
      paramf = finally;
      paramFile = null;
    }
    paramFile.close();
    label161:
    throw paramf;
  }
  
  public static void a(f paramf, InputStream paramInputStream, h paramh)
  {
    paramh.b(paramf);
    paramf = new byte['䀀'];
    for (int i = paramInputStream.read(paramf); i != -1; i = paramInputStream.read(paramf)) {
      paramh.write(paramf, 0, i);
    }
    paramh.closeEntry();
  }
  
  public static void a(g paramg, f paramf, h paramh)
  {
    g localg = null;
    try
    {
      paramg = paramg.a(paramf);
      localg = paramg;
      paramh.b(new f(paramf));
      localg = paramg;
      paramf = new byte['䀀'];
      localg = paramg;
      for (int i = paramg.read(paramf); i != -1; i = paramg.read(paramf))
      {
        localg = paramg;
        paramh.write(paramf, 0, i);
        localg = paramg;
      }
      localg = paramg;
      paramh.closeEntry();
      return;
    }
    finally
    {
      if (localg != null) {
        localg.close();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\d\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */