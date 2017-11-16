package com.tencent.mm.modelvideo;

import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbv;
import com.tencent.mm.protocal.c.bbw;
import com.tencent.mm.protocal.c.bjg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String clientId;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private long haN;
  private r haO;
  private keep_SceneResult haP;
  
  public e(long paramLong, r paramr, keep_SceneResult paramkeep_SceneResult, String paramString)
  {
    GMTrace.i(337960239104L, 2518);
    this.haN = -1L;
    this.haO = null;
    this.haP = null;
    this.clientId = "";
    w.i("MicroMsg.NetSceneMassUploadSight", "massSendId %d, clientId %s", new Object[] { Long.valueOf(paramLong), paramString });
    this.haN = paramLong;
    this.haO = paramr;
    this.haP = paramkeep_SceneResult;
    this.clientId = paramString;
    GMTrace.o(337960239104L, 2518);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    int i = 0;
    GMTrace.i(338094456832L, 2519);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new bbv();
    parame1.gtG = new bbw();
    parame1.uri = "/cgi-bin/micromsg-bin/sendsight";
    parame1.gtE = 245;
    this.fUa = parame1.DA();
    parame1 = (bbv)this.fUa.gtC.gtK;
    parame1.giJ = this.haP.field_aesKey;
    parame1.pzf = this.clientId;
    parame1.eDW = this.haO.eTZ;
    parame1.uOR = this.haO.hcv;
    o.Nh();
    Object localObject = s.ml(this.haO.getFileName());
    BitmapFactory.Options localOptions = d.RB((String)localObject);
    if (localOptions != null)
    {
      parame1.giI = localOptions.outWidth;
      parame1.giH = localOptions.outHeight;
    }
    for (;;)
    {
      parame1.hbf = this.haO.hcr;
      localObject = bg.aq(this.haO.hcD, "").split(",");
      if ((localObject != null) && (localObject.length > 0)) {
        break;
      }
      w.e("MicroMsg.NetSceneMassUploadSight", "cdn upload video done, massSendId[%d], split username fail", new Object[] { Long.valueOf(this.haN) });
      GMTrace.o(338094456832L, 2519);
      return -1;
      w.w("MicroMsg.NetSceneMassUploadSight", "sight send getImageOptions for thumb failed path:%s", new Object[] { localObject });
    }
    int j = localObject.length;
    while (i < j)
    {
      localOptions = localObject[i];
      bjg localbjg = new bjg();
      localbjg.username = localOptions;
      parame1.uOQ.add(localbjg);
      i += 1;
    }
    parame1.url = this.haP.field_fileId;
    parame1.hcv = this.haO.gsL;
    i = a(parame, this.fUa, this);
    GMTrace.o(338094456832L, 2519);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(338228674560L, 2520);
    w.i("MicroMsg.NetSceneMassUploadSight", "cdntra onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " useCdnTransClientId:" + this.clientId + " massSendId " + this.haN);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(338228674560L, 2520);
  }
  
  public final int getType()
  {
    GMTrace.i(338362892288L, 2521);
    GMTrace.o(338362892288L, 2521);
    return 245;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */