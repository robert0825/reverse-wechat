package com.tencent.mm.ui.fts.widget;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.f.c.b;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FTSEditTextView
  extends LinearLayout
{
  public ImageView iub;
  public List<a.b> qfY;
  private String tCQ;
  protected View.OnFocusChangeListener wbP;
  public EditText wjB;
  public View xcQ;
  private TextView xcR;
  private TextView xcS;
  private TextView xcT;
  private View xcU;
  public boolean xcV;
  private View.OnClickListener xcW;
  public a xcX;
  private b xcY;
  
  public FTSEditTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(16798422401024L, 125158);
    this.xcV = true;
    this.xcW = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16803656892416L, 125197);
        int i = -1;
        if (paramAnonymousView.getId() == a.g.gee) {
          i = 0;
        }
        for (;;)
        {
          if ((FTSEditTextView.g(FTSEditTextView.this) != null) && (i >= 0))
          {
            paramAnonymousView = FTSEditTextView.g(FTSEditTextView.this);
            FTSEditTextView.b(FTSEditTextView.this).get(i);
            paramAnonymousView.bdN();
          }
          GMTrace.o(16803656892416L, 125197);
          return;
          if (paramAnonymousView.getId() == a.g.gef) {
            i = 1;
          } else if (paramAnonymousView.getId() == a.g.geg) {
            i = 2;
          }
        }
      }
    };
    this.xcY = b.xda;
    this.wbP = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(16804462198784L, 125203);
        if (FTSEditTextView.g(FTSEditTextView.this) != null) {
          FTSEditTextView.g(FTSEditTextView.this).he(paramAnonymousBoolean);
        }
        GMTrace.o(16804462198784L, 125203);
      }
    };
    init();
    GMTrace.o(16798422401024L, 125158);
  }
  
  public FTSEditTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16798556618752L, 125159);
    this.xcV = true;
    this.xcW = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16803656892416L, 125197);
        int i = -1;
        if (paramAnonymousView.getId() == a.g.gee) {
          i = 0;
        }
        for (;;)
        {
          if ((FTSEditTextView.g(FTSEditTextView.this) != null) && (i >= 0))
          {
            paramAnonymousView = FTSEditTextView.g(FTSEditTextView.this);
            FTSEditTextView.b(FTSEditTextView.this).get(i);
            paramAnonymousView.bdN();
          }
          GMTrace.o(16803656892416L, 125197);
          return;
          if (paramAnonymousView.getId() == a.g.gef) {
            i = 1;
          } else if (paramAnonymousView.getId() == a.g.geg) {
            i = 2;
          }
        }
      }
    };
    this.xcY = b.xda;
    this.wbP = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(16804462198784L, 125203);
        if (FTSEditTextView.g(FTSEditTextView.this) != null) {
          FTSEditTextView.g(FTSEditTextView.this).he(paramAnonymousBoolean);
        }
        GMTrace.o(16804462198784L, 125203);
      }
    };
    init();
    GMTrace.o(16798556618752L, 125159);
  }
  
  private void chA()
  {
    GMTrace.i(16799630360576L, 125167);
    w.i("MicroMsg.FTS.FTSEditTextView", "updateTagView %s", new Object[] { Integer.valueOf(this.qfY.size()) });
    float f = a.V(getContext(), a.e.aQF);
    if (this.qfY.size() > 0)
    {
      this.xcR.setVisibility(0);
      this.xcR.setText(b.c(getContext(), ((a.b)this.qfY.get(0)).getTagName(), f));
      if (this.qfY.size() < 2) {
        break label228;
      }
      this.xcS.setVisibility(0);
      this.xcS.setText(b.c(getContext(), ((a.b)this.qfY.get(1)).getTagName(), f));
    }
    for (;;)
    {
      if (this.qfY.size() < 3) {
        break label240;
      }
      this.xcT.setVisibility(0);
      this.xcT.setText(b.c(getContext(), ((a.b)this.qfY.get(2)).getTagName(), f));
      GMTrace.o(16799630360576L, 125167);
      return;
      this.xcR.setVisibility(8);
      break;
      label228:
      this.xcS.setVisibility(8);
    }
    label240:
    this.xcT.setVisibility(8);
    GMTrace.o(16799630360576L, 125167);
  }
  
  public final void Jd(String paramString)
  {
    GMTrace.i(16799496142848L, 125166);
    this.wjB.setHint(paramString);
    this.tCQ = paramString;
    GMTrace.o(16799496142848L, 125166);
  }
  
  public final String bET()
  {
    GMTrace.i(16799898796032L, 125169);
    Object localObject = new StringBuffer();
    Iterator localIterator = this.qfY.iterator();
    while (localIterator.hasNext())
    {
      ((StringBuffer)localObject).append(((a.b)localIterator.next()).getTagName());
      ((StringBuffer)localObject).append(" ");
    }
    ((StringBuffer)localObject).append(this.wjB.getText().toString());
    localObject = ((StringBuffer)localObject).toString().trim();
    GMTrace.o(16799898796032L, 125169);
    return (String)localObject;
  }
  
  public final String bEV()
  {
    GMTrace.i(16799764578304L, 125168);
    String str = this.wjB.getText().toString().trim();
    GMTrace.o(16799764578304L, 125168);
    return str;
  }
  
  public final void chB()
  {
    GMTrace.i(16800033013760L, 125170);
    this.iub.setVisibility(0);
    GMTrace.o(16800033013760L, 125170);
  }
  
  public final void chC()
  {
    GMTrace.i(16800167231488L, 125171);
    this.xcQ.setVisibility(8);
    GMTrace.o(16800167231488L, 125171);
  }
  
  protected void chx()
  {
    GMTrace.i(16798690836480L, 125160);
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(a.h.geU, this, true);
    GMTrace.o(16798690836480L, 125160);
  }
  
  public final void chy()
  {
    GMTrace.i(16799093489664L, 125163);
    postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16796811788288L, 125146);
        ((InputMethodManager)FTSEditTextView.this.getContext().getSystemService("input_method")).showSoftInput(FTSEditTextView.a(FTSEditTextView.this), 0);
        GMTrace.o(16796811788288L, 125146);
      }
    }, 128L);
    GMTrace.o(16799093489664L, 125163);
  }
  
  public final void chz()
  {
    GMTrace.i(16799361925120L, 125165);
    this.wjB.requestFocus();
    GMTrace.o(16799361925120L, 125165);
  }
  
  public final void clearText()
  {
    GMTrace.i(16798959271936L, 125162);
    this.xcY = b.xdb;
    if (this.xcV) {
      this.qfY.clear();
    }
    this.wjB.setText("");
    this.wjB.setHint(this.tCQ);
    this.xcQ.setVisibility(8);
    chA();
    this.xcY = b.xda;
    GMTrace.o(16798959271936L, 125162);
  }
  
  protected void init()
  {
    GMTrace.i(16798825054208L, 125161);
    chx();
    this.xcU = findViewById(a.g.geh);
    this.iub = ((ImageView)findViewById(a.g.icon));
    this.wjB = ((EditText)findViewById(a.g.bvB));
    this.xcQ = findViewById(a.g.bpn);
    this.xcR = ((TextView)findViewById(a.g.gee));
    this.xcS = ((TextView)findViewById(a.g.gef));
    this.xcT = ((TextView)findViewById(a.g.geg));
    this.qfY = new ArrayList();
    this.wjB.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(16802717368320L, 125190);
        if ((paramAnonymousKeyEvent.getAction() == 0) && (67 == paramAnonymousInt))
        {
          paramAnonymousInt = FTSEditTextView.a(FTSEditTextView.this).getSelectionStart();
          int i = FTSEditTextView.a(FTSEditTextView.this).getSelectionEnd();
          if ((paramAnonymousInt == 0) && (i == 0) && (FTSEditTextView.b(FTSEditTextView.this).size() > 0) && (FTSEditTextView.c(FTSEditTextView.this)))
          {
            FTSEditTextView.b(FTSEditTextView.this).remove(FTSEditTextView.b(FTSEditTextView.this).size() - 1);
            FTSEditTextView.d(FTSEditTextView.this);
            FTSEditTextView.e(FTSEditTextView.this);
          }
        }
        GMTrace.o(16802717368320L, 125190);
        return false;
      }
    });
    this.wjB.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(16804193763328L, 125201);
        GMTrace.o(16804193763328L, 125201);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16803925327872L, 125199);
        GMTrace.o(16803925327872L, 125199);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16804059545600L, 125200);
        if (FTSEditTextView.this.bET().length() > 0) {
          FTSEditTextView.f(FTSEditTextView.this).setVisibility(0);
        }
        for (;;)
        {
          FTSEditTextView.e(FTSEditTextView.this);
          GMTrace.o(16804059545600L, 125200);
          return;
          FTSEditTextView.f(FTSEditTextView.this).setVisibility(8);
        }
      }
    });
    this.wjB.setOnFocusChangeListener(this.wbP);
    this.wjB.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(16795738046464L, 125138);
        if ((3 == paramAnonymousInt) && (FTSEditTextView.g(FTSEditTextView.this) != null))
        {
          boolean bool = FTSEditTextView.g(FTSEditTextView.this).aaM();
          GMTrace.o(16795738046464L, 125138);
          return bool;
        }
        GMTrace.o(16795738046464L, 125138);
        return false;
      }
    });
    this.xcR.setOnClickListener(this.xcW);
    this.xcS.setOnClickListener(this.xcW);
    this.xcT.setOnClickListener(this.xcW);
    this.xcQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16801240973312L, 125179);
        FTSEditTextView.this.clearText();
        if (FTSEditTextView.g(FTSEditTextView.this) != null) {
          FTSEditTextView.g(FTSEditTextView.this).bdJ();
        }
        GMTrace.o(16801240973312L, 125179);
      }
    });
    c.d(this.wjB).Ea(100).a(null);
    GMTrace.o(16798825054208L, 125161);
  }
  
  public final void s(String paramString, List<a.b> paramList)
  {
    GMTrace.i(16799227707392L, 125164);
    b localb = b.xda;
    this.qfY.clear();
    if (paramList != null) {
      this.qfY.addAll(paramList);
    }
    w.i("MicroMsg.FTS.FTSEditTextView", "setText: %s %d", new Object[] { paramString, Integer.valueOf(this.qfY.size()) });
    this.xcY = b.xdc;
    this.wjB.setText(paramString);
    Selection.setSelection(this.wjB.getText(), this.wjB.getText().length());
    chA();
    this.xcY = localb;
    GMTrace.o(16799227707392L, 125164);
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb);
    
    public abstract boolean aaM();
    
    public abstract void bdJ();
    
    public abstract void bdN();
    
    public abstract void he(boolean paramBoolean);
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(16801777844224L, 125183);
      xda = new b("UserInput", 0);
      xdb = new b("ClearText", 1);
      xdc = new b("SetText", 2);
      xdd = new b[] { xda, xdb, xdc };
      GMTrace.o(16801777844224L, 125183);
    }
    
    private b()
    {
      GMTrace.i(16801643626496L, 125182);
      GMTrace.o(16801643626496L, 125182);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\fts\widget\FTSEditTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */