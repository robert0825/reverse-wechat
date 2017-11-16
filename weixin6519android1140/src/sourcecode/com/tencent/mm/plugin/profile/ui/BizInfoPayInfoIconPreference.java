package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.br.a;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.Iterator;
import java.util.List;

public class BizInfoPayInfoIconPreference
  extends Preference
{
  private LayoutInflater CJ;
  private LinearLayout nLo;
  private List<String> nLp;
  private int nLq;
  
  public BizInfoPayInfoIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(6817589493760L, 50795);
    GMTrace.o(6817589493760L, 50795);
  }
  
  public BizInfoPayInfoIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6817723711488L, 50796);
    this.nLq = -1;
    this.CJ = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    setLayoutResource(R.i.cBA);
    GMTrace.o(6817723711488L, 50796);
  }
  
  private void ar()
  {
    GMTrace.i(6818394800128L, 50801);
    if (this.nLo == null)
    {
      GMTrace.o(6818394800128L, 50801);
      return;
    }
    this.nLo.removeAllViews();
    if (this.nLq >= 0)
    {
      int i = this.nLq;
      int j = 0;
      if (j < 5)
      {
        if (i <= 0) {
          sC(R.k.cJW);
        }
        for (;;)
        {
          j += 1;
          break;
          if (i <= 10)
          {
            sC(R.k.cJU);
            i -= 20;
          }
          else
          {
            sC(R.k.cJV);
            i -= 20;
          }
        }
      }
      GMTrace.o(6818394800128L, 50801);
      return;
    }
    if (this.nLp != null)
    {
      Iterator localIterator = this.nLp.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        CdnImageView localCdnImageView = new CdnImageView(this.mContext);
        localCdnImageView.setUrl((String)localObject);
        localObject = new LinearLayout.LayoutParams(a.fromDPToPix(this.mContext, 20), a.fromDPToPix(this.mContext, 20));
        ((LinearLayout.LayoutParams)localObject).rightMargin = a.fromDPToPix(this.mContext, 6);
        this.nLo.addView(localCdnImageView, (ViewGroup.LayoutParams)localObject);
      }
    }
    GMTrace.o(6818394800128L, 50801);
  }
  
  private void sC(int paramInt)
  {
    GMTrace.i(6818529017856L, 50802);
    ImageView localImageView = (ImageView)this.CJ.inflate(R.i.ctI, null);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a.fromDPToPix(this.mContext, 20), a.fromDPToPix(this.mContext, 20));
    localLayoutParams.rightMargin = a.fromDPToPix(this.mContext, 6);
    localImageView.setImageResource(paramInt);
    this.nLo.addView(localImageView, localLayoutParams);
    GMTrace.o(6818529017856L, 50802);
  }
  
  public final void bd(List<String> paramList)
  {
    GMTrace.i(6818260582400L, 50800);
    this.nLp = paramList;
    ar();
    GMTrace.o(6818260582400L, 50800);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(6817992146944L, 50798);
    super.onBindView(paramView);
    this.nLo = ((LinearLayout)paramView.findViewById(R.h.summary));
    ar();
    GMTrace.o(6817992146944L, 50798);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(6817857929216L, 50797);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    this.CJ.inflate(R.i.ctL, localViewGroup);
    GMTrace.o(6817857929216L, 50797);
    return paramViewGroup;
  }
  
  public final void sB(int paramInt)
  {
    GMTrace.i(6818126364672L, 50799);
    if (paramInt == this.nLq)
    {
      GMTrace.o(6818126364672L, 50799);
      return;
    }
    this.nLq = paramInt;
    ar();
    GMTrace.o(6818126364672L, 50799);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\BizInfoPayInfoIconPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */