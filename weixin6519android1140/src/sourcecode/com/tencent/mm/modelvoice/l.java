package com.tencent.mm.modelvoice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.RandomAccessFile;
import junit.framework.Assert;

public final class l
  implements b
{
  private String euR;
  private RandomAccessFile hdi;
  
  public l(String paramString)
  {
    GMTrace.i(559553708032L, 4169);
    this.hdi = null;
    this.euR = "";
    this.euR = paramString;
    GMTrace.o(559553708032L, 4169);
  }
  
  private boolean mD(String paramString)
  {
    GMTrace.i(559822143488L, 4171);
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
      w.d("MicroMsg.SpxFileOperator", "Open file:" + this.hdi + " mode:" + paramString);
      try
      {
        this.hdi = new RandomAccessFile(this.euR, paramString);
        GMTrace.o(559822143488L, 4171);
        return true;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.SpxFileOperator", "ERR: OpenFile[" + this.euR + "] failed:[" + paramString.getMessage() + "]");
        this.hdi = null;
        GMTrace.o(559822143488L, 4171);
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
    GMTrace.i(559687925760L, 4170);
    if (this.hdi != null) {
      try
      {
        this.hdi.close();
        this.hdi = null;
        w.d("MicroMsg.SpxFileOperator", "Close :" + this.euR);
        GMTrace.o(559687925760L, 4170);
        return;
      }
      catch (IOException localIOException) {}
    }
    GMTrace.o(559687925760L, 4170);
  }
  
  public final g bd(int paramInt1, int paramInt2)
  {
    GMTrace.i(559956361216L, 4172);
    g localg = new g();
    if ((paramInt1 < 0) || (paramInt2 <= 0))
    {
      localg.ret = -3;
      GMTrace.o(559956361216L, 4172);
      return localg;
    }
    if ((this.hdi == null) && (!mD("r")))
    {
      localg.ret = -2;
      GMTrace.o(559956361216L, 4172);
      return localg;
    }
    localg.buf = new byte[paramInt2];
    try
    {
      long l = this.hdi.length();
      this.hdi.seek(paramInt1);
      int i = this.hdi.read(localg.buf, 0, paramInt2);
      w.d("MicroMsg.SpxFileOperator", "DBG: ReadFile[" + this.euR + "] readOffset:" + paramInt1 + " readRet:" + i + " fileNow:" + this.hdi.getFilePointer() + " fileSize:" + l);
      paramInt2 = i;
      if (i < 0) {
        paramInt2 = 0;
      }
      localg.eyw = paramInt2;
      localg.hcV = (paramInt2 + paramInt1);
      localg.ret = 0;
      GMTrace.o(559956361216L, 4172);
      return localg;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.SpxFileOperator", "ERR: ReadFile[" + this.euR + "] Offset:" + paramInt1 + "  failed:[" + localException.getMessage() + "] ");
      NG();
      localg.ret = -1;
      GMTrace.o(559956361216L, 4172);
    }
    return localg;
  }
  
  public final int getFormat()
  {
    GMTrace.i(560224796672L, 4174);
    GMTrace.o(560224796672L, 4174);
    return 1;
  }
  
  public final int write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool2 = true;
    GMTrace.i(560090578944L, 4173);
    if ((paramArrayOfByte.length > 0) && (paramInt1 > 0)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      if ((this.hdi != null) || (mD("rw"))) {
        break;
      }
      GMTrace.o(560090578944L, 4173);
      return -1;
    }
    for (;;)
    {
      try
      {
        this.hdi.seek(paramInt2);
        this.hdi.write(paramArrayOfByte, 0, paramInt1);
        long l = this.hdi.getFilePointer();
        int i = (int)l;
        paramInt1 = paramInt2 + paramInt1;
        if (i == paramInt1)
        {
          bool1 = true;
          Assert.assertTrue(bool1);
          if (paramInt1 < 0) {
            break label210;
          }
          bool1 = bool2;
          Assert.assertTrue(bool1);
          GMTrace.o(560090578944L, 4173);
          return paramInt1;
        }
      }
      catch (Exception paramArrayOfByte)
      {
        w.e("MicroMsg.SpxFileOperator", "ERR: WriteFile[" + this.euR + "] Offset:" + paramInt2 + " failed:[" + paramArrayOfByte.getMessage() + "]");
        NG();
        GMTrace.o(560090578944L, 4173);
        return -3;
      }
      bool1 = false;
      continue;
      label210:
      bool1 = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */