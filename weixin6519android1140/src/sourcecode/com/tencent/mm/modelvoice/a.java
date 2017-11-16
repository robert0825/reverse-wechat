package com.tencent.mm.modelvoice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.RandomAccessFile;
import junit.framework.Assert;

public final class a
  implements b
{
  private String euR;
  private RandomAccessFile hdi;
  
  public a(String paramString)
  {
    GMTrace.i(541165879296L, 4032);
    this.hdi = null;
    this.euR = "";
    this.euR = paramString;
    GMTrace.o(541165879296L, 4032);
  }
  
  private boolean mD(String paramString)
  {
    GMTrace.i(541434314752L, 4034);
    if (this.euR.length() >= 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (this.hdi != null) {
        break label127;
      }
      bool = true;
      label34:
      Assert.assertTrue(bool);
      if ((!paramString.equals("r")) && (!paramString.equals("rw"))) {
        break label132;
      }
    }
    label127:
    label132:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      w.d("MicroMsg.AmrFileOperator", "Open file:" + this.hdi + " mode:" + paramString);
      try
      {
        this.hdi = new RandomAccessFile(this.euR, paramString);
        GMTrace.o(541434314752L, 4034);
        return true;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.AmrFileOperator", "ERR: OpenFile[" + this.euR + "] failed:[" + paramString.getMessage() + "]");
        this.hdi = null;
        GMTrace.o(541434314752L, 4034);
      }
      bool = false;
      break;
      bool = false;
      break label34;
    }
    return false;
  }
  
  public final void NG()
  {
    GMTrace.i(541300097024L, 4033);
    if (this.hdi != null) {
      try
      {
        this.hdi.close();
        this.hdi = null;
        w.d("MicroMsg.AmrFileOperator", "Close :" + this.euR);
        GMTrace.o(541300097024L, 4033);
        return;
      }
      catch (IOException localIOException) {}
    }
    GMTrace.o(541300097024L, 4033);
  }
  
  public final g bd(int paramInt1, int paramInt2)
  {
    GMTrace.i(541568532480L, 4035);
    g localg = new g();
    if ((paramInt1 < 0) || (paramInt2 <= 0))
    {
      localg.ret = -3;
      GMTrace.o(541568532480L, 4035);
      return localg;
    }
    if ((this.hdi == null) && (!mD("r")))
    {
      localg.ret = -2;
      GMTrace.o(541568532480L, 4035);
      return localg;
    }
    int i = paramInt1 + 6;
    localg.buf = new byte[paramInt2];
    try
    {
      long l = this.hdi.length();
      this.hdi.seek(i);
      paramInt2 = this.hdi.read(localg.buf, 0, paramInt2);
      w.d("MicroMsg.AmrFileOperator", "DBG: ReadFile[" + this.euR + "] readOffset:" + i + " readRet:" + paramInt2 + " fileNow:" + this.hdi.getFilePointer() + " fileSize:" + l);
      paramInt1 = paramInt2;
      if (paramInt2 < 0) {
        paramInt1 = 0;
      }
      localg.eyw = paramInt1;
      localg.hcV = (paramInt1 + i - 6);
      localg.ret = 0;
      GMTrace.o(541568532480L, 4035);
      return localg;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AmrFileOperator", "ERR: ReadFile[" + this.euR + "] Offset:" + i + "  failed:[" + localException.getMessage() + "] ");
      NG();
      localg.ret = -1;
      GMTrace.o(541568532480L, 4035);
    }
    return localg;
  }
  
  public final int getFormat()
  {
    GMTrace.i(541836967936L, 4037);
    GMTrace.o(541836967936L, 4037);
    return 0;
  }
  
  public final int write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool2 = true;
    GMTrace.i(541702750208L, 4036);
    if ((paramArrayOfByte.length > 0) && (paramInt1 > 0)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      if ((this.hdi != null) || (mD("rw"))) {
        break;
      }
      GMTrace.o(541702750208L, 4036);
      return -1;
    }
    if (paramInt2 == 0) {}
    for (;;)
    {
      try
      {
        this.hdi.write("#!AMR\n".getBytes(), 0, 6);
        int i = paramInt2 + 6;
        long l;
        bool1 = false;
      }
      catch (Exception paramArrayOfByte)
      {
        try
        {
          this.hdi.seek(i);
          this.hdi.write(paramArrayOfByte, 0, paramInt1);
          l = this.hdi.getFilePointer();
          paramInt2 = (int)l;
          paramInt1 = i + paramInt1;
          if (paramInt2 != paramInt1) {
            break label293;
          }
          bool1 = true;
          Assert.assertTrue(bool1);
          paramInt1 -= 6;
          if (paramInt1 < 0) {
            break label299;
          }
          bool1 = bool2;
          Assert.assertTrue(bool1);
          GMTrace.o(541702750208L, 4036);
          return paramInt1;
        }
        catch (Exception paramArrayOfByte)
        {
          w.e("MicroMsg.AmrFileOperator", "ERR: WriteFile[" + this.euR + "] Offset:" + i + " failed:[" + paramArrayOfByte.getMessage() + "]");
          NG();
          GMTrace.o(541702750208L, 4036);
          return -3;
        }
        paramArrayOfByte = paramArrayOfByte;
        w.e("MicroMsg.AmrFileOperator", "ERR: WriteHeadToFile[" + this.euR + "] failed:[" + paramArrayOfByte.getMessage() + "]");
        NG();
        GMTrace.o(541702750208L, 4036);
        return -2;
      }
      label293:
      continue;
      label299:
      bool1 = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */