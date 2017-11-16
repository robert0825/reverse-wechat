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
import com.tencent.mm.plugin.card.ui.a.g;
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

public final class a
  extends i
{
  private View jJS;
  
  public a()
  {
    GMTrace.i(4996926013440L, 37230);
    GMTrace.o(4996926013440L, 37230);
  }
  
  public final void MP()
  {
    GMTrace.i(4997060231168L, 37231);
    this.jJS = findViewById(R.h.biW);
    GMTrace.o(4997060231168L, 37231);
  }
  
  public final void amM()
  {
    GMTrace.i(4997328666624L, 37233);
    this.jJS.setVisibility(8);
    GMTrace.o(4997328666624L, 37233);
  }
  
  public final void update()
  {
    GMTrace.i(4997194448896L, 37232);
    Object localObject = this.jKl.alA();
    b localb = this.jKl.alv();
    MMActivity localMMActivity = this.jKl.aly();
    e.a locala = this.jKl.alC();
    f localf = this.jKl.alD();
    if (((g)localObject).amw())
    {
      this.jJS.setVisibility(0);
      findViewById(R.h.bcs).setVisibility(0);
      localObject = (ImageView)findViewById(R.h.bcr);
      TextView localTextView1 = (TextView)findViewById(R.h.bct);
      TextView localTextView2 = (TextView)findViewById(R.h.bcw);
      if (locala.jEj != null)
      {
        at.AR();
        localTextView1.setText(h.b(localMMActivity, c.yK().TE(locala.jEj).vj(), localTextView1.getTextSize()));
      }
      if (locala.jtE == 23) {
        if (!TextUtils.isEmpty(localb.ajv().uai)) {
          localTextView2.setText(localb.ajv().uai);
        }
      }
      for (;;)
      {
        a.b.a((ImageView)localObject, locala.jEj, 0.15F, false);
        ((ImageView)localObject).setOnClickListener(this.jKl.alz());
        GMTrace.o(4997194448896L, 37232);
        return;
        if (!TextUtils.isEmpty(localb.ajv().jyS))
        {
          localTextView2.setText(localMMActivity.getString(R.l.ddq, new Object[] { localb.ajv().jyS }));
        }
        else
        {
          localTextView2.setText(localMMActivity.getString(R.l.ddq, new Object[] { localf.getTitle() }));
          continue;
          if ((localb.ajx() != null) && (!TextUtils.isEmpty(localb.ajx().uPK))) {
            localTextView2.setText(localb.ajx().uPK);
          } else if (!TextUtils.isEmpty(localb.ajv().jyS)) {
            localTextView2.setText(localMMActivity.getString(R.l.dcI, new Object[] { localb.ajv().jyS }));
          } else {
            localTextView2.setText(localMMActivity.getString(R.l.dcI, new Object[] { localf.getTitle() }));
          }
        }
      }
    }
    if (((g)localObject).amx())
    {
      if (!TextUtils.isEmpty(localb.ajv().uai))
      {
        this.jJS.setVisibility(0);
        findViewById(R.h.bcs).setVisibility(8);
        ((TextView)findViewById(R.h.bcw)).setText(localb.ajv().uai);
        GMTrace.o(4997194448896L, 37232);
        return;
      }
      this.jJS.setVisibility(8);
      GMTrace.o(4997194448896L, 37232);
      return;
    }
    amM();
    GMTrace.o(4997194448896L, 37232);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */