package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.widget.AutoMatchKeywordEditText;
import com.tencent.mm.ui.widget.AutoMatchKeywordEditText.a;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.j;
import com.tencent.mm.v.a.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class ActionBarSearchView
  extends LinearLayout
  implements f
{
  private TextWatcher tAG;
  private View xeX;
  private ActionBarEditText xeY;
  private ImageButton xeZ;
  private int xfa;
  private boolean xfb;
  private t xfc;
  public b xfd;
  public a xfe;
  private View.OnFocusChangeListener xff;
  public View.OnFocusChangeListener xfg;
  private View.OnClickListener xfh;
  private View.OnClickListener xfi;
  
  public ActionBarSearchView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1935285420032L, 14419);
    this.xfa = c.xfl;
    this.xfb = false;
    this.tAG = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(1910723575808L, 14236);
        GMTrace.o(1910723575808L, 14236);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(1910455140352L, 14234);
        GMTrace.o(1910455140352L, 14234);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(1910589358080L, 14235);
        ActionBarSearchView.a(ActionBarSearchView.this);
        t localt = ActionBarSearchView.b(ActionBarSearchView.this);
        EditText localEditText;
        Object localObject;
        if (localt.xjT)
        {
          localEditText = (EditText)localt.xjR.get();
          if (localEditText != null) {}
        }
        else if (ActionBarSearchView.c(ActionBarSearchView.this) != null)
        {
          localObject = ActionBarSearchView.c(ActionBarSearchView.this);
          if (paramAnonymousCharSequence != null) {
            break label261;
          }
        }
        label261:
        for (paramAnonymousCharSequence = "";; paramAnonymousCharSequence = paramAnonymousCharSequence.toString())
        {
          ((ActionBarSearchView.b)localObject).Bv(paramAnonymousCharSequence);
          GMTrace.o(1910589358080L, 14235);
          return;
          if (((paramAnonymousCharSequence != null) && (paramAnonymousCharSequence.toString() != null) && (paramAnonymousCharSequence.toString().length() != 0)) || ((localt.iJz == null) || (localt.iJz.length() == 0) || ((localt.iJz != null) && (paramAnonymousCharSequence != null) && (localt.iJz.equals(paramAnonymousCharSequence.toString())))))
          {
            w.d("MicroMsg.WordsChecker", "text not change, new : %s, old : %s", new Object[] { paramAnonymousCharSequence, localt.iJz });
            break;
          }
          if (paramAnonymousCharSequence != null) {}
          for (localObject = paramAnonymousCharSequence.toString();; localObject = "")
          {
            localt.iJz = ((String)localObject);
            localt.xjQ = t.j(localt.iJz, localt.xjS);
            if (!t.a(localEditText, localt.xjS)) {
              break;
            }
            w.d("MicroMsg.WordsChecker", "decorate text succ.");
            break;
          }
        }
      }
    };
    this.xff = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(1914347454464L, 14263);
        w.v("MicroMsg.ActionBarSearchView", "on edittext focus changed, hasFocus %B", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (ActionBarSearchView.d(ActionBarSearchView.this) != null) {
          ActionBarSearchView.d(ActionBarSearchView.this).onFocusChange(paramAnonymousView, paramAnonymousBoolean);
        }
        GMTrace.o(1914347454464L, 14263);
      }
    };
    this.xfh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1932064194560L, 14395);
        if (ActionBarSearchView.c.xfl == ActionBarSearchView.e(ActionBarSearchView.this))
        {
          w.d("MicroMsg.ActionBarSearchView", "on status btn click, cur status is clear");
          ActionBarSearchView.this.mA(true);
          if (ActionBarSearchView.c(ActionBarSearchView.this) != null)
          {
            ActionBarSearchView.c(ActionBarSearchView.this).QA();
            GMTrace.o(1932064194560L, 14395);
          }
        }
        else
        {
          w.d("MicroMsg.ActionBarSearchView", "on status btn click, cur status is voice search");
          if (ActionBarSearchView.c(ActionBarSearchView.this) != null) {
            ActionBarSearchView.c(ActionBarSearchView.this).aLx();
          }
        }
        GMTrace.o(1932064194560L, 14395);
      }
    };
    this.xfi = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1925219090432L, 14344);
        if (ActionBarSearchView.f(ActionBarSearchView.this) != null) {
          ActionBarSearchView.f(ActionBarSearchView.this).aLy();
        }
        GMTrace.o(1925219090432L, 14344);
      }
    };
    init();
    GMTrace.o(1935285420032L, 14419);
  }
  
  public ActionBarSearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1935151202304L, 14418);
    this.xfa = c.xfl;
    this.xfb = false;
    this.tAG = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(1910723575808L, 14236);
        GMTrace.o(1910723575808L, 14236);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(1910455140352L, 14234);
        GMTrace.o(1910455140352L, 14234);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(1910589358080L, 14235);
        ActionBarSearchView.a(ActionBarSearchView.this);
        t localt = ActionBarSearchView.b(ActionBarSearchView.this);
        EditText localEditText;
        Object localObject;
        if (localt.xjT)
        {
          localEditText = (EditText)localt.xjR.get();
          if (localEditText != null) {}
        }
        else if (ActionBarSearchView.c(ActionBarSearchView.this) != null)
        {
          localObject = ActionBarSearchView.c(ActionBarSearchView.this);
          if (paramAnonymousCharSequence != null) {
            break label261;
          }
        }
        label261:
        for (paramAnonymousCharSequence = "";; paramAnonymousCharSequence = paramAnonymousCharSequence.toString())
        {
          ((ActionBarSearchView.b)localObject).Bv(paramAnonymousCharSequence);
          GMTrace.o(1910589358080L, 14235);
          return;
          if (((paramAnonymousCharSequence != null) && (paramAnonymousCharSequence.toString() != null) && (paramAnonymousCharSequence.toString().length() != 0)) || ((localt.iJz == null) || (localt.iJz.length() == 0) || ((localt.iJz != null) && (paramAnonymousCharSequence != null) && (localt.iJz.equals(paramAnonymousCharSequence.toString())))))
          {
            w.d("MicroMsg.WordsChecker", "text not change, new : %s, old : %s", new Object[] { paramAnonymousCharSequence, localt.iJz });
            break;
          }
          if (paramAnonymousCharSequence != null) {}
          for (localObject = paramAnonymousCharSequence.toString();; localObject = "")
          {
            localt.iJz = ((String)localObject);
            localt.xjQ = t.j(localt.iJz, localt.xjS);
            if (!t.a(localEditText, localt.xjS)) {
              break;
            }
            w.d("MicroMsg.WordsChecker", "decorate text succ.");
            break;
          }
        }
      }
    };
    this.xff = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(1914347454464L, 14263);
        w.v("MicroMsg.ActionBarSearchView", "on edittext focus changed, hasFocus %B", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (ActionBarSearchView.d(ActionBarSearchView.this) != null) {
          ActionBarSearchView.d(ActionBarSearchView.this).onFocusChange(paramAnonymousView, paramAnonymousBoolean);
        }
        GMTrace.o(1914347454464L, 14263);
      }
    };
    this.xfh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1932064194560L, 14395);
        if (ActionBarSearchView.c.xfl == ActionBarSearchView.e(ActionBarSearchView.this))
        {
          w.d("MicroMsg.ActionBarSearchView", "on status btn click, cur status is clear");
          ActionBarSearchView.this.mA(true);
          if (ActionBarSearchView.c(ActionBarSearchView.this) != null)
          {
            ActionBarSearchView.c(ActionBarSearchView.this).QA();
            GMTrace.o(1932064194560L, 14395);
          }
        }
        else
        {
          w.d("MicroMsg.ActionBarSearchView", "on status btn click, cur status is voice search");
          if (ActionBarSearchView.c(ActionBarSearchView.this) != null) {
            ActionBarSearchView.c(ActionBarSearchView.this).aLx();
          }
        }
        GMTrace.o(1932064194560L, 14395);
      }
    };
    this.xfi = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1925219090432L, 14344);
        if (ActionBarSearchView.f(ActionBarSearchView.this) != null) {
          ActionBarSearchView.f(ActionBarSearchView.this).aLy();
        }
        GMTrace.o(1925219090432L, 14344);
      }
    };
    init();
    GMTrace.o(1935151202304L, 14418);
  }
  
  private void chU()
  {
    GMTrace.i(1936761815040L, 14430);
    if ((this.xeY.getEditableText() != null) && (!bg.nm(this.xeY.getEditableText().toString())))
    {
      eA(a.f.gcI, getResources().getDimensionPixelSize(a.e.aQC));
      this.xfa = c.xfl;
      GMTrace.o(1936761815040L, 14430);
      return;
    }
    if (this.xfb)
    {
      eA(a.f.gcQ, getResources().getDimensionPixelSize(a.e.aQC));
      this.xfa = c.xfm;
      GMTrace.o(1936761815040L, 14430);
      return;
    }
    eA(0, 0);
    this.xfa = c.xfl;
    GMTrace.o(1936761815040L, 14430);
  }
  
  private void eA(int paramInt1, int paramInt2)
  {
    GMTrace.i(1936627597312L, 14429);
    this.xeZ.setImageResource(paramInt1);
    this.xeZ.setBackgroundResource(0);
    if (paramInt1 == a.f.gcQ) {
      this.xeZ.setContentDescription(getContext().getString(a.k.ggx));
    }
    for (;;)
    {
      ViewGroup.LayoutParams localLayoutParams = this.xeZ.getLayoutParams();
      localLayoutParams.width = paramInt2;
      this.xeZ.setLayoutParams(localLayoutParams);
      GMTrace.o(1936627597312L, 14429);
      return;
      this.xeZ.setContentDescription(getContext().getString(a.k.bpn));
    }
  }
  
  private void init()
  {
    GMTrace.i(1935419637760L, 14420);
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(a.h.geG, this, true);
    this.xeX = findViewById(a.g.bcj);
    this.xeX.setOnClickListener(this.xfi);
    this.xeY = ((ActionBarEditText)findViewById(a.g.bvB));
    this.xfc = new t(this.xeY);
    this.xeY.xfk = this;
    this.xeY.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1948304539648L, 14516);
        ActionBarSearchView.g(ActionBarSearchView.this).setText("");
        if (ActionBarSearchView.c(ActionBarSearchView.this) != null) {
          ActionBarSearchView.c(ActionBarSearchView.this).aLw();
        }
        GMTrace.o(1948304539648L, 14516);
      }
    });
    this.xeZ = ((ImageButton)findViewById(a.g.cfI));
    this.xeY.addTextChangedListener(this.tAG);
    this.xeY.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(1949780934656L, 14527);
        if (paramAnonymousInt == 67)
        {
          w.d("MicroMsg.ActionBarSearchView", "on back key click.");
          Object localObject = ActionBarSearchView.b(ActionBarSearchView.this);
          if (((t)localObject).xjT)
          {
            paramAnonymousView = (EditText)((t)localObject).xjR.get();
            if ((paramAnonymousView != null) && (((t)localObject).xjQ != null)) {}
          }
          else
          {
            GMTrace.o(1949780934656L, 14527);
            return false;
          }
          paramAnonymousKeyEvent = paramAnonymousView.getText();
          paramAnonymousInt = paramAnonymousView.getSelectionStart();
          if (paramAnonymousInt == paramAnonymousView.getSelectionEnd())
          {
            localObject = ((t)localObject).DY(paramAnonymousInt);
            if ((localObject != null) && (((t.b)localObject).xjW))
            {
              paramAnonymousKeyEvent.delete(((t.b)localObject).start, ((t.b)localObject).start + ((t.b)localObject).length);
              paramAnonymousView.setTextKeepState(paramAnonymousKeyEvent);
              paramAnonymousView.setSelection(((t.b)localObject).start);
              GMTrace.o(1949780934656L, 14527);
              return true;
            }
          }
          GMTrace.o(1949780934656L, 14527);
          return false;
        }
        GMTrace.o(1949780934656L, 14527);
        return false;
      }
    });
    this.xeY.xnj = new AutoMatchKeywordEditText.a()
    {
      public final void a(EditText paramAnonymousEditText, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1909515616256L, 14227);
        w.d("MicroMsg.ActionBarSearchView", "start : %d, stop : %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        Object localObject = ActionBarSearchView.b(ActionBarSearchView.this);
        EditText localEditText;
        if (((t)localObject).xjT)
        {
          localEditText = (EditText)((t)localObject).xjR.get();
          if ((localEditText != null) && (paramAnonymousEditText == localEditText)) {}
        }
        else
        {
          GMTrace.o(1909515616256L, 14227);
          return;
        }
        paramAnonymousEditText = localEditText.getText();
        paramAnonymousInt2 = localEditText.getSelectionStart();
        int i = localEditText.getSelectionEnd();
        if ((paramAnonymousInt2 < 0) || (i < paramAnonymousInt2))
        {
          GMTrace.o(1909515616256L, 14227);
          return;
        }
        if (paramAnonymousInt2 == i)
        {
          localObject = ((t)localObject).DY(paramAnonymousInt2);
          if ((localObject != null) && (((t.b)localObject).xjW))
          {
            localEditText.setTextKeepState(paramAnonymousEditText);
            paramAnonymousInt1 = ((t.b)localObject).start;
            localEditText.setSelection(((t.b)localObject).length + paramAnonymousInt1);
          }
          GMTrace.o(1909515616256L, 14227);
          return;
        }
        t.b localb = ((t)localObject).DY(paramAnonymousInt2);
        paramAnonymousInt1 = paramAnonymousInt2;
        if (localb != null)
        {
          paramAnonymousInt1 = paramAnonymousInt2;
          if (localb.xjW) {
            paramAnonymousInt1 = localb.start + localb.length;
          }
        }
        if (paramAnonymousInt1 >= i)
        {
          localEditText.setTextKeepState(paramAnonymousEditText);
          localEditText.setSelection(paramAnonymousInt1);
          GMTrace.o(1909515616256L, 14227);
          return;
        }
        localObject = ((t)localObject).DY(i);
        if ((localObject != null) && (((t.b)localObject).xjW))
        {
          paramAnonymousInt2 = ((t.b)localObject).start;
          localEditText.setTextKeepState(paramAnonymousEditText);
          localEditText.setSelection(paramAnonymousInt1, paramAnonymousInt2);
        }
        GMTrace.o(1909515616256L, 14227);
      }
    };
    this.xeY.setOnFocusChangeListener(this.xff);
    c.d(this.xeY).Ea(100).a(null);
    this.xeZ.setOnClickListener(this.xfh);
    GMTrace.o(1935419637760L, 14420);
  }
  
  public final void DW(int paramInt)
  {
    GMTrace.i(1937969774592L, 14439);
    if (this.xeY != null) {
      this.xeY.setCompoundDrawables(ab.getResources().getDrawable(paramInt), null, null, null);
    }
    GMTrace.o(1937969774592L, 14439);
  }
  
  public final void WP(String paramString)
  {
    GMTrace.i(1935956508672L, 14424);
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.xeY.setText(str);
    this.xeY.setSelection(str.length());
    GMTrace.o(1935956508672L, 14424);
  }
  
  public final void WQ(String paramString)
  {
    GMTrace.i(16746614358016L, 124772);
    if (this.xeY != null)
    {
      this.xeY.setCompoundDrawables(new d(this.xeY, paramString), null, null, null);
      this.xeY.setHint("");
    }
    GMTrace.o(16746614358016L, 124772);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(1935822290944L, 14423);
    this.xfe = parama;
    GMTrace.o(1935822290944L, 14423);
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(1935688073216L, 14422);
    this.xfd = paramb;
    GMTrace.o(1935688073216L, 14422);
  }
  
  public final void a(SearchViewNotRealTimeHelper.a parama)
  {
    GMTrace.i(1937298685952L, 14434);
    GMTrace.o(1937298685952L, 14434);
  }
  
  public final void ak(ArrayList<String> paramArrayList)
  {
    GMTrace.i(1937701339136L, 14437);
    if (this.xfc != null)
    {
      t localt = this.xfc;
      localt.xjS = paramArrayList;
      if (localt.xjT)
      {
        paramArrayList = (EditText)localt.xjR.get();
        if (paramArrayList != null) {
          t.a(paramArrayList, localt.xjS);
        }
      }
    }
    GMTrace.o(1937701339136L, 14437);
  }
  
  public final String bFU()
  {
    GMTrace.i(1935553855488L, 14421);
    if (this.xeY.getEditableText() != null)
    {
      String str = this.xeY.getEditableText().toString();
      GMTrace.o(1935553855488L, 14421);
      return str;
    }
    GMTrace.o(1935553855488L, 14421);
    return "";
  }
  
  public final void chV()
  {
    GMTrace.i(1937164468224L, 14433);
    this.xeY.clearFocus();
    GMTrace.o(1937164468224L, 14433);
  }
  
  public final boolean chW()
  {
    GMTrace.i(1937432903680L, 14435);
    if (this.xeY != null)
    {
      boolean bool = this.xeY.hasFocus();
      GMTrace.o(1937432903680L, 14435);
      return bool;
    }
    GMTrace.o(1937432903680L, 14435);
    return false;
  }
  
  public final boolean chX()
  {
    GMTrace.i(1937567121408L, 14436);
    if (this.xeY != null)
    {
      boolean bool = this.xeY.requestFocus();
      GMTrace.o(1937567121408L, 14436);
      return bool;
    }
    GMTrace.o(1937567121408L, 14436);
    return false;
  }
  
  public final void mA(boolean paramBoolean)
  {
    GMTrace.i(1937030250496L, 14432);
    if (!paramBoolean)
    {
      this.xeY.removeTextChangedListener(this.tAG);
      this.xeY.setText("");
      this.xeY.addTextChangedListener(this.tAG);
      GMTrace.o(1937030250496L, 14432);
      return;
    }
    this.xeY.setText("");
    GMTrace.o(1937030250496L, 14432);
  }
  
  public final void mB(boolean paramBoolean)
  {
    GMTrace.i(1937835556864L, 14438);
    if (this.xfc != null) {
      this.xfc.xjT = paramBoolean;
    }
    GMTrace.o(1937835556864L, 14438);
  }
  
  public final void mx(boolean paramBoolean)
  {
    GMTrace.i(1936224944128L, 14426);
    this.xfb = paramBoolean;
    chU();
    GMTrace.o(1936224944128L, 14426);
  }
  
  public final void my(boolean paramBoolean)
  {
    GMTrace.i(1936359161856L, 14427);
    this.xeY.setEnabled(paramBoolean);
    GMTrace.o(1936359161856L, 14427);
  }
  
  public final void mz(boolean paramBoolean)
  {
    GMTrace.i(1936493379584L, 14428);
    this.xeZ.setEnabled(paramBoolean);
    GMTrace.o(1936493379584L, 14428);
  }
  
  public final void setHint(CharSequence paramCharSequence)
  {
    GMTrace.i(1936090726400L, 14425);
    this.xeY.setHint(paramCharSequence);
    GMTrace.o(1936090726400L, 14425);
  }
  
  public final void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    GMTrace.i(1936896032768L, 14431);
    this.xeY.setOnEditorActionListener(paramOnEditorActionListener);
    GMTrace.o(1936896032768L, 14431);
  }
  
  public static class ActionBarEditText
    extends AutoMatchKeywordEditText
  {
    ActionBarSearchView xfk;
    
    public ActionBarEditText(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      GMTrace.i(2004273332224L, 14933);
      GMTrace.o(2004273332224L, 14933);
    }
    
    public ActionBarEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
      GMTrace.i(2004139114496L, 14932);
      GMTrace.o(2004139114496L, 14932);
    }
    
    public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
    {
      GMTrace.i(2004407549952L, 14934);
      w.v("MicroMsg.ActionBarSearchView", "on onKeyPreIme");
      if (paramInt == 4)
      {
        KeyEvent.DispatcherState localDispatcherState;
        if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
        {
          w.v("MicroMsg.ActionBarSearchView", "on onKeyPreIme action down");
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.startTracking(paramKeyEvent, this);
          }
          GMTrace.o(2004407549952L, 14934);
          return true;
        }
        if (paramKeyEvent.getAction() == 1)
        {
          w.v("MicroMsg.ActionBarSearchView", "on onKeyPreIme action up");
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.handleUpEvent(paramKeyEvent);
          }
          if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
          {
            w.v("MicroMsg.ActionBarSearchView", "on onKeyPreIme action up is tracking");
            this.xfk.clearFocus();
            paramKeyEvent = (InputMethodManager)getContext().getSystemService("input_method");
            if (paramKeyEvent != null) {
              paramKeyEvent.hideSoftInputFromWindow(getWindowToken(), 0);
            }
            GMTrace.o(2004407549952L, 14934);
            return true;
          }
        }
      }
      boolean bool = super.onKeyPreIme(paramInt, paramKeyEvent);
      GMTrace.o(2004407549952L, 14934);
      return bool;
    }
  }
  
  public static abstract interface a
  {
    public abstract void aLy();
  }
  
  public static abstract interface b
  {
    public abstract void Bv(String paramString);
    
    public abstract void QA();
    
    public abstract void aLw();
    
    public abstract void aLx();
  }
  
  private static enum c
  {
    static
    {
      GMTrace.i(1957162909696L, 14582);
      xfl = 1;
      xfm = 2;
      xfn = new int[] { xfl, xfm };
      GMTrace.o(1957162909696L, 14582);
    }
  }
  
  final class d
    extends Drawable
  {
    private RectF eJ;
    private String iJz;
    private Paint xfo;
    private int xfp;
    private float xfq;
    private float xfr;
    private Bitmap xfs;
    
    d(EditText paramEditText, String paramString)
    {
      GMTrace.i(16745674833920L, 124765);
      this.xfp = BackwardSupportUtil.b.a(ab.getContext(), 2.0F);
      this.xfo = new Paint(paramEditText.getPaint());
      this.iJz = paramString;
      this.xfo.setColor(ab.getResources().getColor(a.d.aNQ));
      this.xfs = d.t(ActionBarSearchView.this.getResources().getDrawable(a.j.cIS));
      this.xfq = this.xfo.measureText(this.iJz);
      this$1 = this.xfo.getFontMetrics();
      this.xfr = ((float)Math.ceil(ActionBarSearchView.this.bottom - ActionBarSearchView.this.top));
      if (this.xfs.getHeight() > this.xfr) {}
      for (float f = this.xfs.getHeight();; f = this.xfr)
      {
        setBounds(0, 0, (int)(this.xfq + this.xfp * 2 + this.xfp * 2 + this.xfs.getWidth() + 2.0F), (int)f);
        GMTrace.o(16745674833920L, 124765);
        return;
      }
    }
    
    public final void draw(Canvas paramCanvas)
    {
      GMTrace.i(16745809051648L, 124766);
      Paint.FontMetricsInt localFontMetricsInt = this.xfo.getFontMetricsInt();
      Rect localRect = getBounds();
      int i = (int)((localRect.right - localRect.left - (this.eJ.right - this.eJ.left)) / 2.0F);
      int j = localRect.top;
      int k = (localRect.bottom - localRect.top - localFontMetricsInt.bottom + localFontMetricsInt.top) / 2;
      int m = localFontMetricsInt.top;
      paramCanvas.drawBitmap(this.xfs, i, localRect.top, null);
      paramCanvas.drawText(this.iJz, localRect.left + this.xfs.getWidth() + 2, j + k - m, this.xfo);
      GMTrace.o(16745809051648L, 124766);
    }
    
    public final int getOpacity()
    {
      GMTrace.i(16746345922560L, 124770);
      GMTrace.o(16746345922560L, 124770);
      return -3;
    }
    
    public final void setAlpha(int paramInt)
    {
      GMTrace.i(16746077487104L, 124768);
      GMTrace.o(16746077487104L, 124768);
    }
    
    public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(16745943269376L, 124767);
      super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      Paint.FontMetrics localFontMetrics = this.xfo.getFontMetrics();
      float f1 = this.xfp + paramInt1;
      float f2 = paramInt2;
      this.eJ = new RectF(f1, localFontMetrics.ascent - localFontMetrics.top + f2, paramInt3 - this.xfp, paramInt4);
      invalidateSelf();
      GMTrace.o(16745943269376L, 124767);
    }
    
    public final void setColorFilter(ColorFilter paramColorFilter)
    {
      GMTrace.i(16746211704832L, 124769);
      GMTrace.o(16746211704832L, 124769);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\ActionBarSearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */