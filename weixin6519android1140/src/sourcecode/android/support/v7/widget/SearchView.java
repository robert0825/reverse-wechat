package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.view.g;
import android.support.v4.widget.e;
import android.support.v7.a.a.a;
import android.support.v7.a.a.d;
import android.support.v7.a.a.f;
import android.support.v7.a.a.h;
import android.support.v7.a.a.k;
import android.support.v7.view.c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView
  extends LinearLayoutCompat
  implements c
{
  private static final boolean VM;
  static final a Wv;
  private final AdapterView.OnItemSelectedListener Fu = new AdapterView.OnItemSelectedListener()
  {
    public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      SearchView.b(SearchView.this, paramAnonymousInt);
    }
    
    public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
  };
  private final h Oc = h.ex();
  private final SearchAutoComplete VN;
  private final View VO;
  private final View VP;
  private final View VQ;
  private final ImageView VR;
  private final ImageView VS;
  private final ImageView VT;
  private final ImageView VU;
  private final View VV;
  private final ImageView VW;
  private final Drawable VX;
  private final int VY;
  private final int VZ;
  View.OnKeyListener WA = new View.OnKeyListener()
  {
    public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
    {
      if (SearchView.o(SearchView.this) == null) {}
      do
      {
        return false;
        if ((SearchView.m(SearchView.this).isPopupShowing()) && (SearchView.m(SearchView.this).getListSelection() != -1)) {
          return SearchView.a(SearchView.this, paramAnonymousInt, paramAnonymousKeyEvent);
        }
      } while ((SearchView.SearchAutoComplete.a(SearchView.m(SearchView.this))) || (!g.a(paramAnonymousKeyEvent)) || (paramAnonymousKeyEvent.getAction() != 1) || (paramAnonymousInt != 66));
      paramAnonymousView.cancelLongPress();
      SearchView.a(SearchView.this, SearchView.m(SearchView.this).getText().toString());
      return true;
    }
  };
  private final TextView.OnEditorActionListener WB = new TextView.OnEditorActionListener()
  {
    public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
    {
      SearchView.j(SearchView.this);
      return true;
    }
  };
  private final AdapterView.OnItemClickListener WC = new AdapterView.OnItemClickListener()
  {
    public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      SearchView.a(SearchView.this, paramAnonymousInt);
    }
  };
  private TextWatcher WD = new TextWatcher()
  {
    public final void afterTextChanged(Editable paramAnonymousEditable) {}
    
    public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    
    public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      SearchView.a(SearchView.this, paramAnonymousCharSequence);
    }
  };
  private final Intent Wa;
  private final Intent Wb;
  private final CharSequence Wc;
  private c Wd;
  private b We;
  private View.OnFocusChangeListener Wf;
  private d Wg;
  private View.OnClickListener Wh;
  private boolean Wi;
  private boolean Wj;
  private e Wk;
  private boolean Wl;
  private CharSequence Wm;
  private boolean Wn;
  private boolean Wo;
  private CharSequence Wp;
  private CharSequence Wq;
  private boolean Wr;
  private int Ws;
  private SearchableInfo Wt;
  private Bundle Wu;
  private Runnable Ww = new Runnable()
  {
    public final void run()
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)SearchView.this.getContext().getSystemService("input_method");
      SearchView.a locala;
      SearchView localSearchView;
      if (localInputMethodManager != null)
      {
        locala = SearchView.Wv;
        localSearchView = SearchView.this;
        if (locala.WI == null) {}
      }
      else
      {
        try
        {
          locala.WI.invoke(localInputMethodManager, new Object[] { Integer.valueOf(0), null });
          return;
        }
        catch (Exception localException) {}
      }
      localInputMethodManager.showSoftInput(localSearchView, 0);
    }
  };
  private final Runnable Wx = new Runnable()
  {
    public final void run()
    {
      SearchView.a(SearchView.this);
    }
  };
  private Runnable Wy = new Runnable()
  {
    public final void run()
    {
      if ((SearchView.b(SearchView.this) != null) && ((SearchView.b(SearchView.this) instanceof ak))) {
        SearchView.b(SearchView.this).changeCursor(null);
      }
    }
  };
  private final WeakHashMap<String, Drawable.ConstantState> Wz = new WeakHashMap();
  private int ia;
  private final View.OnClickListener mOnClickListener = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == SearchView.e(SearchView.this)) {
        SearchView.f(SearchView.this);
      }
      do
      {
        return;
        if (paramAnonymousView == SearchView.g(SearchView.this))
        {
          SearchView.h(SearchView.this);
          return;
        }
        if (paramAnonymousView == SearchView.i(SearchView.this))
        {
          SearchView.j(SearchView.this);
          return;
        }
        if (paramAnonymousView == SearchView.k(SearchView.this))
        {
          SearchView.l(SearchView.this);
          return;
        }
      } while (paramAnonymousView != SearchView.m(SearchView.this));
      SearchView.n(SearchView.this);
    }
  };
  
  static
  {
    if (Build.VERSION.SDK_INT >= 8) {}
    for (boolean bool = true;; bool = false)
    {
      VM = bool;
      Wv = new a();
      return;
    }
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.searchViewStyle);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = ap.a(paramContext, paramAttributeSet, a.k.SearchView, paramInt);
    LayoutInflater.from(paramContext).inflate(paramAttributeSet.getResourceId(a.k.SearchView_layout, a.h.abc_search_view), this, true);
    this.VN = ((SearchAutoComplete)findViewById(a.f.search_src_text));
    this.VN.WK = this;
    this.VO = findViewById(a.f.search_edit_frame);
    this.VP = findViewById(a.f.search_plate);
    this.VQ = findViewById(a.f.submit_area);
    this.VR = ((ImageView)findViewById(a.f.search_button));
    this.VS = ((ImageView)findViewById(a.f.search_go_btn));
    this.VT = ((ImageView)findViewById(a.f.search_close_btn));
    this.VU = ((ImageView)findViewById(a.f.search_voice_btn));
    this.VW = ((ImageView)findViewById(a.f.search_mag_icon));
    this.VP.setBackgroundDrawable(paramAttributeSet.getDrawable(a.k.SearchView_queryBackground));
    this.VQ.setBackgroundDrawable(paramAttributeSet.getDrawable(a.k.SearchView_submitBackground));
    this.VR.setImageDrawable(paramAttributeSet.getDrawable(a.k.SearchView_searchIcon));
    this.VS.setImageDrawable(paramAttributeSet.getDrawable(a.k.SearchView_goIcon));
    this.VT.setImageDrawable(paramAttributeSet.getDrawable(a.k.SearchView_closeIcon));
    this.VU.setImageDrawable(paramAttributeSet.getDrawable(a.k.SearchView_voiceIcon));
    this.VW.setImageDrawable(paramAttributeSet.getDrawable(a.k.SearchView_searchIcon));
    this.VX = paramAttributeSet.getDrawable(a.k.SearchView_searchHintIcon);
    this.VY = paramAttributeSet.getResourceId(a.k.SearchView_suggestionRowLayout, a.h.abc_search_dropdown_item_icons_2line);
    this.VZ = paramAttributeSet.getResourceId(a.k.SearchView_commitIcon, 0);
    this.VR.setOnClickListener(this.mOnClickListener);
    this.VT.setOnClickListener(this.mOnClickListener);
    this.VS.setOnClickListener(this.mOnClickListener);
    this.VU.setOnClickListener(this.mOnClickListener);
    this.VN.setOnClickListener(this.mOnClickListener);
    this.VN.addTextChangedListener(this.WD);
    this.VN.setOnEditorActionListener(this.WB);
    this.VN.setOnItemClickListener(this.WC);
    this.VN.setOnItemSelectedListener(this.Fu);
    this.VN.setOnKeyListener(this.WA);
    this.VN.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (SearchView.c(SearchView.this) != null) {
          SearchView.c(SearchView.this).onFocusChange(SearchView.this, paramAnonymousBoolean);
        }
      }
    });
    boolean bool = paramAttributeSet.getBoolean(a.k.SearchView_iconifiedByDefault, true);
    if (this.Wi != bool)
    {
      this.Wi = bool;
      V(bool);
      gy();
    }
    paramInt = paramAttributeSet.getDimensionPixelSize(a.k.SearchView_android_maxWidth, -1);
    if (paramInt != -1)
    {
      this.ia = paramInt;
      requestLayout();
    }
    this.Wc = paramAttributeSet.getText(a.k.SearchView_defaultQueryHint);
    this.Wm = paramAttributeSet.getText(a.k.SearchView_queryHint);
    paramInt = paramAttributeSet.getInt(a.k.SearchView_android_imeOptions, -1);
    if (paramInt != -1) {
      this.VN.setImeOptions(paramInt);
    }
    paramInt = paramAttributeSet.getInt(a.k.SearchView_android_inputType, -1);
    if (paramInt != -1) {
      this.VN.setInputType(paramInt);
    }
    setFocusable(paramAttributeSet.getBoolean(a.k.SearchView_android_focusable, true));
    paramAttributeSet.Yu.recycle();
    this.Wa = new Intent("android.speech.action.WEB_SEARCH");
    this.Wa.addFlags(268435456);
    this.Wa.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    this.Wb = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.Wb.addFlags(268435456);
    this.VV = findViewById(this.VN.getDropDownAnchor());
    if (this.VV != null)
    {
      if (Build.VERSION.SDK_INT < 11) {
        break label813;
      }
      this.VV.addOnLayoutChangeListener(new View.OnLayoutChangeListener()
      {
        public final void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
        {
          SearchView.d(SearchView.this);
        }
      });
    }
    for (;;)
    {
      V(this.Wi);
      gy();
      return;
      label813:
      this.VV.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public final void onGlobalLayout()
        {
          SearchView.d(SearchView.this);
        }
      });
    }
  }
  
  private void V(boolean paramBoolean)
  {
    boolean bool2 = true;
    int j = 8;
    this.Wj = paramBoolean;
    int i;
    boolean bool1;
    if (paramBoolean)
    {
      i = 0;
      if (TextUtils.isEmpty(this.VN.getText())) {
        break label123;
      }
      bool1 = true;
      label33:
      this.VR.setVisibility(i);
      W(bool1);
      View localView = this.VO;
      if (!paramBoolean) {
        break label129;
      }
      i = 8;
      label60:
      localView.setVisibility(i);
      i = j;
      if (this.VW.getDrawable() != null)
      {
        if (!this.Wi) {
          break label134;
        }
        i = j;
      }
      label87:
      this.VW.setVisibility(i);
      gw();
      if (bool1) {
        break label139;
      }
    }
    label123:
    label129:
    label134:
    label139:
    for (paramBoolean = bool2;; paramBoolean = false)
    {
      Y(paramBoolean);
      gv();
      return;
      i = 8;
      break;
      bool1 = false;
      break label33;
      i = 0;
      break label60;
      i = 0;
      break label87;
    }
  }
  
  private void W(boolean paramBoolean)
  {
    int j = 8;
    int i = j;
    if (this.Wl)
    {
      i = j;
      if (gu())
      {
        i = j;
        if (hasFocus()) {
          if (!paramBoolean)
          {
            i = j;
            if (this.Wo) {}
          }
          else
          {
            i = 0;
          }
        }
      }
    }
    this.VS.setVisibility(i);
  }
  
  private void X(boolean paramBoolean)
  {
    if (paramBoolean) {
      post(this.Ww);
    }
    InputMethodManager localInputMethodManager;
    do
    {
      return;
      removeCallbacks(this.Ww);
      localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    } while (localInputMethodManager == null);
    localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
  }
  
  private void Y(boolean paramBoolean)
  {
    int i;
    if ((this.Wo) && (!this.Wj) && (paramBoolean))
    {
      i = 0;
      this.VS.setVisibility(8);
    }
    for (;;)
    {
      this.VU.setVisibility(i);
      return;
      i = 8;
    }
  }
  
  private Intent a(Cursor paramCursor, int paramInt, String paramString)
  {
    try
    {
      str1 = ak.a(paramCursor, "suggest_intent_action");
      paramString = str1;
      if (str1 != null) {
        break label204;
      }
      paramString = str1;
      if (Build.VERSION.SDK_INT < 8) {
        break label204;
      }
      paramString = this.Wt.getSuggestIntentAction();
    }
    catch (RuntimeException paramString)
    {
      for (;;)
      {
        String str2;
        try
        {
          String str3;
          paramInt = paramCursor.getPosition();
          new StringBuilder("Search suggestions cursor at row ").append(paramInt).append(" returned exception.");
          return null;
        }
        catch (RuntimeException paramCursor)
        {
          paramInt = -1;
          continue;
        }
        label204:
        String str1 = paramString;
        if (paramString == null)
        {
          str1 = "android.intent.action.SEARCH";
          continue;
          label219:
          if (str2 == null) {
            paramString = null;
          }
        }
      }
    }
    str2 = ak.a(paramCursor, "suggest_intent_data");
    paramString = str2;
    if (VM)
    {
      paramString = str2;
      if (str2 == null) {
        paramString = this.Wt.getSuggestIntentData();
      }
    }
    str2 = paramString;
    if (paramString != null)
    {
      str3 = ak.a(paramCursor, "suggest_intent_data_id");
      str2 = paramString;
      if (str3 != null)
      {
        str2 = paramString + "/" + Uri.encode(str3);
        break label219;
        for (;;)
        {
          str2 = ak.a(paramCursor, "suggest_intent_query");
          return a(str1, paramString, ak.a(paramCursor, "suggest_intent_extra_data"), str2, 0, null);
          paramString = Uri.parse(str2);
        }
      }
    }
  }
  
  private Intent a(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    paramString1 = new Intent(paramString1);
    paramString1.addFlags(268435456);
    if (paramUri != null) {
      paramString1.setData(paramUri);
    }
    paramString1.putExtra("user_query", this.Wq);
    if (paramString3 != null) {
      paramString1.putExtra("query", paramString3);
    }
    if (paramString2 != null) {
      paramString1.putExtra("intent_extra_data_key", paramString2);
    }
    if (this.Wu != null) {
      paramString1.putExtra("app_data", this.Wu);
    }
    if (paramInt != 0)
    {
      paramString1.putExtra("action_key", paramInt);
      paramString1.putExtra("action_msg", paramString4);
    }
    if (VM) {
      paramString1.setComponent(this.Wt.getSearchActivity());
    }
    return paramString1;
  }
  
  private void a(int paramInt, String paramString1, String paramString2)
  {
    paramString1 = a("android.intent.action.SEARCH", null, null, paramString2, 0, null);
    getContext().startActivity(paramString1);
  }
  
  private boolean b(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.Wt == null) {}
    do
    {
      do
      {
        return false;
      } while ((this.Wk == null) || (paramKeyEvent.getAction() != 0) || (!g.a(paramKeyEvent)));
      if ((paramInt == 66) || (paramInt == 84) || (paramInt == 61)) {
        return bq(this.VN.getListSelection());
      }
      if ((paramInt == 21) || (paramInt == 22))
      {
        if (paramInt == 21) {}
        for (paramInt = 0;; paramInt = this.VN.length())
        {
          this.VN.setSelection(paramInt);
          this.VN.setListSelection(0);
          this.VN.clearListSelection();
          Wv.a(this.VN);
          return true;
        }
      }
    } while ((paramInt != 19) || (this.VN.getListSelection() != 0));
    return false;
  }
  
  private boolean bq(int paramInt)
  {
    boolean bool = false;
    Object localObject;
    if ((this.Wg == null) || (!this.Wg.gE()))
    {
      localObject = this.Wk.AE;
      if ((localObject != null) && (((Cursor)localObject).moveToPosition(paramInt)))
      {
        localObject = a((Cursor)localObject, 0, null);
        if (localObject == null) {}
      }
    }
    try
    {
      getContext().startActivity((Intent)localObject);
      X(false);
      this.VN.dismissDropDown();
      bool = true;
      return bool;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        new StringBuilder("Failed launch activity: ").append(localObject);
      }
    }
  }
  
  private void gB()
  {
    a locala = Wv;
    SearchAutoComplete localSearchAutoComplete = this.VN;
    if (locala.WF != null) {}
    try
    {
      locala.WF.invoke(localSearchAutoComplete, new Object[0]);
      locala = Wv;
      localSearchAutoComplete = this.VN;
      if (locala.WG != null) {}
      try
      {
        locala.WG.invoke(localSearchAutoComplete, new Object[0]);
        return;
      }
      catch (Exception localException1) {}
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  private int gt()
  {
    return getContext().getResources().getDimensionPixelSize(a.d.abc_search_view_preferred_width);
  }
  
  private boolean gu()
  {
    return ((this.Wl) || (this.Wo)) && (!this.Wj);
  }
  
  private void gv()
  {
    int j = 8;
    int i = j;
    if (gu()) {
      if (this.VS.getVisibility() != 0)
      {
        i = j;
        if (this.VU.getVisibility() != 0) {}
      }
      else
      {
        i = 0;
      }
    }
    this.VQ.setVisibility(i);
  }
  
  private void gw()
  {
    int m = 1;
    int k = 0;
    int i;
    int j;
    label44:
    label56:
    Drawable localDrawable;
    if (!TextUtils.isEmpty(this.VN.getText()))
    {
      i = 1;
      j = m;
      if (i == 0)
      {
        if ((!this.Wi) || (this.Wr)) {
          break label99;
        }
        j = m;
      }
      localObject = this.VT;
      if (j == 0) {
        break label104;
      }
      j = k;
      ((ImageView)localObject).setVisibility(j);
      localDrawable = this.VT.getDrawable();
      if (localDrawable != null) {
        if (i == 0) {
          break label110;
        }
      }
    }
    label99:
    label104:
    label110:
    for (Object localObject = ENABLED_STATE_SET;; localObject = EMPTY_STATE_SET)
    {
      localDrawable.setState((int[])localObject);
      return;
      i = 0;
      break;
      j = 0;
      break label44;
      j = 8;
      break label56;
    }
  }
  
  private void gx()
  {
    post(this.Wx);
  }
  
  private void gy()
  {
    Object localObject1;
    SearchAutoComplete localSearchAutoComplete;
    Object localObject2;
    if (this.Wm != null)
    {
      localObject1 = this.Wm;
      localSearchAutoComplete = this.VN;
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = "";
      }
      localObject1 = localObject2;
      if (this.Wi)
      {
        if (this.VX != null) {
          break label102;
        }
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      localSearchAutoComplete.setHint((CharSequence)localObject1);
      return;
      if ((VM) && (this.Wt != null) && (this.Wt.getHintId() != 0))
      {
        localObject1 = getContext().getText(this.Wt.getHintId());
        break;
      }
      localObject1 = this.Wc;
      break;
      label102:
      int i = (int)(this.VN.getTextSize() * 1.25D);
      this.VX.setBounds(0, 0, i, i);
      localObject1 = new SpannableStringBuilder("   ");
      ((SpannableStringBuilder)localObject1).setSpan(new ImageSpan(this.VX), 1, 2, 33);
      ((SpannableStringBuilder)localObject1).append((CharSequence)localObject2);
    }
  }
  
  private void gz()
  {
    V(false);
    this.VN.requestFocus();
    X(true);
    if (this.Wh != null) {
      this.Wh.onClick(this);
    }
  }
  
  static boolean p(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().orientation == 2;
  }
  
  public void clearFocus()
  {
    this.Wn = true;
    X(false);
    super.clearFocus();
    this.VN.clearFocus();
    this.Wn = false;
  }
  
  final void gA()
  {
    V(this.Wj);
    gx();
    if (this.VN.hasFocus()) {
      gB();
    }
  }
  
  final void h(CharSequence paramCharSequence)
  {
    this.VN.setText(paramCharSequence);
    SearchAutoComplete localSearchAutoComplete = this.VN;
    if (TextUtils.isEmpty(paramCharSequence)) {}
    for (int i = 0;; i = paramCharSequence.length())
    {
      localSearchAutoComplete.setSelection(i);
      return;
    }
  }
  
  public final void onActionViewCollapsed()
  {
    this.VN.setText("");
    this.VN.setSelection(this.VN.length());
    this.Wq = "";
    clearFocus();
    V(true);
    this.VN.setImeOptions(this.Ws);
    this.Wr = false;
  }
  
  public final void onActionViewExpanded()
  {
    if (this.Wr) {
      return;
    }
    this.Wr = true;
    this.Ws = this.VN.getImeOptions();
    this.VN.setImeOptions(this.Ws | 0x2000000);
    this.VN.setText("");
    gz();
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.Wx);
    post(this.Wy);
    super.onDetachedFromWindow();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.Wj)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int j = View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt1);
    switch (j)
    {
    default: 
      paramInt1 = i;
    }
    for (;;)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
      return;
      if (this.ia > 0)
      {
        paramInt1 = Math.min(this.ia, i);
      }
      else
      {
        paramInt1 = Math.min(gt(), i);
        continue;
        paramInt1 = i;
        if (this.ia > 0)
        {
          paramInt1 = Math.min(this.ia, i);
          continue;
          if (this.ia > 0) {
            paramInt1 = this.ia;
          } else {
            paramInt1 = gt();
          }
        }
      }
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    V(paramParcelable.WJ);
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.WJ = this.Wj;
    return localSavedState;
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    gx();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (this.Wn) {}
    while (!isFocusable()) {
      return false;
    }
    if (!this.Wj)
    {
      boolean bool = this.VN.requestFocus(paramInt, paramRect);
      if (bool) {
        V(false);
      }
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }
  
  static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    boolean WJ;
    
    public SavedState(Parcel paramParcel)
    {
      super();
      this.WJ = ((Boolean)paramParcel.readValue(null)).booleanValue();
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.WJ + "}";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeValue(Boolean.valueOf(this.WJ));
    }
  }
  
  public static class SearchAutoComplete
    extends AppCompatAutoCompleteTextView
  {
    SearchView WK;
    private int mThreshold = getThreshold();
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
    {
      this(paramContext, paramAttributeSet, a.a.autoCompleteTextViewStyle);
    }
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
    }
    
    public boolean enoughToFilter()
    {
      return (this.mThreshold <= 0) || (super.enoughToFilter());
    }
    
    protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
    {
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
      this.WK.gA();
    }
    
    public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
    {
      if (paramInt == 4)
      {
        KeyEvent.DispatcherState localDispatcherState;
        if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.startTracking(paramKeyEvent, this);
          }
          return true;
        }
        if (paramKeyEvent.getAction() == 1)
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.handleUpEvent(paramKeyEvent);
          }
          if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
          {
            this.WK.clearFocus();
            SearchView.p(this.WK);
            return true;
          }
        }
      }
      return super.onKeyPreIme(paramInt, paramKeyEvent);
    }
    
    public void onWindowFocusChanged(boolean paramBoolean)
    {
      super.onWindowFocusChanged(paramBoolean);
      if ((paramBoolean) && (this.WK.hasFocus()) && (getVisibility() == 0))
      {
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
        if (SearchView.p(getContext())) {
          SearchView.Wv.a(this);
        }
      }
    }
    
    public void performCompletion() {}
    
    protected void replaceText(CharSequence paramCharSequence) {}
    
    public void setThreshold(int paramInt)
    {
      super.setThreshold(paramInt);
      this.mThreshold = paramInt;
    }
  }
  
  private static final class a
  {
    Method WF;
    Method WG;
    private Method WH;
    Method WI;
    
    a()
    {
      try
      {
        this.WF = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
        this.WF.setAccessible(true);
        try
        {
          this.WG = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
          this.WG.setAccessible(true);
          try
          {
            this.WH = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { Boolean.TYPE });
            this.WH.setAccessible(true);
            try
            {
              this.WI = InputMethodManager.class.getMethod("showSoftInputUnchecked", new Class[] { Integer.TYPE, ResultReceiver.class });
              this.WI.setAccessible(true);
              return;
            }
            catch (NoSuchMethodException localNoSuchMethodException1) {}
          }
          catch (NoSuchMethodException localNoSuchMethodException2)
          {
            for (;;) {}
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException3)
        {
          for (;;) {}
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException4)
      {
        for (;;) {}
      }
    }
    
    final void a(AutoCompleteTextView paramAutoCompleteTextView)
    {
      if (this.WH != null) {}
      try
      {
        this.WH.invoke(paramAutoCompleteTextView, new Object[] { Boolean.valueOf(true) });
        return;
      }
      catch (Exception paramAutoCompleteTextView) {}
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean onClose();
  }
  
  public static abstract interface c
  {
    public abstract boolean gC();
  }
  
  public static abstract interface d
  {
    public abstract boolean gD();
    
    public abstract boolean gE();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v7\widget\SearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */