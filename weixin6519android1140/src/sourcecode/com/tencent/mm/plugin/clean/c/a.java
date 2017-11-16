package com.tencent.mm.plugin.clean.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Calendar;

public final class a
{
  public long eCL;
  public String eIy;
  public String filePath;
  public long hct;
  public long size;
  public int type;
  private String userName;
  
  public a(String paramString1, String paramString2, int paramInt, String paramString3, long paramLong1, long paramLong2)
  {
    GMTrace.i(7051128340480L, 52535);
    this.size = e.aY(paramString2);
    w.v("MicroMsg.AnalyseItem", "add mst %d %d %s %s %d", new Object[] { Long.valueOf(this.size), Integer.valueOf(paramInt), bg.eL(this.size), paramString3, Long.valueOf(paramLong1) });
    this.eIy = paramString1;
    this.type = paramInt;
    this.filePath = paramString2;
    this.userName = paramString3;
    this.eCL = paramLong1;
    this.hct = paramLong2;
    GMTrace.o(7051128340480L, 52535);
  }
  
  public final long anR()
  {
    GMTrace.i(7051396775936L, 52537);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(this.hct);
    int i = localCalendar.get(1);
    long l = localCalendar.get(2) + i * 100;
    GMTrace.o(7051396775936L, 52537);
    return l;
  }
  
  public final String toString()
  {
    GMTrace.i(7051262558208L, 52536);
    switch (this.type)
    {
    default: 
      GMTrace.o(7051262558208L, 52536);
      return "";
    case 1: 
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "IMG", bg.eL(this.size), this.filePath });
      GMTrace.o(7051262558208L, 52536);
      return str;
    case 3: 
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "VIDEO", bg.eL(this.size), this.filePath });
      GMTrace.o(7051262558208L, 52536);
      return str;
    case 2: 
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "VOICE", bg.eL(this.size), this.filePath });
      GMTrace.o(7051262558208L, 52536);
      return str;
    }
    String str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "ATTACH", bg.eL(this.size), this.filePath });
    GMTrace.o(7051262558208L, 52536);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\clean\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */