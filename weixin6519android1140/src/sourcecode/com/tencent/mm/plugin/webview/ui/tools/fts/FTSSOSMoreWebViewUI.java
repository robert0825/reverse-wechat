package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.ImageButton;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.az.e;
import com.tencent.mm.br.a;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
import com.tencent.mm.ui.p;

public class FTSSOSMoreWebViewUI
  extends BaseSOSWebViewUI
{
  private int rOZ;
  private View rPG;
  
  public FTSSOSMoreWebViewUI()
  {
    GMTrace.i(16227862839296L, 120907);
    GMTrace.o(16227862839296L, 120907);
  }
  
  protected final int aaH()
  {
    GMTrace.i(16228131274752L, 120909);
    if ((d.et(23)) && (!h.tE()))
    {
      i = getResources().getColor(R.e.white);
      GMTrace.o(16228131274752L, 120909);
      return i;
    }
    int i = super.aaH();
    GMTrace.o(16228131274752L, 120909);
    return i;
  }
  
  public boolean aaM()
  {
    GMTrace.i(16899488350208L, 125911);
    bEP().chC();
    this.rPG.setVisibility(0);
    boolean bool = super.aaM();
    GMTrace.o(16899488350208L, 125911);
    return bool;
  }
  
  protected final void aaO()
  {
    GMTrace.i(16227997057024L, 120908);
    super.aaO();
    this.rPG = findViewById(R.h.cnO);
    bEP().chI();
    bEP().chC();
    this.rOm.setVisibility(0);
    this.nta.setVisibility(8);
    this.rOZ = a.fromDPToPix(this, 48);
    bEP().v(e.a(this.type, this));
    if (this.scene == 24) {
      this.rPG.setVisibility(4);
    }
    findViewById(R.h.bZf).setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(19406004420608L, 144586);
        FTSSOSMoreWebViewUI.this.bEP().wjB.clearFocus();
        FTSSOSMoreWebViewUI.this.aLo();
        GMTrace.o(19406004420608L, 144586);
        return false;
      }
    });
    if ((getIntent() != null) && (getIntent().getBooleanExtra("ftsneedkeyboard", false))) {
      this.vKB.hqF.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19409494081536L, 144612);
          FTSSOSMoreWebViewUI.this.bEP().chz();
          FTSSOSMoreWebViewUI.this.bEP().chy();
          GMTrace.o(19409494081536L, 144612);
        }
      }, 128L);
    }
    ai(getResources().getColor(R.e.white), true);
    GMTrace.o(16227997057024L, 120908);
  }
  
  protected final void bEL()
  {
    GMTrace.i(16228399710208L, 120911);
    finish();
    GMTrace.o(16228399710208L, 120911);
  }
  
  protected final void bEM()
  {
    GMTrace.i(19411775782912L, 144629);
    super.bEM();
    this.rPG.setVisibility(0);
    GMTrace.o(19411775782912L, 144629);
  }
  
  protected final String getHint()
  {
    GMTrace.i(16228533927936L, 120912);
    int i = -1;
    if ((this.type == 8) && (this.rOD)) {
      i = R.l.dyx;
    }
    while (i < 0)
    {
      str = ab.getContext().getResources().getString(R.l.cUr) + ya(this.type);
      GMTrace.o(16228533927936L, 120912);
      return str;
      switch (this.type)
      {
      default: 
        break;
      case 1: 
        i = R.l.dWq;
        break;
      case 8: 
        i = R.l.dyw;
        break;
      case 2: 
        i = R.l.dWp;
        break;
      case 16: 
        i = R.l.dyv;
        break;
      case 64: 
        i = R.l.cRT;
        break;
      case 256: 
      case 384: 
        i = R.l.dyr;
        break;
      case 128: 
        i = R.l.dys;
        break;
      case 512: 
        i = R.l.dyt;
        break;
      case 1024: 
        i = R.l.dyu;
      }
    }
    String str = ab.getContext().getResources().getString(R.l.dWo, new Object[] { ab.getContext().getResources().getString(i) });
    GMTrace.o(16228533927936L, 120912);
    return str;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(16228265492480L, 120910);
    int i = R.i.cGN;
    GMTrace.o(16228265492480L, 120910);
    return i;
  }
  
  public final void he(boolean paramBoolean)
  {
    GMTrace.i(16899354132480L, 125910);
    super.he(paramBoolean);
    if (paramBoolean)
    {
      this.rOk.setPadding(0, 0, this.rOk.getPaddingRight(), 0);
      this.rOm.setVisibility(8);
    }
    for (;;)
    {
      bEP().chC();
      GMTrace.o(16899354132480L, 125910);
      return;
      this.rOk.setPadding(this.rOZ, 0, this.rOk.getPaddingRight(), 0);
      this.rOm.setVisibility(0);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\fts\FTSSOSMoreWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */