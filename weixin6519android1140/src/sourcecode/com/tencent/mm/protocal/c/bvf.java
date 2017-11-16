package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bvf
  extends com.tencent.mm.bm.a
{
  public String uVo;
  public int vdu;
  public int vdv;
  public String vdw;
  public String vdx;
  public int vdy;
  
  public bvf()
  {
    GMTrace.i(14450149031936L, 107662);
    GMTrace.o(14450149031936L, 107662);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14450283249664L, 107663);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.vdu);
      paramVarArgs.fk(2, this.vdv);
      if (this.uVo != null) {
        paramVarArgs.e(3, this.uVo);
      }
      if (this.vdw != null) {
        paramVarArgs.e(4, this.vdw);
      }
      if (this.vdx != null) {
        paramVarArgs.e(5, this.vdx);
      }
      paramVarArgs.fk(6, this.vdy);
      GMTrace.o(14450283249664L, 107663);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.vdu) + 0 + b.a.a.a.fh(2, this.vdv);
      paramInt = i;
      if (this.uVo != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uVo);
      }
      i = paramInt;
      if (this.vdw != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.vdw);
      }
      paramInt = i;
      if (this.vdx != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.vdx);
      }
      i = b.a.a.a.fh(6, this.vdy);
      GMTrace.o(14450283249664L, 107663);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14450283249664L, 107663);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bvf localbvf = (bvf)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14450283249664L, 107663);
        return -1;
      case 1: 
        localbvf.vdu = locala.yqV.nj();
        GMTrace.o(14450283249664L, 107663);
        return 0;
      case 2: 
        localbvf.vdv = locala.yqV.nj();
        GMTrace.o(14450283249664L, 107663);
        return 0;
      case 3: 
        localbvf.uVo = locala.yqV.readString();
        GMTrace.o(14450283249664L, 107663);
        return 0;
      case 4: 
        localbvf.vdw = locala.yqV.readString();
        GMTrace.o(14450283249664L, 107663);
        return 0;
      case 5: 
        localbvf.vdx = locala.yqV.readString();
        GMTrace.o(14450283249664L, 107663);
        return 0;
      }
      localbvf.vdy = locala.yqV.nj();
      GMTrace.o(14450283249664L, 107663);
      return 0;
    }
    GMTrace.o(14450283249664L, 107663);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bvf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */