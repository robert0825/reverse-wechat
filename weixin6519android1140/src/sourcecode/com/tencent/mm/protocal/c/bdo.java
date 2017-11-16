package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bdo
  extends com.tencent.mm.bm.a
{
  public String eTJ;
  public String eTK;
  public String jxF;
  public String tNH;
  public String tNI;
  public int tNJ;
  public String uPE;
  
  public bdo()
  {
    GMTrace.i(4031632113664L, 30038);
    GMTrace.o(4031632113664L, 30038);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4031766331392L, 30039);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eTJ != null) {
        paramVarArgs.e(1, this.eTJ);
      }
      if (this.jxF != null) {
        paramVarArgs.e(2, this.jxF);
      }
      if (this.eTK != null) {
        paramVarArgs.e(3, this.eTK);
      }
      if (this.tNH != null) {
        paramVarArgs.e(4, this.tNH);
      }
      if (this.tNI != null) {
        paramVarArgs.e(5, this.tNI);
      }
      paramVarArgs.fk(6, this.tNJ);
      if (this.uPE != null) {
        paramVarArgs.e(7, this.uPE);
      }
      GMTrace.o(4031766331392L, 30039);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eTJ == null) {
        break label614;
      }
    }
    label614:
    for (int i = b.a.a.b.b.a.f(1, this.eTJ) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jxF != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jxF);
      }
      i = paramInt;
      if (this.eTK != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eTK);
      }
      paramInt = i;
      if (this.tNH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tNH);
      }
      i = paramInt;
      if (this.tNI != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tNI);
      }
      i += b.a.a.a.fh(6, this.tNJ);
      paramInt = i;
      if (this.uPE != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uPE);
      }
      GMTrace.o(4031766331392L, 30039);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4031766331392L, 30039);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bdo localbdo = (bdo)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4031766331392L, 30039);
          return -1;
        case 1: 
          localbdo.eTJ = locala.yqV.readString();
          GMTrace.o(4031766331392L, 30039);
          return 0;
        case 2: 
          localbdo.jxF = locala.yqV.readString();
          GMTrace.o(4031766331392L, 30039);
          return 0;
        case 3: 
          localbdo.eTK = locala.yqV.readString();
          GMTrace.o(4031766331392L, 30039);
          return 0;
        case 4: 
          localbdo.tNH = locala.yqV.readString();
          GMTrace.o(4031766331392L, 30039);
          return 0;
        case 5: 
          localbdo.tNI = locala.yqV.readString();
          GMTrace.o(4031766331392L, 30039);
          return 0;
        case 6: 
          localbdo.tNJ = locala.yqV.nj();
          GMTrace.o(4031766331392L, 30039);
          return 0;
        }
        localbdo.uPE = locala.yqV.readString();
        GMTrace.o(4031766331392L, 30039);
        return 0;
      }
      GMTrace.o(4031766331392L, 30039);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bdo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */