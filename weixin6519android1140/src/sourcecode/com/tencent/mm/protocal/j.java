package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.eg;
import com.tencent.mm.protocal.c.ei;
import com.tencent.mm.sdk.platformtools.w;

public final class j
{
  public static final class a
    extends k.d
    implements k.b
  {
    public eg tKf;
    public byte[] tKg;
    
    public a()
    {
      GMTrace.i(3611799060480L, 26910);
      this.tKf = new eg();
      GMTrace.o(3611799060480L, 26910);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(3611933278208L, 26911);
      this.tKf.uNh = k.a(this);
      w.d("MicroMsg.MMBakchatCreateQRcodeOffline.Req", "key:%s  AddrCount:%s  AddrList:%s, PCName:%s, PCAcctName:%s, Scene:%s, DataSize:%s, WifiName:%s, Tickit:%s", new Object[] { this.tKg, Integer.valueOf(this.tKf.tSN), this.tKf.tSO, this.tKf.tSP, this.tKf.tSQ, Integer.valueOf(this.tKf.tOG), Long.valueOf(this.tKf.jhw), this.tKf.tSR, this.tKf.tSS });
      byte[] arrayOfByte = this.tKf.toByteArray();
      GMTrace.o(3611933278208L, 26911);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(3612067495936L, 26912);
      GMTrace.o(3612067495936L, 26912);
      return 1000;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(3612201713664L, 26913);
      GMTrace.o(3612201713664L, 26913);
      return 1000;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public ei tKh;
    
    public b()
    {
      GMTrace.i(3616496680960L, 26945);
      this.tKh = new ei();
      GMTrace.o(3616496680960L, 26945);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(3616765116416L, 26947);
      GMTrace.o(3616765116416L, 26947);
      return 1000;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(3616630898688L, 26946);
      this.tKh = ((ei)new ei().aD(paramArrayOfByte));
      w.d("MicroMsg.MMBakchatCreateQRcodeOffline.Resp", "Ret:%d, QRCodeBuffer:%s, QRCodeUrl:%s", new Object[] { Integer.valueOf(this.tKh.tST), this.tKh.tSU, this.tKh.tSV });
      int i = this.tKh.tST;
      GMTrace.o(3616630898688L, 26946);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */