package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Trace;

public final class e
{
  public static void beginSection(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      Trace.beginSection(paramString);
    }
  }
  
  public static void endSection()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      Trace.endSection();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\os\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */