package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.zl;
import com.tencent.mm.protocal.c.zm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.g;
import com.tencent.mm.storage.emotion.h.a;
import java.io.IOException;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fXo;
  public int gFW;
  private int klA;
  public byte[] klB;
  private int klC;
  private String klD;
  private int klE;
  
  public h(int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4, byte[] paramArrayOfByte)
  {
    GMTrace.i(11296837730304L, 84168);
    b.a locala = new b.a();
    locala.gtF = new zl();
    locala.gtG = new zm();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetdesigneremojilist";
    locala.gtE = 821;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.gFW = paramInt1;
    this.klA = paramInt2;
    this.klC = paramInt3;
    this.klD = paramString;
    this.klB = paramArrayOfByte;
    this.klE = paramInt4;
    GMTrace.o(11296837730304L, 84168);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11297240383488L, 84171);
    this.fXo = parame1;
    zl localzl = (zl)this.fUa.gtC.gtK;
    if (this.klB != null)
    {
      localzl.uqp = n.H(this.klB);
      if (localzl.uqp != null) {
        break label145;
      }
    }
    label145:
    for (parame1 = "Buf is NULL";; parame1 = localzl.uqp.toString())
    {
      w.d("MicroMsg.emoji.NetSceneGetDesignerEmojiList", parame1);
      localzl.uqo = this.klA;
      localzl.tMX = this.gFW;
      localzl.ugF = this.klC;
      localzl.uqq = this.klD;
      localzl.uqr = this.klE;
      int i = a(parame, this.fUa, this);
      GMTrace.o(11297240383488L, 84171);
      return i;
      localzl.uqp = new azp();
      break;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11296971948032L, 84169);
    w.d("MicroMsg.emoji.NetSceneGetDesignerEmojiList", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    String str;
    Object localObject;
    if (((paramInt2 == 0) && (paramInt3 == 0)) || ((paramInt2 == 4) && ((paramInt3 == 2) || (paramInt3 == 3)) && ((this.klB == null) || (this.klB.length <= 0)) && (this.gFW != 3)))
    {
      paramArrayOfByte = com.tencent.mm.plugin.emoji.model.h.arl().kjE;
      str = this.klA;
      localObject = arw();
      if ((!bg.nm(str)) && (localObject != null)) {
        break label196;
      }
      w.w("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerEmojiListResponseByUIN failed. designerID or response is null.");
    }
    for (;;)
    {
      paramq = (zm)((b)paramq).gtD.gtK;
      if (paramq.uqp != null) {
        this.klB = n.a(paramq.uqp);
      }
      this.fXo.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11296971948032L, 84169);
      return;
      try
      {
        label196:
        g localg = new g();
        localg.field_designerIDAndType = (str + h.a.vCN.value);
        localg.field_content = ((zm)localObject).toByteArray();
        localObject = localg.qL();
        new StringBuilder().append(str).append(h.a.vCN.value).toString();
        if (paramArrayOfByte.fTZ.replace("EmotionDesignerInfo", "designerIDAndType", (ContentValues)localObject) <= 0L) {
          break label344;
        }
        w.i("MicroMsg.emoji.EmotionDesignerInfo", "savePersonalDesignerResponseByUIN success. designerID:%s", new Object[] { str });
      }
      catch (IOException paramArrayOfByte)
      {
        w.e("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID exception:%s", new Object[] { bg.f(paramArrayOfByte) });
      }
      continue;
      label344:
      w.i("MicroMsg.emoji.EmotionDesignerInfo", "savePersonalDesignerResponseByUIN failed. designerID:%s", new Object[] { str });
    }
  }
  
  public final zm arw()
  {
    GMTrace.i(11297374601216L, 84172);
    if (this.fUa == null)
    {
      GMTrace.o(11297374601216L, 84172);
      return null;
    }
    zm localzm = (zm)this.fUa.gtD.gtK;
    GMTrace.o(11297374601216L, 84172);
    return localzm;
  }
  
  public final int getType()
  {
    GMTrace.i(11297106165760L, 84170);
    GMTrace.o(11297106165760L, 84170);
    return 821;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */