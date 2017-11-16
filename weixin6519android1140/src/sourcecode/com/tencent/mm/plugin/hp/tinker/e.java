package com.tencent.mm.plugin.hp.tinker;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import java.io.File;
import java.util.List;

public final class e
  extends com.tencent.tinker.lib.c.b
{
  public e(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5750424338432L, 42844);
    GMTrace.o(5750424338432L, 42844);
  }
  
  public final void M(Intent paramIntent)
  {
    GMTrace.i(5750558556160L, 42845);
    super.M(paramIntent);
    com.tencent.mm.plugin.hp.b.b.L(paramIntent);
    GMTrace.o(5750558556160L, 42845);
  }
  
  public final void a(File paramFile, SharePatchInfo paramSharePatchInfo, String paramString)
  {
    GMTrace.i(5751498080256L, 42852);
    super.a(paramFile, paramSharePatchInfo, paramString);
    com.tencent.mm.plugin.hp.b.b.aHn();
    GMTrace.o(5751498080256L, 42852);
  }
  
  public final void a(File paramFile1, File paramFile2, String paramString, int paramInt)
  {
    GMTrace.i(5751363862528L, 42851);
    super.a(paramFile1, paramFile2, paramString, paramInt);
    com.tencent.mm.plugin.hp.b.b.pg(paramInt);
    GMTrace.o(5751363862528L, 42851);
  }
  
  public final void a(File paramFile, String paramString1, String paramString2)
  {
    GMTrace.i(5750961209344L, 42848);
    super.a(paramFile, paramString1, paramString2);
    com.tencent.mm.plugin.hp.b.b.aHm();
    GMTrace.o(5750961209344L, 42848);
  }
  
  public final void a(File paramFile, Throwable paramThrowable)
  {
    GMTrace.i(5750826991616L, 42847);
    super.a(paramFile, paramThrowable);
    com.tencent.mm.plugin.hp.b.b.d(paramThrowable);
    GMTrace.o(5750826991616L, 42847);
  }
  
  public final void a(File paramFile, List<File> paramList, Throwable paramThrowable)
  {
    GMTrace.i(16028012642304L, 119418);
    super.a(paramFile, paramList, paramThrowable);
    com.tencent.mm.plugin.hp.b.b.e(paramThrowable);
    GMTrace.o(16028012642304L, 119418);
  }
  
  public final void a(File paramFile, boolean paramBoolean, long paramLong)
  {
    GMTrace.i(5751229644800L, 42850);
    super.a(paramFile, paramBoolean, paramLong);
    com.tencent.mm.plugin.hp.b.b.g(paramLong, paramBoolean);
    w.bPN();
    GMTrace.o(5751229644800L, 42850);
  }
  
  public final void d(File paramFile, int paramInt)
  {
    GMTrace.i(5751095427072L, 42849);
    super.d(paramFile, paramInt);
    com.tencent.mm.plugin.hp.b.b.pf(paramInt);
    GMTrace.o(5751095427072L, 42849);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\tinker\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */