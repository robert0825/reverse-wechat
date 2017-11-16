package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.d;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.y.at;

public class a
  extends aj
{
  public static int klc;
  private static a kld;
  private static q kle;
  private static e klf;
  
  static
  {
    GMTrace.i(11290932150272L, 84124);
    klc = 0;
    klf = new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(11285966094336L, 84087);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          a.arq().ars();
          GMTrace.o(11285966094336L, 84087);
          return;
        }
        a.klc = 0;
        a.arq().z(50L, 50L);
        GMTrace.o(11285966094336L, 84087);
      }
    };
    GMTrace.o(11290932150272L, 84124);
  }
  
  private a()
  {
    super(new a(), true);
    GMTrace.i(11290529497088L, 84121);
    GMTrace.o(11290529497088L, 84121);
  }
  
  public static final a arq()
  {
    GMTrace.i(11289992626176L, 84117);
    if (kld == null) {}
    for (;;)
    {
      try
      {
        if (kld == null) {
          kld = new a();
        }
        a locala = kld;
        GMTrace.o(11289992626176L, 84117);
        return locala;
      }
      finally {}
      kld.stopTimer();
    }
  }
  
  public static void arr()
  {
    GMTrace.i(11290126843904L, 84118);
    klc = 0;
    kle = new q("com.tencent.xin.emoticon.tusiji", 1);
    at.wS().a(kle, 0);
    at.wS().a(413, klf);
    w.d("MicroMsg.emoji.MockTuziDownloading", "add listener");
    GMTrace.o(11290126843904L, 84118);
  }
  
  public static void art()
  {
    GMTrace.i(11290395279360L, 84120);
    if (kle != null) {
      at.wS().c(kle);
    }
    at.wS().b(413, klf);
    w.d("MicroMsg.emoji.MockTuziDownloading", "remove listener");
    GMTrace.o(11290395279360L, 84120);
  }
  
  public final void ars()
  {
    GMTrace.i(11290261061632L, 84119);
    stopTimer();
    h.arn().f(com.tencent.mm.plugin.emoji.h.a.ati(), 3, klc, "");
    art();
    GMTrace.o(11290261061632L, 84119);
  }
  
  public static final class a
    implements aj.a
  {
    public a()
    {
      GMTrace.i(11302072221696L, 84207);
      a.klc = 0;
      GMTrace.o(11302072221696L, 84207);
    }
    
    public final boolean pM()
    {
      GMTrace.i(11302206439424L, 84208);
      if (a.klc >= 100)
      {
        a.klc = 0;
        w.d("MicroMsg.emoji.EmojiTuziTool", "insert tuzi");
        com.tencent.mm.storage.emotion.a locala = h.arl().kjz;
        EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
        localEmojiGroupInfo.field_productID = com.tencent.mm.plugin.emoji.h.a.ati();
        localEmojiGroupInfo.field_packName = "emoji_custom_all";
        localEmojiGroupInfo.field_type = EmojiGroupInfo.TYPE_SYSTEM;
        localEmojiGroupInfo.field_sort = 1;
        localEmojiGroupInfo.field_idx = 0;
        localEmojiGroupInfo.field_packType = 4;
        localEmojiGroupInfo.field_packFlag = 1;
        localEmojiGroupInfo.field_lastUseTime = System.currentTimeMillis();
        locala.c(localEmojiGroupInfo);
        h.arn().f(com.tencent.mm.plugin.emoji.h.a.ati(), 7, a.klc, "");
        a.art();
        GMTrace.o(11302206439424L, 84208);
        return false;
      }
      h.arn().f(com.tencent.mm.plugin.emoji.h.a.ati(), 6, a.klc, "");
      a.klc += 2;
      GMTrace.o(11302206439424L, 84208);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */