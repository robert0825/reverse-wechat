package com.tencent.mm.plugin.address.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.af.d;
import com.tencent.mm.af.f;
import com.tencent.mm.g.a.mb;
import com.tencent.mm.g.a.mb.a;
import com.tencent.mm.plugin.address.d.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public final class k
  extends c<mb>
  implements com.tencent.mm.ad.e
{
  private mb hup;
  private d huq;
  
  public k()
  {
    GMTrace.i(12786654511104L, 95268);
    this.vhf = mb.class.getName().hashCode();
    GMTrace.o(12786654511104L, 95268);
  }
  
  private boolean a(mb parammb)
  {
    GMTrace.i(12786788728832L, 95269);
    if ((parammb instanceof mb))
    {
      this.hup = parammb;
      at.wS().a(417, this);
      parammb = new e(this.hup.eQL.url, this.hup.eQL.appId, 1);
      at.wS().a(parammb, 0);
    }
    GMTrace.o(12786788728832L, 95269);
    return true;
  }
  
  private void q(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(12787057164288L, 95271);
    w.d("MicroMsg.RcptGetAddrEventListener", "setResult errCode[%s], isAccept[%s]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    this.hup.eQM.errCode = paramInt;
    if (paramInt != 0) {
      this.hup.eQM.eQN = false;
    }
    for (;;)
    {
      if (this.hup.eDO != null) {
        this.hup.eDO.run();
      }
      at.wS().b(417, this);
      GMTrace.o(12787057164288L, 95271);
      return;
      Object localObject;
      if (!paramBoolean)
      {
        localObject = this.huq;
        if (localObject != null)
        {
          ((d)localObject).field_brandFlag &= 0xFFFFFFF7;
          f.g((d)localObject);
        }
        this.hup.eQM.eQN = false;
      }
      else
      {
        localObject = this.huq;
        if (localObject != null)
        {
          ((d)localObject).field_brandFlag |= 0x8;
          f.g((d)localObject);
        }
        this.hup.eQM.eQN = true;
        com.tencent.mm.plugin.address.a.a.QM();
        localObject = com.tencent.mm.plugin.address.a.a.QO().hut;
        if (((com.tencent.mm.plugin.address.d.a)localObject).huB.size() > 0)
        {
          localObject = (b)((com.tencent.mm.plugin.address.d.a)localObject).huB.getFirst();
          this.hup.eQM.eQO = ((b)localObject).huK;
          this.hup.eQM.userName = ((b)localObject).huI;
          this.hup.eQM.eQP = ((b)localObject).huJ;
          this.hup.eQM.eQQ = ((b)localObject).huG;
          this.hup.eQM.eQR = ((b)localObject).huD;
          this.hup.eQM.eQS = ((b)localObject).huE;
          this.hup.eQM.eQT = ((b)localObject).huF;
          this.hup.eQM.eQU = ((b)localObject).huH;
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(12786922946560L, 95270);
    w.d("MicroMsg.RcptGetAddrEventListener", "onSceneEnd errType[%s], errCode[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramk instanceof e))
    {
      if (paramInt2 == 0)
      {
        q(paramInt2, true);
        GMTrace.o(12786922946560L, 95270);
        return;
      }
      q(paramInt2, false);
    }
    GMTrace.o(12786922946560L, 95270);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */