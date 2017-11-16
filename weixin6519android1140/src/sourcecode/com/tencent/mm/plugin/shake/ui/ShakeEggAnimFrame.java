package com.tencent.mm.plugin.shake.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.b;
import com.tencent.mm.bt.c;
import com.tencent.mm.bt.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public class ShakeEggAnimFrame
  extends FrameLayout
{
  List<View> oOR;
  int oOS;
  int size;
  
  public ShakeEggAnimFrame(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6543114240000L, 48750);
    this.oOR = new ArrayList();
    this.size = 0;
    this.oOS = 0;
    GMTrace.o(6543114240000L, 48750);
  }
  
  private int getSize()
  {
    GMTrace.i(6543516893184L, 48753);
    if (this.size == 0)
    {
      i = (int)(new TextView(getContext()).getTextSize() * 1.2D);
      GMTrace.o(6543516893184L, 48753);
      return i;
    }
    int i = this.size;
    GMTrace.o(6543516893184L, 48753);
    return i;
  }
  
  static float q(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(6543382675456L, 48752);
    float f = (float)Math.random();
    GMTrace.o(6543382675456L, 48752);
    return f * (paramFloat2 - paramFloat1) + paramFloat1;
  }
  
  public final void J(Activity paramActivity)
  {
    GMTrace.i(6543248457728L, 48751);
    Object localObject1 = this.oOR.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (View)((Iterator)localObject1).next();
      ((View)localObject2).clearAnimation();
      removeView((View)localObject2);
    }
    localObject1 = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
    setVisibility(0);
    int i = 0;
    while (i < 30)
    {
      paramActivity = new b(((DisplayMetrics)localObject1).widthPixels, ((DisplayMetrics)localObject1).heightPixels);
      g.bRE();
      localObject2 = b.bRv();
      localObject2 = ((b)localObject2).a((c)((b)localObject2).vnu.get(107));
      ((Drawable)localObject2).setBounds(0, 0, getSize(), getSize());
      Object localObject3 = new ImageSpan((Drawable)localObject2, 1);
      localObject2 = new SpannableString("  ");
      ((SpannableString)localObject2).setSpan(localObject3, 0, 1, 33);
      localObject3 = new TextView(getContext());
      ((TextView)localObject3).setSingleLine();
      ((TextView)localObject3).setText((CharSequence)localObject2);
      ((TextView)localObject3).setAnimation(paramActivity);
      ((TextView)localObject3).setTag(paramActivity);
      addView((View)localObject3);
      ((a)paramActivity).targetView = ((View)localObject3);
      this.oOR.add(localObject3);
      i += 1;
    }
    GMTrace.o(6543248457728L, 48751);
  }
  
  abstract class a
    extends Animation
  {
    protected int duration;
    View targetView;
    
    a()
    {
      GMTrace.i(6541503627264L, 48738);
      this.duration = 100;
      GMTrace.o(6541503627264L, 48738);
    }
  }
  
  final class b
    extends ShakeEggAnimFrame.a
  {
    private int jpi;
    private int jpj;
    private float oOV;
    private float oOW;
    private float oOX;
    private float oOY;
    private float oOZ;
    private float oPa;
    private float oPb;
    private float oPc;
    private float oPd;
    private float oPe;
    
    public b(int paramInt1, int paramInt2)
    {
      super();
      GMTrace.i(6567273431040L, 48930);
      this.oOZ = 0.01F;
      this.oPa = 0.02F;
      this.jpi = paramInt1;
      this.jpj = paramInt2;
      this.oOV = ShakeEggAnimFrame.q(0.1F, 0.9F);
      this.oOW = this.oOV;
      this.oOY = ShakeEggAnimFrame.q(-0.3F, -0.1F);
      restart();
      GMTrace.o(6567273431040L, 48930);
    }
    
    private void restart()
    {
      GMTrace.i(6567541866496L, 48932);
      if (this.oOY > 0.0F) {
        this.oPa += this.oOZ;
      }
      this.oOX = this.oOY;
      this.oOY += this.oPa;
      if (this.oOX > 1.1F) {
        if (this.targetView == null) {
          break label155;
        }
      }
      label155:
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        this.targetView.post(new ShakeEggAnimFrame.a.1(this));
        this.oPb = (this.oOV * this.jpi);
        this.oPc = (this.oOW * this.jpi);
        this.oPd = (this.oOX * this.jpj);
        this.oPe = (this.oOY * this.jpj);
        GMTrace.o(6567541866496L, 48932);
        return;
      }
    }
    
    protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      GMTrace.i(6567407648768L, 48931);
      float f1 = this.oPb;
      float f2 = this.oPd;
      if (this.oPb != this.oPc) {
        f1 = this.oPb + (this.oPc - this.oPb) * paramFloat;
      }
      if (this.oPd != this.oPe) {
        f2 = this.oPd + (this.oPe - this.oPd) * paramFloat;
      }
      paramTransformation.getMatrix().setTranslate(f1, f2);
      if (paramFloat == 1.0F) {
        restart();
      }
      GMTrace.o(6567407648768L, 48931);
    }
    
    public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(6567676084224L, 48933);
      super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
      setRepeatCount(-1);
      setDuration(this.duration);
      GMTrace.o(6567676084224L, 48933);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\ShakeEggAnimFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */