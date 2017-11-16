package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class z
{
  public static void a(Context paramContext, Set<Long> paramSet, dx paramdx)
  {
    GMTrace.i(2241436057600L, 16700);
    if (paramContext == null)
    {
      w.w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, context is null");
      GMTrace.o(2241436057600L, 16700);
      return;
    }
    if ((paramSet == null) || (paramSet.isEmpty()))
    {
      w.w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, select ids is empty");
      GMTrace.o(2241436057600L, 16700);
      return;
    }
    paramContext.getString(R.l.cUG);
    paramContext = h.a(paramContext, paramContext.getString(R.l.dmG), false, null);
    da.wzX.c(new a(paramSet, paramContext, paramdx));
    com.tencent.mm.plugin.report.service.g.ork.i(10811, new Object[] { Integer.valueOf(4), Integer.valueOf(paramSet.size()) });
    GMTrace.o(2241436057600L, 16700);
  }
  
  private static final class a
    implements ar.a
  {
    private Set<Long> wux;
    private r wuy;
    private dx wuz;
    
    public a(Set<Long> paramSet, r paramr, dx paramdx)
    {
      GMTrace.i(2213250334720L, 16490);
      this.wux = paramSet;
      this.wuy = paramr;
      this.wuz = paramdx;
      GMTrace.o(2213250334720L, 16490);
    }
    
    public final boolean Dj()
    {
      GMTrace.i(2213384552448L, 16491);
      Object localObject1 = this.wux;
      LinkedList localLinkedList = new LinkedList();
      localObject1 = ((Set)localObject1).iterator();
      if (((Iterator)localObject1).hasNext())
      {
        Long localLong = (Long)((Iterator)localObject1).next();
        at.AR();
        Object localObject2 = com.tencent.mm.y.c.yM().cM(localLong.longValue());
        if (((ce)localObject2).field_msgId == localLong.longValue())
        {
          if (!((au)localObject2).aCp()) {
            break label150;
          }
          com.tencent.mm.modelstat.b.gWv.d((au)localObject2, com.tencent.mm.x.g.g((au)localObject2));
        }
        for (;;)
        {
          localLinkedList.add(localLong);
          localObject2 = new mn();
          ((mn)localObject2).eRu.type = 3;
          ((mn)localObject2).eRu.eDr = localLong.longValue();
          a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
          break;
          label150:
          com.tencent.mm.modelstat.b.gWv.u((au)localObject2);
        }
      }
      bc.w(localLinkedList);
      if (this.wuz != null) {
        this.wuz.a(dx.a.wFR);
      }
      GMTrace.o(2213384552448L, 16491);
      return true;
    }
    
    public final boolean Dk()
    {
      GMTrace.i(2213518770176L, 16492);
      if (this.wuy != null)
      {
        this.wuy.dismiss();
        if (this.wuz != null) {
          this.wuz.b(dx.a.wFR);
        }
      }
      GMTrace.o(2213518770176L, 16492);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */