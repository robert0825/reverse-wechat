package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MergeCursor;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.a.g;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.List;

public final class b
  extends o
  implements m.b
{
  private int fromScene;
  private Cursor hqX;
  int ooS;
  int ooT;
  private List<String> ooU;
  private int ooV;
  
  public b(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList1, List<String> paramList2, int paramInt)
  {
    super(paramMMBaseSelectContactUI, paramList2, true, false);
    GMTrace.i(17408039321600L, 129700);
    this.ooV = 0;
    this.ooU = paramList1;
    this.fromScene = paramInt;
    w.i("MicroMsg.RecentConversationAdapter", "create!");
    ayE();
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().a(this);
    GMTrace.o(17408039321600L, 129700);
  }
  
  private void ayE()
  {
    GMTrace.i(10825196634112L, 80654);
    w.i("MicroMsg.RecentConversationAdapter", "resetData");
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    this.ooV = 0;
    ArrayList localArrayList = new ArrayList();
    this.ooS = -1;
    this.ooT = -1;
    Object localObject;
    int i;
    if ((this.ooU != null) && (this.ooU.size() > 0))
    {
      com.tencent.mm.kernel.h.xz();
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().cm(this.ooU);
      localArrayList.add(localObject);
      i = ((Cursor)localObject).getCount();
      if (i > 0)
      {
        this.ooS = this.wSB.bho().getHeaderViewsCount();
        this.ooV += 1;
      }
    }
    for (;;)
    {
      localObject = this.iVA;
      if (localObject != null)
      {
        ((List)localObject).addAll(this.ooU);
        label170:
        if (this.fromScene != 1) {
          break label299;
        }
        localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().b(s.gmw, (List)localObject, this.wSS, "");
        label207:
        if (((Cursor)localObject).getCount() <= 0) {
          break label350;
        }
        this.ooV += 1;
        if (i <= 0) {
          break label331;
        }
        this.ooT = (i + this.ooS + 1);
      }
      for (;;)
      {
        localArrayList.add(localObject);
        this.hqX = new MergeCursor((Cursor[])localArrayList.toArray(new Cursor[0]));
        GMTrace.o(10825196634112L, 80654);
        return;
        this.ooS = -1;
        break;
        localObject = this.ooU;
        break label170;
        label299:
        localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().b(s.gmA, (List)localObject, this.wSS, "");
        break label207;
        label331:
        this.ooT = this.wSB.bho().getHeaderViewsCount();
        continue;
        label350:
        this.ooT = -1;
      }
      i = 0;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(10825733505024L, 80658);
    ayE();
    notifyDataSetChanged();
    GMTrace.o(10825733505024L, 80658);
  }
  
  public final void finish()
  {
    GMTrace.i(10825599287296L, 80657);
    super.finish();
    w.i("MicroMsg.RecentConversationAdapter", "finish!");
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().b(this);
    GMTrace.o(10825599287296L, 80657);
  }
  
  public final int getCount()
  {
    GMTrace.i(10825465069568L, 80656);
    int i = this.hqX.getCount();
    int j = this.ooV;
    GMTrace.o(10825465069568L, 80656);
    return i + j;
  }
  
  protected final a hG(int paramInt)
  {
    GMTrace.i(10825330851840L, 80655);
    Object localObject2;
    Object localObject1;
    if ((paramInt == this.ooT) || (paramInt == this.ooS))
    {
      localObject2 = new g(paramInt);
      if (paramInt == this.ooS) {
        if (this.fromScene == 1)
        {
          ((g)localObject2).lAh = this.wSB.getActivity().getResources().getString(a.i.sRv);
          localObject1 = localObject2;
        }
      }
    }
    for (;;)
    {
      GMTrace.o(10825330851840L, 80655);
      return (a)localObject1;
      ((g)localObject2).lAh = this.wSB.getActivity().getResources().getString(a.i.sYm);
      localObject1 = localObject2;
      continue;
      localObject1 = localObject2;
      if (paramInt == this.ooT)
      {
        ((g)localObject2).lAh = this.wSB.getActivity().getResources().getString(a.i.tgl);
        localObject1 = localObject2;
        continue;
        int i;
        if (this.ooV == 2) {
          if (paramInt > this.ooT) {
            i = paramInt - 2;
          }
        }
        for (;;)
        {
          if (!this.hqX.moveToPosition(i)) {
            break label333;
          }
          localObject1 = new e(paramInt);
          localObject2 = new ae();
          ((ae)localObject2).b(this.hqX);
          com.tencent.mm.kernel.h.xz();
          ((a)localObject1).iBi = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().Tz(((aj)localObject2).field_username);
          if (((a)localObject1).iBi == null)
          {
            com.tencent.mm.kernel.h.xz();
            ((a)localObject1).iBi = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TD(((aj)localObject2).field_username);
          }
          break;
          i = paramInt - 1;
          continue;
          if (this.ooV == 1)
          {
            i = paramInt - 1;
          }
          else
          {
            w.e("MicroMsg.RecentConversationAdapter", "Actually dead branch. position=%d", new Object[] { Integer.valueOf(paramInt) });
            i = paramInt;
          }
        }
        label333:
        localObject1 = null;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */