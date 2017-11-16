package com.tencent.mm.plugin.card.sharecard.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public final class e
{
  private ImageView eKZ;
  private MMActivity iPC;
  protected LinearLayout jCA;
  private TextView jCB;
  View jCx;
  b jCy;
  protected LinearLayout jCz;
  
  public e(MMActivity paramMMActivity)
  {
    GMTrace.i(5083899101184L, 37878);
    this.iPC = paramMMActivity;
    GMTrace.o(5083899101184L, 37878);
  }
  
  private void akU()
  {
    GMTrace.i(5084435972096L, 37882);
    this.jCz.setVisibility(8);
    this.jCA.setVisibility(8);
    GMTrace.o(5084435972096L, 37882);
  }
  
  public final void akR()
  {
    GMTrace.i(5084033318912L, 37879);
    if (this.jCx == null)
    {
      this.jCx = View.inflate(this.iPC, R.i.crr, null);
      this.eKZ = ((ImageView)this.jCx.findViewById(R.h.bdG));
      this.jCB = ((TextView)this.jCx.findViewById(R.h.ceO));
      this.jCz = ((LinearLayout)this.jCx.findViewById(R.h.bKD));
      this.jCA = ((LinearLayout)this.jCx.findViewById(R.h.bKB));
      this.jCz.setVisibility(8);
      this.jCA.setVisibility(8);
      RotateAnimation localRotateAnimation = new RotateAnimation(0.0F, 359.0F, 1, 0.5F, 1, 0.5F);
      localRotateAnimation.setDuration(1000L);
      localRotateAnimation.setRepeatCount(-1);
      localRotateAnimation.setInterpolator(new LinearInterpolator());
      this.eKZ.startAnimation(localRotateAnimation);
    }
    ar();
    GMTrace.o(5084033318912L, 37879);
  }
  
  public final void akS()
  {
    GMTrace.i(5084167536640L, 37880);
    this.jCz.setVisibility(0);
    this.jCA.setVisibility(8);
    GMTrace.o(5084167536640L, 37880);
  }
  
  public final void akT()
  {
    GMTrace.i(5084301754368L, 37881);
    this.jCz.setVisibility(8);
    GMTrace.o(5084301754368L, 37881);
  }
  
  public final void akV()
  {
    GMTrace.i(5084570189824L, 37883);
    akU();
    this.jCB.setVisibility(8);
    GMTrace.o(5084570189824L, 37883);
  }
  
  public final void ar()
  {
    GMTrace.i(5084704407552L, 37884);
    Integer localInteger2 = (Integer)al.aks().getValue("key_share_card_show_type");
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(0);
    }
    if ((this.jCy != null) && (b.akL()) && ((localInteger1.intValue() == 1) || (localInteger1.intValue() == 4)) && (b.akI()))
    {
      this.jCB.setVisibility(0);
      akU();
    }
    do
    {
      GMTrace.o(5084704407552L, 37884);
      return;
      this.jCB.setVisibility(8);
      if (this.jCy == null) {
        break;
      }
      w.d("MicroMsg.ShareCardFooterController", "updateView isLocalEnd %s isOtherEnd %s ", new Object[] { Boolean.valueOf(b.akL()), Boolean.valueOf(b.akM()) });
      if ((!b.akL()) || (!b.akM()))
      {
        akS();
        GMTrace.o(5084704407552L, 37884);
        return;
      }
    } while ((!b.akL()) || (!b.akM()));
    this.jCz.setVisibility(8);
    this.jCA.setVisibility(8);
    GMTrace.o(5084704407552L, 37884);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */