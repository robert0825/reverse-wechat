package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.agz;
import com.tencent.mm.protocal.c.aha;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.w;

public final class r
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eEs;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  String kzW;
  
  public r(String paramString1, String paramString2, String paramString3, int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(10987734302720L, 81865);
    this.fUd = null;
    this.fUa = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new agz();
    ((b.a)localObject).gtG = new aha();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/harddeviceauth";
    ((b.a)localObject).gtE = 541;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (agz)this.fUa.gtC.gtK;
    agx localagx = new agx();
    localagx.tSz = paramString2;
    localagx.jhl = paramString3;
    ((agz)localObject).tUt = localagx;
    ((agz)localObject).uwu = paramInt;
    ((agz)localObject).uwv = new azp().be(paramArrayOfByte);
    this.kzW = paramString3;
    this.eEs = paramString1;
    GMTrace.o(10987734302720L, 81865);
  }
  
  private byte[] atM()
  {
    GMTrace.i(10988539609088L, 81871);
    Object localObject = (aha)this.fUa.gtD.gtK;
    try
    {
      localObject = ((aha)localObject).uww.uNP.tJp;
      GMTrace.o(10988539609088L, 81871);
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", localException, "", new Object[0]);
      GMTrace.o(10988539609088L, 81871);
    }
    return null;
  }
  
  private byte[] wR()
  {
    GMTrace.i(10988271173632L, 81869);
    Object localObject = (aha)this.fUa.gtD.gtK;
    try
    {
      localObject = ((aha)localObject).tSa.uNP.tJp;
      GMTrace.o(10988271173632L, 81869);
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", localException, "", new Object[0]);
      GMTrace.o(10988271173632L, 81869);
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10988136955904L, 81868);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10988136955904L, 81868);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10987868520448L, 81866);
    w.i("MicroMsg.exdevice.NetSceneHardDeviceAuth", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    paramq = ad.atR().wT(this.kzW);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      Object localObject = (aha)this.fUa.gtD.gtK;
      if (paramq != null)
      {
        paramArrayOfByte = atL();
        if (paramArrayOfByte != null) {
          paramq.field_authBuf = paramArrayOfByte;
        }
        paramq.fsC = ((aha)localObject).uwz;
        paramq.fso = true;
        paramq.fsB = ((aha)localObject).uwy;
        paramq.fso = true;
        localObject = wR();
        if (localObject != null)
        {
          u.aus().a(paramq.field_mac, (byte[])localObject, 2);
          if (u.aut().kxo != null) {
            u.aut().kxo.setChannelSessionKey(paramq.field_mac, (byte[])localObject);
          }
          paramq.field_sessionKey = ((byte[])localObject);
        }
        localObject = atM();
        if (localObject != null)
        {
          u.aus().a(paramq.field_mac, (byte[])localObject, 3);
          paramq.field_sessionBuf = ((byte[])localObject);
        }
        localObject = atL();
        if (paramArrayOfByte != null)
        {
          u.aus().a(paramq.field_mac, (byte[])localObject, 1);
          paramq.field_authBuf = paramArrayOfByte;
        }
        paramq.fsD = (System.currentTimeMillis() / 1000L);
        paramq.fso = true;
        if (2 == u.aus().bG(paramq.field_mac))
        {
          ad.auc();
          e.b(this.eEs, paramq.field_url, 2, paramq.field_deviceID);
        }
        u.aus().bJ(paramq.field_mac);
        w.i("MicroMsg.exdevice.NetSceneHardDeviceAuth", "update local device auth infos = %b", new Object[] { Boolean.valueOf(ad.atR().c(paramq, new String[0])) });
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(10987868520448L, 81866);
      return;
      w.e("MicroMsg.exdevice.NetSceneHardDeviceAuth", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceIdServer == null");
      continue;
      if (paramq != null)
      {
        u.aus().bK(paramq.field_mac);
        ad.auc();
        e.b(this.eEs, paramq.field_url, 4, paramq.field_deviceID);
      }
      ad.auc();
      e.aR(this.eEs, 3);
    }
  }
  
  public final byte[] atL()
  {
    GMTrace.i(10988405391360L, 81870);
    Object localObject = (aha)this.fUa.gtD.gtK;
    try
    {
      localObject = ((aha)localObject).uwx.uNP.tJp;
      GMTrace.o(10988405391360L, 81870);
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", localException, "", new Object[0]);
      GMTrace.o(10988405391360L, 81870);
    }
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(10988002738176L, 81867);
    GMTrace.o(10988002738176L, 81867);
    return 541;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */