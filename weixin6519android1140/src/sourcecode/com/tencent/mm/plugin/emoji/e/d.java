package com.tencent.mm.plugin.emoji.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d
{
  public static d kio;
  public boolean kip;
  private Pattern kiq;
  
  public d()
  {
    GMTrace.i(11552522502144L, 86073);
    this.kip = false;
    this.kiq = Pattern.compile("_\\d");
    GMTrace.o(11552522502144L, 86073);
  }
  
  public static d aqv()
  {
    GMTrace.i(11552656719872L, 86074);
    if (kio == null) {}
    try
    {
      kio = new d();
      d locald = kio;
      GMTrace.o(11552656719872L, 86074);
      return locald;
    }
    finally {}
  }
  
  public final void vN(String paramString)
  {
    GMTrace.i(11552790937600L, 86075);
    paramString = new File(paramString);
    if ((paramString.exists()) && (paramString.isDirectory()))
    {
      paramString = paramString.listFiles();
      if ((paramString != null) && (paramString.length > 0))
      {
        int j = paramString.length;
        int i = 0;
        if (i < j)
        {
          Object localObject = paramString[i];
          if (this.kip)
          {
            if (((File)localObject).isDirectory()) {
              vN(((File)localObject).getPath());
            }
            for (;;)
            {
              i += 1;
              break;
              String str = ((File)localObject).getName();
              if ((this.kiq.matcher(str).find()) || (str.startsWith("temp"))) {
                ((File)localObject).delete();
              }
            }
          }
          w.i("MicroMsg.emoji.EmojiFileCleanTaskManager", "stop run");
          GMTrace.o(11552790937600L, 86075);
          return;
        }
      }
    }
    GMTrace.o(11552790937600L, 86075);
  }
  
  public final void vO(String paramString)
  {
    GMTrace.i(11552925155328L, 86076);
    paramString = new File(paramString);
    if ((paramString.exists()) && (paramString.isDirectory()))
    {
      paramString = paramString.listFiles();
      if ((paramString != null) && (paramString.length > 0))
      {
        int j = paramString.length;
        int i = 0;
        if (i < j)
        {
          Object localObject = paramString[i];
          if (((File)localObject).isDirectory()) {
            vO(((File)localObject).getPath());
          }
          for (;;)
          {
            i += 1;
            break;
            ((File)localObject).getName();
            ((File)localObject).delete();
          }
        }
      }
    }
    GMTrace.o(11552925155328L, 86076);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */