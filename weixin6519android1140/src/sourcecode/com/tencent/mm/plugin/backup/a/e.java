package com.tencent.mm.plugin.backup.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public abstract class e
  extends a
{
  private static String TAG;
  private static boolean fXU;
  private static int iVq;
  private static byte[] iVr;
  private static SharedPreferences iVt;
  public String iVm;
  public String iVn;
  public String iVo;
  public f iVp;
  public byte[] iVs;
  
  static
  {
    GMTrace.i(14722208366592L, 109689);
    TAG = "MicroMsg.BackupModel";
    iVq = 0;
    iVr = "key".getBytes();
    fXU = false;
    GMTrace.o(14722208366592L, 109689);
  }
  
  public e()
  {
    GMTrace.i(14720463536128L, 109676);
    this.iVm = "id";
    this.iVn = "hello";
    this.iVo = "ok";
    GMTrace.o(14720463536128L, 109676);
  }
  
  public static void P(byte[] paramArrayOfByte)
  {
    GMTrace.i(14721537277952L, 109684);
    iVr = paramArrayOfByte;
    GMTrace.o(14721537277952L, 109684);
  }
  
  public static int ael()
  {
    GMTrace.i(14721134624768L, 109681);
    int i = iVq;
    GMTrace.o(14721134624768L, 109681);
    return i;
  }
  
  public static byte[] aem()
  {
    GMTrace.i(14721403060224L, 109683);
    byte[] arrayOfByte = iVr;
    GMTrace.o(14721403060224L, 109683);
    return arrayOfByte;
  }
  
  public static SharedPreferences aen()
  {
    GMTrace.i(14721671495680L, 109685);
    if (iVt == null) {
      iVt = ab.getContext().getSharedPreferences("BACKUP_CONFIG", 4);
    }
    SharedPreferences localSharedPreferences = iVt;
    GMTrace.o(14721671495680L, 109685);
    return localSharedPreferences;
  }
  
  public static void aeo()
  {
    GMTrace.i(14721805713408L, 109686);
    w.i(TAG, "holdReset");
    fXU = true;
    GMTrace.o(14721805713408L, 109686);
  }
  
  public static boolean aep()
  {
    GMTrace.i(14721939931136L, 109687);
    boolean bool = fXU;
    GMTrace.o(14721939931136L, 109687);
    return bool;
  }
  
  public static void aeq()
  {
    GMTrace.i(14722074148864L, 109688);
    iVr = "key".getBytes();
    iVq = 0;
    iVt = null;
    fXU = false;
    GMTrace.o(14722074148864L, 109688);
  }
  
  public static void ku(int paramInt)
  {
    GMTrace.i(14721268842496L, 109682);
    iVq = paramInt;
    GMTrace.o(14721268842496L, 109682);
  }
  
  public final f aei()
  {
    GMTrace.i(14720597753856L, 109677);
    if (this.iVp == null) {
      this.iVp = new f();
    }
    f localf = this.iVp;
    GMTrace.o(14720597753856L, 109677);
    return localf;
  }
  
  public abstract void aej();
  
  public abstract void aek();
  
  public abstract void i(Object... paramVarArgs);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */