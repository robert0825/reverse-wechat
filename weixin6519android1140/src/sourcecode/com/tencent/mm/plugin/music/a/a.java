package com.tencent.mm.plugin.music.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;

public final class a
{
  public String album;
  public String hZU;
  private int kWb;
  public long mK;
  public ArrayList<a> npu;
  public LinkedList<Long> npv;
  public String npw;
  public String npx;
  public String npy;
  private boolean npz;
  public String title;
  
  public a()
  {
    GMTrace.i(4853313044480L, 36160);
    this.npv = new LinkedList();
    this.npu = new ArrayList();
    this.kWb = 0;
    this.npz = false;
    GMTrace.o(4853313044480L, 36160);
  }
  
  public static long Dj(String paramString)
  {
    int i = 0;
    GMTrace.i(4853044609024L, 36158);
    for (;;)
    {
      try
      {
        paramString = paramString.split(":");
        int m = bg.getInt(paramString[0], 0);
        if (paramString.length > 1)
        {
          paramString = paramString[1].split("\\.");
          int k = bg.getInt(paramString[0], 0);
          j = k;
          if (paramString.length > 1)
          {
            i = bg.getInt(paramString[1], 0);
            j = k;
          }
          long l1 = m;
          long l2 = j * 1000;
          long l3 = i * 10;
          GMTrace.o(4853044609024L, 36158);
          return l3 + (l1 * 60L * 1000L + l2);
        }
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.Music.LyricObj", paramString, "", new Object[0]);
        w.w("MicroMsg.Music.LyricObj", "strToLong error: %s", new Object[] { paramString.getLocalizedMessage() });
        GMTrace.o(4853044609024L, 36158);
        return 0L;
      }
      int j = 0;
    }
  }
  
  public static String db(String paramString1, String paramString2)
  {
    GMTrace.i(4852910391296L, 36157);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(4852910391296L, 36157);
      return paramString1;
    }
    if (paramString2.length() >= paramString1.length() - 1)
    {
      GMTrace.o(4852910391296L, 36157);
      return "";
    }
    String str = paramString1.substring(paramString2.length(), paramString1.length() - 1);
    w.d("MicroMsg.Music.LyricObj", "str[%s] prefix[%s] attr[%s]", new Object[] { paramString1, paramString2, str });
    GMTrace.o(4852910391296L, 36157);
    return str;
  }
  
  public final a ri(int paramInt)
  {
    GMTrace.i(4853178826752L, 36159);
    if ((paramInt < 0) || (paramInt >= this.npu.size()))
    {
      GMTrace.o(4853178826752L, 36159);
      return null;
    }
    a locala = (a)this.npu.get(paramInt);
    GMTrace.o(4853178826752L, 36159);
    return locala;
  }
  
  public static final class a
  {
    public String content;
    public boolean npA;
    public long timestamp;
    
    public a()
    {
      GMTrace.i(4856534269952L, 36184);
      GMTrace.o(4856534269952L, 36184);
    }
    
    public final String toString()
    {
      GMTrace.i(4856668487680L, 36185);
      String str = String.format("[%d %s]", new Object[] { Long.valueOf(this.timestamp), this.content });
      GMTrace.o(4856668487680L, 36185);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */