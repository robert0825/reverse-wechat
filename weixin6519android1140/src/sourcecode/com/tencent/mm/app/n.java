package com.tencent.mm.app;

import android.os.Build;
import com.tencent.gmtrace.GMTrace;
import com.tencent.tinker.lib.d.b;
import com.tencent.tinker.lib.e.a;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import org.xmlpull.v1.XmlPullParserException;

public final class n
{
  public static boolean a(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    GMTrace.i(14012330803200L, 104400);
    int j = paramArrayOfStackTraceElement.length;
    int i = 0;
    while (i < j)
    {
      String str = paramArrayOfStackTraceElement[i].getClassName();
      if ((str != null) && ((str.contains("de.robv.android.xposed.XposedBridge")) || (str.contains("com.zte.heartyservice.SCC.FrameworkBridge"))))
      {
        GMTrace.o(14012330803200L, 104400);
        return true;
      }
      i += 1;
    }
    GMTrace.o(14012330803200L, 104400);
    return false;
  }
  
  public static void b(Throwable paramThrowable)
  {
    GMTrace.i(14012465020928L, 104401);
    ApplicationLike localApplicationLike = MMApplicationLike.getTinkerApplicationLike();
    if ((localApplicationLike == null) || (localApplicationLike.getApplication() == null))
    {
      a.w("TinkerCrashProtect", "applicationlike is null", new Object[0]);
      GMTrace.o(14012465020928L, 104401);
      return;
    }
    if (!b.b(localApplicationLike))
    {
      a.w("TinkerCrashProtect", "tinker is not loaded", new Object[0]);
      GMTrace.o(14012465020928L, 104401);
      return;
    }
    int i;
    boolean bool;
    if ((Build.MODEL.contains("ZUK")) || (Build.MODEL.contains("zuk")))
    {
      i = 1;
      bool = false;
      label100:
      if (paramThrowable == null) {
        break label291;
      }
      if (bool) {
        break label305;
      }
      bool = a(paramThrowable.getStackTrace());
    }
    label291:
    label300:
    label305:
    for (;;)
    {
      if (bool) {
        if ((!(paramThrowable instanceof IllegalAccessError)) || (!paramThrowable.getMessage().contains("Class ref in pre-verified class resolved to unexpected implementation"))) {
          break label300;
        }
      }
      for (int j = 1;; j = 0)
      {
        if (j != 0)
        {
          a.e("TinkerCrashProtect", "have xposed: just clean tinker", new Object[0]);
          ShareTinkerInternals.ih(localApplicationLike.getApplication());
          b.d(localApplicationLike);
          ShareTinkerInternals.id(localApplicationLike.getApplication());
          GMTrace.o(14012465020928L, 104401);
          return;
          i = 0;
          break;
        }
        if (i != 0)
        {
          a.w("TinkerCrashProtect", "it is zuk model here, crash:" + paramThrowable.getMessage(), new Object[0]);
          if (((paramThrowable instanceof XmlPullParserException)) && (paramThrowable.getMessage().contains("tag requires a 'drawable' attribute or child tag defining a drawable")))
          {
            a.e("TinkerCrashProtect", "have zuk parse error: just clean tinker", new Object[0]);
            ShareTinkerInternals.ih(localApplicationLike.getApplication());
            b.d(localApplicationLike);
            ShareTinkerInternals.id(localApplicationLike.getApplication());
            GMTrace.o(14012465020928L, 104401);
            return;
          }
        }
        paramThrowable = paramThrowable.getCause();
        break label100;
        GMTrace.o(14012465020928L, 104401);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */