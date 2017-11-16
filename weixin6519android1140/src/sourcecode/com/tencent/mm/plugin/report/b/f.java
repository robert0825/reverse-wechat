package com.tencent.mm.plugin.report.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.p;
import com.tencent.mm.platformtools.q;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.as;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class f
{
  public static boolean FI(String paramString)
  {
    GMTrace.i(13107837534208L, 97661);
    File localFile = new File("/sdcard/cov.txt");
    if (!localFile.exists())
    {
      w.w("MicroMsg.NetSceneCodeCoverageReport", "codecoverage checkUpload dir never create ?");
      GMTrace.o(13107837534208L, 97661);
      return false;
    }
    String str = as.gnb.B("login_user_name", "never_login_crash");
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("#username=" + str);
    localStringBuffer.append("\n");
    localStringBuffer.append("#rev=" + com.tencent.mm.sdk.platformtools.e.REV);
    localStringBuffer.append("\n");
    localStringBuffer.append("#path=" + com.tencent.mm.sdk.platformtools.e.SVNPATH);
    localStringBuffer.append("\n");
    if (paramString.length() > 0)
    {
      localStringBuffer.append("#startrev=" + paramString);
      localStringBuffer.append("\n");
    }
    com.tencent.mm.a.e.d(localFile.getAbsolutePath(), localStringBuffer.toString().getBytes());
    paramString = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
    paramString = p.a(localFile, false, "/sdcard/cov/cov_" + paramString + ".zip");
    if (paramString == null)
    {
      w.e("MicroMsg.NetSceneCodeCoverageReport", "zip file failed");
      GMTrace.o(13107837534208L, 97661);
      return false;
    }
    localFile.delete();
    w.i("MicroMsg.NetSceneCodeCoverageReport", "code coverage try upload :" + str);
    q.a(paramString, str, false, false, 10, 20004);
    GMTrace.o(13107837534208L, 97661);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */