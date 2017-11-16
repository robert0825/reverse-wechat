package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class er
  extends com.tencent.mm.bm.a
{
  public int kAW;
  public int tOG;
  public b tTA;
  public b tTB;
  public int tTC;
  public b tTD;
  
  public er()
  {
    GMTrace.i(13584578904064L, 101213);
    GMTrace.o(13584578904064L, 101213);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13584713121792L, 101214);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tTA != null) {
        paramVarArgs.b(1, this.tTA);
      }
      paramVarArgs.fk(2, this.kAW);
      if (this.tTB != null) {
        paramVarArgs.b(3, this.tTB);
      }
      paramVarArgs.fk(4, this.tTC);
      if (this.tTD != null) {
        paramVarArgs.b(5, this.tTD);
      }
      paramVarArgs.fk(6, this.tOG);
      GMTrace.o(13584713121792L, 101214);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tTA == null) {
        break label497;
      }
    }
    label497:
    for (paramInt = b.a.a.a.a(1, this.tTA) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.kAW);
      paramInt = i;
      if (this.tTB != null) {
        paramInt = i + b.a.a.a.a(3, this.tTB);
      }
      i = paramInt + b.a.a.a.fh(4, this.tTC);
      paramInt = i;
      if (this.tTD != null) {
        paramInt = i + b.a.a.a.a(5, this.tTD);
      }
      i = b.a.a.a.fh(6, this.tOG);
      GMTrace.o(13584713121792L, 101214);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13584713121792L, 101214);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        er localer = (er)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(13584713121792L, 101214);
          return -1;
        case 1: 
          localer.tTA = locala.csV();
          GMTrace.o(13584713121792L, 101214);
          return 0;
        case 2: 
          localer.kAW = locala.yqV.nj();
          GMTrace.o(13584713121792L, 101214);
          return 0;
        case 3: 
          localer.tTB = locala.csV();
          GMTrace.o(13584713121792L, 101214);
          return 0;
        case 4: 
          localer.tTC = locala.yqV.nj();
          GMTrace.o(13584713121792L, 101214);
          return 0;
        case 5: 
          localer.tTD = locala.csV();
          GMTrace.o(13584713121792L, 101214);
          return 0;
        }
        localer.tOG = locala.yqV.nj();
        GMTrace.o(13584713121792L, 101214);
        return 0;
      }
      GMTrace.o(13584713121792L, 101214);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */