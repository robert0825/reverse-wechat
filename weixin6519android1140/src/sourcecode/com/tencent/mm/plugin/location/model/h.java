package com.tencent.mm.plugin.location.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.location.ui.impl.f;
import com.tencent.mm.protocal.c.abw;
import com.tencent.mm.protocal.c.abx;
import com.tencent.mm.protocal.c.ary;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String eAR;
  public int eHz;
  public List<f> ePZ;
  public int errCode;
  public int errType;
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  private Runnable gVd;
  public String hSv;
  public boolean jAg;
  public byte[] mwW;
  public byte[] mwX;
  public String mwY;
  public int mwZ;
  
  public h(byte[] paramArrayOfByte, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, String paramString1, String paramString2)
  {
    GMTrace.i(9635759128576L, 71792);
    this.ePZ = new ArrayList();
    this.mwX = null;
    this.jAg = false;
    this.mwY = "";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new abw();
    ((b.a)localObject).gtG = new abx();
    ((b.a)localObject).gtG = new abx();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getpoilist";
    ((b.a)localObject).gtE = 457;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    abw localabw = (abw)this.fUa.gtC.gtK;
    if (paramArrayOfByte == null) {}
    for (localObject = new azp();; localObject = new azp().be(paramArrayOfByte))
    {
      localabw.urP = ((azp)localObject);
      localabw.unf = paramString2;
      localabw.tWn = paramDouble1;
      localabw.tWm = paramDouble2;
      localabw.tOG = paramInt1;
      localabw.tMX = paramInt2;
      localabw.ust = paramDouble4;
      localabw.uss = paramDouble3;
      localabw.urR = 1;
      this.eHz = localabw.tMX;
      this.mwY = paramString1;
      this.mwW = paramArrayOfByte;
      w.i("MicroMsg.NetSceneGetPoiList", "lat %f lng %f scene %d opcode %d oriLat %f oriLng %f" + paramArrayOfByte, new Object[] { Double.valueOf(paramDouble1), Double.valueOf(paramDouble2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Double.valueOf(paramDouble4), Double.valueOf(paramDouble3) });
      GMTrace.o(9635759128576L, 71792);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9635893346304L, 71793);
    w.d("MicroMsg.NetSceneGetPoiList", "scene done");
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9635893346304L, 71793);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9636161781760L, 71795);
    w.d("MicroMsg.NetSceneGetPoiList", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + "errMsg:" + paramString);
    this.errType = paramInt2;
    this.errCode = paramInt3;
    this.eAR = paramString;
    paramq = (abx)this.fUa.gtD.gtK;
    this.ePZ.clear();
    w.d("MicroMsg.NetSceneGetPoiList", "url " + paramq.urY + " " + paramq.ulE + " " + paramq.lPM + " " + paramq.tXx);
    w.d("MicroMsg.NetSceneGetPoiList", "autoInterval: %d", new Object[] { Integer.valueOf(paramq.urZ) });
    this.hSv = paramq.tXx;
    this.mwZ = paramq.urZ;
    if (paramq.usv != null)
    {
      w.d("MicroMsg.NetSceneGetPoiList", "poi result %d ", new Object[] { Integer.valueOf(paramq.usv.size()) });
      if (paramq.usv.size() > 0) {
        w.d("MicroMsg.NetSceneGetPoiList", "addr %s, province %s, street %s, city %s", new Object[] { ((ary)paramq.usv.get(0)).uHS, ((ary)paramq.usv.get(0)).gCy, ((ary)paramq.usv.get(0)).ufr, ((ary)paramq.usv.get(0)).gCz });
      }
      paramArrayOfByte = paramq.usv.iterator();
      while (paramArrayOfByte.hasNext())
      {
        f localf = new f((ary)paramArrayOfByte.next(), this.hSv);
        this.ePZ.add(localf);
      }
    }
    if (paramq.urP != null) {
      this.mwX = n.a(paramq.urP);
    }
    if (paramq.usw == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.jAg = bool;
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      if (this.gVd != null) {
        this.gVd.run();
      }
      GMTrace.o(9636161781760L, 71795);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(9636027564032L, 71794);
    GMTrace.o(9636027564032L, 71794);
    return 457;
  }
  
  public final boolean isFirst()
  {
    GMTrace.i(18048257884160L, 134470);
    if (this.mwW == null)
    {
      GMTrace.o(18048257884160L, 134470);
      return true;
    }
    GMTrace.o(18048257884160L, 134470);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */