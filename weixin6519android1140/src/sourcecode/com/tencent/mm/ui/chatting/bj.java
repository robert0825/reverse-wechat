package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.m;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;

public final class bj
  extends RelativeLayout
{
  private LayoutInflater lVD;
  private int wwD;
  
  public bj(LayoutInflater paramLayoutInflater, int paramInt)
  {
    super(paramLayoutInflater.getContext());
    GMTrace.i(2136343576576L, 15917);
    this.lVD = paramLayoutInflater;
    this.wwD = paramInt;
    paramLayoutInflater = this.lVD.inflate(R.i.crX, null);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    paramLayoutInflater.setId(R.h.bnH);
    localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(R.f.aQE), 0, getResources().getDimensionPixelSize(R.f.aQE));
    paramLayoutInflater.setVisibility(8);
    addView(paramLayoutInflater, localLayoutParams);
    paramLayoutInflater = new TextView(getContext(), null, R.m.elT);
    paramLayoutInflater.setId(R.h.boA);
    paramLayoutInflater.setTextSize(0, a.V(getContext(), R.f.aQR));
    localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.addRule(3, R.h.bnH);
    localLayoutParams.addRule(14);
    localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(R.f.aQE), 0, getResources().getDimensionPixelSize(R.f.aQE));
    addView(paramLayoutInflater, localLayoutParams);
    paramLayoutInflater = (CheckBox)LayoutInflater.from(getContext()).inflate(R.i.cBw, this, false);
    paramLayoutInflater.setId(R.h.bnd);
    paramInt = a.fromDPToPix(getContext(), 32);
    localLayoutParams = new RelativeLayout.LayoutParams(paramInt, paramInt);
    localLayoutParams.setMargins(0, getResources().getDimensionPixelSize(R.f.aPv), getResources().getDimensionPixelSize(R.f.aQN), 0);
    localLayoutParams.addRule(3, R.h.boA);
    localLayoutParams.addRule(11);
    localLayoutParams.width = paramInt;
    localLayoutParams.height = paramInt;
    addView(paramLayoutInflater, localLayoutParams);
    paramLayoutInflater = this.lVD.inflate(this.wwD, null);
    int i = paramLayoutInflater.getId();
    paramInt = i;
    if (-1 == i)
    {
      w.v("MicroMsg.ChattingItemContainer", "content view has no id, use defaul id");
      paramInt = R.h.bng;
      paramLayoutInflater.setId(R.h.bng);
    }
    localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(3, R.h.boA);
    localLayoutParams.addRule(0, R.h.bnd);
    addView(paramLayoutInflater, localLayoutParams);
    paramLayoutInflater = new View(getContext());
    paramLayoutInflater.setId(R.h.bnX);
    paramLayoutInflater.setVisibility(8);
    localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(6, paramInt);
    localLayoutParams.addRule(8, paramInt);
    addView(paramLayoutInflater, localLayoutParams);
    GMTrace.o(2136343576576L, 15917);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */