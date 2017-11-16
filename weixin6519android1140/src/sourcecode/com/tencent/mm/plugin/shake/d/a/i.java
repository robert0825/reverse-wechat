package com.tencent.mm.plugin.shake.d.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.shake.d.b.a;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.bdh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.File;
import java.io.IOException;

public final class i
{
  public static apv a(byte[] paramArrayOfByte, long paramLong)
  {
    GMTrace.i(6608344055808L, 49236);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      GMTrace.o(6608344055808L, 49236);
      return null;
    }
    try
    {
      paramArrayOfByte = (bdh)new bdh().aD(paramArrayOfByte);
      apv localapv = new apv();
      localapv.uFq = 4;
      localapv.ucY = String.valueOf(paramArrayOfByte.uPp);
      localapv.uFr = paramArrayOfByte.uFr;
      localapv.uFu = n.b(paramArrayOfByte.usV);
      localapv.uFv = n.b(paramArrayOfByte.usW);
      localapv.uFA = a.EH(localapv.uFv);
      localapv.tTL = paramArrayOfByte.tTL;
      localapv.uFz = n.b(paramArrayOfByte.usU);
      localapv.uFs = n.b(paramArrayOfByte.uPq);
      localapv.uFt = n.b(paramArrayOfByte.uPr);
      localapv.uFy = n.b(paramArrayOfByte.uPu);
      localapv.uFw = n.b(paramArrayOfByte.uPs);
      localapv.uFx = n.b(paramArrayOfByte.uPt);
      localapv.ppD = paramLong;
      GMTrace.o(6608344055808L, 49236);
      return localapv;
    }
    catch (Exception paramArrayOfByte)
    {
      w.printErrStackTrace("MicroMsg.ShakeMusicLogic", paramArrayOfByte, "", new Object[0]);
      w.w("MicroMsg.ShakeMusicLogic", "get music wrapper bytes fail");
      GMTrace.o(6608344055808L, 49236);
    }
    return null;
  }
  
  public static String bfN()
  {
    GMTrace.i(6608209838080L, 49235);
    if (!at.AU())
    {
      w.w("MicroMsg.ShakeMusicLogic", "getSaveDirPath: acc stg has not set uin");
      GMTrace.o(6608209838080L, 49235);
      return null;
    }
    Object localObject = new StringBuilder();
    at.AR();
    localObject = new File(c.zo() + "shakemusic/");
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      w.w("MicroMsg.ShakeMusicLogic", "storage dir[%s] not perpare, try to create it", new Object[] { ((File)localObject).getAbsolutePath() });
      ((File)localObject).mkdir();
    }
    File localFile = new File((File)localObject, ".nomedia");
    if (!localFile.exists()) {
      w.w("MicroMsg.ShakeMusicLogic", "no media file[%s] not exists, try to create it", new Object[] { ((File)localObject).getAbsolutePath() });
    }
    try
    {
      localFile.createNewFile();
      if (!((File)localObject).exists())
      {
        w.w("MicroMsg.ShakeMusicLogic", "create storage dir fail");
        GMTrace.o(6608209838080L, 49235);
        return null;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ShakeMusicLogic", localIOException, "", new Object[0]);
      }
      localObject = ((File)localObject).getAbsolutePath() + "/";
      GMTrace.o(6608209838080L, 49235);
    }
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */