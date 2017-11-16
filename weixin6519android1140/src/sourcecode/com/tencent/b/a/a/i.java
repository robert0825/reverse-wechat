package com.tencent.b.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.preference.PreferenceManager;
import org.json.JSONObject;

public class i
{
  private static i aKM = null;
  static f aKN = null;
  public static volatile long aKO = 0L;
  static h aKP = null;
  public static Context mContext = null;
  public static Handler mHandler = null;
  public g aKQ = null;
  
  private i(Context paramContext)
  {
    HandlerThread localHandlerThread = new HandlerThread(i.class.getSimpleName());
    localHandlerThread.start();
    mHandler = new Handler(localHandlerThread.getLooper());
    paramContext = paramContext.getApplicationContext();
    mContext = paramContext;
    aKO = PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("__MID_LAST_CHECK_TIME__", 0L);
  }
  
  public static i S(Context paramContext)
  {
    if (aKM == null) {}
    try
    {
      if (aKM == null) {
        aKM = new i(paramContext);
      }
      return aKM;
    }
    finally {}
  }
  
  public static void a(f paramf)
  {
    aKN = paramf;
  }
  
  public final String ol()
  {
    if ((this.aKQ == null) || (!s.aV(this.aKQ.aKK)))
    {
      this.aKQ = r.U(mContext).op();
      if (!s.aV(this.aKQ.aKK)) {
        break label100;
      }
    }
    label100:
    for (int i = 2;; i = 1)
    {
      if (mHandler != null) {
        mHandler.post(new n(mContext, i));
      }
      new StringBuilder("wx get mid:").append(this.aKQ.aKK);
      return this.aKQ.aKK;
    }
  }
  
  public final String om()
  {
    if ((this.aKQ == null) || (!s.aV(this.aKQ.aKK))) {
      this.aKQ = r.U(mContext).op();
    }
    return this.aKQ.aKK;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\b\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */