package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.br.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.preference.Preference;

public class ContactRemarkAndLabelPreference
  extends Preference
{
  private TextView izE;
  private String kXe;
  private Context mContext;
  private TextView nMm;
  private TextView nMn;
  private boolean nMo;
  private String nMp;
  private String nMq;
  
  public ContactRemarkAndLabelPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6790880165888L, 50596);
    this.nMo = false;
    this.mContext = paramContext;
    GMTrace.o(6790880165888L, 50596);
  }
  
  public ContactRemarkAndLabelPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6791014383616L, 50597);
    this.nMo = false;
    this.mContext = paramContext;
    setLayoutResource(R.i.cBA);
    GMTrace.o(6791014383616L, 50597);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(6791282819072L, 50599);
    this.izE = ((TextView)paramView.findViewById(R.h.title));
    this.nMm = ((TextView)paramView.findViewById(R.h.bYo));
    this.nMn = ((TextView)paramView.findViewById(R.h.label));
    RelativeLayout.LayoutParams localLayoutParams;
    if ((this.izE != null) && (!bg.nm(this.kXe)))
    {
      this.izE.setVisibility(0);
      this.izE.setText(this.kXe);
      localLayoutParams = (RelativeLayout.LayoutParams)this.izE.getLayoutParams();
      localLayoutParams.width = a.V(this.mContext, R.f.aQg);
      this.izE.setLayoutParams(localLayoutParams);
    }
    if (this.nMm != null) {
      if (!this.nMo)
      {
        this.nMm.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        i = 0;
        if (!bg.nm(this.nMp))
        {
          this.nMm.setVisibility(0);
          this.nMm.setText(h.b(this.mContext, bg.nl(this.nMp), this.nMm.getTextSize()));
        }
      }
    }
    for (int i = 1;; i = 0)
    {
      int j = i;
      if (this.nMn != null)
      {
        j = i;
        if (!bg.nm(this.nMq))
        {
          j = i | 0x2;
          this.nMn.setVisibility(0);
          this.nMn.setText(this.nMq);
        }
      }
      if (j == 1) {
        ((RelativeLayout.LayoutParams)this.nMm.getLayoutParams()).addRule(15);
      }
      if (j == 2)
      {
        localLayoutParams = (RelativeLayout.LayoutParams)this.nMn.getLayoutParams();
        localLayoutParams.addRule(3, 0);
        localLayoutParams.addRule(15);
      }
      super.onBindView(paramView);
      GMTrace.o(6791282819072L, 50599);
      return;
      this.nMm.setVisibility(0);
      this.nMm.setCompoundDrawablesWithIntrinsicBounds(R.k.cLa, 0, 0, 0);
      i = 1;
      break;
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(6791148601344L, 50598);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBR, localViewGroup);
    GMTrace.o(6791148601344L, 50598);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\ContactRemarkAndLabelPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */