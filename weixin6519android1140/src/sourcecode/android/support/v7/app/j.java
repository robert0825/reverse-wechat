package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.e.a;
import android.support.v4.view.z;
import android.support.v7.a.a.k;
import android.support.v7.view.d;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

final class j
{
  private static final Class<?>[] GO = { Context.class, AttributeSet.class };
  private static final int[] GP = { 16843375 };
  private static final String[] GQ = { "android.widget.", "android.view.", "android.webkit." };
  private static final Map<String, Constructor<? extends View>> GR = new a();
  private final Object[] GS = new Object[2];
  
  static Context a(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.View, 0, 0);
    if (paramBoolean1) {}
    for (int i = paramAttributeSet.getResourceId(a.k.View_android_theme, 0);; i = 0)
    {
      if (i == 0) {
        i = paramAttributeSet.getResourceId(a.k.View_theme, 0);
      }
      for (;;)
      {
        paramAttributeSet.recycle();
        paramAttributeSet = paramContext;
        if (i != 0) {
          if ((paramContext instanceof d))
          {
            paramAttributeSet = paramContext;
            if (((d)paramContext).Iv == i) {}
          }
          else
          {
            paramAttributeSet = new d(paramContext, i);
          }
        }
        return paramAttributeSet;
      }
    }
  }
  
  static void a(View paramView, AttributeSet paramAttributeSet)
  {
    Object localObject = paramView.getContext();
    if ((!(localObject instanceof ContextWrapper)) || ((Build.VERSION.SDK_INT >= 15) && (!z.am(paramView)))) {
      return;
    }
    paramAttributeSet = ((Context)localObject).obtainStyledAttributes(paramAttributeSet, GP);
    localObject = paramAttributeSet.getString(0);
    if (localObject != null) {
      paramView.setOnClickListener(new a(paramView, (String)localObject));
    }
    paramAttributeSet.recycle();
  }
  
  private View c(Context paramContext, String paramString1, String paramString2)
  {
    Constructor localConstructor = (Constructor)GR.get(paramString1);
    Object localObject = localConstructor;
    if (localConstructor == null) {}
    try
    {
      localObject = paramContext.getClassLoader();
      if (paramString2 != null) {}
      for (paramContext = paramString2 + paramString1;; paramContext = paramString1)
      {
        localObject = ((ClassLoader)localObject).loadClass(paramContext).asSubclass(View.class).getConstructor(GO);
        GR.put(paramString1, localObject);
        ((Constructor)localObject).setAccessible(true);
        paramContext = (View)((Constructor)localObject).newInstance(this.GS);
        return paramContext;
      }
      return null;
    }
    catch (Exception paramContext) {}
  }
  
  /* Error */
  final View a(Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: aload_2
    //   1: astore 5
    //   3: aload_2
    //   4: ldc -79
    //   6: invokevirtual 181	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   9: ifeq +14 -> 23
    //   12: aload_3
    //   13: aconst_null
    //   14: ldc -73
    //   16: invokeinterface 187 3 0
    //   21: astore 5
    //   23: aload_0
    //   24: getfield 53	android/support/v7/app/j:GS	[Ljava/lang/Object;
    //   27: iconst_0
    //   28: aload_1
    //   29: aastore
    //   30: aload_0
    //   31: getfield 53	android/support/v7/app/j:GS	[Ljava/lang/Object;
    //   34: iconst_1
    //   35: aload_3
    //   36: aastore
    //   37: iconst_m1
    //   38: aload 5
    //   40: bipush 46
    //   42: invokevirtual 191	java/lang/String:indexOf	(I)I
    //   45: if_icmpne +74 -> 119
    //   48: iconst_0
    //   49: istore 4
    //   51: iload 4
    //   53: getstatic 42	android/support/v7/app/j:GQ	[Ljava/lang/String;
    //   56: arraylength
    //   57: if_icmpge +46 -> 103
    //   60: aload_0
    //   61: aload_1
    //   62: aload 5
    //   64: getstatic 42	android/support/v7/app/j:GQ	[Ljava/lang/String;
    //   67: iload 4
    //   69: aaload
    //   70: invokespecial 193	android/support/v7/app/j:c	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    //   73: astore_2
    //   74: aload_2
    //   75: ifnull +19 -> 94
    //   78: aload_0
    //   79: getfield 53	android/support/v7/app/j:GS	[Ljava/lang/Object;
    //   82: iconst_0
    //   83: aconst_null
    //   84: aastore
    //   85: aload_0
    //   86: getfield 53	android/support/v7/app/j:GS	[Ljava/lang/Object;
    //   89: iconst_1
    //   90: aconst_null
    //   91: aastore
    //   92: aload_2
    //   93: areturn
    //   94: iload 4
    //   96: iconst_1
    //   97: iadd
    //   98: istore 4
    //   100: goto -49 -> 51
    //   103: aload_0
    //   104: getfield 53	android/support/v7/app/j:GS	[Ljava/lang/Object;
    //   107: iconst_0
    //   108: aconst_null
    //   109: aastore
    //   110: aload_0
    //   111: getfield 53	android/support/v7/app/j:GS	[Ljava/lang/Object;
    //   114: iconst_1
    //   115: aconst_null
    //   116: aastore
    //   117: aconst_null
    //   118: areturn
    //   119: aload_0
    //   120: aload_1
    //   121: aload 5
    //   123: aconst_null
    //   124: invokespecial 193	android/support/v7/app/j:c	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    //   127: astore_1
    //   128: aload_0
    //   129: getfield 53	android/support/v7/app/j:GS	[Ljava/lang/Object;
    //   132: iconst_0
    //   133: aconst_null
    //   134: aastore
    //   135: aload_0
    //   136: getfield 53	android/support/v7/app/j:GS	[Ljava/lang/Object;
    //   139: iconst_1
    //   140: aconst_null
    //   141: aastore
    //   142: aload_1
    //   143: areturn
    //   144: astore_1
    //   145: aload_0
    //   146: getfield 53	android/support/v7/app/j:GS	[Ljava/lang/Object;
    //   149: iconst_0
    //   150: aconst_null
    //   151: aastore
    //   152: aload_0
    //   153: getfield 53	android/support/v7/app/j:GS	[Ljava/lang/Object;
    //   156: iconst_1
    //   157: aconst_null
    //   158: aastore
    //   159: aconst_null
    //   160: areturn
    //   161: astore_1
    //   162: aload_0
    //   163: getfield 53	android/support/v7/app/j:GS	[Ljava/lang/Object;
    //   166: iconst_0
    //   167: aconst_null
    //   168: aastore
    //   169: aload_0
    //   170: getfield 53	android/support/v7/app/j:GS	[Ljava/lang/Object;
    //   173: iconst_1
    //   174: aconst_null
    //   175: aastore
    //   176: aload_1
    //   177: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	178	0	this	j
    //   0	178	1	paramContext	Context
    //   0	178	2	paramString	String
    //   0	178	3	paramAttributeSet	AttributeSet
    //   49	50	4	i	int
    //   1	121	5	str	String
    // Exception table:
    //   from	to	target	type
    //   23	48	144	java/lang/Exception
    //   51	74	144	java/lang/Exception
    //   119	128	144	java/lang/Exception
    //   23	48	161	finally
    //   51	74	161	finally
    //   119	128	161	finally
  }
  
  private static final class a
    implements View.OnClickListener
  {
    private final View GT;
    private final String GU;
    private Method GV;
    private Context GW;
    
    public a(View paramView, String paramString)
    {
      this.GT = paramView;
      this.GU = paramString;
    }
    
    public final void onClick(View paramView)
    {
      Context localContext;
      if (this.GV == null) {
        localContext = this.GT.getContext();
      }
      while (localContext != null) {
        try
        {
          if (!localContext.isRestricted())
          {
            Method localMethod = localContext.getClass().getMethod(this.GU, new Class[] { View.class });
            if (localMethod != null)
            {
              this.GV = localMethod;
              this.GW = localContext;
            }
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          try
          {
            this.GV.invoke(this.GW, new Object[] { paramView });
            return;
          }
          catch (IllegalAccessException paramView)
          {
            int i;
            throw new IllegalStateException("Could not execute non-public method for android:onClick", paramView);
          }
          catch (InvocationTargetException paramView)
          {
            throw new IllegalStateException("Could not execute method for android:onClick", paramView);
          }
          localNoSuchMethodException = localNoSuchMethodException;
          if ((localContext instanceof ContextWrapper)) {
            localContext = ((ContextWrapper)localContext).getBaseContext();
          } else {
            localContext = null;
          }
        }
      }
      i = this.GT.getId();
      if (i == -1) {}
      for (paramView = "";; paramView = " with id '" + this.GT.getContext().getResources().getResourceEntryName(i) + "'") {
        throw new IllegalStateException("Could not find method " + this.GU + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.GT.getClass() + paramView);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\app\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */