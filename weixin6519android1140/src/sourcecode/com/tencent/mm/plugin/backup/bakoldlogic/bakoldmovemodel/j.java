package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.ei;
import com.tencent.mm.protocal.c.nu;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.j.b;
import com.tencent.mm.protocal.k.a;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public com.tencent.mm.network.q guL;
  
  public j(LinkedList<nu> paramLinkedList, String paramString)
  {
    GMTrace.i(14743280549888L, 109846);
    this.guL = new a();
    final com.tencent.mm.protocal.j.a locala = (com.tencent.mm.protocal.j.a)this.guL.DC();
    locala.tKg = com.tencent.mm.plugin.backup.a.e.aem();
    locala.tKf.tSN = paramLinkedList.size();
    locala.tKf.tSO = paramLinkedList;
    locala.tKf.tSP = p.getDeviceID(ab.getContext());
    locala.tKf.tSQ = com.tencent.mm.y.q.zE();
    locala.tKf.tOG = 2;
    locala.tKf.jhw = 0L;
    locala.tKf.tSR = paramString;
    locala.tKf.tSS = a.afV().jdI;
    locala.tKp = locala.tKg;
    locala.tKo = new k.a()
    {
      public final boolean a(PByteArray paramAnonymousPByteArray, int paramAnonymousInt1, byte[] paramAnonymousArrayOfByte1, byte[] paramAnonymousArrayOfByte2, int paramAnonymousInt2)
      {
        GMTrace.i(14752004702208L, 109911);
        long l = locala.tKi;
        if ((b.bPq()) && (l == 0L)) {
          l = d.tJB;
        }
        for (;;)
        {
          ac localac = locala.tKq;
          if (paramAnonymousInt1 == 1000)
          {
            byte[] arrayOfByte = locala.tKp;
            w.d("MicroMsg.NetSceneBakChatCreateQRCodeOffline", "BakMove key:" + arrayOfByte);
            if (!localac.bOr()) {
              arrayOfByte = new byte[0];
            }
            if (bg.bq(arrayOfByte))
            {
              w.e("MicroMsg.NetSceneBakChatCreateQRCodeOffline", "dksession jType %d session should not null", new Object[] { Integer.valueOf(paramAnonymousInt1) });
              GMTrace.o(14752004702208L, 109911);
              return false;
            }
            if (MMProtocalJni.pack(locala.Ba(), paramAnonymousPByteArray, arrayOfByte, paramAnonymousArrayOfByte1, locala.tKl, (int)l, 1000, localac.ver, localac.tLb.getBytes(), localac.tLc.getBytes(), paramAnonymousArrayOfByte2, paramAnonymousInt2))
            {
              w.d("MicroMsg.NetSceneBakChatCreateQRCodeOffline", "reqToBuf using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(paramAnonymousPByteArray.value.length), Integer.valueOf(paramAnonymousInt2) });
              GMTrace.o(14752004702208L, 109911);
              return true;
            }
          }
          GMTrace.o(14752004702208L, 109911);
          return false;
        }
      }
    };
    GMTrace.o(14743280549888L, 109846);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(14743414767616L, 109847);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(14743414767616L, 109847);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(14743548985344L, 109848);
    w.i("MicroMsg.NetSceneBakChatCreateQRCodeOffline", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(14743548985344L, 109848);
      return;
    }
    w.i("MicroMsg.NetSceneBakChatCreateQRCodeOffline", "onGYNetEnd QRCodeUrl:%s", new Object[] { ((j.b)paramq.AZ()).tKh.tSV });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(14743548985344L, 109848);
  }
  
  public final int getType()
  {
    GMTrace.i(14743683203072L, 109849);
    GMTrace.o(14743683203072L, 109849);
    return 1000;
  }
  
  public static final class a
    extends i
  {
    private final com.tencent.mm.protocal.j.a iYM;
    private final j.b iYN;
    
    public a()
    {
      GMTrace.i(14754957492224L, 109933);
      this.iYM = new com.tencent.mm.protocal.j.a();
      this.iYN = new j.b();
      GMTrace.o(14754957492224L, 109933);
    }
    
    protected final k.d AY()
    {
      GMTrace.i(14755091709952L, 109934);
      com.tencent.mm.protocal.j.a locala = this.iYM;
      GMTrace.o(14755091709952L, 109934);
      return locala;
    }
    
    public final k.e AZ()
    {
      GMTrace.i(14755225927680L, 109935);
      j.b localb = this.iYN;
      GMTrace.o(14755225927680L, 109935);
      return localb;
    }
    
    public final int Dz()
    {
      GMTrace.i(14755628580864L, 109938);
      GMTrace.o(14755628580864L, 109938);
      return 1;
    }
    
    public final int getType()
    {
      GMTrace.i(14755360145408L, 109936);
      GMTrace.o(14755360145408L, 109936);
      return 1000;
    }
    
    public final String getUri()
    {
      GMTrace.i(14755494363136L, 109937);
      GMTrace.o(14755494363136L, 109937);
      return "/cgi-bin/micromsg-bin/bakchatcreateqrcodeoffline";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmovemodel\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */