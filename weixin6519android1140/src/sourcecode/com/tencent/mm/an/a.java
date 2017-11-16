package com.tencent.mm.an;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.gf;
import com.tencent.mm.protocal.c.gg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static int gFT;
  public static int gFU;
  public static int gFV;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private int gFW;
  private String gFX;
  private int gFY;
  
  static
  {
    GMTrace.i(1530216316928L, 11401);
    gFT = 0;
    gFU = 1;
    gFV = -85;
    GMTrace.o(1530216316928L, 11401);
  }
  
  public a(int paramInt1, String paramString, int paramInt2)
  {
    GMTrace.i(1529679446016L, 11397);
    this.gFW = -1;
    this.gFY = 0;
    switch (1.gFZ[(paramInt1 - 1)])
    {
    }
    for (;;)
    {
      this.gFX = paramString;
      this.gFY = paramInt2;
      paramString = new b.a();
      paramString.gtF = new gf();
      paramString.gtG = new gg();
      paramString.uri = "/cgi-bin/micromsg-bin/bindgooglecontact";
      paramString.gtE = 487;
      paramString.gtH = 0;
      paramString.gtI = 0;
      this.fUa = paramString.DA();
      GMTrace.o(1529679446016L, 11397);
      return;
      this.gFW = 1;
      continue;
      this.gFW = 2;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1529813663744L, 11398);
    w.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "doScene");
    this.fUd = parame1;
    parame1 = (gf)this.fUa.gtC.gtK;
    parame1.tSK = this.gFW;
    parame1.tUq = this.gFX;
    parame1.tUr = this.gFY;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1529813663744L, 11398);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1529947881472L, 11399);
    w.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(1529947881472L, 11399);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1529947881472L, 11399);
  }
  
  public final int getType()
  {
    GMTrace.i(1530082099200L, 11400);
    GMTrace.o(1530082099200L, 11400);
    return 487;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(1530484752384L, 11403);
      gGa = 1;
      gGb = 2;
      gGc = new int[] { gGa, gGb };
      GMTrace.o(1530484752384L, 11403);
    }
    
    public static int[] IA()
    {
      GMTrace.i(1530350534656L, 11402);
      int[] arrayOfInt = (int[])gGc.clone();
      GMTrace.o(1530350534656L, 11402);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\an\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */