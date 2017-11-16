package com.tencent.mm.plugin.record.a;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bjm;
import com.tencent.mm.protocal.c.fu;
import com.tencent.mm.protocal.c.fv;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.f.a;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private int lci;
  private int lcm;
  String ogR;
  k ogS;
  private SparseArray<th> ogT;
  private SparseBooleanArray ogU;
  
  public a(k paramk)
  {
    GMTrace.i(7499147116544L, 55873);
    this.fUd = null;
    this.ogR = "";
    this.ogS = null;
    this.ogT = new SparseArray();
    this.ogU = new SparseBooleanArray();
    this.lcm = 0;
    this.lci = 0;
    b.a locala = new b.a();
    locala.gtF = new fu();
    locala.gtG = new fv();
    locala.uri = "/cgi-bin/micromsg-bin/batchtranscdnitem";
    locala.gtE = 632;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.ogS = paramk;
    GMTrace.o(7499147116544L, 55873);
  }
  
  private void baE()
  {
    GMTrace.i(7499281334272L, 55874);
    this.ogR = f.a.a(m.a(this.ogS.field_title, this.ogS.field_desc, this.ogS.field_dataProto), null, null);
    GMTrace.o(7499281334272L, 55874);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7499683987456L, 55877);
    this.fUd = parame1;
    parame1 = (fu)this.fUa.gtC.gtK;
    this.ogT.clear();
    this.ogU.clear();
    if (this.ogS.field_dataProto.ulB.size() == 0)
    {
      w.e("MicroMsg.NetSceneTransCDN", "doScene data list null");
      this.lcm = -100;
      GMTrace.o(7499683987456L, 55877);
      return -100;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = this.lci;
    th localth;
    for (;;)
    {
      if (i < this.ogS.field_dataProto.ulB.size())
      {
        localth = (th)this.ogS.field_dataProto.ulB.get(i);
        if ((this.ogS.field_type == 14) && (localth.aGU == 3))
        {
          w.w("MicroMsg.NetSceneTransCDN", "match voice type, clear cdn info");
          localth.Ql("");
          localth.Qk("");
          localth.Qj("");
          localth.Qi("");
          i += 1;
        }
        else
        {
          if ((!localth.ujL) || (!bg.nm(localth.ujt))) {
            break;
          }
        }
      }
    }
    for (int j = 0;; j = 1)
    {
      this.lci = (i + 1);
      parame1.jhc = localLinkedList.size();
      parame1.jhd.clear();
      parame1.jhd.addAll(localLinkedList);
      w.i("MicroMsg.NetSceneTransCDN", "ashutest::data list size %d, need check size %d, nextIndex %d", new Object[] { Integer.valueOf(this.ogS.field_dataProto.ulB.size()), Integer.valueOf(this.ogT.size()), Integer.valueOf(this.lci) });
      if ((parame1.jhc > 0) && (j != 0)) {
        break label729;
      }
      baE();
      w.w("MicroMsg.NetSceneTransCDN", "doScene no more data");
      this.lcm = -100;
      GMTrace.o(7499683987456L, 55877);
      return -100;
      bjm localbjm;
      if (!bg.nm(localth.ujt))
      {
        localbjm = new bjm();
        localbjm.tYJ = localth.ujt;
        localbjm.ugB = localth.ujv;
        localbjm.uUz = localth.aGU;
        localbjm.uUA = ((int)localth.ujO);
        localbjm.uUy = bg.aq(localth.lhq, "").hashCode();
        w.d("MicroMsg.NetSceneTransCDN", "add cdnitem, clientID[%d] dataID[%s] datatype[%d] dataurl[%s] size[%d]", new Object[] { Integer.valueOf(localbjm.uUy), localth.lhq, Integer.valueOf(localbjm.uUz), localth.ujt, Long.valueOf(localth.ujO) });
        localLinkedList.add(localbjm);
        this.ogT.put(localbjm.uUy, localth);
        this.ogU.put(localbjm.uUy, false);
      }
      if (!bg.nm(localth.giD))
      {
        localbjm = new bjm();
        localbjm.tYJ = localth.giD;
        localbjm.ugB = localth.ujp;
        localbjm.uUz = 2;
        localbjm.uUA = ((int)localth.ujZ);
        localbjm.uUy = (bg.aq(localth.lhq, "") + "@thumb").hashCode();
        w.d("MicroMsg.NetSceneTransCDN", "add cdnitem, clientID[%d] thumbID[%s_t] datatype[%d] thumburl[%s] size[%d]", new Object[] { Integer.valueOf(localbjm.uUy), localth.lhq, Integer.valueOf(localbjm.uUz), localth.giD, Long.valueOf(localth.ujZ) });
        localLinkedList.add(localbjm);
        this.ogT.put(localbjm.uUy, localth);
        this.ogU.put(localbjm.uUy, true);
      }
      if (localLinkedList.size() < 20) {
        break;
      }
    }
    label729:
    i = a(parame, this.fUa, this);
    GMTrace.o(7499683987456L, 55877);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(7499818205184L, 55878);
    int i = k.b.gum;
    GMTrace.o(7499818205184L, 55878);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7499415552000L, 55875);
    w.i("MicroMsg.NetSceneTransCDN", "netId %d errType %d errCode %d localErrCode %d begIndex %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.lcm), Integer.valueOf(this.lci), paramString });
    if ((paramInt2 == 3) && (this.lcm == -100))
    {
      baE();
      this.fUd.a(0, 0, paramString, this);
      GMTrace.o(7499415552000L, 55875);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7499415552000L, 55875);
      return;
    }
    paramq = ((fv)((b)paramq).gtD.gtK).jhd.iterator();
    while (paramq.hasNext())
    {
      paramArrayOfByte = (bjm)paramq.next();
      th localth = (th)this.ogT.get(paramArrayOfByte.uUy);
      if (localth != null) {
        if (this.ogU.get(paramArrayOfByte.uUy))
        {
          w.i("MicroMsg.NetSceneTransCDN", "trans end, client id[%d], dataId[%s], isThumb[true], old thumb url[%s], new thumb url[%s], old size[%d], new size[%d]", new Object[] { Integer.valueOf(paramArrayOfByte.uUy), localth.lhq, localth.giD, paramArrayOfByte.tYJ, Long.valueOf(localth.ujZ), Long.valueOf(paramArrayOfByte.uUA) });
          localth.Qi(paramArrayOfByte.tYJ);
          localth.Qj(paramArrayOfByte.ugB);
          if ((!bg.nm(paramArrayOfByte.tYJ)) && (!bg.nm(paramArrayOfByte.ugB)) && (paramArrayOfByte.uUA > 0L))
          {
            localth.ez(paramArrayOfByte.uUA);
          }
          else
          {
            w.w("MicroMsg.NetSceneTransCDN", "match error server return");
            paramInt2 = 3;
          }
        }
        else
        {
          w.i("MicroMsg.NetSceneTransCDN", "trans end, client id[%d], dataId[%s], isThumb[false], old url[%s], new url[%s], old size[%d], new size[%d]", new Object[] { Integer.valueOf(paramArrayOfByte.uUy), localth.lhq, localth.ujt, paramArrayOfByte.tYJ, Long.valueOf(localth.ujO), Long.valueOf(paramArrayOfByte.uUA) });
          localth.Qk(paramArrayOfByte.tYJ);
          localth.Ql(paramArrayOfByte.ugB);
          if ((!bg.nm(paramArrayOfByte.tYJ)) && (!bg.nm(paramArrayOfByte.ugB)) && (paramArrayOfByte.uUA > 0L))
          {
            localth.ey(paramArrayOfByte.uUA);
          }
          else
          {
            w.w("MicroMsg.NetSceneTransCDN", "match error server return");
            paramInt2 = 3;
          }
        }
      }
    }
    boolean bool;
    if (this.lci < this.ogS.field_dataProto.ulB.size())
    {
      bool = true;
      w.i("MicroMsg.NetSceneTransCDN", "check need continue, indexOK %B", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        break label643;
      }
      if (a(this.gtW, this.fUd) != -100) {
        break label638;
      }
      paramInt1 = 1;
    }
    for (;;)
    {
      if (paramInt1 != 0)
      {
        w.i("MicroMsg.NetSceneTransCDN", "do callback");
        baE();
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(7499415552000L, 55875);
      return;
      bool = false;
      break;
      label638:
      paramInt1 = 0;
      continue;
      label643:
      paramInt1 = 1;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7499549769728L, 55876);
    GMTrace.o(7499549769728L, 55876);
    return 632;
  }
  
  protected final int vB()
  {
    GMTrace.i(7499952422912L, 55879);
    GMTrace.o(7499952422912L, 55879);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\record\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */