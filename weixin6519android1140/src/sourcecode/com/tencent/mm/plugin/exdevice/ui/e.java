package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.f.b.a.d;

final class e
{
  int Zc;
  d kLW;
  int kLX;
  
  public e(int paramInt1, int paramInt2, String paramString1, String paramString2, d paramd)
  {
    GMTrace.i(11103966855168L, 82731);
    this.Zc = paramInt1;
    this.kLX = paramInt2;
    if (paramInt1 != 0)
    {
      if (paramd != null)
      {
        this.kLW = paramd;
        GMTrace.o(11103966855168L, 82731);
        return;
      }
      paramd = new d();
      paramd.field_username = paramString2;
      paramd.field_appusername = paramString1;
      paramd.field_ranknum = 0;
      paramd.field_selfLikeState = 0;
      paramd.field_rankID = "";
      paramd.field_likecount = 0;
      paramd.field_score = 0;
      this.kLW = paramd;
    }
    GMTrace.o(11103966855168L, 82731);
  }
  
  public final String toString()
  {
    GMTrace.i(11104101072896L, 82732);
    String str = "{ view type: " + this.Zc + " display flag: " + this.kLX;
    if (this.kLW != null) {}
    for (str = str + this.kLW.toString();; str = str + " mExdeviceRankInfo is null")
    {
      str = str + "}";
      GMTrace.o(11104101072896L, 82732);
      return str;
    }
  }
  
  static final class a
  {
    int Zc;
    String kJb;
    d kLW;
    int kLX;
    String username;
    
    public a()
    {
      GMTrace.i(11040750305280L, 82260);
      this.kLW = null;
      GMTrace.o(11040750305280L, 82260);
    }
    
    public final e ave()
    {
      GMTrace.i(11040884523008L, 82261);
      e locale = new e(this.Zc, this.kLX, this.kJb, this.username, this.kLW);
      GMTrace.o(11040884523008L, 82261);
      return locale;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */