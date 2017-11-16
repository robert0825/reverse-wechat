package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.br.a;
import com.tencent.mm.ui.base.preference.Preference;

public class ContactMoreInfoPreference
  extends Preference
{
  private TextView jHc;
  private ImageView nLM;
  private ImageView nLN;
  private ImageView nLO;
  private ImageView nLP;
  private ImageView nLQ;
  private ImageView nLR;
  private int nLS;
  private int nLT;
  private int nLU;
  private int nLV;
  private int nLW;
  private int nLX;
  
  public ContactMoreInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6771552813056L, 50452);
    this.nLS = 8;
    this.nLT = 8;
    this.nLU = 8;
    this.nLV = 8;
    this.nLW = 8;
    this.nLX = 8;
    GMTrace.o(6771552813056L, 50452);
  }
  
  public ContactMoreInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6771687030784L, 50453);
    this.nLS = 8;
    this.nLT = 8;
    this.nLU = 8;
    this.nLV = 8;
    this.nLW = 8;
    this.nLX = 8;
    setLayoutResource(R.i.cBA);
    GMTrace.o(6771687030784L, 50453);
  }
  
  private void ar()
  {
    GMTrace.i(6772626554880L, 50460);
    if (this.nLM != null) {
      this.nLM.setVisibility(this.nLS);
    }
    if (this.nLN != null) {
      this.nLN.setVisibility(this.nLT);
    }
    if (this.nLO != null) {
      this.nLO.setVisibility(this.nLU);
    }
    if (this.nLP != null) {
      this.nLP.setVisibility(this.nLV);
    }
    if (this.nLQ != null) {
      this.nLQ.setVisibility(this.nLW);
    }
    if (this.jHc != null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.jHc.getLayoutParams();
      localLayoutParams.width = a.V(this.mContext, R.f.aQg);
      this.jHc.setLayoutParams(localLayoutParams);
    }
    if (this.nLR != null) {
      this.nLR.setVisibility(this.nLX);
    }
    GMTrace.o(6772626554880L, 50460);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(6771955466240L, 50455);
    this.nLM = ((ImageView)paramView.findViewById(R.h.bGU));
    this.nLN = ((ImageView)paramView.findViewById(R.h.bGY));
    this.nLO = ((ImageView)paramView.findViewById(R.h.bGR));
    this.nLP = ((ImageView)paramView.findViewById(R.h.bGA));
    this.nLQ = ((ImageView)paramView.findViewById(R.h.bGJ));
    this.nLR = ((ImageView)paramView.findViewById(R.h.bHd));
    this.jHc = ((TextView)paramView.findViewById(R.h.title));
    ar();
    super.onBindView(paramView);
    GMTrace.o(6771955466240L, 50455);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(6771821248512L, 50454);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBM, localViewGroup);
    GMTrace.o(6771821248512L, 50454);
    return paramViewGroup;
  }
  
  public final void sD(int paramInt)
  {
    GMTrace.i(6772089683968L, 50456);
    this.nLT = paramInt;
    ar();
    GMTrace.o(6772089683968L, 50456);
  }
  
  public final void sE(int paramInt)
  {
    GMTrace.i(6772223901696L, 50457);
    this.nLU = paramInt;
    ar();
    GMTrace.o(6772223901696L, 50457);
  }
  
  public final void sF(int paramInt)
  {
    GMTrace.i(6772358119424L, 50458);
    this.nLW = paramInt;
    ar();
    GMTrace.o(6772358119424L, 50458);
  }
  
  public final void sG(int paramInt)
  {
    GMTrace.i(6772492337152L, 50459);
    this.nLX = paramInt;
    ar();
    GMTrace.o(6772492337152L, 50459);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\ContactMoreInfoPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */