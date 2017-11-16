package com.tencent.mm.plugin.backup.c;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.backup.a.f;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.ei;
import com.tencent.mm.protocal.c.ej;
import com.tencent.mm.protocal.c.nu;
import com.tencent.mm.protocal.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public final class e
{
  public f iVp;
  public LinkedList<nu> iYB;
  public String iYC;
  private String iYD;
  private boolean iYE;
  public a iYF;
  public aj iYG;
  final com.tencent.mm.ad.e iYH;
  final com.tencent.mm.ad.e iYI;
  
  public e(a parama, f paramf)
  {
    GMTrace.i(14822066356224L, 110433);
    this.iYD = "";
    this.iYE = false;
    this.iYG = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(14821529485312L, 110429);
        e.this.aeV();
        e.this.iYG.z(5000L, 5000L);
        GMTrace.o(14821529485312L, 110429);
        return true;
      }
    }, true);
    this.iYH = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(14829850984448L, 110491);
        com.tencent.mm.plugin.backup.f.b.b(704, e.this.iYH);
        w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "backup move receive createQrcode response.[%d,%d,%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          w.e("MicroMsg.CheckNetworkGenQrCodeHandler", "create qrcode failed, errMsg:" + paramAnonymousString);
          w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if (paramAnonymousInt2 == -100)
          {
            at.wS().a(1000, e.this.iYI);
            paramAnonymousString = new com.tencent.mm.plugin.backup.d.a(e.this.iYB, e.this.iYC, b.aeH().iXy);
            at.wS().a(paramAnonymousString, 0);
            GMTrace.o(14829850984448L, 110491);
            return;
          }
          e.this.iVp.iVu = -11;
          e.this.iYF.a(e.this.iVp, null);
          GMTrace.o(14829850984448L, 110491);
          return;
        }
        paramAnonymousString = (com.tencent.mm.plugin.backup.d.b)paramAnonymousk;
        paramAnonymousk = (ej)paramAnonymousString.fUa.gtD.gtK;
        b.aeH().iVm = "";
        b.aeH().iVn = paramAnonymousk.tSX;
        b.aeH().iVo = paramAnonymousk.tSY;
        b.aeH().iXy = paramAnonymousk.tSS;
        paramAnonymousString = (ej)paramAnonymousString.fUa.gtD.gtK;
        if (paramAnonymousString == null) {
          paramAnonymousString = null;
        }
        for (;;)
        {
          if (paramAnonymousString != null)
          {
            e.this.iVp.iVu = 51;
            e.this.iYF.a(e.this.iVp, paramAnonymousString);
          }
          GMTrace.o(14829850984448L, 110491);
          return;
          if (paramAnonymousString.tSU == null) {
            paramAnonymousString = null;
          } else {
            paramAnonymousString = paramAnonymousString.tSU.uNP.tJp;
          }
        }
      }
    };
    this.iYI = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(14821932138496L, 110432);
        com.tencent.mm.plugin.backup.f.b.b(1000, e.this.iYI);
        w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "backup move receive createOffilineQrcode response.[%d,%d,%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          w.e("MicroMsg.CheckNetworkGenQrCodeHandler", "create offline qrcode failed, errMsg:" + paramAnonymousString);
          e.this.iVp.iVu = -11;
          e.this.iYF.a(e.this.iVp, null);
          GMTrace.o(14821932138496L, 110432);
          return;
        }
        paramAnonymousk = ((j.b)((com.tencent.mm.plugin.backup.d.a)paramAnonymousk).guL.AZ()).tKh;
        if (paramAnonymousk == null)
        {
          paramAnonymousString = "null";
          w.i("MicroMsg.BackupCreateQRCodeOfflineScene", "onGYNetEnd QRCodeUrl:%s", new Object[] { paramAnonymousString });
          if (paramAnonymousk != null) {
            break label225;
          }
          paramAnonymousString = null;
        }
        for (;;)
        {
          if (paramAnonymousString != null)
          {
            e.this.iVp.iVu = 51;
            e.this.iYF.a(e.this.iVp, paramAnonymousString);
          }
          GMTrace.o(14821932138496L, 110432);
          return;
          paramAnonymousString = paramAnonymousk.tSV;
          break;
          label225:
          if (paramAnonymousk.tSU == null) {
            paramAnonymousString = null;
          } else {
            paramAnonymousString = paramAnonymousk.tSU.uNP.tJp;
          }
        }
      }
    };
    this.iYF = parama;
    this.iVp = paramf;
    GMTrace.o(14822066356224L, 110433);
  }
  
  private boolean aeW()
  {
    GMTrace.i(14822603227136L, 110437);
    this.iYB = new LinkedList();
    PString localPString = new PString();
    PInt localPInt = new PInt();
    this.iYC = h.bY(ab.getContext());
    w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "wifiName :%s", new Object[] { this.iYC });
    if (bg.nm(this.iYC))
    {
      this.iVp.iVu = -4;
      this.iYF.a(this.iVp, null);
      this.iYD = "";
      GMTrace.o(14822603227136L, 110437);
      return false;
    }
    if (!b.aeH().aeI().a(localPString, localPInt))
    {
      this.iVp.iVu = -4;
      this.iYF.a(this.iVp, null);
      this.iYD = "";
      GMTrace.o(14822603227136L, 110437);
      return false;
    }
    w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "server listen result: %s, %d", new Object[] { localPString.value, Integer.valueOf(localPInt.value) });
    nu localnu = new nu();
    localnu.uez = localPString.value;
    localnu.ueA = new LinkedList();
    localnu.ueA.add(Integer.valueOf(localPInt.value));
    this.iYB.add(localnu);
    GMTrace.o(14822603227136L, 110437);
    return true;
  }
  
  public final void aeV()
  {
    GMTrace.i(14822469009408L, 110436);
    Object localObject = h.bY(ab.getContext());
    w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "checkNetStatus newWifiName:%s  preWifiName:%s acc:%b hold:%b", new Object[] { localObject, this.iYD, Boolean.valueOf(at.AU()), Boolean.valueOf(at.wF()) });
    if (!((String)localObject).equals(this.iYD))
    {
      if (!at.AU())
      {
        GMTrace.o(14822469009408L, 110436);
        return;
      }
      this.iYD = ((String)localObject);
      if (!aeW())
      {
        this.iYE = false;
        GMTrace.o(14822469009408L, 110436);
        return;
      }
      this.iYE = false;
      if (!at.wF())
      {
        w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "begin to netscene create QRCode online ");
        at.wS().a(704, this.iYH);
        localObject = new com.tencent.mm.plugin.backup.d.b(this.iYB, this.iYC);
        at.wS().a((k)localObject, 0);
        GMTrace.o(14822469009408L, 110436);
        return;
      }
      w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "begin to netscene create QRCode offline");
      at.wS().a(1000, this.iYI);
      localObject = new com.tencent.mm.plugin.backup.d.a(this.iYB, this.iYC, b.aeH().iXy);
      at.wS().a((k)localObject, 0);
    }
    GMTrace.o(14822469009408L, 110436);
  }
  
  public final void start()
  {
    GMTrace.i(14822200573952L, 110434);
    w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "start check network and gen qrcode handler starting:%b stop:%b .%s %s", new Object[] { Boolean.valueOf(this.iYE), Boolean.valueOf(this.iYG.bQn()), this, bg.bQW() });
    if (this.iYE)
    {
      GMTrace.o(14822200573952L, 110434);
      return;
    }
    this.iYE = true;
    if (aeW())
    {
      this.iYD = null;
      aeV();
    }
    for (;;)
    {
      this.iYG.z(500L, 500L);
      GMTrace.o(14822200573952L, 110434);
      return;
      this.iVp.iVu = -4;
      this.iYF.a(this.iVp, null);
    }
  }
  
  public final void stop()
  {
    GMTrace.i(14822334791680L, 110435);
    w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "stop check network and gen qrcode handler.");
    this.iYE = false;
    at.wS().b(704, this.iYH);
    at.wS().b(1000, this.iYI);
    this.iYG.stopTimer();
    GMTrace.o(14822334791680L, 110435);
  }
  
  public static abstract interface a
  {
    public abstract void a(f paramf, byte[] paramArrayOfByte);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */