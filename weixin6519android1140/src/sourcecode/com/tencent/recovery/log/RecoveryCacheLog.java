package com.tencent.recovery.log;

import java.util.ArrayList;
import java.util.List;

public class RecoveryCacheLog
  implements RecoveryLog.RecoveryLogImpl
{
  List<LogItem> xPz = new ArrayList(100);
  
  public final void Kl() {}
  
  public final void d(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (this.xPz.size() < 100)
    {
      LogItem localLogItem = new LogItem();
      localLogItem.level = 2;
      localLogItem.tag = paramString1;
      localLogItem.xPA = paramString2;
      localLogItem.xPB = paramVarArgs;
      this.xPz.add(localLogItem);
    }
    String.format(paramString2, paramVarArgs);
  }
  
  public final void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (this.xPz.size() < 100)
    {
      LogItem localLogItem = new LogItem();
      localLogItem.level = 5;
      localLogItem.tag = paramString1;
      localLogItem.xPA = paramString2;
      localLogItem.xPB = paramVarArgs;
      this.xPz.add(localLogItem);
    }
    String.format(paramString2, paramVarArgs);
  }
  
  public final void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (this.xPz.size() < 100)
    {
      LogItem localLogItem = new LogItem();
      localLogItem.level = 3;
      localLogItem.tag = paramString1;
      localLogItem.xPA = paramString2;
      localLogItem.xPB = paramVarArgs;
      this.xPz.add(localLogItem);
    }
    String.format(paramString2, paramVarArgs);
  }
  
  public final void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs)
  {
    if (this.xPz.size() < 100)
    {
      LogItem localLogItem = new LogItem();
      localLogItem.level = 5;
      localLogItem.tag = paramString1;
      localLogItem.xPA = paramString2;
      localLogItem.xPB = paramVarArgs;
      localLogItem.xPC = paramThrowable;
      this.xPz.add(localLogItem);
    }
    String.format(paramString2, paramVarArgs);
  }
  
  public final void v(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (this.xPz.size() < 100)
    {
      LogItem localLogItem = new LogItem();
      localLogItem.level = 1;
      localLogItem.tag = paramString1;
      localLogItem.xPA = paramString2;
      localLogItem.xPB = paramVarArgs;
      this.xPz.add(localLogItem);
    }
    String.format(paramString2, paramVarArgs);
  }
  
  public final void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (this.xPz.size() < 100)
    {
      LogItem localLogItem = new LogItem();
      localLogItem.level = 4;
      localLogItem.tag = paramString1;
      localLogItem.xPA = paramString2;
      localLogItem.xPB = paramVarArgs;
      this.xPz.add(localLogItem);
    }
    String.format(paramString2, paramVarArgs);
  }
  
  private class LogItem
  {
    int level;
    String tag;
    String xPA;
    Object[] xPB;
    Throwable xPC;
    
    public LogItem() {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\log\RecoveryCacheLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */