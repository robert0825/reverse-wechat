package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.x.a;
import com.tencent.mm.protocal.c.cz;
import com.tencent.mm.protocal.c.da;
import com.tencent.mm.protocal.c.wg;
import com.tencent.mm.protocal.c.wh;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ae
  extends w
{
  List<String> tov;
  
  public ae(List<String> paramList)
  {
    GMTrace.i(792958337024L, 5908);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new wg();
    ((b.a)localObject).gtG = new wh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getappsetting";
    ((b.a)localObject).gtE = 395;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    this.tov = paramList;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetAppSetting", "<init>, appIdList size = " + paramList.size());
    localObject = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if ((str != null) && (str.length() > 0))
      {
        da localda = new da();
        localda.lPg = str;
        ((LinkedList)localObject).add(localda);
      }
    }
    if (((LinkedList)localObject).size() == 0) {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAppSetting", "doScene fail, reqList is empty");
    }
    paramList = (wg)this.kzP.gtC.gtK;
    paramList.uoE = ((LinkedList)localObject);
    paramList.uoD = ((LinkedList)localObject).size();
    GMTrace.o(792958337024L, 5908);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(793092554752L, 5909);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetAppSetting", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, errType = " + paramInt2 + ", errCode = " + paramInt3);
      GMTrace.o(793092554752L, 5909);
      return;
    }
    paramString = (wh)this.kzP.gtD.gtK;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, resp appCount = " + paramString.uoD);
    paramq = paramString.uoF;
    if ((paramq == null) || (paramq.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, settingList is empty");
      GMTrace.o(793092554752L, 5909);
      return;
    }
    paramString = a.aWy();
    paramq = paramq.iterator();
    while (paramq.hasNext())
    {
      paramArrayOfByte = (cz)paramq.next();
      f localf = g.aP(paramArrayOfByte.lPg, false);
      if (localf != null)
      {
        localf.field_authFlag = paramArrayOfByte.tRm;
        localf.field_openId = paramArrayOfByte.lQH;
        boolean bool = paramString.a(localf, new String[0]);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, update ret = " + bool + ", appId = " + paramArrayOfByte.lPg);
      }
    }
    GMTrace.o(793092554752L, 5909);
  }
  
  public final byte[] aFZ()
  {
    GMTrace.i(793226772480L, 5910);
    try
    {
      byte[] arrayOfByte = ((b.b)this.kzP.DC()).Ba();
      GMTrace.o(793226772480L, 5910);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAppSetting", "toProtBuf error: " + localException.getMessage());
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.NetSceneGetAppSetting", localException, "", new Object[0]);
      GMTrace.o(793226772480L, 5910);
    }
    return null;
  }
  
  public final void au(byte[] paramArrayOfByte)
  {
    GMTrace.i(793360990208L, 5911);
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAppSetting", "buf is null");
      GMTrace.o(793360990208L, 5911);
      return;
    }
    try
    {
      this.kzP.gtD.y(paramArrayOfByte);
      GMTrace.o(793360990208L, 5911);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAppSetting", "bufToResp error: " + paramArrayOfByte.getMessage());
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.NetSceneGetAppSetting", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(793360990208L, 5911);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(793495207936L, 5912);
    GMTrace.o(793495207936L, 5912);
    return 1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */