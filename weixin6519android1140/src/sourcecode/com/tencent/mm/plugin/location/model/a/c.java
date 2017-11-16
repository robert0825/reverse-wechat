package com.tencent.mm.plugin.location.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aub;
import com.tencent.mm.protocal.c.axy;
import com.tencent.mm.protocal.c.axz;
import com.tencent.mm.protocal.c.bjl;
import com.tencent.mm.protocal.c.bmv;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  private Runnable gVd;
  public String jWP;
  public int myp;
  public bjl myq;
  public List<bmv> myr;
  public axz mys;
  public int myt;
  private String myu;
  
  public c(String paramString, int paramInt1, bmv parambmv, int paramInt2, bjl parambjl)
  {
    GMTrace.i(9638309265408L, 71811);
    this.myq = null;
    this.myr = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new axy();
    ((b.a)localObject).gtG = new axz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/refreshtrackroom";
    ((b.a)localObject).gtE = 492;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (axy)this.fUa.gtC.gtK;
    ((axy)localObject).uif = paramString;
    ((axy)localObject).jib = paramInt1;
    ((axy)localObject).uMu = parambmv;
    ((axy)localObject).lQE = paramInt2;
    ((axy)localObject).uMv = parambjl;
    this.myu = paramString;
    this.myt = ((axy)localObject).jib;
    w.d("MicroMsg.NetSceneRefreshTrackRoom", "userPosiItem " + parambmv.tRz + " " + parambmv.uWX.tWn + " " + parambmv.uWX.tWm + " heading:" + parambmv.uWX.uJv);
    w.d("MicroMsg.NetSceneRefreshTrackRoom", "userPoi " + parambjl.tWn + " " + parambjl.tWm + " " + parambjl.lPi);
    w.d("MicroMsg.NetSceneRefreshTrackRoom", "trackRoomId:" + paramString + " uploadStatus:" + paramInt1);
    GMTrace.o(9638309265408L, 71811);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9638577700864L, 71813);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9638577700864L, 71813);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9638711918592L, 71814);
    this.mys = ((axz)((b)paramq).gtD.gtK);
    if (this.mys != null) {
      this.jWP = this.mys.tYR;
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.myp = this.mys.uzP;
      this.myq = this.mys.uMx;
      this.myr = this.mys.uMw;
      paramq = new StringBuffer();
      paramq.append(String.format("[ resp count %d ] ", new Object[] { Integer.valueOf(this.mys.jhc) }));
      if (this.myq != null) {
        paramq.append(String.format("[ roomPoi  %f %f %s] ", new Object[] { Double.valueOf(this.myq.tWn), Double.valueOf(this.myq.tWm), this.myq.lPi }));
      }
      w.d("MicroMsg.NetSceneRefreshTrackRoom", "onGynetEnd " + paramq.toString());
      paramq = new LinkedList();
      paramArrayOfByte = this.mys.uMw.iterator();
      while (paramArrayOfByte.hasNext())
      {
        bmv localbmv = (bmv)paramArrayOfByte.next();
        if (localbmv == null)
        {
          paramq.add(localbmv);
        }
        else
        {
          if (localbmv.uWX == null) {
            paramq.add(localbmv);
          }
          if ((Math.abs(localbmv.uWX.tWm) > 180.0D) || (Math.abs(localbmv.uWX.tWn) > 90.0D))
          {
            w.w("MicroMsg.NetSceneRefreshTrackRoom", "server lat lng invalid %s %f %f %f", new Object[] { localbmv.tRz, Double.valueOf(localbmv.uWX.tWn), Double.valueOf(localbmv.uWX.tWm), Double.valueOf(localbmv.uWX.uJv) });
            paramq.add(localbmv);
          }
        }
      }
      this.mys.jhc = this.mys.uMw.size();
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.gVd != null) {
      this.gVd.run();
    }
    GMTrace.o(9638711918592L, 71814);
  }
  
  public final int getType()
  {
    GMTrace.i(9638443483136L, 71812);
    GMTrace.o(9638443483136L, 71812);
    return 492;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */