package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bms
  extends com.tencent.mm.bm.a
{
  public String gCC;
  public String jhi;
  public String jio;
  public String tRP;
  public String uWW;
  public String ueH;
  
  public bms()
  {
    GMTrace.i(3944122155008L, 29386);
    GMTrace.o(3944122155008L, 29386);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3944256372736L, 29387);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.uWW == null) {
        throw new b("Not all required fields were included: MatchWord");
      }
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      if (this.uWW != null) {
        paramVarArgs.e(2, this.uWW);
      }
      if (this.jio != null) {
        paramVarArgs.e(3, this.jio);
      }
      if (this.ueH != null) {
        paramVarArgs.e(4, this.ueH);
      }
      if (this.gCC != null) {
        paramVarArgs.e(5, this.gCC);
      }
      if (this.tRP != null) {
        paramVarArgs.e(6, this.tRP);
      }
      GMTrace.o(3944256372736L, 29387);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label634;
      }
    }
    label634:
    for (int i = b.a.a.b.b.a.f(1, this.jhi) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uWW != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uWW);
      }
      i = paramInt;
      if (this.jio != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jio);
      }
      paramInt = i;
      if (this.ueH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ueH);
      }
      i = paramInt;
      if (this.gCC != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.gCC);
      }
      paramInt = i;
      if (this.tRP != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tRP);
      }
      GMTrace.o(3944256372736L, 29387);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.jhi == null) {
          throw new b("Not all required fields were included: UserName");
        }
        if (this.uWW == null) {
          throw new b("Not all required fields were included: MatchWord");
        }
        GMTrace.o(3944256372736L, 29387);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bms localbms = (bms)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3944256372736L, 29387);
          return -1;
        case 1: 
          localbms.jhi = locala.yqV.readString();
          GMTrace.o(3944256372736L, 29387);
          return 0;
        case 2: 
          localbms.uWW = locala.yqV.readString();
          GMTrace.o(3944256372736L, 29387);
          return 0;
        case 3: 
          localbms.jio = locala.yqV.readString();
          GMTrace.o(3944256372736L, 29387);
          return 0;
        case 4: 
          localbms.ueH = locala.yqV.readString();
          GMTrace.o(3944256372736L, 29387);
          return 0;
        case 5: 
          localbms.gCC = locala.yqV.readString();
          GMTrace.o(3944256372736L, 29387);
          return 0;
        }
        localbms.tRP = locala.yqV.readString();
        GMTrace.o(3944256372736L, 29387);
        return 0;
      }
      GMTrace.o(3944256372736L, 29387);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */