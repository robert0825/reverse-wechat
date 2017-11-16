package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.MMActivity;

public class WebViewSearchContentInputFooter
  extends LinearLayout
{
  private View rVU;
  private EditText rVV;
  private View rVW;
  private View rVX;
  private View rVY;
  private TextView rVZ;
  public a rWa;
  
  public WebViewSearchContentInputFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12064697352192L, 89889);
    init();
    GMTrace.o(12064697352192L, 89889);
  }
  
  public WebViewSearchContentInputFooter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12064831569920L, 89890);
    init();
    GMTrace.o(12064831569920L, 89890);
  }
  
  private void init()
  {
    GMTrace.i(12064965787648L, 89891);
    View localView = inflate(getContext(), R.i.cHW, this);
    this.rVV = ((EditText)localView.findViewById(R.h.bvB));
    this.rVW = localView.findViewById(R.h.bpr);
    this.rVX = localView.findViewById(R.h.bTJ);
    this.rVY = localView.findViewById(R.h.bQS);
    this.rVZ = ((TextView)localView.findViewById(R.h.bHm));
    this.rVU = localView.findViewById(R.h.bHt);
    this.rVW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12095164776448L, 90116);
        WebViewSearchContentInputFooter.this.hide();
        GMTrace.o(12095164776448L, 90116);
      }
    });
    this.rVX.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12088051236864L, 90063);
        if (WebViewSearchContentInputFooter.c(WebViewSearchContentInputFooter.this) != null) {
          WebViewSearchContentInputFooter.c(WebViewSearchContentInputFooter.this).aEC();
        }
        GMTrace.o(12088051236864L, 90063);
      }
    });
    this.rVY.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12072079327232L, 89944);
        if (WebViewSearchContentInputFooter.c(WebViewSearchContentInputFooter.this) != null) {
          WebViewSearchContentInputFooter.c(WebViewSearchContentInputFooter.this).aED();
        }
        GMTrace.o(12072079327232L, 89944);
      }
    });
    this.rVV.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(12060268167168L, 89856);
        if (WebViewSearchContentInputFooter.c(WebViewSearchContentInputFooter.this) != null) {
          WebViewSearchContentInputFooter.c(WebViewSearchContentInputFooter.this).c(paramAnonymousInt, paramAnonymousKeyEvent);
        }
        if ((paramAnonymousInt == 66) && (WebViewSearchContentInputFooter.c(WebViewSearchContentInputFooter.this) != null))
        {
          paramAnonymousView = paramAnonymousView.getContext();
          if ((paramAnonymousView instanceof MMActivity)) {
            ((MMActivity)paramAnonymousView).db(WebViewSearchContentInputFooter.d(WebViewSearchContentInputFooter.this));
          }
          WebViewSearchContentInputFooter.c(WebViewSearchContentInputFooter.this).b(WebViewSearchContentInputFooter.this);
          GMTrace.o(12060268167168L, 89856);
          return true;
        }
        GMTrace.o(12060268167168L, 89856);
        return false;
      }
    });
    this.rVV.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(12094627905536L, 90112);
        if ((!paramAnonymousBoolean) && (WebViewSearchContentInputFooter.c(WebViewSearchContentInputFooter.this) != null))
        {
          paramAnonymousView = paramAnonymousView.getContext();
          if ((paramAnonymousView instanceof MMActivity)) {
            ((MMActivity)paramAnonymousView).db(WebViewSearchContentInputFooter.d(WebViewSearchContentInputFooter.this));
          }
        }
        WebViewSearchContentInputFooter.e(WebViewSearchContentInputFooter.this).setSelected(paramAnonymousBoolean);
        GMTrace.o(12094627905536L, 90112);
      }
    });
    this.rVV.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(12094091034624L, 90108);
        GMTrace.o(12094091034624L, 90108);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12093822599168L, 90106);
        GMTrace.o(12093822599168L, 90106);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(12093956816896L, 90107);
        if (WebViewSearchContentInputFooter.c(WebViewSearchContentInputFooter.this) != null)
        {
          WebViewSearchContentInputFooter.a locala = WebViewSearchContentInputFooter.c(WebViewSearchContentInputFooter.this);
          WebViewSearchContentInputFooter localWebViewSearchContentInputFooter = WebViewSearchContentInputFooter.this;
          if (paramAnonymousCharSequence != null) {
            paramAnonymousCharSequence.toString();
          }
          locala.a(localWebViewSearchContentInputFooter);
        }
        GMTrace.o(12093956816896L, 90107);
      }
    });
    this.rVV.setSelectAllOnFocus(true);
    reset();
    GMTrace.o(12064965787648L, 89891);
  }
  
  public final void bFT()
  {
    GMTrace.i(12065234223104L, 89893);
    this.rVV.setText("");
    GMTrace.o(12065234223104L, 89893);
  }
  
  public final String bFU()
  {
    GMTrace.i(12065771094016L, 89897);
    String str = this.rVV.getText().toString();
    GMTrace.o(12065771094016L, 89897);
    return str;
  }
  
  public final void hide()
  {
    GMTrace.i(12065502658560L, 89895);
    Context localContext = this.rVV.getContext();
    if ((localContext instanceof MMActivity)) {
      ((MMActivity)localContext).db(this.rVV);
    }
    this.rVV.clearFocus();
    setVisibility(8);
    if (this.rWa != null) {
      this.rWa.aEB();
    }
    GMTrace.o(12065502658560L, 89895);
  }
  
  public boolean isShown()
  {
    GMTrace.i(12065368440832L, 89894);
    if (getVisibility() == 0)
    {
      GMTrace.o(12065368440832L, 89894);
      return true;
    }
    GMTrace.o(12065368440832L, 89894);
    return false;
  }
  
  public final void o(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(12065636876288L, 89896);
    if (!paramBoolean)
    {
      GMTrace.o(12065636876288L, 89896);
      return;
    }
    Object localObject = this.rVZ;
    if (paramInt2 == 0)
    {
      paramInt1 = 0;
      ((TextView)localObject).setText(String.format("%d/%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
      localObject = this.rVY;
      if (paramInt2 <= 0) {
        break label117;
      }
      paramBoolean = true;
      label76:
      ((View)localObject).setEnabled(paramBoolean);
      localObject = this.rVX;
      if (paramInt2 <= 0) {
        break label122;
      }
    }
    label117:
    label122:
    for (paramBoolean = bool;; paramBoolean = false)
    {
      ((View)localObject).setEnabled(paramBoolean);
      GMTrace.o(12065636876288L, 89896);
      return;
      paramInt1 += 1;
      break;
      paramBoolean = false;
      break label76;
    }
  }
  
  public final void reset()
  {
    GMTrace.i(12065100005376L, 89892);
    this.rVZ.setText("");
    this.rVX.setEnabled(false);
    this.rVY.setEnabled(false);
    GMTrace.o(12065100005376L, 89892);
  }
  
  public final void show()
  {
    GMTrace.i(16913581211648L, 126016);
    setVisibility(0);
    if (this.rWa != null) {
      this.rWa.onShow();
    }
    this.rVV.requestFocus();
    postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12096238518272L, 90124);
        MMActivity.G((Activity)WebViewSearchContentInputFooter.this.getContext());
        GMTrace.o(12096238518272L, 90124);
      }
    }, 100L);
    GMTrace.o(16913581211648L, 126016);
  }
  
  public static abstract interface a
  {
    public abstract void a(WebViewSearchContentInputFooter paramWebViewSearchContentInputFooter);
    
    public abstract void aEB();
    
    public abstract void aEC();
    
    public abstract void aED();
    
    public abstract void b(WebViewSearchContentInputFooter paramWebViewSearchContentInputFooter);
    
    public abstract boolean c(int paramInt, KeyEvent paramKeyEvent);
    
    public abstract void onShow();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\widget\WebViewSearchContentInputFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */