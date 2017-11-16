package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

final class ep
  extends ah.a
{
  static c wHA;
  public static final int wHy;
  public static final int wHz;
  protected ThreeDotsLoadingView iEW;
  protected ImageView wHB;
  protected ViewGroup wHC;
  protected View wHD;
  ImageView wrV;
  protected TextView wsH;
  protected ImageView wsI;
  protected TextView wsJ;
  protected TextView wsK;
  protected LinearLayout wsL;
  protected TextView wsO;
  protected TextView wsb;
  protected ImageView wsm;
  protected ImageView wso;
  protected ImageView wsp;
  protected ChattingItemFooter wsr;
  protected ImageView wss;
  protected LinearLayout wst;
  protected ViewGroup wsu;
  protected TextView wsv;
  protected LinearLayout wsw;
  
  static
  {
    GMTrace.i(17608694824960L, 131195);
    wHy = a.fromDPToPix(ab.getContext(), 215);
    wHz = a.fromDPToPix(ab.getContext(), 172);
    c.a locala = new c.a();
    locala.gKR = R.k.cJu;
    locala.aP(a.fromDPToPix(ab.getContext(), 20), a.fromDPToPix(ab.getContext(), 20)).gKA = true;
    wHA = locala.Jn();
    GMTrace.o(17608694824960L, 131195);
  }
  
  public ep(int paramInt)
  {
    super(paramInt);
    GMTrace.i(17608426389504L, 131193);
    GMTrace.o(17608426389504L, 131193);
  }
  
  public final ep u(View paramView, boolean paramBoolean)
  {
    GMTrace.i(17608560607232L, 131194);
    super.dq(paramView);
    this.wsm = ((ImageView)paramView.findViewById(R.h.bmL));
    this.wso = ((ImageView)this.lFh.findViewById(R.h.bnn));
    this.wsp = ((ImageView)this.lFh.findViewById(R.h.boz));
    this.wsb = ((TextView)paramView.findViewById(R.h.bmy));
    this.wss = ((ImageView)paramView.findViewById(R.h.bmF));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
    this.wsr = ((ChattingItemFooter)paramView.findViewById(R.h.bAZ));
    this.wst = ((LinearLayout)paramView.findViewById(R.h.ber));
    this.wsu = ((ViewGroup)paramView.findViewById(R.h.bLj));
    this.wsv = ((TextView)paramView.findViewById(R.h.bLh));
    this.wsw = ((LinearLayout)paramView.findViewById(R.h.bmR));
    this.wvA = paramView.findViewById(R.h.bne);
    if (!paramBoolean)
    {
      this.wrV = ((ImageView)this.lFh.findViewById(R.h.boy));
      this.nWt = ((ProgressBar)this.lFh.findViewById(R.h.cjy));
    }
    this.wsL = ((LinearLayout)paramView.findViewById(R.h.bmr));
    this.iEW = ((ThreeDotsLoadingView)paramView.findViewById(R.h.bKL));
    this.wHB = ((ImageView)paramView.findViewById(R.h.bsu));
    this.wsO = ((TextView)paramView.findViewById(R.h.bmu));
    this.wsH = ((TextView)paramView.findViewById(R.h.bmt));
    this.wsI = ((ImageView)paramView.findViewById(R.h.bmv));
    this.wsJ = ((TextView)paramView.findViewById(R.h.bmx));
    this.wsK = ((TextView)paramView.findViewById(R.h.bmw));
    this.wHC = ((ViewGroup)paramView.findViewById(R.h.bsv));
    GMTrace.o(17608560607232L, 131194);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */