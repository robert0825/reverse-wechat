package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public final class y
  extends i
{
  private MMActivity iPC;
  private View jKU;
  private b jwZ;
  
  public y()
  {
    GMTrace.i(4997462884352L, 37234);
    GMTrace.o(4997462884352L, 37234);
  }
  
  public final void MP()
  {
    GMTrace.i(4997597102080L, 37235);
    this.iPC = this.jKl.aly();
    GMTrace.o(4997597102080L, 37235);
  }
  
  public final void amM()
  {
    GMTrace.i(4997865537536L, 37237);
    if (this.jKU != null) {
      this.jKU.setVisibility(8);
    }
    GMTrace.o(4997865537536L, 37237);
  }
  
  public final void update()
  {
    GMTrace.i(4997731319808L, 37236);
    this.jwZ = this.jKl.alv();
    if (this.jKU == null) {
      this.jKU = ((ViewStub)findViewById(R.h.blC)).inflate();
    }
    if (this.jwZ.aje()) {
      this.jKU.setBackgroundDrawable(l.v(this.iPC, this.iPC.getResources().getColor(R.e.aNf)));
    }
    TextView localTextView = (TextView)this.jKU.findViewById(R.h.blD);
    if (this.jwZ.ajw() == null)
    {
      w.e("MicroMsg.CardStatusView", "updateState() mCardInfo.getDataInfo() == null");
      localTextView.setVisibility(8);
      GMTrace.o(4997731319808L, 37236);
      return;
    }
    localTextView.setVisibility(0);
    localTextView.setTextColor(this.iPC.getResources().getColor(R.e.aNR));
    if (!TextUtils.isEmpty(this.jwZ.ajv().uag))
    {
      localTextView.setText(this.jwZ.ajv().uag);
      GMTrace.o(4997731319808L, 37236);
      return;
    }
    m.b(localTextView, this.jwZ.ajw().status);
    GMTrace.o(4997731319808L, 37236);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */