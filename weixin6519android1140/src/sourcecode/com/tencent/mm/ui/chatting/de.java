package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;

public final class de
{
  private LinearLayout kuN;
  private View.OnClickListener oiK;
  private FrameLayout wBx;
  private ChatFooterCustom wuX;
  
  public de(ChatFooterCustom paramChatFooterCustom)
  {
    GMTrace.i(2108560506880L, 15710);
    this.oiK = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2391625695232L, 17819);
        com.tencent.mm.plugin.sport.b.d.nU(1);
        s.fE("gh_43f2581f6fd6");
        Intent localIntent = new Intent();
        localIntent.putExtra("key_is_latest", true);
        localIntent.putExtra("rank_id", "#");
        localIntent.putExtra("key_only_show_latest_rank", true);
        localIntent.putExtra("app_username", r.fs("gh_43f2581f6fd6"));
        localIntent.putExtra("device_type", 1);
        com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "exdevice", ".ui.ExdeviceRankInfoUI", localIntent);
        GMTrace.o(2391625695232L, 17819);
      }
    };
    this.wuX = paramChatFooterCustom;
    GMTrace.o(2108560506880L, 15710);
  }
  
  public final void bZY()
  {
    GMTrace.i(2108694724608L, 15711);
    w.i("MicroMsg.Sport.ChattingSportFooterHandler", "initFooter");
    this.wuX.findViewById(R.h.bnB).setVisibility(8);
    this.wuX.findViewById(R.h.bnw).setVisibility(8);
    this.kuN = ((LinearLayout)this.wuX.findViewById(R.h.bnx));
    this.kuN.setWeightSum(1.0F);
    this.wBx = ((FrameLayout)this.kuN.getChildAt(0));
    this.wBx.setVisibility(0);
    this.wBx.setOnClickListener(this.oiK);
    ((TextView)this.wBx.getChildAt(0).findViewById(R.h.bnz)).setText(R.l.drY);
    this.wBx.getChildAt(0).findViewById(R.h.bny).setVisibility(8);
    this.wBx.getChildAt(1).setVisibility(8);
    int i = 1;
    while (i < 6)
    {
      this.kuN.getChildAt(i).setVisibility(8);
      i += 1;
    }
    GMTrace.o(2108694724608L, 15711);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */