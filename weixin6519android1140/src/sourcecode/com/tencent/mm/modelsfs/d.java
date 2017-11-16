package com.tencent.mm.modelsfs;

import com.tencent.gmtrace.GMTrace;

public final class d
  extends SFSInputStream
{
  private a gTc;
  
  public d(long paramLong1, long paramLong2)
  {
    super(paramLong1);
    GMTrace.i(13840532111360L, 103120);
    this.gTc = new a(paramLong2);
    GMTrace.o(13840532111360L, 103120);
  }
  
  public final void close()
  {
    GMTrace.i(13841337417728L, 103126);
    super.close();
    if (this.gTc != null) {
      this.gTc.free();
    }
    GMTrace.o(13841337417728L, 103126);
  }
  
  public final void mark(int paramInt)
  {
    GMTrace.i(13840666329088L, 103121);
    super.mark(paramInt);
    this.gTc.KV();
    GMTrace.o(13840666329088L, 103121);
  }
  
  public final int read()
  {
    GMTrace.i(13840934764544L, 103123);
    int i = super.read();
    GMTrace.o(13840934764544L, 103123);
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(13841068982272L, 103124);
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 < 0)
    {
      GMTrace.o(13841068982272L, 103124);
      return paramInt1;
    }
    this.gTc.j(paramArrayOfByte, paramInt2);
    GMTrace.o(13841068982272L, 103124);
    return paramInt1;
  }
  
  public final void reset()
  {
    GMTrace.i(13840800546816L, 103122);
    super.reset();
    this.gTc.reset();
    GMTrace.o(13840800546816L, 103122);
  }
  
  public final long skip(long paramLong)
  {
    GMTrace.i(13841203200000L, 103125);
    long l = super.skip(paramLong);
    this.gTc.seek(paramLong);
    GMTrace.o(13841203200000L, 103125);
    return l;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsfs\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */