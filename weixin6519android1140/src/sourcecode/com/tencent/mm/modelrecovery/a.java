package com.tencent.mm.modelrecovery;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;

public final class a
{
  public static void Km()
  {
    GMTrace.i(17959271530496L, 133807);
    File localFile = new File(ab.getContext().getFilesDir(), "/recovery/recovery.log");
    String str = null;
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (localFile.exists())
    {
      localObject1 = localObject2;
      if (localFile.length() > 0L) {
        localObject1 = str;
      }
    }
    try
    {
      localObject2 = FileOp.be(localFile.getAbsolutePath());
      localObject1 = localObject2;
      localFile.delete();
      localObject1 = localObject2;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        int k;
        int i;
        int j;
        w.printErrStackTrace("MicroMsg.Recovery.RecoveryLogUtil", localIOException, "recoveryLog", new Object[0]);
        continue;
        if (str.equals("E"))
        {
          j = 0;
          continue;
          w.e(localIOException[1], localIOException[2]);
          continue;
          w.i("MicroMsg.Recovery.RecoveryLogUtil", str);
        }
      }
      GMTrace.o(17959271530496L, 133807);
      return;
    }
    if (!bg.nm((String)localObject1))
    {
      localObject1 = ((String)localObject1).split("​​");
      k = localObject1.length;
      i = 0;
      for (;;)
      {
        if (i >= k) {
          break label255;
        }
        str = localObject1[i];
        localObject2 = str.split("​");
        if ((localObject2 == null) || (localObject2.length != 3)) {
          break;
        }
        str = localObject2[0];
        j = -1;
        switch (str.hashCode())
        {
        default: 
          switch (j)
          {
          default: 
            w.i(localObject2[1], localObject2[2]);
            i += 1;
          }
          break;
        }
      }
    }
    label255:
    w.i("MicroMsg.Recovery.RecoveryLogUtil", "not found recovery log");
    GMTrace.o(17959271530496L, 133807);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelrecovery\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */