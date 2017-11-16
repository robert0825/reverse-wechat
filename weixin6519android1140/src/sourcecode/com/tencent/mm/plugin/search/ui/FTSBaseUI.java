package com.tencent.mm.plugin.search.ui;

import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.a;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.b;
import com.tencent.mm.ui.fts.widget.a.a;
import com.tencent.mm.ui.fts.widget.a.b;
import java.util.List;

public abstract class FTSBaseUI
  extends MMActivity
  implements b.a, c, FTSEditTextView.a, a.a
{
  String eQb;
  private TextView mct;
  private ae oBM;
  ListView oCn;
  private b oCo;
  private boolean oCp;
  com.tencent.mm.ui.fts.widget.a oCq;
  
  public FTSBaseUI()
  {
    GMTrace.i(11838003609600L, 88200);
    this.oCp = false;
    this.oBM = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(15616501088256L, 116352);
        if ((paramAnonymousMessage.what == 1) && (!bg.nm(FTSBaseUI.b(FTSBaseUI.this)))) {
          FTSBaseUI.this.bdG();
        }
        GMTrace.o(15616501088256L, 116352);
      }
    };
    GMTrace.o(11838003609600L, 88200);
  }
  
  public final void D(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(11841493270528L, 88226);
    w.i("MicroMsg.FTS.FTSBaseUI", "onEnd resultCount=%d | isFinished=%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
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
      GMTrace.o(11841493270528L, 88226);
      return;
      bdP();
      continue;
      if (paramInt > 0) {
        bdQ();
      } else {
        bdO();
      }
    }
  }
  
  protected void Gg(String paramString)
  {
    GMTrace.i(20498402508800L, 152725);
    if (!bg.nm(paramString))
    {
      this.eQb = paramString;
      this.oBM.removeMessages(1);
      this.oBM.sendEmptyMessageDelayed(1, 300L);
      GMTrace.o(20498402508800L, 152725);
      return;
    }
    stopSearch();
    GMTrace.o(20498402508800L, 152725);
  }
  
  protected abstract b a(c paramc);
  
  public void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    GMTrace.i(17433540689920L, 129890);
    if (paramb == FTSEditTextView.b.xda)
    {
      paramString1 = com.tencent.mm.plugin.fts.a.d.yQ(paramString1);
      if ((!bg.nm(this.eQb)) && (this.eQb.equals(paramString1)))
      {
        w.i("MicroMsg.FTS.FTSBaseUI", "Same query %s %s", new Object[] { this.eQb, paramString1 });
        GMTrace.o(17433540689920L, 129890);
        return;
      }
      Gg(paramString1);
    }
    GMTrace.o(17433540689920L, 129890);
  }
  
  public boolean aaM()
  {
    GMTrace.i(16483547611136L, 122812);
    aLo();
    this.oCq.xdt.wjB.clearFocus();
    GMTrace.o(16483547611136L, 122812);
    return false;
  }
  
  public void b(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16482608087040L, 122805);
    GMTrace.o(16482608087040L, 122805);
  }
  
  protected void bdG()
  {
    GMTrace.i(11839882657792L, 88214);
    this.oCp = true;
    this.oCo.Gf(this.eQb);
    bdO();
    GMTrace.o(11839882657792L, 88214);
  }
  
  public void bdJ()
  {
    GMTrace.i(16483413393408L, 122811);
    stopSearch();
    this.oCq.xdt.chz();
    aLs();
    GMTrace.o(16483413393408L, 122811);
  }
  
  protected void bdL()
  {
    GMTrace.i(11838272045056L, 88202);
    GMTrace.o(11838272045056L, 88202);
  }
  
  public final void bdM()
  {
    GMTrace.i(16482742304768L, 122806);
    finish();
    GMTrace.o(16482742304768L, 122806);
  }
  
  public final void bdN()
  {
    GMTrace.i(17433406472192L, 129889);
    GMTrace.o(17433406472192L, 129889);
  }
  
  protected void bdO()
  {
    GMTrace.i(11840285310976L, 88217);
    this.mct.setVisibility(8);
    this.oCn.setVisibility(8);
    GMTrace.o(11840285310976L, 88217);
  }
  
  protected void bdP()
  {
    GMTrace.i(11840419528704L, 88218);
    this.mct.setVisibility(0);
    this.mct.setText(f.a(getString(R.l.dWd), getString(R.l.dWc), com.tencent.mm.plugin.fts.d.b.a.d(this.eQb, this.eQb)).lAJ);
    this.oCn.setVisibility(8);
    GMTrace.o(11840419528704L, 88218);
  }
  
  protected void bdQ()
  {
    GMTrace.i(11840553746432L, 88219);
    this.mct.setVisibility(8);
    this.oCn.setVisibility(0);
    GMTrace.o(11840553746432L, 88219);
  }
  
  protected void bdR()
  {
    GMTrace.i(11840687964160L, 88220);
    this.mct.setVisibility(8);
    this.oCn.setVisibility(8);
    GMTrace.o(11840687964160L, 88220);
  }
  
  public String getHint()
  {
    GMTrace.i(16482473869312L, 122804);
    String str = getString(R.l.cUr);
    GMTrace.o(16482473869312L, 122804);
    return str;
  }
  
  public final void he(boolean paramBoolean)
  {
    GMTrace.i(16483279175680L, 122810);
    GMTrace.o(16483279175680L, 122810);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11838137827328L, 88201);
    super.onCreate(paramBundle);
    bXw();
    sq("");
    bdL();
    this.oCq = new com.tencent.mm.ui.fts.widget.a(this);
    this.oCq.xdu = this;
    this.oCq.xdt.Jd(getHint());
    this.oCq.xdt.xcX = this;
    this.oCq.xdt.xcV = false;
    cN().cO().setCustomView(this.oCq);
    this.oCn = ((ListView)findViewById(R.h.caM));
    this.oCo = a(this);
    this.oCo.oCm = this;
    this.oCn.setAdapter(this.oCo);
    this.oCn.setOnScrollListener(this.oCo);
    this.oCn.setOnItemClickListener(this.oCo);
    this.oCn.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(11867397292032L, 88419);
        FTSBaseUI.a(FTSBaseUI.this).xdt.wjB.clearFocus();
        FTSBaseUI.this.aLo();
        GMTrace.o(11867397292032L, 88419);
        return false;
      }
    });
    this.mct = ((TextView)findViewById(R.h.bRi));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11866591985664L, 88413);
        FTSBaseUI.this.finish();
        GMTrace.o(11866591985664L, 88413);
        return true;
      }
    });
    GMTrace.o(11838137827328L, 88201);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11841090617344L, 88223);
    this.oBM.removeMessages(1);
    this.oCo.finish();
    super.onDestroy();
    GMTrace.o(11841090617344L, 88223);
  }
  
  protected void stopSearch()
  {
    GMTrace.i(11840822181888L, 88221);
    this.eQb = "";
    this.oBM.removeMessages(1);
    this.oCp = false;
    this.oCo.stopSearch();
    this.oCq.xdt.Jd(getHint());
    bdR();
    GMTrace.o(11840822181888L, 88221);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\FTSBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */