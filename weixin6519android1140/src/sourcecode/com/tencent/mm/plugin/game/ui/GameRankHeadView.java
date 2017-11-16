package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.game.model.l.b;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.w;

public class GameRankHeadView
  extends LinearLayout
  implements View.OnClickListener
{
  TextView ikm;
  com.tencent.mm.plugin.game.model.c lOm;
  l.b lWM;
  m lWO;
  TextView lWk;
  TextView mbm;
  private ImageView mbn;
  
  public GameRankHeadView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12666395426816L, 94372);
    GMTrace.o(12666395426816L, 94372);
  }
  
  final void aGJ()
  {
    GMTrace.i(12666663862272L, 94374);
    if (g.a(getContext(), this.lOm))
    {
      int i = com.tencent.mm.plugin.game.d.c.zU(this.lOm.field_packageName);
      if (this.lOm.versionCode > i)
      {
        this.lWk.setText(R.l.dzM);
        GMTrace.o(12666663862272L, 94374);
        return;
      }
      this.lWk.setText(R.l.dzK);
      GMTrace.o(12666663862272L, 94374);
      return;
    }
    switch (this.lOm.status)
    {
    default: 
      this.lWk.setText(R.l.dzH);
      GMTrace.o(12666663862272L, 94374);
      return;
    }
    if (this.lWO == null)
    {
      this.lWk.setVisibility(8);
      this.mbn.setVisibility(8);
      GMTrace.o(12666663862272L, 94374);
      return;
    }
    this.lWk.setVisibility(0);
    this.mbn.setVisibility(0);
    switch (this.lWO.status)
    {
    }
    for (;;)
    {
      GMTrace.o(12666663862272L, 94374);
      return;
      this.lWk.setText(R.l.dzH);
      GMTrace.o(12666663862272L, 94374);
      return;
      this.lWk.setText(R.l.dzI);
      GMTrace.o(12666663862272L, 94374);
      return;
      this.lWk.setText(R.l.dzG);
      GMTrace.o(12666663862272L, 94374);
      return;
      this.lWk.setText(R.l.dzJ);
    }
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12666798080000L, 94375);
    paramView = new e(getContext());
    m localm = new m(this.lOm);
    paramView.a(this.lOm, localm);
    GMTrace.o(12666798080000L, 94375);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12666529644544L, 94373);
    super.onFinishInflate();
    this.ikm = ((TextView)findViewById(R.h.bDM));
    this.mbm = ((TextView)findViewById(R.h.bDy));
    this.lWk = ((TextView)findViewById(R.h.bDL));
    this.mbn = ((ImageView)findViewById(R.h.bEB));
    w.i("MicroMsg.GameRankHeadView", "initView finished");
    GMTrace.o(12666529644544L, 94373);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameRankHeadView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */