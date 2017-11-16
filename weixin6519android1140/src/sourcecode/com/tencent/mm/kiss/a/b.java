package com.tencent.mm.kiss.a;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewStub;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ge;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static b gaA;
  public LayoutInflater CJ;
  public Looper gaB;
  public ae gaC;
  public boolean gaD;
  public boolean gaE;
  public b gaF;
  public ConcurrentHashMap<String, c> gaz;
  public int mMode;
  
  static
  {
    GMTrace.i(452179525632L, 3369);
    gaA = null;
    gaA = new b();
    GMTrace.o(452179525632L, 3369);
  }
  
  public b()
  {
    GMTrace.i(450971566080L, 3360);
    this.gaz = new ConcurrentHashMap();
    this.gaD = false;
    this.mMode = 2;
    this.gaE = false;
    GMTrace.o(450971566080L, 3360);
  }
  
  public static b xK()
  {
    GMTrace.i(451105783808L, 3361);
    b localb = gaA;
    GMTrace.o(451105783808L, 3361);
    return localb;
  }
  
  public final View a(Activity paramActivity, String paramString, int paramInt)
  {
    GMTrace.i(451240001536L, 3362);
    if (this.gaE)
    {
      w.i("KISS.InflateRecycler", "not support application inflate");
      paramActivity = paramActivity.getLayoutInflater().inflate(paramInt, null);
      GMTrace.o(451240001536L, 3362);
      return paramActivity;
    }
    paramActivity = (c)this.gaz.get(paramString);
    if (paramActivity != null) {
      try
      {
        View localView = (View)paramActivity.gaR.poll();
        if (this.mMode == 1) {
          paramActivity.gaS.add(localView);
        }
        if (localView != null)
        {
          w.i("KISS.InflateRecycler", "cache reach");
          localView.addOnAttachStateChangeListener(new a(paramString, this, null));
          GMTrace.o(451240001536L, 3362);
          return localView;
        }
      }
      finally {}
    }
    w.i("KISS.InflateRecycler", "no cache reach");
    paramActivity = this.CJ.inflate(paramInt, null);
    GMTrace.o(451240001536L, 3362);
    return paramActivity;
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(16009624813568L, 119281);
    if (!this.gaD)
    {
      GMTrace.o(16009624813568L, 119281);
      return;
    }
    if (this.gaE)
    {
      GMTrace.o(16009624813568L, 119281);
      return;
    }
    if (paramc.gaT > paramc.gaR.size()) {
      this.gaC.sendMessage(this.gaC.obtainMessage(0, paramc));
    }
    GMTrace.o(16009624813568L, 119281);
  }
  
  public final boolean a(String paramString, int paramInt, int... paramVarArgs)
  {
    GMTrace.i(451374219264L, 3363);
    if (!this.gaD)
    {
      GMTrace.o(451374219264L, 3363);
      return false;
    }
    if (this.gaE)
    {
      w.i("KISS.InflateRecycler", "not support application inflate");
      GMTrace.o(451374219264L, 3363);
      return false;
    }
    if ((c)this.gaz.get(paramString) != null)
    {
      GMTrace.o(451374219264L, 3363);
      return false;
    }
    c localc = new c();
    this.gaz.put(paramString, localc);
    localc.gaT = 6;
    localc.gaH = paramString;
    localc.CH = paramInt;
    localc.gaU = paramVarArgs;
    this.gaC.sendMessage(this.gaC.obtainMessage(0, localc));
    GMTrace.o(451374219264L, 3363);
    return true;
  }
  
  private static final class a
    implements View.OnAttachStateChangeListener
  {
    private String gaH;
    private b gaI;
    private b.c gaJ;
    
    public a(String paramString, b paramb, b.c paramc)
    {
      GMTrace.i(450568912896L, 3357);
      this.gaH = paramString;
      this.gaI = paramb;
      this.gaJ = null;
      GMTrace.o(450568912896L, 3357);
    }
    
    public final void onViewAttachedToWindow(View paramView)
    {
      GMTrace.i(450703130624L, 3358);
      GMTrace.o(450703130624L, 3358);
    }
    
    public final void onViewDetachedFromWindow(View paramView)
    {
      GMTrace.i(450837348352L, 3359);
      c localc = (c)this.gaI.gaz.get(this.gaH);
      if (this.gaI.mMode == 1) {
        if (localc == null) {}
      }
      for (;;)
      {
        try
        {
          localc.gaS.remove(paramView);
          localc.gaR.add(paramView);
          if (this.gaJ != null) {}
          paramView.removeOnAttachStateChangeListener(this);
          paramView = this.gaI.gaF;
          boolean bool;
          this.gaI.a(localc);
        }
        finally
        {
          try
          {
            bool = paramView.init();
            if (bool) {
              break;
            }
            GMTrace.o(450837348352L, 3359);
            return;
          }
          catch (Throwable paramView)
          {
            GMTrace.o(450837348352L, 3359);
            return;
          }
          paramView = finally;
        }
      }
      paramView.mHandler.removeCallbacksAndMessages(null);
      paramView.mHandler.sendEmptyMessageDelayed(0, 1000L);
      GMTrace.o(450837348352L, 3359);
    }
  }
  
  private static final class b
  {
    Class gaK;
    Field gaL;
    Class gaM;
    Field gaN;
    private boolean gaO;
    private boolean gaP;
    ae mHandler;
    
    public b(Looper paramLooper)
    {
      GMTrace.i(450300477440L, 3355);
      this.gaN = null;
      this.gaO = false;
      this.gaP = false;
      this.mHandler = new ae(paramLooper)
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(449495171072L, 3349);
          for (;;)
          {
            try
            {
              long l = System.nanoTime();
              paramAnonymousMessage = b.b.this;
              try
              {
                localObject = (ThreadLocal)paramAnonymousMessage.gaL.get(null);
                if (localObject != null)
                {
                  localObject = ((ThreadLocal)localObject).get();
                  if (localObject == null) {}
                }
              }
              catch (IllegalAccessException paramAnonymousMessage)
              {
                Object localObject;
                w.printErrStackTrace("KISS.InflateRecycler", paramAnonymousMessage, "", new Object[0]);
                continue;
              }
            }
            catch (Throwable paramAnonymousMessage)
            {
              GMTrace.o(449495171072L, 3349);
              return;
            }
            try
            {
              paramAnonymousMessage = paramAnonymousMessage.gaN.get(localObject);
              if ((paramAnonymousMessage != null) && ((paramAnonymousMessage instanceof List))) {
                ((List)paramAnonymousMessage).clear();
              }
            }
            catch (IllegalAccessException paramAnonymousMessage)
            {
              w.printErrStackTrace("KISS.InflateRecycler", paramAnonymousMessage, "", new Object[0]);
            }
          }
          w.i("KISS.InflateRecycler", "durtion %s", new Object[] { Long.valueOf(System.nanoTime() - l) });
          GMTrace.o(449495171072L, 3349);
        }
      };
      GMTrace.o(450300477440L, 3355);
    }
    
    /* Error */
    final boolean init()
    {
      // Byte code:
      //   0: ldc2_w 55
      //   3: sipush 3356
      //   6: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   9: aload_0
      //   10: getfield 37	com/tencent/mm/kiss/a/b$b:gaO	Z
      //   13: ifeq +19 -> 32
      //   16: aload_0
      //   17: getfield 39	com/tencent/mm/kiss/a/b$b:gaP	Z
      //   20: istore_1
      //   21: ldc2_w 55
      //   24: sipush 3356
      //   27: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   30: iload_1
      //   31: ireturn
      //   32: aload_0
      //   33: iconst_1
      //   34: putfield 37	com/tencent/mm/kiss/a/b$b:gaO	Z
      //   37: aload_0
      //   38: ldc 58
      //   40: invokestatic 64	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
      //   43: putfield 66	com/tencent/mm/kiss/a/b$b:gaK	Ljava/lang/Class;
      //   46: aload_0
      //   47: aload_0
      //   48: getfield 66	com/tencent/mm/kiss/a/b$b:gaK	Ljava/lang/Class;
      //   51: ldc 68
      //   53: invokevirtual 72	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   56: putfield 74	com/tencent/mm/kiss/a/b$b:gaL	Ljava/lang/reflect/Field;
      //   59: aload_0
      //   60: getfield 74	com/tencent/mm/kiss/a/b$b:gaL	Ljava/lang/reflect/Field;
      //   63: iconst_1
      //   64: invokevirtual 80	java/lang/reflect/Field:setAccessible	(Z)V
      //   67: aload_0
      //   68: ldc 82
      //   70: invokestatic 64	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
      //   73: putfield 84	com/tencent/mm/kiss/a/b$b:gaM	Ljava/lang/Class;
      //   76: aload_0
      //   77: aload_0
      //   78: getfield 84	com/tencent/mm/kiss/a/b$b:gaM	Ljava/lang/Class;
      //   81: ldc 86
      //   83: invokevirtual 72	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   86: putfield 35	com/tencent/mm/kiss/a/b$b:gaN	Ljava/lang/reflect/Field;
      //   89: aload_0
      //   90: getfield 35	com/tencent/mm/kiss/a/b$b:gaN	Ljava/lang/reflect/Field;
      //   93: iconst_1
      //   94: invokevirtual 80	java/lang/reflect/Field:setAccessible	(Z)V
      //   97: aload_0
      //   98: iconst_1
      //   99: putfield 39	com/tencent/mm/kiss/a/b$b:gaP	Z
      //   102: ldc2_w 55
      //   105: sipush 3356
      //   108: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   111: iconst_1
      //   112: ireturn
      //   113: astore_2
      //   114: ldc 88
      //   116: aload_2
      //   117: ldc 90
      //   119: iconst_0
      //   120: anewarray 4	java/lang/Object
      //   123: invokestatic 96	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   126: ldc2_w 55
      //   129: sipush 3356
      //   132: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   135: iconst_0
      //   136: ireturn
      //   137: astore_2
      //   138: ldc 88
      //   140: aload_2
      //   141: ldc 90
      //   143: iconst_0
      //   144: anewarray 4	java/lang/Object
      //   147: invokestatic 96	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   150: ldc2_w 55
      //   153: sipush 3356
      //   156: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   159: iconst_0
      //   160: ireturn
      //   161: astore_2
      //   162: ldc 88
      //   164: aload_2
      //   165: ldc 90
      //   167: iconst_0
      //   168: anewarray 4	java/lang/Object
      //   171: invokestatic 96	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   174: ldc2_w 55
      //   177: sipush 3356
      //   180: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   183: iconst_0
      //   184: ireturn
      //   185: astore_2
      //   186: ldc 88
      //   188: aload_2
      //   189: ldc 90
      //   191: iconst_0
      //   192: anewarray 4	java/lang/Object
      //   195: invokestatic 96	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   198: ldc2_w 55
      //   201: sipush 3356
      //   204: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   207: iconst_0
      //   208: ireturn
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	209	0	this	b
      //   20	11	1	bool	boolean
      //   113	4	2	localClassNotFoundException1	ClassNotFoundException
      //   137	4	2	localNoSuchFieldException1	NoSuchFieldException
      //   161	4	2	localClassNotFoundException2	ClassNotFoundException
      //   185	4	2	localNoSuchFieldException2	NoSuchFieldException
      // Exception table:
      //   from	to	target	type
      //   37	46	113	java/lang/ClassNotFoundException
      //   46	59	137	java/lang/NoSuchFieldException
      //   67	76	161	java/lang/ClassNotFoundException
      //   76	89	185	java/lang/NoSuchFieldException
    }
  }
  
  public static abstract interface c {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kiss\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */