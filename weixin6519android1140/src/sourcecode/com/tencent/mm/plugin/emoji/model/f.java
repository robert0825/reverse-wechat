package com.tencent.mm.plugin.emoji.model;

import android.content.Context;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.fn;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class f
{
  public Set<String> kkt;
  com.tencent.mm.sdk.b.c<fn> kku;
  private c.a kkv;
  
  public f()
  {
    GMTrace.i(15571940802560L, 116020);
    this.kku = new com.tencent.mm.sdk.b.c() {};
    this.kkv = new c.a()
    {
      public final void h(EmojiInfo paramAnonymousEmojiInfo)
      {
        GMTrace.i(15571806584832L, 116019);
        if ((paramAnonymousEmojiInfo != null) && (f.this.kkt.remove(paramAnonymousEmojiInfo.GS())))
        {
          w.i("MicroMsg.FTS.FTSEmojiLogic", "emojiServiceCallback onDownload %s", new Object[] { paramAnonymousEmojiInfo.GS() });
          fn localfn = new fn();
          localfn.eHT.eCx = 2;
          localfn.eHT.eHV = paramAnonymousEmojiInfo.field_designerID;
          localfn.eHT.name = paramAnonymousEmojiInfo.field_name;
          localfn.eHT.aeskey = paramAnonymousEmojiInfo.field_aeskey;
          localfn.eHT.eHW = paramAnonymousEmojiInfo.field_encrypturl;
          localfn.eHT.thumbUrl = paramAnonymousEmojiInfo.field_thumbUrl;
          localfn.eHT.eDW = paramAnonymousEmojiInfo.field_md5;
          localfn.eHT.eEa = paramAnonymousEmojiInfo.field_groupId;
          String str = paramAnonymousEmojiInfo.bUU();
          EmojiInfo localEmojiInfo = h.arl().kjy.UK(paramAnonymousEmojiInfo.GS());
          if ((localEmojiInfo != null) && ((localEmojiInfo.field_reserved4 & EmojiInfo.vCJ) == EmojiInfo.vCJ))
          {
            paramAnonymousEmojiInfo = new File(ab.getContext().getExternalCacheDir(), g.n(paramAnonymousEmojiInfo.GS().getBytes())).getAbsolutePath();
            if ((FileOp.aZ(str)) && (!FileOp.aZ(paramAnonymousEmojiInfo))) {
              e.d(paramAnonymousEmojiInfo, ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a(localEmojiInfo));
            }
          }
          for (localfn.eHU.path = paramAnonymousEmojiInfo;; localfn.eHU.path = str)
          {
            a.vgX.a(localfn, Looper.getMainLooper());
            GMTrace.o(15571806584832L, 116019);
            return;
          }
        }
        w.i("MicroMsg.FTS.FTSEmojiLogic", "somethings error.");
        GMTrace.o(15571806584832L, 116019);
      }
    };
    this.kkt = Collections.synchronizedSet(new HashSet());
    h.arf().kki = this.kkv;
    this.kku.bPu();
    GMTrace.o(15571940802560L, 116020);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */