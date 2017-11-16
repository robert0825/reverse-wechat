package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.at;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ao
{
  private Activity eNu;
  private List<anu> ePZ;
  
  public ao(Activity paramActivity)
  {
    GMTrace.i(8355053568000L, 62250);
    this.ePZ = new ArrayList();
    this.eNu = paramActivity;
    GMTrace.o(8355053568000L, 62250);
  }
  
  private boolean bV(String paramString, int paramInt)
  {
    GMTrace.i(8355456221184L, 62253);
    paramString = com.tencent.mm.plugin.sns.storage.h.Is(paramString);
    if (paramString == null)
    {
      GMTrace.o(8355456221184L, 62253);
      return false;
    }
    paramString = paramString.blD();
    if ((paramString.uUc == null) || (paramString.uUc.ueW.size() == 0))
    {
      GMTrace.o(8355456221184L, 62253);
      return false;
    }
    this.ePZ.clear();
    paramString = paramString.uUc.ueW.iterator();
    int i = 0;
    while (paramString.hasNext())
    {
      anu localanu = (anu)paramString.next();
      this.ePZ.add(localanu);
      if ((paramInt == i) && (!ae.bja().A(localanu)))
      {
        GMTrace.o(8355456221184L, 62253);
        return false;
      }
      i += 1;
    }
    GMTrace.o(8355456221184L, 62253);
    return true;
  }
  
  public final void a(View paramView, int paramInt, at paramat)
  {
    GMTrace.i(8355322003456L, 62252);
    if (paramView == null)
    {
      GMTrace.o(8355322003456L, 62252);
      return;
    }
    Object localObject = paramView.getTag();
    ap localap;
    String str;
    int i;
    int j;
    m localm;
    Intent localIntent;
    if ((localObject instanceof ap))
    {
      localap = (ap)localObject;
      str = localap.eHy;
      i = localap.index;
      j = localap.position;
      if (!bV(str, i))
      {
        GMTrace.o(8355322003456L, 62252);
        return;
      }
      com.tencent.mm.kernel.h.xz();
      if (!com.tencent.mm.kernel.h.xy().isSDCardAvailable())
      {
        GMTrace.o(8355322003456L, 62252);
        return;
      }
      localm = com.tencent.mm.plugin.sns.storage.h.Is(str);
      if (!bV(str, i))
      {
        GMTrace.o(8355322003456L, 62252);
        return;
      }
      localIntent = new Intent();
      if (localm != null)
      {
        if (paramat != null) {
          paramat.pvl.v(localm);
        }
        biz localbiz = localm.blD();
        if (localap.index >= localbiz.uUc.ueW.size()) {
          break label599;
        }
        paramat = (anu)localbiz.uUc.ueW.get(localap.index);
        if (paramInt != 1) {
          break label610;
        }
        localObject = com.tencent.mm.modelsns.b.ha(716);
        label218:
        ((com.tencent.mm.modelsns.b)localObject).lu(i.g(localm)).hd(localm.field_type).bC(localm.uX(32)).lu(localm.bmi()).lu(paramat.mmR).hd(localap.index).hd(localbiz.uUc.ueW.size());
        ((com.tencent.mm.modelsns.b)localObject).LR();
        if (paramInt != 1) {
          break label621;
        }
      }
    }
    label599:
    label610:
    label621:
    for (paramat = com.tencent.mm.modelsns.b.ha(744);; paramat = com.tencent.mm.modelsns.b.hb(744))
    {
      paramat.lu(i.g(localm)).hd(localm.field_type).bC(localm.uX(32)).lu(localm.bmi());
      paramat.b(localIntent, "intent_key_StatisticsOplog");
      paramat = new Bundle();
      paramat.putInt("stat_scene", 3);
      paramat.putString("stat_msg_id", "sns_" + i.dt(localm.field_snsId));
      paramat.putString("stat_send_msg_user", localm.field_userName);
      localIntent.putExtra("_stat_obj", paramat);
      paramat = new int[2];
      paramView.getLocationInWindow(paramat);
      int k = paramView.getWidth();
      int m = paramView.getHeight();
      if (paramInt == -1) {
        localIntent.putExtra("k_is_from_sns_msg_ui", true);
      }
      localIntent.putExtra("sns_gallery_localId", str);
      localIntent.putExtra("sns_gallery_position", i);
      localIntent.putExtra("sns_position", j);
      localIntent.putExtra("sns_gallery_showtype", 1);
      localIntent.putExtra("K_ad_scene", paramInt);
      localIntent.putExtra("k_is_from_sns_main_timeline", localap.pYh);
      localIntent.putExtra("img_gallery_left", paramat[0]);
      localIntent.putExtra("img_gallery_top", paramat[1]);
      localIntent.putExtra("img_gallery_width", k);
      localIntent.putExtra("img_gallery_height", m);
      localIntent.setClass(this.eNu, SnsBrowseUI.class);
      this.eNu.startActivity(localIntent);
      this.eNu.overridePendingTransition(0, 0);
      GMTrace.o(8355322003456L, 62252);
      return;
      paramat = new anu();
      break;
      localObject = com.tencent.mm.modelsns.b.hb(716);
      break label218;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */