package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.protocal.c.zn;
import com.tencent.mm.protocal.c.zo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.g;
import com.tencent.mm.storage.emotion.h.a;
import java.io.IOException;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fXo;
  private String klF;
  
  public i(String paramString)
  {
    GMTrace.i(11297508818944L, 84173);
    b.a locala = new b.a();
    locala.gtF = new zn();
    locala.gtG = new zo();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetdesignersimpleinfo";
    locala.gtE = 239;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.klF = paramString;
    GMTrace.o(11297508818944L, 84173);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11298045689856L, 84177);
    this.fXo = parame1;
    ((zn)this.fUa.gtC.gtK).ugz = this.klF;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11298045689856L, 84177);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11297643036672L, 84174);
    w.d("MicroMsg.emoji.NetSceneGetDesignerSimpleInfo", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    Object localObject;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = com.tencent.mm.plugin.emoji.model.h.arl().kjE;
      paramArrayOfByte = this.klF;
      localObject = arx();
      if ((!bg.nm(paramArrayOfByte)) && (localObject != null)) {
        break label109;
      }
      w.w("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID failed. designerID or response is null.");
    }
    for (;;)
    {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11297643036672L, 84174);
      return;
      try
      {
        label109:
        g localg = new g();
        localg.field_designerIDAndType = (paramArrayOfByte + h.a.vCL.value);
        localg.field_content = ((zo)localObject).toByteArray();
        localObject = localg.qL();
        new StringBuilder().append(paramArrayOfByte).append(h.a.vCL.value).toString();
        if (paramq.fTZ.replace("EmotionDesignerInfo", "designerIDAndType", (ContentValues)localObject) <= 0L) {
          break label253;
        }
        w.i("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID success. designerID:%s", new Object[] { paramArrayOfByte });
      }
      catch (IOException paramq)
      {
        w.e("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID exception:%s", new Object[] { bg.f(paramq) });
      }
      continue;
      label253:
      w.i("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID failed. designerID:%s", new Object[] { paramArrayOfByte });
    }
  }
  
  public final zo arx()
  {
    GMTrace.i(11297777254400L, 84175);
    if (this.fUa == null)
    {
      GMTrace.o(11297777254400L, 84175);
      return null;
    }
    zo localzo = (zo)this.fUa.gtD.gtK;
    GMTrace.o(11297777254400L, 84175);
    return localzo;
  }
  
  public final int getType()
  {
    GMTrace.i(11297911472128L, 84176);
    GMTrace.o(11297911472128L, 84176);
    return 239;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */