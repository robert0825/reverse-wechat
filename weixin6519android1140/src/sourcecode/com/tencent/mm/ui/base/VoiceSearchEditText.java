package com.tencent.mm.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.v.a.f;

public class VoiceSearchEditText
  extends EditText
{
  private Context context;
  public String iQk;
  private View.OnClickListener slu;
  final Drawable wjb;
  final Drawable wjc;
  final Drawable wjd;
  private boolean wje;
  private boolean wjf;
  private boolean wjg;
  
  public VoiceSearchEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3333297274880L, 24835);
    this.iQk = "";
    this.wjb = getResources().getDrawable(a.f.gcQ);
    this.wjc = null;
    this.wjd = getResources().getDrawable(a.f.gcI);
    this.wje = true;
    this.wjf = false;
    this.wjg = false;
    init(paramContext);
    GMTrace.o(3333297274880L, 24835);
  }
  
  public VoiceSearchEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3333431492608L, 24836);
    this.iQk = "";
    this.wjb = getResources().getDrawable(a.f.gcQ);
    this.wjc = null;
    this.wjd = getResources().getDrawable(a.f.gcI);
    this.wje = true;
    this.wjf = false;
    this.wjg = false;
    init(paramContext);
    GMTrace.o(3333431492608L, 24836);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(3333565710336L, 24837);
    this.context = paramContext;
    this.wjf = false;
    this.wjb.setBounds(0, 0, this.wjb.getIntrinsicWidth(), this.wjb.getIntrinsicHeight());
    this.wjd.setBounds(0, 0, this.wjd.getIntrinsicWidth(), this.wjd.getIntrinsicHeight());
    this.wje = true;
    if (this.wjf)
    {
      setCompoundDrawables(this.wjc, getCompoundDrawables()[1], this.wjb, getCompoundDrawables()[3]);
      setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(3347792789504L, 24943);
          paramAnonymousView = VoiceSearchEditText.this;
          if (paramAnonymousView.getCompoundDrawables()[2] == null)
          {
            GMTrace.o(3347792789504L, 24943);
            return false;
          }
          if (paramAnonymousMotionEvent.getAction() != 1)
          {
            GMTrace.o(3347792789504L, 24943);
            return true;
          }
          VoiceSearchEditText.a(VoiceSearchEditText.this, true);
          if ((VoiceSearchEditText.a(VoiceSearchEditText.this)) && (VoiceSearchEditText.b(VoiceSearchEditText.this)) && (paramAnonymousView.getText().toString().equals(""))) {
            if (paramAnonymousMotionEvent.getX() > paramAnonymousView.getWidth() - paramAnonymousView.getPaddingRight() - VoiceSearchEditText.this.wjb.getIntrinsicWidth() - a.fromDPToPix(VoiceSearchEditText.c(paramAnonymousView), 25))
            {
              if (VoiceSearchEditText.d(VoiceSearchEditText.this) != null)
              {
                w.i("MicroMsg.VoiceSearchEditText", "user clicked voice button");
                if ((VoiceSearchEditText.this.getContext() instanceof MMActivity)) {
                  ((MMActivity)VoiceSearchEditText.this.getContext()).db(paramAnonymousView);
                }
                VoiceSearchEditText.d(VoiceSearchEditText.this).onClick(VoiceSearchEditText.this);
                GMTrace.o(3347792789504L, 24943);
                return true;
              }
            }
            else
            {
              paramAnonymousView.requestFocus();
              if ((VoiceSearchEditText.this.getContext() instanceof Activity)) {
                MMActivity.G((Activity)VoiceSearchEditText.this.getContext());
              }
              if (VoiceSearchEditText.d(VoiceSearchEditText.this) != null) {
                VoiceSearchEditText.d(VoiceSearchEditText.this).onClick(null);
              }
            }
          }
          for (;;)
          {
            GMTrace.o(3347792789504L, 24943);
            return false;
            if (paramAnonymousView.getText().toString().length() > 0)
            {
              if (paramAnonymousMotionEvent.getX() > paramAnonymousView.getWidth() - paramAnonymousView.getPaddingRight() - VoiceSearchEditText.this.wjd.getIntrinsicWidth() - a.fromDPToPix(VoiceSearchEditText.c(paramAnonymousView), 25))
              {
                paramAnonymousView.setText("");
                VoiceSearchEditText.e(VoiceSearchEditText.this);
              }
              else if (!paramAnonymousView.isFocused())
              {
                paramAnonymousView.requestFocus();
                if ((VoiceSearchEditText.this.getContext() instanceof Activity)) {
                  MMActivity.G((Activity)VoiceSearchEditText.this.getContext());
                }
              }
            }
            else if (VoiceSearchEditText.d(VoiceSearchEditText.this) != null) {
              VoiceSearchEditText.d(VoiceSearchEditText.this).onClick(null);
            }
          }
        }
      });
      addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(3354503675904L, 24993);
          GMTrace.o(3354503675904L, 24993);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(3354637893632L, 24994);
          GMTrace.o(3354637893632L, 24994);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(3354369458176L, 24992);
          VoiceSearchEditText.a(VoiceSearchEditText.this, true);
          VoiceSearchEditText.e(VoiceSearchEditText.this);
          GMTrace.o(3354369458176L, 24992);
        }
      });
      setOnFocusChangeListener(new View.OnFocusChangeListener()
      {
        public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
        {
          GMTrace.i(3321620332544L, 24748);
          w.d("MicroMsg.VoiceSearchEditText", "onFocusChange hasFocus = [%s], currentFocusState = [%s]", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Boolean.valueOf(VoiceSearchEditText.f(VoiceSearchEditText.this)) });
          if ((!paramAnonymousBoolean) && (VoiceSearchEditText.f(VoiceSearchEditText.this)))
          {
            VoiceSearchEditText.e(VoiceSearchEditText.this);
            VoiceSearchEditText.a(VoiceSearchEditText.this, false);
          }
          GMTrace.o(3321620332544L, 24748);
        }
      });
      if ((paramContext instanceof Activity))
      {
        paramContext = ((Activity)paramContext).getCurrentFocus();
        if ((paramContext == null) || (paramContext != this)) {
          break label245;
        }
      }
    }
    label245:
    for (this.wjg = true;; this.wjg = false)
    {
      requestFocus();
      GMTrace.o(3333565710336L, 24837);
      return;
      if (getText().toString().length() > 0)
      {
        setCompoundDrawables(this.wjc, getCompoundDrawables()[1], this.wjd, getCompoundDrawables()[3]);
        break;
      }
      setCompoundDrawables(this.wjc, getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\base\VoiceSearchEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */