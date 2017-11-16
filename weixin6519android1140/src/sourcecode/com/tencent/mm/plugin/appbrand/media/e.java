package com.tencent.mm.plugin.appbrand.media;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;

public final class e
{
  public static boolean ri(String paramString)
  {
    GMTrace.i(19859928776704L, 147968);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(19859928776704L, 147968);
      return false;
    }
    if ("aac".equalsIgnoreCase(paramString))
    {
      GMTrace.o(19859928776704L, 147968);
      return true;
    }
    if ("mp3".equalsIgnoreCase(paramString))
    {
      GMTrace.o(19859928776704L, 147968);
      return true;
    }
    if ("wav".equalsIgnoreCase(paramString))
    {
      GMTrace.o(19859928776704L, 147968);
      return false;
    }
    GMTrace.o(19859928776704L, 147968);
    return false;
  }
  
  public static boolean rj(String paramString)
  {
    boolean bool1 = false;
    GMTrace.i(19860062994432L, 147969);
    paramString = new File(paramString);
    if (!paramString.exists()) {}
    for (;;)
    {
      boolean bool2;
      try
      {
        w.i("MicroMsg.AudioRecordUtil", "new audio file");
        bool2 = paramString.createNewFile();
        bool1 = bool2;
      }
      catch (IOException paramString)
      {
        w.printErrStackTrace("MicroMsg.AudioRecordUtil", paramString, "prepareCacheFile", new Object[0]);
        continue;
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.AudioRecordUtil", paramString, "prepareCacheFile", new Object[0]);
        continue;
      }
      GMTrace.o(19860062994432L, 147969);
      return bool1;
      w.i("MicroMsg.AudioRecordUtil", "delete audio file");
      paramString.delete();
      try
      {
        bool2 = paramString.createNewFile();
        bool1 = bool2;
      }
      catch (IOException paramString)
      {
        w.printErrStackTrace("MicroMsg.AudioRecordUtil", paramString, "prepareCacheFile", new Object[0]);
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.AudioRecordUtil", paramString, "prepareCacheFile", new Object[0]);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */