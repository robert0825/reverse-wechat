package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.az.e;
import com.tencent.mm.protocal.c.alj;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;

public final class b
  extends a
{
  com.tencent.mm.plugin.nearlife.b.a nvS;
  private com.tencent.mm.plugin.nearlife.b.a nvT;
  String nvU;
  private HashMap<String, Integer> nvV;
  
  public b(Context paramContext, View.OnClickListener paramOnClickListener, String paramString, boolean paramBoolean)
  {
    super(paramContext, paramOnClickListener, paramString, paramBoolean);
    GMTrace.i(12558484373504L, 93568);
    this.nvV = new HashMap();
    this.nvT = new com.tencent.mm.plugin.nearlife.b.a("", new alj());
    this.nvT.nuO = "NotCheckIn";
    this.nvT.eBt = paramContext.getString(R.l.dKx);
    this.nvV.put(this.nvT.nuO, Integer.valueOf(2));
    if (!paramBoolean)
    {
      a(this.nvT, 0);
      notifyDataSetChanged();
    }
    GMTrace.o(12558484373504L, 93568);
  }
  
  private Spannable Bx(String paramString)
  {
    GMTrace.i(18052552851456L, 134502);
    paramString = e.a(paramString, this.nvb);
    GMTrace.o(18052552851456L, 134502);
    return paramString;
  }
  
  public final com.tencent.mm.plugin.nearlife.b.a df(String paramString1, String paramString2)
  {
    GMTrace.i(18052418633728L, 134501);
    if (this.nvS == null)
    {
      this.nvS = new com.tencent.mm.plugin.nearlife.b.a("", new alj());
      this.nvS.nuO = "City";
      this.nvV.put(this.nvS.nuO, Integer.valueOf(1));
      a(this.nvS, 1);
    }
    this.nvS.eBt = paramString1;
    this.nvS.mDZ = paramString2;
    notifyDataSetChanged();
    paramString1 = this.nvS;
    GMTrace.o(18052418633728L, 134501);
    return paramString1;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(12558752808960L, 93570);
    com.tencent.mm.plugin.nearlife.b.a locala;
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = View.inflate(this.mContext, R.i.cCM, null);
      paramViewGroup.hqi = ((TextView)paramView.findViewById(R.h.bJY));
      paramViewGroup.mrv = ((TextView)paramView.findViewById(R.h.bJX));
      paramViewGroup.mrx = ((TextView)paramView.findViewById(R.h.bJW));
      paramViewGroup.nvX = ((LinearLayout)paramView.findViewById(R.h.bZi));
      paramViewGroup.nvY = ((ImageView)paramView.findViewById(R.h.cbC));
      paramViewGroup.nvX.setOnClickListener(this.lgu);
      paramView.setTag(paramViewGroup);
      locala = rM(paramInt);
      if (!this.nvV.containsKey(locala.nuO)) {
        break label473;
      }
    }
    label244:
    label473:
    for (int i = ((Integer)this.nvV.get(locala.nuO)).intValue();; i = 0)
    {
      paramViewGroup.nvY.setVisibility(8);
      paramViewGroup.type = i;
      paramViewGroup.nvW = locala;
      if ((!bg.nm(this.nvU)) && (this.nvU.equals(locala.nuO))) {
        paramViewGroup.nvY.setVisibility(0);
      }
      switch (i)
      {
      default: 
        paramViewGroup.position = paramInt;
        paramViewGroup.nuO = locala.nuO;
        if (this.nvf)
        {
          paramViewGroup.hqi.setText(Bx(locala.eBt));
          paramViewGroup.mrx.setText(Bx(aY(locala.nuT)));
        }
        break;
      }
      for (;;)
      {
        paramViewGroup.mrv.setVisibility(8);
        GMTrace.o(12558752808960L, 93570);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        paramViewGroup.hqi.setTextColor(this.mContext.getResources().getColor(R.e.black));
        paramViewGroup.mrx.setVisibility(8);
        break label244;
        paramViewGroup.mrx.setVisibility(8);
        paramViewGroup.hqi.setTextColor(this.mContext.getResources().getColor(R.e.aPa));
        if (!bg.nm(this.nvU)) {
          break label244;
        }
        paramViewGroup.nvY.setVisibility(0);
        break label244;
        paramViewGroup.hqi.setTextColor(this.mContext.getResources().getColor(R.e.black));
        paramViewGroup.mrx.setVisibility(0);
        break label244;
        paramViewGroup.hqi.setText(locala.eBt);
        paramViewGroup.mrx.setText(aY(locala.nuT));
      }
    }
  }
  
  final class a
  {
    TextView hqi;
    TextView mrv;
    TextView mrx;
    String nuO;
    com.tencent.mm.plugin.nearlife.b.a nvW;
    LinearLayout nvX;
    ImageView nvY;
    int position;
    int type;
    
    a()
    {
      GMTrace.i(12567074308096L, 93632);
      GMTrace.o(12567074308096L, 93632);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearlife\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */