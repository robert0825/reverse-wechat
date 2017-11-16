package com.tencent.mm.plugin.emoji.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.g.a.td;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.f.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.y.at;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class i
{
  public Set<String> kkW;
  public Set<String> kkX;
  public Set<String> kkY;
  c kkZ;
  c kla;
  
  public i()
  {
    GMTrace.i(11306232971264L, 84238);
    this.kkZ = new c() {};
    this.kla = new c() {};
    com.tencent.mm.sdk.b.a.vgX.b(this.kkZ);
    com.tencent.mm.sdk.b.a.vgX.b(this.kla);
    this.kkW = Collections.synchronizedSet(new HashSet());
    this.kkX = Collections.synchronizedSet(new HashSet());
    this.kkY = Collections.synchronizedSet(new HashSet());
    GMTrace.o(11306232971264L, 84238);
  }
  
  public final void arp()
  {
    GMTrace.i(11306367188992L, 84239);
    for (;;)
    {
      if (this.kkX.isEmpty())
      {
        w.i("MicroMsg.emoji.WearEmojiLogic", "no emoji need download");
        GMTrace.o(11306367188992L, 84239);
        return;
      }
      if (!this.kkY.isEmpty())
      {
        w.i("MicroMsg.emoji.WearEmojiLogic", "downloading emoji %s", new Object[] { this.kkY.toString() });
        GMTrace.o(11306367188992L, 84239);
        return;
      }
      localObject = this.kkX.iterator();
      if (localObject == null) {
        break label204;
      }
      localObject = (String)((Iterator)localObject).next();
      this.kkX.remove(localObject);
      EmojiGroupInfo localEmojiGroupInfo = h.arl().kjz.aW((String)localObject, true);
      if ((localEmojiGroupInfo == null) || ((localEmojiGroupInfo.field_flag & 0x100) <= 0)) {
        break;
      }
      w.i("MicroMsg.emoji.WearEmojiLogic", "emoji already exist %s", new Object[] { localObject });
    }
    w.i("MicroMsg.emoji.WearEmojiLogic", "start to download emoji %s", new Object[] { localObject });
    this.kkY.add(localObject);
    Object localObject = new g((String)localObject, "");
    at.wS().a((k)localObject, 0);
    label204:
    GMTrace.o(11306367188992L, 84239);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */