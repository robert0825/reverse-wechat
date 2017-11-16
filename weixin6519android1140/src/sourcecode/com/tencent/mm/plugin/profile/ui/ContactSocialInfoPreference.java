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

public class ContactSocialInfoPreference
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
  
  public ContactSocialInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6815442010112L, 50779);
    this.nLS = 8;
    this.nLT = 8;
    this.nLU = 8;
    this.nLV = 8;
    this.nLW = 8;
    this.nLX = 8;
    GMTrace.o(6815442010112L, 50779);
  }
  
  public ContactSocialInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6815576227840L, 50780);
    this.nLS = 8;
    this.nLT = 8;
    this.nLU = 8;
    this.nLV = 8;
    this.nLW = 8;
    this.nLX = 8;
    setLayoutResource(R.i.cBA);
    GMTrace.o(6815576227840L, 50780);
  }
  
  private void ar()
  {
    GMTrace.i(6816649969664L, 50788);
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
    GMTrace.o(6816649969664L, 50788);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(6815844663296L, 50782);
    this.nLM = ((ImageView)paramView.findViewById(R.h.bGU));
    this.nLN = ((ImageView)paramView.findViewById(R.h.bGY));
    this.nLO = ((ImageView)paramView.findViewById(R.h.bGR));
    this.nLP = ((ImageView)paramView.findViewById(R.h.bGA));
    this.nLQ = ((ImageView)paramView.findViewById(R.h.bGJ));
    this.nLR = ((ImageView)paramView.findViewById(R.h.bHd));
    this.jHc = ((TextView)paramView.findViewById(R.h.title));
    ar();
    super.onBindView(paramView);
    GMTrace.o(6815844663296L, 50782);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(6815710445568L, 50781);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBV, localViewGroup);
    GMTrace.o(6815710445568L, 50781);
    return paramViewGroup;
  }
  
  public final void sD(int paramInt)
  {
    GMTrace.i(6816113098752L, 50784);
    this.nLT = paramInt;
    ar();
    GMTrace.o(6816113098752L, 50784);
  }
  
  public final void sE(int paramInt)
  {
    GMTrace.i(6816247316480L, 50785);
    this.nLU = paramInt;
    ar();
    GMTrace.o(6816247316480L, 50785);
  }
  
  public final void sF(int paramInt)
  {
    GMTrace.i(6816381534208L, 50786);
    this.nLW = paramInt;
    ar();
    GMTrace.o(6816381534208L, 50786);
  }
  
  public final void sG(int paramInt)
  {
    GMTrace.i(6816515751936L, 50787);
    this.nLX = paramInt;
    ar();
    GMTrace.o(6816515751936L, 50787);
  }
  
  public final void sH(int paramInt)
  {
    GMTrace.i(6815978881024L, 50783);
    this.nLS = paramInt;
    ar();
    GMTrace.o(6815978881024L, 50783);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\ContactSocialInfoPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */