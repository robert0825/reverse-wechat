package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class h
  extends ah.a
{
  public static Map<String, WeakReference<h>> wrZ;
  ProgressBar nWt;
  RTChattingEmojiView wrT;
  ImageView wrU;
  ImageView wrV;
  ProgressBar wrW;
  ImageView wrX;
  TextView wrY;
  
  static
  {
    GMTrace.i(2491886338048L, 18566);
    wrZ = new HashMap();
    GMTrace.o(2491886338048L, 18566);
  }
  
  public h(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2491483684864L, 18563);
    GMTrace.o(2491483684864L, 18563);
  }
  
  public static void i(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(2491752120320L, 18565);
    if (!wrZ.containsKey(paramString))
    {
      w.i("AppMsgEmojiItemHolder", "no contain attchid:%s");
      GMTrace.o(2491752120320L, 18565);
      return;
    }
    paramString = (h)((WeakReference)wrZ.get(paramString)).get();
    if (paramString != null) {
      switch (paramInt2)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(2491752120320L, 18565);
      return;
      paramString.wrW.setVisibility(8);
      paramString.wrY.setVisibility(8);
      paramString.wrX.setVisibility(8);
      GMTrace.o(2491752120320L, 18565);
      return;
      paramString.wrW.setVisibility(8);
      paramString.wrY.setVisibility(8);
      paramString.wrX.setVisibility(0);
      paramString.wrW.setProgress(paramInt1);
      paramString.wrX.setImageResource(R.g.aWh);
      GMTrace.o(2491752120320L, 18565);
      return;
      paramString.wrW.setVisibility(0);
      paramString.wrY.setVisibility(8);
      paramString.wrX.setVisibility(8);
      paramString.wrW.setProgress(0);
    }
  }
  
  public final ah.a r(View paramView, boolean paramBoolean)
  {
    GMTrace.i(2491617902592L, 18564);
    super.dq(paramView);
    this.jRw = ((TextView)paramView.findViewById(R.h.boA));
    this.wrT = ((RTChattingEmojiView)paramView.findViewById(R.h.bnj));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    this.wrW = ((ProgressBar)paramView.findViewById(R.h.bnr));
    this.wrX = ((ImageView)paramView.findViewById(R.h.box));
    this.wrY = ((TextView)paramView.findViewById(R.h.bou));
    if (paramBoolean) {
      this.type = 14;
    }
    for (;;)
    {
      if (this.wrU != null) {
        ((ViewGroup)this.wrU.getParent()).setBackgroundDrawable(null);
      }
      this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
      GMTrace.o(2491617902592L, 18564);
      return this;
      this.nWt = ((ProgressBar)paramView.findViewById(R.h.cjy));
      this.wsh = ((ImageView)paramView.findViewById(R.h.bow));
      this.type = 15;
      this.wrV = ((ImageView)paramView.findViewById(R.h.boy));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */