package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView;

final class dm
  extends ah.a
{
  ProgressBar nWt;
  ViewStub wCf;
  RTChattingEmojiView wrT;
  ImageView wrU;
  ImageView wrV;
  
  public dm(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2257676402688L, 16821);
    GMTrace.o(2257676402688L, 16821);
  }
  
  public final ah.a r(View paramView, boolean paramBoolean)
  {
    GMTrace.i(2257810620416L, 16822);
    super.dq(paramView);
    this.jRw = ((TextView)paramView.findViewById(R.h.boA));
    this.wrT = ((RTChattingEmojiView)paramView.findViewById(R.h.bnj));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    if (paramBoolean)
    {
      this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
      this.type = 14;
    }
    for (;;)
    {
      if (this.wrU != null) {
        ((ViewGroup)this.wrU.getParent()).setBackgroundDrawable(null);
      }
      this.wCf = ((ViewStub)paramView.findViewById(R.h.bom));
      GMTrace.o(2257810620416L, 16822);
      return this;
      this.nWt = ((ProgressBar)paramView.findViewById(R.h.cjy));
      this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
      this.wsh = ((ImageView)paramView.findViewById(R.h.bow));
      this.type = 15;
      this.wrV = ((ImageView)paramView.findViewById(R.h.boy));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */