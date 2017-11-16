package com.tencent.mm.plugin.order.model;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public static com.tencent.mm.plugin.order.ui.a.e a(final Context paramContext, MallTransactionObject paramMallTransactionObject)
  {
    GMTrace.i(6620826304512L, 49329);
    com.tencent.mm.plugin.order.ui.a.e locale = new com.tencent.mm.plugin.order.ui.a.e(paramContext);
    if (!bg.nm(paramMallTransactionObject.nEB)) {}
    for (locale.nGH = paramContext.getString(a.i.tdw);; locale.nGH = paramContext.getString(a.i.tdz))
    {
      locale.mOnClickListener = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6621631610880L, 49335);
          paramAnonymousView = new LinkedList();
          LinkedList localLinkedList = new LinkedList();
          if (!bg.nm(this.nDY.nEs))
          {
            localLinkedList.add(Integer.valueOf(0));
            paramAnonymousView.add(paramContext.getString(a.i.tdx));
          }
          if (!bg.nm(this.nDY.nDU))
          {
            localLinkedList.add(Integer.valueOf(1));
            paramAnonymousView.add(paramContext.getString(a.i.tdy));
          }
          if (!bg.nm(this.nDY.nEB))
          {
            localLinkedList.add(Integer.valueOf(2));
            paramAnonymousView.add(paramContext.getString(a.i.tdA));
          }
          if (localLinkedList.size() == 1)
          {
            a.a(((Integer)localLinkedList.get(0)).intValue(), paramContext, this.nDY);
            GMTrace.o(6621631610880L, 49335);
            return;
          }
          com.tencent.mm.ui.base.h.a(paramContext, null, paramAnonymousView, localLinkedList, null, true, new h.d()
          {
            public final void bT(int paramAnonymous2Int1, int paramAnonymous2Int2)
            {
              GMTrace.i(6630758416384L, 49403);
              a.a(paramAnonymous2Int2, a.1.this.val$context, a.1.this.nDY);
              GMTrace.o(6630758416384L, 49403);
            }
          });
          GMTrace.o(6621631610880L, 49335);
        }
      };
      GMTrace.o(6620826304512L, 49329);
      return locale;
    }
  }
  
  public static void a(int paramInt, Context paramContext, MallTransactionObject paramMallTransactionObject)
  {
    GMTrace.i(6620960522240L, 49330);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(6620960522240L, 49330);
      return;
      com.tencent.mm.kernel.h.xz();
      x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramMallTransactionObject.nEs);
      if ((localx != null) && (com.tencent.mm.l.a.eE(localx.field_type)))
      {
        com.tencent.mm.wallet_core.ui.e.bp(paramContext, paramMallTransactionObject.nEs);
        GMTrace.o(6620960522240L, 49330);
        return;
      }
      com.tencent.mm.wallet_core.ui.e.P(paramContext, paramMallTransactionObject.nEs);
      GMTrace.o(6620960522240L, 49330);
      return;
      com.tencent.mm.wallet_core.ui.e.bq(paramContext, paramMallTransactionObject.nDU);
      GMTrace.o(6620960522240L, 49330);
      return;
      com.tencent.mm.wallet_core.ui.e.m(paramContext, paramMallTransactionObject.nEB, false);
    }
  }
  
  public static abstract interface a
  {
    public abstract List<Preference> a(Context paramContext, f paramf, MallTransactionObject paramMallTransactionObject);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */