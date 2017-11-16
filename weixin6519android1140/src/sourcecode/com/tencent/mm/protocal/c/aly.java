package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aly
  extends com.tencent.mm.bm.a
{
  public int jhA;
  public String jhi;
  public String jio;
  public String oqQ;
  public String ubV;
  public String ubW;
  public String uoe;
  
  public aly()
  {
    GMTrace.i(3999285641216L, 29797);
    GMTrace.o(3999285641216L, 29797);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3999419858944L, 29798);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.oqQ != null) {
        paramVarArgs.e(1, this.oqQ);
      }
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      paramVarArgs.fk(3, this.jhA);
      if (this.ubV != null) {
        paramVarArgs.e(4, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(5, this.ubW);
      }
      if (this.jio != null) {
        paramVarArgs.e(6, this.jio);
      }
      if (this.uoe != null) {
        paramVarArgs.e(7, this.uoe);
      }
      GMTrace.o(3999419858944L, 29798);
      return 0;
    }
    if (paramInt == 1) {
      if (this.oqQ == null) {
        break label614;
      }
    }
    label614:
    for (paramInt = b.a.a.b.b.a.f(1, this.oqQ) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jhi);
      }
      i += b.a.a.a.fh(3, this.jhA);
      paramInt = i;
      if (this.ubV != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ubV);
      }
      i = paramInt;
      if (this.ubW != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ubW);
      }
      paramInt = i;
      if (this.jio != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.jio);
      }
      i = paramInt;
      if (this.uoe != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uoe);
      }
      GMTrace.o(3999419858944L, 29798);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3999419858944L, 29798);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aly localaly = (aly)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3999419858944L, 29798);
          return -1;
        case 1: 
          localaly.oqQ = locala.yqV.readString();
          GMTrace.o(3999419858944L, 29798);
          return 0;
        case 2: 
          localaly.jhi = locala.yqV.readString();
          GMTrace.o(3999419858944L, 29798);
          return 0;
        case 3: 
          localaly.jhA = locala.yqV.nj();
          GMTrace.o(3999419858944L, 29798);
          return 0;
        case 4: 
          localaly.ubV = locala.yqV.readString();
          GMTrace.o(3999419858944L, 29798);
          return 0;
        case 5: 
          localaly.ubW = locala.yqV.readString();
          GMTrace.o(3999419858944L, 29798);
          return 0;
        case 6: 
          localaly.jio = locala.yqV.readString();
          GMTrace.o(3999419858944L, 29798);
          return 0;
        }
        localaly.uoe = locala.yqV.readString();
        GMTrace.o(3999419858944L, 29798);
        return 0;
      }
      GMTrace.o(3999419858944L, 29798);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */