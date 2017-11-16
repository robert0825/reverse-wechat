package com.tencent.mm.pluginsdk.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.g.a.sc;
import com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.mm.plugin.report.kvdata.log_13905;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.chat.n;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;

@com.tencent.mm.ui.base.a(3)
public class VoiceInputUI
  extends MMActivity
{
  private String eCh;
  private String itx;
  private Button krr;
  private int offset;
  private int textChangeCount;
  private MMEditText tvM;
  private VoiceInputFooter tvN;
  private String tvO;
  private long tvP;
  private boolean tvQ;
  private boolean tvR;
  private View.OnTouchListener tvS;
  private MenuItem.OnMenuItemClickListener tvT;
  private VoiceInputFooter.a tvU;
  
  public VoiceInputUI()
  {
    GMTrace.i(1173465595904L, 8743);
    this.tvP = 0L;
    this.textChangeCount = 0;
    this.tvQ = true;
    this.tvR = false;
    this.tvS = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(934289604608L, 6961);
        if (paramAnonymousMotionEvent.getAction() == 0) {
          VoiceInputUI.a(VoiceInputUI.this);
        }
        for (;;)
        {
          GMTrace.o(934289604608L, 6961);
          return false;
          if (paramAnonymousMotionEvent.getAction() == 1)
          {
            if (VoiceInputUI.b(VoiceInputUI.this).bLe())
            {
              paramAnonymousView = VoiceInputUI.b(VoiceInputUI.this);
              paramAnonymousView.bLf();
              paramAnonymousView.setVisibility(8);
            }
            if (VoiceInputUI.b(VoiceInputUI.this).bpP())
            {
              paramAnonymousView = VoiceInputUI.b(VoiceInputUI.this);
              paramAnonymousView.acy();
              paramAnonymousView.setVisibility(8);
            }
            paramAnonymousView = VoiceInputUI.b(VoiceInputUI.this);
            paramAnonymousView.setVisibility(0);
            if (paramAnonymousView.tvg != null) {
              paramAnonymousView.tvg.setImageResource(R.g.aVG);
            }
          }
        }
      }
    };
    this.tvT = new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1157359468544L, 8623);
        VoiceInputUI.c(VoiceInputUI.this).setText("");
        VoiceInputUI.d(VoiceInputUI.this);
        VoiceInputUI.this.zd(6);
        GMTrace.o(1157359468544L, 8623);
        return true;
      }
    };
    this.tvU = new VoiceInputFooter.a()
    {
      public final void bLh()
      {
        GMTrace.i(16683263590400L, 124300);
        VoiceInputUI.this.zd(8);
        GMTrace.o(16683263590400L, 124300);
      }
      
      public final void ka(boolean paramAnonymousBoolean)
      {
        GMTrace.i(16683129372672L, 124299);
        if (paramAnonymousBoolean)
        {
          VoiceInputUI.e(VoiceInputUI.this).setVisibility(4);
          GMTrace.o(16683129372672L, 124299);
          return;
        }
        VoiceInputUI.e(VoiceInputUI.this).setVisibility(0);
        GMTrace.o(16683129372672L, 124299);
      }
    };
    GMTrace.o(1173465595904L, 8743);
  }
  
  private static void a(VoiceInputBehavior paramVoiceInputBehavior)
  {
    GMTrace.i(16682189848576L, 124292);
    w.i("VoiceInputUI", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", new Object[] { Integer.valueOf(paramVoiceInputBehavior.cancel), Integer.valueOf(paramVoiceInputBehavior.send), Integer.valueOf(paramVoiceInputBehavior.click), Integer.valueOf(paramVoiceInputBehavior.longClick), Long.valueOf(paramVoiceInputBehavior.longClickTime), Integer.valueOf(paramVoiceInputBehavior.textClick), Integer.valueOf(paramVoiceInputBehavior.textChangeCount), Long.valueOf(paramVoiceInputBehavior.textChangeTime), Integer.valueOf(paramVoiceInputBehavior.textChangeReturn), Long.valueOf(paramVoiceInputBehavior.voiceInputTime), Integer.valueOf(paramVoiceInputBehavior.fail), Integer.valueOf(paramVoiceInputBehavior.clear), Integer.valueOf(paramVoiceInputBehavior.smileIconClick), Integer.valueOf(paramVoiceInputBehavior.voiceIconClick), Integer.valueOf(paramVoiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(paramVoiceInputBehavior.fullScreenVoiceLongClickTime) });
    log_13905 locallog_13905 = new log_13905();
    locallog_13905.viOp_ = paramVoiceInputBehavior;
    g.ork.b(13905, locallog_13905);
    GMTrace.o(16682189848576L, 124292);
  }
  
  private void nU(int paramInt)
  {
    GMTrace.i(16682324066304L, 124293);
    VoiceInputBehavior localVoiceInputBehavior = new VoiceInputBehavior();
    localVoiceInputBehavior.textChangeCount = this.textChangeCount;
    localVoiceInputBehavior.textChangeReturn = paramInt;
    if (this.tvP != 0L)
    {
      localVoiceInputBehavior.textChangeTime = bg.aI(this.tvP);
      this.tvP = 0L;
    }
    a(localVoiceInputBehavior);
    GMTrace.o(16682324066304L, 124293);
  }
  
  public final void Zp()
  {
    GMTrace.i(1174270902272L, 8749);
    zd(3);
    super.Zp();
    GMTrace.o(1174270902272L, 8749);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1174136684544L, 8748);
    int i = R.i.cHu;
    GMTrace.o(1174136684544L, 8748);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1173599813632L, 8744);
    super.onCreate(paramBundle);
    getWindow().addFlags(128);
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      this.eCh = paramBundle.getStringExtra("text");
      this.offset = paramBundle.getIntExtra("offset", -1);
      this.tvO = paramBundle.getStringExtra("punctuation");
      this.itx = paramBundle.getStringExtra("userCode");
    }
    this.tvP = bg.Pw();
    this.textChangeCount = 0;
    this.tvR = false;
    this.tvQ = true;
    this.tvM = ((MMEditText)findViewById(R.h.cln));
    this.krr = ((Button)findViewById(R.h.clm));
    this.tvM.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(16684337332224L, 124308);
        w.d("VoiceInputUI", "afterTextChanged firstTextChange:%s,textChange:%s", new Object[] { Boolean.valueOf(VoiceInputUI.f(VoiceInputUI.this)), Boolean.valueOf(VoiceInputUI.g(VoiceInputUI.this)) });
        if (VoiceInputUI.f(VoiceInputUI.this))
        {
          VoiceInputUI.h(VoiceInputUI.this);
          GMTrace.o(16684337332224L, 124308);
          return;
        }
        VoiceInputUI.d(VoiceInputUI.this);
        VoiceInputUI.c(VoiceInputUI.this).requestLayout();
        GMTrace.o(16684337332224L, 124308);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16684068896768L, 124306);
        GMTrace.o(16684068896768L, 124306);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16684203114496L, 124307);
        GMTrace.o(16684203114496L, 124307);
      }
    });
    this.krr.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16673063043072L, 124224);
        paramAnonymousView = new VoiceInputBehavior();
        paramAnonymousView.send = 3;
        VoiceInputUI.b(paramAnonymousView);
        VoiceInputUI.this.zd(7);
        GMTrace.o(16673063043072L, 124224);
      }
    });
    sq(getString(R.l.egK));
    lf(true);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1223126155264L, 9113);
        VoiceInputUI.this.zd(1);
        GMTrace.o(1223126155264L, 9113);
        return true;
      }
    });
    this.tvM.setOnTouchListener(this.tvS);
    this.tvM.Xi(this.eCh);
    if (this.offset != -1) {
      this.tvM.setSelection(this.offset);
    }
    this.tvN = ((VoiceInputFooter)findViewById(R.h.bZp));
    paramBundle = this.tvN;
    Object localObject = this.tvM;
    String str = this.tvO;
    paramBundle.qfz = ((MMEditText)localObject);
    ((MMEditText)localObject).setOnClickListener(new VoiceInputFooter.1(paramBundle));
    ((MMEditText)localObject).setOnEditorActionListener(new VoiceInputFooter.2(paramBundle));
    if (paramBundle.tvf == null)
    {
      paramBundle.tvf = new n(paramBundle.getContext(), true, paramBundle.qfz);
      paramBundle.tvf.tBr = new VoiceInputFooter.6(paramBundle);
      paramBundle.tvf.zz(j.aL(paramBundle.getContext()));
    }
    paramBundle.tvf.bMO();
    paramBundle.tvf.bLU();
    paramBundle.tvf.setVisibility(8);
    localObject = paramBundle.tvf;
    if (str != null) {
      ((n)localObject).tBN = str;
    }
    ((n)localObject).bMQ();
    paramBundle.njC.addView(paramBundle.tvf, -1, 0);
    this.tvN.tvm = this.tvU;
    GMTrace.o(1173599813632L, 8744);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1174002466816L, 8747);
    super.onDestroy();
    if (this.tvN != null)
    {
      VoiceInputFooter localVoiceInputFooter = this.tvN;
      if (localVoiceInputFooter.mQP != null)
      {
        localVoiceInputFooter.mQP.oI();
        localVoiceInputFooter.mQP.destroy();
      }
      if (localVoiceInputFooter.tvf != null) {
        localVoiceInputFooter.tvf.destroy();
      }
    }
    GMTrace.o(1174002466816L, 8747);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(1174405120000L, 8750);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0)) {
      zd(2);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(1174405120000L, 8750);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(1173868249088L, 8746);
    super.onPause();
    GMTrace.o(1173868249088L, 8746);
  }
  
  protected void onResume()
  {
    GMTrace.i(1173734031360L, 8745);
    super.onResume();
    this.tvM.requestFocus();
    GMTrace.o(1173734031360L, 8745);
  }
  
  public final void zd(int paramInt)
  {
    GMTrace.i(1174539337728L, 8751);
    w.i("VoiceInputUI", "alvinluo voiceinputui finish type: %d, call stack: %s", new Object[] { Integer.valueOf(paramInt), bg.bQW().toString() });
    sc localsc;
    if (paramInt == 8)
    {
      nU(7);
      localsc = new sc();
      if (paramInt != 7) {
        break label152;
      }
      localsc.eWS.action = 1;
      label71:
      if (!this.tvR) {
        break label180;
      }
    }
    label152:
    label180:
    for (localsc.eWS.eWT = 1;; localsc.eWS.eWT = 2)
    {
      localsc.eWS.result = this.tvM.getText().toString();
      localsc.eWS.itx = this.itx;
      com.tencent.mm.sdk.b.a.vgX.m(localsc);
      bg.da(this.tvM);
      super.finish();
      GMTrace.o(1174539337728L, 8751);
      return;
      nU(paramInt);
      break;
      if (paramInt == 8)
      {
        localsc.eWS.action = 4;
        break label71;
      }
      localsc.eWS.action = 2;
      break label71;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\VoiceInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */