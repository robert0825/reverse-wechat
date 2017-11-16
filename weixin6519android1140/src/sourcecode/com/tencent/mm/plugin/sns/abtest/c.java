package com.tencent.mm.plugin.sns.abtest;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pj;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.SnsPermissionUI;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.a.e;
import com.tencent.mm.y.a.f;
import com.tencent.mm.y.a.g;
import java.util.HashSet;
import java.util.Set;

public final class c
{
  private static boolean plL;
  private static com.tencent.mm.sdk.b.c plU;
  private static String pmw;
  public static Set<Long> pmx;
  private static View.OnClickListener pmy;
  
  static
  {
    GMTrace.i(8870181208064L, 66088);
    pmw = "0";
    pmx = new HashSet();
    plU = new com.tencent.mm.sdk.b.c() {};
    plL = false;
    GMTrace.o(8870181208064L, 66088);
  }
  
  public static void av(Context paramContext, String paramString)
  {
    GMTrace.i(16047071559680L, 119560);
    paramString = ae.bjd().Ir(paramString);
    if (paramString != null)
    {
      String str = paramString.field_userName;
      Intent localIntent = new Intent();
      localIntent.putExtra("sns_permission_userName", str);
      localIntent.putExtra("sns_permission_snsinfo_svr_id", paramString.field_snsId);
      localIntent.putExtra("sns_permission_block_scene", 7);
      localIntent.setClass(paramContext, SnsPermissionUI.class);
      paramContext.startActivity(localIntent);
    }
    GMTrace.o(16047071559680L, 119560);
  }
  
  public static void b(View paramView, a.c paramc)
  {
    GMTrace.i(8869644337152L, 66084);
    if (plL)
    {
      paramc.qlE = false;
      paramc.qlC = ((ViewStub)paramView.findViewById(i.f.pdK));
      paramc.qlC.setVisibility(8);
    }
    GMTrace.o(8869644337152L, 66084);
  }
  
  public static void bhC()
  {
    GMTrace.i(8869375901696L, 66082);
    if (g.BY().hb("6") != null)
    {
      pmw = g.BY().hb("6").value;
      w.d("MicroMsg.SellerABTestManager", "startABTest, value:%s", new Object[] { pmw });
      plL = true;
      a.vgX.b(plU);
      pmy = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8871254949888L, 66096);
          if ((paramAnonymousView.getTag() instanceof m))
          {
            m localm = (m)paramAnonymousView.getTag();
            if ((localm != null) && (!bg.nm(localm.blE()))) {
              c.av(paramAnonymousView.getContext(), localm.blE());
            }
          }
          GMTrace.o(8871254949888L, 66096);
        }
      };
    }
    GMTrace.o(8869375901696L, 66082);
  }
  
  public static void bhD()
  {
    GMTrace.i(8869510119424L, 66083);
    pmy = null;
    a.vgX.c(plU);
    if (plL)
    {
      g.BY().hb("6").gpK = 2L;
      g.BY().hb("6").result = pmx.size();
      f.a(g.BY().hb("6"));
      w.d("MicroMsg.SellerABTestManager", "endABTestWhenExitTimeline, scene:%d, result:%s", new Object[] { Integer.valueOf(2), pmx.size() });
    }
    pmw = "0";
    plL = false;
    pmx.clear();
    GMTrace.o(8869510119424L, 66083);
  }
  
  public static void j(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(16046937341952L, 119559);
    Object localObject;
    if (plL)
    {
      g.BY().hb("6").gpK = 3L;
      localObject = new StringBuilder();
      if (!paramBoolean) {
        break label133;
      }
    }
    label133:
    for (int i = 2;; i = 1)
    {
      localObject = i + "|" + paramLong;
      g.BY().hb("6").result = ((String)localObject);
      f.a(g.BY().hb("6"));
      w.d("MicroMsg.SellerABTestManager", "endABTestWhenFinishBlock, snsSvrId:%d, isBlock:%b, scene:%d, actionResult:%s", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(paramBoolean), Integer.valueOf(3), localObject });
      GMTrace.o(16046937341952L, 119559);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\abtest\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */