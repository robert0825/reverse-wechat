package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.card.b.i;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.ad;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.f;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.x;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.s.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;

public class CardIndexUI
  extends CardBaseUI
{
  private final String TAG;
  int fromScene;
  private View jHp;
  private TextView jHq;
  private f jHr;
  private TextView jHs;
  private TextView jHt;
  private ImageView jHu;
  private LinearLayout jHv;
  int jHw;
  private long mStartTime;
  
  public CardIndexUI()
  {
    GMTrace.i(4925522182144L, 36698);
    this.TAG = "MicroMsg.CardIndexUI";
    this.mStartTime = 0L;
    this.fromScene = 0;
    this.jHw = -1;
    GMTrace.o(4925522182144L, 36698);
  }
  
  protected final void MP()
  {
    GMTrace.i(4925924835328L, 36701);
    if (getIntent() != null) {
      this.jHw = getIntent().getIntExtra("key_card_type", -1);
    }
    super.MP();
    GMTrace.o(4925924835328L, 36701);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(4926595923968L, 36706);
    super.a(paramInt1, paramInt2, paramString, paramk);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof x))
      {
        at.AR();
        this.jHr = i.uB((String)com.tencent.mm.y.c.xh().get(282885, ""));
        if (this.jHr == null) {
          this.jHr = new f();
        }
        if ((this.jHr != null) && (!TextUtils.isEmpty(this.jHr.jyW))) {
          this.jHs.setText(this.jHr.jyW);
        }
        if ((this.jHr == null) || (!this.jHr.jyZ))
        {
          this.jHp.setVisibility(8);
          GMTrace.o(4926595923968L, 36706);
          return;
        }
        this.jHq.setText(this.jHr.jyX);
        if ((!TextUtils.isEmpty(this.jHr.jyX)) && (!TextUtils.isEmpty(this.jHr.jyY)))
        {
          this.jHp.setVisibility(0);
          GMTrace.o(4926595923968L, 36706);
          return;
        }
        this.jHp.setVisibility(8);
        GMTrace.o(4926595923968L, 36706);
        return;
      }
      if (((paramk instanceof ad)) && (((ad)paramk).jzW) && ((this.jwu instanceof c)))
      {
        ((c)this.jwu).lb(false);
        ((c)this.jwu).lb(true);
        ((c)this.jwu).QF();
      }
    }
    GMTrace.o(4926595923968L, 36706);
  }
  
  protected final void aiM()
  {
    GMTrace.i(4926059053056L, 36702);
    if (1 == this.jHw)
    {
      oM(R.l.ddc);
      this.jHs = ((TextView)findViewById(R.h.bRb));
      this.jHt = ((TextView)findViewById(R.h.bRc));
      this.jHu = ((ImageView)findViewById(R.h.bQZ));
      this.jHp = findViewById(R.h.bjV);
      this.jHq = ((TextView)findViewById(R.h.bjW));
      this.jHv = ((LinearLayout)findViewById(R.h.bRa));
      this.jHp.setVisibility(8);
      this.jHt.setVisibility(0);
      this.jHs.setVisibility(0);
      this.jHu.setVisibility(8);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.jHv.getLayoutParams();
      localLayoutParams.topMargin = BackwardSupportUtil.b.a(this, 100.0F);
      this.jHv.setLayoutParams(localLayoutParams);
      if (1 != this.jHw) {
        break label255;
      }
      this.jHt.setText(getString(R.l.dcT));
      this.jHs.setText(getString(R.l.dcS));
    }
    for (;;)
    {
      this.jHq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4974243217408L, 37061);
          if (!TextUtils.isEmpty(CardIndexUI.a(CardIndexUI.this).jyY)) {
            com.tencent.mm.plugin.card.b.b.a(CardIndexUI.this, CardIndexUI.a(CardIndexUI.this).jyY, 0);
          }
          GMTrace.o(4974243217408L, 37061);
        }
      });
      GMTrace.o(4926059053056L, 36702);
      return;
      if (3 == this.jHw)
      {
        oM(R.l.dei);
        break;
      }
      oM(R.l.dZk);
      break;
      label255:
      if (3 == this.jHw)
      {
        this.jHt.setText(getString(R.l.dcX));
        this.jHs.setText(getString(R.l.dcW));
      }
      else
      {
        this.jHt.setText(getString(R.l.ddt));
        this.jHs.setText(getString(R.l.ddB));
      }
    }
  }
  
  protected final int aiN()
  {
    GMTrace.i(4926461706240L, 36705);
    if (1 == this.jHw)
    {
      i = n.a.jzD;
      GMTrace.o(4926461706240L, 36705);
      return i;
    }
    if (3 == this.jHw)
    {
      i = n.a.jzC;
      GMTrace.o(4926461706240L, 36705);
      return i;
    }
    int i = n.a.jzz;
    GMTrace.o(4926461706240L, 36705);
    return i;
  }
  
  protected final BaseAdapter aiO()
  {
    GMTrace.i(20573698654208L, 153286);
    if (3 == this.jHw)
    {
      localObject = new k(this, aiN());
      GMTrace.o(20573698654208L, 153286);
      return (BaseAdapter)localObject;
    }
    Object localObject = new c(this, aiN());
    GMTrace.o(20573698654208L, 153286);
    return (BaseAdapter)localObject;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4926730141696L, 36707);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(4926730141696L, 36707);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4925656399872L, 36699);
    super.onCreate(paramBundle);
    w.i("MicroMsg.CardIndexUI", "oncreate");
    this.mStartTime = System.currentTimeMillis();
    MP();
    at.wS().a(984, this);
    al.akm();
    com.tencent.mm.plugin.card.a.b.lD(1);
    int i = al.akr().jxy;
    if ((com.tencent.mm.s.c.vK().aD(262152, 266256)) || (i > 0))
    {
      g.ork.i(11324, new Object[] { "CardPackageListView", Integer.valueOf(0), "", "", Integer.valueOf(1), Integer.valueOf(this.fromScene), "", Integer.valueOf(0), "" });
      GMTrace.o(4925656399872L, 36699);
      return;
    }
    g.ork.i(11324, new Object[] { "CardPackageListView", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(this.fromScene), "", Integer.valueOf(0), "" });
    GMTrace.o(4925656399872L, 36699);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4925790617600L, 36700);
    at.wS().b(984, this);
    long l1 = System.currentTimeMillis();
    long l2 = this.mStartTime;
    g.ork.i(13219, new Object[] { "CardPackageListView", Integer.valueOf(this.fromScene), "", "", Long.valueOf(l1 - l2) });
    super.onDestroy();
    GMTrace.o(4925790617600L, 36700);
  }
  
  protected void onResume()
  {
    GMTrace.i(4926193270784L, 36703);
    super.onResume();
    GMTrace.o(4926193270784L, 36703);
  }
  
  protected void onStop()
  {
    GMTrace.i(4926327488512L, 36704);
    super.onStop();
    GMTrace.o(4926327488512L, 36704);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardIndexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */