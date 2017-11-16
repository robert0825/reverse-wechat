package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.a.a;
import com.tencent.mm.plugin.facedetect.model.h;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;

public class FaceProcessHintView
  extends LinearLayout
{
  private h kZI;
  private int kZJ;
  private Animation kZK;
  
  public FaceProcessHintView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5932423577600L, 44200);
    GMTrace.o(5932423577600L, 44200);
  }
  
  public FaceProcessHintView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5932557795328L, 44201);
    this.kZI = null;
    this.kZJ = 0;
    this.kZK = null;
    setOrientation(0);
    setMinimumHeight(BackwardSupportUtil.b.a(getContext(), 36.0F));
    this.kZK = AnimationUtils.loadAnimation(paramContext, a.a.kPc);
    this.kZK.setInterpolator(new AccelerateDecelerateInterpolator());
    GMTrace.o(5932557795328L, 44201);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\facedetect\views\FaceProcessHintView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */