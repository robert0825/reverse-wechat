package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aua;
import com.tencent.mm.protocal.c.azy;
import com.tencent.mm.protocal.c.azz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Map;

public final class aa
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public long eDr;
  public int errCode;
  public int errType;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  private final long gVc;
  private Runnable gVd;
  
  public aa(float paramFloat1, float paramFloat2, long paramLong)
  {
    GMTrace.i(1355464835072L, 10099);
    this.gVc = 60000L;
    this.eDr = -1L;
    aua localaua = new aua();
    localaua.tYy = paramFloat1;
    localaua.tYz = paramFloat2;
    localaua.uje = 1;
    localaua.ujb = 0;
    a(localaua, 1, -10000.0F, -10000.0F);
    this.eDr = paramLong;
    GMTrace.o(1355464835072L, 10099);
  }
  
  public aa(aua paramaua, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(1355733270528L, 10101);
    this.gVc = 60000L;
    this.eDr = -1L;
    a(paramaua, 0, paramFloat1, paramFloat2);
    GMTrace.o(1355733270528L, 10101);
  }
  
  public aa(azy paramazy)
  {
    GMTrace.i(1355599052800L, 10100);
    this.gVc = 60000L;
    this.eDr = -1L;
    b.a locala = new b.a();
    locala.gtF = paramazy;
    locala.gtG = new azz();
    locala.uri = "/cgi-bin/micromsg-bin/scanstreetview";
    locala.gtE = 424;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(1355599052800L, 10100);
  }
  
  private void a(aua paramaua, int paramInt, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(1355867488256L, 10102);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new azy();
    ((b.a)localObject).gtG = new azz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/scanstreetview";
    ((b.a)localObject).gtE = 424;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (azy)this.fUa.gtC.gtK;
    ((azy)localObject).uNX = paramaua;
    ((azy)localObject).tOG = paramInt;
    ((azy)localObject).uNY = paramFloat1;
    ((azy)localObject).uNZ = paramFloat2;
    GMTrace.o(1355867488256L, 10102);
  }
  
  public static String lr(String paramString)
  {
    GMTrace.i(1356941230080L, 10110);
    paramString = bh.q(paramString, "streetview");
    if (paramString == null)
    {
      GMTrace.o(1356941230080L, 10110);
      return null;
    }
    paramString = (String)paramString.get(".streetview.link");
    GMTrace.o(1356941230080L, 10110);
    return paramString;
  }
  
  public final azz LJ()
  {
    GMTrace.i(1356270141440L, 10105);
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      azz localazz = (azz)this.fUa.gtD.gtK;
      GMTrace.o(1356270141440L, 10105);
      return localazz;
    }
    GMTrace.o(1356270141440L, 10105);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1356001705984L, 10103);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1356001705984L, 10103);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(1356135923712L, 10104);
    if (((azy)((b)paramq).gtC.gtK).uNX == null)
    {
      w.e("MicroMsg.NetSceneScanStreetView", "req.rImpl.UserPos == null");
      i = k.b.gun;
      GMTrace.o(1356135923712L, 10104);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(1356135923712L, 10104);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1356672794624L, 10108);
    w.d("MicroMsg.NetSceneScanStreetView", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.errType = paramInt2;
    this.errCode = paramInt3;
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    for (;;)
    {
      w.d("MicroMsg.NetSceneScanStreetView", "xml is %s", new Object[] { LJ().tWx });
      if (this.gVd != null) {
        this.gVd.run();
      }
      GMTrace.o(1356672794624L, 10108);
      return;
      w.e("MicroMsg.NetSceneScanStreetView", "callback null");
    }
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(1356538576896L, 10107);
    GMTrace.o(1356538576896L, 10107);
  }
  
  public final int getType()
  {
    GMTrace.i(1356807012352L, 10109);
    GMTrace.o(1356807012352L, 10109);
    return 424;
  }
  
  protected final int vB()
  {
    GMTrace.i(1356404359168L, 10106);
    GMTrace.o(1356404359168L, 10106);
    return 10;
  }
  
  public static final class a
  {
    public String desc;
    public String gVe;
    public String gVf;
    public int type;
    
    public a()
    {
      GMTrace.i(1347680206848L, 10041);
      this.type = 5;
      this.gVe = "";
      this.desc = "";
      this.gVf = "";
      GMTrace.o(1347680206848L, 10041);
    }
  }
  
  public static final class b
  {
    public String desc;
    public LinkedList<aa.a> gVg;
    public String title;
    
    public b()
    {
      GMTrace.i(1367410212864L, 10188);
      GMTrace.o(1367410212864L, 10188);
    }
    
    public static LinkedList<aa.a> e(Map<String, String> paramMap, String paramString)
    {
      GMTrace.i(1367544430592L, 10189);
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      while (i < 1000)
      {
        Object localObject2 = new StringBuilder().append(paramString).append(".action");
        if (i > 0) {}
        for (Object localObject1 = Integer.valueOf(i);; localObject1 = "")
        {
          localObject1 = localObject1;
          try
          {
            int j = Integer.valueOf((String)paramMap.get((String)localObject1 + ".$type")).intValue();
            localObject2 = new aa.a();
            if (j != 5) {
              break;
            }
            ((aa.a)localObject2).gVe = bg.nl((String)paramMap.get((String)localObject1 + ".iconurl"));
            ((aa.a)localObject2).desc = bg.nl((String)paramMap.get((String)localObject1 + ".desc"));
            ((aa.a)localObject2).gVf = bg.nl((String)paramMap.get((String)localObject1 + ".link"));
            if ((!bg.nm(((aa.a)localObject2).gVe)) || (!bg.nm(((aa.a)localObject2).desc)) || (!bg.nm(((aa.a)localObject2).gVf))) {
              break label329;
            }
            GMTrace.o(1367544430592L, 10189);
            return localLinkedList;
          }
          catch (Exception paramMap)
          {
            w.w("MicroMsg.NetSceneScanStreetView", "parseVendorsFromXml() " + paramMap.getMessage());
            GMTrace.o(1367544430592L, 10189);
            return localLinkedList;
          }
        }
        GMTrace.o(1367544430592L, 10189);
        return localLinkedList;
        label329:
        localLinkedList.add(localObject2);
        i += 1;
      }
      GMTrace.o(1367544430592L, 10189);
      return localLinkedList;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelsimple\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */