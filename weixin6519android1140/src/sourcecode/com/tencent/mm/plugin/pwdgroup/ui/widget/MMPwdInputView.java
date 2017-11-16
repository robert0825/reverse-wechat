package com.tencent.mm.plugin.pwdgroup.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class MMPwdInputView
  extends LinearLayout
{
  public StringBuilder jSg;
  public int kZz;
  private boolean nQY;
  private ImageView nQZ;
  private ImageView nRa;
  private ImageView nRb;
  private ImageView nRc;
  public a nRd;
  private int nRe;
  
  public MMPwdInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(10696079179776L, 79692);
    GMTrace.o(10696079179776L, 79692);
  }
  
  public MMPwdInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10696213397504L, 79693);
    this.jSg = new StringBuilder();
    this.nQY = false;
    this.nRe = b.nRg;
    paramContext = inflate(getContext(), R.i.cDS, null);
    this.nQZ = ((ImageView)paramContext.findViewById(R.h.bAg));
    this.nRa = ((ImageView)paramContext.findViewById(R.h.second));
    this.nRb = ((ImageView)paramContext.findViewById(R.h.cgZ));
    this.nRc = ((ImageView)paramContext.findViewById(R.h.bBf));
    this.nQZ.setImageResource(R.g.aTY);
    this.nRa.setImageResource(R.g.aTY);
    this.nRb.setImageResource(R.g.aTY);
    this.nRc.setImageResource(R.g.aTY);
    addView(paramContext);
    GMTrace.o(10696213397504L, 79693);
  }
  
  private static void m(ImageView paramImageView, String paramString)
  {
    GMTrace.i(10696481832960L, 79695);
    if (paramImageView == null)
    {
      GMTrace.o(10696481832960L, 79695);
      return;
    }
    if (paramString.equals("0"))
    {
      paramImageView.setImageResource(R.g.aTO);
      GMTrace.o(10696481832960L, 79695);
      return;
    }
    if (paramString.equals("1"))
    {
      paramImageView.setImageResource(R.g.aTP);
      GMTrace.o(10696481832960L, 79695);
      return;
    }
    if (paramString.equals("2"))
    {
      paramImageView.setImageResource(R.g.aTQ);
      GMTrace.o(10696481832960L, 79695);
      return;
    }
    if (paramString.equals("3"))
    {
      paramImageView.setImageResource(R.g.aTR);
      GMTrace.o(10696481832960L, 79695);
      return;
    }
    if (paramString.equals("4"))
    {
      paramImageView.setImageResource(R.g.aTS);
      GMTrace.o(10696481832960L, 79695);
      return;
    }
    if (paramString.equals("5"))
    {
      paramImageView.setImageResource(R.g.aTT);
      GMTrace.o(10696481832960L, 79695);
      return;
    }
    if (paramString.equals("6"))
    {
      paramImageView.setImageResource(R.g.aTU);
      GMTrace.o(10696481832960L, 79695);
      return;
    }
    if (paramString.equals("7"))
    {
      paramImageView.setImageResource(R.g.aTV);
      GMTrace.o(10696481832960L, 79695);
      return;
    }
    if (paramString.equals("8"))
    {
      paramImageView.setImageResource(R.g.aTW);
      GMTrace.o(10696481832960L, 79695);
      return;
    }
    if (paramString.equals("9"))
    {
      paramImageView.setImageResource(R.g.aTX);
      GMTrace.o(10696481832960L, 79695);
      return;
    }
    paramImageView.setImageResource(R.g.aTY);
    GMTrace.o(10696481832960L, 79695);
  }
  
  public final void MH()
  {
    GMTrace.i(10696750268416L, 79697);
    if (this.kZz > 0) {
      this.jSg.delete(0, this.kZz);
    }
    aYh();
    aYg();
    GMTrace.o(10696750268416L, 79697);
  }
  
  public final void aYg()
  {
    GMTrace.i(10696347615232L, 79694);
    int i = 0;
    if (i < 4)
    {
      String str;
      if (this.kZz > i)
      {
        str = this.jSg.toString().charAt(i);
        label48:
        switch (i)
        {
        }
      }
      for (;;)
      {
        i += 1;
        break;
        str = "";
        break label48;
        m(this.nQZ, str);
        continue;
        m(this.nRa, str);
        continue;
        m(this.nRb, str);
        continue;
        m(this.nRc, str);
      }
    }
    GMTrace.o(10696347615232L, 79694);
  }
  
  public final void aYh()
  {
    GMTrace.i(10696616050688L, 79696);
    if (this.jSg != null)
    {
      this.kZz = this.jSg.length();
      if (this.kZz < 4) {
        break label83;
      }
    }
    label83:
    for (this.nQY = true;; this.nQY = false)
    {
      if (this.nRd != null) {
        this.nRd.h(this.nQY, this.jSg.toString());
      }
      GMTrace.o(10696616050688L, 79696);
      return;
      this.kZz = 0;
      break;
    }
  }
  
  public final void input(String paramString)
  {
    GMTrace.i(10696884486144L, 79698);
    if ((TextUtils.isEmpty(paramString)) || (this.nQY))
    {
      GMTrace.o(10696884486144L, 79698);
      return;
    }
    this.jSg.append(paramString);
    aYh();
    aYg();
    GMTrace.o(10696884486144L, 79698);
  }
  
  public static abstract interface a
  {
    public abstract void h(boolean paramBoolean, String paramString);
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(10695944962048L, 79691);
      nRf = 1;
      nRg = 2;
      nRh = new int[] { nRf, nRg };
      GMTrace.o(10695944962048L, 79691);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\pwdgroup\ui\widget\MMPwdInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */