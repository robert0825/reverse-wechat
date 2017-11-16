package com.tencent.mm.c;

import com.tencent.gmtrace.GMTrace;
import java.io.File;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public final class h
{
  public static int b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(14023873527808L, 104486);
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null))
    {
      GMTrace.o(14023873527808L, 104486);
      return -1;
    }
    for (;;)
    {
      try
      {
        File localFile2 = new File(paramString1);
        RandomAccessFile localRandomAccessFile = new RandomAccessFile(localFile2, "r");
        File localFile1 = new File(paramString3);
        paramString2 = new File(paramString2);
        if ((!localFile2.exists()) || (!paramString2.exists()))
        {
          System.err.println("MicroMsg.MergePatchApk: file not found in merge(): oldFile.exists()=" + localFile2.exists() + ", newFile.exists()=" + localFile1.exists() + ", patch.exists()=" + paramString2.exists());
          localRandomAccessFile.close();
          GMTrace.o(14023873527808L, 104486);
          return -1;
        }
        paramString1 = a.bq(paramString1);
        if ((paramString1 != null) && (paramString1.eqR != null))
        {
          i = paramString1.eqR.eqU + 8;
          System.out.println("MicroMsg.MergePatchApk:extLen = " + i);
          if (d.a(localRandomAccessFile, localFile1, paramString2, i) != 1)
          {
            System.out.println("MicroMsg.MergePatchApk:merge failed in patchLessMemory()");
            localRandomAccessFile.close();
            GMTrace.o(14023873527808L, 104486);
            return -1;
          }
          localRandomAccessFile.close();
          boolean bool = paramString4.equalsIgnoreCase(g.bg(paramString3));
          if (!bool)
          {
            GMTrace.o(14023873527808L, 104486);
            return -2;
          }
          paramString1 = new b();
          paramString1.apkMd5 = paramString4;
          new a(paramString1).i(localFile1);
          GMTrace.o(14023873527808L, 104486);
          return 0;
        }
      }
      catch (Exception paramString1)
      {
        System.out.println("MicroMsg.MergePatchApk:Exception in merge()");
        GMTrace.o(14023873527808L, 104486);
        return -1;
      }
      int i = 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */