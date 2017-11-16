package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  extends BaseAdapter
{
  private final Context mContext;
  private int mCount;
  private ArrayList<Bankcard> qWd;
  private int qWe;
  com.tencent.mm.plugin.wallet_core.e.a qWf;
  List<String> qWg;
  
  public a(Context paramContext, ArrayList<Bankcard> paramArrayList)
  {
    GMTrace.i(7689602072576L, 57292);
    this.mCount = 0;
    this.mContext = paramContext;
    this.qWd = paramArrayList;
    this.qWe = 0;
    this.qWf = new com.tencent.mm.plugin.wallet_core.e.a();
    this.qWf.b(this.mContext, this.qWd);
    bwS();
    GMTrace.o(7689602072576L, 57292);
  }
  
  private void bwS()
  {
    GMTrace.i(16562601852928L, 123401);
    h.xz();
    this.qWg = bg.g(((String)h.xy().xh().get(w.a.vyS, "")).split(","));
    GMTrace.o(16562601852928L, 123401);
  }
  
  private Bankcard wL(int paramInt)
  {
    GMTrace.i(7690004725760L, 57295);
    if ((paramInt >= 0) && (paramInt < this.mCount))
    {
      Bankcard localBankcard = (Bankcard)this.qWd.get(paramInt);
      GMTrace.o(7690004725760L, 57295);
      return localBankcard;
    }
    GMTrace.o(7690004725760L, 57295);
    return null;
  }
  
  public final void T(ArrayList<Bankcard> paramArrayList)
  {
    GMTrace.i(7689736290304L, 57293);
    this.qWd = paramArrayList;
    if (paramArrayList != null) {}
    for (this.mCount = paramArrayList.size();; this.mCount = 0)
    {
      if (this.mCount > 0) {
        this.qWf.b(this.mContext, this.qWd);
      }
      bwS();
      GMTrace.o(7689736290304L, 57293);
      return;
    }
  }
  
  public int getCount()
  {
    GMTrace.i(7689870508032L, 57294);
    int i = this.mCount;
    GMTrace.o(7689870508032L, 57294);
    return i;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(7690138943488L, 57296);
    long l = paramInt;
    GMTrace.o(7690138943488L, 57296);
    return l;
  }
  
  public int getItemViewType(int paramInt)
  {
    GMTrace.i(7690273161216L, 57297);
    Bankcard localBankcard = wL(paramInt);
    if (localBankcard == null)
    {
      GMTrace.o(7690273161216L, 57297);
      return 4;
    }
    if (localBankcard.field_bankcardState == 9)
    {
      if (localBankcard.field_wxcreditState == 0)
      {
        GMTrace.o(7690273161216L, 57297);
        return 2;
      }
      GMTrace.o(7690273161216L, 57297);
      return 3;
    }
    if ((localBankcard.byc()) && ("CITIC_CREDIT".equals(localBankcard.field_bankcardType)))
    {
      GMTrace.o(7690273161216L, 57297);
      return 5;
    }
    if ((localBankcard.byg()) && (!q.zR()))
    {
      GMTrace.o(7690273161216L, 57297);
      return 0;
    }
    GMTrace.o(7690273161216L, 57297);
    return 1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(7690541596672L, 57299);
    Bankcard localBankcard = wL(paramInt);
    int i = getItemViewType(paramInt);
    boolean bool;
    if ((this.qWg == null) || (this.qWg.isEmpty()) || (localBankcard == null)) {
      bool = false;
    }
    for (;;)
    {
      w.v("MicroMsg.BankcardListAdapter", "getView, pos: %d, bottom_wording: %s, showNew: %s", new Object[] { Integer.valueOf(paramInt), localBankcard.field_card_bottom_wording, Boolean.valueOf(bool) });
      switch (i)
      {
      default: 
        GMTrace.o(7690541596672L, 57299);
        return paramView;
        paramViewGroup = this.qWg.iterator();
        for (;;)
        {
          if (paramViewGroup.hasNext()) {
            if (((String)paramViewGroup.next()).equals(localBankcard.field_bindSerial))
            {
              bool = true;
              break;
            }
          }
        }
        bool = false;
      }
    }
    paramView = com.tencent.mm.plugin.wallet_core.ui.view.b.a(this.mContext, paramView, localBankcard, a.g.sOQ, this.qWf, bool);
    GMTrace.o(7690541596672L, 57299);
    return paramView;
    paramView = com.tencent.mm.plugin.wallet_core.ui.view.b.a(this.mContext, paramView, localBankcard, a.g.sOU, this.qWf, bool);
    GMTrace.o(7690541596672L, 57299);
    return paramView;
    paramInt = a.g.sOY;
    View localView;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      localView = View.inflate(this.mContext, paramInt, null);
      paramView = new a();
      paramView.qWm = ((ImageView)localView.findViewById(a.f.sqk));
      paramView.qWi = ((TextView)localView.findViewById(a.f.sql));
      paramView.qWn = ((TextView)localView.findViewById(a.f.sqt));
      paramView.qWq = ((ImageView)localView.findViewById(a.f.sqv));
      paramView.qWr = ((ImageView)localView.findViewById(a.f.sqw));
      paramView.qWs = ((ImageView)localView.findViewById(a.f.sqx));
      localView.setTag(paramView);
      paramViewGroup = paramView;
      switch (localBankcard.field_wxcreditState)
      {
      case 2: 
      default: 
        paramViewGroup.qWn.setVisibility(8);
      }
    }
    for (;;)
    {
      paramViewGroup.qWi.setText(localBankcard.field_bankName);
      this.qWf.a(this.mContext, localBankcard, paramViewGroup.qWm);
      GMTrace.o(7690541596672L, 57299);
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
      break;
      paramViewGroup.qWn.setBackgroundResource(a.e.spa);
      paramViewGroup.qWn.setVisibility(0);
      continue;
      paramViewGroup.qWn.setBackgroundResource(a.e.soV);
      paramViewGroup.qWn.setVisibility(0);
    }
    paramInt = a.g.sOW;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      localView = View.inflate(this.mContext, paramInt, null);
      paramView = new a();
      paramView.qWm = ((ImageView)localView.findViewById(a.f.sqk));
      paramView.qWi = ((TextView)localView.findViewById(a.f.sql));
      paramView.qWp = ((TextView)localView.findViewById(a.f.sCH));
      paramView.qWq = ((ImageView)localView.findViewById(a.f.sqv));
      paramView.qWr = ((ImageView)localView.findViewById(a.f.sqw));
      paramView.qWs = ((ImageView)localView.findViewById(a.f.sqx));
      localView.setTag(paramView);
      paramViewGroup = paramView;
      paramViewGroup.qWi.setText(this.mContext.getString(a.i.tbX, new Object[] { localBankcard.field_bankName }));
      if (!b.a(localBankcard)) {
        break label716;
      }
      paramViewGroup.qWp.setVisibility(0);
    }
    for (;;)
    {
      GMTrace.o(7690541596672L, 57299);
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
      break;
      label716:
      paramViewGroup.qWp.setVisibility(8);
    }
    paramView = com.tencent.mm.plugin.wallet_core.ui.view.b.a(this.mContext, paramView, localBankcard, a.g.sOX, this.qWf, bool);
    GMTrace.o(7690541596672L, 57299);
    return paramView;
    paramView = View.inflate(this.mContext, a.g.sOR, null);
    GMTrace.o(7690541596672L, 57299);
    return paramView;
  }
  
  public int getViewTypeCount()
  {
    GMTrace.i(7690407378944L, 57298);
    GMTrace.o(7690407378944L, 57298);
    return 6;
  }
  
  final class a
  {
    public TextView qWh;
    public TextView qWi;
    public TextView qWj;
    public RelativeLayout qWk;
    public ImageView qWl;
    public ImageView qWm;
    public TextView qWn;
    public TextView qWo;
    public TextView qWp;
    public ImageView qWq;
    public ImageView qWr;
    public ImageView qWs;
    
    a()
    {
      GMTrace.i(7681414791168L, 57231);
      this.qWh = null;
      this.qWi = null;
      this.qWj = null;
      this.qWk = null;
      this.qWl = null;
      this.qWm = null;
      this.qWn = null;
      this.qWo = null;
      this.qWp = null;
      this.qWq = null;
      this.qWr = null;
      this.qWs = null;
      GMTrace.o(7681414791168L, 57231);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\bind\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */