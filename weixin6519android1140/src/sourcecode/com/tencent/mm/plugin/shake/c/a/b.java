package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.protocal.c.abh;
import com.tencent.mm.protocal.c.abi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public e oMQ;
  
  public b(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(6517612871680L, 48560);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new abh();
    ((b.a)localObject).gtG = new abi();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/getlbscard";
    ((b.a)localObject).gtE = 1251;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (abh)this.fUa.gtC.gtK;
    ((abh)localObject).eMl = paramFloat2;
    ((abh)localObject).eNR = paramFloat1;
    GMTrace.o(6517612871680L, 48560);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6517881307136L, 48562);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6517881307136L, 48562);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6518015524864L, 48563);
    w.i("MicroMsg.NetSceneGetLbsCard", "onGYNetEnd, getType = 1251" + " errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (abi)this.fUa.gtD.gtK;
      if (paramq == null) {
        break label856;
      }
      paramInt1 = (int)(System.currentTimeMillis() / 1000L);
      if (paramq.urH) {
        break label121;
      }
      w.e("MicroMsg.NetSceneGetLbsCard", "getlbscard have_card is false, no card , don't handle");
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6518015524864L, 48563);
      return;
      label121:
      if (paramq.urL <= paramInt1)
      {
        w.e("MicroMsg.NetSceneGetLbsCard", "getlbscard entrance_endtime: " + paramq.urL + " is <= currentTime:" + paramInt1 + " , don't handle");
      }
      else if (TextUtils.isEmpty(paramq.jxF))
      {
        w.e("MicroMsg.NetSceneGetLbsCard", "getlbscard card_tp_id is empty , don't handle");
      }
      else
      {
        w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard have_card is true");
        if (paramq.urI)
        {
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard have_red_dot is true");
          label215:
          this.oMQ = new e();
          this.oMQ.jzr = 1;
          this.oMQ.jxF = paramq.jxF;
          this.oMQ.eTK = paramq.eTK;
          this.oMQ.title = paramq.title;
          this.oMQ.jxI = paramq.jxI;
          this.oMQ.jxJ = paramq.jxJ;
          this.oMQ.jyT = paramq.jyT;
          this.oMQ.jxH = paramq.jxH;
          this.oMQ.gjg = paramq.gjg;
          this.oMQ.oMR = 0;
          this.oMQ.oMU = paramq.oMU;
          this.oMQ.oMV = paramq.oMV;
          this.oMQ.oMW = paramq.oMW;
          this.oMQ.oMX = paramq.oMX;
          this.oMQ.oMY = "";
          this.oMQ.jxM = paramq.jxM;
          this.oMQ.oMZ = paramq.oMZ;
          this.oMQ.oNa = paramq.oNa;
          m.bfq().oMT = this.oMQ.oMY;
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard entrance_endtime: " + paramq.urL + " is <= currentTime:" + paramInt1);
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard activity_type: " + paramq.urN);
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vpK, Integer.valueOf(paramInt1));
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vpL, Integer.valueOf(paramq.urL));
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vpM, paramq.urO);
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vpP, paramq.urM);
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vpQ, Integer.valueOf(paramq.urN));
          paramArrayOfByte = com.tencent.mm.plugin.shake.c.c.a.bfG();
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard msg reddotid is " + paramq.urJ);
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard pre reddotid is " + paramArrayOfByte);
          if (TextUtils.isEmpty(paramq.urJ)) {
            w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard resp.red_dot_id is empty");
          }
          if (!TextUtils.isEmpty(paramArrayOfByte)) {
            break label762;
          }
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard pre_red_dot_id is empty, resp.red_dot_id is not empty");
          com.tencent.mm.s.c.vK().l(262155, true);
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vpU, paramq.urJ);
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vpV, paramq.urK);
        }
        for (;;)
        {
          g.ork.A(11721, paramq.jxF);
          break;
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard have_red_dot is false");
          break label215;
          label762:
          if (!paramArrayOfByte.equals(paramq.urJ))
          {
            w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard redDotId and msg.reddotid is not empty, but no equals");
            com.tencent.mm.s.c.vK().l(262155, true);
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vpU, paramq.urJ);
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vpV, paramq.urK);
          }
          else if (paramArrayOfByte.equals(paramq.urJ))
          {
            w.i("MicroMsg.NetSceneGetLbsCard", "redDotId equals msg.reddotid");
          }
        }
        label856:
        w.e("MicroMsg.NetSceneGetLbsCard", "getlbscard resp is null");
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(6517747089408L, 48561);
    GMTrace.o(6517747089408L, 48561);
    return 1251;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\c\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */