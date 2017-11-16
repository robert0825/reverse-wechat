package com.tencent.wcdb.support;

import android.util.Printer;

public class LogPrinter
  implements Printer
{
  private final int mPriority;
  private final String mTag;
  
  public LogPrinter(int paramInt, String paramString)
  {
    this.mPriority = paramInt;
    this.mTag = paramString;
  }
  
  public void println(String paramString)
  {
    Log.println(this.mPriority, this.mTag, paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\wcdb\support\LogPrinter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */