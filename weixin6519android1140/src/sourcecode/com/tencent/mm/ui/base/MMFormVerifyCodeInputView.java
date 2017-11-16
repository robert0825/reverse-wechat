package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.k;
import com.tencent.mm.v.a.m;

public class MMFormVerifyCodeInputView
  extends LinearLayout
{
  private aj gST;
  private TextView hqH;
  private int layout;
  private Context mContext;
  public EditText nUE;
  private Button vSz;
  private int wbM;
  private int wbN;
  private int[] wbO;
  private View.OnFocusChangeListener wbP;
  private TextView wbY;
  private int wbZ;
  private int wca;
  private int wcb;
  public View.OnClickListener wcc;
  
  public MMFormVerifyCodeInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(17515010850816L, 130497);
    GMTrace.o(17515010850816L, 130497);
  }
  
  @TargetApi(11)
  public MMFormVerifyCodeInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17514876633088L, 130496);
    this.mContext = null;
    this.wbM = -1;
    this.wbN = -1;
    this.wbZ = -1;
    this.layout = -1;
    this.wca = 60;
    this.wcb = this.wca;
    this.wbP = null;
    this.wcc = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.enq, paramInt, 0);
    this.wbN = paramAttributeSet.getResourceId(a.m.ggL, -1);
    this.wbM = paramAttributeSet.getResourceId(a.m.ggN, -1);
    this.wbZ = paramAttributeSet.getResourceId(a.m.ggK, -1);
    this.layout = paramAttributeSet.getResourceId(a.m.ggM, this.layout);
    paramAttributeSet.recycle();
    inflate(paramContext, this.layout, this);
    this.mContext = paramContext;
    GMTrace.o(17514876633088L, 130496);
  }
  
  public final void bZJ()
  {
    GMTrace.i(17515279286272L, 130499);
    this.vSz.setVisibility(8);
    this.wbY.setVisibility(0);
    this.wbY.setText(getContext().getString(a.k.ggq, new Object[] { Integer.valueOf(this.wca) }));
    if (this.gST != null)
    {
      this.gST.stopTimer();
      this.gST.z(1000L, 1000L);
      GMTrace.o(17515279286272L, 130499);
      return;
    }
    if (getContext() != null)
    {
      this.gST = new aj(getContext().getMainLooper(), new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(17514205544448L, 130491);
          MMFormVerifyCodeInputView.f(MMFormVerifyCodeInputView.this);
          MMFormVerifyCodeInputView.h(MMFormVerifyCodeInputView.this).setText(MMFormVerifyCodeInputView.this.getContext().getString(a.k.ggq, new Object[] { Integer.valueOf(MMFormVerifyCodeInputView.g(MMFormVerifyCodeInputView.this)) }));
          if (MMFormVerifyCodeInputView.g(MMFormVerifyCodeInputView.this) == 0)
          {
            MMFormVerifyCodeInputView.i(MMFormVerifyCodeInputView.this).stopTimer();
            MMFormVerifyCodeInputView.a(MMFormVerifyCodeInputView.this, MMFormVerifyCodeInputView.j(MMFormVerifyCodeInputView.this));
            MMFormVerifyCodeInputView.k(MMFormVerifyCodeInputView.this).setVisibility(0);
            MMFormVerifyCodeInputView.h(MMFormVerifyCodeInputView.this).setVisibility(8);
          }
          GMTrace.o(17514205544448L, 130491);
          return true;
        }
      }, true);
      this.gST.z(1000L, 1000L);
      GMTrace.o(17515279286272L, 130499);
      return;
    }
    if (this.gST != null) {
      this.gST.stopTimer();
    }
    GMTrace.o(17515279286272L, 130499);
  }
  
  public final void bZK()
  {
    GMTrace.i(17515547721728L, 130501);
    if (this.nUE != null)
    {
      this.nUE.setInputType(3);
      GMTrace.o(17515547721728L, 130501);
      return;
    }
    w.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
    GMTrace.o(17515547721728L, 130501);
  }
  
  public final Editable getText()
  {
    GMTrace.i(17515681939456L, 130502);
    if (this.nUE != null)
    {
      Editable localEditable = this.nUE.getText();
      GMTrace.o(17515681939456L, 130502);
      return localEditable;
    }
    w.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
    GMTrace.o(17515681939456L, 130502);
    return null;
  }
  
  public void onFinishInflate()
  {
    GMTrace.i(17515145068544L, 130498);
    super.onFinishInflate();
    this.hqH = ((TextView)findViewById(a.g.title));
    this.nUE = ((EditText)findViewById(a.g.bvB));
    this.wbY = ((TextView)findViewById(a.g.gem));
    this.vSz = ((Button)findViewById(a.g.gdW));
    if ((this.hqH == null) || (this.nUE == null) || (this.wbY == null) || (this.vSz == null)) {
      w.w("MicroMsg.MMFormVerifyCodeInputView", "titleTV : %s, contentET : %s, timerTv: %s, sendSmsBtn: %s", new Object[] { this.hqH, this.nUE, this.wbY, this.vSz });
    }
    for (;;)
    {
      if (this.nUE != null)
      {
        View.OnFocusChangeListener local1 = new View.OnFocusChangeListener()
        {
          public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
          {
            GMTrace.i(17513131802624L, 130483);
            if (paramAnonymousView == MMFormVerifyCodeInputView.a(MMFormVerifyCodeInputView.this))
            {
              MMFormVerifyCodeInputView.b(MMFormVerifyCodeInputView.this);
              if (!paramAnonymousBoolean) {
                break label80;
              }
              MMFormVerifyCodeInputView.this.setBackgroundResource(a.f.aXs);
            }
            for (;;)
            {
              MMFormVerifyCodeInputView.c(MMFormVerifyCodeInputView.this);
              if (MMFormVerifyCodeInputView.d(MMFormVerifyCodeInputView.this) != null) {
                MMFormVerifyCodeInputView.d(MMFormVerifyCodeInputView.this).onFocusChange(paramAnonymousView, paramAnonymousBoolean);
              }
              GMTrace.o(17513131802624L, 130483);
              return;
              label80:
              MMFormVerifyCodeInputView.this.setBackgroundResource(a.f.aXt);
            }
          }
        };
        this.nUE.setOnFocusChangeListener(local1);
      }
      if (this.vSz != null) {
        this.vSz.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17513400238080L, 130485);
            if (MMFormVerifyCodeInputView.e(MMFormVerifyCodeInputView.this) != null) {
              MMFormVerifyCodeInputView.e(MMFormVerifyCodeInputView.this).onClick(paramAnonymousView);
            }
            GMTrace.o(17513400238080L, 130485);
          }
        });
      }
      GMTrace.o(17515145068544L, 130498);
      return;
      if (this.wbM != -1) {
        this.hqH.setText(this.wbM);
      }
      if (this.wbN != -1) {
        this.nUE.setHint(this.wbN);
      }
      if (this.wbZ != -1) {
        this.vSz.setText(this.wbZ);
      }
    }
  }
  
  public final void reset()
  {
    GMTrace.i(17515413504000L, 130500);
    if (this.gST != null) {
      this.gST.stopTimer();
    }
    this.nUE.setText("");
    this.wbY.setVisibility(8);
    this.wcb = this.wca;
    this.vSz.setVisibility(0);
    GMTrace.o(17515413504000L, 130500);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMFormVerifyCodeInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */