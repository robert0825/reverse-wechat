package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bry
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public String jio;
  public int lSW;
  public String nIp;
  public com.tencent.mm.bm.b vbn;
  
  public bry()
  {
    GMTrace.i(3729776443392L, 27789);
    GMTrace.o(3729776443392L, 27789);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3729910661120L, 27790);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi == null) {
        throw new b.a.a.b("Not all required fields were included: UserName");
      }
      if (this.jio == null) {
        throw new b.a.a.b("Not all required fields were included: NickName");
      }
      if (this.nIp == null) {
        throw new b.a.a.b("Not all required fields were included: Content");
      }
      paramVarArgs.fk(1, this.lSW);
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      if (this.jio != null) {
        paramVarArgs.e(3, this.jio);
      }
      if (this.nIp != null) {
        paramVarArgs.e(4, this.nIp);
      }
      if (this.vbn != null) {
        paramVarArgs.b(5, this.vbn);
      }
      GMTrace.o(3729910661120L, 27790);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.lSW) + 0;
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhi);
      }
      i = paramInt;
      if (this.jio != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jio);
      }
      paramInt = i;
      if (this.nIp != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.nIp);
      }
      i = paramInt;
      if (this.vbn != null) {
        i = paramInt + b.a.a.a.a(5, this.vbn);
      }
      GMTrace.o(3729910661120L, 27790);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.jhi == null) {
        throw new b.a.a.b("Not all required fields were included: UserName");
      }
      if (this.jio == null) {
        throw new b.a.a.b("Not all required fields were included: NickName");
      }
      if (this.nIp == null) {
        throw new b.a.a.b("Not all required fields were included: Content");
      }
      GMTrace.o(3729910661120L, 27790);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bry localbry = (bry)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3729910661120L, 27790);
        return -1;
      case 1: 
        localbry.lSW = locala.yqV.nj();
        GMTrace.o(3729910661120L, 27790);
        return 0;
      case 2: 
        localbry.jhi = locala.yqV.readString();
        GMTrace.o(3729910661120L, 27790);
        return 0;
      case 3: 
        localbry.jio = locala.yqV.readString();
        GMTrace.o(3729910661120L, 27790);
        return 0;
      case 4: 
        localbry.nIp = locala.yqV.readString();
        GMTrace.o(3729910661120L, 27790);
        return 0;
      }
      localbry.vbn = locala.csV();
      GMTrace.o(3729910661120L, 27790);
      return 0;
    }
    GMTrace.o(3729910661120L, 27790);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */