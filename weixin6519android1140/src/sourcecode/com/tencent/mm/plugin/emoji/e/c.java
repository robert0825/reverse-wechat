package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public class c
{
  public static c kii;
  public ArrayList<String> kij;
  public boolean kik;
  public boolean kil;
  
  public c()
  {
    GMTrace.i(11550911889408L, 86061);
    this.kij = new ArrayList();
    this.kik = true;
    this.kil = false;
    GMTrace.o(11550911889408L, 86061);
  }
  
  public static void a(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    GMTrace.i(11551180324864L, 86063);
    if (paramEmojiInfo != null)
    {
      paramEmojiInfo.field_reserved4 = 0;
      com.tencent.mm.plugin.emoji.model.h.arl().kjy.q(paramEmojiInfo);
      com.tencent.mm.plugin.emoji.model.h.arf().g(paramEmojiInfo);
      if (paramBoolean)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(231L, 0L, 1L, false);
        GMTrace.o(11551180324864L, 86063);
        return;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(231L, 1L, 1L, false);
    }
    GMTrace.o(11551180324864L, 86063);
  }
  
  public static c aqt()
  {
    GMTrace.i(11551046107136L, 86062);
    if (kii == null) {}
    try
    {
      kii = new c();
      c localc = kii;
      GMTrace.o(11551046107136L, 86062);
      return localc;
    }
    finally {}
  }
  
  static boolean aqu()
  {
    GMTrace.i(11551448760320L, 86065);
    if ((am.is3G(ab.getContext())) || (am.is4G(ab.getContext())) || (am.is2G(ab.getContext())))
    {
      GMTrace.o(11551448760320L, 86065);
      return true;
    }
    GMTrace.o(11551448760320L, 86065);
    return false;
  }
  
  public final void b(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    GMTrace.i(11551314542592L, 86064);
    if (this.kij == null) {
      this.kij = new ArrayList();
    }
    this.kij.add(paramEmojiInfo.field_groupId);
    paramEmojiInfo = new com.tencent.mm.plugin.emoji.f.g(paramEmojiInfo.field_groupId);
    at.wS().a(paramEmojiInfo, 0);
    if (paramBoolean)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(231L, 3L, 1L, false);
      GMTrace.o(11551314542592L, 86064);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.a(231L, 2L, 1L, false);
    GMTrace.o(11551314542592L, 86064);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */