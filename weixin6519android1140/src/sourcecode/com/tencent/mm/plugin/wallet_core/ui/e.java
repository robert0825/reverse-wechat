package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.wallet.a.b;
import com.tencent.mm.plugin.wallet.a.c;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet.a.k;
import com.tencent.mm.plugin.wallet.a.l;
import com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class e
  extends BaseAdapter
{
  private Context mContext;
  private Orders opK;
  public ArrayList<Bankcard> qTU;
  private com.tencent.mm.plugin.wallet_core.e.a qWf;
  private int qYS;
  private int rmm;
  public String rmn;
  public boolean rmo;
  private boolean rmp;
  
  public e(Context paramContext, ArrayList<Bankcard> paramArrayList, int paramInt, Orders paramOrders)
  {
    GMTrace.i(6979724509184L, 52003);
    this.opK = null;
    this.rmm = -1;
    this.rmn = "";
    this.rmo = true;
    this.rmp = false;
    this.mContext = paramContext;
    this.qTU = paramArrayList;
    this.qYS = paramInt;
    this.opK = paramOrders;
    this.qWf = new com.tencent.mm.plugin.wallet_core.e.a();
    this.qWf.b(this.mContext, this.qTU);
    if ((paramOrders != null) && (paramOrders.rhD == 1)) {
      this.rmp = true;
    }
    GMTrace.o(6979724509184L, 52003);
  }
  
  private LinkedList<String> e(Bankcard paramBankcard)
  {
    GMTrace.i(18038862643200L, 134400);
    LinkedList localLinkedList = new LinkedList();
    if ((this.opK != null) && (this.opK.rhw != null) && (this.opK.rhw.qXK != null))
    {
      Iterator localIterator = this.opK.rhw.qXK.qXo.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (localb.nDu.equals(paramBankcard.field_bindSerial))
        {
          paramBankcard = localb.qXq.iterator();
          while (paramBankcard.hasNext()) {
            localLinkedList.add(((c)paramBankcard.next()).qXr);
          }
          GMTrace.o(18038862643200L, 134400);
          return localLinkedList;
        }
      }
    }
    GMTrace.o(18038862643200L, 134400);
    return localLinkedList;
  }
  
  public final void e(ArrayList<Bankcard> paramArrayList, boolean paramBoolean)
  {
    GMTrace.i(18038996860928L, 134401);
    if (paramArrayList == null) {}
    for (this.qTU = new ArrayList();; this.qTU = paramArrayList)
    {
      this.rmo = paramBoolean;
      if (this.qTU.size() > 0) {
        this.qWf.b(this.mContext, this.qTU);
      }
      notifyDataSetChanged();
      GMTrace.o(18038996860928L, 134401);
      return;
    }
  }
  
  public int getCount()
  {
    int i = 0;
    GMTrace.i(6979858726912L, 52004);
    if (this.rmp)
    {
      if (this.qTU == null)
      {
        GMTrace.o(6979858726912L, 52004);
        return 0;
      }
      i = this.qTU.size();
      GMTrace.o(6979858726912L, 52004);
      return i;
    }
    if ((this.opK != null) && (this.opK.rhr.equals("CFT"))) {}
    for (;;)
    {
      if (this.qTU != null)
      {
        int j = this.qTU.size();
        GMTrace.o(6979858726912L, 52004);
        return i + j;
      }
      GMTrace.o(6979858726912L, 52004);
      return i;
      i = 1;
    }
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(6980127162368L, 52006);
    long l = paramInt;
    GMTrace.o(6980127162368L, 52006);
    return l;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6980395597824L, 52008);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, a.g.sPg, null);
      paramViewGroup = new a();
      paramViewGroup.hqi = ((TextView)paramView.findViewById(a.f.title));
      paramViewGroup.nNG = ((TextView)paramView.findViewById(a.f.summary));
      paramViewGroup.rms = ((CheckedTextView)paramView.findViewById(a.f.gda));
      paramViewGroup.rmt = ((ImageView)paramView.findViewById(a.f.sqk));
      paramViewGroup.rmr = ((FavourLayout)paramView.findViewById(a.f.svC));
      paramViewGroup.nNG.setText("");
      paramView.setTag(paramViewGroup);
    }
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      paramViewGroup.nNG.setTextColor(ab.getResources().getColor(a.c.aOa));
      paramViewGroup.rmr.setVisibility(8);
      localObject1 = wL(paramInt);
      if (localObject1 != null) {
        break label356;
      }
      paramViewGroup.rms.setVisibility(4);
      paramViewGroup.nNG.setVisibility(8);
      paramViewGroup.hqi.setText(a.i.tee);
      paramViewGroup.rmt.setVisibility(8);
      localObject1 = new LinkedList();
      if ((this.opK == null) || (this.opK.rhw == null) || (this.opK.rhw.qXK == null)) {
        break label353;
      }
      localObject2 = this.opK.rhw.qXK.qXp;
      if (localObject2 == null) {
        break label353;
      }
      localObject2 = ((k)localObject2).qXU.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((LinkedList)localObject1).add(((l)((Iterator)localObject2).next()).qXr);
      }
      paramViewGroup = (a)paramView.getTag();
    }
    if ((this.rmo) && (((LinkedList)localObject1).size() > 0))
    {
      paramViewGroup.rmr.setVisibility(0);
      paramViewGroup.nNG.setVisibility(8);
      paramViewGroup.rmr.ap((LinkedList)localObject1);
    }
    for (;;)
    {
      GMTrace.o(6980395597824L, 52008);
      return paramView;
      label353:
      break;
      label356:
      paramViewGroup.rmt.setVisibility(0);
      paramViewGroup.rms.setVisibility(0);
      paramViewGroup.nNG.setVisibility(0);
      paramViewGroup.nNG.setText("");
      paramViewGroup.hqi.setText(((Bankcard)localObject1).field_desc);
      label440:
      label531:
      label596:
      Object localObject3;
      if (((Bankcard)localObject1).byd())
      {
        localObject2 = n.byx().qUy;
        if (!bg.nm(((Bankcard)localObject2).reL))
        {
          paramViewGroup.hqi.setText(((Bankcard)localObject2).reL);
          paramViewGroup.nNG.setVisibility(0);
          switch (((Bankcard)localObject1).a(this.qYS, this.opK))
          {
          default: 
            if (!bg.nm(((Bankcard)localObject1).field_tips))
            {
              paramViewGroup.nNG.setText(((Bankcard)localObject1).field_tips);
              localObject2 = paramViewGroup.nNG.getText().toString();
              paramViewGroup.hqi.setTextColor(this.mContext.getResources().getColor(a.c.aOE));
              if (!this.rmn.equalsIgnoreCase(((Bankcard)localObject1).field_bindSerial)) {
                break label1151;
              }
              paramViewGroup.rms.setChecked(true);
              paramViewGroup.rms.setEnabled(true);
              paramViewGroup.rmt.setTag(a.f.sJk, null);
              paramViewGroup.rmt.setTag(null);
              paramViewGroup.rmt.setImageDrawable(null);
              paramViewGroup.nNG.setOnClickListener(null);
              if (!((Bankcard)localObject1).byd()) {
                break label1217;
              }
              localObject3 = paramViewGroup.rmt;
              if (localObject3 != null)
              {
                ((ImageView)localObject3).setTag(a.f.sJk, null);
                ((ImageView)localObject3).setImageResource(a.e.soT);
              }
            }
            break;
          }
        }
      }
      for (;;)
      {
        if ((bg.nm(((Bankcard)localObject1).field_forbid_title)) || (bg.nm(((Bankcard)localObject1).field_forbid_url))) {
          break label1261;
        }
        localObject2 = (String)localObject2 + "  ";
        localObject3 = new SpannableString((String)localObject2 + ((Bankcard)localObject1).field_forbid_title);
        paramViewGroup.nNG.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6928721772544L, 51623);
            if ((paramAnonymousView.getTag() instanceof String))
            {
              Intent localIntent = new Intent();
              paramAnonymousView = (String)paramAnonymousView.getTag();
              w.i("MicroMsg.WalletChangeBankcardAdapter", "go to url %s", new Object[] { paramAnonymousView });
              localIntent.putExtra("rawUrl", paramAnonymousView);
              localIntent.putExtra("geta8key_username", q.zE());
              localIntent.putExtra("pay_channel", 1);
              d.b(e.a(e.this), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent, WalletChangeBankcardUI.qYQ);
            }
            GMTrace.o(6928721772544L, 51623);
          }
        });
        paramInt = ((String)localObject2).length();
        int i = ((String)localObject2).length();
        int j = ((Bankcard)localObject1).field_forbid_title.length();
        ((SpannableString)localObject3).setSpan(new ForegroundColorSpan(ab.getResources().getColor(a.c.smR)), paramInt, i + j, 34);
        paramViewGroup.nNG.setText((CharSequence)localObject3);
        paramViewGroup.nNG.setTag(((Bankcard)localObject1).field_forbid_url);
        break;
        if (((Bankcard)localObject2).reK >= 0.0D)
        {
          localObject3 = paramViewGroup.hqi;
          Context localContext = this.mContext;
          if (q.zR()) {}
          for (i = a.i.taR;; i = a.i.taQ)
          {
            ((TextView)localObject3).setText(localContext.getString(i, new Object[] { com.tencent.mm.wallet_core.ui.e.s(((Bankcard)localObject2).reK) }));
            break;
          }
        }
        paramViewGroup.hqi.setText(this.mContext.getText(a.i.tbV));
        break label440;
        if (!((Bankcard)localObject1).bye()) {
          break label440;
        }
        localObject2 = n.byx().rjy;
        if (!bg.nm(((Bankcard)localObject2).reL))
        {
          paramViewGroup.hqi.setText(((Bankcard)localObject2).reL);
          break label440;
        }
        if (((Bankcard)localObject2).reK >= 0.0D)
        {
          paramViewGroup.hqi.setText(this.mContext.getString(a.i.tcr, new Object[] { com.tencent.mm.wallet_core.ui.e.s(((Bankcard)localObject2).reK) }));
          break label440;
        }
        paramViewGroup.hqi.setText(this.mContext.getText(a.i.tbV));
        break label440;
        paramViewGroup.nNG.setText(((Bankcard)localObject1).field_forbidWord);
        break label531;
        paramViewGroup.nNG.setText(a.i.teh);
        break label531;
        paramViewGroup.nNG.setText(a.i.tes);
        break label531;
        paramViewGroup.nNG.setText(a.i.ten);
        break label531;
        paramViewGroup.nNG.setText(a.i.tej);
        break label531;
        paramViewGroup.nNG.setText(a.i.tef);
        break label531;
        paramViewGroup.nNG.setText(a.i.tel);
        break label531;
        paramViewGroup.nNG.setText(a.i.teq);
        break label531;
        paramViewGroup.nNG.setVisibility(8);
        break label531;
        label1151:
        if (isEnabled(paramInt))
        {
          paramViewGroup.rms.setChecked(false);
          paramViewGroup.rms.setEnabled(true);
          break label596;
        }
        paramViewGroup.rms.setEnabled(false);
        paramViewGroup.rms.setChecked(false);
        paramViewGroup.hqi.setTextColor(this.mContext.getResources().getColor(a.c.aOa));
        break label596;
        label1217:
        if (((Bankcard)localObject1).bye()) {
          this.qWf.a((Bankcard)localObject1, paramViewGroup.rmt);
        } else {
          this.qWf.a(this.mContext, (Bankcard)localObject1, paramViewGroup.rmt);
        }
      }
      label1261:
      if ((this.rmo) && (bg.nm(((Bankcard)localObject1).field_forbidWord)) && (bg.nm((String)localObject2)))
      {
        localObject1 = e((Bankcard)localObject1);
        if (((LinkedList)localObject1).size() > 0)
        {
          paramViewGroup.rmr.setVisibility(0);
          paramViewGroup.nNG.setVisibility(8);
          paramViewGroup.rmr.ap((LinkedList)localObject1);
        }
      }
    }
  }
  
  public boolean isEnabled(int paramInt)
  {
    GMTrace.i(6980261380096L, 52007);
    Bankcard localBankcard = wL(paramInt);
    if (localBankcard == null)
    {
      GMTrace.o(6980261380096L, 52007);
      return true;
    }
    if (localBankcard.a(this.qYS, this.opK) != 0)
    {
      GMTrace.o(6980261380096L, 52007);
      return false;
    }
    GMTrace.o(6980261380096L, 52007);
    return true;
  }
  
  public Bankcard wL(int paramInt)
  {
    GMTrace.i(6979992944640L, 52005);
    Bankcard localBankcard;
    if (this.rmp)
    {
      localBankcard = (Bankcard)this.qTU.get(paramInt);
      GMTrace.o(6979992944640L, 52005);
      return localBankcard;
    }
    int j = getCount();
    int i;
    if (this.opK != null)
    {
      i = j;
      if (this.opK.rhr.equals("CFT")) {}
    }
    else
    {
      i = j - 1;
    }
    if (paramInt < i)
    {
      localBankcard = (Bankcard)this.qTU.get(paramInt);
      GMTrace.o(6979992944640L, 52005);
      return localBankcard;
    }
    GMTrace.o(6979992944640L, 52005);
    return null;
  }
  
  final class a
  {
    public TextView hqi;
    public TextView nNG;
    public FavourLayout rmr;
    public CheckedTextView rms;
    public ImageView rmt;
    
    a()
    {
      GMTrace.i(6941875109888L, 51721);
      GMTrace.o(6941875109888L, 51721);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */