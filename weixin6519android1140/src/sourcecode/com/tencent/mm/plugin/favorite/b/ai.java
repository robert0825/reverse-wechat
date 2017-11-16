package com.tencent.mm.plugin.favorite.b;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bds;
import com.tencent.mm.protocal.c.bdt;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public final class ai
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private List<Integer> lcF;
  private a lcG;
  private SparseArray<String> lcH;
  private int scene;
  private String toUser;
  
  public ai(String paramString, List<Integer> paramList, a parama)
  {
    GMTrace.i(6305011990528L, 46976);
    this.fUd = null;
    this.lcG = null;
    this.lcH = new SparseArray();
    b.a locala = new b.a();
    locala.gtF = new bds();
    locala.gtG = new bdt();
    locala.uri = "/cgi-bin/micromsg-bin/sharefav";
    locala.gtE = 608;
    locala.gtH = 246;
    locala.gtI = 1000000246;
    this.fUa = locala.DA();
    this.toUser = paramString;
    this.scene = 2;
    this.lcF = paramList;
    this.lcG = parama;
    GMTrace.o(6305011990528L, 46976);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6305414643712L, 46979);
    bds localbds = (bds)this.fUa.gtC.gtK;
    localbds.uPI = this.toUser;
    localbds.tOG = this.scene;
    localbds.tTH = new LinkedList(this.lcF);
    localbds.jhc = localbds.tTH.size();
    w.d("MicroMsg.NetSceneShareFavItem", "do scene %s %d %s %d", new Object[] { localbds.uPI, Integer.valueOf(localbds.tOG), localbds.tTH, Integer.valueOf(localbds.jhc) });
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6305414643712L, 46979);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6305146208256L, 46977);
    w.d("MicroMsg.NetSceneShareFavItem", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.lcH.clear();
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bdt)((b)paramq).gtD.gtK;
      if (paramq.uua != this.lcF.size()) {
        w.w("MicroMsg.NetSceneShareFavItem", "get url error, request count %d, response count %d", new Object[] { Integer.valueOf(this.lcF.size()), Integer.valueOf(paramq.uua) });
      }
      paramInt1 = 0;
      while ((paramInt1 < paramq.uPJ.size()) && (paramInt1 < this.lcF.size()))
      {
        w.d("MicroMsg.NetSceneShareFavItem", "id[%d] url=%s", new Object[] { this.lcF.get(paramInt1), paramq.uPJ.get(paramInt1) });
        this.lcH.put(((Integer)this.lcF.get(paramInt1)).intValue(), ((azq)paramq.uPJ.get(paramInt1)).uNR);
        paramInt1 += 1;
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    if (this.lcG != null) {
      this.lcG.a(this.lcH);
    }
    GMTrace.o(6305146208256L, 46977);
  }
  
  public final int getType()
  {
    GMTrace.i(6305280425984L, 46978);
    GMTrace.o(6305280425984L, 46978);
    return 608;
  }
  
  public static abstract interface a
  {
    public abstract void a(SparseArray<String> paramSparseArray);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */