package com.tencent.mm.plugin.nearlife.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.abj;
import com.tencent.mm.protocal.c.abk;
import com.tencent.mm.protocal.c.alj;
import com.tencent.mm.protocal.c.alk;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static Vector<String> nva;
  public int eHz;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String hSv;
  public int mwZ;
  public String nvb;
  public String nvc;
  public List<a> nvd;
  public boolean nve;
  
  static
  {
    GMTrace.i(12544659947520L, 93465);
    nva = new Vector();
    GMTrace.o(12544659947520L, 93465);
  }
  
  public c(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, String paramString1, String paramString2, azp paramazp, String paramString3, int paramInt5, boolean paramBoolean)
  {
    GMTrace.i(18053358157824L, 134508);
    this.eHz = 0;
    this.nvb = "";
    this.nvc = "";
    this.hSv = "";
    this.nvb = paramString3;
    if ((paramInt1 != 0) && (paramInt1 != 1)) {
      w.e("MicroMsg.NetSceneGetLbsLifeList", "OpCode Error :" + paramInt1);
    }
    this.eHz = paramInt1;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new abj();
    ((b.a)localObject).gtG = new abk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getlbslifelist";
    ((b.a)localObject).gtE = 603;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (abj)this.fUa.gtC.gtK;
    alk localalk = new alk();
    localalk.ujd = paramString2;
    localalk.uje = paramInt4;
    localalk.tYz = paramFloat2;
    localalk.tYy = paramFloat1;
    localalk.ujc = paramString1;
    localalk.ujb = paramInt3;
    ((abj)localObject).ufs = localalk;
    ((abj)localObject).unf = paramString3;
    ((abj)localObject).tOG = paramInt2;
    ((abj)localObject).urQ = paramInt5;
    if (paramazp == null) {}
    for (((abj)localObject).urP = new azp().be(new byte[0]);; ((abj)localObject).urP = paramazp)
    {
      ((abj)localObject).tSK = paramInt1;
      ((abj)localObject).urR = 1;
      this.nve = paramBoolean;
      w.d("MicroMsg.NetSceneGetLbsLifeList", "Req: opcode:" + paramInt1 + " lon:" + paramFloat1 + " lat:" + paramFloat2 + " pre:" + paramInt3 + " gpsSource:" + paramInt4 + " mac" + paramString1 + " cell:" + paramString2 + " scene: " + paramInt2 + " entryTime: " + paramInt5);
      w.d("MicroMsg.NetSceneGetLbsLifeList", "isLoadMore: %s, buf: %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(((abj)localObject).urP.uNN) });
      GMTrace.o(18053358157824L, 134508);
      return;
    }
  }
  
  public static void clear()
  {
    GMTrace.i(12543720423424L, 93458);
    nva.clear();
    GMTrace.o(12543720423424L, 93458);
  }
  
  public static boolean rK(int paramInt)
  {
    GMTrace.i(12543451987968L, 93456);
    String str = String.valueOf(paramInt);
    if (nva.contains(str))
    {
      GMTrace.o(12543451987968L, 93456);
      return false;
    }
    nva.add(str);
    GMTrace.o(12543451987968L, 93456);
    return true;
  }
  
  public static boolean rL(int paramInt)
  {
    GMTrace.i(12543586205696L, 93457);
    nva.remove(String.valueOf(paramInt));
    GMTrace.o(12543586205696L, 93457);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12543988858880L, 93460);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12543988858880L, 93460);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12544257294336L, 93462);
    w.d("MicroMsg.NetSceneGetLbsLifeList", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (abk)((b)paramq).gtD.gtK;
    this.hSv = paramq.tXx;
    this.mwZ = paramq.urZ;
    w.d("MicroMsg.NetSceneGetLbsLifeList", "resp " + paramq.urW + "searchId " + this.hSv);
    if ((paramInt3 == 0) || (paramInt3 == 101)) {}
    for (paramInt1 = 1; (paramInt2 != 0) && (paramInt1 == 0); paramInt1 = 0)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12544257294336L, 93462);
      return;
    }
    w.d("MicroMsg.NetSceneGetLbsLifeList", "continueFlag %d lifeCount %d linkCount %d %s", new Object[] { Integer.valueOf(paramq.tXv), Integer.valueOf(paramq.urW), Integer.valueOf(paramq.urU), paramq.urY });
    this.nvc = bg.aq(paramq.urY, "");
    this.nvd = new ArrayList();
    paramArrayOfByte = paramq.urX.iterator();
    Object localObject;
    while (paramArrayOfByte.hasNext())
    {
      localObject = (alj)paramArrayOfByte.next();
      localObject = new a(paramq.tXx, (alj)localObject);
      this.nvd.add(localObject);
    }
    if (paramq.urW > 0)
    {
      paramArrayOfByte = (alj)paramq.urX.get(0);
      paramq = new StringBuffer();
      paramq.append(" Bid " + paramArrayOfByte.nuO);
      paramq.append(" title " + paramArrayOfByte.eBt);
      paramq.append(" link " + paramArrayOfByte.nuV);
      paramq.append(" price " + paramArrayOfByte.nuP);
      paramq.append(" rate " + paramArrayOfByte.nuU);
      paramq.append(" type " + paramArrayOfByte.jib);
      paramq.append(" desc : ");
      paramArrayOfByte = paramArrayOfByte.nuT.iterator();
      while (paramArrayOfByte.hasNext())
      {
        localObject = (azq)paramArrayOfByte.next();
        paramq.append(((azq)localObject).uNR + "-");
      }
      w.d("MicroMsg.NetSceneGetLbsLifeList", "resp one %s ", new Object[] { paramq.toString() });
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12544257294336L, 93462);
  }
  
  public final azp aTN()
  {
    GMTrace.i(12544391512064L, 93463);
    azp localazp = ((abk)this.fUa.gtD.gtK).urP;
    if (localazp == null)
    {
      localazp = new azp().be(new byte[0]);
      GMTrace.o(12544391512064L, 93463);
      return localazp;
    }
    GMTrace.o(12544391512064L, 93463);
    return localazp;
  }
  
  public final int aTO()
  {
    GMTrace.i(12544525729792L, 93464);
    int i = ((abk)this.fUa.gtD.gtK).tXv;
    GMTrace.o(12544525729792L, 93464);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(12544123076608L, 93461);
    GMTrace.o(12544123076608L, 93461);
    return 603;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearlife\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */