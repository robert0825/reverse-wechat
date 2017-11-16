package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.m;
import java.util.HashMap;
import junit.framework.Assert;

public final class ChoicePreference
  extends Preference
{
  public int nJs;
  public String value;
  private final HashMap<CharSequence, b> values;
  private RadioGroup wjs;
  private CharSequence[] wjt;
  public CharSequence[] wju;
  public Preference.a wjv;
  
  public ChoicePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3213306626048L, 23941);
    GMTrace.o(3213306626048L, 23941);
  }
  
  public ChoicePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3213440843776L, 23942);
    this.values = new HashMap();
    this.nJs = -1;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.emI, paramInt, 0);
    this.wjt = paramContext.getTextArray(a.m.ggG);
    this.wju = paramContext.getTextArray(a.m.ggH);
    paramContext.recycle();
    caV();
    GMTrace.o(3213440843776L, 23942);
  }
  
  private void caV()
  {
    int i = 0;
    GMTrace.i(3213843496960L, 23945);
    if (this.wjt == null) {
      this.wjt = new CharSequence[0];
    }
    if (this.wju == null) {
      this.wju = new CharSequence[0];
    }
    if (this.wjt.length == this.wju.length) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("entries count different", bool);
      this.values.clear();
      while (i < this.wju.length)
      {
        b localb = new b(this.wjt[i], 1048576 + i);
        this.values.put(this.wju[i], localb);
        i += 1;
      }
    }
    GMTrace.o(3213843496960L, 23945);
  }
  
  public final void a(Preference.a parama)
  {
    GMTrace.i(3213575061504L, 23943);
    this.wjv = parama;
    GMTrace.o(3213575061504L, 23943);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(3213977714688L, 23946);
    super.onBindView(paramView);
    if (this.wjs != null) {
      this.wjs.check(this.nJs);
    }
    GMTrace.o(3213977714688L, 23946);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(3213709279232L, 23944);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    Object localObject = (ViewGroup)paramViewGroup.findViewById(a.g.content);
    ((ViewGroup)localObject).removeAllViews();
    localLayoutInflater.inflate(a.h.gfq, (ViewGroup)localObject);
    this.wjs = ((RadioGroup)paramViewGroup.findViewById(a.g.bFE));
    int i = 0;
    if (i < this.wju.length)
    {
      localObject = this.wju[i];
      localObject = (b)this.values.get(localObject);
      RadioButton localRadioButton;
      if (localObject != null)
      {
        if (i != 0) {
          break label147;
        }
        localRadioButton = (RadioButton)localLayoutInflater.inflate(a.h.gfc, null);
        ((b)localObject).a(localRadioButton);
        this.wjs.addView(localRadioButton);
      }
      for (;;)
      {
        i += 1;
        break;
        label147:
        if (i == this.wju.length - 1)
        {
          localRadioButton = (RadioButton)localLayoutInflater.inflate(a.h.gfe, null);
          ((b)localObject).a(localRadioButton);
          this.wjs.addView(localRadioButton);
        }
        else
        {
          localRadioButton = (RadioButton)localLayoutInflater.inflate(a.h.gfd, null);
          ((b)localObject).a(localRadioButton);
          this.wjs.addView(localRadioButton);
        }
      }
    }
    this.wjs.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt)
      {
        GMTrace.i(3219212206080L, 23985);
        if (ChoicePreference.this.wjv != null) {
          if (paramAnonymousInt == -1) {
            break label98;
          }
        }
        label98:
        for (ChoicePreference.this.value = ChoicePreference.this.wju[(paramAnonymousInt - 1048576)];; ChoicePreference.this.value = null)
        {
          ChoicePreference.this.nJs = paramAnonymousInt;
          ChoicePreference.this.wjv.a(ChoicePreference.this, ChoicePreference.this.value);
          GMTrace.o(3219212206080L, 23985);
          return;
        }
      }
    });
    GMTrace.o(3213709279232L, 23944);
    return paramViewGroup;
  }
  
  public final void setValue(String paramString)
  {
    GMTrace.i(3214111932416L, 23947);
    this.value = paramString;
    paramString = (b)this.values.get(paramString);
    if (paramString == null)
    {
      this.nJs = -1;
      GMTrace.o(3214111932416L, 23947);
      return;
    }
    this.nJs = paramString.id;
    GMTrace.o(3214111932416L, 23947);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\base\preference\ChoicePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */