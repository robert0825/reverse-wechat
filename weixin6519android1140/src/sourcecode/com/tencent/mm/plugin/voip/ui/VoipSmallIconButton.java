package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.n;

public class VoipSmallIconButton
  extends FrameLayout
{
  private TextView jU;
  private ImageView kve;
  private Drawable qLE;
  private Drawable qLF;
  private View.OnTouchListener qLG;
  
  public VoipSmallIconButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5348710678528L, 39851);
    this.qLE = null;
    this.qLF = null;
    this.qLG = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(5355287347200L, 39900);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(5355287347200L, 39900);
          return false;
          VoipSmallIconButton.b(VoipSmallIconButton.this).setImageDrawable(VoipSmallIconButton.a(VoipSmallIconButton.this));
          VoipSmallIconButton.c(VoipSmallIconButton.this).setTextColor(-855638017);
          continue;
          VoipSmallIconButton.b(VoipSmallIconButton.this).setImageDrawable(VoipSmallIconButton.d(VoipSmallIconButton.this));
          VoipSmallIconButton.c(VoipSmallIconButton.this).setTextColor(-1);
        }
      }
    };
    LayoutInflater.from(paramContext).inflate(R.i.cAH, this);
    paramContext = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, R.n.eoc, 0, 0);
    try
    {
      this.qLE = paramContext.getDrawable(R.n.eog);
      this.qLF = paramContext.getDrawable(R.n.eoh);
      paramAttributeSet = paramContext.getString(R.n.eoi);
      int i = paramContext.getResourceId(R.n.eoi, -1);
      paramContext.recycle();
      this.kve = ((ImageView)findViewById(R.h.cfl));
      this.kve.setImageDrawable(this.qLE);
      this.kve.setOnTouchListener(this.qLG);
      this.kve.setContentDescription(paramAttributeSet);
      this.jU = ((TextView)findViewById(R.h.cfn));
      if (i != -1) {
        this.jU.setText(getContext().getString(i));
      }
      GMTrace.o(5348710678528L, 39851);
      return;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    GMTrace.i(5348844896256L, 39852);
    this.kve.setEnabled(paramBoolean);
    this.jU.setEnabled(paramBoolean);
    GMTrace.o(5348844896256L, 39852);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(5348576460800L, 39850);
    this.kve.setOnClickListener(paramOnClickListener);
    GMTrace.o(5348576460800L, 39850);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\ui\VoipSmallIconButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */