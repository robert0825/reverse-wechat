package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.mb;
import com.tencent.mm.protocal.c.mc;

public final class d
  extends c
{
  public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, long paramLong, String paramString6, String paramString7)
  {
    GMTrace.i(7255273504768L, 54056);
    aBl();
    mb localmb = (mb)this.fUa.gtC.gtK;
    localmb.ucK = paramString1;
    localmb.ucL = paramString2;
    localmb.ucM = paramString3;
    localmb.ucN = paramString4;
    localmb.ucO = paramString5;
    localmb.ucP = paramLong;
    localmb.ucQ = paramString6;
    localmb.ucR = paramString7;
    GMTrace.o(7255273504768L, 54056);
  }
  
  protected final void aBl()
  {
    GMTrace.i(7255005069312L, 54054);
    b.a locala = new b.a();
    locala.gtF = new mb();
    locala.gtG = new mc();
    locala.uri = "/cgi-bin/mmo2o-bin/checkifcallup";
    locala.gtE = 1155;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7255005069312L, 54054);
  }
  
  public final mc aBt()
  {
    GMTrace.i(7255407722496L, 54057);
    mc localmc = (mc)this.fUa.gtD.gtK;
    GMTrace.o(7255407722496L, 54057);
    return localmc;
  }
  
  public final int getType()
  {
    GMTrace.i(15395712925696L, 114707);
    GMTrace.o(15395712925696L, 114707);
    return 1155;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */