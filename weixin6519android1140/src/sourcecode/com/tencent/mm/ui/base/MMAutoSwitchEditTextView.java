package com.tencent.mm.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.m;
import java.util.ArrayList;
import java.util.Iterator;

public class MMAutoSwitchEditTextView
  extends LinearLayout
{
  private int kgU;
  private Context mContext;
  private int mScreenWidth;
  private int mwt;
  private int olo;
  private int wbc;
  private String wbd;
  public ArrayList<MMAutoSwitchEditText> wbe;
  private c wbf;
  public a wbg;
  public b wbh;
  
  public MMAutoSwitchEditTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3328599654400L, 24800);
    this.wbe = new ArrayList();
    this.wbf = new c();
    this.kgU = 100;
    this.mContext = paramContext;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.emF);
    this.wbc = paramAttributeSet.getInteger(a.m.ggC, 3);
    this.mwt = paramAttributeSet.getInteger(a.m.ggF, 4);
    this.olo = paramAttributeSet.getInteger(a.m.ggE, 2);
    int i = paramAttributeSet.getResourceId(a.m.ggD, 0);
    if (i != 0) {
      this.wbd = paramContext.getString(i);
    }
    paramAttributeSet.recycle();
    if ((paramContext instanceof Activity))
    {
      this.mScreenWidth = ((Activity)paramContext).getWindowManager().getDefaultDisplay().getWidth();
      this.kgU = ((this.mScreenWidth - 80 - (this.wbc - 1) * 20) / this.wbc);
    }
    setPadding(a.fromDPToPix(paramContext, 20), 0, a.fromDPToPix(paramContext, 20), 0);
    bZF();
    GMTrace.o(3328599654400L, 24800);
  }
  
  private void bZF()
  {
    GMTrace.i(3328733872128L, 24801);
    int i = 0;
    if (i < this.wbc)
    {
      MMAutoSwitchEditText localMMAutoSwitchEditText = (MMAutoSwitchEditText)View.inflate(this.mContext, a.h.geK, null);
      localMMAutoSwitchEditText.setInputType(this.olo);
      if ((this.wbd != null) && (this.wbd.length() > 0)) {
        localMMAutoSwitchEditText.setKeyListener(DigitsKeyListener.getInstance(this.wbd));
      }
      localMMAutoSwitchEditText.waX.mIndex = i;
      int j = this.mwt;
      localMMAutoSwitchEditText.waX.wbb = j;
      Object localObject = this.wbf;
      localMMAutoSwitchEditText.waX.waY = ((MMAutoSwitchEditText.c)localObject);
      localObject = this.wbf;
      localMMAutoSwitchEditText.waX.waZ = ((MMAutoSwitchEditText.b)localObject);
      localObject = this.wbf;
      localMMAutoSwitchEditText.waX.wba = ((MMAutoSwitchEditText.d)localObject);
      localObject = new LinearLayout.LayoutParams(this.kgU, -2);
      if (i > 0) {}
      for (((LinearLayout.LayoutParams)localObject).leftMargin = 20;; ((LinearLayout.LayoutParams)localObject).leftMargin = 0)
      {
        ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
        localMMAutoSwitchEditText.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.wbe.add(localMMAutoSwitchEditText);
        addView(localMMAutoSwitchEditText);
        i += 1;
        break;
      }
    }
    GMTrace.o(3328733872128L, 24801);
  }
  
  public static abstract interface a
  {
    public abstract void Vm(String paramString);
  }
  
  public static abstract interface b
  {
    public abstract void bYq();
  }
  
  private final class c
    implements MMAutoSwitchEditText.b, MMAutoSwitchEditText.c, MMAutoSwitchEditText.d
  {
    public c()
    {
      GMTrace.i(3327928565760L, 24795);
      GMTrace.o(3327928565760L, 24795);
    }
    
    public final void BS(int paramInt)
    {
      GMTrace.i(3328197001216L, 24797);
      if ((MMAutoSwitchEditTextView.a(MMAutoSwitchEditTextView.this) != null) && (paramInt < MMAutoSwitchEditTextView.a(MMAutoSwitchEditTextView.this).size()))
      {
        if (paramInt == 0)
        {
          GMTrace.o(3328197001216L, 24797);
          return;
        }
        MMAutoSwitchEditText localMMAutoSwitchEditText = (MMAutoSwitchEditText)MMAutoSwitchEditTextView.a(MMAutoSwitchEditTextView.this).get(paramInt - 1);
        if (localMMAutoSwitchEditText != null) {
          localMMAutoSwitchEditText.requestFocus();
        }
      }
      GMTrace.o(3328197001216L, 24797);
    }
    
    public final void BT(int paramInt)
    {
      GMTrace.i(3328062783488L, 24796);
      Object localObject = "";
      Iterator localIterator = MMAutoSwitchEditTextView.a(MMAutoSwitchEditTextView.this).iterator();
      if (localIterator.hasNext())
      {
        MMAutoSwitchEditText localMMAutoSwitchEditText = (MMAutoSwitchEditText)localIterator.next();
        if (bg.nm(localMMAutoSwitchEditText.getText().toString().trim())) {
          break label238;
        }
        localObject = (String)localObject + localMMAutoSwitchEditText.getText().toString().trim();
      }
      label238:
      for (;;)
      {
        break;
        if ((!bg.nm((String)localObject)) && (((String)localObject).length() == MMAutoSwitchEditTextView.b(MMAutoSwitchEditTextView.this) * MMAutoSwitchEditTextView.c(MMAutoSwitchEditTextView.this)))
        {
          if (MMAutoSwitchEditTextView.d(MMAutoSwitchEditTextView.this) != null) {
            MMAutoSwitchEditTextView.d(MMAutoSwitchEditTextView.this).Vm((String)localObject);
          }
          GMTrace.o(3328062783488L, 24796);
          return;
        }
        if (MMAutoSwitchEditTextView.e(MMAutoSwitchEditTextView.this) != null) {
          MMAutoSwitchEditTextView.e(MMAutoSwitchEditTextView.this).bYq();
        }
        if ((MMAutoSwitchEditTextView.a(MMAutoSwitchEditTextView.this) != null) && (paramInt < MMAutoSwitchEditTextView.a(MMAutoSwitchEditTextView.this).size() - 1))
        {
          localObject = (MMAutoSwitchEditText)MMAutoSwitchEditTextView.a(MMAutoSwitchEditTextView.this).get(paramInt + 1);
          if (localObject != null) {
            ((MMAutoSwitchEditText)localObject).requestFocus();
          }
        }
        GMTrace.o(3328062783488L, 24796);
        return;
      }
    }
    
    public final void bZE()
    {
      GMTrace.i(3328331218944L, 24798);
      String str = "";
      Iterator localIterator = MMAutoSwitchEditTextView.a(MMAutoSwitchEditTextView.this).iterator();
      if (localIterator.hasNext())
      {
        MMAutoSwitchEditText localMMAutoSwitchEditText = (MMAutoSwitchEditText)localIterator.next();
        if (bg.nm(localMMAutoSwitchEditText.getText().toString().trim())) {
          break label121;
        }
        str = str + localMMAutoSwitchEditText.getText().toString().trim();
      }
      label121:
      for (;;)
      {
        break;
        if (MMAutoSwitchEditTextView.e(MMAutoSwitchEditTextView.this) != null) {
          MMAutoSwitchEditTextView.e(MMAutoSwitchEditTextView.this).bYq();
        }
        GMTrace.o(3328331218944L, 24798);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMAutoSwitchEditTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */