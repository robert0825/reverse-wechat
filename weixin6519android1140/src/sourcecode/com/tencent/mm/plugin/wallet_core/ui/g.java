package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.b;
import com.tencent.mm.plugin.wallet_core.model.b.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.a;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
{
  public static Dialog a(Context paramContext, List<Bankcard> paramList, String paramString1, String paramString2, Bankcard paramBankcard, h.a parama)
  {
    GMTrace.i(6917850136576L, 51542);
    LinkedList localLinkedList = new LinkedList();
    if (((paramList == null) || (paramList.size() == 0)) && (bg.nm(paramString1)))
    {
      w.w("MicroMsg.WalletDialogHelper", "hy: bankcard list is null and should not show new");
      GMTrace.o(6917850136576L, 51542);
      return null;
    }
    int i;
    if ((paramList != null) && (paramList.size() != 0))
    {
      paramList = paramList.iterator();
      i = 0;
      for (int j = 0; paramList.hasNext(); j = k)
      {
        Bankcard localBankcard = (Bankcard)paramList.next();
        localLinkedList.add(localBankcard.field_desc);
        k = j;
        if (paramBankcard != null)
        {
          k = j;
          if (paramBankcard.equals(localBankcard)) {
            k = i;
          }
        }
        i += 1;
      }
      k = j;
      if (!bg.nm(paramString1))
      {
        localLinkedList.add(paramString1);
        k = j;
        if (paramBankcard != null) {}
      }
    }
    for (int k = i;; k = 0)
    {
      paramContext = h.a(paramContext, paramString2, localLinkedList, k, parama);
      GMTrace.o(6917850136576L, 51542);
      return paramContext;
      w.i("MicroMsg.WalletDialogHelper", "hy: no bankcard show new only");
      localLinkedList.add(paramString1);
    }
  }
  
  public static i a(Context paramContext, b paramb, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(6917984354304L, 51543);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(6917984354304L, 51543);
      return null;
    }
    if ((paramb == null) || ((TextUtils.isEmpty(paramb.rev)) && ((paramb.rew == null) || (paramb.rew.isEmpty()))))
    {
      w.w("MicroMsg.WalletDialogHelper", "show showBalanceFetchAlert alert fail");
      GMTrace.o(6917984354304L, 51543);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.lz(false);
    locala.BR(a.i.cSk).b(paramOnClickListener2);
    if (paramBoolean) {
      locala.BQ(a.i.sZf).a(paramOnClickListener1);
    }
    for (;;)
    {
      paramOnClickListener1 = View.inflate(paramContext, a.g.sPp, null);
      if ((paramb.rew == null) || (paramb.rew.isEmpty())) {
        break;
      }
      paramOnClickListener2 = (LinearLayout)paramOnClickListener1.findViewById(a.f.brL);
      paramOnClickListener2.removeAllViews();
      int i = 0;
      while ((i < paramb.rew.size()) && (i < paramb.rew.size()))
      {
        View localView = View.inflate(paramContext, a.g.sPo, null);
        TextView localTextView1 = (TextView)localView.findViewById(a.f.title);
        TextView localTextView2 = (TextView)localView.findViewById(a.f.subtitle);
        localTextView1.setText(((b.a)paramb.rew.get(i)).amf);
        localTextView2.setText(((b.a)paramb.rew.get(i)).value);
        paramOnClickListener2.addView(localView, i);
        i += 1;
      }
      locala.BN(a.i.sZj);
      locala.BQ(a.i.sZm).a(paramOnClickListener1);
    }
    w.e("MicroMsg.WalletDialogHelper", "fetch itemsList is empty");
    ((TextView)paramOnClickListener1.findViewById(a.f.title)).setText(paramb.rev);
    if (paramBoolean)
    {
      paramb = (TextView)paramOnClickListener1.findViewById(a.f.chB);
      paramb.setVisibility(0);
      paramb.setText(paramContext.getString(a.i.sZg));
    }
    locala.dg(paramOnClickListener1);
    paramb = locala.aax();
    paramb.show();
    h.a(paramContext, paramb);
    GMTrace.o(6917984354304L, 51543);
    return paramb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */