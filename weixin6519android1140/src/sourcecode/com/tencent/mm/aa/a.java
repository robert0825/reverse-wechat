package com.tencent.mm.aa;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.gd;
import com.tencent.mm.protocal.c.ge;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static int gqU;
  public static int gqV;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  static
  {
    GMTrace.i(310579822592L, 2314);
    gqU = 1;
    gqV = 2;
    GMTrace.o(310579822592L, 2314);
  }
  
  public a(int paramInt, String paramString)
  {
    GMTrace.i(309908733952L, 2309);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new gd();
    ((b.a)localObject).gtG = new ge();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindemail";
    ((b.a)localObject).gtE = 256;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (gd)this.fUa.gtC.gtK;
    ((gd)localObject).tMX = paramInt;
    ((gd)localObject).tUp = paramString;
    GMTrace.o(309908733952L, 2309);
  }
  
  public final int CD()
  {
    GMTrace.i(310311387136L, 2312);
    int i = ((gd)this.fUa.gtC.gtK).tMX;
    GMTrace.o(310311387136L, 2312);
    return i;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(310042951680L, 2310);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(310042951680L, 2310);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(310445604864L, 2313);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(310445604864L, 2313);
  }
  
  public final int getType()
  {
    GMTrace.i(310177169408L, 2311);
    GMTrace.o(310177169408L, 2311);
    return 256;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\aa\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */