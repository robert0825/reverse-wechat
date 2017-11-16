package com.tencent.mm.plugin.sns.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsBlackDetailUI
  extends SnsTagDetailUI
  implements e, m.b
{
  public SnsBlackDetailUI()
  {
    GMTrace.i(8696235032576L, 64792);
    GMTrace.o(8696235032576L, 64792);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8697577209856L, 64802);
    w.i("MicroMsg.SnsBlackDetailUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.hsU != null) {
      this.hsU.dismiss();
    }
    GMTrace.o(8697577209856L, 64802);
  }
  
  protected final void aLm()
  {
    GMTrace.i(8697040338944L, 64798);
    if (((this.qfZ + " " + bg.c(this.qfY, ",")).equals(this.eDW)) && (this.psT != 0L))
    {
      finish();
      GMTrace.o(8697040338944L, 64798);
      return;
    }
    if (ae.bjj().p(this.psT, this.qfZ))
    {
      com.tencent.mm.ui.base.h.b(this, getString(i.j.pkE, new Object[] { this.qfZ }), getString(i.j.cUG), true);
      GMTrace.o(8697040338944L, 64798);
      return;
    }
    Object localObject2 = bow();
    LinkedList localLinkedList = new LinkedList();
    Object localObject1 = new LinkedList();
    Iterator localIterator = ((List)localObject2).iterator();
    String str;
    while (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (!this.qfY.contains(str)) {
        localLinkedList.add(str);
      }
    }
    localIterator = this.qfY.iterator();
    while (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (!((List)localObject2).contains(str)) {
        ((List)localObject1).add(str);
      }
    }
    localObject2 = localLinkedList.iterator();
    while (((Iterator)localObject2).hasNext()) {
      s.m((String)((Iterator)localObject2).next(), false);
    }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      s.m((String)((Iterator)localObject1).next(), true);
    }
    com.tencent.mm.plugin.sns.c.a.hnI.pr();
    finish();
    GMTrace.o(8697040338944L, 64798);
  }
  
  protected final void bF(List<String> paramList)
  {
    GMTrace.i(8697442992128L, 64801);
    ar localar = ae.biR();
    String str1 = q.zE();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str2 = (String)paramList.next();
      if ((!this.qfY.contains(str2)) && (com.tencent.mm.l.a.eE(localar.TE(str2).field_type)) && (!str1.equals(str2))) {
        this.qfY.add(str2);
      }
    }
    if (this.jNs != null) {
      this.jNs.aQ(this.qfY);
    }
    anv();
    GMTrace.o(8697442992128L, 64801);
  }
  
  public final void bot()
  {
    GMTrace.i(8696369250304L, 64793);
    w.d("MicroMsg.SnsBlackDetailUI", "SnsBlackDetailUI __onCreate");
    com.tencent.mm.kernel.h.xz();
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().a(this);
    GMTrace.o(8696369250304L, 64793);
  }
  
  protected final void bou()
  {
    GMTrace.i(8696503468032L, 64794);
    w.d("MicroMsg.SnsBlackDetailUI", "SnsBlackDetailUI __onDestroy");
    com.tencent.mm.kernel.h.xz();
    if (com.tencent.mm.kernel.h.xw().wL())
    {
      com.tencent.mm.kernel.h.xz();
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().b(this);
    }
    GMTrace.o(8696503468032L, 64794);
  }
  
  protected final void bov()
  {
    GMTrace.i(8696906121216L, 64797);
    GMTrace.o(8696906121216L, 64797);
  }
  
  protected final List<String> bow()
  {
    GMTrace.i(8697174556672L, 64799);
    Object localObject = new LinkedList();
    if (this.psT == 4L)
    {
      new LinkedList();
      localObject = s.At();
      GMTrace.o(8697174556672L, 64799);
      return (List<String>)localObject;
    }
    GMTrace.o(8697174556672L, 64799);
    return (List<String>)localObject;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8696637685760L, 64795);
    super.onCreate(paramBundle);
    w.d("MicroMsg.SnsBlackDetailUI", "SnsBlackDetailUI onCreate");
    GMTrace.o(8696637685760L, 64795);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8696771903488L, 64796);
    if (this.hsU != null) {
      this.hsU.dismiss();
    }
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(290, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(291, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(292, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(293, this);
    com.tencent.mm.kernel.h.xz();
    if (com.tencent.mm.kernel.h.xw().wL())
    {
      com.tencent.mm.kernel.h.xz();
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().b(this);
    }
    super.onDestroy();
    GMTrace.o(8696771903488L, 64796);
  }
  
  protected final void uT(String paramString)
  {
    GMTrace.i(8697308774400L, 64800);
    super.uT(paramString);
    GMTrace.o(8697308774400L, 64800);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsBlackDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */