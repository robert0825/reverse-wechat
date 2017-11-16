package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.emoji.b;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI;
import com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.qy;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class m
{
  private static void a(Context paramContext, qy paramqy, int paramInt1, int paramInt2)
  {
    GMTrace.i(11562320396288L, 86146);
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, EmojiStoreDetailUI.class);
    localIntent.putExtra("extra_id", paramqy.tRS);
    localIntent.putExtra("extra_name", paramqy.eBt);
    localIntent.putExtra("extra_description", paramqy.lPj);
    localIntent.putExtra("preceding_scence", paramInt2);
    localIntent.putExtra("call_by", 1);
    localIntent.putExtra("download_entrance_scene", paramInt1);
    localIntent.putExtra("check_clickflag", true);
    paramContext.startActivity(localIntent);
    GMTrace.o(11562320396288L, 86146);
  }
  
  public static void a(Context paramContext, qy paramqy, boolean paramBoolean)
  {
    GMTrace.i(11562454614016L, 86147);
    if (paramqy == null)
    {
      w.i("MicroMsg.emoji.EmojiUINavigatorMgr", "banner is null. do nothing");
      GMTrace.o(11562454614016L, 86147);
      return;
    }
    int i;
    String str1;
    String str2;
    Object localObject;
    String str3;
    Intent localIntent;
    switch (paramqy.ugX)
    {
    default: 
      w.i("MicroMsg.emoji.EmojiUINavigatorMgr", "Unkown type do nothing. SetType:%d", new Object[] { Integer.valueOf(paramqy.ugX) });
      GMTrace.o(11562454614016L, 86147);
      return;
    case 0: 
      w.i("MicroMsg.emoji.EmojiUINavigatorMgr", "MM_EMOTION_BANNER_SET_NULL do nothing");
      g.ork.i(13223, new Object[] { Integer.valueOf(1), Integer.valueOf(paramqy.etB), paramqy.eBt, Integer.valueOf(0), Integer.valueOf(0) });
      GMTrace.o(11562454614016L, 86147);
      return;
    case 4: 
      i = paramqy.etB;
      str1 = paramqy.eBt;
      str2 = paramqy.lPj;
      localObject = paramqy.lRV;
      str3 = paramqy.ugW;
      localIntent = new Intent();
      localIntent.putExtra("set_id", i);
      localIntent.putExtra("headurl", str3);
      localIntent.putExtra("set_title", str1);
      localIntent.putExtra("set_iconURL", (String)localObject);
      localIntent.putExtra("set_desc", str2);
      localIntent.setClass(paramContext, EmojiStoreV2SingleProductUI.class);
      paramContext.startActivity(localIntent);
      g.ork.i(13223, new Object[] { Integer.valueOf(1), Integer.valueOf(paramqy.etB), paramqy.eBt, Integer.valueOf(0), Integer.valueOf(1) });
      GMTrace.o(11562454614016L, 86147);
      return;
    case 3: 
      i = paramqy.etB;
      str1 = paramqy.eBt;
      str2 = paramqy.lPj;
      localObject = paramqy.lRV;
      str3 = paramqy.ugW;
      localIntent = new Intent();
      localIntent.setClass(paramContext, EmojiStoreTopicUI.class);
      localIntent.putExtra("topic_id", i);
      localIntent.putExtra("topic_name", str1);
      localIntent.putExtra("topic_ad_url", str3);
      localIntent.putExtra("topic_icon_url", (String)localObject);
      localIntent.putExtra("topic_desc", str2);
      if (paramBoolean) {
        localIntent.putExtra("extra_scence", 15);
      }
      for (;;)
      {
        paramContext.startActivity(localIntent);
        g.ork.i(13223, new Object[] { Integer.valueOf(1), Integer.valueOf(paramqy.etB), paramqy.eBt, Integer.valueOf(0), Integer.valueOf(2) });
        GMTrace.o(11562454614016L, 86147);
        return;
        localIntent.putExtra("extra_scence", 3);
      }
    case 2: 
      str1 = paramqy.ugV;
      str2 = paramqy.eBt;
      localObject = new Intent();
      ((Intent)localObject).putExtra("rawUrl", str1);
      ((Intent)localObject).putExtra("title", str2);
      b.hnH.j((Intent)localObject, paramContext);
      g.ork.i(13223, new Object[] { Integer.valueOf(1), Integer.valueOf(paramqy.etB), paramqy.eBt, Integer.valueOf(0), Integer.valueOf(3) });
      GMTrace.o(11562454614016L, 86147);
      return;
    }
    if (paramBoolean) {
      a(paramContext, paramqy, 15, 8);
    }
    for (;;)
    {
      g.ork.i(13223, new Object[] { Integer.valueOf(1), Integer.valueOf(paramqy.etB), paramqy.eBt, Integer.valueOf(0), Integer.valueOf(4) });
      GMTrace.o(11562454614016L, 86147);
      return;
      a(paramContext, paramqy, 3, 5);
    }
  }
  
  public static void a(Context paramContext, rh paramrh, int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4)
  {
    GMTrace.i(11562186178560L, 86145);
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, EmojiStoreDetailUI.class);
    if (paramrh != null)
    {
      localIntent.putExtra("extra_id", paramrh.tRS);
      localIntent.putExtra("extra_name", paramrh.uhe);
      localIntent.putExtra("extra_copyright", paramrh.uho);
      localIntent.putExtra("extra_coverurl", paramrh.uhm);
      localIntent.putExtra("extra_description", paramrh.uhf);
      localIntent.putExtra("extra_price", paramrh.uhh);
      localIntent.putExtra("extra_type", paramrh.uhi);
      localIntent.putExtra("extra_flag", paramrh.uhj);
      localIntent.putExtra("preceding_scence", paramInt4);
      localIntent.putExtra("call_by", 1);
      localIntent.putExtra("check_clickflag", false);
      localIntent.putExtra("download_entrance_scene", paramInt1);
      if (paramInt2 != -1) {
        localIntent.putExtra("extra_status", paramInt2);
      }
      if (paramInt3 != -1) {
        localIntent.putExtra("extra_progress", -1);
      }
      if (!bg.nm(paramString)) {
        localIntent.putExtra("to_talker_name", paramString);
      }
    }
    for (;;)
    {
      paramContext.startActivity(localIntent);
      GMTrace.o(11562186178560L, 86145);
      return;
      w.i("MicroMsg.emoji.EmojiUINavigatorMgr", "get detail intent failed. summary is null.");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\e\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */