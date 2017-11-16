package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.e.c;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class m
  extends l
  implements android.support.v4.view.k
{
  static boolean DEBUG;
  static Field pJ = null;
  static final Interpolator pS = new DecelerateInterpolator(2.5F);
  static final Interpolator pT = new DecelerateInterpolator(1.5F);
  static final Interpolator pU = new AccelerateInterpolator(2.5F);
  static final Interpolator pV = new AccelerateInterpolator(1.5F);
  static final boolean pu;
  k oy;
  ArrayList<Integer> pA;
  ArrayList<d> pB;
  ArrayList<Fragment> pC;
  ArrayList<d> pD;
  ArrayList<Integer> pE;
  ArrayList<Object> pF;
  int pG = 0;
  i pH;
  Fragment pI;
  boolean pK;
  boolean pL;
  boolean pM;
  String pN;
  boolean pO;
  Bundle pP = null;
  SparseArray<Parcelable> pQ = null;
  Runnable pR = new Runnable()
  {
    public final void run()
    {
      m.this.execPendingActions();
    }
  };
  ArrayList<Runnable> pv;
  Runnable[] pw;
  boolean px;
  ArrayList<Fragment> py;
  ArrayList<Fragment> pz;
  
  static
  {
    boolean bool = false;
    DEBUG = false;
    if (Build.VERSION.SDK_INT >= 11) {
      bool = true;
    }
    pu = bool;
  }
  
  public static int H(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 4097: 
      return 8194;
    case 8194: 
      return 4097;
    }
    return 4099;
  }
  
  private static Animation a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    Object localObject = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    ((ScaleAnimation)localObject).setInterpolator(pS);
    ((ScaleAnimation)localObject).setDuration(220L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new AlphaAnimation(paramFloat3, paramFloat4);
    ((AlphaAnimation)localObject).setInterpolator(pT);
    ((AlphaAnimation)localObject).setDuration(220L);
    localAnimationSet.addAnimation((Animation)localObject);
    return localAnimationSet;
  }
  
  private Animation a(Fragment paramFragment, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i = paramFragment.oJ;
    Fragment.aL();
    if (paramFragment.oJ != 0)
    {
      paramFragment = AnimationUtils.loadAnimation(this.oy.mContext, paramFragment.oJ);
      if (paramFragment != null) {
        return paramFragment;
      }
    }
    if (paramInt1 == 0) {
      return null;
    }
    i = -1;
    switch (paramInt1)
    {
    default: 
      paramInt1 = i;
    }
    while (paramInt1 < 0)
    {
      return null;
      if (paramBoolean)
      {
        paramInt1 = 1;
      }
      else
      {
        paramInt1 = 2;
        continue;
        if (paramBoolean)
        {
          paramInt1 = 3;
        }
        else
        {
          paramInt1 = 4;
          continue;
          if (paramBoolean) {
            paramInt1 = 5;
          } else {
            paramInt1 = 6;
          }
        }
      }
    }
    switch (paramInt1)
    {
    default: 
      paramInt1 = paramInt2;
      if (paramInt2 == 0)
      {
        paramInt1 = paramInt2;
        if (this.oy.onHasWindowAnimations()) {
          paramInt1 = this.oy.onGetWindowAnimations();
        }
      }
      if (paramInt1 == 0) {
        return null;
      }
      break;
    case 1: 
      return a(1.125F, 1.0F, 0.0F, 1.0F);
    case 2: 
      return a(1.0F, 0.975F, 1.0F, 0.0F);
    case 3: 
      return a(0.975F, 1.0F, 0.0F, 1.0F);
    case 4: 
      return a(1.0F, 1.075F, 1.0F, 0.0F);
    case 5: 
      return f(0.0F, 1.0F);
    case 6: 
      return f(1.0F, 0.0F);
    }
    return null;
  }
  
  /* Error */
  private void a(int paramInt, d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 198	android/support/v4/app/m:pD	Ljava/util/ArrayList;
    //   6: ifnonnull +14 -> 20
    //   9: aload_0
    //   10: new 200	java/util/ArrayList
    //   13: dup
    //   14: invokespecial 201	java/util/ArrayList:<init>	()V
    //   17: putfield 198	android/support/v4/app/m:pD	Ljava/util/ArrayList;
    //   20: aload_0
    //   21: getfield 198	android/support/v4/app/m:pD	Ljava/util/ArrayList;
    //   24: invokevirtual 204	java/util/ArrayList:size	()I
    //   27: istore 4
    //   29: iload 4
    //   31: istore_3
    //   32: iload_1
    //   33: iload 4
    //   35: if_icmpge +45 -> 80
    //   38: getstatic 77	android/support/v4/app/m:DEBUG	Z
    //   41: ifeq +26 -> 67
    //   44: new 206	java/lang/StringBuilder
    //   47: dup
    //   48: ldc -48
    //   50: invokespecial 211	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   53: iload_1
    //   54: invokevirtual 215	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   57: ldc -39
    //   59: invokevirtual 220	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: aload_2
    //   63: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: aload_0
    //   68: getfield 198	android/support/v4/app/m:pD	Ljava/util/ArrayList;
    //   71: iload_1
    //   72: aload_2
    //   73: invokevirtual 227	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   76: pop
    //   77: aload_0
    //   78: monitorexit
    //   79: return
    //   80: iload_3
    //   81: iload_1
    //   82: if_icmpge +55 -> 137
    //   85: aload_0
    //   86: getfield 198	android/support/v4/app/m:pD	Ljava/util/ArrayList;
    //   89: aconst_null
    //   90: invokevirtual 231	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   93: pop
    //   94: aload_0
    //   95: getfield 233	android/support/v4/app/m:pE	Ljava/util/ArrayList;
    //   98: ifnonnull +14 -> 112
    //   101: aload_0
    //   102: new 200	java/util/ArrayList
    //   105: dup
    //   106: invokespecial 201	java/util/ArrayList:<init>	()V
    //   109: putfield 233	android/support/v4/app/m:pE	Ljava/util/ArrayList;
    //   112: getstatic 77	android/support/v4/app/m:DEBUG	Z
    //   115: ifeq +3 -> 118
    //   118: aload_0
    //   119: getfield 233	android/support/v4/app/m:pE	Ljava/util/ArrayList;
    //   122: iload_3
    //   123: invokestatic 239	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   126: invokevirtual 231	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   129: pop
    //   130: iload_3
    //   131: iconst_1
    //   132: iadd
    //   133: istore_3
    //   134: goto -54 -> 80
    //   137: getstatic 77	android/support/v4/app/m:DEBUG	Z
    //   140: ifeq +26 -> 166
    //   143: new 206	java/lang/StringBuilder
    //   146: dup
    //   147: ldc -15
    //   149: invokespecial 211	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   152: iload_1
    //   153: invokevirtual 215	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   156: ldc -13
    //   158: invokevirtual 220	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: aload_2
    //   162: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload_0
    //   167: getfield 198	android/support/v4/app/m:pD	Ljava/util/ArrayList;
    //   170: aload_2
    //   171: invokevirtual 231	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   174: pop
    //   175: goto -98 -> 77
    //   178: astore_2
    //   179: aload_0
    //   180: monitorexit
    //   181: aload_2
    //   182: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	183	0	this	m
    //   0	183	1	paramInt	int
    //   0	183	2	paramd	d
    //   31	103	3	i	int
    //   27	9	4	j	int
    // Exception table:
    //   from	to	target	type
    //   2	20	178	finally
    //   20	29	178	finally
    //   38	67	178	finally
    //   67	77	178	finally
    //   77	79	178	finally
    //   85	112	178	finally
    //   112	118	178	finally
    //   118	130	178	finally
    //   137	166	178	finally
    //   166	175	178	finally
    //   179	181	178	finally
  }
  
  private void a(RuntimeException paramRuntimeException)
  {
    paramRuntimeException.getMessage();
    PrintWriter localPrintWriter = new PrintWriter(new android.support.v4.e.d("FragmentManager"));
    if (this.oy != null) {}
    try
    {
      this.oy.a("  ", localPrintWriter, new String[0]);
      for (;;)
      {
        throw paramRuntimeException;
        try
        {
          dump("  ", null, localPrintWriter, new String[0]);
        }
        catch (Exception localException1) {}
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  static boolean a(View paramView, Animation paramAnimation)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i;
    if (Build.VERSION.SDK_INT >= 19)
    {
      bool1 = bool2;
      if (z.I(paramView) == 0)
      {
        bool1 = bool2;
        if (z.ad(paramView))
        {
          if (!(paramAnimation instanceof AlphaAnimation)) {
            break label54;
          }
          i = 1;
        }
      }
    }
    for (;;)
    {
      bool1 = bool2;
      if (i != 0) {
        bool1 = true;
      }
      return bool1;
      label54:
      if ((paramAnimation instanceof AnimationSet))
      {
        paramView = ((AnimationSet)paramAnimation).getAnimations();
        i = 0;
        for (;;)
        {
          if (i >= paramView.size()) {
            break label106;
          }
          if ((paramView.get(i) instanceof AlphaAnimation))
          {
            i = 1;
            break;
          }
          i += 1;
        }
      }
      label106:
      i = 0;
    }
  }
  
  private void aY()
  {
    if (this.pL) {
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    if (this.pN != null) {
      throw new IllegalStateException("Can not perform this action inside of " + this.pN);
    }
  }
  
  private static void b(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null)) {}
    while (!a(paramView, paramAnimation)) {
      return;
    }
    try
    {
      if (pJ == null)
      {
        localObject1 = Animation.class.getDeclaredField("mListener");
        pJ = (Field)localObject1;
        ((Field)localObject1).setAccessible(true);
      }
      localObject1 = (Animation.AnimationListener)pJ.get(paramAnimation);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Object localObject3 = null;
      }
    }
    paramAnimation.setAnimationListener(new a(paramView, paramAnimation, (Animation.AnimationListener)localObject1));
  }
  
  private static Animation f(float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat1, paramFloat2);
    localAlphaAnimation.setInterpolator(pT);
    localAlphaAnimation.setDuration(220L);
    return localAlphaAnimation;
  }
  
  private void g(Fragment paramFragment)
  {
    a(paramFragment, this.pG, 0, 0, false);
  }
  
  private void i(Fragment paramFragment)
  {
    if (paramFragment.oL == null) {
      return;
    }
    if (this.pQ == null) {
      this.pQ = new SparseArray();
    }
    for (;;)
    {
      paramFragment.oL.saveHierarchyState(this.pQ);
      if (this.pQ.size() <= 0) {
        break;
      }
      paramFragment.oj = this.pQ;
      this.pQ = null;
      return;
      this.pQ.clear();
    }
  }
  
  private Bundle j(Fragment paramFragment)
  {
    if (this.pP == null) {
      this.pP = new Bundle();
    }
    paramFragment.d(this.pP);
    Object localObject2;
    if (!this.pP.isEmpty())
    {
      localObject2 = this.pP;
      this.pP = null;
    }
    for (;;)
    {
      if (paramFragment.mView != null) {
        i(paramFragment);
      }
      Object localObject1 = localObject2;
      if (paramFragment.oj != null)
      {
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new Bundle();
        }
        ((Bundle)localObject1).putSparseParcelableArray("android:view_state", paramFragment.oj);
      }
      localObject2 = localObject1;
      if (!paramFragment.oN)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new Bundle();
        }
        ((Bundle)localObject2).putBoolean("android:user_visible_hint", paramFragment.oN);
      }
      return (Bundle)localObject2;
      localObject2 = null;
    }
  }
  
  public final Fragment E(int paramInt)
  {
    int i;
    Object localObject;
    if (this.pz != null)
    {
      i = this.pz.size() - 1;
      while (i >= 0)
      {
        localObject = (Fragment)this.pz.get(i);
        if ((localObject != null) && (((Fragment)localObject).oB == paramInt)) {
          return (Fragment)localObject;
        }
        i -= 1;
      }
    }
    if (this.py != null)
    {
      i = this.py.size() - 1;
      for (;;)
      {
        if (i < 0) {
          break label112;
        }
        Fragment localFragment = (Fragment)this.py.get(i);
        if (localFragment != null)
        {
          localObject = localFragment;
          if (localFragment.oB == paramInt) {
            break;
          }
        }
        i -= 1;
      }
    }
    label112:
    return null;
  }
  
  public final void F(final int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("Bad id: " + paramInt);
    }
    a(new Runnable()
    {
      public final void run()
      {
        m localm = m.this;
        k localk = m.this.oy;
        localm.g(paramInt, this.pX);
      }
    }, false);
  }
  
  final void G(int paramInt)
  {
    a(paramInt, 0, 0, false);
  }
  
  public final int a(d paramd)
  {
    try
    {
      if ((this.pE == null) || (this.pE.size() <= 0))
      {
        if (this.pD == null) {
          this.pD = new ArrayList();
        }
        i = this.pD.size();
        if (DEBUG) {
          new StringBuilder("Setting back stack index ").append(i).append(" to ").append(paramd);
        }
        this.pD.add(paramd);
        return i;
      }
      int i = ((Integer)this.pE.remove(this.pE.size() - 1)).intValue();
      if (DEBUG) {
        new StringBuilder("Adding back stack index ").append(i).append(" with ").append(paramd);
      }
      this.pD.set(i, paramd);
      return i;
    }
    finally {}
  }
  
  final void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((this.oy == null) && (paramInt1 != 0)) {
      throw new IllegalStateException("No host");
    }
    if ((!paramBoolean) && (this.pG == paramInt1)) {}
    do
    {
      return;
      this.pG = paramInt1;
    } while (this.py == null);
    int i = 0;
    boolean bool = false;
    label54:
    if (i < this.py.size())
    {
      Fragment localFragment = (Fragment)this.py.get(i);
      if (localFragment == null) {
        break label169;
      }
      a(localFragment, paramInt1, paramInt2, paramInt3, false);
      if (localFragment.oO == null) {
        break label169;
      }
      bool |= localFragment.oO.bc();
    }
    label169:
    for (;;)
    {
      i += 1;
      break label54;
      if (!bool) {
        aX();
      }
      if ((!this.pK) || (this.oy == null) || (this.pG != 5)) {
        break;
      }
      this.oy.aT();
      this.pK = false;
      return;
    }
  }
  
  public final void a(Bundle paramBundle, String paramString, Fragment paramFragment)
  {
    if (paramFragment.mIndex < 0) {
      a(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    }
    paramBundle.putInt(paramString, paramFragment.mIndex);
  }
  
  public final void a(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG) {
      new StringBuilder("remove: ").append(paramFragment).append(" nesting=").append(paramFragment.ow);
    }
    if (paramFragment.ow > 0)
    {
      i = 1;
      if (i != 0) {
        break label134;
      }
      i = 1;
      label52:
      if ((!paramFragment.mDetached) || (i != 0))
      {
        if (this.pz != null) {
          this.pz.remove(paramFragment);
        }
        if ((paramFragment.oG) && (paramFragment.oH)) {
          this.pK = true;
        }
        paramFragment.or = false;
        paramFragment.os = true;
        if (i == 0) {
          break label140;
        }
      }
    }
    label134:
    label140:
    for (int i = 0;; i = 1)
    {
      a(paramFragment, i, paramInt1, paramInt2, false);
      return;
      i = 0;
      break;
      i = 0;
      break label52;
    }
  }
  
  final void a(final Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i;
    if (paramFragment.or)
    {
      i = paramInt1;
      if (!paramFragment.mDetached) {}
    }
    else
    {
      i = paramInt1;
      if (paramInt1 > 1) {
        i = 1;
      }
    }
    int j = i;
    if (paramFragment.os)
    {
      j = i;
      if (i > paramFragment.mState) {
        j = paramFragment.mState;
      }
    }
    paramInt1 = j;
    if (paramFragment.oM)
    {
      paramInt1 = j;
      if (paramFragment.mState < 4)
      {
        paramInt1 = j;
        if (j > 3) {
          paramInt1 = 3;
        }
      }
    }
    int k;
    label725:
    Object localObject2;
    if (paramFragment.mState < paramInt1)
    {
      if ((paramFragment.ot) && (!paramFragment.ou)) {}
      do
      {
        return;
        if (paramFragment.og != null)
        {
          paramFragment.og = null;
          a(paramFragment, paramFragment.oh, 0, 0, true);
        }
        i = paramInt1;
        k = paramInt1;
        j = paramInt1;
        switch (paramFragment.mState)
        {
        default: 
          i = paramInt1;
        }
      } while (paramFragment.mState == i);
      new StringBuilder("moveToState: Fragment state for ").append(paramFragment).append(" not updated inline; expected state ").append(i).append(" found ").append(paramFragment.mState);
      paramFragment.mState = i;
      return;
      if (DEBUG) {
        new StringBuilder("moveto CREATED: ").append(paramFragment);
      }
      j = paramInt1;
      if (paramFragment.oi != null)
      {
        paramFragment.oi.setClassLoader(this.oy.mContext.getClassLoader());
        paramFragment.oj = paramFragment.oi.getSparseParcelableArray("android:view_state");
        paramFragment.om = c(paramFragment.oi, "android:target_state");
        if (paramFragment.om != null) {
          paramFragment.oq = paramFragment.oi.getInt("android:target_req_state", 0);
        }
        paramFragment.oN = paramFragment.oi.getBoolean("android:user_visible_hint", true);
        j = paramInt1;
        if (!paramFragment.oN)
        {
          paramFragment.oM = true;
          j = paramInt1;
          if (paramInt1 > 3) {
            j = 3;
          }
        }
      }
      paramFragment.oy = this.oy;
      paramFragment.oA = this.pI;
      if (this.pI != null) {}
      for (localObject1 = this.pI.oz;; localObject1 = this.oy.ox)
      {
        paramFragment.ox = ((m)localObject1);
        paramFragment.oI = false;
        paramFragment.onAttach(this.oy.mContext);
        if (paramFragment.oI) {
          break;
        }
        throw new al("Fragment " + paramFragment + " did not call through to super.onAttach()");
      }
      localObject1 = paramFragment.oA;
      if (!paramFragment.oF)
      {
        localObject1 = paramFragment.oi;
        if (paramFragment.oz != null) {
          paramFragment.oz.pL = false;
        }
        paramFragment.mState = 1;
        paramFragment.oI = false;
        paramFragment.onCreate((Bundle)localObject1);
        if (!paramFragment.oI) {
          throw new al("Fragment " + paramFragment + " did not call through to super.onCreate()");
        }
        if (localObject1 != null)
        {
          localObject1 = ((Bundle)localObject1).getParcelable("android:support:fragments");
          if (localObject1 != null)
          {
            if (paramFragment.oz == null) {
              paramFragment.aN();
            }
            paramFragment.oz.restoreAllState((Parcelable)localObject1, null);
            paramFragment.oz.dispatchCreate();
          }
        }
      }
      paramFragment.oF = false;
      i = j;
      if (paramFragment.ot)
      {
        paramFragment.mView = paramFragment.a(paramFragment.c(paramFragment.oi), null, paramFragment.oi);
        if (paramFragment.mView == null) {
          break label1101;
        }
        paramFragment.oL = paramFragment.mView;
        if (Build.VERSION.SDK_INT >= 11)
        {
          z.ac(paramFragment.mView);
          if (paramFragment.oD) {
            paramFragment.mView.setVisibility(8);
          }
          localObject1 = paramFragment.mView;
          localObject1 = paramFragment.oi;
          paramFragment.aM();
          i = j;
        }
      }
      else
      {
        k = i;
        if (i <= 1) {
          break label1242;
        }
        if (DEBUG) {
          new StringBuilder("moveto ACTIVITY_CREATED: ").append(paramFragment);
        }
        if (!paramFragment.ot)
        {
          if (paramFragment.oC == 0) {
            break label2494;
          }
          localObject2 = (ViewGroup)this.pH.onFindViewById(paramFragment.oC);
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = localObject2;
            if (!paramFragment.ov) {
              a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(paramFragment.oC) + " (" + paramFragment.getResources().getResourceName(paramFragment.oC) + ") for fragment " + paramFragment));
            }
          }
        }
      }
    }
    label932:
    label1101:
    label1135:
    label1242:
    label1586:
    label2107:
    label2488:
    label2494:
    for (Object localObject1 = localObject2;; localObject1 = null)
    {
      paramFragment.oK = ((ViewGroup)localObject1);
      paramFragment.mView = paramFragment.a(paramFragment.c(paramFragment.oi), (ViewGroup)localObject1, paramFragment.oi);
      if (paramFragment.mView != null)
      {
        paramFragment.oL = paramFragment.mView;
        if (Build.VERSION.SDK_INT >= 11)
        {
          z.ac(paramFragment.mView);
          if (localObject1 != null)
          {
            localObject2 = a(paramFragment, paramInt2, true, paramInt3);
            if (localObject2 != null)
            {
              b(paramFragment.mView, (Animation)localObject2);
              paramFragment.mView.startAnimation((Animation)localObject2);
            }
            ((ViewGroup)localObject1).addView(paramFragment.mView);
          }
          if (paramFragment.oD) {
            paramFragment.mView.setVisibility(8);
          }
          localObject1 = paramFragment.mView;
          localObject1 = paramFragment.oi;
          paramFragment.aM();
        }
      }
      for (;;)
      {
        localObject1 = paramFragment.oi;
        if (paramFragment.oz != null) {
          paramFragment.oz.pL = false;
        }
        paramFragment.mState = 2;
        paramFragment.oI = false;
        paramFragment.onActivityCreated((Bundle)localObject1);
        if (paramFragment.oI) {
          break label1135;
        }
        throw new al("Fragment " + paramFragment + " did not call through to super.onActivityCreated()");
        paramFragment.mView = v.z(paramFragment.mView);
        break;
        paramFragment.oL = null;
        i = j;
        break label725;
        paramFragment.mView = v.z(paramFragment.mView);
        break label932;
        paramFragment.oL = null;
      }
      if (paramFragment.oz != null) {
        paramFragment.oz.dispatchActivityCreated();
      }
      if (paramFragment.mView != null)
      {
        localObject1 = paramFragment.oi;
        if (paramFragment.oj != null)
        {
          paramFragment.oL.restoreHierarchyState(paramFragment.oj);
          paramFragment.oj = null;
        }
        paramFragment.oI = false;
        paramFragment.oI = true;
        if (!paramFragment.oI) {
          throw new al("Fragment " + paramFragment + " did not call through to super.onViewStateRestored()");
        }
      }
      paramFragment.oi = null;
      k = i;
      j = k;
      if (k > 3)
      {
        if (DEBUG) {
          new StringBuilder("moveto STARTED: ").append(paramFragment);
        }
        if (paramFragment.oz != null)
        {
          paramFragment.oz.pL = false;
          paramFragment.oz.execPendingActions();
        }
        paramFragment.mState = 4;
        paramFragment.oI = false;
        paramFragment.onStart();
        if (!paramFragment.oI) {
          throw new al("Fragment " + paramFragment + " did not call through to super.onStart()");
        }
        if (paramFragment.oz != null) {
          paramFragment.oz.dispatchStart();
        }
        j = k;
        if (paramFragment.oO != null)
        {
          paramFragment.oO.bh();
          j = k;
        }
      }
      i = j;
      if (j <= 4) {
        break;
      }
      if (DEBUG) {
        new StringBuilder("moveto RESUMED: ").append(paramFragment);
      }
      if (paramFragment.oz != null)
      {
        paramFragment.oz.pL = false;
        paramFragment.oz.execPendingActions();
      }
      paramFragment.mState = 5;
      paramFragment.oI = false;
      paramFragment.onResume();
      if (!paramFragment.oI) {
        throw new al("Fragment " + paramFragment + " did not call through to super.onResume()");
      }
      if (paramFragment.oz != null)
      {
        paramFragment.oz.dispatchResume();
        paramFragment.oz.execPendingActions();
      }
      paramFragment.oi = null;
      paramFragment.oj = null;
      i = j;
      break;
      i = paramInt1;
      if (paramFragment.mState <= paramInt1) {
        break;
      }
      switch (paramFragment.mState)
      {
      default: 
        i = paramInt1;
        break;
      case 1: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
        do
        {
          i = paramInt1;
          if (paramInt1 > 0) {
            break;
          }
          if ((this.pM) && (paramFragment.og != null))
          {
            localObject1 = paramFragment.og;
            paramFragment.og = null;
            ((View)localObject1).clearAnimation();
          }
          if (paramFragment.og == null) {
            break label2107;
          }
          paramFragment.oh = paramInt1;
          i = 1;
          break;
          if (paramInt1 < 5)
          {
            if (DEBUG) {
              new StringBuilder("movefrom RESUMED: ").append(paramFragment);
            }
            if (paramFragment.oz != null) {
              paramFragment.oz.G(4);
            }
            paramFragment.mState = 4;
            paramFragment.oI = false;
            paramFragment.onPause();
            if (!paramFragment.oI) {
              throw new al("Fragment " + paramFragment + " did not call through to super.onPause()");
            }
          }
          if (paramInt1 < 4)
          {
            if (DEBUG) {
              new StringBuilder("movefrom STARTED: ").append(paramFragment);
            }
            if (paramFragment.oz != null) {
              paramFragment.oz.dispatchStop();
            }
            paramFragment.mState = 3;
            paramFragment.oI = false;
            paramFragment.onStop();
            if (!paramFragment.oI) {
              throw new al("Fragment " + paramFragment + " did not call through to super.onStop()");
            }
          }
          if (paramInt1 < 3)
          {
            if (DEBUG) {
              new StringBuilder("movefrom STOPPED: ").append(paramFragment);
            }
            paramFragment.aO();
          }
        } while (paramInt1 >= 2);
        if (DEBUG) {
          new StringBuilder("movefrom ACTIVITY_CREATED: ").append(paramFragment);
        }
        if ((paramFragment.mView != null) && (this.oy.aS()) && (paramFragment.oj == null)) {
          i(paramFragment);
        }
        if (paramFragment.oz != null) {
          paramFragment.oz.G(1);
        }
        paramFragment.mState = 1;
        paramFragment.oI = false;
        paramFragment.onDestroyView();
        if (!paramFragment.oI) {
          throw new al("Fragment " + paramFragment + " did not call through to super.onDestroyView()");
        }
        if (paramFragment.oO != null) {
          paramFragment.oO.bg();
        }
        if ((paramFragment.mView != null) && (paramFragment.oK != null)) {
          if ((this.pG <= 0) || (this.pM)) {
            break label2488;
          }
        }
        for (localObject1 = a(paramFragment, paramInt2, false, paramInt3);; localObject1 = null)
        {
          if (localObject1 != null)
          {
            paramFragment.og = paramFragment.mView;
            paramFragment.oh = paramInt1;
            ((Animation)localObject1).setAnimationListener(new a(paramFragment.mView, (Animation)localObject1)
            {
              public final void onAnimationEnd(Animation paramAnonymousAnimation)
              {
                super.onAnimationEnd(paramAnonymousAnimation);
                if (paramFragment.og != null)
                {
                  paramFragment.og = null;
                  m.this.a(paramFragment, paramFragment.oh, 0, 0, false);
                }
              }
            });
            paramFragment.mView.startAnimation((Animation)localObject1);
          }
          paramFragment.oK.removeView(paramFragment.mView);
          paramFragment.oK = null;
          paramFragment.mView = null;
          paramFragment.oL = null;
          break label1586;
          if (DEBUG) {
            new StringBuilder("movefrom CREATED: ").append(paramFragment);
          }
          if (!paramFragment.oF)
          {
            if (paramFragment.oz != null) {
              paramFragment.oz.dispatchDestroy();
            }
            paramFragment.mState = 0;
            paramFragment.oI = false;
            paramFragment.onDestroy();
            if (!paramFragment.oI) {
              throw new al("Fragment " + paramFragment + " did not call through to super.onDestroy()");
            }
          }
          else
          {
            paramFragment.mState = 0;
          }
          paramFragment.oI = false;
          paramFragment.onDetach();
          if (!paramFragment.oI) {
            throw new al("Fragment " + paramFragment + " did not call through to super.onDetach()");
          }
          i = paramInt1;
          if (paramBoolean) {
            break;
          }
          if (!paramFragment.oF)
          {
            i = paramInt1;
            if (paramFragment.mIndex < 0) {
              break;
            }
            if (DEBUG) {
              new StringBuilder("Freeing fragment index ").append(paramFragment);
            }
            this.py.set(paramFragment.mIndex, null);
            if (this.pA == null) {
              this.pA = new ArrayList();
            }
            this.pA.add(Integer.valueOf(paramFragment.mIndex));
            this.oy.k(paramFragment.ok);
            paramFragment.mIndex = -1;
            paramFragment.ok = null;
            paramFragment.or = false;
            paramFragment.os = false;
            paramFragment.ot = false;
            paramFragment.ou = false;
            paramFragment.ov = false;
            paramFragment.ow = 0;
            paramFragment.ox = null;
            paramFragment.oz = null;
            paramFragment.oy = null;
            paramFragment.oB = 0;
            paramFragment.oC = 0;
            paramFragment.mTag = null;
            paramFragment.oD = false;
            paramFragment.mDetached = false;
            paramFragment.oF = false;
            paramFragment.oO = null;
            paramFragment.oP = false;
            paramFragment.oQ = false;
            i = paramInt1;
            break;
          }
          paramFragment.oy = null;
          paramFragment.oA = null;
          paramFragment.ox = null;
          paramFragment.oz = null;
          i = paramInt1;
          break;
        }
      }
    }
  }
  
  public final void a(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.pz == null) {
      this.pz = new ArrayList();
    }
    if (DEBUG) {
      new StringBuilder("add: ").append(paramFragment);
    }
    h(paramFragment);
    if (!paramFragment.mDetached)
    {
      if (this.pz.contains(paramFragment)) {
        throw new IllegalStateException("Fragment already added: " + paramFragment);
      }
      this.pz.add(paramFragment);
      paramFragment.or = true;
      paramFragment.os = false;
      if ((paramFragment.oG) && (paramFragment.oH)) {
        this.pK = true;
      }
      if (paramBoolean) {
        g(paramFragment);
      }
    }
  }
  
  public final void a(k paramk, i parami, Fragment paramFragment)
  {
    if (this.oy != null) {
      throw new IllegalStateException("Already attached");
    }
    this.oy = paramk;
    this.pH = parami;
    this.pI = paramFragment;
  }
  
  public final void a(Runnable paramRunnable, boolean paramBoolean)
  {
    if (!paramBoolean) {
      aY();
    }
    try
    {
      if ((this.pM) || (this.oy == null)) {
        throw new IllegalStateException("Activity has been destroyed");
      }
    }
    finally
    {
      throw paramRunnable;
      if (this.pv == null) {
        this.pv = new ArrayList();
      }
      this.pv.add(paramRunnable);
      if (this.pv.size() == 1) {
        this.oy.mHandler.removeCallbacks(this.pR);
      }
    }
  }
  
  public final p aV()
  {
    return new d(this);
  }
  
  public final List<Fragment> aW()
  {
    return this.py;
  }
  
  final void aX()
  {
    if (this.py == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.py.size())
      {
        Fragment localFragment = (Fragment)this.py.get(i);
        if (localFragment != null) {
          f(localFragment);
        }
        i += 1;
      }
    }
  }
  
  final void aZ()
  {
    if (this.pF != null)
    {
      int i = 0;
      while (i < this.pF.size())
      {
        this.pF.get(i);
        i += 1;
      }
    }
  }
  
  public final void b(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG) {
      new StringBuilder("hide: ").append(paramFragment);
    }
    if (!paramFragment.oD)
    {
      paramFragment.oD = true;
      if (paramFragment.mView != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, false, paramInt2);
        if (localAnimation != null)
        {
          b(paramFragment.mView, localAnimation);
          paramFragment.mView.startAnimation(localAnimation);
        }
        paramFragment.mView.setVisibility(8);
      }
      if ((paramFragment.or) && (paramFragment.oG) && (paramFragment.oH)) {
        this.pK = true;
      }
      paramFragment.onHiddenChanged(true);
    }
  }
  
  public final Fragment c(Bundle paramBundle, String paramString)
  {
    int i = paramBundle.getInt(paramString, -1);
    if (i == -1) {
      paramBundle = null;
    }
    Fragment localFragment;
    do
    {
      return paramBundle;
      if (i >= this.py.size()) {
        a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i));
      }
      localFragment = (Fragment)this.py.get(i);
      paramBundle = localFragment;
    } while (localFragment != null);
    a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i));
    return localFragment;
  }
  
  public final void c(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG) {
      new StringBuilder("show: ").append(paramFragment);
    }
    if (paramFragment.oD)
    {
      paramFragment.oD = false;
      if (paramFragment.mView != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, true, paramInt2);
        if (localAnimation != null)
        {
          b(paramFragment.mView, localAnimation);
          paramFragment.mView.startAnimation(localAnimation);
        }
        paramFragment.mView.setVisibility(0);
      }
      if ((paramFragment.or) && (paramFragment.oG) && (paramFragment.oH)) {
        this.pK = true;
      }
      paramFragment.onHiddenChanged(false);
    }
  }
  
  public final void d(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG) {
      new StringBuilder("detach: ").append(paramFragment);
    }
    if (!paramFragment.mDetached)
    {
      paramFragment.mDetached = true;
      if (paramFragment.or)
      {
        if (this.pz != null)
        {
          if (DEBUG) {
            new StringBuilder("remove from detach: ").append(paramFragment);
          }
          this.pz.remove(paramFragment);
        }
        if ((paramFragment.oG) && (paramFragment.oH)) {
          this.pK = true;
        }
        paramFragment.or = false;
        a(paramFragment, 1, paramInt1, paramInt2, false);
      }
    }
  }
  
  public final void dispatchActivityCreated()
  {
    this.pL = false;
    G(2);
  }
  
  public final void dispatchConfigurationChanged(Configuration paramConfiguration)
  {
    if (this.pz != null)
    {
      int i = 0;
      while (i < this.pz.size())
      {
        Fragment localFragment = (Fragment)this.pz.get(i);
        if (localFragment != null)
        {
          localFragment.onConfigurationChanged(paramConfiguration);
          if (localFragment.oz != null) {
            localFragment.oz.dispatchConfigurationChanged(paramConfiguration);
          }
        }
        i += 1;
      }
    }
  }
  
  public final boolean dispatchContextItemSelected(MenuItem paramMenuItem)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int j;
    if (this.pz != null) {
      j = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      Fragment localFragment;
      int i;
      if (j < this.pz.size())
      {
        localFragment = (Fragment)this.pz.get(j);
        if (localFragment == null) {
          break label108;
        }
        if (localFragment.oD) {
          break label103;
        }
        if (!localFragment.onContextItemSelected(paramMenuItem)) {
          break label78;
        }
        i = 1;
      }
      while (i != 0)
      {
        bool1 = true;
        return bool1;
        label78:
        if ((localFragment.oz != null) && (localFragment.oz.dispatchContextItemSelected(paramMenuItem))) {
          i = 1;
        } else {
          label103:
          i = 0;
        }
      }
      label108:
      j += 1;
    }
  }
  
  public final void dispatchCreate()
  {
    this.pL = false;
    G(1);
  }
  
  public final boolean dispatchCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int m = 0;
    Object localObject2 = null;
    Object localObject1 = null;
    int k;
    boolean bool2;
    boolean bool3;
    Fragment localFragment;
    int i;
    if (this.pz != null)
    {
      k = 0;
      bool2 = false;
      localObject2 = localObject1;
      bool3 = bool2;
      if (k >= this.pz.size()) {
        break label169;
      }
      localFragment = (Fragment)this.pz.get(k);
      if (localFragment == null) {
        break label235;
      }
      if (localFragment.oD) {
        break label243;
      }
      if ((!localFragment.oG) || (!localFragment.oH)) {
        break label238;
      }
      localFragment.onCreateOptionsMenu(paramMenu, paramMenuInflater);
      i = 1;
      label94:
      int j = i;
      if (localFragment.oz == null) {}
    }
    label169:
    label235:
    label238:
    label243:
    for (boolean bool1 = i | localFragment.oz.dispatchCreateOptionsMenu(paramMenu, paramMenuInflater);; bool1 = false)
    {
      if (bool1)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new ArrayList();
        }
        ((ArrayList)localObject2).add(localFragment);
        bool2 = true;
        localObject1 = localObject2;
      }
      for (;;)
      {
        k += 1;
        break;
        bool3 = false;
        if (this.pC != null)
        {
          i = m;
          while (i < this.pC.size())
          {
            paramMenu = (Fragment)this.pC.get(i);
            if ((localObject2 == null) || (!((ArrayList)localObject2).contains(paramMenu))) {
              Fragment.onDestroyOptionsMenu();
            }
            i += 1;
          }
        }
        this.pC = ((ArrayList)localObject2);
        return bool3;
      }
      i = 0;
      break label94;
    }
  }
  
  public final void dispatchDestroy()
  {
    this.pM = true;
    execPendingActions();
    G(0);
    this.oy = null;
    this.pH = null;
    this.pI = null;
  }
  
  public final void dispatchLowMemory()
  {
    if (this.pz != null)
    {
      int i = 0;
      while (i < this.pz.size())
      {
        Fragment localFragment = (Fragment)this.pz.get(i);
        if (localFragment != null)
        {
          localFragment.onLowMemory();
          if (localFragment.oz != null) {
            localFragment.oz.dispatchLowMemory();
          }
        }
        i += 1;
      }
    }
  }
  
  public final boolean dispatchOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int j;
    if (this.pz != null) {
      j = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      Fragment localFragment;
      int i;
      if (j < this.pz.size())
      {
        localFragment = (Fragment)this.pz.get(j);
        if (localFragment == null) {
          break label124;
        }
        if (localFragment.oD) {
          break label119;
        }
        if ((!localFragment.oG) || (!localFragment.oH) || (!localFragment.onOptionsItemSelected(paramMenuItem))) {
          break label94;
        }
        i = 1;
      }
      while (i != 0)
      {
        bool1 = true;
        return bool1;
        label94:
        if ((localFragment.oz != null) && (localFragment.oz.dispatchOptionsItemSelected(paramMenuItem))) {
          i = 1;
        } else {
          label119:
          i = 0;
        }
      }
      label124:
      j += 1;
    }
  }
  
  public final void dispatchOptionsMenuClosed(Menu paramMenu)
  {
    if (this.pz != null)
    {
      int i = 0;
      while (i < this.pz.size())
      {
        Fragment localFragment = (Fragment)this.pz.get(i);
        if ((localFragment != null) && (!localFragment.oD) && (localFragment.oz != null)) {
          localFragment.oz.dispatchOptionsMenuClosed(paramMenu);
        }
        i += 1;
      }
    }
  }
  
  public final boolean dispatchPrepareOptionsMenu(Menu paramMenu)
  {
    int i;
    boolean bool3;
    boolean bool4;
    Fragment localFragment;
    boolean bool1;
    if (this.pz != null)
    {
      i = 0;
      bool3 = false;
      bool4 = bool3;
      if (i >= this.pz.size()) {
        break label133;
      }
      localFragment = (Fragment)this.pz.get(i);
      bool4 = bool3;
      if (localFragment != null)
      {
        if (localFragment.oD) {
          break label141;
        }
        if ((!localFragment.oG) || (!localFragment.oH)) {
          break label136;
        }
        localFragment.onPrepareOptionsMenu(paramMenu);
        bool1 = true;
        label84:
        bool2 = bool1;
        if (localFragment.oz == null) {}
      }
    }
    label133:
    label136:
    label141:
    for (boolean bool2 = bool1 | localFragment.oz.dispatchPrepareOptionsMenu(paramMenu);; bool2 = false)
    {
      bool4 = bool3;
      if (bool2) {
        bool4 = true;
      }
      i += 1;
      bool3 = bool4;
      break;
      bool4 = false;
      return bool4;
      bool1 = false;
      break label84;
    }
  }
  
  public final void dispatchResume()
  {
    this.pL = false;
    G(5);
  }
  
  public final void dispatchStart()
  {
    this.pL = false;
    G(4);
  }
  
  public final void dispatchStop()
  {
    this.pL = true;
    G(3);
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int j = 0;
    String str = paramString + "    ";
    int k;
    int i;
    if (this.py != null)
    {
      k = this.py.size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        i = 0;
        while (i < k)
        {
          Fragment localFragment = (Fragment)this.py.get(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment);
          if (localFragment != null) {
            localFragment.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
          i += 1;
        }
      }
    }
    if (this.pz != null)
    {
      k = this.pz.size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        i = 0;
        while (i < k)
        {
          paramFileDescriptor = (Fragment)this.pz.get(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramFileDescriptor.toString());
          i += 1;
        }
      }
    }
    if (this.pC != null)
    {
      k = this.pC.size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        i = 0;
        while (i < k)
        {
          paramFileDescriptor = (Fragment)this.pC.get(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramFileDescriptor.toString());
          i += 1;
        }
      }
    }
    if (this.pB != null)
    {
      k = this.pB.size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        i = 0;
        while (i < k)
        {
          paramFileDescriptor = (d)this.pB.get(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramFileDescriptor.toString());
          paramFileDescriptor.a(str, paramPrintWriter);
          i += 1;
        }
      }
    }
    try
    {
      if (this.pD != null)
      {
        k = this.pD.size();
        if (k > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          i = 0;
          while (i < k)
          {
            paramFileDescriptor = (d)this.pD.get(i);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
            i += 1;
          }
        }
      }
      if ((this.pE != null) && (this.pE.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.pE.toArray()));
      }
      if (this.pv != null)
      {
        k = this.pv.size();
        if (k > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          i = j;
          while (i < k)
          {
            paramFileDescriptor = (Runnable)this.pv.get(i);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
            i += 1;
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mHost=");
    paramPrintWriter.println(this.oy);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.pH);
    if (this.pI != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.pI);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.pG);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.pL);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.pM);
    if (this.pK)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.pK);
    }
    if (this.pN != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(this.pN);
    }
    if ((this.pA != null) && (this.pA.size() > 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mAvailIndices: ");
      paramPrintWriter.println(Arrays.toString(this.pA.toArray()));
    }
  }
  
  public final Fragment.SavedState e(Fragment paramFragment)
  {
    Object localObject2 = null;
    if (paramFragment.mIndex < 0) {
      a(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    }
    Object localObject1 = localObject2;
    if (paramFragment.mState > 0)
    {
      paramFragment = j(paramFragment);
      localObject1 = localObject2;
      if (paramFragment != null) {
        localObject1 = new Fragment.SavedState(paramFragment);
      }
    }
    return (Fragment.SavedState)localObject1;
  }
  
  public final void e(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (DEBUG) {
      new StringBuilder("attach: ").append(paramFragment);
    }
    if (paramFragment.mDetached)
    {
      paramFragment.mDetached = false;
      if (!paramFragment.or)
      {
        if (this.pz == null) {
          this.pz = new ArrayList();
        }
        if (this.pz.contains(paramFragment)) {
          throw new IllegalStateException("Fragment already added: " + paramFragment);
        }
        if (DEBUG) {
          new StringBuilder("add from attach: ").append(paramFragment);
        }
        this.pz.add(paramFragment);
        paramFragment.or = true;
        if ((paramFragment.oG) && (paramFragment.oH)) {
          this.pK = true;
        }
        a(paramFragment, this.pG, paramInt1, paramInt2, false);
      }
    }
  }
  
  public final boolean execPendingActions()
  {
    if (this.px) {
      throw new IllegalStateException("Recursive entry to executePendingTransactions");
    }
    if (Looper.myLooper() != this.oy.mHandler.getLooper()) {
      throw new IllegalStateException("Must be called from main thread of process");
    }
    boolean bool = false;
    label255:
    label268:
    label270:
    for (;;)
    {
      int j;
      try
      {
        if ((this.pv == null) || (this.pv.size() == 0))
        {
          if (!this.pO) {
            break label268;
          }
          i = 0;
          k = 0;
          if (k >= this.py.size()) {
            break label255;
          }
          Fragment localFragment = (Fragment)this.py.get(k);
          if ((localFragment == null) || (localFragment.oO == null)) {
            break label270;
          }
          i |= localFragment.oO.bc();
          k += 1;
          continue;
        }
        int k = this.pv.size();
        if ((this.pw == null) || (this.pw.length < k)) {
          this.pw = new Runnable[k];
        }
        this.pv.toArray(this.pw);
        this.pv.clear();
        this.oy.mHandler.removeCallbacks(this.pR);
        this.px = true;
        int i = 0;
        if (i < k)
        {
          this.pw[i].run();
          this.pw[i] = null;
          i += 1;
          continue;
        }
        this.px = false;
      }
      finally {}
      bool = true;
      break;
      if (j == 0)
      {
        this.pO = false;
        aX();
      }
      return bool;
    }
  }
  
  public final boolean executePendingTransactions()
  {
    return execPendingActions();
  }
  
  public final void f(Fragment paramFragment)
  {
    if (paramFragment.oM)
    {
      if (this.px) {
        this.pO = true;
      }
    }
    else {
      return;
    }
    paramFragment.oM = false;
    a(paramFragment, this.pG, 0, 0, false);
  }
  
  final boolean g(int paramInt1, int paramInt2)
  {
    if (this.pB == null) {}
    int i;
    do
    {
      int j;
      do
      {
        do
        {
          return false;
          if ((paramInt1 >= 0) || ((paramInt2 & 0x1) != 0)) {
            break;
          }
          paramInt1 = this.pB.size() - 1;
        } while (paramInt1 < 0);
        localObject1 = (d)this.pB.remove(paramInt1);
        localObject2 = new SparseArray();
        localSparseArray1 = new SparseArray();
        ((d)localObject1).b((SparseArray)localObject2, localSparseArray1);
        ((d)localObject1).a(true, null, (SparseArray)localObject2, localSparseArray1);
        aZ();
        return true;
        i = -1;
        if (paramInt1 < 0) {
          break;
        }
        j = this.pB.size() - 1;
        while (j >= 0)
        {
          localObject1 = (d)this.pB.get(j);
          if ((paramInt1 >= 0) && (paramInt1 == ((d)localObject1).mIndex)) {
            break;
          }
          j -= 1;
        }
      } while (j < 0);
      i = j;
      if ((paramInt2 & 0x1) != 0)
      {
        paramInt2 = j - 1;
        for (;;)
        {
          i = paramInt2;
          if (paramInt2 < 0) {
            break;
          }
          localObject1 = (d)this.pB.get(paramInt2);
          i = paramInt2;
          if (paramInt1 < 0) {
            break;
          }
          i = paramInt2;
          if (paramInt1 != ((d)localObject1).mIndex) {
            break;
          }
          paramInt2 -= 1;
        }
      }
    } while (i == this.pB.size() - 1);
    Object localObject2 = new ArrayList();
    paramInt1 = this.pB.size() - 1;
    while (paramInt1 > i)
    {
      ((ArrayList)localObject2).add(this.pB.remove(paramInt1));
      paramInt1 -= 1;
    }
    paramInt2 = ((ArrayList)localObject2).size() - 1;
    SparseArray localSparseArray1 = new SparseArray();
    SparseArray localSparseArray2 = new SparseArray();
    paramInt1 = 0;
    while (paramInt1 <= paramInt2)
    {
      ((d)((ArrayList)localObject2).get(paramInt1)).b(localSparseArray1, localSparseArray2);
      paramInt1 += 1;
    }
    Object localObject1 = null;
    paramInt1 = 0;
    label330:
    d locald;
    if (paramInt1 <= paramInt2)
    {
      if (DEBUG) {
        new StringBuilder("Popping back stack state: ").append(((ArrayList)localObject2).get(paramInt1));
      }
      locald = (d)((ArrayList)localObject2).get(paramInt1);
      if (paramInt1 != paramInt2) {
        break label402;
      }
    }
    label402:
    for (boolean bool = true;; bool = false)
    {
      localObject1 = locald.a(bool, (d.b)localObject1, localSparseArray1, localSparseArray2);
      paramInt1 += 1;
      break label330;
      break;
    }
  }
  
  final void h(Fragment paramFragment)
  {
    if (paramFragment.mIndex >= 0) {}
    for (;;)
    {
      return;
      if ((this.pA == null) || (this.pA.size() <= 0))
      {
        if (this.py == null) {
          this.py = new ArrayList();
        }
        paramFragment.c(this.py.size(), this.pI);
        this.py.add(paramFragment);
      }
      while (DEBUG)
      {
        new StringBuilder("Allocated fragment index ").append(paramFragment);
        return;
        paramFragment.c(((Integer)this.pA.remove(this.pA.size() - 1)).intValue(), this.pI);
        this.py.set(paramFragment.mIndex, paramFragment);
      }
    }
  }
  
  public final boolean isDestroyed()
  {
    return this.pM;
  }
  
  public final Fragment j(String paramString)
  {
    if ((this.py != null) && (paramString != null))
    {
      int i = this.py.size() - 1;
      while (i >= 0)
      {
        Fragment localFragment = (Fragment)this.py.get(i);
        if (localFragment != null)
        {
          if (paramString.equals(localFragment.ok)) {}
          while (localFragment != null)
          {
            return localFragment;
            if (localFragment.oz != null) {
              localFragment = localFragment.oz.j(paramString);
            } else {
              localFragment = null;
            }
          }
        }
        i -= 1;
      }
    }
    return null;
  }
  
  public final Fragment l(String paramString)
  {
    int i;
    Object localObject;
    if ((this.pz != null) && (paramString != null))
    {
      i = this.pz.size() - 1;
      while (i >= 0)
      {
        localObject = (Fragment)this.pz.get(i);
        if ((localObject != null) && (paramString.equals(((Fragment)localObject).mTag))) {
          return (Fragment)localObject;
        }
        i -= 1;
      }
    }
    if ((this.py != null) && (paramString != null))
    {
      i = this.py.size() - 1;
      for (;;)
      {
        if (i < 0) {
          break label126;
        }
        Fragment localFragment = (Fragment)this.py.get(i);
        if (localFragment != null)
        {
          localObject = localFragment;
          if (paramString.equals(localFragment.mTag)) {
            break;
          }
        }
        i -= 1;
      }
    }
    label126:
    return null;
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString)) {
      return null;
    }
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    paramString = paramContext.obtainStyledAttributes(paramAttributeSet, b.qc);
    if (str1 == null) {
      str1 = paramString.getString(0);
    }
    for (;;)
    {
      int k = paramString.getResourceId(1, -1);
      String str2 = paramString.getString(2);
      paramString.recycle();
      if (!Fragment.c(this.oy.mContext, str1)) {
        return null;
      }
      if (paramView != null) {}
      for (int i = paramView.getId(); (i == -1) && (k == -1) && (str2 == null); i = 0) {
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str1);
      }
      int j;
      if (k != -1)
      {
        paramString = E(k);
        paramView = paramString;
        if (paramString == null)
        {
          paramView = paramString;
          if (str2 != null) {
            paramView = l(str2);
          }
        }
        paramString = paramView;
        if (paramView == null)
        {
          paramString = paramView;
          if (i != -1) {
            paramString = E(i);
          }
        }
        if (DEBUG) {
          new StringBuilder("onCreateView: id=0x").append(Integer.toHexString(k)).append(" fname=").append(str1).append(" existing=").append(paramString);
        }
        if (paramString != null) {
          break label405;
        }
        paramView = Fragment.b(paramContext, str1);
        paramView.ot = true;
        if (k == 0) {
          break label398;
        }
        j = k;
        label280:
        paramView.oB = j;
        paramView.oC = i;
        paramView.mTag = str2;
        paramView.ou = true;
        paramView.ox = this;
        paramView.oy = this.oy;
        paramString = paramView.oi;
        paramView.aK();
        a(paramView, true);
        label331:
        if ((this.pG > 0) || (!paramView.ot)) {
          break label524;
        }
        a(paramView, 1, 0, 0, false);
      }
      for (;;)
      {
        if (paramView.mView != null) {
          break label532;
        }
        throw new IllegalStateException("Fragment " + str1 + " did not create a view.");
        paramString = null;
        break;
        label398:
        j = i;
        break label280;
        label405:
        if (paramString.ou) {
          throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(k) + ", tag " + str2 + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + str1);
        }
        paramString.ou = true;
        paramString.oy = this.oy;
        if (!paramString.oF)
        {
          paramView = paramString.oi;
          paramString.aK();
        }
        paramView = paramString;
        break label331;
        label524:
        g(paramView);
      }
      label532:
      if (k != 0) {
        paramView.mView.setId(k);
      }
      if (paramView.mView.getTag() == null) {
        paramView.mView.setTag(str2);
      }
      return paramView.mView;
    }
  }
  
  public final void popBackStack()
  {
    a(new Runnable()
    {
      public final void run()
      {
        m localm = m.this;
        k localk = m.this.oy;
        localm.g(-1, 0);
      }
    }, false);
  }
  
  public final boolean popBackStackImmediate()
  {
    aY();
    execPendingActions();
    return g(-1, 0);
  }
  
  final void restoreAllState(Parcelable paramParcelable, List<Fragment> paramList)
  {
    if (paramParcelable == null) {}
    for (;;)
    {
      return;
      paramParcelable = (FragmentManagerState)paramParcelable;
      if (paramParcelable.qd != null)
      {
        Object localObject1;
        Object localObject2;
        if (paramList != null)
        {
          i = 0;
          while (i < paramList.size())
          {
            localObject1 = (Fragment)paramList.get(i);
            if (DEBUG) {
              new StringBuilder("restoreAllState: re-attaching retained ").append(localObject1);
            }
            localObject2 = paramParcelable.qd[localObject1.mIndex];
            ((FragmentState)localObject2).qk = ((Fragment)localObject1);
            ((Fragment)localObject1).oj = null;
            ((Fragment)localObject1).ow = 0;
            ((Fragment)localObject1).ou = false;
            ((Fragment)localObject1).or = false;
            ((Fragment)localObject1).om = null;
            if (((FragmentState)localObject2).oi != null)
            {
              ((FragmentState)localObject2).oi.setClassLoader(this.oy.mContext.getClassLoader());
              ((Fragment)localObject1).oj = ((FragmentState)localObject2).oi.getSparseParcelableArray("android:view_state");
              ((Fragment)localObject1).oi = ((FragmentState)localObject2).oi;
            }
            i += 1;
          }
        }
        this.py = new ArrayList(paramParcelable.qd.length);
        if (this.pA != null) {
          this.pA.clear();
        }
        int i = 0;
        if (i < paramParcelable.qd.length)
        {
          localObject1 = paramParcelable.qd[i];
          if (localObject1 != null)
          {
            localObject2 = this.oy;
            Fragment localFragment = this.pI;
            if (((FragmentState)localObject1).qk == null)
            {
              Context localContext = ((k)localObject2).mContext;
              if (((FragmentState)localObject1).ol != null) {
                ((FragmentState)localObject1).ol.setClassLoader(localContext.getClassLoader());
              }
              ((FragmentState)localObject1).qk = Fragment.a(localContext, ((FragmentState)localObject1).qj, ((FragmentState)localObject1).ol);
              if (((FragmentState)localObject1).oi != null)
              {
                ((FragmentState)localObject1).oi.setClassLoader(localContext.getClassLoader());
                ((FragmentState)localObject1).qk.oi = ((FragmentState)localObject1).oi;
              }
              ((FragmentState)localObject1).qk.c(((FragmentState)localObject1).mIndex, localFragment);
              ((FragmentState)localObject1).qk.ot = ((FragmentState)localObject1).ot;
              ((FragmentState)localObject1).qk.ov = true;
              ((FragmentState)localObject1).qk.oB = ((FragmentState)localObject1).oB;
              ((FragmentState)localObject1).qk.oC = ((FragmentState)localObject1).oC;
              ((FragmentState)localObject1).qk.mTag = ((FragmentState)localObject1).mTag;
              ((FragmentState)localObject1).qk.oE = ((FragmentState)localObject1).oE;
              ((FragmentState)localObject1).qk.mDetached = ((FragmentState)localObject1).mDetached;
              ((FragmentState)localObject1).qk.ox = ((k)localObject2).ox;
              if (DEBUG) {
                new StringBuilder("Instantiated fragment ").append(((FragmentState)localObject1).qk);
              }
            }
            localObject2 = ((FragmentState)localObject1).qk;
            if (DEBUG) {
              new StringBuilder("restoreAllState: active #").append(i).append(": ").append(localObject2);
            }
            this.py.add(localObject2);
            ((FragmentState)localObject1).qk = null;
          }
          for (;;)
          {
            i += 1;
            break;
            this.py.add(null);
            if (this.pA == null) {
              this.pA = new ArrayList();
            }
            if (DEBUG) {}
            this.pA.add(Integer.valueOf(i));
          }
        }
        if (paramList != null)
        {
          i = 0;
          if (i < paramList.size())
          {
            localObject1 = (Fragment)paramList.get(i);
            if (((Fragment)localObject1).oo >= 0) {
              if (((Fragment)localObject1).oo >= this.py.size()) {
                break label659;
              }
            }
            for (((Fragment)localObject1).om = ((Fragment)this.py.get(((Fragment)localObject1).oo));; ((Fragment)localObject1).om = null)
            {
              i += 1;
              break;
              label659:
              new StringBuilder("Re-attaching retained fragment ").append(localObject1).append(" target no longer exists: ").append(((Fragment)localObject1).oo);
            }
          }
        }
        if (paramParcelable.qe != null)
        {
          this.pz = new ArrayList(paramParcelable.qe.length);
          i = 0;
          while (i < paramParcelable.qe.length)
          {
            paramList = (Fragment)this.py.get(paramParcelable.qe[i]);
            if (paramList == null) {
              a(new IllegalStateException("No instantiated fragment for index #" + paramParcelable.qe[i]));
            }
            paramList.or = true;
            if (DEBUG) {
              new StringBuilder("restoreAllState: added #").append(i).append(": ").append(paramList);
            }
            if (this.pz.contains(paramList)) {
              throw new IllegalStateException("Already added!");
            }
            this.pz.add(paramList);
            i += 1;
          }
        }
        this.pz = null;
        if (paramParcelable.qf == null) {
          break;
        }
        this.pB = new ArrayList(paramParcelable.qf.length);
        i = 0;
        while (i < paramParcelable.qf.length)
        {
          paramList = paramParcelable.qf[i].a(this);
          if (DEBUG)
          {
            new StringBuilder("restoreAllState: back stack #").append(i).append(" (index ").append(paramList.mIndex).append("): ").append(paramList);
            paramList.a("  ", new PrintWriter(new android.support.v4.e.d("FragmentManager")), false);
          }
          this.pB.add(paramList);
          if (paramList.mIndex >= 0) {
            a(paramList.mIndex, paramList);
          }
          i += 1;
        }
      }
    }
    this.pB = null;
  }
  
  final Parcelable saveAllState()
  {
    Object localObject3 = null;
    execPendingActions();
    if (pu) {
      this.pL = true;
    }
    if ((this.py == null) || (this.py.size() <= 0)) {
      return null;
    }
    int k = this.py.size();
    FragmentState[] arrayOfFragmentState = new FragmentState[k];
    int j = 0;
    int i = 0;
    label56:
    Object localObject1;
    Object localObject2;
    if (j < k)
    {
      localObject1 = (Fragment)this.py.get(j);
      if (localObject1 == null) {
        break label659;
      }
      if (((Fragment)localObject1).mIndex < 0) {
        a(new IllegalStateException("Failure saving state: active " + localObject1 + " has cleared index: " + ((Fragment)localObject1).mIndex));
      }
      localObject2 = new FragmentState((Fragment)localObject1);
      arrayOfFragmentState[j] = localObject2;
      if ((((Fragment)localObject1).mState > 0) && (((FragmentState)localObject2).oi == null))
      {
        ((FragmentState)localObject2).oi = j((Fragment)localObject1);
        if (((Fragment)localObject1).om != null)
        {
          if (((Fragment)localObject1).om.mIndex < 0) {
            a(new IllegalStateException("Failure saving state: " + localObject1 + " has target not in fragment manager: " + ((Fragment)localObject1).om));
          }
          if (((FragmentState)localObject2).oi == null) {
            ((FragmentState)localObject2).oi = new Bundle();
          }
          a(((FragmentState)localObject2).oi, "android:target_state", ((Fragment)localObject1).om);
          if (((Fragment)localObject1).oq != 0) {
            ((FragmentState)localObject2).oi.putInt("android:target_req_state", ((Fragment)localObject1).oq);
          }
        }
        label297:
        if (DEBUG) {
          new StringBuilder("Saved state of ").append(localObject1).append(": ").append(((FragmentState)localObject2).oi);
        }
        i = 1;
      }
    }
    label659:
    for (;;)
    {
      j += 1;
      break label56;
      ((FragmentState)localObject2).oi = ((Fragment)localObject1).oi;
      break label297;
      if (i == 0) {
        break;
      }
      if (this.pz != null)
      {
        j = this.pz.size();
        if (j > 0)
        {
          localObject2 = new int[j];
          i = 0;
          for (;;)
          {
            localObject1 = localObject2;
            if (i >= j) {
              break;
            }
            localObject2[i] = ((Fragment)this.pz.get(i)).mIndex;
            if (localObject2[i] < 0) {
              a(new IllegalStateException("Failure saving state: active " + this.pz.get(i) + " has cleared index: " + localObject2[i]));
            }
            if (DEBUG) {
              new StringBuilder("saveAllState: adding fragment #").append(i).append(": ").append(this.pz.get(i));
            }
            i += 1;
          }
        }
      }
      localObject1 = null;
      localObject2 = localObject3;
      if (this.pB != null)
      {
        j = this.pB.size();
        localObject2 = localObject3;
        if (j > 0)
        {
          localObject3 = new BackStackState[j];
          i = 0;
          for (;;)
          {
            localObject2 = localObject3;
            if (i >= j) {
              break;
            }
            localObject3[i] = new BackStackState((d)this.pB.get(i));
            if (DEBUG) {
              new StringBuilder("saveAllState: adding back stack #").append(i).append(": ").append(this.pB.get(i));
            }
            i += 1;
          }
        }
      }
      localObject3 = new FragmentManagerState();
      ((FragmentManagerState)localObject3).qd = arrayOfFragmentState;
      ((FragmentManagerState)localObject3).qe = ((int[])localObject1);
      ((FragmentManagerState)localObject3).qf = ((BackStackState[])localObject2);
      return (Parcelable)localObject3;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (this.pI != null) {
      c.a(this.pI, localStringBuilder);
    }
    for (;;)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      c.a(this.oy, localStringBuilder);
    }
  }
  
  static class a
    implements Animation.AnimationListener
  {
    public View mView = null;
    private Animation.AnimationListener pZ = null;
    private boolean qa = false;
    
    public a(View paramView, Animation paramAnimation)
    {
      if ((paramView == null) || (paramAnimation == null)) {
        return;
      }
      this.mView = paramView;
    }
    
    public a(View paramView, Animation paramAnimation, Animation.AnimationListener paramAnimationListener)
    {
      if ((paramView == null) || (paramAnimation == null)) {
        return;
      }
      this.pZ = paramAnimationListener;
      this.mView = paramView;
    }
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      if ((this.mView != null) && (this.qa)) {
        this.mView.post(new Runnable()
        {
          public final void run()
          {
            z.a(m.a.this.mView, 0, null);
          }
        });
      }
      if (this.pZ != null) {
        this.pZ.onAnimationEnd(paramAnimation);
      }
    }
    
    public void onAnimationRepeat(Animation paramAnimation)
    {
      if (this.pZ != null) {
        this.pZ.onAnimationRepeat(paramAnimation);
      }
    }
    
    public void onAnimationStart(Animation paramAnimation)
    {
      if (this.mView != null)
      {
        this.qa = m.a(this.mView, paramAnimation);
        if (this.qa) {
          this.mView.post(new Runnable()
          {
            public final void run()
            {
              z.a(m.a.this.mView, 2, null);
            }
          });
        }
      }
      if (this.pZ != null) {
        this.pZ.onAnimationStart(paramAnimation);
      }
    }
  }
  
  static final class b
  {
    public static final int[] qc = { 16842755, 16842960, 16842961 };
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */