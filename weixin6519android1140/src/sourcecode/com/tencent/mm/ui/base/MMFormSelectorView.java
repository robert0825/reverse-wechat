package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.m;

public class MMFormSelectorView
  extends LinearLayout
{
  private TextView hqH;
  private int layout;
  private Context mContext;
  private EditText nUE;
  private String tCQ;
  private String title;
  
  public MMFormSelectorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(3315043663872L, 24699);
    GMTrace.o(3315043663872L, 24699);
  }
  
  @TargetApi(11)
  public MMFormSelectorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3314909446144L, 24698);
    this.mContext = null;
    this.layout = -1;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.enq, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(a.m.ggN, 0);
    if (paramInt != 0) {
      this.title = paramContext.getString(paramInt);
    }
    paramInt = paramAttributeSet.getResourceId(a.m.ggL, 0);
    if (paramInt != 0) {
      this.tCQ = paramContext.getString(paramInt);
    }
    this.layout = paramAttributeSet.getResourceId(a.m.ggM, this.layout);
    paramAttributeSet.recycle();
    inflate(paramContext, this.layout, this);
    this.mContext = paramContext;
    GMTrace.o(3314909446144L, 24698);
  }
  
  public void onFinishInflate()
  {
    GMTrace.i(3315177881600L, 24700);
    this.hqH = ((TextView)findViewById(a.g.title));
    this.nUE = ((EditText)findViewById(a.g.bvB));
    if ((this.hqH == null) || (this.nUE == null))
    {
      w.w("MicroMsg.MMFormSelectorView", "titleTV : %s, contentET : %s", new Object[] { this.hqH, this.nUE });
      GMTrace.o(3315177881600L, 24700);
      return;
    }
    if (this.title != null) {
      this.hqH.setText(this.title);
    }
    if (this.tCQ != null) {
      this.nUE.setHint(this.tCQ);
    }
    GMTrace.o(3315177881600L, 24700);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\base\MMFormSelectorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */