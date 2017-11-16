package android.support.b.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

@TargetApi(21)
public final class b
  extends e
  implements Animatable
{
  private a lh;
  private ArgbEvaluator li = null;
  private final Drawable.Callback lj = new Drawable.Callback()
  {
    public final void invalidateDrawable(Drawable paramAnonymousDrawable)
    {
      b.this.invalidateSelf();
    }
    
    public final void scheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable, long paramAnonymousLong)
    {
      b.this.scheduleSelf(paramAnonymousRunnable, paramAnonymousLong);
    }
    
    public final void unscheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable)
    {
      b.this.unscheduleSelf(paramAnonymousRunnable);
    }
  };
  private Context mContext;
  
  private b()
  {
    this(null, (byte)0);
  }
  
  private b(Context paramContext)
  {
    this(paramContext, (byte)0);
  }
  
  private b(Context paramContext, byte paramByte)
  {
    this.mContext = paramContext;
    this.lh = new a(null, this.lj, null);
  }
  
  public static b a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    paramContext = new b(paramContext);
    paramContext.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return paramContext;
  }
  
  private void b(Animator paramAnimator)
  {
    Object localObject;
    if ((paramAnimator instanceof AnimatorSet))
    {
      localObject = ((AnimatorSet)paramAnimator).getChildAnimations();
      if (localObject != null)
      {
        int i = 0;
        while (i < ((List)localObject).size())
        {
          b((Animator)((List)localObject).get(i));
          i += 1;
        }
      }
    }
    if ((paramAnimator instanceof ObjectAnimator))
    {
      paramAnimator = (ObjectAnimator)paramAnimator;
      localObject = paramAnimator.getPropertyName();
      if (("fillColor".equals(localObject)) || ("strokeColor".equals(localObject)))
      {
        if (this.li == null) {
          this.li = new ArgbEvaluator();
        }
        paramAnimator.setEvaluator(this.li);
      }
    }
  }
  
  private boolean isStarted()
  {
    ArrayList localArrayList = this.lh.ln;
    if (localArrayList == null) {
      return false;
    }
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      if (((Animator)localArrayList.get(i)).isRunning()) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public final void applyTheme(Resources.Theme paramTheme)
  {
    if (this.lu != null) {
      android.support.v4.b.a.a.a(this.lu, paramTheme);
    }
  }
  
  public final boolean canApplyTheme()
  {
    if (this.lu != null) {
      return android.support.v4.b.a.a.e(this.lu);
    }
    return false;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (this.lu != null) {
      this.lu.draw(paramCanvas);
    }
    do
    {
      return;
      this.lh.lm.draw(paramCanvas);
    } while (!isStarted());
    invalidateSelf();
  }
  
  public final int getAlpha()
  {
    if (this.lu != null) {
      return android.support.v4.b.a.a.d(this.lu);
    }
    return this.lh.lm.getAlpha();
  }
  
  public final int getChangingConfigurations()
  {
    if (this.lu != null) {
      return this.lu.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | this.lh.ll;
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if (this.lu != null) {
      return new b(this.lu.getConstantState());
    }
    return null;
  }
  
  public final int getIntrinsicHeight()
  {
    if (this.lu != null) {
      return this.lu.getIntrinsicHeight();
    }
    return this.lh.lm.getIntrinsicHeight();
  }
  
  public final int getIntrinsicWidth()
  {
    if (this.lu != null) {
      return this.lu.getIntrinsicWidth();
    }
    return this.lh.lm.getIntrinsicWidth();
  }
  
  public final int getOpacity()
  {
    if (this.lu != null) {
      return this.lu.getOpacity();
    }
    return this.lh.lm.getOpacity();
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (this.lu != null)
    {
      android.support.v4.b.a.a.a(this.lu, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    int i = paramXmlPullParser.getEventType();
    label28:
    Object localObject1;
    label77:
    Object localObject2;
    if (i != 1) {
      if (i == 2)
      {
        localObject1 = paramXmlPullParser.getName();
        if (!"animated-vector".equals(localObject1)) {
          break label177;
        }
        localObject1 = a.lf;
        if (paramTheme != null) {
          break label162;
        }
        localObject1 = paramResources.obtainAttributes(paramAttributeSet, (int[])localObject1);
        i = ((TypedArray)localObject1).getResourceId(0, 0);
        if (i != 0)
        {
          localObject2 = f.a(paramResources, i, paramTheme);
          ((f)localObject2).lA = false;
          ((f)localObject2).setCallback(this.lj);
          if (this.lh.lm != null) {
            this.lh.lm.setCallback(null);
          }
          this.lh.lm = ((f)localObject2);
        }
        ((TypedArray)localObject1).recycle();
      }
    }
    for (;;)
    {
      i = paramXmlPullParser.next();
      break label28;
      break;
      label162:
      localObject1 = paramTheme.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, 0, 0);
      break label77;
      label177:
      if ("target".equals(localObject1))
      {
        localObject1 = paramResources.obtainAttributes(paramAttributeSet, a.lg);
        localObject2 = ((TypedArray)localObject1).getString(0);
        i = ((TypedArray)localObject1).getResourceId(1, 0);
        if (i != 0)
        {
          if (this.mContext == null) {
            break label352;
          }
          Animator localAnimator = AnimatorInflater.loadAnimator(this.mContext, i);
          localAnimator.setTarget(this.lh.lm.lw.mu.mt.get(localObject2));
          if (Build.VERSION.SDK_INT < 21) {
            b(localAnimator);
          }
          if (this.lh.ln == null)
          {
            this.lh.ln = new ArrayList();
            this.lh.lo = new android.support.v4.e.a();
          }
          this.lh.ln.add(localAnimator);
          this.lh.lo.put(localAnimator, localObject2);
        }
        ((TypedArray)localObject1).recycle();
      }
    }
    label352:
    throw new IllegalStateException("Context can't be null when inflating animators");
  }
  
  public final boolean isRunning()
  {
    if (this.lu != null) {
      return ((AnimatedVectorDrawable)this.lu).isRunning();
    }
    ArrayList localArrayList = this.lh.ln;
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      if (((Animator)localArrayList.get(i)).isRunning()) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public final boolean isStateful()
  {
    if (this.lu != null) {
      return this.lu.isStateful();
    }
    return this.lh.lm.isStateful();
  }
  
  public final Drawable mutate()
  {
    if (this.lu != null)
    {
      this.lu.mutate();
      return this;
    }
    throw new IllegalStateException("Mutate() is not supported for older platform");
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    if (this.lu != null)
    {
      this.lu.setBounds(paramRect);
      return;
    }
    this.lh.lm.setBounds(paramRect);
  }
  
  protected final boolean onLevelChange(int paramInt)
  {
    if (this.lu != null) {
      return this.lu.setLevel(paramInt);
    }
    return this.lh.lm.setLevel(paramInt);
  }
  
  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.lu != null) {
      return this.lu.setState(paramArrayOfInt);
    }
    return this.lh.lm.setState(paramArrayOfInt);
  }
  
  public final void setAlpha(int paramInt)
  {
    if (this.lu != null)
    {
      this.lu.setAlpha(paramInt);
      return;
    }
    this.lh.lm.setAlpha(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.lu != null)
    {
      this.lu.setColorFilter(paramColorFilter);
      return;
    }
    this.lh.lm.setColorFilter(paramColorFilter);
  }
  
  public final void setTint(int paramInt)
  {
    if (this.lu != null)
    {
      android.support.v4.b.a.a.a(this.lu, paramInt);
      return;
    }
    this.lh.lm.setTint(paramInt);
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    if (this.lu != null)
    {
      android.support.v4.b.a.a.a(this.lu, paramColorStateList);
      return;
    }
    this.lh.lm.setTintList(paramColorStateList);
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    if (this.lu != null)
    {
      android.support.v4.b.a.a.a(this.lu, paramMode);
      return;
    }
    this.lh.lm.setTintMode(paramMode);
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.lu != null) {
      return this.lu.setVisible(paramBoolean1, paramBoolean2);
    }
    this.lh.lm.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public final void start()
  {
    if (this.lu != null) {
      ((AnimatedVectorDrawable)this.lu).start();
    }
    while (isStarted()) {
      return;
    }
    ArrayList localArrayList = this.lh.ln;
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      ((Animator)localArrayList.get(i)).start();
      i += 1;
    }
    invalidateSelf();
  }
  
  public final void stop()
  {
    if (this.lu != null) {
      ((AnimatedVectorDrawable)this.lu).stop();
    }
    for (;;)
    {
      return;
      ArrayList localArrayList = this.lh.ln;
      int j = localArrayList.size();
      int i = 0;
      while (i < j)
      {
        ((Animator)localArrayList.get(i)).end();
        i += 1;
      }
    }
  }
  
  private static final class a
    extends Drawable.ConstantState
  {
    int ll;
    f lm;
    ArrayList<Animator> ln;
    android.support.v4.e.a<Animator, String> lo;
    
    public a(a parama, Drawable.Callback paramCallback, Resources paramResources) {}
    
    public final int getChangingConfigurations()
    {
      return this.ll;
    }
    
    public final Drawable newDrawable()
    {
      throw new IllegalStateException("No constant state support for SDK < 23.");
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      throw new IllegalStateException("No constant state support for SDK < 23.");
    }
  }
  
  private static final class b
    extends Drawable.ConstantState
  {
    private final Drawable.ConstantState lp;
    
    public b(Drawable.ConstantState paramConstantState)
    {
      this.lp = paramConstantState;
    }
    
    public final boolean canApplyTheme()
    {
      return this.lp.canApplyTheme();
    }
    
    public final int getChangingConfigurations()
    {
      return this.lp.getChangingConfigurations();
    }
    
    public final Drawable newDrawable()
    {
      b localb = new b((byte)0);
      localb.lu = this.lp.newDrawable();
      localb.lu.setCallback(b.a(localb));
      return localb;
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      b localb = new b((byte)0);
      localb.lu = this.lp.newDrawable(paramResources);
      localb.lu.setCallback(b.a(localb));
      return localb;
    }
    
    public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      b localb = new b((byte)0);
      localb.lu = this.lp.newDrawable(paramResources, paramTheme);
      localb.lu.setCallback(b.a(localb));
      return localb;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */