package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class ir
  extends com.tencent.mm.bm.a
{
  public String nFI;
  public String tXF;
  public String tXG;
  public String tXH;
  public int tXI;
  public String tXJ;
  
  public ir()
  {
    GMTrace.i(3859162333184L, 28753);
    GMTrace.o(3859162333184L, 28753);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3859296550912L, 28754);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tXF == null) {
        throw new b("Not all required fields were included: ProductId");
      }
      if (this.nFI == null) {
        throw new b("Not all required fields were included: ProductName");
      }
      if (this.tXG == null) {
        throw new b("Not all required fields were included: SellerName");
      }
      if (this.tXH == null) {
        throw new b("Not all required fields were included: SellerUserName");
      }
      if (this.tXF != null) {
        paramVarArgs.e(1, this.tXF);
      }
      if (this.nFI != null) {
        paramVarArgs.e(2, this.nFI);
      }
      if (this.tXG != null) {
        paramVarArgs.e(3, this.tXG);
      }
      if (this.tXH != null) {
        paramVarArgs.e(4, this.tXH);
      }
      paramVarArgs.fk(5, this.tXI);
      if (this.tXJ != null) {
        paramVarArgs.e(6, this.tXJ);
      }
      GMTrace.o(3859296550912L, 28754);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tXF == null) {
        break label686;
      }
    }
    label686:
    for (int i = b.a.a.b.b.a.f(1, this.tXF) + 0;; i = 0)
    {
      paramInt = i;
      if (this.nFI != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.nFI);
      }
      i = paramInt;
      if (this.tXG != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tXG);
      }
      paramInt = i;
      if (this.tXH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tXH);
      }
      i = paramInt + b.a.a.a.fh(5, this.tXI);
      paramInt = i;
      if (this.tXJ != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tXJ);
      }
      GMTrace.o(3859296550912L, 28754);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.tXF == null) {
          throw new b("Not all required fields were included: ProductId");
        }
        if (this.nFI == null) {
          throw new b("Not all required fields were included: ProductName");
        }
        if (this.tXG == null) {
          throw new b("Not all required fields were included: SellerName");
        }
        if (this.tXH == null) {
          throw new b("Not all required fields were included: SellerUserName");
        }
        GMTrace.o(3859296550912L, 28754);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ir localir = (ir)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3859296550912L, 28754);
          return -1;
        case 1: 
          localir.tXF = locala.yqV.readString();
          GMTrace.o(3859296550912L, 28754);
          return 0;
        case 2: 
          localir.nFI = locala.yqV.readString();
          GMTrace.o(3859296550912L, 28754);
          return 0;
        case 3: 
          localir.tXG = locala.yqV.readString();
          GMTrace.o(3859296550912L, 28754);
          return 0;
        case 4: 
          localir.tXH = locala.yqV.readString();
          GMTrace.o(3859296550912L, 28754);
          return 0;
        case 5: 
          localir.tXI = locala.yqV.nj();
          GMTrace.o(3859296550912L, 28754);
          return 0;
        }
        localir.tXJ = locala.yqV.readString();
        GMTrace.o(3859296550912L, 28754);
        return 0;
      }
      GMTrace.o(3859296550912L, 28754);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */