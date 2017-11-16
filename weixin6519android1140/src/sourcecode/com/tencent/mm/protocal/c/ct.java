package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ct
  extends com.tencent.mm.bm.a
{
  public String tQH;
  public String tQI;
  public String tQJ;
  
  public ct()
  {
    GMTrace.i(4026531840000L, 30000);
    GMTrace.o(4026531840000L, 30000);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4026666057728L, 30001);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tQH != null) {
        paramVarArgs.e(1, this.tQH);
      }
      if (this.tQI != null) {
        paramVarArgs.e(2, this.tQI);
      }
      if (this.tQJ != null) {
        paramVarArgs.e(3, this.tQJ);
      }
      GMTrace.o(4026666057728L, 30001);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tQH == null) {
        break label370;
      }
    }
    label370:
    for (int i = b.a.a.b.b.a.f(1, this.tQH) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tQI != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tQI);
      }
      i = paramInt;
      if (this.tQJ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tQJ);
      }
      GMTrace.o(4026666057728L, 30001);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4026666057728L, 30001);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ct localct = (ct)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4026666057728L, 30001);
          return -1;
        case 1: 
          localct.tQH = locala.yqV.readString();
          GMTrace.o(4026666057728L, 30001);
          return 0;
        case 2: 
          localct.tQI = locala.yqV.readString();
          GMTrace.o(4026666057728L, 30001);
          return 0;
        }
        localct.tQJ = locala.yqV.readString();
        GMTrace.o(4026666057728L, 30001);
        return 0;
      }
      GMTrace.o(4026666057728L, 30001);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */