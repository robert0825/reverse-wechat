package com.tencent.mm.plugin.emoji.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.emoji.a.a.f;
import com.tencent.mm.protocal.c.qw;
import com.tencent.mm.protocal.c.qy;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.ArrayList;
import java.util.List;

public final class e
{
  public int kkn;
  public List<f> kko;
  public qw kkp;
  public List<qw> kkq;
  public List<qy> kkr;
  public List<qy> kks;
  
  public e()
  {
    GMTrace.i(11318312566784L, 84328);
    GMTrace.o(11318312566784L, 84328);
  }
  
  public final void aq(List<f> paramList)
  {
    GMTrace.i(11318715219968L, 84331);
    if (this.kko == null) {
      this.kko = new ArrayList();
    }
    for (;;)
    {
      this.kko.addAll(paramList);
      GMTrace.o(11318715219968L, 84331);
      return;
      int i = this.kko.size() - 1;
      if ((i >= 0) && (i < this.kko.size()))
      {
        f localf = (f)this.kko.get(i);
        if ((localf != null) && (localf.khA != null) && (!bg.nm(localf.khA.tRS)) && (localf.khA.tRS.equals(EmojiGroupInfo.vCl))) {
          this.kko.remove(localf);
        }
      }
    }
  }
  
  public final void arc()
  {
    GMTrace.i(11318581002240L, 84330);
    if (this.kks == null)
    {
      GMTrace.o(11318581002240L, 84330);
      return;
    }
    if (this.kks.isEmpty())
    {
      GMTrace.o(11318581002240L, 84330);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.kks);
    int i = localArrayList.size() - 1;
    while (i >= 0)
    {
      this.kko.add(0, new f((qy)localArrayList.get(i)));
      this.kkn += 1;
      this.kks.remove(localArrayList.get(i));
      i -= 1;
    }
    GMTrace.o(11318581002240L, 84330);
  }
  
  public final void mH(int paramInt)
  {
    GMTrace.i(11318446784512L, 84329);
    this.kkn += paramInt;
    GMTrace.o(11318446784512L, 84329);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */