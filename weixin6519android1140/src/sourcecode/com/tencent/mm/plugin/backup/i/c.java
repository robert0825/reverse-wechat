package com.tencent.mm.plugin.backup.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.backup.a.e;

public final class c
{
  private static String TAG;
  
  static
  {
    GMTrace.i(14719524012032L, 109669);
    TAG = "MicroMsg.BackupModelFactory";
    GMTrace.o(14719524012032L, 109669);
  }
  
  public static e kS(int paramInt)
  {
    GMTrace.i(14719389794304L, 109668);
    switch (paramInt)
    {
    case 0: 
    default: 
      GMTrace.o(14719389794304L, 109668);
      return null;
    case 1: 
      localObject = com.tencent.mm.plugin.backup.backuppcmodel.b.afh();
      GMTrace.o(14719389794304L, 109668);
      return (e)localObject;
    case 2: 
      localObject = com.tencent.mm.plugin.backup.c.b.aeH();
      GMTrace.o(14719389794304L, 109668);
      return (e)localObject;
    case -1: 
      localObject = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk();
      GMTrace.o(14719389794304L, 109668);
      return (e)localObject;
    }
    Object localObject = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV();
    GMTrace.o(14719389794304L, 109668);
    return (e)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\i\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */