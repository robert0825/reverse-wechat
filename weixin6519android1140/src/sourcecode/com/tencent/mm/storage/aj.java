package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class aj
{
  public String eDW;
  public String hcn;
  public boolean hco;
  public long time;
  public boolean vAI;
  public String vAJ;
  
  public aj(String paramString)
  {
    GMTrace.i(1590077423616L, 11847);
    this.eDW = "-1";
    this.vAJ = "";
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.emoji.EmojiContent", "EmojiContent parse failed. content is null.");
      GMTrace.o(1590077423616L, 11847);
      return;
    }
    for (;;)
    {
      try
      {
        Object localObject;
        if (paramString.endsWith("\n"))
        {
          localObject = paramString.substring(0, paramString.length() - 1);
          localObject = ((String)localObject).split(":", 6);
          if ((localObject.length == 4) && (x.fw(localObject[0])))
          {
            i = 1;
            if (localObject.length > i) {
              this.hcn = localObject[i];
            }
            if (localObject.length > i + 1) {
              this.time = bg.getLong(localObject[(i + 1)], 0L);
            }
            if (localObject.length > i + 2) {
              this.hco = localObject[(i + 2)].equals("1");
            }
            if (localObject.length > i + 3) {
              this.eDW = localObject[(i + 3)];
            }
            if (localObject.length > i + 4) {
              this.vAJ = localObject[(i + 4)].replace("*#*", ":");
            }
            if (localObject.length > i + 5) {
              this.vAI = localObject[(i + 5)].equals("1");
            }
            GMTrace.o(1590077423616L, 11847);
          }
        }
        else
        {
          this.vAJ = paramString.replace(":", "*#*");
          localObject = paramString;
          continue;
        }
        int i = 0;
      }
      catch (Exception localException)
      {
        this.time = 0L;
        w.e("MicroMsg.emoji.EmojiContent", "EmojiContent parse failed. Content:%s Excpetion:%s", new Object[] { paramString, bg.f(localException) });
        GMTrace.o(1590077423616L, 11847);
        return;
      }
    }
  }
  
  public static aj Uf(String paramString)
  {
    GMTrace.i(1590211641344L, 11848);
    paramString = new aj(paramString);
    GMTrace.o(1590211641344L, 11848);
    return paramString;
  }
  
  public static String a(String paramString1, long paramLong, boolean paramBoolean1, String paramString2, boolean paramBoolean2, String paramString3)
  {
    int j = 1;
    GMTrace.i(1589808988160L, 11845);
    paramString3 = paramString3.replace(":", "*#*");
    paramString1 = new StringBuilder().append(paramString1).append(":").append(paramLong).append(":");
    if (paramBoolean1)
    {
      i = 1;
      paramString1 = paramString1.append(i).append(":").append(paramString2).append(":").append(paramString3).append(":");
      if (!paramBoolean2) {
        break label129;
      }
    }
    label129:
    for (int i = j;; i = 0)
    {
      paramString1 = i + "\n";
      GMTrace.o(1589808988160L, 11845);
      return paramString1;
      i = 0;
      break;
    }
  }
  
  public final String bTl()
  {
    int j = 1;
    GMTrace.i(1589943205888L, 11846);
    Object localObject = new StringBuilder().append(this.hcn).append(":").append(this.time).append(":");
    if (this.hco)
    {
      i = 1;
      localObject = ((StringBuilder)localObject).append(i).append(":").append(this.eDW).append(":").append(this.vAJ).append(":");
      if (!this.vAI) {
        break label126;
      }
    }
    label126:
    for (int i = j;; i = 0)
    {
      localObject = i + "\n";
      GMTrace.o(1589943205888L, 11846);
      return (String)localObject;
      i = 0;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */