package com.tencent.mm.ui.contact;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.af.d;
import com.tencent.mm.af.e;
import com.tencent.mm.af.e.a;
import com.tencent.mm.af.e.a.b;
import com.tencent.mm.af.x;
import com.tencent.mm.l.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i
  extends LinearLayout
  implements e.a
{
  private Context context;
  private LinearLayout lgp;
  private List<String> wRX;
  private Map<String, View> wRY;
  private a wRZ;
  
  public i(Context paramContext, a parama)
  {
    super(paramContext);
    GMTrace.i(1734227263488L, 12921);
    this.lgp = null;
    this.context = paramContext;
    this.wRZ = parama;
    init();
    GMTrace.o(1734227263488L, 12921);
  }
  
  private void init()
  {
    int j = 0;
    GMTrace.i(1734495698944L, 12923);
    Object localObject2 = x.FG();
    Object localObject1 = new ArrayList();
    Object localObject3 = new StringBuilder();
    e.a((StringBuilder)localObject3);
    e.c((StringBuilder)localObject3);
    ((StringBuilder)localObject3).append(" and bizinfo.type").append(" = 2 ");
    ((StringBuilder)localObject3).append(" order by ");
    ((StringBuilder)localObject3).append(e.Fj());
    localObject3 = ((StringBuilder)localObject3).toString();
    w.i("MicroMsg.BizInfoStorage", "getEnterpriseFatherBizLst sql %s", new Object[] { localObject3 });
    localObject2 = ((e)localObject2).rawQuery((String)localObject3, new String[0]);
    if (localObject2 != null)
    {
      if (((Cursor)localObject2).moveToFirst()) {
        do
        {
          ((ArrayList)localObject1).add(((Cursor)localObject2).getString(0));
        } while (((Cursor)localObject2).moveToNext());
      }
      ((Cursor)localObject2).close();
    }
    this.wRX = ((List)localObject1);
    if ((this.wRX == null) || (this.wRX.size() <= 0))
    {
      w.e("MicroMsg.EnterpriseBizView", "bizList is null");
      GMTrace.o(1734495698944L, 12923);
      return;
    }
    w.i("MicroMsg.EnterpriseBizView", "biz list size = %s", new Object[] { Integer.valueOf(this.wRX.size()) });
    this.wRY = new HashMap();
    int i = j;
    if (this.lgp == null)
    {
      View.inflate(getContext(), R.i.cvh, this);
      this.lgp = ((LinearLayout)findViewById(R.h.brL));
      i = j;
    }
    while (i < this.wRX.size())
    {
      localObject1 = (String)this.wRX.get(i);
      localObject2 = new j(getContext(), (String)localObject1);
      this.lgp.addView((View)localObject2);
      this.wRY.put(localObject1, localObject2);
      if (i == this.wRX.size() - 1) {
        ((j)localObject2).findViewById(R.h.bwT).setBackgroundResource(R.g.aXW);
      }
      i += 1;
    }
    GMTrace.o(1734495698944L, 12923);
  }
  
  public final void a(final e.a.b paramb)
  {
    GMTrace.i(1734629916672L, 12924);
    if (paramb.gwX == null)
    {
      GMTrace.o(1734629916672L, 12924);
      return;
    }
    if (!paramb.gwX.EF())
    {
      w.i("MicroMsg.EnterpriseBizView", "onEvent, not enterprise father");
      GMTrace.o(1734629916672L, 12924);
      return;
    }
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1735569440768L, 12931);
        at.AR();
        Object localObject = c.yK().TE(paramb.gvB);
        if ((i.a(i.this) != null) && (i.a(i.this).size() > 0) && (i.a(i.this).contains(paramb.gvB)))
        {
          if ((localObject == null) || ((int)((a)localObject).fTq <= 0) || (!a.eE(((com.tencent.mm.g.b.af)localObject).field_type)))
          {
            w.i("MicroMsg.EnterpriseBizView", "remove enterprise biz view item, %s", new Object[] { paramb.gvB });
            i.a(i.this).remove(paramb.gvB);
            if (i.a(i.this).size() > 0)
            {
              localObject = (View)i.b(i.this).get(paramb.gvB);
              if ((localObject != null) && (i.c(i.this) != null))
              {
                i.c(i.this).removeView((View)localObject);
                i.b(i.this).remove(localObject);
              }
              GMTrace.o(1735569440768L, 12931);
              return;
            }
            if (i.d(i.this) != null)
            {
              if (i.b(i.this) != null) {
                i.b(i.this).clear();
              }
              if (i.c(i.this) != null) {
                i.c(i.this).removeAllViews();
              }
              i.d(i.this).DB(i.a(i.this).size());
              GMTrace.o(1735569440768L, 12931);
            }
          }
        }
        else
        {
          if ((localObject == null) || ((int)((a)localObject).fTq <= 0) || (!a.eE(((com.tencent.mm.g.b.af)localObject).field_type)))
          {
            GMTrace.o(1735569440768L, 12931);
            return;
          }
          if (i.a(i.this) != null) {
            i.a(i.this).clear();
          }
          if (i.b(i.this) != null) {
            i.b(i.this).clear();
          }
          if (i.c(i.this) != null) {
            i.c(i.this).removeAllViews();
          }
          i.e(i.this);
          if (i.d(i.this) != null) {
            i.d(i.this).DB(i.a(i.this).size());
          }
        }
        GMTrace.o(1735569440768L, 12931);
      }
    });
    GMTrace.o(1734629916672L, 12924);
  }
  
  public final int cgs()
  {
    GMTrace.i(1734361481216L, 12922);
    if (this.wRX == null)
    {
      GMTrace.o(1734361481216L, 12922);
      return 0;
    }
    int i = this.wRX.size();
    GMTrace.o(1734361481216L, 12922);
    return i;
  }
  
  public static abstract interface a
  {
    public abstract void DB(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */