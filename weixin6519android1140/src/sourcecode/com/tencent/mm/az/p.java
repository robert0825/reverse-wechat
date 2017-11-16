package com.tencent.mm.az;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class p
{
  private static p gSh;
  public int gSf;
  public a gSg;
  
  static
  {
    GMTrace.i(16672526172160L, 124220);
    gSh = new p();
    GMTrace.o(16672526172160L, 124220);
  }
  
  private p()
  {
    GMTrace.i(16672123518976L, 124217);
    this.gSf = -1;
    at.AR();
    this.gSf = ((Integer)c.xh().get(w.a.vyM, Integer.valueOf(-1))).intValue();
    at.AR();
    Object localObject = (String)c.xh().get(w.a.vyN, "");
    this.gSg = new a();
    a locala = this.gSg;
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      localObject = ((String)localObject).split("_");
      locala.gSi = bg.Sy(localObject[0]);
      locala.gSj = bg.Sy(localObject[1]);
      locala.gSk = bg.Sz(localObject[2]);
      locala.gSl = bg.Sy(localObject[3]);
    }
    GMTrace.o(16672123518976L, 124217);
  }
  
  public static p KH()
  {
    GMTrace.i(16671989301248L, 124216);
    p localp = gSh;
    GMTrace.o(16671989301248L, 124216);
    return localp;
  }
  
  public final void save()
  {
    GMTrace.i(16672257736704L, 124218);
    at.AR();
    c.xh().a(w.a.vyN, this.gSg.KI());
    at.AR();
    c.xh().a(w.a.vyM, Integer.valueOf(this.gSf));
    GMTrace.o(16672257736704L, 124218);
  }
  
  public final boolean valid()
  {
    GMTrace.i(16672391954432L, 124219);
    if (this.gSg != null)
    {
      a locala = this.gSg;
      if (((locala.gSi != 1) || (locala.gSj != 0)) && (locala.gSl <= e.GL()))
      {
        i = 1;
        if (i == 0) {
          break label93;
        }
        locala = this.gSg;
        if (System.currentTimeMillis() <= locala.gSk) {
          break label88;
        }
      }
      label88:
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label93;
        }
        GMTrace.o(16672391954432L, 124219);
        return true;
        i = 0;
        break;
      }
    }
    label93:
    GMTrace.o(16672391954432L, 124219);
    return false;
  }
  
  private final class a
  {
    public int gSi;
    public int gSj;
    public long gSk;
    public int gSl;
    
    public a()
    {
      GMTrace.i(16671183994880L, 124210);
      GMTrace.o(16671183994880L, 124210);
    }
    
    public final String KI()
    {
      GMTrace.i(16671318212608L, 124211);
      String str = this.gSi + "_" + this.gSj + "_" + this.gSk + "_" + this.gSl;
      GMTrace.o(16671318212608L, 124211);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\az\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */