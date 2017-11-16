package com.tencent.mm.plugin.card.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.os;
import com.tencent.mm.g.a.os.a;
import com.tencent.mm.g.a.os.b;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.o;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class a
  extends c<os>
  implements com.tencent.mm.ad.e
{
  private os jwG;
  
  public a()
  {
    GMTrace.i(5116379791360L, 38120);
    this.vhf = os.class.getName().hashCode();
    GMTrace.o(5116379791360L, 38120);
  }
  
  private boolean a(os paramos)
  {
    GMTrace.i(5116514009088L, 38121);
    if (!at.AU())
    {
      w.e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent account is not ready");
      GMTrace.o(5116514009088L, 38121);
      return false;
    }
    if ((paramos instanceof os))
    {
      this.jwG = paramos;
      paramos = this.jwG.eTH.eTJ;
      String str = this.jwG.eTH.eTK;
      int i = this.jwG.eTH.eTL;
      if (TextUtils.isEmpty(paramos))
      {
        w.e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent card_id is empty");
        ajH();
        GMTrace.o(5116514009088L, 38121);
        return false;
      }
      at.wS().a(651, this);
      w.i("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent doscene from scene " + i);
      paramos = new o(paramos, i, "", str, "", "", 0, 0, null);
      at.wS().a(paramos, 0);
      GMTrace.o(5116514009088L, 38121);
      return true;
    }
    GMTrace.o(5116514009088L, 38121);
    return false;
  }
  
  private void ajH()
  {
    GMTrace.i(5116782444544L, 38123);
    if (this.jwG.eDO != null) {
      this.jwG.eDO.run();
    }
    this.jwG = null;
    GMTrace.o(5116782444544L, 38123);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5116648226816L, 38122);
    os.b localb;
    if ((paramk instanceof o))
    {
      localb = new os.b();
      w.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return errcode " + paramInt2 + " errmsg" + paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label248;
      }
      w.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is success");
      paramk = (o)paramk;
      paramInt1 = paramk.jzH;
      paramString = paramk.jzG;
      paramk = paramk.jzI;
      if (paramInt1 != 0) {
        break label208;
      }
      w.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return ok ");
      localb.eFN = true;
      paramk = new CardInfo();
      f.a(paramk, paramString);
      if (TextUtils.isEmpty(paramk.field_card_id)) {
        break label191;
      }
      localb.eTJ = paramk.field_card_id;
      al.aks().putValue("key_accept_card_info", paramk);
    }
    for (;;)
    {
      at.wS().b(651, this);
      this.jwG.eTI = localb;
      ajH();
      GMTrace.o(5116648226816L, 38122);
      return;
      label191:
      w.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return card_id is empty ");
      localb.eTJ = "";
      break;
      label208:
      w.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return false, retCode " + paramInt1 + " retMsg" + paramk);
      localb.eFN = false;
      continue;
      label248:
      w.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is fail");
      localb.eFN = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */