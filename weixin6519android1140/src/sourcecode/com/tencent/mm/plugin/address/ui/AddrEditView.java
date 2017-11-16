package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.telephony.PhoneNumberUtils;
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
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.n;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class AddrEditView
  extends RelativeLayout
  implements View.OnFocusChangeListener
{
  private int background;
  private int gravity;
  a hvf;
  b hvg;
  private View.OnFocusChangeListener hvh;
  private TextView hvi;
  EditText hvj;
  private ImageView hvk;
  private String hvl;
  private String hvm;
  private int hvn;
  private int hvo;
  public boolean hvp;
  private int hvq;
  private boolean hvr;
  private int hvs;
  private int hvt;
  private boolean hvu;
  private View.OnClickListener hvv;
  private String hvw;
  private int imeOptions;
  private int inputType;
  
  public AddrEditView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(12805847646208L, 95411);
    GMTrace.o(12805847646208L, 95411);
  }
  
  public AddrEditView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12805713428480L, 95410);
    this.hvl = "";
    this.hvm = "";
    this.inputType = 1;
    this.gravity = 19;
    this.hvn = -1;
    this.background = -1;
    this.hvo = -1;
    this.hvp = true;
    this.hvr = false;
    this.hvs = 1;
    this.hvt = 30;
    this.hvu = true;
    this.hvv = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12796720840704L, 95343);
        if (AddrEditView.f(AddrEditView.this).getVisibility() == 0)
        {
          if ((AddrEditView.this.hvp) && (AddrEditView.d(AddrEditView.this) != 2) && (!bg.nm(AddrEditView.this.getText())))
          {
            AddrEditView.this.hvj.setText("");
            AddrEditView.b(AddrEditView.this, AddrEditView.e(AddrEditView.this).isFocused());
            GMTrace.o(12796720840704L, 95343);
            return;
          }
          if (AddrEditView.g(AddrEditView.this) != null) {
            AddrEditView.g(AddrEditView.this).onClick();
          }
        }
        GMTrace.o(12796720840704L, 95343);
      }
    };
    this.hvw = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.emo, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(R.n.emr, 0);
    if (paramInt != 0) {
      this.hvl = paramContext.getString(paramInt);
    }
    paramInt = paramAttributeSet.getResourceId(R.n.emv, 0);
    if (paramInt != 0) {
      this.hvm = paramContext.getString(paramInt);
    }
    this.inputType = paramAttributeSet.getInteger(R.n.emz, 1);
    this.hvn = paramAttributeSet.getInteger(R.n.emp, 0);
    this.hvp = paramAttributeSet.getBoolean(R.n.emq, true);
    this.gravity = paramAttributeSet.getInt(R.n.emx, 19);
    this.imeOptions = paramAttributeSet.getInteger(R.n.emy, 5);
    this.background = paramAttributeSet.getResourceId(R.n.emw, R.g.bbj);
    this.hvq = paramAttributeSet.getResourceId(R.n.emt, -1);
    this.hvo = paramAttributeSet.getResourceId(R.n.ems, R.g.bbj);
    this.hvu = paramAttributeSet.getBoolean(R.n.emu, true);
    paramAttributeSet.recycle();
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(R.i.coS, this, true);
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
          GMTrace.i(12798868324352L, 95359);
          GMTrace.o(12798868324352L, 95359);
          return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
        }
        
        public final int getInputType()
        {
          GMTrace.i(12798734106624L, 95358);
          GMTrace.o(12798734106624L, 95358);
          return 3;
        }
      });
      bQ(this.hvj.isFocused());
      this.hvj.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(12800210501632L, 95369);
          boolean bool = AddrEditView.this.QW();
          if ((bool != AddrEditView.a(AddrEditView.this)) && (AddrEditView.b(AddrEditView.this) != null))
          {
            w.d("MicroMsg.AddrEditView", "View:" + AddrEditView.c(AddrEditView.this) + ", editType:" + AddrEditView.d(AddrEditView.this) + " inputValid change to " + bool);
            AddrEditView.a(AddrEditView.this, bool);
            AddrEditView.b(AddrEditView.this).QT();
          }
          AddrEditView.b(AddrEditView.this, AddrEditView.e(AddrEditView.this).isFocused());
          GMTrace.o(12800210501632L, 95369);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(12800076283904L, 95368);
          GMTrace.o(12800076283904L, 95368);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(12799942066176L, 95367);
          GMTrace.o(12799942066176L, 95367);
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
        break label678;
      }
      this.hvj.setEnabled(false);
      this.hvj.setTextColor(getResources().getColor(R.e.aMH));
      this.hvj.setFocusable(false);
      this.hvj.setClickable(false);
      this.hvj.setBackgroundResource(R.g.bbj);
      setBackgroundResource(R.g.aVO);
      setPadding(a.fromDPToPix(getContext(), 8), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
    for (;;)
    {
      c(this.hvj, paramContext);
      this.hvj.setGravity(this.gravity);
      if (this.hvq != -1) {
        this.hvk.setImageResource(this.hvq);
      }
      if (!this.hvu) {
        this.hvj.setSingleLine(false);
      }
      GMTrace.o(12805713428480L, 95410);
      return;
      if (this.inputType == 3)
      {
        this.hvj.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(12795378663424L, 95333);
            GMTrace.o(12795378663424L, 95333);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(12795244445696L, 95332);
            GMTrace.o(12795244445696L, 95332);
            return 3;
          }
        });
        break;
      }
      this.hvj.setInputType(this.inputType);
      break;
      label678:
      this.hvr = false;
      this.hvj.setBackgroundResource(this.hvo);
      setBackgroundResource(this.background);
    }
  }
  
  private static void b(View paramView, Rect paramRect)
  {
    GMTrace.i(12807324041216L, 95422);
    paramRect.left = paramView.getPaddingLeft();
    paramRect.right = paramView.getPaddingRight();
    paramRect.top = paramView.getPaddingTop();
    paramRect.bottom = paramView.getPaddingBottom();
    GMTrace.o(12807324041216L, 95422);
  }
  
  private void bQ(boolean paramBoolean)
  {
    GMTrace.i(12806652952576L, 95417);
    if ((this.hvp) && (!bg.nm(getText())))
    {
      this.hvk.setImageResource(R.g.aXB);
      this.hvk.setContentDescription(getContext().getString(R.l.bpn));
      switch (this.hvn)
      {
      default: 
        this.hvk.setVisibility(8);
        GMTrace.o(12806652952576L, 95417);
        return;
      case 0: 
      case 1: 
        if (paramBoolean)
        {
          this.hvk.setVisibility(0);
          GMTrace.o(12806652952576L, 95417);
          return;
        }
        this.hvk.setVisibility(8);
        GMTrace.o(12806652952576L, 95417);
        return;
      case 3: 
        this.hvk.setVisibility(0);
        this.hvk.setImageResource(R.k.cPF);
        this.hvk.setContentDescription(getContext().getString(R.l.cQZ));
        GMTrace.o(12806652952576L, 95417);
        return;
      }
      this.hvk.setVisibility(0);
      this.hvk.setImageResource(R.k.cPE);
      this.hvk.setContentDescription(getContext().getString(R.l.cQP));
      GMTrace.o(12806652952576L, 95417);
      return;
    }
    switch (this.hvn)
    {
    default: 
      this.hvk.setVisibility(8);
      GMTrace.o(12806652952576L, 95417);
      return;
    case 0: 
    case 1: 
      this.hvk.setVisibility(8);
      GMTrace.o(12806652952576L, 95417);
      return;
    case 3: 
      this.hvk.setVisibility(0);
      this.hvk.setImageResource(R.k.cPF);
      this.hvk.setContentDescription(getContext().getString(R.l.cQZ));
      GMTrace.o(12806652952576L, 95417);
      return;
    }
    this.hvk.setVisibility(0);
    this.hvk.setImageResource(R.k.cPE);
    this.hvk.setContentDescription(getContext().getString(R.l.cQP));
    GMTrace.o(12806652952576L, 95417);
  }
  
  private static void c(View paramView, Rect paramRect)
  {
    GMTrace.i(12807458258944L, 95423);
    paramView.setPadding(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
    GMTrace.o(12807458258944L, 95423);
  }
  
  public final boolean QW()
  {
    GMTrace.i(12806518734848L, 95416);
    Object localObject = this.hvj.getText().toString();
    switch (this.hvn)
    {
    case 0: 
    case 2: 
    case 3: 
    default: 
      if (((String)localObject).length() >= this.hvs)
      {
        GMTrace.o(12806518734848L, 95416);
        return true;
      }
      break;
    case 1: 
      if ((((String)localObject).length() >= this.hvs) && (((String)localObject).length() <= this.hvt))
      {
        if (localObject == null) {
          localObject = null;
        }
        while (PhoneNumberUtils.isGlobalPhoneNumber((String)localObject))
        {
          GMTrace.o(12806518734848L, 95416);
          return true;
          String str = ((String)localObject).replaceAll("\\D", "");
          localObject = str;
          if (str.startsWith("86")) {
            localObject = str.substring(2);
          }
        }
      }
      GMTrace.o(12806518734848L, 95416);
      return false;
    }
    GMTrace.o(12806518734848L, 95416);
    return false;
  }
  
  public final boolean QX()
  {
    GMTrace.i(12807189823488L, 95421);
    if (getText().equals(bg.nl(this.hvw)))
    {
      GMTrace.o(12807189823488L, 95421);
      return false;
    }
    GMTrace.o(12807189823488L, 95421);
    return true;
  }
  
  public final String getText()
  {
    GMTrace.i(12805981863936L, 95412);
    String str = this.hvj.getText().toString();
    GMTrace.o(12805981863936L, 95412);
    return str;
  }
  
  public final void nG(String paramString)
  {
    GMTrace.i(12807055605760L, 95420);
    this.hvj.setText(paramString);
    this.hvj.setSelection(this.hvj.getText().length());
    this.hvw = paramString;
    GMTrace.o(12807055605760L, 95420);
  }
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    GMTrace.i(12806921388032L, 95419);
    if (this.hvh != null) {
      this.hvh.onFocusChange(this, paramBoolean);
    }
    w.d("MicroMsg.AddrEditView", "View:" + this.hvm + ", editType:" + this.hvn + " onFocusChange to " + paramBoolean);
    if (this.hvg != null) {
      this.hvg.QT();
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
      GMTrace.o(12806921388032L, 95419);
      return;
      this.hvi.setEnabled(true);
      break;
      label170:
      setBackgroundResource(R.g.aXt);
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(12806250299392L, 95414);
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
      GMTrace.o(12806250299392L, 95414);
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
    GMTrace.o(12806250299392L, 95414);
    return true;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    GMTrace.i(12806116081664L, 95413);
    super.setEnabled(paramBoolean);
    this.hvp = paramBoolean;
    this.hvk.setEnabled(true);
    GMTrace.o(12806116081664L, 95413);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(12806384517120L, 95415);
    super.setOnClickListener(paramOnClickListener);
    GMTrace.o(12806384517120L, 95415);
  }
  
  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(12806787170304L, 95418);
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
    this.hvh = paramOnFocusChangeListener;
    GMTrace.o(12806787170304L, 95418);
  }
  
  public static abstract interface a
  {
    public abstract void onClick();
  }
  
  public static abstract interface b
  {
    public abstract void QT();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\ui\AddrEditView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */