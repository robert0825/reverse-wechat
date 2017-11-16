package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.a.f;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.bdu;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class o
  extends i
{
  private View jKC;
  private ImageView jKD;
  private TextView jKE;
  private TextView jKF;
  
  public o()
  {
    GMTrace.i(4996120707072L, 37224);
    GMTrace.o(4996120707072L, 37224);
  }
  
  public final void MP()
  {
    GMTrace.i(4996254924800L, 37225);
    this.jKC = findViewById(R.h.bCf);
    this.jKD = ((ImageView)findViewById(R.h.bCd));
    this.jKE = ((TextView)findViewById(R.h.bCh));
    this.jKF = ((TextView)findViewById(R.h.bCg));
    this.jKC.setVisibility(8);
    GMTrace.o(4996254924800L, 37225);
  }
  
  public final void amM()
  {
    GMTrace.i(4996523360256L, 37227);
    this.jKC.setVisibility(8);
    GMTrace.o(4996523360256L, 37227);
  }
  
  public final void update()
  {
    GMTrace.i(4996389142528L, 37226);
    b localb = this.jKl.alv();
    MMActivity localMMActivity = this.jKl.aly();
    e.a locala = this.jKl.alC();
    this.jKC.setVisibility(0);
    TextView localTextView = this.jKE;
    at.AR();
    localTextView.setText(h.b(localMMActivity, c.yK().TE(locala.jEj).vj(), this.jKE.getTextSize()));
    if ((localb.ajx() != null) && (!TextUtils.isEmpty(localb.ajx().uPK))) {
      this.jKF.setText(h.b(localMMActivity, localb.ajx().uPK, this.jKF.getTextSize()));
    }
    for (;;)
    {
      a.b.a(this.jKD, locala.jEj);
      this.jKD.setOnClickListener(this.jKl.alz());
      GMTrace.o(4996389142528L, 37226);
      return;
      if (!TextUtils.isEmpty(localb.ajv().jyS)) {
        this.jKF.setText(localMMActivity.getString(R.l.dcI, new Object[] { localb.ajv().jyS }));
      } else {
        this.jKF.setText(localMMActivity.getString(R.l.dcI, new Object[] { this.jKl.alD().getTitle() }));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */