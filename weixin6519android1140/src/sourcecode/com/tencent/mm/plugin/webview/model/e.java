package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.modeltools.f;
import com.tencent.mm.protocal.c.aim;
import com.tencent.mm.protocal.c.aks;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e
{
  public int rEb;
  public int rEc;
  public int rEd;
  public final List<aks> rEe;
  public int rEf;
  public long rEg;
  
  public e()
  {
    GMTrace.i(12011412914176L, 89492);
    this.rEb = 20480;
    this.rEc = 30720;
    this.rEd = 51200;
    this.rEe = new LinkedList();
    this.rEf = 0;
    this.rEg = 0L;
    GMTrace.o(12011412914176L, 89492);
  }
  
  public static void bS(List<aim> paramList)
  {
    GMTrace.i(12011547131904L, 89493);
    if (bg.cc(paramList))
    {
      GMTrace.o(12011547131904L, 89493);
      return;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      aim localaim = (aim)paramList.next();
      d locald = f.bCY();
      int i = localaim.uxP;
      long l1 = bg.Pu();
      long l2 = localaim.uxQ;
      locald.rDZ.s(Integer.valueOf(i), Long.valueOf(l1 + l2));
    }
    f.bCY().bCc();
    GMTrace.o(12011547131904L, 89493);
  }
  
  private static final class a
  {
    public static final e rEh;
    
    static
    {
      GMTrace.i(12002554544128L, 89426);
      rEh = new e();
      GMTrace.o(12002554544128L, 89426);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */