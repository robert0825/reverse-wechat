package com.google.android.gms.c;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.stats.h;

public final class as
{
  private static boolean DEBUG = false;
  private static String TAG = "WakeLock";
  private final String amw;
  public final PowerManager.WakeLock awd;
  private WorkSource awe;
  private final int awf;
  private final String awg;
  private boolean awh = true;
  private int awi;
  private int awj;
  private final Context mContext;
  
  private as(Context paramContext, int paramInt, String paramString)
  {
    w.h(paramString, "Wake lock name can NOT be empty");
    this.awf = 1;
    this.amw = paramString;
    this.awg = null;
    this.mContext = paramContext.getApplicationContext();
    this.awd = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, paramString);
    if (ac.M(this.mContext))
    {
      if (!ab.as(null)) {
        break label175;
      }
      if ((!com.google.android.gms.common.internal.f.akn) || (!j.isInitialized())) {
        break label167;
      }
      new StringBuilder("callingPackage is not supposed to be empty for wakelock ").append(this.amw).append("!");
      paramString = "com.google.android.gms";
      this.awe = ac.i(paramContext, paramString);
      paramContext = this.awe;
      if ((ac.M(this.mContext)) && (paramContext != null))
      {
        if (this.awe == null) {
          break label180;
        }
        this.awe.add(paramContext);
      }
    }
    for (;;)
    {
      this.awd.setWorkSource(this.awe);
      return;
      label167:
      paramString = paramContext.getPackageName();
      break;
      label175:
      paramString = null;
      break;
      label180:
      this.awe = paramContext;
    }
  }
  
  public as(Context paramContext, String paramString)
  {
    this(paramContext, 1, paramString);
  }
  
  private boolean at(String paramString)
  {
    if (!TextUtils.isEmpty(null))
    {
      paramString = this.awg;
      throw new NullPointerException();
    }
    return false;
  }
  
  private String f(String paramString, boolean paramBoolean)
  {
    if (this.awh)
    {
      if (paramBoolean) {
        return null;
      }
      return this.awg;
    }
    return this.awg;
  }
  
  public final void lF()
  {
    if ((!z.cf(14)) && (this.awh)) {
      Log.wtf(TAG, "Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: " + this.amw);
    }
    boolean bool = at(null);
    String str = f(null, bool);
    if (DEBUG) {
      new StringBuilder("Acquire:\n mWakeLockName: ").append(this.amw).append("\n mSecondaryName: ").append(this.awg).append("\nmReferenceCounted: ").append(this.awh).append("\nreason: ").append(null).append("\nmOpenEventCount").append(this.awj).append("\nuseWithReason: ").append(bool).append("\ntrackingName: ").append(str);
    }
    try
    {
      if (this.awh)
      {
        int i = this.awi;
        this.awi = (i + 1);
        if ((i == 0) || (bool)) {}
      }
      else
      {
        if ((this.awh) || (this.awj != 0)) {
          break label230;
        }
      }
      h.kV();
      h.a(this.mContext, com.google.android.gms.common.stats.f.a(this.awd, str), 7, this.amw, str, this.awf, ac.b(this.awe));
      this.awj += 1;
      label230:
      this.awd.acquire(1000L);
      return;
    }
    finally {}
  }
  
  public final void lG()
  {
    this.awd.setReferenceCounted(false);
    this.awh = false;
  }
  
  public final void release()
  {
    boolean bool = at(null);
    String str = f(null, bool);
    if (DEBUG) {
      new StringBuilder("Release:\n mWakeLockName: ").append(this.amw).append("\n mSecondaryName: ").append(this.awg).append("\nmReferenceCounted: ").append(this.awh).append("\nreason: ").append(null).append("\n mOpenEventCount").append(this.awj).append("\nuseWithReason: ").append(bool).append("\ntrackingName: ").append(str);
    }
    try
    {
      if (this.awh)
      {
        int i = this.awi - 1;
        this.awi = i;
        if ((i == 0) || (bool)) {}
      }
      else
      {
        if ((this.awh) || (this.awj != 1)) {
          break label190;
        }
      }
      h.kV();
      h.a(this.mContext, com.google.android.gms.common.stats.f.a(this.awd, str), 8, this.amw, str, this.awf, ac.b(this.awe));
      this.awj -= 1;
      label190:
      this.awd.release();
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */