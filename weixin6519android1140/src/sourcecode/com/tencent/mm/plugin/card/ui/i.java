package com.tencent.mm.plugin.card.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.a.k;
import com.tencent.mm.plugin.card.a.k.a;
import com.tencent.mm.plugin.card.b.b;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class i
  implements k.a
{
  public MMActivity iPC;
  View jBw;
  boolean jDg;
  View jIi;
  TextView jIj;
  ImageView jIk;
  View jIl;
  TextView jIm;
  ImageView jIn;
  
  public i(MMActivity paramMMActivity, View paramView)
  {
    GMTrace.i(5005381730304L, 37293);
    this.jDg = false;
    this.iPC = paramMMActivity;
    this.jBw = paramView;
    GMTrace.o(5005381730304L, 37293);
  }
  
  public final void a(com.tencent.mm.plugin.card.model.g paramg)
  {
    GMTrace.i(5005515948032L, 37294);
    alT();
    GMTrace.o(5005515948032L, 37294);
  }
  
  public final void aic()
  {
    GMTrace.i(5005650165760L, 37295);
    GMTrace.o(5005650165760L, 37295);
  }
  
  public final void alT()
  {
    GMTrace.i(5005784383488L, 37296);
    int i = al.akr().jxy;
    if ((i > 0) && (this.jDg))
    {
      at.AR();
      String str1 = (String)c.xh().get(w.a.vre, "");
      at.AR();
      String str2 = (String)c.xh().get(w.a.vrf, "");
      int j = this.iPC.getResources().getDimensionPixelOffset(R.f.aRi);
      if (!TextUtils.isEmpty(str2))
      {
        m.a(this.jIk, str2, j, R.g.aUW, true);
        if (TextUtils.isEmpty(str1)) {
          break label198;
        }
        this.jIj.setText(str1);
        label116:
        this.jIi.setVisibility(0);
        if (this.jIl != null)
        {
          if (TextUtils.isEmpty(str2)) {
            break label229;
          }
          m.a(this.jIn, str2, j, R.g.aUW, true);
          label153:
          if (TextUtils.isEmpty(str1)) {
            break label242;
          }
          this.jIm.setText(str1);
        }
      }
      for (;;)
      {
        this.jIl.setVisibility(0);
        GMTrace.o(5005784383488L, 37296);
        return;
        this.jIk.setImageResource(R.g.aUW);
        break;
        label198:
        this.jIj.setText(this.iPC.getString(R.l.dcN, new Object[] { Integer.valueOf(i) }));
        break label116;
        label229:
        this.jIn.setImageResource(R.g.aUW);
        break label153;
        label242:
        this.jIm.setText(this.iPC.getString(R.l.dcN, new Object[] { Integer.valueOf(i) }));
      }
    }
    this.jIi.setVisibility(8);
    if (this.jIl != null) {
      this.jIl.setVisibility(8);
    }
    GMTrace.o(5005784383488L, 37296);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */