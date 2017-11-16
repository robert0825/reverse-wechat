package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.x.a.a;
import com.tencent.mm.plugin.x.a.a.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.protocal.c.ds;
import com.tencent.mm.protocal.c.wk;
import com.tencent.mm.protocal.c.wl;
import java.util.Iterator;
import java.util.LinkedList;

public final class ao
  extends com.tencent.mm.pluginsdk.model.app.w
{
  public ao(String paramString)
  {
    GMTrace.i(12590696628224L, 93808);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new wk();
    ((b.a)localObject).gtG = new wl();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getauthapplist";
    ((b.a)localObject).gtE = 394;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (wk)this.kzP.gtC.gtK;
    ((wk)localObject).jib = 1;
    ((wk)localObject).lQJ = paramString;
    GMTrace.o(12590696628224L, 93808);
  }
  
  private static void a(f paramf, ds paramds)
  {
    GMTrace.i(12590965063680L, 93810);
    paramf.field_appType = paramds.tRV;
    paramf.field_appIconUrl = paramds.lRV;
    paramf.field_appName = paramds.lRT;
    paramf.field_authFlag = paramds.tRm;
    paramf.bV(paramds.tRW);
    paramf.bW(paramds.tRX);
    GMTrace.o(12590965063680L, 93810);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12590830845952L, 93809);
    paramString = (wl)this.kzP.gtD.gtK;
    paramInt1 = paramString.uoD;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetAuthAppList", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", get authlist count = " + paramInt1);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAuthAppList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      GMTrace.o(12590830845952L, 93809);
      return;
    }
    paramq = paramString.uoG;
    if ((paramq != null) && (paramq.size() > 0))
    {
      paramString = a.a.aWD().aWB();
      paramq = paramq.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = (ds)paramq.next();
        f localf = g.aP(paramArrayOfByte.lPg, true);
        boolean bool;
        if (localf != null)
        {
          a(localf, paramArrayOfByte);
          bool = paramString.a(localf, new String[0]);
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetAuthAppList", "onGYNetEnd, update ret = " + bool + ", appId = " + localf.field_appId);
        }
        else
        {
          localf = new f();
          localf.field_appId = paramArrayOfByte.lPg;
          a(localf, paramArrayOfByte);
          bool = paramString.l(localf);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetAuthAppList", "insert game appinfo:" + paramArrayOfByte.lPg + ", ret = " + bool);
        }
      }
    }
    GMTrace.o(12590830845952L, 93809);
  }
  
  public final byte[] aFZ()
  {
    GMTrace.i(12591099281408L, 93811);
    try
    {
      byte[] arrayOfByte = ((b.b)this.kzP.DC()).Ba();
      GMTrace.o(12591099281408L, 93811);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.NetSceneGetAuthAppList", localException, "", new Object[0]);
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAuthAppList", "reqToBuf failed: " + localException.getMessage());
      GMTrace.o(12591099281408L, 93811);
    }
    return null;
  }
  
  public final void au(byte[] paramArrayOfByte)
  {
    GMTrace.i(12591233499136L, 93812);
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAuthAppList", "buf is null");
      GMTrace.o(12591233499136L, 93812);
      return;
    }
    b.c localc = this.kzP.gtD;
    try
    {
      localc.y(paramArrayOfByte);
      GMTrace.o(12591233499136L, 93812);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAuthAppList", paramArrayOfByte.getMessage());
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.NetSceneGetAuthAppList", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(12591233499136L, 93812);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(12591367716864L, 93813);
    GMTrace.o(12591367716864L, 93813);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */