package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bhc
  extends com.tencent.mm.bm.a
{
  public int gVA;
  public long gVB;
  public int gVC;
  public int gVD;
  public int gVE;
  public int opType;
  public String uSW;
  public String uSX;
  public String uSY;
  public String uSZ;
  
  public bhc()
  {
    GMTrace.i(3924794802176L, 29242);
    GMTrace.o(3924794802176L, 29242);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3924929019904L, 29243);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uSW == null) {
        throw new b("Not all required fields were included: StatusDesc1");
      }
      if (this.uSX == null) {
        throw new b("Not all required fields were included: StatusDesc2");
      }
      if (this.uSY == null) {
        throw new b("Not all required fields were included: DataFlowSourceInfo");
      }
      if (this.uSZ == null) {
        throw new b("Not all required fields were included: DataFlowResultInfo");
      }
      paramVarArgs.fk(1, this.opType);
      paramVarArgs.fk(2, this.gVE);
      paramVarArgs.fk(3, this.gVA);
      paramVarArgs.T(4, this.gVB);
      paramVarArgs.fk(5, this.gVC);
      paramVarArgs.fk(6, this.gVD);
      if (this.uSW != null) {
        paramVarArgs.e(7, this.uSW);
      }
      if (this.uSX != null) {
        paramVarArgs.e(8, this.uSX);
      }
      if (this.uSY != null) {
        paramVarArgs.e(9, this.uSY);
      }
      if (this.uSZ != null) {
        paramVarArgs.e(10, this.uSZ);
      }
      GMTrace.o(3924929019904L, 29243);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.opType) + 0 + b.a.a.a.fh(2, this.gVE) + b.a.a.a.fh(3, this.gVA) + b.a.a.a.S(4, this.gVB) + b.a.a.a.fh(5, this.gVC) + b.a.a.a.fh(6, this.gVD);
      paramInt = i;
      if (this.uSW != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uSW);
      }
      i = paramInt;
      if (this.uSX != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.uSX);
      }
      paramInt = i;
      if (this.uSY != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uSY);
      }
      i = paramInt;
      if (this.uSZ != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.uSZ);
      }
      GMTrace.o(3924929019904L, 29243);
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
      if (this.uSW == null) {
        throw new b("Not all required fields were included: StatusDesc1");
      }
      if (this.uSX == null) {
        throw new b("Not all required fields were included: StatusDesc2");
      }
      if (this.uSY == null) {
        throw new b("Not all required fields were included: DataFlowSourceInfo");
      }
      if (this.uSZ == null) {
        throw new b("Not all required fields were included: DataFlowResultInfo");
      }
      GMTrace.o(3924929019904L, 29243);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bhc localbhc = (bhc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3924929019904L, 29243);
        return -1;
      case 1: 
        localbhc.opType = locala.yqV.nj();
        GMTrace.o(3924929019904L, 29243);
        return 0;
      case 2: 
        localbhc.gVE = locala.yqV.nj();
        GMTrace.o(3924929019904L, 29243);
        return 0;
      case 3: 
        localbhc.gVA = locala.yqV.nj();
        GMTrace.o(3924929019904L, 29243);
        return 0;
      case 4: 
        localbhc.gVB = locala.yqV.nk();
        GMTrace.o(3924929019904L, 29243);
        return 0;
      case 5: 
        localbhc.gVC = locala.yqV.nj();
        GMTrace.o(3924929019904L, 29243);
        return 0;
      case 6: 
        localbhc.gVD = locala.yqV.nj();
        GMTrace.o(3924929019904L, 29243);
        return 0;
      case 7: 
        localbhc.uSW = locala.yqV.readString();
        GMTrace.o(3924929019904L, 29243);
        return 0;
      case 8: 
        localbhc.uSX = locala.yqV.readString();
        GMTrace.o(3924929019904L, 29243);
        return 0;
      case 9: 
        localbhc.uSY = locala.yqV.readString();
        GMTrace.o(3924929019904L, 29243);
        return 0;
      }
      localbhc.uSZ = locala.yqV.readString();
      GMTrace.o(3924929019904L, 29243);
      return 0;
    }
    GMTrace.o(3924929019904L, 29243);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bhc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */