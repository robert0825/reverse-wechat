package com.tencent.mm.plugin.wallet;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public int index;
  public String qTd;
  public StringBuffer qTe;
  
  public a()
  {
    GMTrace.i(7770132709376L, 57892);
    this.qTd = "";
    this.index = 0;
    this.qTe = new StringBuffer();
    GMTrace.o(7770132709376L, 57892);
  }
  
  public static a X(Intent paramIntent)
  {
    GMTrace.i(7770803798016L, 57897);
    int i = paramIntent.getIntExtra("WECHAT_PAY_LOG_REPORT_INDEX", -1);
    if (i == -1)
    {
      GMTrace.o(7770803798016L, 57897);
      return null;
    }
    a locala = new a();
    locala.index = i;
    locala.qTe = new StringBuffer(bg.aq(paramIntent.getStringExtra("WECHAT_PAY_LOG_REPORT_DATA"), ""));
    locala.qTd = bg.aq(paramIntent.getStringExtra("WECHAT_PAY_LOG_REPORT_BASEIFO"), "");
    GMTrace.o(7770803798016L, 57897);
    return locala;
  }
  
  public static boolean a(a parama, Intent paramIntent)
  {
    GMTrace.i(7770669580288L, 57896);
    if (parama == null)
    {
      GMTrace.o(7770669580288L, 57896);
      return false;
    }
    paramIntent.putExtra("WECHAT_PAY_LOG_REPORT_INDEX", parama.index);
    paramIntent.putExtra("WECHAT_PAY_LOG_REPORT_DATA", parama.qTe.toString());
    paramIntent.putExtra("WECHAT_PAY_LOG_REPORT_BASEIFO", parama.qTd);
    GMTrace.o(7770669580288L, 57896);
    return true;
  }
  
  public static a cb(String paramString, int paramInt)
  {
    GMTrace.i(7770266927104L, 57893);
    a locala = new a();
    locala.qTd = (paramString + "," + paramInt);
    GMTrace.o(7770266927104L, 57893);
    return locala;
  }
  
  public final void ay(int paramInt, String paramString)
  {
    GMTrace.i(7770535362560L, 57895);
    paramString = String.format("{%d, %s, %d, %s},", new Object[] { Integer.valueOf(this.index), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt), paramString });
    this.index += 1;
    w.i("MicroMsg.PayLogReport", "test for log " + paramString);
    this.qTe.append(paramString);
    GMTrace.o(7770535362560L, 57895);
  }
  
  public final void j(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7770401144832L, 57894);
    if (paramVarArgs.length <= 0) {
      w.w("MicroMsg.PayLogReport", "vals is null, use '' as value");
    }
    StringBuilder localStringBuilder;
    for (paramVarArgs = "";; paramVarArgs = localStringBuilder.toString())
    {
      ay(paramInt, paramVarArgs);
      GMTrace.o(7770401144832L, 57894);
      return;
      localStringBuilder = new StringBuilder();
      int j = paramVarArgs.length - 1;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(String.valueOf(paramVarArgs[i])).append(',');
        i += 1;
      }
      localStringBuilder.append(String.valueOf(paramVarArgs[j]));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\wallet\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */