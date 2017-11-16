package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.mq;
import com.tencent.mm.protocal.c.mr;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static int gTJ;
  public static int gTK;
  public static int gTL;
  public static int gTM;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  static
  {
    GMTrace.i(1340298231808L, 9986);
    gTJ = 1;
    gTK = 2;
    gTL = 3;
    gTM = 4;
    GMTrace.o(1340298231808L, 9986);
  }
  
  public h(int paramInt)
  {
    GMTrace.i(1339492925440L, 9980);
    b.a locala = new b.a();
    locala.gtF = new mq();
    locala.gtG = new mr();
    locala.uri = "/cgi-bin/micromsg-bin/checkunbind";
    locala.gtE = 254;
    locala.gtH = 131;
    locala.gtI = 1000000131;
    this.fUa = locala.DA();
    ((mq)this.fUa.gtC.gtK).udt = paramInt;
    GMTrace.o(1339492925440L, 9980);
  }
  
  public final String La()
  {
    GMTrace.i(1339761360896L, 9982);
    try
    {
      String str = ((mr)this.fUa.gtD.gtK).udu;
      w.d("MicroMsg.NetSceneCheckUnBind", "getRandomPasswd() " + str);
      GMTrace.o(1339761360896L, 9982);
      return str;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.NetSceneCheckUnBind", localException, "", new Object[0]);
      GMTrace.o(1339761360896L, 9982);
    }
    return null;
  }
  
  public final mr Lb()
  {
    GMTrace.i(1340029796352L, 9984);
    mr localmr = (mr)this.fUa.gtD.gtK;
    GMTrace.o(1340029796352L, 9984);
    return localmr;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1339627143168L, 9981);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1339627143168L, 9981);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1340164014080L, 9985);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1340164014080L, 9985);
  }
  
  public final int getType()
  {
    GMTrace.i(1339895578624L, 9983);
    GMTrace.o(1339895578624L, 9983);
    return 254;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */