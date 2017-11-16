package com.tencent.recovery.crash;

public class DefaultExceptionHandler
  extends RecoveryExceptionHandler
{
  private Thread.UncaughtExceptionHandler xPy;
  
  public DefaultExceptionHandler(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this.xPy = paramUncaughtExceptionHandler;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    super.uncaughtException(paramThread, paramThrowable);
    if (this.xPy != null) {
      this.xPy.uncaughtException(paramThread, paramThrowable);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\crash\DefaultExceptionHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */