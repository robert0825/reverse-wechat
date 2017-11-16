package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bsv
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public String tXF;
  public String ugH;
  public String vbv;
  
  public bsv()
  {
    GMTrace.i(3711791267840L, 27655);
    GMTrace.o(3711791267840L, 27655);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3711925485568L, 27656);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbv == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.ugH == null) {
        throw new b("Not all required fields were included: MD5");
      }
      if (this.tXF == null) {
        throw new b("Not all required fields were included: ProductId");
      }
      if (this.vbv != null) {
        paramVarArgs.e(1, this.vbv);
      }
      if (this.ugH != null) {
        paramVarArgs.e(2, this.ugH);
      }
      if (this.tXF != null) {
        paramVarArgs.e(3, this.tXF);
      }
      paramVarArgs.fk(4, this.tOG);
      GMTrace.o(3711925485568L, 27656);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vbv == null) {
        break label522;
      }
    }
    label522:
    for (int i = b.a.a.b.b.a.f(1, this.vbv) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ugH != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ugH);
      }
      i = paramInt;
      if (this.tXF != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tXF);
      }
      paramInt = b.a.a.a.fh(4, this.tOG);
      GMTrace.o(3711925485568L, 27656);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.vbv == null) {
          throw new b("Not all required fields were included: Talker");
        }
        if (this.ugH == null) {
          throw new b("Not all required fields were included: MD5");
        }
        if (this.tXF == null) {
          throw new b("Not all required fields were included: ProductId");
        }
        GMTrace.o(3711925485568L, 27656);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsv localbsv = (bsv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3711925485568L, 27656);
          return -1;
        case 1: 
          localbsv.vbv = locala.yqV.readString();
          GMTrace.o(3711925485568L, 27656);
          return 0;
        case 2: 
          localbsv.ugH = locala.yqV.readString();
          GMTrace.o(3711925485568L, 27656);
          return 0;
        case 3: 
          localbsv.tXF = locala.yqV.readString();
          GMTrace.o(3711925485568L, 27656);
          return 0;
        }
        localbsv.tOG = locala.yqV.nj();
        GMTrace.o(3711925485568L, 27656);
        return 0;
      }
      GMTrace.o(3711925485568L, 27656);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */