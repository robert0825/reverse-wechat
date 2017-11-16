package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.x.a.a;
import com.tencent.mm.plugin.x.a.a.a;
import com.tencent.mm.protocal.c.bcl;
import com.tencent.mm.protocal.c.bcm;

public final class aj
  extends w
{
  public int cmdId;
  private String toF;
  
  public aj(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(811748818944L, 6048);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bcl();
    ((b.a)localObject).gtG = new bcm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/setappsetting";
    ((b.a)localObject).gtE = 396;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (bcl)this.kzP.gtC.gtK;
    ((bcl)localObject).lPg = paramString1;
    ((bcl)localObject).uPa = paramInt;
    ((bcl)localObject).uPb = paramString2;
    this.cmdId = paramInt;
    this.toF = paramString2;
    GMTrace.o(811748818944L, 6048);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(811883036672L, 6049);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneSetAppSetting", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt2 == 0))
    {
      paramString = (bcm)this.kzP.gtD.gtK;
      if (paramString != null)
      {
        paramq = a.a.aWD().aWB();
        paramArrayOfByte = g.aP(paramString.lPg, false);
        if (paramArrayOfByte != null)
        {
          paramArrayOfByte.field_authFlag = paramString.tRm;
          boolean bool = paramq.a(paramArrayOfByte, new String[0]);
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneSetAppSetting", "onGYNetEnd, update ret = " + bool + ", appId = " + paramString.lPg);
        }
      }
    }
    GMTrace.o(811883036672L, 6049);
  }
  
  public final byte[] aFZ()
  {
    GMTrace.i(812017254400L, 6050);
    try
    {
      byte[] arrayOfByte = ((b.b)this.kzP.DC()).Ba();
      GMTrace.o(812017254400L, 6050);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneSetAppSetting", "toProtBuf failed: " + localException.getMessage());
      GMTrace.o(812017254400L, 6050);
    }
    return null;
  }
  
  public final void au(byte[] paramArrayOfByte)
  {
    GMTrace.i(812151472128L, 6051);
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneSetAppSetting", "buf is null");
      GMTrace.o(812151472128L, 6051);
      return;
    }
    try
    {
      this.kzP.gtD.y(paramArrayOfByte);
      GMTrace.o(812151472128L, 6051);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneSetAppSetting", "parse error: " + paramArrayOfByte.getMessage());
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.NetSceneSetAppSetting", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(812151472128L, 6051);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(812285689856L, 6052);
    GMTrace.o(812285689856L, 6052);
    return 2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */