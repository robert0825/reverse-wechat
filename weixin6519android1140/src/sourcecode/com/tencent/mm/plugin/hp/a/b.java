package com.tencent.mm.plugin.hp.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.c.a;
import com.tencent.mm.c.a.a;
import com.tencent.mm.c.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.RandomAccessFile;

public final class b
{
  public static int b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(18993687560192L, 141514);
    if ((paramString1 != null) && (paramString2 != null) && (paramString3 != null)) {
      try
      {
        File localFile2 = new File(paramString1);
        RandomAccessFile localRandomAccessFile = new RandomAccessFile(localFile2, "r");
        File localFile1 = new File(paramString3);
        e.bf(paramString3);
        paramString2 = new File(paramString2);
        if ((localFile2.exists()) && (paramString2.exists()))
        {
          int j = 0;
          paramString1 = a.bq(paramString1);
          int i = j;
          if (paramString1 != null)
          {
            i = j;
            if (paramString1.eqR != null)
            {
              i = paramString1.eqR.eqU + 8;
              w.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:extLen = %d", new Object[] { Integer.valueOf(i) });
            }
          }
          if (d.a(localRandomAccessFile, localFile1, paramString2, i) != 1)
          {
            w.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:merge failed in patchLessMemory()");
            localRandomAccessFile.close();
            GMTrace.o(18993687560192L, 141514);
            return -1;
          }
          localRandomAccessFile.close();
          if (!paramString4.equalsIgnoreCase(g.bg(paramString3)))
          {
            w.i("MicroMsg.Tinker.MergeBsDiffApk", "newApkMd5:%s file md5:%s", new Object[] { paramString4, g.bg(paramString3) });
            GMTrace.o(18993687560192L, 141514);
            return -2;
          }
          paramString1 = new com.tencent.mm.c.b();
          paramString1.apkMd5 = paramString4;
          new a(paramString1).i(localFile1);
          GMTrace.o(18993687560192L, 141514);
          return 0;
        }
        w.e("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk: file not found in merge(): oldFile.exists()=%s , newFile.exists()=%s , patch.exists()=%s ", new Object[] { Boolean.valueOf(localFile2.exists()), Boolean.valueOf(localFile1.exists()), Boolean.valueOf(paramString2.exists()) });
        localRandomAccessFile.close();
        GMTrace.o(18993687560192L, 141514);
        return -1;
      }
      catch (Exception paramString1)
      {
        w.printErrStackTrace("MicroMsg.Tinker.MergeBsDiffApk", paramString1, "merge apk failed.", new Object[0]);
        GMTrace.o(18993687560192L, 141514);
        return -1;
      }
    }
    GMTrace.o(18993687560192L, 141514);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */