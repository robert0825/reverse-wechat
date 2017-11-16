package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.n;
import com.tencent.mm.modelstat.j;
import com.tencent.mm.modelstat.l;
import com.tencent.mm.modelstat.p;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;

public class NetStatPreference
  extends Preference
{
  boolean oGG;
  
  public NetStatPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(4647557267456L, 34627);
    GMTrace.o(4647557267456L, 34627);
  }
  
  public NetStatPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4647691485184L, 34628);
    this.oGG = false;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.enS, paramInt, 0);
    if (paramAttributeSet.getInt(R.n.enT, 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.oGG = bool;
      paramAttributeSet.recycle();
      setSummary(paramContext.getString(R.l.dZz, new Object[] { Integer.valueOf(15) }));
      GMTrace.o(4647691485184L, 34628);
      return;
    }
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(4647959920640L, 34630);
    super.onBindView(paramView);
    LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(R.h.bFE);
    localLinearLayout.removeAllViews();
    int k = (int)(System.currentTimeMillis() / 86400000L);
    int i = 15;
    while (i > 0)
    {
      localNetStatGroup = new NetStatGroup(this.mContext);
      int m = k - i + 1;
      bool = this.oGG;
      localObject = DateFormat.format(localNetStatGroup.getContext().getString(R.l.dwA, new Object[] { "" }), m * 86400000L).toString();
      localNetStatGroup.odi.setText((CharSequence)localObject);
      w.d("MicroMsg.NetStatGroup", "NetStat dataTime = " + (String)localObject);
      localNetStatGroup.oGF.removeAllViews();
      int j = 0;
      if (j < 5)
      {
        localObject = new NetStatUnit(localNetStatGroup.getContext());
        j localj = p.Mu().hf(m + j);
        int n;
        int i1;
        int i2;
        if (localj != null)
        {
          if (!bool) {
            break label331;
          }
          w.i("MicroMsg.NetStatUnit", "dknetflow peroid:%d wifi : %d %d %d %d", new Object[] { Integer.valueOf(localj.gYq), Integer.valueOf(localj.gYM), Integer.valueOf(localj.gYA), Integer.valueOf(localj.gYO), Integer.valueOf(localj.gYC) });
          n = localj.gYM;
          i1 = localj.gYA;
          i2 = localj.gYO;
          ((NetStatUnit)localObject).cT(n + i1, localj.gYC + i2);
        }
        for (;;)
        {
          ((NetStatUnit)localObject).setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0F));
          localNetStatGroup.oGF.addView((View)localObject);
          j += 1;
          break;
          label331:
          w.i("MicroMsg.NetStatUnit", "dknetflow peroid:%d mobile : %d %d %d %d", new Object[] { Integer.valueOf(localj.gYq), Integer.valueOf(localj.gYL), Integer.valueOf(localj.gYz), Integer.valueOf(localj.gYN), Integer.valueOf(localj.gYB) });
          n = localj.gYL;
          i1 = localj.gYz;
          i2 = localj.gYN;
          ((NetStatUnit)localObject).cT(n + i1, localj.gYB + i2);
        }
      }
      localLinearLayout.addView(localNetStatGroup, -2, -1);
      i -= 5;
    }
    localLinearLayout = (LinearLayout)paramView.findViewById(R.h.bZn);
    localLinearLayout.removeAllViews();
    NetStatGroup localNetStatGroup = new NetStatGroup(this.mContext);
    boolean bool = this.oGG;
    localNetStatGroup.removeAllViews();
    View.inflate(localNetStatGroup.getContext(), R.i.cCX, localNetStatGroup);
    localNetStatGroup.oGF = ((LinearLayout)localNetStatGroup.findViewById(R.h.bFE));
    Object localObject = new NetStatRuler(localNetStatGroup.getContext());
    if (bool) {}
    for (paramView = "wifi";; paramView = "mobile")
    {
      ((NetStatRuler)localObject).setTag(paramView);
      ((NetStatRuler)localObject).setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0F));
      localNetStatGroup.oGF.addView((View)localObject);
      localLinearLayout.addView(localNetStatGroup);
      GMTrace.o(4647959920640L, 34630);
      return;
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(4647825702912L, 34629);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.cBN, localViewGroup);
    GMTrace.o(4647825702912L, 34629);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\NetStatPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */