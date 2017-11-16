package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.luckymoney.b.m;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.ui.e;
import java.util.LinkedList;
import java.util.List;

public final class i
  extends BaseAdapter
{
  private LayoutInflater CJ;
  private Context mContext;
  private List<m> mNm;
  String mQt;
  boolean mQu;
  View.OnClickListener mQv;
  int mQw;
  b mQx;
  
  public i(Context paramContext)
  {
    GMTrace.i(9784338153472L, 72899);
    this.mNm = new LinkedList();
    this.mQw = 1;
    this.mQx = null;
    this.mContext = paramContext;
    this.CJ = LayoutInflater.from(paramContext);
    GMTrace.o(9784338153472L, 72899);
  }
  
  private m qh(int paramInt)
  {
    GMTrace.i(9784740806656L, 72902);
    m localm = (m)this.mNm.get(paramInt);
    GMTrace.o(9784740806656L, 72902);
    return localm;
  }
  
  public final void aS(List<m> paramList)
  {
    GMTrace.i(9784472371200L, 72900);
    if (paramList == null) {
      new LinkedList();
    }
    for (;;)
    {
      notifyDataSetChanged();
      GMTrace.o(9784472371200L, 72900);
      return;
      this.mNm = paramList;
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(9784606588928L, 72901);
    int i = this.mNm.size();
    GMTrace.o(9784606588928L, 72901);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(9784875024384L, 72903);
    GMTrace.o(9784875024384L, 72903);
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(9785009242112L, 72904);
    if (paramView == null)
    {
      paramView = this.CJ.inflate(a.g.sNd, paramViewGroup, false);
      paramViewGroup = new c();
      paramViewGroup.kgo = paramView.findViewById(a.f.bZf);
      paramViewGroup.jXQ = ((ImageView)paramView.findViewById(a.f.sAs));
      paramViewGroup.mOE = ((TextView)paramView.findViewById(a.f.sAv));
      paramViewGroup.mOF = ((TextView)paramView.findViewById(a.f.sAw));
      paramViewGroup.mNb = ((TextView)paramView.findViewById(a.f.sAq));
      paramViewGroup.mQz = ((TextView)paramView.findViewById(a.f.sAr));
      paramViewGroup.mQA = ((TextView)paramView.findViewById(a.f.sAx));
      paramViewGroup.mQB = ((ImageView)paramView.findViewById(a.f.sAt));
      paramViewGroup.mQC = ((TextView)paramView.findViewById(a.f.sAu));
      if (this.mQx != null) {
        this.mQx.a(paramViewGroup, this.mContext);
      }
      paramView.setTag(paramViewGroup);
    }
    m localm;
    for (;;)
    {
      localm = qh(paramInt);
      n.a(paramViewGroup.jXQ, localm.mIX, localm.userName);
      if ((!bg.nl(localm.mIn).equals(this.mQt)) || (!this.mQu)) {
        break;
      }
      paramViewGroup.mQA.setOnClickListener(this.mQv);
      paramViewGroup.mQA.setVisibility(0);
      paramViewGroup.mQz.setVisibility(8);
      paramViewGroup.mOF.setVisibility(8);
      n.a(this.mContext, paramViewGroup.mOE, localm.mIW);
      String str = this.mContext.getString(a.i.sAf, new Object[] { e.r(localm.mIJ / 100.0D) });
      paramViewGroup.mNb.setText(str);
      if (!bg.nm(localm.mIZ)) {
        break label470;
      }
      paramViewGroup.mQB.setVisibility(8);
      paramViewGroup.mQC.setVisibility(8);
      GMTrace.o(9785009242112L, 72904);
      return paramView;
      paramViewGroup = (c)paramView.getTag();
    }
    if (bg.nm(localm.mIY)) {
      paramViewGroup.mQz.setVisibility(8);
    }
    for (;;)
    {
      paramViewGroup.mOF.setText(n.g(this.mContext, bg.getLong(localm.mIK, 0L) * 1000L));
      paramViewGroup.mOF.setVisibility(0);
      paramViewGroup.mQA.setVisibility(8);
      break;
      n.a(this.mContext, paramViewGroup.mQz, localm.mIY);
      paramViewGroup.mQz.setVisibility(0);
    }
    label470:
    paramViewGroup.mQC.setText(localm.mIZ);
    if (this.mQw == 2) {
      paramViewGroup.mQB.setImageResource(a.e.som);
    }
    for (;;)
    {
      paramViewGroup.mQB.setVisibility(0);
      paramViewGroup.mQC.setVisibility(0);
      break;
      paramViewGroup.mQB.setImageResource(a.e.snZ);
    }
  }
  
  final class a
    implements i.b
  {
    a()
    {
      GMTrace.i(9859365863424L, 73458);
      GMTrace.o(9859365863424L, 73458);
    }
    
    public final void a(i.c paramc, Context paramContext)
    {
      GMTrace.i(9859500081152L, 73459);
      int i = paramContext.getResources().getColor(a.c.smk);
      int j = paramContext.getResources().getColor(a.c.sml);
      int k = paramContext.getResources().getColor(a.c.smq);
      paramc.kgo.setBackgroundResource(a.c.transparent);
      paramc.kgo.setPadding(0, paramContext.getResources().getDimensionPixelOffset(a.d.aQw), 0, paramContext.getResources().getDimensionPixelOffset(a.d.aQw));
      paramc.mOE.setTextColor(i);
      paramc.mOF.setTextColor(j);
      paramc.mNb.setTextColor(i);
      paramc.mQz.setTextColor(i);
      paramc.mQA.setTextColor(k);
      GMTrace.o(9859500081152L, 73459);
    }
  }
  
  static abstract interface b
  {
    public abstract void a(i.c paramc, Context paramContext);
  }
  
  final class c
  {
    ImageView jXQ;
    View kgo;
    TextView mNb;
    TextView mOE;
    TextView mOF;
    TextView mQA;
    ImageView mQB;
    TextView mQC;
    TextView mQz;
    
    c()
    {
      GMTrace.i(9833998712832L, 73269);
      GMTrace.o(9833998712832L, 73269);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */