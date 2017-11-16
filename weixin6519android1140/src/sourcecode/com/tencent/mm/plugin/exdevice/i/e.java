package com.tencent.mm.plugin.exdevice.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.bp;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.model.r;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class e
  extends ae
  implements com.tencent.mm.ad.e
{
  private d kDP;
  private com.tencent.mm.plugin.exdevice.b.b kDQ;
  private a kDR;
  private m kxo;
  private int mErrorCode;
  
  public e(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    GMTrace.i(11122623119360L, 82870);
    this.kDQ = null;
    this.kDQ = new com.tencent.mm.plugin.exdevice.b.b(paramLong, paramInt2, paramInt3, paramArrayOfByte);
    this.mErrorCode = paramInt1;
    GMTrace.o(11122623119360L, 82870);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11122757337088L, 82871);
    at.wS().b(541, this);
    w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "onscen end, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramk = (r)paramk;
    com.tencent.mm.plugin.exdevice.h.b localb = ad.atR().wS(this.kDQ.joF);
    if (localb == null)
    {
      w.e("MicroMsg.exdevice.MMAuthTaskExcuter", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
      GMTrace.o(11122757337088L, 82871);
      return;
    }
    long l = localb.fsC;
    if (System.currentTimeMillis() / 1000L < l)
    {
      w.e("MicroMsg.exdevice.MMAuthTaskExcuter", "device has been blocked");
      this.kDQ.a(-5, "", new byte[0]);
      this.kDR = new a(this.kDQ, this.kDP);
      w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(this.kDR.b(this.kxo)) });
      GMTrace.o(11122757337088L, 82871);
      return;
    }
    this.kDQ.a(paramInt2, paramString, paramk.atL());
    this.kDR = new a(this.kDQ, this.kDP);
    w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(this.kDR.b(this.kxo)) });
    GMTrace.o(11122757337088L, 82871);
  }
  
  public final boolean a(m paramm, d paramd)
  {
    GMTrace.i(11122891554816L, 82872);
    boolean bool;
    if ((-5 == this.mErrorCode) || (-3 == this.mErrorCode) || (-4 == this.mErrorCode))
    {
      w.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Error Code = %d, reply errorcode to device and close channel", new Object[] { Integer.valueOf(this.mErrorCode) });
      this.kDQ.a(-1, "", new byte[0]);
      this.kDR = new a(this.kDQ, paramd);
      bool = this.kDR.b(paramm);
      w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(11122891554816L, 82872);
      return bool;
    }
    com.tencent.mm.plugin.exdevice.h.b localb = ad.atR().wS(this.kDQ.joF);
    if (localb == null)
    {
      w.e("MicroMsg.exdevice.MMAuthTaskExcuter", "get device info failed : %d", new Object[] { Long.valueOf(this.kDQ.joF) });
      GMTrace.o(11122891554816L, 82872);
      return false;
    }
    com.tencent.mm.plugin.exdevice.e.a locala = (com.tencent.mm.plugin.exdevice.e.a)this.kDQ.atq();
    if (locala == null)
    {
      w.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Auth Request parse failed!!!, Tell device before stop this task");
      this.kDQ.a(-4, "", new byte[0]);
      this.kDR = new a(this.kDQ, paramd);
      bool = this.kDR.b(paramm);
      w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(11122891554816L, 82872);
      return bool;
    }
    byte[] arrayOfByte1;
    long l;
    label415:
    byte[] arrayOfByte2;
    if (locala.kBd == 2)
    {
      if (locala.kBf != null)
      {
        arrayOfByte1 = locala.kBf.tJp;
        if (!bg.bq(arrayOfByte1)) {
          break label415;
        }
      }
      for (l = -1L; l != this.kDQ.joF; l = com.tencent.mm.plugin.exdevice.j.b.am(tmp423_421))
      {
        w.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Auth Request parse fail!!!, Invalid MacAddress");
        this.kDQ.a(-1, "", new byte[0]);
        this.kDR = new a(this.kDQ, paramd);
        bool = this.kDR.b(paramm);
        w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
        GMTrace.o(11122891554816L, 82872);
        return bool;
        arrayOfByte2 = new byte[8];
        byte[] tmp423_421 = arrayOfByte2;
        tmp423_421[0] = 0;
        byte[] tmp428_423 = tmp423_421;
        tmp428_423[1] = 0;
        byte[] tmp433_428 = tmp428_423;
        tmp433_428[2] = 0;
        byte[] tmp438_433 = tmp433_428;
        tmp438_433[3] = 0;
        byte[] tmp443_438 = tmp438_433;
        tmp443_438[4] = 0;
        byte[] tmp448_443 = tmp443_438;
        tmp448_443[5] = 0;
        byte[] tmp453_448 = tmp448_443;
        tmp453_448[6] = 0;
        byte[] tmp459_453 = tmp453_448;
        tmp459_453[7] = 0;
        tmp459_453;
        System.arraycopy(arrayOfByte1, 0, tmp423_421, 2, 6);
      }
    }
    if ((locala.kBd == 1) || (locala.kBd == 1))
    {
      if ((locala.kBa == null) || (!com.tencent.mm.plugin.exdevice.j.b.a(locala.kBa.tJp, 0, g.o((localb.field_deviceType + localb.field_deviceID).getBytes()))))
      {
        w.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Auth Request parse fail!!!, Invalid Md5DeviceTypeAndDeviceId");
        this.kDQ.a(-1, "", new byte[0]);
        this.kDR = new a(this.kDQ, paramd);
        bool = this.kDR.b(paramm);
        w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
        GMTrace.o(11122891554816L, 82872);
        return bool;
      }
    }
    else
    {
      w.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Auth Request parse fail!!!, Invalid AuthMethod");
      this.kDQ.a(-8, "", new byte[0]);
      this.kDR = new a(this.kDQ, paramd);
      bool = this.kDR.b(paramm);
      w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(11122891554816L, 82872);
      return bool;
    }
    if (localb != null)
    {
      l = localb.fsC;
      if (System.currentTimeMillis() / 1000L < l)
      {
        w.e("MicroMsg.exdevice.MMAuthTaskExcuter", "device has been blocked");
        this.kDQ.a(-5, "", new byte[0]);
        this.kDR = new a(this.kDQ, paramd);
        bool = this.kDR.b(paramm);
        w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
        GMTrace.o(11122891554816L, 82872);
        return bool;
      }
      l = localb.fsD;
      int i = localb.fsB;
      if ((i + l > 0L) && (l + i < System.currentTimeMillis() / 1000L))
      {
        arrayOfByte1 = u.aus().l(this.kDQ.joF, 1);
        tmp423_421 = u.aus().l(this.kDQ.joF, 2);
        if (arrayOfByte1 == null)
        {
          i = -1;
          if (tmp423_421 != null) {
            break label1092;
          }
        }
        label1092:
        for (int j = -1;; j = tmp423_421.length)
        {
          w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "has not reach time out, just set back sessionkey, get auth buf from local, auth buf length = %d, session key buf lenght = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          if ((arrayOfByte1 == null) || (tmp423_421 == null)) {
            break label1100;
          }
          u.aus().bJ(localb.field_mac);
          if (2 == u.aus().bG(localb.field_mac))
          {
            ad.auc();
            com.tencent.mm.plugin.exdevice.model.e.b(localb.field_brandName, localb.field_url, 2, localb.field_deviceID);
          }
          this.kDQ.a(0, "", u.aus().l(this.kDQ.joF, 1));
          this.kDR = new a(this.kDQ, this.kDP);
          paramm.setChannelSessionKey(localb.field_mac, tmp423_421);
          bool = this.kDR.b(paramm);
          w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
          GMTrace.o(11122891554816L, 82872);
          return bool;
          i = arrayOfByte1.length;
          break;
        }
        label1100:
        w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "has not reach time out, but local authbuf is null, do auth from server");
      }
    }
    w.i("MicroMsg.exdevice.MMAuthTaskExcuter", "now do really auth from server");
    this.kxo = paramm;
    this.kDP = paramd;
    paramd = null;
    paramm = paramd;
    if (locala != null)
    {
      paramm = paramd;
      if (locala.kBe != null) {
        paramm = locala.kBe.toByteArray();
      }
    }
    at.wS().a(541, this);
    paramm = new r(localb.field_brandName, localb.field_deviceType, localb.field_deviceID, locala.kBc, paramm);
    at.wS().a(paramm, 0);
    GMTrace.o(11122891554816L, 82872);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\i\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */