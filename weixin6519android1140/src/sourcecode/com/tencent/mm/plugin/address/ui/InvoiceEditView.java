package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
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

public class InvoiceEditView
  extends RelativeLayout
  implements View.OnFocusChangeListener
{
  private int background;
  private int gravity;
  private int hvA;
  public boolean hvB;
  private View.OnFocusChangeListener hvh;
  private TextView hvi;
  EditText hvj;
  private ImageView hvk;
  private String hvl;
  private String hvm;
  int hvn;
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
  a hvz;
  private int imeOptions;
  private int inputType;
  
  public InvoiceEditView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(15208344977408L, 113311);
    GMTrace.o(15208344977408L, 113311);
  }
  
  public InvoiceEditView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(15208210759680L, 113310);
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
        GMTrace.i(15202305179648L, 113266);
        if ((InvoiceEditView.f(InvoiceEditView.this).getVisibility() == 0) && (InvoiceEditView.this.hvp) && (InvoiceEditView.a(InvoiceEditView.this) != 2) && (!bg.nm(InvoiceEditView.this.getText())))
        {
          InvoiceEditView.this.hvj.setText("");
          InvoiceEditView.a(InvoiceEditView.this, InvoiceEditView.e(InvoiceEditView.this).isFocused());
        }
        GMTrace.o(15202305179648L, 113266);
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
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(R.i.czW, this, true);
    this.hvj = ((EditText)paramAttributeSet.findViewById(R.h.bGe));
    this.hvj.setTextSize(0, a.V(paramContext, R.f.aQF));
    this.hvi = ((TextView)paramAttributeSet.findViewById(R.h.chy));
    this.hvk = ((ImageView)paramAttributeSet.findViewById(R.h.bHp));
    this.hvk.setOnClickListener(this.hvv);
    this.hvj.setImeOptions(this.imeOptions);
    this.hvj.setInputType(this.inputType);
    if (this.inputType == 2)
    {
      this.hvj.setKeyListener(new NumberKeyListener()
      {
        protected final char[] getAcceptedChars()
        {
          GMTrace.i(15212371509248L, 113341);
          GMTrace.o(15212371509248L, 113341);
          return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 45, 43, 95, 8212, 32, 32, 40, 41, -248, -247, 64, 126, 42, 38, 94, 37, 36, 35, 64, 33, 59, 58, -230, -229, 123, 125, 91, 93, -165, -163, 12304, 12305, 60, 62, 126, 96, 183, 61, 61, 43 };
        }
        
        public final int getInputType()
        {
          GMTrace.i(15212237291520L, 113340);
          GMTrace.o(15212237291520L, 113340);
          return 2;
        }
      });
      bQ(this.hvj.isFocused());
      this.hvj.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          int i = 0;
          int j = 0;
          GMTrace.i(15211700420608L, 113336);
          InvoiceEditView localInvoiceEditView;
          String str;
          StringBuilder localStringBuilder;
          if ((InvoiceEditView.a(InvoiceEditView.this) == 5) && (InvoiceEditView.b(InvoiceEditView.this) != paramAnonymousEditable.toString().length()))
          {
            InvoiceEditView.a(InvoiceEditView.this, paramAnonymousEditable.toString().length());
            localInvoiceEditView = InvoiceEditView.this;
            paramAnonymousEditable = paramAnonymousEditable.toString();
            if (localInvoiceEditView.hvn != 5) {
              break label455;
            }
            str = paramAnonymousEditable.replace(" ", "");
            if (str.length() < 4) {
              break label455;
            }
            localStringBuilder = new StringBuilder();
            if (str.length() % 4 != 0) {
              break label382;
            }
            i = j;
            while (i < str.length() / 4 - 1)
            {
              localStringBuilder.append(str.substring(i * 4, (i + 1) * 4)).append(" ");
              i += 1;
            }
          }
          label382:
          label455:
          for (;;)
          {
            localInvoiceEditView.hvj.setText(paramAnonymousEditable);
            localInvoiceEditView.hvj.setSelection(localInvoiceEditView.hvj.getText().length());
            boolean bool = InvoiceEditView.this.QW();
            if ((bool != InvoiceEditView.this.hvr) && (InvoiceEditView.c(InvoiceEditView.this) != null))
            {
              w.d("MicroMsg.InvoiceEditView", "View:" + InvoiceEditView.d(InvoiceEditView.this) + ", editType:" + InvoiceEditView.a(InvoiceEditView.this) + " inputValid change to " + bool);
              InvoiceEditView.this.hvr = bool;
              InvoiceEditView.c(InvoiceEditView.this).QT();
            }
            if (((!InvoiceEditView.this.hvy) || (InvoiceEditView.this.hvr)) && (InvoiceEditView.this.hvy) && (InvoiceEditView.this.hvr)) {
              InvoiceEditView.e(InvoiceEditView.this).setTextColor(InvoiceEditView.this.getResources().getColor(R.e.black));
            }
            InvoiceEditView.a(InvoiceEditView.this, InvoiceEditView.e(InvoiceEditView.this).isFocused());
            GMTrace.o(15211700420608L, 113336);
            return;
            while (i < str.length() / 4)
            {
              localStringBuilder.append(str.substring(i * 4, (i + 1) * 4)).append(" ");
              i += 1;
            }
            paramAnonymousEditable = str.substring(str.length() / 4 * 4, str.length());
          }
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(15211566202880L, 113335);
          GMTrace.o(15211566202880L, 113335);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(15211431985152L, 113334);
          GMTrace.o(15211431985152L, 113334);
        }
      });
      this.hvj.setOnFocusChangeListener(this);
      if (!bg.nm(this.hvl)) {
        this.hvj.setHint(this.hvl);
      }
      if (!bg.nm(this.hvm)) {
        this.hvi.setText(this.hvm);
      }
      paramContext = new Rect();
      b(this.hvj, paramContext);
      if (this.hvp) {
        break label689;
      }
      this.hvj.setEnabled(false);
      this.hvj.setTextColor(getResources().getColor(R.e.aMH));
      this.hvj.setFocusable(false);
      this.hvj.setClickable(false);
      this.hvj.setBackgroundResource(R.g.bbj);
      if (this.hvB) {
        setBackgroundResource(R.g.aVO);
      }
      setPadding(a.fromDPToPix(getContext(), 8), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
    for (;;)
    {
      c(this.hvj, paramContext);
      if (this.hvq != -1) {
        this.hvk.setImageResource(this.hvq);
      }
      if (!this.hvu) {
        this.hvj.setSingleLine(false);
      }
      GMTrace.o(15208210759680L, 113310);
      return;
      if (this.inputType == 3)
      {
        this.hvj.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(15212774162432L, 113344);
            if (InvoiceEditView.this.hvy)
            {
              GMTrace.o(15212774162432L, 113344);
              return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 32, 32 };
            }
            GMTrace.o(15212774162432L, 113344);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 45, 43, 95, 8212, 32, 32, 40, 41, -248, -247, 64, 126, 42, 38, 94, 37, 36, 35, 64, 33, 59, 58, -230, -229, 123, 125, 91, 93, -165, -163, 12304, 12305, 60, 62, -28820, 126, 96, 183, 61, 61, 43 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(15212639944704L, 113343);
            GMTrace.o(15212639944704L, 113343);
            return 3;
          }
        });
        break;
      }
      this.hvj.setInputType(this.inputType);
      break;
      label689:
      this.hvr = false;
      this.hvj.setBackgroundResource(this.hvo);
      setBackgroundResource(this.background);
    }
  }
  
  private static void b(View paramView, Rect paramRect)
  {
    GMTrace.i(15209821372416L, 113322);
    paramRect.left = paramView.getPaddingLeft();
    paramRect.right = paramView.getPaddingRight();
    paramRect.top = paramView.getPaddingTop();
    paramRect.bottom = paramView.getPaddingBottom();
    GMTrace.o(15209821372416L, 113322);
  }
  
  private void bQ(boolean paramBoolean)
  {
    GMTrace.i(15209150283776L, 113317);
    if ((this.hvp) && (!bg.nm(getText())))
    {
      this.hvk.setImageResource(R.g.aXB);
      this.hvk.setContentDescription(getContext().getString(R.l.bpn));
      switch (this.hvn)
      {
      default: 
        this.hvk.setVisibility(8);
        GMTrace.o(15209150283776L, 113317);
        return;
      case 0: 
      case 1: 
      case 4: 
      case 5: 
        if (paramBoolean)
        {
          this.hvk.setVisibility(0);
          GMTrace.o(15209150283776L, 113317);
          return;
        }
        this.hvk.setVisibility(8);
        GMTrace.o(15209150283776L, 113317);
        return;
      case 3: 
        this.hvk.setVisibility(0);
        this.hvk.setContentDescription(getContext().getString(R.l.cQZ));
        GMTrace.o(15209150283776L, 113317);
        return;
      }
      this.hvk.setVisibility(0);
      this.hvk.setContentDescription(getContext().getString(R.l.cQP));
      GMTrace.o(15209150283776L, 113317);
      return;
    }
    switch (this.hvn)
    {
    default: 
      this.hvk.setVisibility(8);
      GMTrace.o(15209150283776L, 113317);
      return;
    case 0: 
    case 1: 
    case 4: 
      this.hvk.setVisibility(8);
      GMTrace.o(15209150283776L, 113317);
      return;
    case 3: 
      this.hvk.setVisibility(0);
      this.hvk.setContentDescription(getContext().getString(R.l.cQZ));
      GMTrace.o(15209150283776L, 113317);
      return;
    }
    this.hvk.setVisibility(0);
    this.hvk.setContentDescription(getContext().getString(R.l.cQP));
    GMTrace.o(15209150283776L, 113317);
  }
  
  private static void c(View paramView, Rect paramRect)
  {
    GMTrace.i(15209955590144L, 113323);
    paramView.setPadding(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
    GMTrace.o(15209955590144L, 113323);
  }
  
  public final boolean QW()
  {
    GMTrace.i(15209016066048L, 113316);
    String str = this.hvj.getText().toString();
    switch (this.hvn)
    {
    case 2: 
    case 3: 
    default: 
      if ((str.length() >= this.hvs) && (str.length() <= this.hvt))
      {
        GMTrace.o(15209016066048L, 113316);
        return true;
      }
      break;
    case 0: 
      if ((str.length() >= this.hvs) && (str.length() <= this.hvt))
      {
        GMTrace.o(15209016066048L, 113316);
        return true;
      }
      GMTrace.o(15209016066048L, 113316);
      return false;
    case 1: 
      if ((str.length() == 0) || ((str.length() >= this.hvs) && (str.length() <= this.hvt)))
      {
        GMTrace.o(15209016066048L, 113316);
        return true;
      }
      GMTrace.o(15209016066048L, 113316);
      return false;
    case 4: 
      if (str.length() <= 100)
      {
        GMTrace.o(15209016066048L, 113316);
        return true;
      }
      GMTrace.o(15209016066048L, 113316);
      return false;
    case 5: 
      if (str.length() <= 48)
      {
        GMTrace.o(15209016066048L, 113316);
        return true;
      }
      GMTrace.o(15209016066048L, 113316);
      return false;
    }
    GMTrace.o(15209016066048L, 113316);
    return false;
  }
  
  public final boolean QX()
  {
    GMTrace.i(15209687154688L, 113321);
    if (getText().equals(bg.nl(this.hvw)))
    {
      GMTrace.o(15209687154688L, 113321);
      return false;
    }
    GMTrace.o(15209687154688L, 113321);
    return true;
  }
  
  public final String getText()
  {
    GMTrace.i(15208479195136L, 113312);
    String str = this.hvj.getText().toString();
    GMTrace.o(15208479195136L, 113312);
    return str;
  }
  
  public final void nG(String paramString)
  {
    GMTrace.i(15209552936960L, 113320);
    this.hvj.setText(paramString);
    this.hvj.setSelection(this.hvj.getText().length());
    this.hvw = paramString;
    GMTrace.o(15209552936960L, 113320);
  }
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    GMTrace.i(15209418719232L, 113319);
    if (this.hvh != null) {
      this.hvh.onFocusChange(this, paramBoolean);
    }
    w.d("MicroMsg.InvoiceEditView", "View:" + this.hvm + ", editType:" + this.hvn + " onFocusChange to " + paramBoolean);
    if (this.hvz != null) {
      this.hvz.QT();
    }
    if (!this.hvr)
    {
      this.hvi.setEnabled(false);
      if (paramView == this.hvj)
      {
        paramView = new Rect();
        b(this, paramView);
        if (!paramBoolean) {
          break label170;
        }
        setBackgroundResource(R.g.aXs);
      }
    }
    for (;;)
    {
      c(this, paramView);
      bQ(paramBoolean);
      GMTrace.o(15209418719232L, 113319);
      return;
      this.hvi.setEnabled(true);
      break;
      label170:
      setBackgroundResource(R.g.aXt);
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(15208747630592L, 113314);
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
      GMTrace.o(15208747630592L, 113314);
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
    GMTrace.o(15208747630592L, 113314);
    return true;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    GMTrace.i(15208613412864L, 113313);
    super.setEnabled(paramBoolean);
    this.hvp = paramBoolean;
    this.hvk.setEnabled(true);
    GMTrace.o(15208613412864L, 113313);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(15208881848320L, 113315);
    super.setOnClickListener(paramOnClickListener);
    GMTrace.o(15208881848320L, 113315);
  }
  
  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(15209284501504L, 113318);
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
    this.hvh = paramOnFocusChangeListener;
    GMTrace.o(15209284501504L, 113318);
  }
  
  public static abstract interface a
  {
    public abstract void QT();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\ui\InvoiceEditView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */