package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class GameRankFooter
  extends LinearLayout
{
  private Context mContext;
  private boolean mHasInit;
  TextView mbg;
  private View mbh;
  private TextView mbi;
  private ImageView mbj;
  private TextView mbk;
  private TextView mbl;
  
  public GameRankFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12775782875136L, 95187);
    this.mHasInit = false;
    this.mContext = paramContext;
    init();
    GMTrace.o(12775782875136L, 95187);
  }
  
  private void init()
  {
    GMTrace.i(12776588181504L, 95193);
    this.mbg = ((TextView)findViewById(R.h.bKv));
    this.mbh = findViewById(R.h.bPm);
    this.mbi = ((TextView)findViewById(R.h.bWj));
    this.mbj = ((ImageView)findViewById(R.h.cjF));
    this.mbk = ((TextView)findViewById(R.h.cjH));
    this.mbl = ((TextView)findViewById(R.h.cjL));
    GMTrace.o(12776588181504L, 95193);
  }
  
  public final void a(q.a parama)
  {
    GMTrace.i(12776319746048L, 95191);
    if (!this.mHasInit)
    {
      GMTrace.o(12776319746048L, 95191);
      return;
    }
    if (this.mbh.getVisibility() == 0)
    {
      GMTrace.o(12776319746048L, 95191);
      return;
    }
    this.mbh.setVisibility(0);
    at.AR();
    x localx = c.yK().TE(parama.eQu);
    if (localx != null)
    {
      a.b.a(this.mbj, localx.field_username);
      this.mbk.setText(h.b(this.mContext, localx.vk(), this.mbk.getTextSize()));
    }
    this.mbi.setText(parama.lOb);
    this.mbl.setText(bg.formatNumber(parama.lxd));
    GMTrace.o(12776319746048L, 95191);
  }
  
  public final void aGG()
  {
    GMTrace.i(12776051310592L, 95189);
    this.mbg.setVisibility(0);
    GMTrace.o(12776051310592L, 95189);
  }
  
  public final void aGH()
  {
    GMTrace.i(12776185528320L, 95190);
    this.mbg.setVisibility(8);
    GMTrace.o(12776185528320L, 95190);
  }
  
  public final void aGI()
  {
    GMTrace.i(12776453963776L, 95192);
    if ((this.mbh != null) && (this.mbh.getVisibility() != 8)) {
      this.mbh.setVisibility(8);
    }
    GMTrace.o(12776453963776L, 95192);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12775917092864L, 95188);
    super.onFinishInflate();
    if (!this.mHasInit)
    {
      init();
      this.mHasInit = true;
    }
    GMTrace.o(12775917092864L, 95188);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameRankFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */