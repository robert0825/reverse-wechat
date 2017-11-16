package com.tencent.mm.plugin.search.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.contact.u;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.List;

public class FTSChattingTalkerUI
  extends FTSBaseUI
  implements View.OnClickListener
{
  private String eDs;
  private View oCA;
  private View oCB;
  private View oCC;
  private View oCD;
  private d oCE;
  private LinearLayout oCv;
  private LinearLayout oCw;
  private View oCx;
  private View oCy;
  private View oCz;
  
  public FTSChattingTalkerUI()
  {
    GMTrace.i(11835453472768L, 88181);
    GMTrace.o(11835453472768L, 88181);
  }
  
  private void nU(int paramInt)
  {
    GMTrace.i(20498536726528L, 152726);
    if (this.eDs.contains("@"))
    {
      at.AR();
      q localq = com.tencent.mm.y.c.yT().gD(this.eDs);
      if (localq.FT() != null)
      {
        if (paramInt == 0)
        {
          com.tencent.mm.plugin.report.service.g.ork.i(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(localq.FT().size()), Integer.valueOf(1) });
          GMTrace.o(20498536726528L, 152726);
          return;
        }
        com.tencent.mm.plugin.report.service.g.ork.i(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(localq.FT().size()), Integer.valueOf(1) });
      }
      GMTrace.o(20498536726528L, 152726);
      return;
    }
    if (paramInt == 0)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
      GMTrace.o(20498536726528L, 152726);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.i(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
    GMTrace.o(20498536726528L, 152726);
  }
  
  protected final void Gg(String paramString)
  {
    int i = 1;
    GMTrace.i(20498670944256L, 152727);
    super.Gg(paramString);
    paramString = com.tencent.mm.plugin.report.service.g.ork;
    if (this.eDs.contains("@")) {}
    for (;;)
    {
      paramString.i(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i) });
      GMTrace.o(20498670944256L, 152727);
      return;
      i = 0;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(11835721908224L, 88183);
    super.MP();
    this.oCD = findViewById(R.h.caJ);
    this.oCv = ((LinearLayout)this.oCD.findViewById(R.h.bCk));
    this.oCw = ((LinearLayout)this.oCD.findViewById(R.h.bCl));
    this.oCx = this.oCD.findViewById(R.h.cab);
    this.oCy = this.oCD.findViewById(R.h.cae);
    this.oCz = this.oCD.findViewById(R.h.cad);
    this.oCA = this.oCD.findViewById(R.h.cac);
    this.oCB = this.oCD.findViewById(R.h.cag);
    this.oCC = this.oCD.findViewById(R.h.caf);
    if (!s.eb(this.eDs))
    {
      this.oCv.removeView(this.oCy);
      this.oCw.removeView(this.oCA);
      this.oCv.addView(this.oCA);
      this.oCw.addView(this.oCy);
      this.oCy.setVisibility(4);
      this.oCD.findViewById(R.h.buA).setVisibility(8);
      this.oCD.findViewById(R.h.buD).setVisibility(0);
      this.oCD.findViewById(R.h.buC).setVisibility(8);
    }
    this.oCD.setVisibility(0);
    this.oCy.setOnClickListener(this);
    this.oCx.setOnClickListener(this);
    this.oCz.setOnClickListener(this);
    this.oCA.setOnClickListener(this);
    this.oCB.setOnClickListener(this);
    this.oCC.setOnClickListener(this);
    GMTrace.o(11835721908224L, 88183);
  }
  
  protected final b a(c paramc)
  {
    GMTrace.i(11835990343680L, 88185);
    if (this.oCE == null) {
      this.oCE = new d(paramc, this.eDs);
    }
    paramc = this.oCE;
    GMTrace.o(11835990343680L, 88185);
    return paramc;
  }
  
  public final void b(a parama)
  {
    GMTrace.i(16486903054336L, 122837);
    if (s.eb(this.eDs))
    {
      u.k(this.eQb, 10, 5, parama.position + 1);
      GMTrace.o(16486903054336L, 122837);
      return;
    }
    u.k(this.eQb, 11, 5, parama.position + 1);
    GMTrace.o(16486903054336L, 122837);
  }
  
  protected final void bdL()
  {
    GMTrace.i(11835856125952L, 88184);
    this.eDs = getIntent().getStringExtra("detail_username");
    w.i("MicroMsg.FTS.FTSChattingTalkerUI", "initSearchData talker=%s", new Object[] { this.eDs });
    GMTrace.o(11835856125952L, 88184);
  }
  
  protected final void bdO()
  {
    GMTrace.i(11836661432320L, 88190);
    super.bdO();
    this.oCD.setVisibility(8);
    GMTrace.o(11836661432320L, 88190);
  }
  
  protected final void bdP()
  {
    GMTrace.i(11836392996864L, 88188);
    super.bdP();
    this.oCD.setVisibility(8);
    GMTrace.o(11836392996864L, 88188);
  }
  
  protected final void bdQ()
  {
    GMTrace.i(11836527214592L, 88189);
    super.bdQ();
    this.oCD.setVisibility(8);
    GMTrace.o(11836527214592L, 88189);
  }
  
  protected final void bdR()
  {
    GMTrace.i(11836258779136L, 88187);
    super.bdR();
    this.oCD.setVisibility(0);
    GMTrace.o(11836258779136L, 88187);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11836795650048L, 88191);
    int i = R.i.cxI;
    GMTrace.o(11836795650048L, 88191);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(15076408950784L, 112328);
    if (paramView.getId() == R.h.cae)
    {
      w.i("MicroMsg.FTS.FTSChattingTalkerUI", "onSearchMemberDetail");
      paramView = new Intent();
      paramView.putExtra("frome_scene", 1);
      paramView.putExtra("RoomInfo_Id", this.eDs);
      paramView.putExtra("title", getResources().getString(R.l.dWJ));
      com.tencent.mm.bj.d.b(this, "chatroom", ".ui.SelectMemberUI", paramView);
      GMTrace.o(15076408950784L, 112328);
      return;
    }
    if (paramView.getId() == R.h.cab)
    {
      w.i("MicroMsg.FTS.FTSChattingTalkerUI", "onSearchDateDetail");
      paramView = new Intent();
      paramView.putExtra("detail_username", this.eDs);
      com.tencent.mm.bj.d.b(this, "chatroom", ".ui.SelectDateUI", paramView);
      nU(0);
      GMTrace.o(15076408950784L, 112328);
      return;
    }
    if (paramView.getId() == R.h.cad)
    {
      w.i("MicroMsg.FTS.FTSChattingTalkerUI", "onSeeImageVideoHistory");
      paramView = new Intent();
      paramView.putExtra("kintent_talker", this.eDs);
      paramView.putExtra("key_media_type", 1);
      com.tencent.mm.bj.d.a(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI", paramView);
      nU(1);
      GMTrace.o(15076408950784L, 112328);
      return;
    }
    if (paramView.getId() == R.h.cac)
    {
      w.i("MicroMsg.FTS.FTSChattingTalkerUI", "onSeeFileHistory");
      paramView = new Intent();
      paramView.putExtra("kintent_talker", this.eDs);
      paramView.putExtra("key_media_type", 2);
      com.tencent.mm.bj.d.a(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", paramView);
      GMTrace.o(15076408950784L, 112328);
      return;
    }
    if (paramView.getId() == R.h.cag)
    {
      w.i("MicroMsg.FTS.FTSChattingTalkerUI", "onSeeUrlHistory");
      paramView = new Intent();
      paramView.putExtra("kintent_talker", this.eDs);
      paramView.putExtra("key_media_type", 3);
      com.tencent.mm.bj.d.a(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", paramView);
      GMTrace.o(15076408950784L, 112328);
      return;
    }
    if (paramView.getId() == R.h.caf)
    {
      w.i("MicroMsg.FTS.FTSChattingTalkerUI", "onSeeUrlHistory");
      paramView = new Intent();
      paramView.putExtra("kintent_talker", this.eDs);
      paramView.putExtra("key_media_type", 4);
      com.tencent.mm.bj.d.a(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", paramView);
    }
    GMTrace.o(15076408950784L, 112328);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11835587690496L, 88182);
    super.onCreate(paramBundle);
    MP();
    paramBundle = com.tencent.mm.plugin.search.a.c.bdC();
    if (paramBundle != null) {
      paramBundle.aCB();
    }
    GMTrace.o(11835587690496L, 88182);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11837198303232L, 88194);
    super.onDestroy();
    this.oCE.finish();
    com.tencent.mm.plugin.fts.d.g localg = com.tencent.mm.plugin.search.a.c.bdC();
    if (localg != null) {
      localg.aCz();
    }
    GMTrace.o(11837198303232L, 88194);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\FTSChattingTalkerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */