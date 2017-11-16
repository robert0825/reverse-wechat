package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.modelsimple.m;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.afd;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.au;
import com.tencent.mm.y.ay.a;
import com.tencent.mm.y.ay.b;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.e fUd;
  private final q guL;
  private int gup;
  String jQv;
  
  public e(String paramString)
  {
    GMTrace.i(12502381363200L, 93150);
    this.jQv = "";
    this.gup = 2;
    this.guL = new b();
    ay.a locala = (ay.a)this.guL.DC();
    locala.gnA.jhi = paramString;
    locala.gnA.uuP = 1;
    w.i("MicroMsg.NetSceneGetVoiceprintTicketRsa", "sceneType %d %s", new Object[] { Integer.valueOf(1), paramString });
    GMTrace.o(12502381363200L, 93150);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12502515580928L, 93151);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(12502515580928L, 93151);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(12502784016384L, 93153);
    int i = k.b.gum;
    GMTrace.o(12502784016384L, 93153);
    return i;
  }
  
  public final void a(final int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12503186669568L, 93156);
    paramArrayOfByte = (ay.b)paramq.AZ();
    this.jQv = paramArrayOfByte.gnB.uuQ;
    w.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " mTicket: " + this.jQv);
    if ((paramInt2 == 4) && (paramInt3 == 65235))
    {
      au.a(true, paramArrayOfByte.gnB.tUT, paramArrayOfByte.gnB.tUU, paramArrayOfByte.gnB.tUS);
      this.gup -= 1;
      if (this.gup <= 0)
      {
        w.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "reach redirect limit, invoke callback");
        this.fUd.a(3, -1, "", this);
        GMTrace.o(12503186669568L, 93156);
        return;
      }
      w.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "redirect IDC");
      a(this.gtW, this.fUd);
      GMTrace.o(12503186669568L, 93156);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.DC().tKq.ver;
      w.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12490972856320L, 93065);
          new m().a(e.this.gtW, new com.tencent.mm.ad.e()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
            {
              GMTrace.i(12488691154944L, 93048);
              w.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramAnonymous2k.getType()), Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
              if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0))
              {
                e.this.fUd.a(paramAnonymous2Int1, paramAnonymous2Int2, "", e.this);
                GMTrace.o(12488691154944L, 93048);
                return;
              }
              e.this.a(e.this.gtW, e.this.fUd);
              GMTrace.o(12488691154944L, 93048);
            }
          });
          GMTrace.o(12490972856320L, 93065);
        }
      });
      GMTrace.o(12503186669568L, 93156);
      return;
    }
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12503186669568L, 93156);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12503186669568L, 93156);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(12502918234112L, 93154);
    GMTrace.o(12502918234112L, 93154);
  }
  
  public final int getType()
  {
    GMTrace.i(12503052451840L, 93155);
    GMTrace.o(12503052451840L, 93155);
    return 618;
  }
  
  protected final int vB()
  {
    GMTrace.i(12502649798656L, 93152);
    GMTrace.o(12502649798656L, 93152);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */