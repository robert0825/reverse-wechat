package com.tencent.mm.ui.tools;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.v;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import java.util.ArrayList;

public class SearchViewNotRealTimeHelper
  extends LinearLayout
  implements f
{
  public EditText wjB;
  public View xeX;
  private ImageButton xeZ;
  private ActionBarSearchView.a xfe;
  public Button xje;
  public a xjf;
  
  public SearchViewNotRealTimeHelper(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1969108287488L, 14671);
    init();
    GMTrace.o(1969108287488L, 14671);
  }
  
  public SearchViewNotRealTimeHelper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1968974069760L, 14670);
    init();
    GMTrace.o(1968974069760L, 14670);
  }
  
  private void init()
  {
    GMTrace.i(1969242505216L, 14672);
    v.fb(getContext()).inflate(a.h.geH, this, true);
    this.wjB = ((EditText)findViewById(a.g.bvB));
    this.xeZ = ((ImageButton)findViewById(a.g.cfI));
    this.xeX = findViewById(a.g.bcj);
    this.xje = ((Button)findViewById(a.g.button));
    this.xje.setEnabled(false);
    this.wjB.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(2010178912256L, 14977);
        if ((paramAnonymousEditable == null) || (paramAnonymousEditable.length() <= 0))
        {
          SearchViewNotRealTimeHelper.a(SearchViewNotRealTimeHelper.this).setVisibility(8);
          SearchViewNotRealTimeHelper.b(SearchViewNotRealTimeHelper.this).setEnabled(false);
          GMTrace.o(2010178912256L, 14977);
          return;
        }
        SearchViewNotRealTimeHelper.a(SearchViewNotRealTimeHelper.this).setVisibility(0);
        SearchViewNotRealTimeHelper.b(SearchViewNotRealTimeHelper.this).setEnabled(true);
        GMTrace.o(2010178912256L, 14977);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2010044694528L, 14976);
        GMTrace.o(2010044694528L, 14976);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2009910476800L, 14975);
        GMTrace.o(2009910476800L, 14975);
      }
    });
    this.wjB.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(1939446169600L, 14450);
        if ((3 == paramAnonymousInt) && (SearchViewNotRealTimeHelper.c(SearchViewNotRealTimeHelper.this) != null))
        {
          boolean bool = SearchViewNotRealTimeHelper.c(SearchViewNotRealTimeHelper.this).nC(SearchViewNotRealTimeHelper.this.bFU());
          GMTrace.o(1939446169600L, 14450);
          return bool;
        }
        GMTrace.o(1939446169600L, 14450);
        return false;
      }
    });
    c.d(this.wjB).Ea(100).a(null);
    this.xeZ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1962397401088L, 14621);
        SearchViewNotRealTimeHelper.d(SearchViewNotRealTimeHelper.this).setText("");
        if (SearchViewNotRealTimeHelper.c(SearchViewNotRealTimeHelper.this) != null) {
          SearchViewNotRealTimeHelper.c(SearchViewNotRealTimeHelper.this).aiv();
        }
        GMTrace.o(1962397401088L, 14621);
      }
    });
    this.xeX.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1919716163584L, 14303);
        w.v("MicroMsg.SearchViewNotRealTimeHelper", "home btn click");
        if (SearchViewNotRealTimeHelper.e(SearchViewNotRealTimeHelper.this) != null) {
          SearchViewNotRealTimeHelper.e(SearchViewNotRealTimeHelper.this).aLy();
        }
        GMTrace.o(1919716163584L, 14303);
      }
    });
    this.xje.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2060510560256L, 15352);
        if (SearchViewNotRealTimeHelper.c(SearchViewNotRealTimeHelper.this) != null) {
          SearchViewNotRealTimeHelper.c(SearchViewNotRealTimeHelper.this).tG(SearchViewNotRealTimeHelper.this.bFU());
        }
        GMTrace.o(2060510560256L, 15352);
      }
    });
    GMTrace.o(1969242505216L, 14672);
  }
  
  public final void DW(int paramInt)
  {
    GMTrace.i(1971792642048L, 14691);
    GMTrace.o(1971792642048L, 14691);
  }
  
  public final void T(CharSequence paramCharSequence)
  {
    GMTrace.i(1969376722944L, 14673);
    this.wjB.setHint(paramCharSequence);
    GMTrace.o(1969376722944L, 14673);
  }
  
  public final void WP(String paramString)
  {
    GMTrace.i(1969913593856L, 14677);
    this.wjB.setText("");
    this.wjB.append(paramString);
    GMTrace.o(1969913593856L, 14677);
  }
  
  public final void WQ(String paramString)
  {
    GMTrace.i(16746748575744L, 124773);
    GMTrace.o(16746748575744L, 124773);
  }
  
  public final void a(ActionBarSearchView.a parama)
  {
    GMTrace.i(1971389988864L, 14688);
    this.xfe = parama;
    GMTrace.o(1971389988864L, 14688);
  }
  
  public final void a(ActionBarSearchView.b paramb)
  {
    GMTrace.i(1970182029312L, 14679);
    GMTrace.o(1970182029312L, 14679);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(1970853117952L, 14684);
    this.xjf = parama;
    GMTrace.o(1970853117952L, 14684);
  }
  
  public final void ak(ArrayList<String> paramArrayList)
  {
    GMTrace.i(1971524206592L, 14689);
    GMTrace.o(1971524206592L, 14689);
  }
  
  public final String bFU()
  {
    GMTrace.i(1969779376128L, 14676);
    Object localObject = this.wjB.getEditableText();
    if (localObject == null)
    {
      GMTrace.o(1969779376128L, 14676);
      return "";
    }
    localObject = localObject.toString();
    GMTrace.o(1969779376128L, 14676);
    return (String)localObject;
  }
  
  public final void chV()
  {
    GMTrace.i(1969645158400L, 14675);
    this.wjB.clearFocus();
    GMTrace.o(1969645158400L, 14675);
  }
  
  public final boolean chW()
  {
    GMTrace.i(1971255771136L, 14687);
    GMTrace.o(1971255771136L, 14687);
    return false;
  }
  
  public final boolean chX()
  {
    GMTrace.i(1971121553408L, 14686);
    GMTrace.o(1971121553408L, 14686);
    return false;
  }
  
  public boolean hasFocus()
  {
    GMTrace.i(1970987335680L, 14685);
    GMTrace.o(1970987335680L, 14685);
    return false;
  }
  
  public final void mA(boolean paramBoolean)
  {
    GMTrace.i(1969510940672L, 14674);
    this.wjB.setText("");
    GMTrace.o(1969510940672L, 14674);
  }
  
  public final void mB(boolean paramBoolean)
  {
    GMTrace.i(1971658424320L, 14690);
    GMTrace.o(1971658424320L, 14690);
  }
  
  public final void mx(boolean paramBoolean)
  {
    GMTrace.i(1970316247040L, 14680);
    GMTrace.o(1970316247040L, 14680);
  }
  
  public final void my(boolean paramBoolean)
  {
    GMTrace.i(1970450464768L, 14681);
    GMTrace.o(1970450464768L, 14681);
  }
  
  public final void mz(boolean paramBoolean)
  {
    GMTrace.i(1970584682496L, 14682);
    GMTrace.o(1970584682496L, 14682);
  }
  
  public final void setHint(CharSequence paramCharSequence)
  {
    GMTrace.i(1970047811584L, 14678);
    T(paramCharSequence);
    GMTrace.o(1970047811584L, 14678);
  }
  
  public final void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    GMTrace.i(1970718900224L, 14683);
    GMTrace.o(1970718900224L, 14683);
  }
  
  public static abstract interface a
  {
    public abstract void aiv();
    
    public abstract boolean nC(String paramString);
    
    public abstract void tG(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\SearchViewNotRealTimeHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */