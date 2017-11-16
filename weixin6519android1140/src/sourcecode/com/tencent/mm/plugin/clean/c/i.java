package com.tencent.mm.plugin.clean.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.i.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public final class i
{
  public long eCL;
  public String eIy;
  public String filePath;
  public long hct;
  public List<a> jTu;
  public long size;
  public int type;
  public String userName;
  
  public i()
  {
    GMTrace.i(20559203139584L, 153178);
    this.jTu = new ArrayList();
    GMTrace.o(20559203139584L, 153178);
  }
  
  public final long anR()
  {
    GMTrace.i(20559471575040L, 153180);
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(this.hct);
    int i = localCalendar.get(1);
    long l = localCalendar.get(2) + i * 100;
    GMTrace.o(20559471575040L, 153180);
    return l;
  }
  
  public final String toString()
  {
    GMTrace.i(20559337357312L, 153179);
    switch (this.type)
    {
    default: 
      GMTrace.o(20559337357312L, 153179);
      return "";
    case 1: 
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "IMG", bg.eL(this.size), this.filePath });
      GMTrace.o(20559337357312L, 153179);
      return str;
    case 3: 
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "VIDEO", bg.eL(this.size), this.filePath });
      GMTrace.o(20559337357312L, 153179);
      return str;
    case 2: 
      str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "VOICE", bg.eL(this.size), this.filePath });
      GMTrace.o(20559337357312L, 153179);
      return str;
    }
    String str = String.format("%-8s    %-10s  %s\r\n", new Object[] { "ATTACH", bg.eL(this.size), this.filePath });
    GMTrace.o(20559337357312L, 153179);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */