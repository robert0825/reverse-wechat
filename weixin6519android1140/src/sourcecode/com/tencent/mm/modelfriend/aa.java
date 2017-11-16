package com.tencent.mm.modelfriend;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.protocal.c.ami;
import com.tencent.mm.protocal.c.aoi;
import com.tencent.mm.protocal.c.blu;
import com.tencent.mm.protocal.c.blv;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class aa
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private int eHJ;
  private com.tencent.mm.ad.e fUd;
  public final List<String> gDI;
  public final List<String> gDJ;
  private final String gDK;
  private int gDL;
  private int gDM;
  
  public aa(List<String> paramList1, List<String> paramList2)
  {
    GMTrace.i(4434553733120L, 33040);
    at.AR();
    this.gDK = ((String)c.xh().get(6, null));
    this.gDM = 0;
    this.gDL = 0;
    this.gDI = paramList1;
    this.gDJ = paramList2;
    this.eHJ = 1;
    GMTrace.o(4434553733120L, 33040);
  }
  
  private static List<String> H(List<ami> paramList)
  {
    GMTrace.i(4435359039488L, 33046);
    ArrayList localArrayList = new ArrayList();
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.i("MicroMsg.NetSceneUploadMContact", "the req emai list is empty");
      GMTrace.o(4435359039488L, 33046);
      return localArrayList;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(((ami)paramList.next()).v);
    }
    GMTrace.o(4435359039488L, 33046);
    return localArrayList;
  }
  
  private static List<String> I(List<aoi> paramList)
  {
    GMTrace.i(4435493257216L, 33047);
    ArrayList localArrayList = new ArrayList();
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.i("MicroMsg.NetSceneUploadMContact", "the req mobile list is empty");
      GMTrace.o(4435493257216L, 33047);
      return localArrayList;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(g.n(a.Fp(((aoi)paramList.next()).v).getBytes()));
    }
    GMTrace.o(4435493257216L, 33047);
    return localArrayList;
  }
  
  public final boolean DE()
  {
    GMTrace.i(4434822168576L, 33042);
    GMTrace.o(4434822168576L, 33042);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    int m = 0;
    GMTrace.i(4434687950848L, 33041);
    this.fUd = parame1;
    if (((this.gDI == null) || (this.gDI.size() == 0)) && ((this.gDJ == null) || (this.gDJ.size() == 0)))
    {
      w.i("MicroMsg.NetSceneUploadMContact", "listMobile or listEmile is null or zero");
      GMTrace.o(4434687950848L, 33041);
      return -1;
    }
    parame1 = new b.a();
    parame1.gtF = new blu();
    parame1.gtG = new blv();
    parame1.uri = "/cgi-bin/micromsg-bin/uploadmcontact";
    parame1.gtE = 133;
    parame1.gtH = 0;
    parame1.gtI = 0;
    parame1 = parame1.DA();
    blu localblu = (blu)parame1.gtC.gtK;
    localblu.tUD = this.gDK;
    localblu.jhi = com.tencent.mm.y.q.zE();
    localblu.tSK = this.eHJ;
    int i = 200;
    Object localObject1 = new LinkedList();
    LinkedList localLinkedList = new LinkedList();
    do
    {
      int k;
      do
      {
        if (i <= 0) {
          break label444;
        }
        int j = i;
        Object localObject2;
        if (this.gDI != null)
        {
          j = i;
          if (this.gDL < this.gDI.size())
          {
            if (this.gDI.get(this.gDL) != null)
            {
              localObject2 = new aoi();
              ((aoi)localObject2).v = ((String)this.gDI.get(this.gDL));
              ((LinkedList)localObject1).add(localObject2);
            }
            this.gDL += 1;
            j = i - 1;
          }
        }
        k = j;
        if (this.gDJ != null)
        {
          k = j;
          if (this.gDM < this.gDJ.size())
          {
            if (this.gDJ.get(this.gDM) != null)
            {
              localObject2 = new ami();
              ((ami)localObject2).v = ((String)this.gDJ.get(this.gDM));
              localLinkedList.add(localObject2);
            }
            this.gDM += 1;
            k = j - 1;
          }
        }
        if (this.gDJ == null) {
          break;
        }
        i = k;
      } while (this.gDM < this.gDJ.size());
      if (this.gDI == null) {
        break;
      }
      i = k;
    } while (this.gDL < this.gDI.size());
    label444:
    localblu.uAR = ((LinkedList)localObject1);
    localblu.uVH = ((LinkedList)localObject1).size();
    localblu.uVJ = localLinkedList;
    localblu.uVI = localLinkedList.size();
    localObject1 = new StringBuilder("doscene in:[");
    if (this.gDJ == null)
    {
      i = 0;
      localObject1 = ((StringBuilder)localObject1).append(i).append(",");
      if (this.gDI != null) {
        break label630;
      }
    }
    label630:
    for (i = m;; i = this.gDI.size())
    {
      w.v("MicroMsg.NetSceneUploadMContact", i + "] index:[" + this.gDM + "," + this.gDL + "] req:[" + localblu.uVJ.size() + "," + localblu.uAR.size() + "]");
      i = a(parame, parame1, this);
      GMTrace.o(4434687950848L, 33041);
      return i;
      i = this.gDJ.size();
      break;
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(4434956386304L, 33043);
    paramq = (blu)((b)paramq).gtC.gtK;
    int i = paramq.uVJ.size() + paramq.uAR.size();
    if ((i == 0) || (i > 200))
    {
      w.e("MicroMsg.NetSceneUploadMContact", "security checked failed : exceed max send count");
      i = k.b.gun;
      GMTrace.o(4434956386304L, 33043);
      return i;
    }
    if ((paramq.tUD == null) || (paramq.tUD.length() <= 0))
    {
      w.e("MicroMsg.NetSceneUploadMContact", "security checked failed : moblie null");
      i = k.b.gun;
      GMTrace.o(4434956386304L, 33043);
      return i;
    }
    if ((paramq.jhi == null) || (paramq.jhi.length() <= 0))
    {
      w.e("MicroMsg.NetSceneUploadMContact", "security checked failed : username null");
      i = k.b.gun;
      GMTrace.o(4434956386304L, 33043);
      return i;
    }
    i = k.b.gum;
    GMTrace.o(4434956386304L, 33043);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4435224821760L, 33045);
    w.i("MicroMsg.NetSceneUploadMContact", "onSceneEnd: errType = " + paramInt2 + " errCode = " + paramInt3 + " errMsg = " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneUploadMContact", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4435224821760L, 33045);
      return;
    }
    paramq = (blu)((b)paramq).gtC.gtK;
    m.F(H(paramq.uVJ));
    m.F(I(paramq.uAR));
    if (((this.gDJ == null) || (this.gDM >= this.gDJ.size())) && ((this.gDI == null) || (this.gDL >= this.gDI.size())))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4435224821760L, 33045);
      return;
    }
    if (a(this.gtW, this.fUd) < 0) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4435224821760L, 33045);
  }
  
  public final int getType()
  {
    GMTrace.i(4435627474944L, 33048);
    GMTrace.o(4435627474944L, 33048);
    return 133;
  }
  
  protected final int vB()
  {
    GMTrace.i(4435090604032L, 33044);
    GMTrace.o(4435090604032L, 33044);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */