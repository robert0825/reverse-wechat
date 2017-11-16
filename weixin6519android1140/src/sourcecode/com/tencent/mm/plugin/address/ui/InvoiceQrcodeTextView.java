package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.n;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class InvoiceQrcodeTextView
  extends RelativeLayout
  implements View.OnFocusChangeListener
{
  private int background;
  private int gravity;
  private int hvA;
  public boolean hvB;
  TextView hvS;
  private View.OnFocusChangeListener hvh;
  private TextView hvi;
  private ImageView hvk;
  private String hvl;
  private String hvm;
  private int hvn;
  private int hvo;
  public boolean hvp;
  private int hvq;
  public boolean hvr;
  private int hvs;
  private int hvt;
  private boolean hvu;
  private View.OnClickListener hvv;
  private String hvw;
  public boolean hvy;
  private int imeOptions;
  private int inputType;
  
  public InvoiceQrcodeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(15650995044352L, 116609);
    GMTrace.o(15650995044352L, 116609);
  }
  
  public InvoiceQrcodeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(15650860826624L, 116608);
    this.hvy = false;
    this.hvl = "";
    this.hvm = "";
    this.inputType = 1;
    this.hvA = 0;
    this.gravity = 19;
    this.hvn = -1;
    this.background = -1;
    this.hvo = -1;
    this.hvp = true;
    this.hvB = true;
    this.hvr = false;
    this.hvs = 0;
    this.hvt = 100;
    this.hvu = true;
    this.hvv = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(15650726608896L, 116607);
        if ((InvoiceQrcodeTextView.a(InvoiceQrcodeTextView.this).getVisibility() == 0) && (InvoiceQrcodeTextView.this.hvp) && (InvoiceQrcodeTextView.b(InvoiceQrcodeTextView.this) != 2) && (!bg.nm(InvoiceQrcodeTextView.this.getText())))
        {
          InvoiceQrcodeTextView.this.hvS.setText("");
          InvoiceQrcodeTextView.a(InvoiceQrcodeTextView.this, InvoiceQrcodeTextView.c(InvoiceQrcodeTextView.this).isFocused());
        }
        GMTrace.o(15650726608896L, 116607);
      }
    };
    this.hvw = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.enz, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(R.n.enG, 0);
    if (paramInt != 0) {
      this.hvl = paramContext.getString(paramInt);
    }
    paramInt = paramAttributeSet.getResourceId(R.n.enK, 0);
    if (paramInt != 0) {
      this.hvm = paramContext.getString(paramInt);
    }
    this.inputType = paramAttributeSet.getInteger(R.n.enD, 1);
    this.hvn = paramAttributeSet.getInteger(R.n.enE, 0);
    this.hvp = paramAttributeSet.getBoolean(R.n.enF, true);
    this.gravity = paramAttributeSet.getInt(R.n.enB, 19);
    this.imeOptions = paramAttributeSet.getInteger(R.n.enC, 5);
    this.background = paramAttributeSet.getResourceId(R.n.enA, R.g.bbj);
    this.hvq = paramAttributeSet.getResourceId(R.n.enI, -1);
    this.hvo = paramAttributeSet.getResourceId(R.n.enH, R.g.bbj);
    this.hvu = paramAttributeSet.getBoolean(R.n.enJ, true);
    paramAttributeSet.recycle();
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(R.i.czZ, this, true);
    this.hvS = ((TextView)paramAttributeSet.findViewById(R.h.bGe));
    this.hvS.setTextSize(0, a.V(paramContext, R.f.aQF));
    this.hvi = ((TextView)paramAttributeSet.findViewById(R.h.chy));
    this.hvk = ((ImageView)paramAttributeSet.findViewById(R.h.bHp));
    this.hvk.setOnClickListener(this.hvv);
    this.hvS.setImeOptions(this.imeOptions);
    if (!bg.nm(this.hvl)) {
      this.hvS.setHint(this.hvl);
    }
    if (!bg.nm(this.hvm)) {
      this.hvi.setText(this.hvm);
    }
    paramContext = new Rect();
    b(this.hvS, paramContext);
    c(this.hvS, paramContext);
    setPadding(a.fromDPToPix(getContext(), 8), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    if (this.hvq != -1) {
      this.hvk.setImageResource(this.hvq);
    }
    if (!this.hvu) {
      this.hvS.setSingleLine(false);
    }
    GMTrace.o(15650860826624L, 116608);
  }
  
  private static void b(View paramView, Rect paramRect)
  {
    GMTrace.i(15652337221632L, 116619);
    paramRect.left = paramView.getPaddingLeft();
    paramRect.right = paramView.getPaddingRight();
    paramRect.top = paramView.getPaddingTop();
    paramRect.bottom = paramView.getPaddingBottom();
    GMTrace.o(15652337221632L, 116619);
  }
  
  private void bQ(boolean paramBoolean)
  {
    GMTrace.i(15651800350720L, 116615);
    if ((this.hvp) && (!bg.nm(getText())))
    {
      this.hvk.setImageResource(R.g.aXB);
      this.hvk.setContentDescription(getContext().getString(R.l.bpn));
      switch (this.hvn)
      {
      default: 
        this.hvk.setVisibility(8);
        GMTrace.o(15651800350720L, 116615);
        return;
      case 0: 
      case 1: 
      case 4: 
      case 5: 
        if (paramBoolean)
        {
          this.hvk.setVisibility(0);
          GMTrace.o(15651800350720L, 116615);
          return;
        }
        this.hvk.setVisibility(8);
        GMTrace.o(15651800350720L, 116615);
        return;
      case 3: 
        this.hvk.setVisibility(0);
        this.hvk.setContentDescription(getContext().getString(R.l.cQZ));
        GMTrace.o(15651800350720L, 116615);
        return;
      }
      this.hvk.setVisibility(0);
      this.hvk.setContentDescription(getContext().getString(R.l.cQP));
      GMTrace.o(15651800350720L, 116615);
      return;
    }
    switch (this.hvn)
    {
    default: 
      this.hvk.setVisibility(8);
      GMTrace.o(15651800350720L, 116615);
      return;
    case 0: 
    case 1: 
    case 4: 
      this.hvk.setVisibility(8);
      GMTrace.o(15651800350720L, 116615);
      return;
    case 3: 
      this.hvk.setVisibility(0);
      this.hvk.setContentDescription(getContext().getString(R.l.cQZ));
      GMTrace.o(15651800350720L, 116615);
      return;
    }
    this.hvk.setVisibility(0);
    this.hvk.setContentDescription(getContext().getString(R.l.cQP));
    GMTrace.o(15651800350720L, 116615);
  }
  
  private static void c(View paramView, Rect paramRect)
  {
    GMTrace.i(15652471439360L, 116620);
    paramView.setPadding(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
    GMTrace.o(15652471439360L, 116620);
  }
  
  public final void QZ()
  {
    GMTrace.i(15651129262080L, 116610);
    setBackgroundResource(0);
    this.hvi.setTextColor(getResources().getColor(R.e.aOT));
    this.hvS.setTextColor(getResources().getColor(R.e.black));
    this.hvS.setInputType(0);
    this.hvS.clearFocus();
    this.hvS.setSingleLine(false);
    ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.hvS.getWindowToken(), 0);
    GMTrace.o(15651129262080L, 116610);
  }
  
  public final String getText()
  {
    GMTrace.i(15651263479808L, 116611);
    String str = this.hvS.getText().toString();
    GMTrace.o(15651263479808L, 116611);
    return str;
  }
  
  public final void nG(String paramString)
  {
    GMTrace.i(15652203003904L, 116618);
    this.hvS.setText(paramString);
    this.hvw = paramString;
    GMTrace.o(15652203003904L, 116618);
  }
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    GMTrace.i(15652068786176L, 116617);
    if (this.hvh != null) {
      this.hvh.onFocusChange(this, paramBoolean);
    }
    w.d("MicroMsg.InvoiceEditView", "View:" + this.hvm + ", editType:" + this.hvn + " onFocusChange to " + paramBoolean);
    if (!this.hvr)
    {
      this.hvi.setEnabled(false);
      if (paramView == this.hvS)
      {
        paramView = new Rect();
        b(this, paramView);
        if (!paramBoolean) {
          break label154;
        }
        setBackgroundResource(R.g.aXs);
      }
    }
    for (;;)
    {
      c(this, paramView);
      bQ(paramBoolean);
      GMTrace.o(15652068786176L, 116617);
      return;
      this.hvi.setEnabled(true);
      break;
      label154:
      setBackgroundResource(R.g.aXt);
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(15651531915264L, 116613);
    int i;
    if (!this.hvp)
    {
      if (this.hvk.getVisibility() != 0) {
        break label126;
      }
      i = 1;
      if (i == 0) {
        break label136;
      }
      Rect localRect = new Rect();
      this.hvk.getHitRect(localRect);
      localRect.left -= 50;
      localRect.right += 50;
      localRect.top -= 25;
      localRect.bottom += 25;
      if (!localRect.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
        break label131;
      }
      i = 1;
    }
    for (;;)
    {
      if (i == 0) {
        break label141;
      }
      GMTrace.o(15651531915264L, 116613);
      return false;
      label126:
      i = 0;
      break;
      label131:
      i = 0;
      continue;
      label136:
      i = 0;
    }
    label141:
    GMTrace.o(15651531915264L, 116613);
    return true;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    GMTrace.i(15651397697536L, 116612);
    super.setEnabled(paramBoolean);
    this.hvp = paramBoolean;
    this.hvk.setEnabled(true);
    GMTrace.o(15651397697536L, 116612);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(15651666132992L, 116614);
    super.setOnClickListener(paramOnClickListener);
    GMTrace.o(15651666132992L, 116614);
  }
  
  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(15651934568448L, 116616);
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
    this.hvh = paramOnFocusChangeListener;
    GMTrace.o(15651934568448L, 116616);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\ui\InvoiceQrcodeTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */