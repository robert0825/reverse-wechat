package com.tencent.mm.plugin.search.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout;
import com.tencent.mm.pluginsdk.ui.tools.p;
import com.tencent.mm.pluginsdk.ui.tools.p.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(19)
public abstract class FTSBaseVoiceSearchUI
  extends MMActivity
  implements b.a, c, p.a
{
  String eQb;
  private p jus;
  TextView mct;
  private ae oBM;
  ListView oCn;
  private b oCo;
  private boolean oCp;
  private VoiceSearchLayout oCs;
  private RelativeLayout oCt;
  
  public FTSBaseVoiceSearchUI()
  {
    GMTrace.i(16477373595648L, 122766);
    this.oCp = false;
    this.oBM = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(16481936998400L, 122800);
        if ((paramAnonymousMessage.what == 1) && (!bg.nm(FTSBaseVoiceSearchUI.b(FTSBaseVoiceSearchUI.this)))) {
          FTSBaseVoiceSearchUI.this.bdG();
        }
        GMTrace.o(16481936998400L, 122800);
      }
    };
    GMTrace.o(16477373595648L, 122766);
  }
  
  public void D(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(16480729038848L, 122791);
    w.i("MicroMsg.FTS.FTSBaseMainUI", "onEnd resultCount=%d | isFinished=%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      bdW();
      if (paramInt > 0) {
        bdQ();
      }
    }
    for (;;)
    {
      if (this.oCp)
      {
        this.oCp = false;
        this.oCn.setSelection(0);
      }
      GMTrace.o(16480729038848L, 122791);
      return;
      bdP();
      continue;
      if (paramInt > 0)
      {
        bdQ();
        bdV();
      }
      else
      {
        bdO();
        bdW();
      }
    }
  }
  
  public final void QA()
  {
    GMTrace.i(16478984208384L, 122778);
    GMTrace.o(16478984208384L, 122778);
  }
  
  public final void QB()
  {
    GMTrace.i(17433138036736L, 129887);
    GMTrace.o(17433138036736L, 129887);
  }
  
  public final void Qy()
  {
    GMTrace.i(16478715772928L, 122776);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onQuitSearch");
    finish();
    GMTrace.o(16478715772928L, 122776);
  }
  
  public final void Qz()
  {
    GMTrace.i(16478581555200L, 122775);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onEnterSearch");
    GMTrace.o(16478581555200L, 122775);
  }
  
  protected abstract b a(c paramc);
  
  public void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    GMTrace.i(16478447337472L, 122774);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onVoiceReturn");
    bdU();
    GMTrace.o(16478447337472L, 122774);
  }
  
  public final void aim()
  {
    GMTrace.i(16478178902016L, 122772);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onVoiceSearchStart");
    bdT();
    GMTrace.o(16478178902016L, 122772);
  }
  
  public final void ain()
  {
    GMTrace.i(16478313119744L, 122773);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onVoiceSearchCancel");
    bdU();
    GMTrace.o(16478313119744L, 122773);
  }
  
  protected View alh()
  {
    GMTrace.i(16478044684288L, 122771);
    GMTrace.o(16478044684288L, 122771);
    return null;
  }
  
  protected void bdG()
  {
    GMTrace.i(16479252643840L, 122780);
    this.oCp = true;
    this.oCo.Gf(this.eQb);
    bdO();
    GMTrace.o(16479252643840L, 122780);
  }
  
  protected void bdL()
  {
    GMTrace.i(16477642031104L, 122768);
    GMTrace.o(16477642031104L, 122768);
  }
  
  protected void bdO()
  {
    GMTrace.i(16479655297024L, 122783);
    this.mct.setVisibility(8);
    if (this.oCt != null) {
      this.oCt.setVisibility(8);
    }
    this.oCn.setVisibility(8);
    GMTrace.o(16479655297024L, 122783);
  }
  
  protected void bdP()
  {
    GMTrace.i(16479789514752L, 122784);
    this.mct.setVisibility(0);
    this.mct.setText(f.a(getString(R.l.dWd), getString(R.l.dWc), com.tencent.mm.plugin.fts.d.b.a.d(this.eQb, this.eQb)).lAJ);
    if (this.oCt != null) {
      this.oCt.setVisibility(8);
    }
    this.oCn.setVisibility(8);
    GMTrace.o(16479789514752L, 122784);
  }
  
  protected void bdQ()
  {
    GMTrace.i(16479923732480L, 122785);
    this.mct.setVisibility(8);
    if (this.oCt != null) {
      this.oCt.setVisibility(8);
    }
    this.oCn.setVisibility(0);
    GMTrace.o(16479923732480L, 122785);
  }
  
  protected void bdR()
  {
    GMTrace.i(16480057950208L, 122786);
    this.mct.setVisibility(8);
    if (this.oCt != null) {
      this.oCt.setVisibility(8);
    }
    this.oCn.setVisibility(8);
    GMTrace.o(16480057950208L, 122786);
  }
  
  protected abstract boolean bdS();
  
  protected void bdT()
  {
    GMTrace.i(16479386861568L, 122781);
    this.mct.setVisibility(8);
    if (this.oCt != null) {
      this.oCt.setVisibility(0);
    }
    this.oCn.setVisibility(8);
    GMTrace.o(16479386861568L, 122781);
  }
  
  protected void bdU()
  {
    GMTrace.i(16479521079296L, 122782);
    this.mct.setVisibility(8);
    if (this.oCt != null) {
      this.oCt.setVisibility(8);
    }
    this.oCn.setVisibility(8);
    GMTrace.o(16479521079296L, 122782);
  }
  
  protected void bdV()
  {
    GMTrace.i(16480863256576L, 122792);
    GMTrace.o(16480863256576L, 122792);
  }
  
  protected void bdW()
  {
    GMTrace.i(16480997474304L, 122793);
    GMTrace.o(16480997474304L, 122793);
  }
  
  public boolean nC(String paramString)
  {
    GMTrace.i(16479118426112L, 122779);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onSearchKeyDown %s", new Object[] { paramString });
    aLo();
    if (this.jus != null) {
      this.jus.clearFocus();
    }
    GMTrace.o(16479118426112L, 122779);
    return false;
  }
  
  public final void nD(String paramString)
  {
    GMTrace.i(16478849990656L, 122777);
    w.d("MicroMsg.FTS.FTSBaseMainUI", "onSearchChange %s", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      if (!this.jus.chW())
      {
        this.jus.chX();
        aLs();
      }
      bdR();
    }
    paramString = d.yQ(paramString);
    if ((!bg.nm(this.eQb)) && (this.eQb.equals(paramString)))
    {
      w.i("MicroMsg.FTS.FTSBaseMainUI", "Same query %s %s", new Object[] { this.eQb, paramString });
      GMTrace.o(16478849990656L, 122777);
      return;
    }
    this.eQb = paramString;
    if (!bg.nm(this.eQb))
    {
      this.oBM.removeMessages(1);
      this.oBM.sendEmptyMessageDelayed(1, 300L);
      GMTrace.o(16478849990656L, 122777);
      return;
    }
    this.oBM.removeMessages(1);
    this.oCp = false;
    this.oCo.stopSearch();
    bdR();
    GMTrace.o(16478849990656L, 122777);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(16477507813376L, 122767);
    super.onCreate(paramBundle);
    bXw();
    sq("");
    bdL();
    this.jus = new p();
    this.jus.mD(true);
    this.jus.a(this);
    this.jus.tHZ = bdS();
    this.oCn = ((ListView)findViewById(R.h.caM));
    if (alh() != null)
    {
      w.i("MicroMsg.FTS.FTSBaseMainUI", "searchResultLV addFooterView");
      this.oCn.addFooterView(alh());
    }
    this.oCo = a(this);
    this.oCo.oCm = this;
    this.oCn.setAdapter(this.oCo);
    this.oCn.setOnScrollListener(this.oCo);
    this.oCn.setOnItemClickListener(this.oCo);
    this.oCn.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16476836724736L, 122762);
        FTSBaseVoiceSearchUI.a(FTSBaseVoiceSearchUI.this).clearFocus();
        FTSBaseVoiceSearchUI.this.aLo();
        GMTrace.o(16476836724736L, 122762);
        return false;
      }
    });
    if (bdS())
    {
      this.oCs = new VoiceSearchLayout(this);
      paramBundle = new RelativeLayout.LayoutParams(-1, -1);
      paramBundle.addRule(14);
      this.oCs.setLayoutParams(paramBundle);
      this.oCs.ze(BackwardSupportUtil.b.a(this, 100.0F));
      this.oCs.kJj.findViewById(R.h.clT).setBackgroundResource(0);
      this.oCs.setVisibility(8);
      this.jus.o(this.oCs);
      this.oCt = ((RelativeLayout)findViewById(R.h.clY));
      this.oCt.addView(this.oCs);
    }
    this.mct = ((TextView)findViewById(R.h.bRi));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16476031418368L, 122756);
        FTSBaseVoiceSearchUI.this.finish();
        GMTrace.o(16476031418368L, 122756);
        return true;
      }
    });
    GMTrace.o(16477507813376L, 122767);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(16480460603392L, 122789);
    this.jus.a(this, paramMenu);
    GMTrace.o(16480460603392L, 122789);
    return true;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(16480326385664L, 122788);
    this.oBM.removeMessages(1);
    this.oCo.finish();
    super.onDestroy();
    GMTrace.o(16480326385664L, 122788);
  }
  
  protected void onPause()
  {
    GMTrace.i(16480192167936L, 122787);
    super.onPause();
    this.jus.cancel();
    this.jus.clearFocus();
    GMTrace.o(16480192167936L, 122787);
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(16480594821120L, 122790);
    this.jus.a(this, paramMenu);
    GMTrace.o(16480594821120L, 122790);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\FTSBaseVoiceSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */