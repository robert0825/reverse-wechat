package com.tencent.recovery.log;

import java.util.ArrayList;
import java.util.List;

public class RecoveryLog
{
  private static RecoveryLogImpl gQy = new RecoveryCacheLog();
  
  public static void Kl()
  {
    gQy.Kl();
  }
  
  public static void a(RecoveryLogImpl paramRecoveryLogImpl)
  {
    if ((gQy instanceof RecoveryCacheLog))
    {
      RecoveryCacheLog localRecoveryCacheLog = (RecoveryCacheLog)gQy;
      int j = localRecoveryCacheLog.xPz.size();
      int i = 0;
      if (i < j)
      {
        RecoveryCacheLog.LogItem localLogItem = (RecoveryCacheLog.LogItem)localRecoveryCacheLog.xPz.get(i);
        switch (localLogItem.level)
        {
        }
        for (;;)
        {
          i += 1;
          break;
          paramRecoveryLogImpl.v(localLogItem.tag, localLogItem.xPA, localLogItem.xPB);
          continue;
          paramRecoveryLogImpl.d(localLogItem.tag, localLogItem.xPA, localLogItem.xPB);
          continue;
          paramRecoveryLogImpl.i(localLogItem.tag, localLogItem.xPA, localLogItem.xPB);
          continue;
          paramRecoveryLogImpl.w(localLogItem.tag, localLogItem.xPA, localLogItem.xPB);
          continue;
          if (localLogItem.xPC != null) {
            paramRecoveryLogImpl.printErrStackTrace(localLogItem.tag, localLogItem.xPC, localLogItem.xPA, localLogItem.xPB);
          } else {
            paramRecoveryLogImpl.e(localLogItem.tag, localLogItem.xPA, localLogItem.xPB);
          }
        }
      }
      localRecoveryCacheLog.xPz = new ArrayList();
    }
    gQy = paramRecoveryLogImpl;
  }
  
  public static void cnj()
  {
    if ((gQy instanceof RecoveryFileLog)) {
      ((RecoveryFileLog)gQy).bj("", true);
    }
  }
  
  public static RecoveryLogImpl cnk()
  {
    return gQy;
  }
  
  public static void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (gQy != null) {
      gQy.e(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (gQy != null) {
      gQy.i(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs)
  {
    if (gQy != null) {
      gQy.printErrStackTrace(paramString1, paramThrowable, paramString2, paramVarArgs);
    }
  }
  
  public static abstract interface RecoveryLogImpl
  {
    public abstract void Kl();
    
    public abstract void d(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void e(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void i(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs);
    
    public abstract void v(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void w(String paramString1, String paramString2, Object... paramVarArgs);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\log\RecoveryLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */