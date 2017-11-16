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

public class VoipBigIconButton
  extends FrameLayout
{
  private TextView jU;
  private ImageView kve;
  private Drawable qLC;
  private Drawable qLD;
  private Drawable qLE;
  private Drawable qLF;
  private View.OnTouchListener qLG;
  
  public VoipBigIconButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5359313879040L, 39930);
    this.qLC = null;
    this.qLD = null;
    this.qLE = null;
    this.qLF = null;
    this.qLG = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(5358642790400L, 39925);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(5358642790400L, 39925);
          return false;
          VoipBigIconButton.b(VoipBigIconButton.this).setBackgroundDrawable(VoipBigIconButton.a(VoipBigIconButton.this));
          VoipBigIconButton.b(VoipBigIconButton.this).setImageDrawable(VoipBigIconButton.c(VoipBigIconButton.this));
          VoipBigIconButton.d(VoipBigIconButton.this).setTextColor(-855638017);
          continue;
          VoipBigIconButton.b(VoipBigIconButton.this).setBackgroundDrawable(VoipBigIconButton.e(VoipBigIconButton.this));
          VoipBigIconButton.b(VoipBigIconButton.this).setImageDrawable(VoipBigIconButton.f(VoipBigIconButton.this));
          VoipBigIconButton.d(VoipBigIconButton.this).setTextColor(-1);
        }
      }
    };
    LayoutInflater.from(paramContext).inflate(R.i.cAG, this);
    paramAttributeSet = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, R.n.eoc, 0, 0);
    for (;;)
    {
      try
      {
        this.qLC = paramAttributeSet.getDrawable(R.n.eod);
        this.qLD = paramAttributeSet.getDrawable(R.n.eoe);
        this.qLE = paramAttributeSet.getDrawable(R.n.eog);
        this.qLF = paramAttributeSet.getDrawable(R.n.eoh);
        int i = paramAttributeSet.getResourceId(R.n.eoi, -1);
        int j = paramAttributeSet.getResourceId(R.n.eoi, 0);
        if (j == 0) {
          break label309;
        }
        paramContext = getContext().getString(j);
        paramAttributeSet.recycle();
        if (this.qLD == null)
        {
          paramAttributeSet = this.qLC;
          this.qLD = paramAttributeSet;
          if (this.qLF != null) {
            break label301;
          }
          paramAttributeSet = this.qLE;
          this.qLF = paramAttributeSet;
          this.kve = ((ImageView)findViewById(R.h.bgv));
          this.kve.setBackgroundDrawable(this.qLC);
          this.kve.setImageDrawable(this.qLE);
          this.kve.setOnTouchListener(this.qLG);
          this.kve.setContentDescription(paramContext);
          this.jU = ((TextView)findViewById(R.h.bgy));
          if (i != -1) {
            this.jU.setText(getContext().getString(i));
          }
          GMTrace.o(5359313879040L, 39930);
          return;
        }
      }
      finally
      {
        paramAttributeSet.recycle();
      }
      paramAttributeSet = this.qLD;
      continue;
      label301:
      paramAttributeSet = this.qLF;
      continue;
      label309:
      paramContext = null;
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    GMTrace.i(5359448096768L, 39931);
    this.kve.setEnabled(paramBoolean);
    this.jU.setEnabled(paramBoolean);
    GMTrace.o(5359448096768L, 39931);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(5359582314496L, 39932);
    this.kve.setOnClickListener(paramOnClickListener);
    GMTrace.o(5359582314496L, 39932);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\ui\VoipBigIconButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */