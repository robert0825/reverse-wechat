package com.tencent.mm.plugin.subapp.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import junit.framework.Assert;

public final class c
{
  private String euR;
  private RandomAccessFile hdi;
  
  public c(String paramString)
  {
    GMTrace.i(5842229264384L, 43528);
    this.hdi = null;
    this.euR = "";
    this.euR = paramString;
    GMTrace.o(5842229264384L, 43528);
  }
  
  private boolean mD(String paramString)
  {
    GMTrace.i(5842631917568L, 43531);
    if (this.euR.length() >= 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (this.hdi != null) {
        break label125;
      }
      bool = true;
      label33:
      Assert.assertTrue(bool);
      if ((!paramString.equals("r")) && (!paramString.equals("rw"))) {
        break label130;
      }
    }
    label125:
    label130:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      w.d("MicroMsg.SpxFileOperator", "Open file:" + this.hdi + " mode:" + paramString);
      try
      {
        this.hdi = new RandomAccessFile(this.euR, paramString);
        GMTrace.o(5842631917568L, 43531);
        return true;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.SpxFileOperator", "ERR: OpenFile[" + this.euR + "] failed:[" + paramString.getMessage() + "]");
        this.hdi = null;
        GMTrace.o(5842631917568L, 43531);
      }
      bool = false;
      break;
      bool = false;
      break label33;
    }
    return false;
  }
  
  public static int mm(String paramString)
  {
    GMTrace.i(5842363482112L, 43529);
    if (paramString.length() >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      paramString = new File(paramString);
      if (paramString.exists()) {
        break;
      }
      GMTrace.o(5842363482112L, 43529);
      return 0;
    }
    int i = (int)paramString.length();
    if (i <= 0)
    {
      GMTrace.o(5842363482112L, 43529);
      return 0;
    }
    GMTrace.o(5842363482112L, 43529);
    return i;
  }
  
  public final void NG()
  {
    GMTrace.i(5842497699840L, 43530);
    if (this.hdi != null) {
      try
      {
        this.hdi.close();
        this.hdi = null;
        w.d("MicroMsg.SpxFileOperator", "Close :" + this.euR);
        GMTrace.o(5842497699840L, 43530);
        return;
      }
      catch (IOException localIOException) {}
    }
    GMTrace.o(5842497699840L, 43530);
  }
  
  public final a vP(int paramInt)
  {
    GMTrace.i(5842766135296L, 43532);
    a locala = new a();
    if (paramInt < 0)
    {
      locala.ret = -3;
      GMTrace.o(5842766135296L, 43532);
      return locala;
    }
    if ((this.hdi == null) && (!mD("r")))
    {
      locala.ret = -2;
      GMTrace.o(5842766135296L, 43532);
      return locala;
    }
    locala.buf = new byte['ᝰ'];
    try
    {
      long l = this.hdi.length();
      this.hdi.seek(paramInt);
      int j = this.hdi.read(locala.buf, 0, 6000);
      w.d("MicroMsg.SpxFileOperator", "DBG: ReadFile[" + this.euR + "] readOffset:" + paramInt + " readRet:" + j + " fileNow:" + this.hdi.getFilePointer() + " fileSize:" + l);
      int i = j;
      if (j < 0) {
        i = 0;
      }
      locala.eyw = i;
      locala.hcV = (i + paramInt);
      locala.ret = 0;
      GMTrace.o(5842766135296L, 43532);
      return locala;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.SpxFileOperator", "ERR: ReadFile[" + this.euR + "] Offset:" + paramInt + "  failed:[" + localException.getMessage() + "] ");
      NG();
      locala.ret = -1;
      GMTrace.o(5842766135296L, 43532);
    }
    return locala;
  }
  
  public static final class a
  {
    public byte[] buf;
    public int eyw;
    public int hcV;
    public int ret;
    
    public a()
    {
      GMTrace.i(5838336950272L, 43499);
      this.buf = null;
      this.eyw = 0;
      this.hcV = 0;
      this.ret = 0;
      GMTrace.o(5838336950272L, 43499);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */