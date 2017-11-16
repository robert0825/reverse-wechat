package com.tencent.recovery.log;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.tencent.recovery.storage.MMappedFileStorage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RecoveryFileLog
  implements RecoveryLog.RecoveryLogImpl
{
  private MMappedFileStorage xPE;
  private SimpleDateFormat xPF;
  private boolean xPG;
  
  public RecoveryFileLog(Context paramContext)
  {
    paramContext = new File(paramContext.getFilesDir(), "recovery");
    if (!paramContext.exists()) {
      paramContext.mkdirs();
    }
    paramContext = new File(paramContext, "recovery.log");
    if (paramContext.length() > 5242880L) {
      paramContext.delete();
    }
    this.xPE = new MMappedFileStorage(paramContext.getAbsolutePath());
    this.xPF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
  }
  
  private String al(String paramString1, String paramString2, String paramString3)
  {
    String str = this.xPF.format(new Date());
    return String.format("%s​%s​[%d][%d][%s]: %s​​", new Object[] { paramString1, paramString2, Integer.valueOf(Process.myPid()), Long.valueOf(Thread.currentThread().getId()), str, paramString3 });
  }
  
  public final void Kl()
  {
    this.xPG = true;
  }
  
  public final void bj(String paramString, boolean paramBoolean)
  {
    try
    {
      this.xPE.e(paramString.getBytes(), paramBoolean);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void d(String paramString1, String paramString2, Object... paramVarArgs)
  {
    bj(al("D", paramString1, String.format(paramString2, paramVarArgs)), false);
    if (this.xPG) {
      String.format(paramString2, paramVarArgs);
    }
  }
  
  public final void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    bj(al("E", paramString1, String.format(paramString2, paramVarArgs)), false);
    if (this.xPG) {
      String.format(paramString2, paramVarArgs);
    }
  }
  
  public final void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    bj(al("I", paramString1, String.format(paramString2, paramVarArgs)), false);
    if (this.xPG) {
      String.format(paramString2, paramVarArgs);
    }
  }
  
  public final void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs)
  {
    String str = String.format(paramString2, paramVarArgs);
    bj(al("E", paramString1, str + "  " + Log.getStackTraceString(paramThrowable)), false);
    if (this.xPG) {
      String.format(paramString2, paramVarArgs);
    }
  }
  
  public final void v(String paramString1, String paramString2, Object... paramVarArgs)
  {
    bj(al("V", paramString1, String.format(paramString2, paramVarArgs)), false);
    if (this.xPG) {
      String.format(paramString2, paramVarArgs);
    }
  }
  
  public final void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    bj(al("W", paramString1, String.format(paramString2, paramVarArgs)), false);
    if (this.xPG) {
      String.format(paramString2, paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\log\RecoveryFileLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */