package com.tencent.mm.plugin.remittance.bankcard.model;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
  extends BaseAdapter
  implements Filterable
{
  private Context mContext;
  private List<TransferRecordParcel> ojv;
  private List<TransferRecordParcel> ojw;
  private List<Pair<Integer, Integer>> ojx;
  private Filter ojy;
  
  public c(Context paramContext, List<TransferRecordParcel> paramList)
  {
    GMTrace.i(20950850469888L, 156096);
    this.ojw = new ArrayList();
    this.ojx = new ArrayList();
    this.mContext = paramContext;
    this.ojv = paramList;
    GMTrace.o(20950850469888L, 156096);
  }
  
  public final int getCount()
  {
    GMTrace.i(20950984687616L, 156097);
    int i = this.ojw.size();
    GMTrace.o(20950984687616L, 156097);
    return i;
  }
  
  public final Filter getFilter()
  {
    GMTrace.i(20951521558528L, 156101);
    if (this.ojy == null) {
      this.ojy = new a((byte)0);
    }
    Filter localFilter = this.ojy;
    GMTrace.o(20951521558528L, 156101);
    return localFilter;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(20951118905344L, 156098);
    Object localObject = this.ojw.get(paramInt);
    GMTrace.o(20951118905344L, 156098);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(20951253123072L, 156099);
    long l = paramInt;
    GMTrace.o(20951253123072L, 156099);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20951387340800L, 156100);
    View localView = paramView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.mContext).inflate(a.g.sLG, paramViewGroup, false);
      paramView = new b();
      paramView.ojB = ((CdnImageView)localView.findViewById(a.f.ssd));
      paramView.ojC = ((TextView)localView.findViewById(a.f.ssf));
      paramView.ojD = ((TextView)localView.findViewById(a.f.sse));
      localView.setTag(paramView);
    }
    paramView = (b)localView.getTag();
    paramViewGroup = (TransferRecordParcel)getItem(paramInt);
    Pair localPair = (Pair)this.ojx.get(paramInt);
    ForegroundColorSpan localForegroundColorSpan = new ForegroundColorSpan(this.mContext.getResources().getColor(a.c.aOE));
    SpannableString localSpannableString = new SpannableString(paramViewGroup.ojG);
    localSpannableString.setSpan(localForegroundColorSpan, ((Integer)localPair.first).intValue(), ((Integer)localPair.second).intValue(), 18);
    paramView.ojB.setUrl(paramViewGroup.ojk);
    paramView.ojC.setText(localSpannableString);
    paramView.ojD.setText(this.mContext.getString(a.i.sSc, new Object[] { paramViewGroup.mhU, paramViewGroup.ojF }));
    GMTrace.o(20951387340800L, 156100);
    return localView;
  }
  
  private final class a
    extends Filter
  {
    List<TransferRecordParcel> ojz;
    
    private a()
    {
      GMTrace.i(20945884413952L, 156059);
      this.ojz = new ArrayList();
      GMTrace.o(20945884413952L, 156059);
    }
    
    protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
    {
      GMTrace.i(20946018631680L, 156060);
      this.ojz.clear();
      c.a(c.this).clear();
      w.d("MicroMsg.PayeeAutoCompleteAdapter", "input: %s", new Object[] { paramCharSequence });
      Iterator localIterator = c.b(c.this).iterator();
      while (localIterator.hasNext())
      {
        TransferRecordParcel localTransferRecordParcel = (TransferRecordParcel)localIterator.next();
        if ((!bg.L(paramCharSequence)) && (localTransferRecordParcel.ojG.contains(paramCharSequence)))
        {
          int i = localTransferRecordParcel.ojG.indexOf((String)paramCharSequence);
          int j = paramCharSequence.length() + i;
          w.i("MicroMsg.PayeeAutoCompleteAdapter", "match payee: %s, start: %s, end: %s", new Object[] { localTransferRecordParcel.ojG, Integer.valueOf(i), Integer.valueOf(j) });
          Pair localPair = new Pair(Integer.valueOf(i), Integer.valueOf(j));
          c.a(c.this).add(localPair);
          this.ojz.add(localTransferRecordParcel);
        }
      }
      paramCharSequence = new Filter.FilterResults();
      paramCharSequence.count = this.ojz.size();
      paramCharSequence.values = this.ojz;
      GMTrace.o(20946018631680L, 156060);
      return paramCharSequence;
    }
    
    protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
    {
      GMTrace.i(20946152849408L, 156061);
      c.a(c.this, (List)paramFilterResults.values);
      w.i("MicroMsg.PayeeAutoCompleteAdapter", "match count: %d", new Object[] { Integer.valueOf(c.c(c.this).size()) });
      c.this.notifyDataSetChanged();
      GMTrace.o(20946152849408L, 156061);
    }
  }
  
  private final class b
  {
    CdnImageView ojB;
    TextView ojC;
    TextView ojD;
    
    public b()
    {
      GMTrace.i(20947495026688L, 156071);
      GMTrace.o(20947495026688L, 156071);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */