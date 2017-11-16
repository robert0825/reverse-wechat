package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.location.model.f;
import com.tencent.mm.pluginsdk.ui.a.b;

public class TrackPoint
  extends LinearLayout
{
  private ImageView gDc;
  public double igo;
  public double igp;
  public double igq;
  public double igr;
  private Context mContext;
  public ImageView mEE;
  public ImageView mEF;
  public View mEG;
  private double mEH;
  private String username;
  public boolean visible;
  
  public TrackPoint(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(9683406422016L, 72147);
    this.mEH = 0.0D;
    this.igo = -1.0D;
    this.igp = -1.0D;
    this.igq = -1.0D;
    this.igr = -1.0D;
    this.visible = true;
    this.mContext = paramContext;
    init();
    GMTrace.o(9683406422016L, 72147);
  }
  
  public TrackPoint(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9683272204288L, 72146);
    this.mEH = 0.0D;
    this.igo = -1.0D;
    this.igp = -1.0D;
    this.igq = -1.0D;
    this.igr = -1.0D;
    this.visible = true;
    this.mContext = paramContext;
    init();
    GMTrace.o(9683272204288L, 72146);
  }
  
  private void init()
  {
    GMTrace.i(9683540639744L, 72148);
    View localView = View.inflate(this.mContext, R.i.cHb, this);
    this.gDc = ((ImageView)localView.findViewById(R.h.cih));
    this.mEE = ((ImageView)localView.findViewById(R.h.cij));
    this.mEF = ((ImageView)localView.findViewById(R.h.cii));
    this.mEF.setVisibility(4);
    this.mEG = localView.findViewById(R.h.cig);
    this.gDc.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(9695888670720L, 72240);
        if (TrackPoint.a(TrackPoint.this).getVisibility() == 0) {
          TrackPoint.a(TrackPoint.this).setVisibility(4);
        }
        for (;;)
        {
          GMTrace.o(9695888670720L, 72240);
          return false;
          TrackPoint.a(TrackPoint.this).setVisibility(0);
        }
      }
    });
    this.mEE.requestFocus();
    GMTrace.o(9683540639744L, 72148);
  }
  
  public final void By(String paramString)
  {
    GMTrace.i(9683943292928L, 72151);
    this.username = paramString;
    this.mEE.setTag(paramString);
    a.b.n(this.gDc, paramString);
    this.gDc.setTag(paramString);
    GMTrace.o(9683943292928L, 72151);
  }
  
  public final void aLI()
  {
    GMTrace.i(9684077510656L, 72152);
    this.visible = false;
    this.mEG.setVisibility(4);
    GMTrace.o(9684077510656L, 72152);
  }
  
  public final void aLJ()
  {
    GMTrace.i(9684211728384L, 72153);
    this.visible = true;
    this.mEG.setVisibility(0);
    GMTrace.o(9684211728384L, 72153);
  }
  
  public final void aLK()
  {
    GMTrace.i(9684480163840L, 72155);
    this.mEF.setVisibility(4);
    GMTrace.o(9684480163840L, 72155);
  }
  
  public final void b(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(9683674857472L, 72149);
    this.mEE.setOnClickListener(paramOnClickListener);
    GMTrace.o(9683674857472L, 72149);
  }
  
  public final void c(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(9683809075200L, 72150);
    this.gDc.setOnClickListener(paramOnClickListener);
    GMTrace.o(9683809075200L, 72150);
  }
  
  public final void m(double paramDouble)
  {
    GMTrace.i(9684345946112L, 72154);
    float f1 = (float)this.mEH;
    float f2 = (float)paramDouble;
    float f3 = f.u(f1, f2);
    RotateAnimation localRotateAnimation = new RotateAnimation(f.v(f1, f2), f3, 1, 0.5F, 1, 0.5F);
    localRotateAnimation.setDuration(200L);
    localRotateAnimation.setFillAfter(true);
    this.mEE.startAnimation(localRotateAnimation);
    this.mEH = paramDouble;
    GMTrace.o(9684345946112L, 72154);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\impl\TrackPoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */