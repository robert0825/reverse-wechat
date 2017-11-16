package com.tencent.mm.plugin.wear.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.wear.model.a.b.a;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.plugin.wear.model.e.j;
import com.tencent.mm.plugin.wear.model.e.p;
import com.tencent.mm.sdk.platformtools.w;
import java.security.Key;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
{
  com.tencent.mm.plugin.wear.model.a.b rzI;
  com.tencent.mm.plugin.wear.model.e.b rzJ;
  public i rzK;
  j rzL;
  p rzM;
  
  public d()
  {
    GMTrace.i(9173915926528L, 68351);
    this.rzI = new com.tencent.mm.plugin.wear.model.a.a();
    this.rzJ = new com.tencent.mm.plugin.wear.model.e.b();
    this.rzK = new i();
    this.rzL = new j();
    this.rzM = new p();
    GMTrace.o(9173915926528L, 68351);
  }
  
  public final boolean aQ(byte[] paramArrayOfByte)
  {
    GMTrace.i(9174318579712L, 68354);
    if (paramArrayOfByte == null)
    {
      GMTrace.o(9174318579712L, 68354);
      return false;
    }
    if (!bBr())
    {
      GMTrace.o(9174318579712L, 68354);
      return false;
    }
    String str = String.format("/wechat/%s/%d", new Object[] { "phone", Long.valueOf(System.currentTimeMillis()) });
    com.tencent.mm.plugin.wear.model.a.b localb = bBs();
    if (localb == null)
    {
      GMTrace.o(9174318579712L, 68354);
      return false;
    }
    if (paramArrayOfByte.length > 92160) {}
    for (paramArrayOfByte = localb.t(str, paramArrayOfByte); paramArrayOfByte.code == 0; paramArrayOfByte = localb.s(str, paramArrayOfByte))
    {
      GMTrace.o(9174318579712L, 68354);
      return true;
    }
    GMTrace.o(9174318579712L, 68354);
    return false;
  }
  
  public final byte[] aR(byte[] paramArrayOfByte)
  {
    GMTrace.i(9174452797440L, 68355);
    Object localObject = this.rzJ.wR();
    if ((paramArrayOfByte != null) && (localObject != null)) {
      try
      {
        w.d("MicroMsg.Wear.WearConnectLogic", "sessionKey is not null %s", new Object[] { g.n((byte[])localObject) });
        localObject = new SecretKeySpec((byte[])localObject, "AES");
        Cipher localCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        localCipher.init(2, (Key)localObject);
        paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
        GMTrace.o(9174452797440L, 68355);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        w.printErrStackTrace("MicroMsg.Wear.WearConnectLogic", paramArrayOfByte, "", new Object[0]);
        GMTrace.o(9174452797440L, 68355);
        return null;
      }
    }
    GMTrace.o(9174452797440L, 68355);
    return null;
  }
  
  public final byte[] aS(byte[] paramArrayOfByte)
  {
    GMTrace.i(9174587015168L, 68356);
    byte[] arrayOfByte = this.rzJ.wR();
    if ((paramArrayOfByte != null) && (arrayOfByte != null)) {
      try
      {
        w.d("MicroMsg.Wear.WearConnectLogic", "sessionKey is not null %s", new Object[] { g.n(arrayOfByte) });
        paramArrayOfByte = com.tencent.mm.plugin.wear.a.a.f(paramArrayOfByte, arrayOfByte);
        GMTrace.o(9174587015168L, 68356);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        w.printErrStackTrace("MicroMsg.Wear.WearConnectLogic", paramArrayOfByte, "", new Object[0]);
        GMTrace.o(9174587015168L, 68356);
        return null;
      }
    }
    GMTrace.o(9174587015168L, 68356);
    return null;
  }
  
  public final boolean bBr()
  {
    GMTrace.i(9174050144256L, 68352);
    if ((bBs() != null) && (bBs().bBx().size() > 0))
    {
      GMTrace.o(9174050144256L, 68352);
      return true;
    }
    GMTrace.o(9174050144256L, 68352);
    return false;
  }
  
  public final com.tencent.mm.plugin.wear.model.a.b bBs()
  {
    GMTrace.i(9174184361984L, 68353);
    if ((this.rzI.isAvailable()) && (this.rzI.bBy()))
    {
      com.tencent.mm.plugin.wear.model.a.b localb = this.rzI;
      GMTrace.o(9174184361984L, 68353);
      return localb;
    }
    GMTrace.o(9174184361984L, 68353);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */