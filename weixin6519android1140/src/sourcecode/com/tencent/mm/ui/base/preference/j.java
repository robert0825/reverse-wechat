package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.InflateException;
import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public final class j
{
  private static HashMap<String, Constructor<?>> wkS;
  private static final Class<?>[] wkT;
  final Object[] GS;
  final Context mContext;
  
  static
  {
    GMTrace.i(3233439285248L, 24091);
    wkS = new HashMap();
    wkT = new Class[] { Context.class, AttributeSet.class };
    GMTrace.o(3233439285248L, 24091);
  }
  
  public j(Context paramContext)
  {
    GMTrace.i(3232902414336L, 24087);
    this.GS = new Object[2];
    this.mContext = paramContext;
    GMTrace.o(3232902414336L, 24087);
  }
  
  private Preference a(String paramString1, String paramString2, AttributeSet paramAttributeSet)
  {
    GMTrace.i(3233036632064L, 24088);
    Object localObject1 = (Constructor)wkS.get(paramString1);
    if (localObject1 == null) {}
    for (;;)
    {
      try
      {
        localObject3 = this.mContext.getClassLoader();
        if (paramString2 != null)
        {
          localObject2 = paramString2 + paramString1;
          localObject2 = ((ClassLoader)localObject3).loadClass((String)localObject2).getConstructor(wkT);
          localObject1 = localObject2;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Object localObject3;
        localObject2 = new StringBuilder().append(paramAttributeSet.getPositionDescription()).append(": Error inflating class ");
        paramAttributeSet = paramString1;
        if (paramString2 != null) {
          paramAttributeSet = paramString2 + paramString1;
        }
        paramString1 = new InflateException(paramAttributeSet);
        paramString1.initCause(localNoSuchMethodException);
        throw paramString1;
      }
      catch (ClassNotFoundException paramString1)
      {
        throw paramString1;
      }
      catch (Exception paramString2) {}
      try
      {
        wkS.put(paramString1, localObject2);
        localObject1 = localObject2;
        localObject3 = this.GS;
        localObject3[1] = paramAttributeSet;
        localObject1 = localObject2;
        localObject2 = (Preference)((Constructor)localObject2).newInstance((Object[])localObject3);
        GMTrace.o(3233036632064L, 24088);
        return (Preference)localObject2;
      }
      catch (Exception paramString2)
      {
        for (;;) {}
      }
      Object localObject2 = paramString1;
      continue;
      if (paramAttributeSet != null) {
        paramString1 = paramAttributeSet.getPositionDescription();
      }
      for (;;)
      {
        paramString1 = new InflateException(paramString1);
        paramString1.initCause(paramString2);
        throw paramString1;
        if ("(null): Error inflating class " + localNoSuchMethodException != null) {
          paramString1 = localNoSuchMethodException.getClass().getName();
        } else {
          paramString1 = "(null)";
        }
      }
      localObject2 = localNoSuchMethodException;
    }
  }
  
  /* Error */
  Preference a(String paramString, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: ldc2_w 133
    //   3: sipush 24089
    //   6: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: iconst_m1
    //   10: aload_1
    //   11: bipush 46
    //   13: invokevirtual 140	java/lang/String:indexOf	(I)I
    //   16: if_icmpne +25 -> 41
    //   19: aload_0
    //   20: aload_1
    //   21: ldc -114
    //   23: aload_2
    //   24: invokespecial 144	com/tencent/mm/ui/base/preference/j:a	(Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Lcom/tencent/mm/ui/base/preference/Preference;
    //   27: astore_3
    //   28: aload_3
    //   29: astore_1
    //   30: ldc2_w 133
    //   33: sipush 24089
    //   36: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   39: aload_1
    //   40: areturn
    //   41: aload_0
    //   42: aload_1
    //   43: aconst_null
    //   44: aload_2
    //   45: invokespecial 144	com/tencent/mm/ui/base/preference/j:a	(Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Lcom/tencent/mm/ui/base/preference/Preference;
    //   48: astore_3
    //   49: aload_3
    //   50: astore_1
    //   51: goto -21 -> 30
    //   54: astore_1
    //   55: aload_1
    //   56: athrow
    //   57: astore_3
    //   58: new 109	android/view/InflateException
    //   61: dup
    //   62: new 73	java/lang/StringBuilder
    //   65: dup
    //   66: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   69: aload_2
    //   70: invokeinterface 105 1 0
    //   75: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: ldc 107
    //   80: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: aload_1
    //   84: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: invokespecial 112	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   93: astore_1
    //   94: aload_1
    //   95: aload_3
    //   96: invokevirtual 116	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   99: pop
    //   100: aload_1
    //   101: athrow
    //   102: astore_3
    //   103: new 109	android/view/InflateException
    //   106: dup
    //   107: new 73	java/lang/StringBuilder
    //   110: dup
    //   111: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   114: aload_2
    //   115: invokeinterface 105 1 0
    //   120: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: ldc 107
    //   125: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: aload_1
    //   129: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: invokespecial 112	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   138: astore_1
    //   139: aload_1
    //   140: aload_3
    //   141: invokevirtual 116	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   144: pop
    //   145: aload_1
    //   146: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	j
    //   0	147	1	paramString	String
    //   0	147	2	paramAttributeSet	AttributeSet
    //   27	23	3	localPreference	Preference
    //   57	39	3	localClassNotFoundException	ClassNotFoundException
    //   102	39	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   9	28	54	android/view/InflateException
    //   41	49	54	android/view/InflateException
    //   9	28	57	java/lang/ClassNotFoundException
    //   41	49	57	java/lang/ClassNotFoundException
    //   9	28	102	java/lang/Exception
    //   41	49	102	java/lang/Exception
  }
  
  void a(XmlPullParser paramXmlPullParser, f paramf, AttributeSet paramAttributeSet)
  {
    GMTrace.i(3233305067520L, 24090);
    int j = paramXmlPullParser.getDepth();
    int i = paramXmlPullParser.next();
    while (((i != 3) || (paramXmlPullParser.getDepth() > j)) && (i != 1)) {
      if (i != 2)
      {
        i = paramXmlPullParser.next();
      }
      else
      {
        paramf.a(a(paramXmlPullParser.getName(), paramAttributeSet), -1);
        i = paramXmlPullParser.next();
      }
    }
    GMTrace.o(3233305067520L, 24090);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\preference\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */