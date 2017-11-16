package com.tencent.mm.plugin.shake.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.af.x;
import com.tencent.mm.g.b.af;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bdd;
import com.tencent.mm.protocal.c.bde;
import com.tencent.mm.protocal.c.bdf;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.g;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private String jBl;
  List<d> oMh;
  private int oMi;
  int ret;
  
  public a(byte[] paramArrayOfByte)
  {
    GMTrace.i(6516673347584L, 48553);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bde();
    ((b.a)localObject).gtG = new bdf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/shakeget";
    ((b.a)localObject).gtE = 162;
    ((b.a)localObject).gtH = 57;
    ((b.a)localObject).gtI = 1000000057;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bde)this.fUa.gtC.gtK;
    ((bde)localObject).tTe = new azp().be(paramArrayOfByte);
    ((bde)localObject).uPj = 1;
    ((bde)localObject).uAI = new azp().be(com.tencent.mm.plugin.normsg.a.d.nxJ.aUq());
    GMTrace.o(6516673347584L, 48553);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6516807565312L, 48554);
    w.d("MicroMsg.NetSceneShakeGet", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6516807565312L, 48554);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6517076000768L, 48556);
    w.d("MicroMsg.NetSceneShakeGet", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (bdf)this.fUa.gtD.gtK;
    this.oMh = new LinkedList();
    this.oMi = paramq.uPl;
    this.ret = paramq.tST;
    this.jBl = paramq.nIo;
    int i = paramq.jhc;
    w.d("MicroMsg.NetSceneShakeGet", "size:" + i);
    at.AR();
    paramArrayOfByte = c.yK();
    if (i > 0)
    {
      e locale = m.bfk();
      locale.bfc();
      w.i("MicroMsg.NewShakeItemStorage", "delOldRecord count:" + i);
      Object localObject1 = new StringBuilder("DELETE FROM shakeitem1 WHERE shakeItemID NOT IN ( SELECT shakeItemID FROM shakeitem1 ORDER BY shakeItemID DESC LIMIT ");
      label255:
      Object localObject2;
      boolean bool;
      if (100 > i)
      {
        paramInt1 = 100 - i;
        localObject1 = paramInt1 + " )";
        if (locale.fTZ.eZ("shakeitem1", (String)localObject1))
        {
          w.i("MicroMsg.NewShakeItemStorage", "delOldRecord success count:" + i);
          locale.doNotify();
        }
        paramInt1 = i - 1;
        if (paramInt1 < 0) {
          break label790;
        }
        if (!com.tencent.mm.y.q.zE().equals(((bdd)paramq.uPk.get(paramInt1)).jhi))
        {
          localObject1 = x.FG().iC(((bdd)paramq.uPk.get(paramInt1)).jhi);
          ((com.tencent.mm.af.d)localObject1).field_username = ((bdd)paramq.uPk.get(paramInt1)).jhi;
          ((com.tencent.mm.af.d)localObject1).field_brandList = ((bdd)paramq.uPk.get(paramInt1)).gCH;
          localObject2 = ((bdd)paramq.uPk.get(paramInt1)).uAC;
          if (localObject2 != null)
          {
            ((com.tencent.mm.af.d)localObject1).field_brandFlag = ((oo)localObject2).gCL;
            ((com.tencent.mm.af.d)localObject1).field_brandInfo = ((oo)localObject2).gCN;
            ((com.tencent.mm.af.d)localObject1).field_brandIconURL = ((oo)localObject2).gCO;
            ((com.tencent.mm.af.d)localObject1).field_extInfo = ((oo)localObject2).gCM;
          }
          if (!x.FG().e((com.tencent.mm.af.d)localObject1)) {
            x.FG().d((com.tencent.mm.af.d)localObject1);
          }
        }
        localObject1 = new d((bdd)paramq.uPk.get(paramInt1));
        localObject2 = new h();
        ((h)localObject2).username = ((d)localObject1).field_username;
        if (((d)localObject1).field_hasHDImg <= 0) {
          break label778;
        }
        bool = true;
        label479:
        ((h)localObject2).bi(bool);
        ((h)localObject2).fiZ = ((d)localObject1).field_imgstatus;
        ((h)localObject2).gsU = ((bdd)paramq.uPk.get(paramInt1)).ubV;
        ((h)localObject2).gsT = ((bdd)paramq.uPk.get(paramInt1)).ubW;
        n.Di().a((h)localObject2);
        ((h)localObject2).eQl = -1;
        w.d("MicroMsg.NetSceneShakeGet", "dkhurl search %s b[%s] s[%s]", new Object[] { ((h)localObject2).getUsername(), ((h)localObject2).Do(), ((h)localObject2).Dp() });
        if (!paramArrayOfByte.TA(((d)localObject1).field_username)) {
          break label784;
        }
      }
      label778:
      label784:
      for (i = 1;; i = 0)
      {
        ((d)localObject1).field_reserved2 = i;
        localObject2 = paramArrayOfByte.TE(((d)localObject1).field_username);
        if ((localObject2 != null) && ((int)((com.tencent.mm.l.a)localObject2).fTq > 0))
        {
          locale.Gn(((af)localObject2).field_username);
          locale.Gn(((af)localObject2).field_encryptUsername);
        }
        locale.a((d)localObject1, false);
        at.AR();
        c.zu().t(((d)localObject1).field_username, this.oMi, ((bdd)paramq.uPk.get(paramInt1)).uoe);
        ((d)localObject1).scene = this.oMi;
        this.oMh.add(localObject1);
        w.v("MicroMsg.NetSceneShakeGet", "item info: " + ((d)localObject1).field_username + " " + ((d)localObject1).field_nickname);
        paramInt1 -= 1;
        break label255;
        paramInt1 = 0;
        break;
        bool = false;
        break label479;
      }
    }
    label790:
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6517076000768L, 48556);
  }
  
  public final int getType()
  {
    GMTrace.i(6516941783040L, 48555);
    GMTrace.o(6516941783040L, 48555);
    return 162;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */