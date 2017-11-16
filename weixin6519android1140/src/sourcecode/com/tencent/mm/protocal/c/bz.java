package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bz
  extends com.tencent.mm.bm.a
{
  public String gCG;
  public String gCy;
  public String gCz;
  public String jhi;
  public String lQf;
  public String tQl;
  public String tQm;
  
  public bz()
  {
    GMTrace.i(3739171684352L, 27859);
    GMTrace.o(3739171684352L, 27859);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3739305902080L, 27860);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.gCG != null) {
        paramVarArgs.e(1, this.gCG);
      }
      if (this.gCy != null) {
        paramVarArgs.e(2, this.gCy);
      }
      if (this.gCz != null) {
        paramVarArgs.e(3, this.gCz);
      }
      if (this.lQf != null) {
        paramVarArgs.e(4, this.lQf);
      }
      if (this.jhi != null) {
        paramVarArgs.e(5, this.jhi);
      }
      if (this.tQl != null) {
        paramVarArgs.e(6, this.tQl);
      }
      if (this.tQm != null) {
        paramVarArgs.e(7, this.tQm);
      }
      GMTrace.o(3739305902080L, 27860);
      return 0;
    }
    if (paramInt == 1) {
      if (this.gCG == null) {
        break label630;
      }
    }
    label630:
    for (int i = b.a.a.b.b.a.f(1, this.gCG) + 0;; i = 0)
    {
      paramInt = i;
      if (this.gCy != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.gCy);
      }
      i = paramInt;
      if (this.gCz != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.gCz);
      }
      paramInt = i;
      if (this.lQf != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lQf);
      }
      i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jhi);
      }
      paramInt = i;
      if (this.tQl != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tQl);
      }
      i = paramInt;
      if (this.tQm != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tQm);
      }
      GMTrace.o(3739305902080L, 27860);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3739305902080L, 27860);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bz localbz = (bz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3739305902080L, 27860);
          return -1;
        case 1: 
          localbz.gCG = locala.yqV.readString();
          GMTrace.o(3739305902080L, 27860);
          return 0;
        case 2: 
          localbz.gCy = locala.yqV.readString();
          GMTrace.o(3739305902080L, 27860);
          return 0;
        case 3: 
          localbz.gCz = locala.yqV.readString();
          GMTrace.o(3739305902080L, 27860);
          return 0;
        case 4: 
          localbz.lQf = locala.yqV.readString();
          GMTrace.o(3739305902080L, 27860);
          return 0;
        case 5: 
          localbz.jhi = locala.yqV.readString();
          GMTrace.o(3739305902080L, 27860);
          return 0;
        case 6: 
          localbz.tQl = locala.yqV.readString();
          GMTrace.o(3739305902080L, 27860);
          return 0;
        }
        localbz.tQm = locala.yqV.readString();
        GMTrace.o(3739305902080L, 27860);
        return 0;
      }
      GMTrace.o(3739305902080L, 27860);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */