package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class agh
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPj;
  public String lRV;
  public String uvX;
  public String uvY;
  
  public agh()
  {
    GMTrace.i(3842787770368L, 28631);
    GMTrace.o(3842787770368L, 28631);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3842921988096L, 28632);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uvX != null) {
        paramVarArgs.e(1, this.uvX);
      }
      if (this.lRV != null) {
        paramVarArgs.e(2, this.lRV);
      }
      if (this.eBt != null) {
        paramVarArgs.e(3, this.eBt);
      }
      if (this.lPj != null) {
        paramVarArgs.e(4, this.lPj);
      }
      if (this.uvY != null) {
        paramVarArgs.e(5, this.uvY);
      }
      GMTrace.o(3842921988096L, 28632);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uvX == null) {
        break label498;
      }
    }
    label498:
    for (int i = b.a.a.b.b.a.f(1, this.uvX) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lRV != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lRV);
      }
      i = paramInt;
      if (this.eBt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eBt);
      }
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPj);
      }
      i = paramInt;
      if (this.uvY != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uvY);
      }
      GMTrace.o(3842921988096L, 28632);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3842921988096L, 28632);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        agh localagh = (agh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3842921988096L, 28632);
          return -1;
        case 1: 
          localagh.uvX = locala.yqV.readString();
          GMTrace.o(3842921988096L, 28632);
          return 0;
        case 2: 
          localagh.lRV = locala.yqV.readString();
          GMTrace.o(3842921988096L, 28632);
          return 0;
        case 3: 
          localagh.eBt = locala.yqV.readString();
          GMTrace.o(3842921988096L, 28632);
          return 0;
        case 4: 
          localagh.lPj = locala.yqV.readString();
          GMTrace.o(3842921988096L, 28632);
          return 0;
        }
        localagh.uvY = locala.yqV.readString();
        GMTrace.o(3842921988096L, 28632);
        return 0;
      }
      GMTrace.o(3842921988096L, 28632);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\agh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */