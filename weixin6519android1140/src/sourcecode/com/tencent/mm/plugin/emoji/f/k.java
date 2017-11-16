package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.g.c.a;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.protocal.c.alb;
import com.tencent.mm.protocal.c.rb;
import com.tencent.mm.protocal.c.zv;
import com.tencent.mm.protocal.c.zw;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fXo;
  private c.a klI;
  private boolean klJ;
  private mc klK;
  public String klj;
  
  public k(String paramString)
  {
    GMTrace.i(11288918884352L, 84109);
    this.klj = "";
    this.klJ = false;
    this.klK = null;
    b.a locala = new b.a();
    locala.gtF = new zv();
    locala.gtG = new zw();
    locala.uri = "/cgi-bin/micromsg-bin/getemotiondesc";
    locala.gtE = 521;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.klj = paramString;
    this.klK = new mc();
    GMTrace.o(11288918884352L, 84109);
  }
  
  public k(String paramString, c.a parama)
  {
    GMTrace.i(11289053102080L, 84110);
    this.klj = "";
    this.klJ = false;
    this.klK = null;
    b.a locala = new b.a();
    locala.gtF = new zv();
    locala.gtG = new zw();
    locala.uri = "/cgi-bin/micromsg-bin/getemotiondesc";
    locala.gtE = 521;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.klj = paramString;
    this.klI = parama;
    this.klJ = true;
    this.klK = new mc();
    GMTrace.o(11289053102080L, 84110);
  }
  
  private int ary()
  {
    GMTrace.i(11289589972992L, 84114);
    int i = ((zw)this.fUa.gtD.gtK).uqC;
    GMTrace.o(11289589972992L, 84114);
    return i;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11289321537536L, 84112);
    w.d("MicroMsg.emoji.NetSceneGetEmotionDesc", "getEmotionDesc %s ", new Object[] { this.klj });
    this.fXo = parame1;
    ((zv)this.fUa.gtC.gtK).tRS = this.klj;
    if (TextUtils.isEmpty(this.klj))
    {
      w.w("MicroMsg.emoji.NetSceneGetEmotionDesc", "get emoji desc faild. product id is null.");
      GMTrace.o(11289321537536L, 84112);
      return -1;
    }
    int i = a(parame, this.fUa, this);
    GMTrace.o(11289321537536L, 84112);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(11289858408448L, 84116);
    int i = k.b.gum;
    GMTrace.o(11289858408448L, 84116);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11289455755264L, 84113);
    com.tencent.mm.storage.emotion.c localc;
    Object localObject1;
    int i;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      if (this.klJ) {
        if ((ary() & 0x1) == 1) {
          com.tencent.mm.plugin.emoji.g.c.a(this.klI);
        }
      }
      for (;;)
      {
        this.fXo.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(11289455755264L, 84113);
        return;
        w.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "new emotion is can't download. ignore");
        continue;
        paramArrayOfByte = ((zw)this.fUa.gtD.gtK).jhd;
        localc = h.arl().kjA;
        localObject1 = this.klj;
        paramInt1 = ((zw)this.fUa.gtD.gtK).uqA;
        i = ary();
        if (localc.mSharedPreferences != null) {
          localc.mSharedPreferences.edit().putLong("274544" + (String)localObject1, System.currentTimeMillis()).commit();
        }
        if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0)) {
          break;
        }
        label192:
        if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0)) {
          break label548;
        }
        w.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "end getEmojiDesc, productId: %s ", new Object[] { this.klj });
        this.klK.eQV.eEa = this.klj;
        a.vgX.m(this.klK);
      }
      if (!(localc.fTZ instanceof g)) {
        break label601;
      }
      paramq = (g)localc.fTZ;
    }
    for (long l = paramq.cE(Thread.currentThread().getId());; l = -1L)
    {
      localc.fTZ.delete("EmojiInfoDesc", "groupId=?", new String[] { localObject1 });
      com.tencent.mm.storage.emotion.b localb = new com.tencent.mm.storage.emotion.b();
      localb.field_groupId = ((String)localObject1);
      localb.field_click_flag = paramInt1;
      localb.field_download_flag = i;
      localObject1 = paramArrayOfByte.iterator();
      Object localObject3;
      do
      {
        Object localObject2;
        while (!((Iterator)localObject2).hasNext())
        {
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          localObject2 = (rb)((Iterator)localObject1).next();
          localb.field_md5 = ((rb)localObject2).ugy;
          localObject2 = ((rb)localObject2).jhd.iterator();
        }
        localObject3 = (alb)((Iterator)localObject2).next();
        localb.field_desc = ((alb)localObject3).lPj;
        localb.field_lang = ((alb)localObject3).lQJ;
        localb.field_md5_lang = (localb.field_md5 + localb.field_lang);
        localObject3 = localb.qL();
      } while (localc.fTZ.replace("EmojiInfoDesc", "md5_lang", (ContentValues)localObject3) >= 0L);
      if (paramq == null) {
        break label192;
      }
      paramq.aL(l);
      break label192;
      localc.fTZ.replace("EmojiInfoDesc", "md5_lang", localb.qL());
      if (paramq == null) {
        break label192;
      }
      paramq.aL(l);
      break label192;
      label548:
      break;
      w.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "end getEmojiDesc, & errType:%d, errCode:%d, productId: %s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this.klj });
      if (!this.klJ) {
        break;
      }
      w.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "new emotion get des failed. ignore");
      break;
      label601:
      paramq = null;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(11289187319808L, 84111);
    GMTrace.o(11289187319808L, 84111);
    return 521;
  }
  
  protected final int vB()
  {
    GMTrace.i(11289724190720L, 84115);
    GMTrace.o(11289724190720L, 84115);
    return 50;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */