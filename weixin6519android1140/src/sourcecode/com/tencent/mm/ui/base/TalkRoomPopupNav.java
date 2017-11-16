package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.a;

public class TalkRoomPopupNav
  extends LinearLayout
{
  public View lkF;
  public LinearLayout vNs;
  public a wiL;
  public LinearLayout wiM;
  private LinearLayout wiN;
  private ImageView wiO;
  public ImageView wiP;
  public ScaleAnimation wiQ;
  public Animation wiR;
  public int wiS;
  public int wiT;
  private ScaleAnimation wiU;
  private Animation wiV;
  public AlphaAnimation wiW;
  public AlphaAnimation wiX;
  
  public TalkRoomPopupNav(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3292360867840L, 24530);
    this.wiS = 0;
    this.wiT = 0;
    MP();
    GMTrace.o(3292360867840L, 24530);
  }
  
  @TargetApi(11)
  public TalkRoomPopupNav(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3292226650112L, 24529);
    this.wiS = 0;
    this.wiT = 0;
    MP();
    GMTrace.o(3292226650112L, 24529);
  }
  
  private void MP()
  {
    GMTrace.i(3293031956480L, 24535);
    inflate(getContext(), R.i.cgt, this);
    this.vNs = ((LinearLayout)findViewById(R.h.bPw));
    this.wiM = ((LinearLayout)findViewById(R.h.bus));
    this.wiN = ((LinearLayout)findViewById(R.h.bun));
    this.lkF = findViewById(R.h.bPs);
    this.wiO = ((ImageView)findViewById(R.h.cgu));
    this.wiP = ((ImageView)findViewById(R.h.cgv));
    this.wiP.setVisibility(8);
    this.vNs.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(3200555941888L, 23846);
        if (TalkRoomPopupNav.a(TalkRoomPopupNav.this) != null) {
          TalkRoomPopupNav.a(TalkRoomPopupNav.this).caT();
        }
        GMTrace.o(3200555941888L, 23846);
      }
    });
    ((Button)findViewById(R.h.biC)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(3189684305920L, 23765);
        TalkRoomPopupNav.b(TalkRoomPopupNav.this);
        GMTrace.o(3189684305920L, 23765);
      }
    });
    ((Button)findViewById(R.h.biD)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(3365106876416L, 25072);
        TalkRoomPopupNav.b(TalkRoomPopupNav.this);
        if (TalkRoomPopupNav.a(TalkRoomPopupNav.this) != null) {
          TalkRoomPopupNav.a(TalkRoomPopupNav.this).caU();
        }
        GMTrace.o(3365106876416L, 25072);
      }
    });
    this.wiS = this.lkF.getLayoutParams().height;
    this.wiT = this.wiM.getLayoutParams().height;
    GMTrace.o(3293031956480L, 24535);
  }
  
  public final void Ch(int paramInt)
  {
    GMTrace.i(3292629303296L, 24532);
    if (this.lkF != null) {
      this.lkF.setBackgroundResource(paramInt);
    }
    GMTrace.o(3292629303296L, 24532);
  }
  
  public final void Ci(int paramInt)
  {
    GMTrace.i(3292763521024L, 24533);
    if (this.wiO != null) {
      this.wiO.setImageResource(paramInt);
    }
    GMTrace.o(3292763521024L, 24533);
  }
  
  public final void Cj(int paramInt)
  {
    GMTrace.i(3292897738752L, 24534);
    if (paramInt < 0)
    {
      if (this.wiP != null) {
        this.wiP.setVisibility(8);
      }
      GMTrace.o(3292897738752L, 24534);
      return;
    }
    if (this.wiP != null)
    {
      this.wiP.setImageResource(paramInt);
      this.wiP.setVisibility(0);
    }
    GMTrace.o(3292897738752L, 24534);
  }
  
  public final void VF(String paramString)
  {
    GMTrace.i(3292495085568L, 24531);
    ((TextView)findViewById(R.h.ciO)).setText(paramString);
    GMTrace.o(3292495085568L, 24531);
  }
  
  public final void stop()
  {
    GMTrace.i(3293166174208L, 24536);
    if ((this.wiW != null) && (this.wiX != null))
    {
      BackwardSupportUtil.a.c(this.wiP, this.wiW);
      BackwardSupportUtil.a.c(this.wiP, this.wiX);
      this.wiP.clearAnimation();
      this.wiW = null;
      this.wiX = null;
    }
    GMTrace.o(3293166174208L, 24536);
  }
  
  public static abstract interface a
  {
    public abstract void caT();
    
    public abstract void caU();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\TalkRoomPopupNav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */