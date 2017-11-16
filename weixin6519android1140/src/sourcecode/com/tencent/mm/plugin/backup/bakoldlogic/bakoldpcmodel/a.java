package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;

public final class a
  extends com.tencent.mm.plugin.backup.a.e
{
  private static a jfk;
  private e jfl;
  private c jfm;
  private b jfn;
  
  public a()
  {
    GMTrace.i(14792941109248L, 110216);
    GMTrace.o(14792941109248L, 110216);
  }
  
  public static a agk()
  {
    GMTrace.i(14793075326976L, 110217);
    if (jfk == null)
    {
      locala = new a();
      jfk = locala;
      a(locala);
    }
    a locala = jfk;
    GMTrace.o(14793075326976L, 110217);
    return locala;
  }
  
  public final void aec()
  {
    GMTrace.i(14793209544704L, 110218);
    jfk = null;
    GMTrace.o(14793209544704L, 110218);
  }
  
  public final void aej()
  {
    GMTrace.i(14793880633344L, 110223);
    GMTrace.o(14793880633344L, 110223);
  }
  
  public final void aek()
  {
    GMTrace.i(14794014851072L, 110224);
    GMTrace.o(14794014851072L, 110224);
  }
  
  public final e agl()
  {
    GMTrace.i(14793477980160L, 110220);
    if (this.jfl == null) {
      this.jfl = new e();
    }
    e locale = this.jfl;
    GMTrace.o(14793477980160L, 110220);
    return locale;
  }
  
  public final c agm()
  {
    GMTrace.i(14793612197888L, 110221);
    if (this.jfm == null) {
      this.jfm = new c();
    }
    c localc = this.jfm;
    GMTrace.o(14793612197888L, 110221);
    return localc;
  }
  
  public final b agn()
  {
    GMTrace.i(14793746415616L, 110222);
    if (this.jfn == null) {
      this.jfn = new b();
    }
    b localb = this.jfn;
    GMTrace.o(14793746415616L, 110222);
    return localb;
  }
  
  public final void i(Object... paramVarArgs)
  {
    GMTrace.i(14793343762432L, 110219);
    paramVarArgs = (Context)paramVarArgs[0];
    agk().agn().ago();
    com.tencent.mm.plugin.backup.f.b.clear();
    paramVarArgs.stopService(new Intent().setClassName(paramVarArgs, "com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService"));
    GMTrace.o(14793343762432L, 110219);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcmodel\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */