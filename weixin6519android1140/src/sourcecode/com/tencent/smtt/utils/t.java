package com.tencent.smtt.utils;

import android.content.Context;
import android.os.Environment;
import android.os.Looper;
import android.os.Process;
import android.widget.TextView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class t
{
  static String hiu;
  private static boolean xZo = true;
  static t xZq = null;
  static File xZr = null;
  static byte[] xZt;
  TextView Pi;
  private Context mContext = null;
  private SimpleDateFormat xZs = null;
  private StringBuffer xZu = new StringBuffer();
  
  static
  {
    hiu = null;
    xZt = null;
  }
  
  public t(Context paramContext)
  {
    try
    {
      this.mContext = paramContext.getApplicationContext();
      this.xZs = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS", Locale.US);
      return;
    }
    catch (Exception paramContext)
    {
      this.xZs = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");
    }
  }
  
  public static void setWriteLogJIT(boolean paramBoolean)
  {
    xZo = paramBoolean;
  }
  
  public void Yq(String paramString)
  {
    if (this.Pi != null) {
      this.Pi.post(new a(paramString));
    }
  }
  
  public void aN(String paramString)
  {
    try
    {
      String str = this.xZs.format(Long.valueOf(System.currentTimeMillis()));
      this.xZu.append(str).append(" pid=").append(Process.myPid()).append(" tid=").append(Process.myTid()).append(paramString).append("\n");
      if ((Thread.currentThread() != Looper.getMainLooper().getThread()) || (xZo)) {
        writeLogToDisk();
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  public void setLogView(TextView paramTextView)
  {
    this.Pi = paramTextView;
  }
  
  public void writeLogToDisk()
  {
    for (;;)
    {
      try
      {
        if (xZr == null)
        {
          if (!Environment.getExternalStorageState().equals("mounted")) {
            continue;
          }
          str = f.an(this.mContext, 6);
          if (str != null) {
            continue;
          }
          xZr = null;
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        String str;
        continue;
      }
      catch (SecurityException localSecurityException)
      {
        continue;
      }
      if (xZr != null)
      {
        h.a(xZr, hiu, xZt, this.xZu.toString());
        this.xZu.delete(0, this.xZu.length());
      }
      return;
      xZr = new File(str, "tbslog.txt");
      hiu = h.cph();
      xZt = h.fC(xZr.getName(), hiu);
      continue;
      xZr = null;
    }
  }
  
  private final class a
    implements Runnable
  {
    String xZv = null;
    
    a(String paramString)
    {
      this.xZv = paramString;
    }
    
    public final void run()
    {
      if (t.this.Pi != null) {
        t.this.Pi.append(this.xZv + "\n");
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */