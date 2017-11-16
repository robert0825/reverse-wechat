package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import java.util.LinkedList;

public class GameRankView
  extends FrameLayout
{
  private Context mContext;
  ListView mbr;
  View mbs;
  q mbt;
  private GameRankFooter mbu;
  
  public GameRankView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12770548383744L, 95148);
    this.mContext = paramContext;
    GMTrace.o(12770548383744L, 95148);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12770682601472L, 95149);
    super.onFinishInflate();
    this.mbr = ((ListView)findViewById(R.h.bER));
    this.mbu = ((GameRankFooter)View.inflate(this.mContext, R.i.czm, null));
    GameRankFooter localGameRankFooter = this.mbu;
    View.OnClickListener local1 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12698205028352L, 94609);
        paramAnonymousView = GameRankView.a(GameRankView.this);
        if (paramAnonymousView.maR.size() > paramAnonymousView.maT)
        {
          if (paramAnonymousView.maT + 25 < paramAnonymousView.maR.size()) {
            break label135;
          }
          paramAnonymousView.maT = paramAnonymousView.maR.size();
          paramAnonymousView.maW.aGH();
          paramAnonymousView.maY = true;
          paramAnonymousView.maS = paramAnonymousView.maR.subList(0, paramAnonymousView.maT);
          if ((paramAnonymousView.maX) || (paramAnonymousView.maZ <= paramAnonymousView.maT)) {
            break label166;
          }
          if (paramAnonymousView.maV == null) {
            break label156;
          }
          paramAnonymousView.maW.a(paramAnonymousView.maV);
        }
        for (;;)
        {
          paramAnonymousView.notifyDataSetChanged();
          GMTrace.o(12698205028352L, 94609);
          return;
          label135:
          paramAnonymousView.maT += 25;
          paramAnonymousView.maW.aGG();
          break;
          label156:
          paramAnonymousView.maW.aGI();
          continue;
          label166:
          paramAnonymousView.maW.aGI();
        }
      }
    };
    localGameRankFooter.mbg.setOnClickListener(local1);
    this.mbr.addFooterView(this.mbu);
    this.mbt = new q(this.mContext, this.mbu);
    this.mbs = findViewById(R.h.bEP);
    GMTrace.o(12770682601472L, 95149);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameRankView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */