package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputConnection;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.tools.h.a;
import com.tencent.mm.ui.widget.MMEditText;

public final class WebViewInputFooter
  extends LinearLayout
{
  private MMActivity ezR;
  private ImageButton iNf;
  private boolean mQS;
  public c rWc;
  public a rWd;
  public b rWe;
  private WebViewSmileyPanel rWf;
  private View rWg;
  private View rWh;
  private View rWi;
  MMEditText rWj;
  private LinearLayout rWk;
  private boolean rWl;
  private int rWm;
  private int state;
  
  public WebViewInputFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12084427358208L, 90036);
    this.state = 0;
    this.rWm = Integer.MAX_VALUE;
    this.mQS = true;
    this.ezR = ((MMActivity)paramContext);
    paramContext = (ViewGroup)View.inflate(this.ezR, R.i.cnJ, this);
    this.rWk = ((LinearLayout)paramContext.findViewById(R.h.cnH));
    this.rWh = paramContext.findViewById(R.h.cnL);
    this.rWi = paramContext.findViewById(R.h.cnK);
    this.rWg = paramContext.findViewById(R.h.cnM);
    this.rWj = ((MMEditText)paramContext.findViewById(R.h.cnI));
    this.iNf = ((ImageButton)paramContext.findViewById(R.h.cnN));
    this.iNf.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12087514365952L, 90059);
        if (WebViewInputFooter.a(WebViewInputFooter.this) == 0)
        {
          WebViewInputFooter.b(WebViewInputFooter.this).aLo();
          if (!WebViewInputFooter.c(WebViewInputFooter.this)) {
            WebViewInputFooter.d(WebViewInputFooter.this).requestFocus();
          }
          WebViewInputFooter.e(WebViewInputFooter.this);
          WebViewInputFooter.f(WebViewInputFooter.this).setImageResource(R.k.cPb);
          WebViewInputFooter.a(WebViewInputFooter.this, 1);
          WebViewInputFooter.g(WebViewInputFooter.this);
          GMTrace.o(12087514365952L, 90059);
          return;
        }
        WebViewInputFooter.g(WebViewInputFooter.this);
        WebViewInputFooter.d(WebViewInputFooter.this).requestFocus();
        WebViewInputFooter.b(WebViewInputFooter.this).aLs();
        WebViewInputFooter.h(WebViewInputFooter.this);
        WebViewInputFooter.a(WebViewInputFooter.this, 0);
        GMTrace.o(12087514365952L, 90059);
      }
    });
    this.rWj.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(12084158922752L, 90034);
        WebViewInputFooter.g(WebViewInputFooter.this);
        WebViewInputFooter.i(WebViewInputFooter.this).setVisibility(8);
        WebViewInputFooter.f(WebViewInputFooter.this).setImageResource(R.g.aVG);
        WebViewInputFooter.a(WebViewInputFooter.this, 0);
        GMTrace.o(12084158922752L, 90034);
        return false;
      }
    });
    this.rWf = new WebViewSmileyPanel(getContext());
    this.rWf.setVisibility(8);
    this.rWf.setBackgroundResource(R.g.aUC);
    paramContext = this.rWf;
    paramContext.rWs = new WebViewSmileyPanel.a()
    {
      public final void acZ()
      {
        GMTrace.i(12072481980416L, 89947);
        if ((WebViewInputFooter.c(WebViewInputFooter.this)) && (WebViewInputFooter.j(WebViewInputFooter.this) != null))
        {
          WebViewInputFooter.j(WebViewInputFooter.this).sQ("[DELETE_EMOTION]");
          GMTrace.o(12072481980416L, 89947);
          return;
        }
        if (WebViewInputFooter.d(WebViewInputFooter.this) != null)
        {
          MMEditText localMMEditText = WebViewInputFooter.d(WebViewInputFooter.this);
          if (localMMEditText.xqp != null)
          {
            localMMEditText.xqp.sendKeyEvent(new KeyEvent(0, 67));
            localMMEditText.xqp.sendKeyEvent(new KeyEvent(1, 67));
            GMTrace.o(12072481980416L, 89947);
            return;
          }
          localMMEditText.dispatchKeyEvent(new KeyEvent(0, 67));
          localMMEditText.dispatchKeyEvent(new KeyEvent(1, 67));
        }
        GMTrace.o(12072481980416L, 89947);
      }
      
      public final void append(String paramAnonymousString)
      {
        GMTrace.i(12072347762688L, 89946);
        try
        {
          if (WebViewInputFooter.c(WebViewInputFooter.this))
          {
            WebViewInputFooter.j(WebViewInputFooter.this).sQ(paramAnonymousString);
            GMTrace.o(12072347762688L, 89946);
            return;
          }
          WebViewInputFooter.this.rWj.Xi(paramAnonymousString);
          GMTrace.o(12072347762688L, 89946);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          w.e("MicroMsg.WebViewInputFooter", "appendText, exp = %s", new Object[] { paramAnonymousString });
          GMTrace.o(12072347762688L, 89946);
        }
      }
    };
    paramContext.rWp.rWw = paramContext.rWs;
    ((LinearLayout)findViewById(R.h.bZf)).addView(this.rWf, -1, 0);
    this.rWi.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12072750415872L, 89949);
        paramAnonymousView = com.tencent.mm.ui.tools.a.c.d(WebViewInputFooter.d(WebViewInputFooter.this)).Ea(WebViewInputFooter.l(WebViewInputFooter.this));
        paramAnonymousView.iMz = h.a.xht;
        paramAnonymousView.xkl = true;
        paramAnonymousView.a(new c.a()
        {
          public final void acJ()
          {
            GMTrace.i(12082011439104L, 90018);
            GMTrace.o(12082011439104L, 90018);
          }
          
          public final void ack()
          {
            GMTrace.i(12082145656832L, 90019);
            if (WebViewInputFooter.b(WebViewInputFooter.this) != null) {
              Toast.makeText(WebViewInputFooter.b(WebViewInputFooter.this), "exceed max-length", 0).show();
            }
            GMTrace.o(12082145656832L, 90019);
          }
          
          public final void sT(String paramAnonymous2String)
          {
            GMTrace.i(12081877221376L, 90017);
            if (WebViewInputFooter.k(WebViewInputFooter.this) != null) {
              WebViewInputFooter.k(WebViewInputFooter.this).zD(WebViewInputFooter.d(WebViewInputFooter.this).getText().toString());
            }
            paramAnonymous2String = WebViewInputFooter.this;
            paramAnonymous2String.rWj.clearComposingText();
            paramAnonymous2String.rWj.setText("");
            GMTrace.o(12081877221376L, 90017);
          }
        });
        GMTrace.o(12072750415872L, 89949);
      }
    });
    this.rWj.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(12078119124992L, 89989);
        if (WebViewInputFooter.d(WebViewInputFooter.this).getText() == null)
        {
          GMTrace.o(12078119124992L, 89989);
          return;
        }
        WebViewInputFooter.d(WebViewInputFooter.this).requestFocus();
        if ((paramAnonymousEditable.length() > 0) && (paramAnonymousEditable.toString().trim().length() > 0)) {}
        for (boolean bool = true;; bool = false)
        {
          WebViewInputFooter.a(WebViewInputFooter.this, bool);
          GMTrace.o(12078119124992L, 89989);
          return;
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12077850689536L, 89987);
        GMTrace.o(12077850689536L, 89987);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12077984907264L, 89988);
        GMTrace.o(12077984907264L, 89988);
      }
    });
    GMTrace.o(12084427358208L, 90036);
  }
  
  private void acy()
  {
    GMTrace.i(12084695793664L, 90038);
    if (this.rWe != null) {
      this.rWe.aEA();
    }
    this.rWf.setVisibility(8);
    this.iNf.setImageResource(R.k.cPa);
    this.state = 0;
    GMTrace.o(12084695793664L, 90038);
  }
  
  private int bEc()
  {
    GMTrace.i(12084561575936L, 90037);
    if (this.rWe != null) {
      this.rWe.aEz();
    }
    if (this.rWj != null) {
      this.ezR.db(this.rWj);
    }
    this.rWf.setVisibility(0);
    Object localObject = this.rWf;
    if (((WebViewSmileyPanel)localObject).Hw != null) {
      ((WebViewSmileyPanel)localObject).Hw.setVisibility(0);
    }
    localObject = this.rWf.getLayoutParams();
    if ((localObject != null) && (this.mQS))
    {
      ((ViewGroup.LayoutParams)localObject).height = j.aL(getContext());
      this.rWf.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    if (localObject != null)
    {
      int i = ((ViewGroup.LayoutParams)localObject).height;
      GMTrace.o(12084561575936L, 90037);
      return i;
    }
    GMTrace.o(12084561575936L, 90037);
    return 0;
  }
  
  private void bFV()
  {
    GMTrace.i(12084964229120L, 90040);
    if (this.rWj != null)
    {
      this.rWj.clearFocus();
      this.rWj.setFocusable(false);
      this.rWj.setFocusableInTouchMode(false);
    }
    GMTrace.o(12084964229120L, 90040);
  }
  
  public final int bFW()
  {
    GMTrace.i(16914118082560L, 126020);
    setVisibility(0);
    if (this.rWk != null) {
      this.rWk.setVisibility(8);
    }
    this.rWl = true;
    this.state = 1;
    int i = bEc();
    GMTrace.o(16914118082560L, 126020);
    return i;
  }
  
  public final void bFX()
  {
    GMTrace.i(16914252300288L, 126021);
    if (this.rWl) {
      setVisibility(8);
    }
    this.state = 0;
    acy();
    GMTrace.o(16914252300288L, 126021);
  }
  
  public final void hide()
  {
    GMTrace.i(12085098446848L, 90041);
    setVisibility(8);
    if (this.ezR != null)
    {
      if (this.rWj != null) {
        this.ezR.db(this.rWj);
      }
      this.ezR.aLo();
    }
    this.state = 0;
    acy();
    bFV();
    GMTrace.o(12085098446848L, 90041);
  }
  
  public final boolean isShown()
  {
    GMTrace.i(12085232664576L, 90042);
    if (getVisibility() == 0)
    {
      GMTrace.o(12085232664576L, 90042);
      return true;
    }
    GMTrace.o(12085232664576L, 90042);
    return false;
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(12084830011392L, 90039);
    super.onDetachedFromWindow();
    bFV();
    if ((this.rWj != null) && (this.ezR != null)) {
      this.ezR.db(this.rWj);
    }
    this.rWj = null;
    WebViewSmileyPanel localWebViewSmileyPanel = this.rWf;
    c localc = localWebViewSmileyPanel.rWp;
    localc.rWv = null;
    localc.iPn = null;
    if (localWebViewSmileyPanel.Hw != null)
    {
      ((ViewGroup)localWebViewSmileyPanel.Hw.getParent()).removeView(localWebViewSmileyPanel.Hw);
      ((ViewGroup)localWebViewSmileyPanel.Hw).removeAllViews();
      localWebViewSmileyPanel.Hw = null;
    }
    localWebViewSmileyPanel.iPC = null;
    removeAllViews();
    this.ezR = null;
    this.rWc = null;
    GMTrace.o(12084830011392L, 90039);
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(16913715429376L, 126017);
    this.rWj.setText("");
    if (bg.nm(paramString))
    {
      GMTrace.o(16913715429376L, 126017);
      return;
    }
    try
    {
      this.rWj.append(paramString);
      w.d("MicroMsg.WebViewInputFooter", "after setText, editText.getText() = %s", new Object[] { this.rWj.getText() });
      GMTrace.o(16913715429376L, 126017);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.d("MicroMsg.WebViewInputFooter", "appendText, exp = %s", new Object[] { paramString });
      }
    }
  }
  
  public final void show()
  {
    GMTrace.i(16913983864832L, 126019);
    setVisibility(0);
    if (this.rWk != null) {
      this.rWk.setVisibility(0);
    }
    if (this.rWj != null)
    {
      this.rWj.setEnabled(true);
      this.rWj.setBackgroundResource(R.g.aXs);
    }
    if (this.rWg != null) {
      this.rWg.setVisibility(0);
    }
    this.rWl = false;
    if (this.rWj != null)
    {
      this.rWj.setFocusable(true);
      this.rWj.setFocusableInTouchMode(true);
      this.rWj.requestFocus();
    }
    if (this.ezR != null) {
      this.ezR.aLs();
    }
    this.state = 0;
    GMTrace.o(16913983864832L, 126019);
  }
  
  public final void yr(int paramInt)
  {
    GMTrace.i(16913849647104L, 126018);
    if (paramInt > 0) {
      this.rWm = paramInt;
    }
    GMTrace.o(16913849647104L, 126018);
  }
  
  public static abstract interface a
  {
    public abstract boolean sQ(String paramString);
  }
  
  public static abstract interface b
  {
    public abstract void aEA();
    
    public abstract void aEz();
  }
  
  public static abstract interface c
  {
    public abstract void zD(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\widget\input\WebViewInputFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */