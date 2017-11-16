package com.tencent.mm.plugin.backup.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.ei;
import com.tencent.mm.protocal.c.nu;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.j.a;
import com.tencent.mm.protocal.j.b;
import com.tencent.mm.protocal.k.a;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public com.tencent.mm.network.q guL;
  
  public a(LinkedList<nu> paramLinkedList, String paramString1, String paramString2)
  {
    GMTrace.i(14845688676352L, 110609);
    this.guL = new a();
    final j.a locala = (j.a)this.guL.DC();
    locala.tKg = com.tencent.mm.plugin.backup.a.e.aem();
    locala.tKf.tSN = paramLinkedList.size();
    locala.tKf.tSO = paramLinkedList;
    locala.tKf.tSP = p.getDeviceID(ab.getContext());
    locala.tKf.tSQ = com.tencent.mm.y.q.zE();
    locala.tKf.tOG = 2;
    locala.tKf.jhw = 0L;
    locala.tKf.tSR = paramString1;
    locala.tKf.tSS = paramString2;
    locala.tKp = locala.tKg;
    locala.tKo = new k.a()
    {
      public final boolean a(PByteArray paramAnonymousPByteArray, int paramAnonymousInt1, byte[] paramAnonymousArrayOfByte1, byte[] paramAnonymousArrayOfByte2, int paramAnonymousInt2)
      {
        GMTrace.i(16145855807488L, 120296);
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
            w.d("MicroMsg.BackupCreateQRCodeOfflineScene", "BakMove key:" + arrayOfByte);
            if (!localac.bOr()) {
              arrayOfByte = new byte[0];
            }
            if (bg.bq(arrayOfByte))
            {
              w.e("MicroMsg.BackupCreateQRCodeOfflineScene", "dksession jType %d session should not null", new Object[] { Integer.valueOf(paramAnonymousInt1) });
              GMTrace.o(16145855807488L, 120296);
              return false;
            }
            if (MMProtocalJni.pack(locala.Ba(), paramAnonymousPByteArray, arrayOfByte, paramAnonymousArrayOfByte1, locala.tKl, (int)l, 1000, localac.ver, localac.tLb.getBytes(), localac.tLc.getBytes(), paramAnonymousArrayOfByte2, paramAnonymousInt2))
            {
              w.d("MicroMsg.BackupCreateQRCodeOfflineScene", "reqToBuf using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(paramAnonymousPByteArray.value.length), Integer.valueOf(paramAnonymousInt2) });
              GMTrace.o(16145855807488L, 120296);
              return true;
            }
          }
          GMTrace.o(16145855807488L, 120296);
          return false;
        }
      }
    };
    GMTrace.o(14845688676352L, 110609);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9574287409152L, 71334);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(9574287409152L, 71334);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9574421626880L, 71335);
    w.i("MicroMsg.BackupCreateQRCodeOfflineScene", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9574421626880L, 71335);
      return;
    }
    w.i("MicroMsg.BackupCreateQRCodeOfflineScene", "onGYNetEnd QRCodeUrl:%s", new Object[] { ((j.b)paramq.AZ()).tKh.tSV });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9574421626880L, 71335);
  }
  
  public final int getType()
  {
    GMTrace.i(9574555844608L, 71336);
    GMTrace.o(9574555844608L, 71336);
    return 1000;
  }
  
  public static final class a
    extends i
  {
    private final j.a iYM;
    private final j.b iYN;
    
    public a()
    {
      GMTrace.i(9575226933248L, 71341);
      this.iYM = new j.a();
      this.iYN = new j.b();
      GMTrace.o(9575226933248L, 71341);
    }
    
    protected final k.d AY()
    {
      GMTrace.i(9575361150976L, 71342);
      j.a locala = this.iYM;
      GMTrace.o(9575361150976L, 71342);
      return locala;
    }
    
    public final k.e AZ()
    {
      GMTrace.i(9575495368704L, 71343);
      j.b localb = this.iYN;
      GMTrace.o(9575495368704L, 71343);
      return localb;
    }
    
    public final int Dz()
    {
      GMTrace.i(9575898021888L, 71346);
      GMTrace.o(9575898021888L, 71346);
      return 1;
    }
    
    public final int getType()
    {
      GMTrace.i(9575629586432L, 71344);
      GMTrace.o(9575629586432L, 71344);
      return 1000;
    }
    
    public final String getUri()
    {
      GMTrace.i(9575763804160L, 71345);
      GMTrace.o(9575763804160L, 71345);
      return "/cgi-bin/micromsg-bin/bakchatcreateqrcodeoffline";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */