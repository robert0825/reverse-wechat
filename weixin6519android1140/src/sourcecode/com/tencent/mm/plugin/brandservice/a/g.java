package com.tencent.mm.plugin.brandservice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.agt;
import com.tencent.mm.protocal.c.agu;
import com.tencent.mm.protocal.c.axu;
import com.tencent.mm.protocal.c.axv;
import com.tencent.mm.protocal.c.bbb;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private static long jtb;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  static
  {
    GMTrace.i(10843181809664L, 80788);
    jtb = 0L;
    GMTrace.o(10843181809664L, 80788);
  }
  
  public g()
  {
    GMTrace.i(10842376503296L, 80782);
    GMTrace.o(10842376503296L, 80782);
  }
  
  public static boolean aid()
  {
    GMTrace.i(10842510721024L, 80783);
    if (System.currentTimeMillis() - jtb > 3600000L)
    {
      GMTrace.o(10842510721024L, 80783);
      return true;
    }
    GMTrace.o(10842510721024L, 80783);
    return false;
  }
  
  public static LinkedList<axu> aie()
  {
    GMTrace.i(10843047591936L, 80787);
    try
    {
      Object localObject = new StringBuilder();
      at.AR();
      localObject = com.tencent.mm.a.e.d(c.zo() + "search_biz_recommend", 0, Integer.MAX_VALUE);
      if (localObject != null)
      {
        axv localaxv = new axv();
        localaxv.aD((byte[])localObject);
        w.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", "GroupCount2: %d", new Object[] { Integer.valueOf(localaxv.uFY) });
        localObject = localaxv.uMt;
        GMTrace.o(10843047591936L, 80787);
        return (LinkedList<axu>)localObject;
      }
    }
    catch (Exception localException)
    {
      w.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", localException.getMessage());
      w.printErrStackTrace("MicroMsg.BrandService.NetSceneGroupRecommendBiz", localException, "", new Object[0]);
      LinkedList localLinkedList = new LinkedList();
      GMTrace.o(10843047591936L, 80787);
      return localLinkedList;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10842779156480L, 80785);
    jtb = System.currentTimeMillis();
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new agt();
    parame1.gtG = new agu();
    parame1.uri = "/cgi-bin/micromsg-bin/grouprecommendbiz";
    parame1.gtE = 456;
    parame1.gtH = 0;
    parame1.gtI = 0;
    this.fUa = parame1.DA();
    int i = a(parame, this.fUa, this);
    GMTrace.o(10842779156480L, 80785);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10842913374208L, 80786);
    w.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (agu)this.fUa.gtD.gtK;
      if (paramq.uwh.uFY <= 0) {
        break label338;
      }
      w.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", "GroupCount, %d", new Object[] { Integer.valueOf(paramq.uwh.uFY) });
      try
      {
        paramArrayOfByte = paramq.uwh.toByteArray();
        Object localObject = new StringBuilder();
        at.AR();
        com.tencent.mm.a.e.b(c.zo() + "search_biz_recommend", paramArrayOfByte, paramArrayOfByte.length);
        paramq = paramq.uwh.uMt.iterator();
        while (paramq.hasNext())
        {
          paramArrayOfByte = ((axu)paramq.next()).uMs.iterator();
          while (paramArrayOfByte.hasNext())
          {
            localObject = (bbb)paramArrayOfByte.next();
            h localh = new h();
            localh.username = com.tencent.mm.platformtools.n.a(((bbb)localObject).ufy);
            localh.gsU = ((bbb)localObject).ubV;
            localh.gsT = ((bbb)localObject).ubW;
            localh.eQl = -1;
            localh.fiZ = 3;
            localh.bi(true);
            com.tencent.mm.ac.n.Di().a(localh);
          }
        }
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      catch (IOException paramq)
      {
        w.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", paramq.getMessage());
        w.printErrStackTrace("MicroMsg.BrandService.NetSceneGroupRecommendBiz", paramq, "", new Object[0]);
      }
    }
    for (;;)
    {
      GMTrace.o(10842913374208L, 80786);
      return;
      label338:
      paramq = new StringBuilder();
      at.AR();
      com.tencent.mm.loader.stub.b.deleteFile(c.zo() + "search_biz_recommend");
    }
  }
  
  public final int getType()
  {
    GMTrace.i(10842644938752L, 80784);
    GMTrace.o(10842644938752L, 80784);
    return 456;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */