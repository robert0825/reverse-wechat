package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.a.b.c;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ad;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.pluginsdk.ui.d.m.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.q;

public final class k
  implements m.a
{
  Activity activity;
  private ad pPx;
  private int scene;
  
  public k(Activity paramActivity, int paramInt, ad paramad)
  {
    GMTrace.i(8765625597952L, 65309);
    this.scene = 0;
    this.activity = paramActivity;
    this.scene = paramInt;
    this.pPx = paramad;
    GMTrace.o(8765625597952L, 65309);
  }
  
  public final void bq(Object paramObject)
  {
    boolean bool2 = false;
    GMTrace.i(8765759815680L, 65310);
    Intent localIntent = new Intent();
    if (this.activity == null)
    {
      GMTrace.o(8765759815680L, 65310);
      return;
    }
    Object localObject1;
    if ((paramObject instanceof com.tencent.mm.plugin.sns.data.a))
    {
      Object localObject2 = (com.tencent.mm.plugin.sns.data.a)paramObject;
      paramObject = new StringBuilder("onClick : ").append(((com.tencent.mm.plugin.sns.data.a)localObject2).userName).append(" activity: ");
      if (this.activity == null) {}
      com.tencent.mm.plugin.sns.storage.m localm;
      for (boolean bool1 = true;; bool1 = false)
      {
        w.d("Micro.ClickableCallBack", bool1);
        localm = ae.bjd().Is(((com.tencent.mm.plugin.sns.data.a)localObject2).eHy);
        if (!((com.tencent.mm.plugin.sns.data.a)localObject2).poX) {
          break label398;
        }
        paramObject = localm.blz();
        localObject1 = localm.bmh();
        if ((paramObject == null) || (((com.tencent.mm.plugin.sns.storage.b)paramObject).pCR != 1) || (bg.nm(((com.tencent.mm.plugin.sns.storage.b)paramObject).pCS))) {
          break;
        }
        localObject2 = ((com.tencent.mm.plugin.sns.storage.b)paramObject).pCS;
        w.i("Micro.ClickableCallBack", "headClickParam url " + (String)localObject2 + " " + ((com.tencent.mm.plugin.sns.storage.b)paramObject).pCT);
        localIntent = new Intent();
        bool1 = bool2;
        if (((com.tencent.mm.plugin.sns.storage.b)paramObject).pCT == 0) {
          bool1 = true;
        }
        localIntent.putExtra("KsnsViewId", (String)localObject1);
        localIntent.putExtra("KRightBtn", bool1);
        localIntent.putExtra("jsapiargs", new Bundle());
        localIntent.putExtra("rawUrl", (String)localObject2);
        localIntent.putExtra("useJs", true);
        com.tencent.mm.plugin.sns.c.a.hnH.j(localIntent, this.activity);
        GMTrace.o(8765759815680L, 65310);
        return;
      }
      this.pPx.biI().a(localm, false);
      localIntent.putExtra("Contact_User", ((com.tencent.mm.plugin.sns.data.a)localObject2).userName);
      localIntent.putExtra("Contact_Scene", 37);
      com.tencent.mm.plugin.sns.c.a.hnH.d(localIntent, this.activity);
      paramObject = new c(localm.bmh(), 2, ((com.tencent.mm.plugin.sns.data.a)localObject2).scene, "", localm.bmm(), localm.blE());
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a((com.tencent.mm.ad.k)paramObject, 0);
      GMTrace.o(8765759815680L, 65310);
      return;
      label398:
      localObject2 = ((com.tencent.mm.plugin.sns.data.a)localObject2).userName;
      if (this.scene == 0)
      {
        paramObject = com.tencent.mm.modelsns.b.ha(719);
        ((com.tencent.mm.modelsns.b)paramObject).lu(i.g(localm)).hd(localm.field_type).bC(localm.uX(32)).lu(localm.bmi()).lu((String)localObject2);
        ((com.tencent.mm.modelsns.b)paramObject).LR();
        if (this.scene != 0) {
          break label583;
        }
        paramObject = com.tencent.mm.modelsns.b.ha(746);
        label479:
        localObject1 = q.zE();
        ((com.tencent.mm.modelsns.b)paramObject).lu((String)localObject2).bC(((String)localObject2).endsWith((String)localObject1));
        ((com.tencent.mm.modelsns.b)paramObject).b(localIntent, "intent_key_StatisticsOplog");
        localObject1 = localObject2;
        if (this.scene == 0)
        {
          this.pPx.biI().a(localm, false);
          localObject1 = localObject2;
        }
      }
    }
    for (;;)
    {
      localIntent.putExtra("Contact_User", (String)localObject1);
      com.tencent.mm.plugin.sns.c.a.hnH.d(localIntent, this.activity);
      GMTrace.o(8765759815680L, 65310);
      return;
      paramObject = com.tencent.mm.modelsns.b.hb(719);
      break;
      label583:
      paramObject = com.tencent.mm.modelsns.b.hb(746);
      break label479;
      localObject1 = (String)paramObject;
      paramObject = localObject1;
      if (((String)localObject1).contains("@")) {
        paramObject = ((String)localObject1).replace("@", "");
      }
      com.tencent.mm.kernel.h.xz();
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC((String)paramObject);
      if ((localObject1 != null) && (((x)localObject1).bSA()))
      {
        localIntent.putExtra("Contact_User", (String)paramObject);
        localIntent.putExtra("Contact_Scene", 37);
        com.tencent.mm.plugin.sns.c.a.hnH.d(localIntent, this.activity);
        GMTrace.o(8765759815680L, 65310);
        return;
      }
      localObject1 = paramObject;
      if (this.scene == 0)
      {
        localObject1 = new com.tencent.mm.plugin.sns.storage.m();
        ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName = ((String)paramObject);
        this.pPx.biI().a((com.tencent.mm.plugin.sns.storage.m)localObject1, false);
        localObject1 = paramObject;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */