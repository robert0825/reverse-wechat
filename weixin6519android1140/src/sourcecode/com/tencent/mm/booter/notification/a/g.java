package com.tencent.mm.booter.notification.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;

public final class g
{
  public int fLA;
  public int fLB;
  public boolean fLC;
  private int fLD;
  private int fLE;
  public boolean fLF;
  public boolean fLG;
  public b fLs;
  public c fLt;
  public d fLu;
  public h fLv;
  private f fLw;
  public a fLx;
  public int fLy;
  public int fLz;
  public Context mContext;
  
  public g(Context paramContext)
  {
    GMTrace.i(524791316480L, 3910);
    this.fLD = -1;
    this.fLE = -1;
    this.mContext = paramContext;
    this.fLs = new b();
    this.fLt = new c();
    this.fLu = new d();
    this.fLv = new h();
    this.fLx = new a();
    this.fLw = f.a.fLr;
    GMTrace.o(524791316480L, 3910);
  }
  
  public static String a(long[] paramArrayOfLong)
  {
    GMTrace.i(525059751936L, 3912);
    if (paramArrayOfLong == null)
    {
      GMTrace.o(525059751936L, 3912);
      return null;
    }
    String str = "";
    int j = paramArrayOfLong.length;
    int i = 0;
    while (i < j)
    {
      long l = paramArrayOfLong[i];
      str = str + String.valueOf(l) + ",";
      i += 1;
    }
    if (str.isEmpty())
    {
      GMTrace.o(525059751936L, 3912);
      return str;
    }
    paramArrayOfLong = str.substring(0, str.length() - 1);
    GMTrace.o(525059751936L, 3912);
    return paramArrayOfLong;
  }
  
  public final void dD(String paramString)
  {
    GMTrace.i(524925534208L, 3911);
    this.fLw.dC(paramString);
    GMTrace.o(524925534208L, 3911);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */