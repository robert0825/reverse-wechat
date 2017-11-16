package com.tencent.mm.plugin.card.sharecard.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.ui.MMActivity;

public final class i
{
  MMActivity iPC;
  private View jBw;
  View jDd;
  TextView jDe;
  TextView jDf;
  private boolean jDg;
  
  public i(MMActivity paramMMActivity, View paramView)
  {
    GMTrace.i(5090475769856L, 37927);
    this.jDg = false;
    this.iPC = paramMMActivity;
    this.jBw = paramView;
    GMTrace.o(5090475769856L, 37927);
  }
  
  public final void ar()
  {
    GMTrace.i(5090609987584L, 37928);
    Integer localInteger = (Integer)al.aks().getValue("key_share_card_show_type");
    Object localObject = localInteger;
    if (localInteger == null) {
      localObject = Integer.valueOf(0);
    }
    if ((((Integer)localObject).intValue() != 0) && (!b.akJ()))
    {
      this.jDd.setVisibility(0);
      this.jDe.setVisibility(0);
      localObject = new ShareCardInfo();
      if (!TextUtils.isEmpty(((ShareCardInfo)localObject).lC(10)))
      {
        this.jDe.setVisibility(0);
        this.jDe.setText(((ShareCardInfo)localObject).lC(10));
      }
      while (!TextUtils.isEmpty(""))
      {
        this.jDf.setVisibility(0);
        this.jDf.setText("");
        GMTrace.o(5090609987584L, 37928);
        return;
        this.jDe.setVisibility(8);
      }
      this.jDf.setVisibility(8);
      GMTrace.o(5090609987584L, 37928);
      return;
    }
    this.jDd.setVisibility(8);
    GMTrace.o(5090609987584L, 37928);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\ui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */