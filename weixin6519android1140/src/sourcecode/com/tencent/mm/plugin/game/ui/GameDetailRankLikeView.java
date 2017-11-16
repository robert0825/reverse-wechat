package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.plugin.game.c.ck;
import com.tencent.mm.plugin.game.c.cl;
import com.tencent.mm.plugin.game.model.ad;
import com.tencent.mm.plugin.game.model.ad.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;

public class GameDetailRankLikeView
  extends LinearLayout
  implements View.OnClickListener
{
  String hyD;
  int lNQ;
  ad lWn;
  ad.a lWo;
  private Drawable lWp;
  private Drawable lWq;
  private Animation lWr;
  private ImageView lWs;
  private TextView lWt;
  
  public GameDetailRankLikeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12657939709952L, 94309);
    GMTrace.o(12657939709952L, 94309);
  }
  
  final void aGz()
  {
    GMTrace.i(12658208145408L, 94311);
    if (this.lWo != null)
    {
      if (this.lWo.lOd) {
        this.lWs.setImageDrawable(this.lWp);
      }
      int i;
      for (;;)
      {
        i = this.lWo.lOc;
        if (i <= 99) {
          break;
        }
        this.lWt.setText("99+");
        GMTrace.o(12658208145408L, 94311);
        return;
        this.lWs.setImageDrawable(this.lWq);
      }
      if (i == 0)
      {
        this.lWt.setText("");
        GMTrace.o(12658208145408L, 94311);
        return;
      }
      this.lWt.setText(String.valueOf(i));
      GMTrace.o(12658208145408L, 94311);
      return;
    }
    setVisibility(8);
    GMTrace.o(12658208145408L, 94311);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12658342363136L, 94312);
    if (q.zE().equals(this.lWo.eQu))
    {
      if (this.lWo.lOc > 0)
      {
        paramView = new Intent(getContext(), GameDetailRankLikedUI.class);
        paramView.putExtra("extra_appdi", this.hyD);
        getContext().startActivity(paramView);
        GMTrace.o(12658342363136L, 94312);
      }
    }
    else if (!this.lWo.lOd)
    {
      this.lWo.lOd = true;
      paramView = this.lWo;
      paramView.lOc += 1;
      this.lWn.aFN();
      paramView = this.hyD;
      String str = this.lWo.eQu;
      Object localObject = new b.a();
      ((b.a)localObject).gtF = new ck();
      ((b.a)localObject).gtG = new cl();
      ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/upfriend";
      ((b.a)localObject).gtE = 1330;
      localObject = ((b.a)localObject).DA();
      ck localck = (ck)((b)localObject).gtC.gtK;
      localck.lPg = paramView;
      localck.lSX = str;
      u.a((b)localObject, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(12663442636800L, 94350);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("MicroMsg.GameDetailRankLikeView", "CGI return is not OK. (%d, %d)(%s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            GMTrace.o(12663442636800L, 94350);
            return 0;
          }
          GMTrace.o(12663442636800L, 94350);
          return 0;
        }
      });
      ai.a(getContext(), 12, 1203, 1, 2, this.hyD, this.lNQ, null);
      aGz();
      this.lWs.startAnimation(this.lWr);
    }
    GMTrace.o(12658342363136L, 94312);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12658073927680L, 94310);
    super.onFinishInflate();
    this.lWp = getContext().getResources().getDrawable(R.g.aWX);
    this.lWq = getContext().getResources().getDrawable(R.g.aWW);
    this.lWr = AnimationUtils.loadAnimation(getContext(), R.a.aLS);
    inflate(getContext(), R.i.cyA, this);
    setOnClickListener(this);
    this.lWs = ((ImageView)findViewById(R.h.bKb));
    this.lWt = ((TextView)findViewById(R.h.bKc));
    GMTrace.o(12658073927680L, 94310);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameDetailRankLikeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */